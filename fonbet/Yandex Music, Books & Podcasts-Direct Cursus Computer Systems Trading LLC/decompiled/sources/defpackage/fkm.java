package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.yandex.music.databases.main.MainDatabase;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class fkm {
    public final i5h a;

    public fkm(i5h i5hVar) {
        this.a = i5hVar;
    }

    public static kjm f(alm almVar) {
        ArrayList arrayList;
        String str = almVar.a;
        String str2 = almVar.c;
        String str3 = almVar.b;
        str3.getClass();
        Object b = JsonParser.b(str3);
        if (!(b instanceof JsonArray)) {
            throw new IOException(new JsonParseException("Unknown preSaveArtist format ".concat(str3)));
        }
        JsonArray jsonArray = (JsonArray) b;
        JsonElement t = jsonArray.t(0);
        t.getClass();
        if (!(t instanceof JsonPrimitive)) {
            Iterable<JsonElement> iterable = (Iterable) b;
            arrayList = new ArrayList(v75.o(iterable, 10));
            for (JsonElement jsonElement : iterable) {
                if (jsonElement instanceof JsonArray) {
                    JsonArray jsonArray2 = (JsonArray) jsonElement;
                    if (jsonArray2.a.size() == 2) {
                        String q = jsonArray2.t(0).q();
                        q.getClass();
                        String q2 = jsonArray2.t(1).q();
                        q2.getClass();
                        CoverPath none = CoverPath.none();
                        none.getClass();
                        arrayList.add(new ljm(q, q2, none));
                    }
                }
                throw new IOException(new JsonParseException("Unknown preSaveArtist format ".concat(str3)));
            }
        }
        int a = jsonArray.t(1).a();
        if (a != 1) {
            throw new IOException(new JsonParseException("Unknown preSaveArtist format " + str3 + ", version " + a + " is not supported"));
        }
        List<JsonElement> L = CollectionsKt.L((Iterable) b, 2);
        arrayList = new ArrayList(v75.o(L, 10));
        for (JsonElement jsonElement2 : L) {
            if (jsonElement2 instanceof JsonArray) {
                JsonArray jsonArray3 = (JsonArray) jsonElement2;
                if (jsonArray3.a.size() == 3) {
                    String q3 = jsonArray3.t(0).q();
                    q3.getClass();
                    String q4 = jsonArray3.t(1).q();
                    q4.getClass();
                    arrayList.add(new ljm(q3, q4, men.x(jsonArray3.t(2).q(), WebPath$Storage.AVATARS)));
                }
            }
            throw new IOException(new JsonParseException("Unknown preSaveArtist format ".concat(str3)));
        }
        ArrayList arrayList2 = arrayList;
        tfs tfsVar = wc7.a;
        Date b2 = tfsVar.b(str2);
        if (b2 == null) {
            xq0.o(f1d.g("Cannot parse date ", str2));
            return null;
        }
        long j = almVar.e;
        String str4 = almVar.f;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        str4.getClass();
        webPath$Storage.getClass();
        CoverPath B = etn.B(str4, webPath$Storage);
        String str5 = almVar.g;
        String str6 = almVar.h;
        WarningContent a2 = WarningContent.a(almVar.i);
        a2.getClass();
        Date b3 = tfsVar.b(almVar.d);
        boolean z = almVar.j;
        List B2 = q7g.B(almVar.l);
        B2.getClass();
        return new kjm(arrayList2, str, b2, j, B, str5, str6, a2, b3, z, new zjm(B2, almVar.k));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        akm akmVar;
        int i;
        if (cg6Var instanceof akm) {
            akmVar = (akm) cg6Var;
            int i2 = akmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                akmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = akmVar.j;
                nm6 nm6Var = nm6.a;
                i = akmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    akmVar.l = 1;
                    obj = this.a.b(str, akmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((MainDatabase) obj).N();
            }
        }
        akmVar = new akm(this, cg6Var);
        Object obj2 = akmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = akmVar.l;
        if (i != 0) {
        }
        return ((MainDatabase) obj2).N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r6 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, cg6 cg6Var) {
        bkm bkmVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof bkm) {
            bkmVar = (bkm) cg6Var;
            int i2 = bkmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bkmVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = bkmVar.k;
                obj = nm6.a;
                i = bkmVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    bkmVar.j = str2;
                    bkmVar.m = 1;
                    obj2 = a(str, bkmVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = bkmVar.j;
                    qgg.h0(obj2);
                }
                bkmVar.j = null;
                bkmVar.m = 2;
                G = up6.G(((zkm) obj2).a, false, true, new q1h(str2, 22), bkmVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        bkmVar = new bkm(this, cg6Var);
        Object obj22 = bkmVar.k;
        obj = nm6.a;
        i = bkmVar.m;
        if (i != 0) {
        }
        bkmVar.j = null;
        bkmVar.m = 2;
        G = up6.G(((zkm) obj22).a, false, true, new q1h(str2, 22), bkmVar);
        if (G != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, cg6 cg6Var) {
        ckm ckmVar;
        int i;
        if (cg6Var instanceof ckm) {
            ckmVar = (ckm) cg6Var;
            int i2 = ckmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ckmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ckmVar.k;
                Object obj2 = nm6.a;
                i = ckmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ckmVar.j = str2;
                    ckmVar.m = 1;
                    obj = a(str, ckmVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        alm almVar = (alm) obj;
                        if (almVar != null) {
                            return f(almVar);
                        }
                        return null;
                    }
                    str2 = ckmVar.j;
                    qgg.h0(obj);
                }
                ckmVar.j = null;
                ckmVar.m = 2;
                obj = up6.G(((zkm) obj).a, true, false, new q1h(str2, 21), ckmVar);
            }
        }
        ckmVar = new ckm(this, cg6Var);
        Object obj3 = ckmVar.k;
        Object obj22 = nm6.a;
        i = ckmVar.m;
        if (i != 0) {
        }
        ckmVar.j = null;
        ckmVar.m = 2;
        obj3 = up6.G(((zkm) obj3).a, true, false, new q1h(str2, 21), ckmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r8 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, Integer num, cg6 cg6Var) {
        dkm dkmVar;
        int i;
        if (cg6Var instanceof dkm) {
            dkmVar = (dkm) cg6Var;
            int i2 = dkmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dkmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dkmVar.k;
                nm6 nm6Var = nm6.a;
                i = dkmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dkmVar.j = num;
                    dkmVar.m = 1;
                    obj = a(str, dkmVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(f((alm) it.next()));
                        }
                        return arrayList;
                    }
                    num = dkmVar.j;
                    qgg.h0(obj);
                }
                zkm zkmVar = (zkm) obj;
                int intValue = num == null ? num.intValue() : -1;
                dkmVar.j = null;
                dkmVar.m = 2;
                obj = up6.G(zkmVar.a, true, false, new cv0(intValue, 6), dkmVar);
            }
        }
        dkmVar = new dkm(this, cg6Var);
        Object obj2 = dkmVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dkmVar.m;
        if (i != 0) {
        }
        zkm zkmVar2 = (zkm) obj2;
        if (num == null) {
        }
        dkmVar.j = null;
        dkmVar.m = 2;
        obj2 = up6.G(zkmVar2.a, true, false, new cv0(intValue, 6), dkmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
    
        if (r0 != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0121, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0050, code lost:
    
        if (r4 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[LOOP:0: B:18:0x007d->B:20:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, kjm kjmVar, cg6 cg6Var) {
        ekm ekmVar;
        int i;
        kjm kjmVar2;
        Object a;
        Date date;
        String uri;
        Object G;
        List list;
        if (cg6Var instanceof ekm) {
            ekmVar = (ekm) cg6Var;
            int i2 = ekmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ekmVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ekmVar.k;
                Object obj2 = nm6.a;
                i = ekmVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    kjmVar2 = kjmVar;
                    ekmVar.j = kjmVar2;
                    ekmVar.m = 1;
                    a = a(str, ekmVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kjm kjmVar3 = ekmVar.j;
                    qgg.h0(obj);
                    a = obj;
                    kjmVar2 = kjmVar3;
                }
                zkm zkmVar = (zkm) a;
                String str2 = kjmVar2.b;
                List<ljm> list2 = kjmVar2.a;
                list2.getClass();
                JsonArray jsonArray = new JsonArray();
                jsonArray.s("VERSION_KEY");
                jsonArray.a.add(new JsonPrimitive((Number) 1));
                for (ljm ljmVar : list2) {
                    JsonArray jsonArray2 = new JsonArray();
                    jsonArray2.s(ljmVar.a);
                    jsonArray2.s(ljmVar.b);
                    jsonArray2.s(men.I(ljmVar.c));
                    jsonArray.r(jsonArray2);
                }
                String jsonElement = jsonArray.toString();
                jsonElement.getClass();
                tfs tfsVar = wc7.a;
                String a2 = wc7.a(kjmVar2.c);
                date = kjmVar2.i;
                if (date == null) {
                    date = new Date(System.currentTimeMillis());
                }
                String a3 = wc7.a(date);
                long j = kjmVar2.d;
                uri = kjmVar2.e.getUri();
                if (uri == null) {
                    uri = "";
                }
                String str3 = kjmVar2.f;
                String str4 = kjmVar2.g;
                String str5 = kjmVar2.h.a;
                str5.getClass();
                boolean z = kjmVar2.j;
                zjm zjmVar = kjmVar2.k;
                alm almVar = new alm(str2, jsonElement, a2, a3, j, uri, str3, str4, str5, z, zjmVar == null ? zjmVar.b : true, q7g.Q((zjmVar != null || (list = zjmVar.a) == null) ? c5b.a : list));
                ekmVar.j = null;
                ekmVar.m = 2;
                G = up6.G(zkmVar.a, false, true, new avi(27, zkmVar, almVar), ekmVar);
                if (G != nm6.a) {
                    G = Unit.a;
                }
            }
        }
        ekmVar = new ekm(this, cg6Var);
        Object obj3 = ekmVar.k;
        Object obj22 = nm6.a;
        i = ekmVar.m;
        if (i != 0) {
        }
        zkm zkmVar2 = (zkm) a;
        String str22 = kjmVar2.b;
        List<ljm> list22 = kjmVar2.a;
        list22.getClass();
        JsonArray jsonArray3 = new JsonArray();
        jsonArray3.s("VERSION_KEY");
        jsonArray3.a.add(new JsonPrimitive((Number) 1));
        while (r10.hasNext()) {
        }
        String jsonElement2 = jsonArray3.toString();
        jsonElement2.getClass();
        tfs tfsVar2 = wc7.a;
        String a22 = wc7.a(kjmVar2.c);
        date = kjmVar2.i;
        if (date == null) {
        }
        String a32 = wc7.a(date);
        long j2 = kjmVar2.d;
        uri = kjmVar2.e.getUri();
        if (uri == null) {
        }
        String str32 = kjmVar2.f;
        String str42 = kjmVar2.g;
        String str52 = kjmVar2.h.a;
        str52.getClass();
        boolean z2 = kjmVar2.j;
        zjm zjmVar2 = kjmVar2.k;
        alm almVar2 = new alm(str22, jsonElement2, a22, a32, j2, uri, str32, str42, str52, z2, zjmVar2 == null ? zjmVar2.b : true, q7g.Q((zjmVar2 != null || (list = zjmVar2.a) == null) ? c5b.a : list));
        ekmVar.j = null;
        ekmVar.m = 2;
        G = up6.G(zkmVar2.a, false, true, new avi(27, zkmVar2, almVar2), ekmVar);
        if (G != nm6.a) {
        }
    }
}

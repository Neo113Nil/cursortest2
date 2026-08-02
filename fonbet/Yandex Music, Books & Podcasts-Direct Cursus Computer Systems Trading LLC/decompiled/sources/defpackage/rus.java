package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rus {
    public final i5h a;
    public final f4m b;

    public rus(i5h i5hVar, f4m f4mVar) {
        this.a = i5hVar;
        this.b = f4mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (defpackage.tyf.N(r8, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Collection collection, cg6 cg6Var) {
        dus dusVar;
        int i;
        if (cg6Var instanceof dus) {
            dusVar = (dus) cg6Var;
            int i2 = dusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dusVar.k;
                nm6 nm6Var = nm6.a;
                i = dusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    dusVar.j = collection;
                    dusVar.m = 1;
                    obj = this.a.b(str, dusVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Collection collection2 = dusVar.j;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    collection = dusVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                a2m a2mVar = new a2m(mainDatabase, null, mainDatabase, CollectionsKt.w0(collection));
                dusVar.j = null;
                dusVar.m = 2;
            }
        }
        dusVar = new dus(this, cg6Var);
        Object obj2 = dusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dusVar.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        a2m a2mVar2 = new a2m(mainDatabase2, null, mainDatabase2, CollectionsKt.w0(collection));
        dusVar.j = null;
        dusVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (r2 != r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, vhn vhnVar, Boolean bool, Integer num, cg6 cg6Var) {
        eus eusVar;
        int i;
        String str3;
        String e;
        um4 um4Var;
        if (cg6Var instanceof eus) {
            eusVar = (eus) cg6Var;
            int i2 = eusVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eusVar.n = i2 - Integer.MIN_VALUE;
                Object obj = eusVar.l;
                nm6 nm6Var = nm6.a;
                i = eusVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (str2.length() == 0) {
                        return c5b.a;
                    }
                    um4 um4Var2 = new um4(pgp.a);
                    if (vhnVar != null) {
                        um4Var2.h("track_type", vhnVar);
                    }
                    if (bool != null) {
                        um4Var2.c("track_for_kids", bool.booleanValue());
                    }
                    if (num != null) {
                        str3 = "LIMIT " + num;
                    } else {
                        str3 = "";
                    }
                    StringBuilder m = f1d.m("\n            |SELECT\n            |   *\n            |FROM track_mview\n            |JOIN\n                |(SELECT\n                |playlist_track.position as column_position, playlist_track.track_id as column_track_id, playlist_track.timestamp as playlistTrackTimestamp\n                |FROM playlist_track\n                |JOIN\n                |   playlist ON playlist._id=playlist_track.playlist_id\n                |WHERE\n                |   original_id=3 AND uid=", str2, "\n                |) as playlist\n            |ON\n            |   playlist.column_track_id=track_mview.original_id\n            |WHERE\n            |   ", um4Var2.l(), "\n            |ORDER BY\n            |   playlist.playlistTrackTimestamp DESC,\n            |   playlist.column_position\n            |");
                    m.append(str3);
                    m.append("\n            ");
                    e = hlr.e(m.toString());
                    eusVar.j = um4Var2;
                    eusVar.k = e;
                    eusVar.n = 1;
                    Object b = this.a.b(str, eusVar);
                    if (b != nm6Var) {
                        obj = b;
                        um4Var = um4Var2;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ngg.M((rxs) it.next()));
                    }
                    return arrayList;
                }
                e = eusVar.k;
                um4Var = eusVar.j;
                qgg.h0(obj);
                ueo ueoVar = (ueo) obj;
                p05 p05Var = new p05(ueoVar, null, e, um4Var, 2);
                eusVar.j = null;
                eusVar.k = null;
                eusVar.n = 2;
                obj = tyf.N(ueoVar, p05Var, eusVar);
            }
        }
        eusVar = new eus(this, cg6Var);
        Object obj2 = eusVar.l;
        nm6 nm6Var2 = nm6.a;
        i = eusVar.n;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        p05 p05Var2 = new p05(ueoVar2, null, e, um4Var, 2);
        eusVar.j = null;
        eusVar.k = null;
        eusVar.n = 2;
        obj2 = tyf.N(ueoVar2, p05Var2, eusVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var, String str, ArrayList arrayList) {
        fus fusVar;
        int i;
        if (cg6Var instanceof fus) {
            fusVar = (fus) cg6Var;
            int i2 = fusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fusVar.k;
                nm6 nm6Var = nm6.a;
                i = fusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fusVar.j = arrayList;
                    fusVar.m = 1;
                    obj = this.a.b(str, fusVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = fusVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                gus gusVar = new gus(ueoVar, null, arrayList, 0);
                fusVar.j = null;
                fusVar.m = 2;
                Object N = tyf.N(ueoVar, gusVar, fusVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        fusVar = new fus(this, cg6Var);
        Object obj2 = fusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fusVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        gus gusVar2 = new gus(ueoVar2, null, arrayList, 0);
        fusVar.j = null;
        fusVar.m = 2;
        Object N2 = tyf.N(ueoVar2, gusVar2, fusVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        hus husVar;
        int i;
        if (cg6Var instanceof hus) {
            husVar = (hus) cg6Var;
            int i2 = husVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                husVar.m = i2 - Integer.MIN_VALUE;
                Object obj = husVar.k;
                nm6 nm6Var = nm6.a;
                i = husVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    husVar.j = str;
                    husVar.m = 1;
                    obj = this.a.b(str, husVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = husVar.j;
                    qgg.h0(obj);
                }
                return ((MainDatabase) obj).G(new String[]{"track", "playlist_track"}, new w90(this, str, null, 14));
            }
        }
        husVar = new hus(this, cg6Var);
        Object obj2 = husVar.k;
        nm6 nm6Var2 = nm6.a;
        i = husVar.m;
        if (i != 0) {
        }
        return ((MainDatabase) obj2).G(new String[]{"track", "playlist_track"}, new w90(this, str, null, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080 A[LOOP:0: B:12:0x007a->B:14:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var, String str, List list) {
        ius iusVar;
        Object obj;
        nm6 nm6Var;
        int i;
        List list2;
        Iterator it;
        if (cg6Var instanceof ius) {
            iusVar = (ius) cg6Var;
            int i2 = iusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iusVar.m = i2 - Integer.MIN_VALUE;
                obj = iusVar.k;
                nm6Var = nm6.a;
                i = iusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    iusVar.j = list;
                    iusVar.m = 1;
                    obj = this.a.b(str, iusVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = iusVar.j;
                        qgg.h0(obj);
                        Iterable iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ngg.M((rxs) it.next()));
                        }
                        return CollectionsKt.o0(arrayList, new eh(17, list2));
                    }
                    list = iusVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                ct ctVar = new ct(ueoVar, (Continuation) null, list, 5);
                iusVar.j = list;
                iusVar.m = 2;
                obj = tyf.N(ueoVar, ctVar, iusVar);
                if (obj != nm6Var) {
                    list2 = list;
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                    }
                    return CollectionsKt.o0(arrayList2, new eh(17, list2));
                }
                return nm6Var;
            }
        }
        iusVar = new ius(this, cg6Var);
        obj = iusVar.k;
        nm6Var = nm6.a;
        i = iusVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj;
        ct ctVar2 = new ct(ueoVar2, (Continuation) null, list, 5);
        iusVar.j = list;
        iusVar.m = 2;
        obj = tyf.N(ueoVar2, ctVar2, iusVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, String str, ArrayList arrayList) {
        jus jusVar;
        int i;
        if (cg6Var instanceof jus) {
            jusVar = (jus) cg6Var;
            int i2 = jusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jusVar.k;
                nm6 nm6Var = nm6.a;
                i = jusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jusVar.j = arrayList;
                    jusVar.m = 1;
                    obj = this.a.b(str, jusVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = jusVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                gus gusVar = new gus(ueoVar, null, arrayList, 1);
                jusVar.j = null;
                jusVar.m = 2;
                Object N = tyf.N(ueoVar, gusVar, jusVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        jusVar = new jus(this, cg6Var);
        Object obj2 = jusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jusVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        gus gusVar2 = new gus(ueoVar2, null, arrayList, 1);
        jusVar.j = null;
        jusVar.m = 2;
        Object N2 = tyf.N(ueoVar2, gusVar2, jusVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r10 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, cg6 cg6Var) {
        kus kusVar;
        int i;
        String str3;
        if (cg6Var instanceof kus) {
            kusVar = (kus) cg6Var;
            int i2 = kusVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kusVar.n = i2 - Integer.MIN_VALUE;
                Object obj = kusVar.l;
                nm6 nm6Var = nm6.a;
                i = kusVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    kusVar.j = str2;
                    kusVar.k = "ASC";
                    kusVar.n = 1;
                    Object b = this.a.b(str, kusVar);
                    if (b != nm6Var) {
                        obj = b;
                        str3 = "ASC";
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ngg.M((rxs) it.next()));
                    }
                    return arrayList;
                }
                str3 = kusVar.k;
                str2 = kusVar.j;
                qgg.h0(obj);
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                um4 um4Var = new um4(pgp.c);
                um4Var.b("album_id", str2);
                tt0.K(ysrVar, um4Var);
                ysrVar.f = f1d.g("position ", str3);
                atn a = ysrVar.a();
                kusVar.j = null;
                kusVar.k = null;
                kusVar.n = 2;
                obj = Q.b(a, kusVar);
            }
        }
        kusVar = new kus(this, cg6Var);
        Object obj2 = kusVar.l;
        nm6 nm6Var2 = nm6.a;
        i = kusVar.n;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        um4 um4Var2 = new um4(pgp.c);
        um4Var2.b("album_id", str2);
        tt0.K(ysrVar2, um4Var2);
        ysrVar2.f = f1d.g("position ", str3);
        atn a2 = ysrVar2.a();
        kusVar.j = null;
        kusVar.k = null;
        kusVar.n = 2;
        obj2 = Q2.b(a2, kusVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, String str2, cg6 cg6Var) {
        lus lusVar;
        int i;
        if (cg6Var instanceof lus) {
            lusVar = (lus) cg6Var;
            int i2 = lusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = lusVar.k;
                nm6 nm6Var = nm6.a;
                i = lusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    lusVar.j = str2;
                    lusVar.m = 1;
                    obj = this.a.b(str, lusVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ngg.M((rxs) it.next()));
                        }
                        return arrayList;
                    }
                    str2 = lusVar.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                um4 um4Var = new um4(pgp.c);
                um4Var.d(str2);
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                lusVar.j = null;
                lusVar.m = 2;
                obj = Q.b(a, lusVar);
            }
        }
        lusVar = new lus(this, cg6Var);
        Object obj2 = lusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = lusVar.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        um4 um4Var2 = new um4(pgp.c);
        um4Var2.d(str2);
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        lusVar.j = null;
        lusVar.m = 2;
        obj2 = Q2.b(a2, lusVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var, String str, ArrayList arrayList) {
        mus musVar;
        int i;
        if (cg6Var instanceof mus) {
            musVar = (mus) cg6Var;
            int i2 = musVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                musVar.m = i2 - Integer.MIN_VALUE;
                Object obj = musVar.k;
                nm6 nm6Var = nm6.a;
                i = musVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    musVar.j = arrayList;
                    musVar.m = 1;
                    obj = this.a.b(str, musVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = musVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                nus nusVar = new nus(ueoVar, null, arrayList, 0);
                musVar.j = null;
                musVar.m = 2;
                Object N = tyf.N(ueoVar, nusVar, musVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        musVar = new mus(this, cg6Var);
        Object obj2 = musVar.k;
        nm6 nm6Var2 = nm6.a;
        i = musVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        nus nusVar2 = new nus(ueoVar2, null, arrayList, 0);
        musVar.j = null;
        musVar.m = 2;
        Object N2 = tyf.N(ueoVar2, nusVar2, musVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(cg6 cg6Var, String str, ArrayList arrayList) {
        ous ousVar;
        int i;
        if (cg6Var instanceof ous) {
            ousVar = (ous) cg6Var;
            int i2 = ousVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ousVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ousVar.k;
                nm6 nm6Var = nm6.a;
                i = ousVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ousVar.j = arrayList;
                    ousVar.m = 1;
                    obj = this.a.b(str, ousVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = ousVar.j;
                    qgg.h0(obj);
                }
                ueo ueoVar = (ueo) obj;
                nus nusVar = new nus(ueoVar, null, arrayList, 1);
                ousVar.j = null;
                ousVar.m = 2;
                Object N = tyf.N(ueoVar, nusVar, ousVar);
                return N != nm6Var ? nm6Var : N;
            }
        }
        ousVar = new ous(this, cg6Var);
        Object obj2 = ousVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ousVar.m;
        if (i != 0) {
        }
        ueo ueoVar2 = (ueo) obj2;
        nus nusVar2 = new nus(ueoVar2, null, arrayList, 1);
        ousVar.j = null;
        ousVar.m = 2;
        Object N2 = tyf.N(ueoVar2, nusVar2, ousVar);
        if (N2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, cg6 cg6Var) {
        pus pusVar;
        int i;
        if (cg6Var instanceof pus) {
            pusVar = (pus) cg6Var;
            int i2 = pusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pusVar.k;
                nm6 nm6Var = nm6.a;
                i = pusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pusVar.j = str2;
                    pusVar.m = 1;
                    obj = this.a.b(str, pusVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Boolean.valueOf(((Number) obj).intValue() > 0);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = pusVar.j;
                    qgg.h0(obj);
                }
                uxs Q = ((MainDatabase) obj).Q();
                ysr ysrVar = new ysr("track_mview");
                ysrVar.c = new String[]{"COUNT(*)"};
                um4 um4Var = new um4(pgp.c);
                um4Var.b("original_id", str2);
                tt0.K(ysrVar, um4Var);
                atn a = ysrVar.a();
                pusVar.j = null;
                pusVar.m = 2;
                obj = Q.a(a, pusVar);
            }
        }
        pusVar = new pus(this, cg6Var);
        Object obj2 = pusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pusVar.m;
        if (i != 0) {
        }
        uxs Q2 = ((MainDatabase) obj2).Q();
        ysr ysrVar2 = new ysr("track_mview");
        ysrVar2.c = new String[]{"COUNT(*)"};
        um4 um4Var2 = new um4(pgp.c);
        um4Var2.b("original_id", str2);
        tt0.K(ysrVar2, um4Var2);
        atn a2 = ysrVar2.a();
        pusVar.j = null;
        pusVar.m = 2;
        obj2 = Q2.a(a2, pusVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (defpackage.tyf.N(r5, r4, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, LinkedHashMap linkedHashMap, cg6 cg6Var) {
        qus qusVar;
        int i;
        if (cg6Var instanceof qus) {
            qusVar = (qus) cg6Var;
            int i2 = qusVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qusVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qusVar.k;
                nm6 nm6Var = nm6.a;
                i = qusVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (linkedHashMap.isEmpty()) {
                        return Unit.a;
                    }
                    qusVar.j = linkedHashMap;
                    qusVar.m = 1;
                    obj = this.a.b(str, qusVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = qusVar.j;
                    qgg.h0(obj);
                }
                MainDatabase mainDatabase = (MainDatabase) obj;
                v3t T = mainDatabase.T();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    rr5 rr5Var = (rr5) entry.getKey();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        arrayList.add(rr5Var.a);
                    } else {
                        arrayList2.add(rr5Var.a);
                    }
                }
                ltl ltlVar = new ltl(mainDatabase, null, arrayList, arrayList2, T);
                qusVar.j = null;
                qusVar.m = 2;
            }
        }
        qusVar = new qus(this, cg6Var);
        Object obj2 = qusVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qusVar.m;
        if (i != 0) {
        }
        MainDatabase mainDatabase2 = (MainDatabase) obj2;
        v3t T2 = mainDatabase2.T();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        while (r11.hasNext()) {
        }
        ltl ltlVar2 = new ltl(mainDatabase2, null, arrayList3, arrayList22, T2);
        qusVar.j = null;
        qusVar.m = 2;
    }
}

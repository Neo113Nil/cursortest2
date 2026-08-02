package defpackage;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final class s72 {
    public final md0 a;
    public final zvk b;
    public final c62 c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h = btf.b(new ri1(17, this));
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final x0q m;
    public final x0q n;
    public final xdr o;

    public s72(md0 md0Var, zvk zvkVar, c62 c62Var, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7, jyr jyrVar8) {
        this.a = md0Var;
        this.b = zvkVar;
        this.c = c62Var;
        this.d = jyrVar;
        this.e = jyrVar2;
        this.f = jyrVar3;
        this.g = jyrVar4;
        this.i = jyrVar8;
        this.j = jyrVar7;
        this.k = jyrVar5;
        this.l = jyrVar6;
        x0q b = y0q.b(0, 1, oi3.b, 1);
        this.m = b;
        this.n = b;
        this.o = ydr.a(new cb2(c5b.a, null));
    }

    public final w42 a() {
        return (w42) this.k.getValue();
    }

    public final h82 b() {
        return (h82) this.l.getValue();
    }

    public final za2 c() {
        return (za2) this.j.getValue();
    }

    public final db2 d() {
        return (db2) this.d.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x011e, code lost:
    
        if (r2 == r4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00ea, code lost:
    
        if (r2 == r4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0310, code lost:
    
        if (r2 == r4) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0300, code lost:
    
        if (r2 == r4) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        h72 h72Var;
        int i;
        Object obj;
        List list;
        String str2 = str;
        if (cg6Var instanceof h72) {
            h72Var = (h72) cg6Var;
            int i2 = h72Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h72Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = h72Var.k;
                Object obj3 = nm6.a;
                i = h72Var.m;
                int i3 = 0;
                int i4 = 5;
                int i5 = 4;
                int i6 = 3;
                int i7 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    xdr xdrVar = this.o;
                    Boolean bool = ((cb2) xdrVar.getValue()).a;
                    if (bool != null && !bool.booleanValue()) {
                        n();
                    }
                    d().getClass();
                    str2.getClass();
                    if (c.v(str2, "tab_prefix_", false)) {
                        d().getClass();
                        String a = db2.a(str2);
                        za2 c = c();
                        Iterator it = ((cb2) xdrVar.getValue()).b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((r0s) obj).a.equals(a)) {
                                break;
                            }
                        }
                        r0s r0sVar = (r0s) obj;
                        List list2 = r0sVar != null ? r0sVar.e : null;
                        h72Var.j = null;
                        h72Var.m = 1;
                        c.getClass();
                        Object V = x97.V(dm6.b, new xa2(a, list2, c, true, null), h72Var);
                        if (V != obj3) {
                            return V;
                        }
                    } else {
                        h72Var.j = str2;
                        h72Var.m = 2;
                        obj2 = x97.V(dm6.b, new r72(this, str2, null), h72Var);
                    }
                    return obj3;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return obj2;
                }
                if (i == 2) {
                    str2 = h72Var.j;
                    qgg.h0(obj2);
                } else if (i == 3) {
                    str2 = h72Var.j;
                    qgg.h0(obj2);
                    List list3 = (List) obj2;
                    if (list3 != null) {
                        return list3;
                    }
                    h72Var.j = str2;
                    h72Var.m = 4;
                    o42[] o42VarArr = o42.a;
                    if (Intrinsics.d(str2, "COLLECTION_SECTIONS_ALBUMS_MEDIA_ID")) {
                        w42 a2 = a();
                        a2.getClass();
                        obj2 = x97.V(dm6.b, new p42(a2, continuation, i3), h72Var);
                        if (obj2 != obj3) {
                            obj2 = (List) obj2;
                        }
                    } else if (Intrinsics.d(str2, "COLLECTION_SECTIONS_PLAYLISTS_MEDIA_ID")) {
                        w42 a3 = a();
                        a3.getClass();
                        obj2 = x97.V(dm6.b, new p42(a3, continuation, i4), h72Var);
                        if (obj2 != obj3) {
                            obj2 = (List) obj2;
                        }
                    } else {
                        int i8 = 1;
                        if (Intrinsics.d(str2, "COLLECTION_SECTIONS_PODCASTS_MEDIA_ID")) {
                            w42 a4 = a();
                            a4.getClass();
                            obj2 = x97.V(dm6.b, new u42(a4, str2, continuation, i8), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_ALL_PODCASTS_MEDIA_ID")) {
                            w42 a5 = a();
                            a5.getClass();
                            obj2 = x97.V(dm6.b, new p42(a5, continuation, 6), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_EPISODES_MEDIA_ID")) {
                            w42 a6 = a();
                            a6.getClass();
                            obj2 = x97.V(dm6.b, new s42(a6, str2, continuation, i7), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_SECTIONS_BOOKS_MEDIA_ID")) {
                            w42 a7 = a();
                            a7.getClass();
                            obj2 = x97.V(dm6.b, new u42(a7, str2, continuation, i3), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_ALL_AUDIOBOOKS_MEDIA_ID")) {
                            w42 a8 = a();
                            a8.getClass();
                            obj2 = x97.V(dm6.b, new p42(a8, continuation, i7), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_CHAPTERS_MEDIA_ID")) {
                            w42 a9 = a();
                            a9.getClass();
                            obj2 = x97.V(dm6.b, new s42(a9, str2, continuation, i8), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_SECTIONS_DOWNLOADED_MEDIA_ID")) {
                            za2 c2 = c();
                            c2.getClass();
                            obj2 = x97.V(dm6.b, new wa2(c2, (Continuation) null), h72Var);
                        } else if (Intrinsics.d(str2, "COLLECTION_SECTIONS_KIDS_MEDIA_ID")) {
                            w42 a10 = a();
                            a10.getClass();
                            obj2 = x97.V(dm6.b, new v3((Object) a10, str2, continuation, 11), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_KIDS_ALBUMS_MEDIA_ID")) {
                            w42 a11 = a();
                            a11.getClass();
                            obj2 = x97.V(dm6.b, new p42(a11, continuation, i6), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_KIDS_PLAYLISTS_MEDIA_ID")) {
                            w42 a12 = a();
                            a12.getClass();
                            obj2 = x97.V(dm6.b, new p42(a12, continuation, i5), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_KIDS_TRACKS_MEDIA_ID")) {
                            w42 a13 = a();
                            a13.getClass();
                            obj2 = x97.V(dm6.b, new s42(a13, str2, continuation, i5), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else if (Intrinsics.d(str2, "COLLECTION_FAVOURITE_ARTISTS")) {
                            w42 a14 = a();
                            a14.getClass();
                            obj2 = x97.V(dm6.b, new p42(a14, continuation, i8), h72Var);
                            if (obj2 != obj3) {
                                obj2 = (List) obj2;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        List list4 = (List) obj2;
                        return list4 == null ? c5b.a : list4;
                    }
                    str2 = h72Var.j;
                    qgg.h0(obj2);
                    List list5 = (List) obj2;
                    if (list5 != null) {
                        return list5;
                    }
                    h72Var.j = null;
                    h72Var.m = 5;
                    obj2 = o(str2, h72Var);
                }
                list = (List) obj2;
                if (list == null) {
                    return list;
                }
                h72Var.j = str2;
                h72Var.m = 3;
                t82[] t82VarArr = t82.a;
                if (c.v(str2, "NON_MUSIC_EDITORIAL_COMPILATION", false) || c.v(str2, "CHART_ALBUMS", false)) {
                    za2 c3 = c();
                    c3.getClass();
                    obj2 = x97.V(dm6.b, new ra2(c3, str2, continuation, i3), h72Var);
                } else {
                    obj2 = null;
                }
            }
        }
        h72Var = new h72(this, cg6Var);
        Object obj22 = h72Var.k;
        Object obj32 = nm6.a;
        i = h72Var.m;
        int i32 = 0;
        int i42 = 5;
        int i52 = 4;
        int i62 = 3;
        int i72 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        list = (List) obj22;
        if (list == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r13 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, cg6 cg6Var) {
        i72 i72Var;
        int i;
        Object obj;
        if (cg6Var instanceof i72) {
            i72Var = (i72) cg6Var;
            int i2 = i72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i72Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = i72Var.j;
                Object obj3 = nm6.a;
                i = i72Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    xdr xdrVar = this.o;
                    Boolean bool = ((cb2) xdrVar.getValue()).a;
                    if (bool != null && bool.booleanValue()) {
                        n();
                    }
                    d().getClass();
                    str.getClass();
                    if (c.v(str, "tab_prefix_", false)) {
                        d().getClass();
                        String a = db2.a(str);
                        za2 c = c();
                        Iterator it = ((cb2) xdrVar.getValue()).b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((r0s) obj).a.equals(a)) {
                                break;
                            }
                        }
                        r0s r0sVar = (r0s) obj;
                        List list = r0sVar != null ? r0sVar.e : null;
                        i72Var.l = 1;
                        c.getClass();
                        Object V = x97.V(dm6.b, new xa2(a, list, c, false, null), i72Var);
                        if (V != obj3) {
                            return V;
                        }
                    } else {
                        i72Var.l = 2;
                        obj2 = o(str, i72Var);
                    }
                    return obj3;
                }
                if (i == 1) {
                    qgg.h0(obj2);
                    return obj2;
                }
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj2);
                List list2 = (List) obj2;
                return list2 != null ? c5b.a : list2;
            }
        }
        i72Var = new i72(this, cg6Var);
        Object obj22 = i72Var.j;
        Object obj32 = nm6.a;
        i = i72Var.l;
        if (i != 0) {
        }
        List list22 = (List) obj22;
        if (list22 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[LOOP:0: B:11:0x004f->B:13:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(cg6 cg6Var) {
        j72 j72Var;
        int i;
        if (cg6Var instanceof j72) {
            j72Var = (j72) cg6Var;
            int i2 = j72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = j72Var.j;
                nm6 nm6Var = nm6.a;
                i = j72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    j72Var.l = 1;
                    obj = h(j72Var);
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
                List<r0s> list = ((cb2) obj).b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (r0s r0sVar : list) {
                    d().getClass();
                    r0sVar.getClass();
                    String concat = "tab_prefix_".concat(r0sVar.a);
                    uwh uwhVar = uwh.a;
                    arrayList.add(new cfo(null, concat, r0sVar.b));
                }
                return arrayList;
            }
        }
        j72Var = new j72(this, cg6Var);
        Object obj2 = j72Var.j;
        nm6 nm6Var2 = nm6.a;
        i = j72Var.l;
        if (i != 0) {
        }
        List<r0s> list2 = ((cb2) obj2).b;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cg6 cg6Var) {
        k72 k72Var;
        int i;
        if (cg6Var instanceof k72) {
            k72Var = (k72) cg6Var;
            int i2 = k72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = k72Var.j;
                nm6 nm6Var = nm6.a;
                i = k72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    za2 c = c();
                    k72Var.l = 1;
                    c.getClass();
                    obj = x97.V(dm6.b, new ox1(c, null, 2), k72Var);
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
                cb2 cb2Var = (cb2) obj;
                this.o.l(cb2Var);
                return cb2Var;
            }
        }
        k72Var = new k72(this, cg6Var);
        Object obj2 = k72Var.j;
        nm6 nm6Var2 = nm6.a;
        i = k72Var.l;
        if (i != 0) {
        }
        cb2 cb2Var2 = (cb2) obj2;
        this.o.l(cb2Var2);
        return cb2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var) {
        l72 l72Var;
        int i;
        if (cg6Var instanceof l72) {
            l72Var = (l72) cg6Var;
            int i2 = l72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = l72Var.j;
                Object obj2 = nm6.a;
                i = l72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    l72Var.l = 1;
                    obj = l(l72Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                cb2 cb2Var = (cb2) obj;
                this.o.l(cb2Var);
                return cb2Var;
            }
        }
        l72Var = new l72(this, cg6Var);
        Object obj3 = l72Var.j;
        Object obj22 = nm6.a;
        i = l72Var.l;
        if (i != 0) {
        }
        cb2 cb2Var2 = (cb2) obj3;
        this.o.l(cb2Var2);
        return cb2Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[LOOP:0: B:13:0x0070->B:15:0x0076, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(u0j u0jVar, cg6 cg6Var) {
        m72 m72Var;
        int i;
        List list;
        if (cg6Var instanceof m72) {
            m72Var = (m72) cg6Var;
            int i2 = m72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = m72Var.j;
                nm6 nm6Var = nm6.a;
                i = m72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = u0jVar.ordinal();
                    if (ordinal == 0) {
                        m72Var.l = 1;
                        obj = g(m72Var);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        m72Var.l = 2;
                        obj = k(m72Var);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    list = (List) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    list = (List) obj;
                }
                List<cfo> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (cfo cfoVar : list2) {
                    cfoVar.getClass();
                    uwh uwhVar = uwh.a;
                    arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(cfoVar.a, cfoVar.b, null, null, null, cfoVar.c, null, null), 1));
                }
                return arrayList;
            }
        }
        m72Var = new m72(this, cg6Var);
        Object obj2 = m72Var.j;
        nm6 nm6Var2 = nm6.a;
        i = m72Var.l;
        if (i != 0) {
        }
        List<cfo> list22 = list;
        ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
        while (r1.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(cg6 cg6Var) {
        n72 n72Var;
        int i;
        Uri a;
        String pathForSize;
        if (cg6Var instanceof n72) {
            n72Var = (n72) cg6Var;
            int i2 = n72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = n72Var.j;
                nm6 nm6Var = nm6.a;
                i = n72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    n72Var.l = 1;
                    obj = i(n72Var);
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
                List<r0s> list = ((cb2) obj).b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (r0s r0sVar : list) {
                    d().getClass();
                    r0sVar.getClass();
                    String str = r0sVar.a;
                    String concat = "tab_prefix_".concat(str);
                    uwh uwhVar = uwh.a;
                    String str2 = r0sVar.b;
                    e12 e12Var = (e12) this.f.getValue();
                    e12Var.getClass();
                    jyr jyrVar = e12Var.b;
                    jyr jyrVar2 = e12Var.c;
                    CoverPath coverPath = (CoverPath) CollectionsKt.firstOrNull(r0sVar.d);
                    if (coverPath == null || (pathForSize = coverPath.getPathForSize(((Number) e12Var.d.getValue()).intValue())) == null || (a = Uri.parse(pathForSize)) == null) {
                        ((dd0) jyrVar2.getValue()).getClass();
                        if (str.equals("CarPlay_main")) {
                            a = dc0.a(((dc0) jyrVar.getValue()).a, R.drawable.ic_auto_home_default_24);
                        } else {
                            ((dd0) jyrVar2.getValue()).getClass();
                            if (str.equals("CarPlay_nonmusic")) {
                                a = dc0.a(((dc0) jyrVar.getValue()).a, R.drawable.ic_auto_podcast_default_24);
                            } else {
                                ((dd0) jyrVar2.getValue()).getClass();
                                if (str.equals("CarPlay_collection")) {
                                    a = dc0.a(((dc0) jyrVar.getValue()).a, R.drawable.ic_auto_my_music_24);
                                } else {
                                    ((dd0) jyrVar2.getValue()).getClass();
                                    a = str.equals("CarPlay_kids") ? dc0.a(((dc0) jyrVar.getValue()).a, R.drawable.ic_auto_kid_default_24) : null;
                                }
                            }
                        }
                    }
                    arrayList.add(new cfo(a, concat, str2));
                }
                return arrayList;
            }
        }
        n72Var = new n72(this, cg6Var);
        Object obj2 = n72Var.j;
        nm6 nm6Var2 = nm6.a;
        i = n72Var.l;
        if (i != 0) {
        }
        List<r0s> list2 = ((cb2) obj2).b;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        while (r11.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        o72 o72Var;
        nm6 nm6Var;
        int i;
        Object g0;
        cb2 cb2Var;
        if (cg6Var instanceof o72) {
            o72Var = (o72) cg6Var;
            int i2 = o72Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o72Var.m = i2 - Integer.MIN_VALUE;
                Object obj = o72Var.k;
                nm6Var = nm6.a;
                i = o72Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    za2 c = c();
                    o72Var.m = 1;
                    c.getClass();
                    obj = x97.V(dm6.b, new hl(c, null, 18), o72Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cb2Var = o72Var.j;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return cb2Var;
                        }
                        List list = cb2Var.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (!((r0s) obj2).a.equals("CarPlay_kids")) {
                                arrayList.add(obj2);
                            }
                        }
                        return new cb2(arrayList, cb2Var.a);
                    }
                    qgg.h0(obj);
                }
                cb2 cb2Var2 = (cb2) obj;
                pjc pjcVar = (pjc) this.h.getValue();
                o72Var.j = cb2Var2;
                o72Var.m = 2;
                g0 = zsd.g0(pjcVar, o72Var);
                if (g0 != nm6Var) {
                    cb2Var = cb2Var2;
                    obj = g0;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return nm6Var;
            }
        }
        o72Var = new o72(this, cg6Var);
        Object obj3 = o72Var.k;
        nm6Var = nm6.a;
        i = o72Var.m;
        if (i != 0) {
        }
        cb2 cb2Var22 = (cb2) obj3;
        pjc pjcVar2 = (pjc) this.h.getValue();
        o72Var.j = cb2Var22;
        o72Var.m = 2;
        g0 = zsd.g0(pjcVar2, o72Var);
        if (g0 != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r12 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r12 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r12 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(u0j u0jVar, cg6 cg6Var) {
        p72 p72Var;
        int i;
        r0s r0sVar;
        if (cg6Var instanceof p72) {
            p72Var = (p72) cg6Var;
            int i2 = p72Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p72Var.l = i2 - Integer.MIN_VALUE;
                Object obj = p72Var.j;
                Object obj2 = nm6.a;
                i = p72Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    int ordinal = u0jVar.ordinal();
                    if (ordinal == 0) {
                        p72Var.l = 1;
                        obj = h(p72Var);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        r0sVar = (r0s) CollectionsKt.firstOrNull(((cb2) this.o.getValue()).b);
                        if (r0sVar == null) {
                            p72Var.l = 2;
                            obj = i(p72Var);
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    r0sVar = (r0s) CollectionsKt.firstOrNull(((cb2) obj).b);
                    if (r0sVar == null) {
                        return c5b.a;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        List list = (List) obj;
                        return list == null ? c5b.a : list;
                    }
                    qgg.h0(obj);
                    r0sVar = (r0s) CollectionsKt.firstOrNull(((cb2) obj).b);
                    if (r0sVar == null) {
                        return c5b.a;
                    }
                }
                za2 c = c();
                String str = r0sVar.a;
                List list2 = r0sVar.e;
                p72Var.l = 3;
                c.getClass();
                obj = x97.V(dm6.b, new xa2(str, list2, c, false, null), p72Var);
            }
        }
        p72Var = new p72(this, cg6Var);
        Object obj3 = p72Var.j;
        Object obj22 = nm6.a;
        i = p72Var.l;
        if (i != 0) {
        }
        za2 c2 = c();
        String str2 = r0sVar.a;
        List list22 = r0sVar.e;
        p72Var.l = 3;
        c2.getClass();
        obj3 = x97.V(dm6.b, new xa2(str2, list22, c2, false, null), p72Var);
    }

    public final void n() {
        this.m.a(t75.c("media_browser_root_id"));
    }

    public final Object o(String str, cg6 cg6Var) {
        b72 b72Var = b72.b;
        int i = 6;
        Continuation continuation = null;
        if (Intrinsics.d(str, "DOWNLOADED_TRACKS_BLOCK_MEDIA_ID")) {
            h82 b = b();
            b.getClass();
            Object V = x97.V(dm6.b, new e82(b, str, continuation, i), cg6Var);
            return V == nm6.a ? V : (List) V;
        }
        if (Intrinsics.d(str, "DOWNLOADED_PLAYLISTS_BLOCK_MEDIA_ID")) {
            h82 b2 = b();
            b2.getClass();
            Object V2 = x97.V(dm6.b, new b82(b2, continuation, 5), cg6Var);
            return V2 == nm6.a ? V2 : (List) V2;
        }
        int i2 = 0;
        if (Intrinsics.d(str, "DOWNLOADED_ALBUMS_BLOCK_MEDIA_ID")) {
            h82 b3 = b();
            b3.getClass();
            Object V3 = x97.V(dm6.b, new b82(b3, continuation, i2), cg6Var);
            return V3 == nm6.a ? V3 : (List) V3;
        }
        int i3 = 1;
        if (Intrinsics.d(str, "DOWNLOADED_PODCASTS_BLOCK_MEDIA_ID")) {
            h82 b4 = b();
            b4.getClass();
            Object V4 = x97.V(dm6.b, new g82(b4, str, continuation, i3), cg6Var);
            return V4 == nm6.a ? V4 : (List) V4;
        }
        if (Intrinsics.d(str, "DOWNLOADED_ALL_PODCASTS_MEDIA_ID")) {
            h82 b5 = b();
            b5.getClass();
            Object V5 = x97.V(dm6.b, new b82(b5, continuation, i), cg6Var);
            return V5 == nm6.a ? V5 : (List) V5;
        }
        int i4 = 2;
        if (Intrinsics.d(str, "DOWNLOADED_EPISODES_MEDIA_ID")) {
            h82 b6 = b();
            b6.getClass();
            Object V6 = x97.V(dm6.b, new e82(b6, str, continuation, i4), cg6Var);
            return V6 == nm6.a ? V6 : (List) V6;
        }
        if (Intrinsics.d(str, "DOWNLOADED_AUDIOBOOKS_BLOCK_MEDIA_ID")) {
            h82 b7 = b();
            b7.getClass();
            Object V7 = x97.V(dm6.b, new g82(b7, str, continuation, i2), cg6Var);
            return V7 == nm6.a ? V7 : (List) V7;
        }
        if (Intrinsics.d(str, "DOWNLOADED_ALL_AUDIOBOOKS_MEDIA_ID")) {
            h82 b8 = b();
            b8.getClass();
            Object V8 = x97.V(dm6.b, new b82(b8, continuation, i4), cg6Var);
            return V8 == nm6.a ? V8 : (List) V8;
        }
        if (Intrinsics.d(str, "DOWNLOADED_CHAPTERS_MEDIA_ID")) {
            h82 b9 = b();
            b9.getClass();
            Object V9 = x97.V(dm6.b, new e82(b9, str, continuation, i3), cg6Var);
            return V9 == nm6.a ? V9 : (List) V9;
        }
        if (Intrinsics.d(str, "DOWNLOADED_ARTISTS_BLOCK_MEDIA_ID")) {
            h82 b10 = b();
            b10.getClass();
            Object V10 = x97.V(dm6.b, new b82(b10, continuation, i3), cg6Var);
            return V10 == nm6.a ? V10 : (List) V10;
        }
        if (Intrinsics.d(str, "DOWNLOADED_KIDS_BLOCK_MEDIA_ID")) {
            h82 b11 = b();
            b11.getClass();
            Object V11 = x97.V(dm6.b, new v3((Object) b11, str, continuation, 12), cg6Var);
            return V11 == nm6.a ? V11 : (List) V11;
        }
        int i5 = 4;
        if (Intrinsics.d(str, "DOWNLOADED_KIDS_PLAYLISTS_MEDIA_ID")) {
            h82 b12 = b();
            b12.getClass();
            Object V12 = x97.V(dm6.b, new b82(b12, continuation, i5), cg6Var);
            return V12 == nm6.a ? V12 : (List) V12;
        }
        if (Intrinsics.d(str, "DOWNLOADED_KIDS_ALBUMS_MEDIA_ID")) {
            h82 b13 = b();
            b13.getClass();
            Object V13 = x97.V(dm6.b, new b82(b13, continuation, 3), cg6Var);
            return V13 == nm6.a ? V13 : (List) V13;
        }
        if (!Intrinsics.d(str, "DOWNLOADED_KIDS_TRACKS_MEDIA_ID")) {
            return null;
        }
        h82 b14 = b();
        b14.getClass();
        Object V14 = x97.V(dm6.b, new e82(b14, str, continuation, i5), cg6Var);
        return V14 == nm6.a ? V14 : (List) V14;
    }
}

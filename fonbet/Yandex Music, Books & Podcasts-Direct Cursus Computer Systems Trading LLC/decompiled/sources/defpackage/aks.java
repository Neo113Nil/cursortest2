package defpackage;

import com.yandex.music.shared.offline.recommender.proto.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class aks implements dlj {
    public static final /* synthetic */ s9f[] g;
    public final llj a;
    public final mm6 b;
    public final qqi c;
    public final jyr d;
    public volatile vjs e;
    public final rhp f;

    static {
        opi opiVar = new opi(aks.class, "saveRecommenderJob", "getSaveRecommenderJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar};
    }

    public aks(mm6 mm6Var, llj lljVar) {
        mm6Var.getClass();
        this.a = lljVar;
        this.b = mm6Var;
        this.c = rqi.a();
        this.d = btf.b(new wfs(2, this));
        this.f = new rhp();
    }

    public static ArrayList g(List list) {
        Object q7cVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cnj cnjVar = (cnj) it.next();
            if (cnjVar instanceof zmj) {
                zmj zmjVar = (zmj) cnjVar;
                q7cVar = new o7c(zmjVar.b, zmjVar.a);
            } else if (cnjVar instanceof wmj) {
                wmj wmjVar = (wmj) cnjVar;
                q7cVar = new n7c(wmjVar.a, wmjVar.b, wmjVar.c);
            } else if (cnjVar instanceof ymj) {
                ymj ymjVar = (ymj) cnjVar;
                q7cVar = new m7c(ymjVar.a, ymjVar.b, ymjVar.c);
            } else if (cnjVar instanceof vmj) {
                vmj vmjVar = (vmj) cnjVar;
                q7cVar = new k7c(vmjVar.a, vmjVar.b, vmjVar.c);
            } else if (cnjVar instanceof xmj) {
                xmj xmjVar = (xmj) cnjVar;
                q7cVar = new l7c(xmjVar.b, xmjVar.a);
            } else if (cnjVar instanceof anj) {
                anj anjVar = (anj) cnjVar;
                q7cVar = new p7c(anjVar.b, anjVar.a);
            } else {
                if (!(cnjVar instanceof bnj)) {
                    b6e.s();
                    return null;
                }
                bnj bnjVar = (bnj) cnjVar;
                q7cVar = new q7c(bnjVar.b, bnjVar.a);
            }
            arrayList.add(q7cVar);
        }
        return arrayList;
    }

    public static int[] h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull(((mqs) it.next()).a);
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return CollectionsKt.v0(arrayList);
    }

    @Override // defpackage.dlj
    public final void a() {
        vjs vjsVar = this.e;
        if (vjsVar == null) {
            return;
        }
        this.f.d(g[0], x97.y(this.b, null, null, new v0r(this, vjsVar, null, 24), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: yiu -> 0x00d3, TryCatch #0 {yiu -> 0x00d3, blocks: (B:25:0x0091, B:26:0x009a, B:28:0x00a0, B:30:0x00b0, B:32:0x00be, B:34:0x00c2, B:35:0x00c8, B:38:0x00cf, B:45:0x00d6), top: B:24:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, s9p s9pVar, String str, cg6 cg6Var) {
        xjs xjsVar;
        int i;
        s9p s9pVar2;
        List<mqs> list;
        String str2;
        vjs vjsVar;
        int[] iArr;
        int length;
        Collection collection;
        boolean isEmpty;
        k2t k2tVar;
        String str3;
        if (cg6Var instanceof xjs) {
            xjsVar = (xjs) cg6Var;
            int i2 = xjsVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xjsVar.o = i2 - Integer.MIN_VALUE;
                Object obj = xjsVar.m;
                Object obj2 = nm6.a;
                i = xjsVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    xjsVar.j = arrayList;
                    s9pVar2 = s9pVar;
                    xjsVar.k = s9pVar2;
                    xjsVar.l = str;
                    xjsVar.o = 1;
                    Object e = e(xjsVar);
                    if (e == obj2) {
                        return obj2;
                    }
                    list = arrayList;
                    obj = e;
                    str2 = str;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = xjsVar.l;
                    s9pVar2 = xjsVar.k;
                    list = xjsVar.j;
                    qgg.h0(obj);
                }
                vjsVar = (vjs) obj;
                if (vjsVar != null) {
                    return new slj("newState: recommender=null", f(null, list, s9pVar2, null), null, null, null, 28);
                }
                List c = this.a.c();
                try {
                    if (str2 != null) {
                        llj lljVar = this.a;
                        aqd aqdVar = lljVar.j;
                        if (aqdVar == null || !Intrinsics.d((String) aqdVar.b, str2)) {
                            aqdVar = null;
                        }
                        lljVar.j = null;
                        if (aqdVar != null) {
                            iArr = (int[]) aqdVar.c;
                            ArrayList arrayList2 = new ArrayList();
                            for (mqs mqsVar : list) {
                                Integer intOrNull = StringsKt.toIntOrNull(mqsVar.a);
                                if (intOrNull != null) {
                                    int intValue = intOrNull.intValue();
                                    zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(mqsVar.f);
                                    k2tVar = new k2t(intValue, (zp2Var == null || (str3 = zp2Var.a) == null) ? null : StringsKt.toIntOrNull(str3));
                                } else {
                                    k2tVar = null;
                                }
                                if (k2tVar != null) {
                                    arrayList2.add(k2tVar);
                                }
                            }
                            x3n f = vjsVar.f(iArr, arrayList2, s9pVar2.a, h(c));
                            this.a.k = false;
                            int[] iArr2 = (int[]) f.b;
                            iArr2.getClass();
                            length = iArr2.length;
                            if (length != 0) {
                                collection = q5b.a;
                            } else if (length != 1) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet(tah.a(iArr2.length));
                                xz0.T(iArr2, linkedHashSet);
                                collection = linkedHashSet;
                            } else {
                                collection = uop.b(Integer.valueOf(iArr2[0]));
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : c) {
                                if (CollectionsKt.I(collection, StringsKt.toIntOrNull(((mqs) obj3).a))) {
                                    arrayList3.add(obj3);
                                }
                            }
                            ssg.a(3, "TinyMlOfflineRecommender", "newState: tracks=" + arrayList3 + " batch=" + ((String) f.d), null);
                            isEmpty = arrayList3.isEmpty();
                            if (!(!isEmpty)) {
                                return new tlj(f(vjsVar, list, s9pVar2, iArr), "offline_wave_".concat((String) f.a), (String) f.d, arrayList3, (int[]) f.c, false);
                            }
                            if (isEmpty) {
                                return new slj("newState: empty result", f(vjsVar, list, s9pVar2, iArr), null, (String) f.d, (int[]) f.c, 4);
                            }
                            b6e.s();
                            return null;
                        }
                    }
                    ArrayList arrayList22 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    x3n f2 = vjsVar.f(iArr, arrayList22, s9pVar2.a, h(c));
                    this.a.k = false;
                    int[] iArr22 = (int[]) f2.b;
                    iArr22.getClass();
                    length = iArr22.length;
                    if (length != 0) {
                    }
                    ArrayList arrayList32 = new ArrayList();
                    while (r8.hasNext()) {
                    }
                    ssg.a(3, "TinyMlOfflineRecommender", "newState: tracks=" + arrayList32 + " batch=" + ((String) f2.d), null);
                    isEmpty = arrayList32.isEmpty();
                    if (!(!isEmpty)) {
                    }
                } catch (yiu e2) {
                    ssg.a(6, "TinyMlOfflineRecommender", "TinyMl command execution failed: startWave", e2);
                    return new slj("startWave", f(vjsVar, list, s9pVar2, iArr), e2.getMessage(), null, null, 24);
                }
                iArr = null;
            }
        }
        xjsVar = new xjs(this, cg6Var);
        Object obj4 = xjsVar.m;
        Object obj22 = nm6.a;
        i = xjsVar.o;
        if (i != 0) {
        }
        vjsVar = (vjs) obj4;
        if (vjsVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mqs mqsVar, List list, mqs mqsVar2, cg6 cg6Var) {
        yjs yjsVar;
        int i;
        vjs vjsVar;
        Object obj;
        if (cg6Var instanceof yjs) {
            yjsVar = (yjs) cg6Var;
            int i2 = yjsVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yjsVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = yjsVar.m;
                Object obj3 = nm6.a;
                i = yjsVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    yjsVar.j = mqsVar;
                    yjsVar.k = list;
                    yjsVar.l = mqsVar2;
                    yjsVar.o = 1;
                    obj2 = e(yjsVar);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mqsVar2 = yjsVar.l;
                    list = yjsVar.k;
                    mqsVar = yjsVar.j;
                    qgg.h0(obj2);
                }
                vjsVar = (vjs) obj2;
                if (vjsVar != null) {
                    return new vlj("nextTrack: recommender=null", null, null, null, null, 30);
                }
                llj lljVar = this.a;
                List c = lljVar.c();
                olj f = f(vjsVar, null, null, null);
                boolean z = lljVar.k;
                lljVar.k = false;
                if (z) {
                    v3w.k("TinyMl: updateAvailableTracks, count=", c.size(), 3, "TinyMlOfflineRecommender", null);
                    vjsVar.g(h(c));
                }
                try {
                    Integer intOrNull = StringsKt.toIntOrNull(mqsVar.a);
                    if (intOrNull == null) {
                        return new vlj("nextTrack: lastTrackId=null", f, null, null, null, 28);
                    }
                    int intValue = intOrNull.intValue();
                    Integer intOrNull2 = StringsKt.toIntOrNull(mqsVar2.a);
                    if (intOrNull2 == null) {
                        return new vlj("nextTrack: queueTrack=null", f, null, null, null, 28);
                    }
                    x0 d = vjsVar.d(g(list), intValue, intOrNull2.intValue());
                    String str = (String) d.d;
                    Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.d(((mqs) obj).a, String.valueOf(d.b))) {
                            break;
                        }
                    }
                    mqs mqsVar3 = (mqs) obj;
                    if (mqsVar3 == null) {
                        return new vlj("nextTrack: empty result", f, null, str, (int[]) d.c, 4);
                    }
                    ssg.a(3, "TinyMlOfflineRecommender", "nextTrack: track=" + mqsVar3 + " batch=" + str, null);
                    return new wlj(f, str, mqsVar3, (int[]) d.c);
                } catch (yiu e) {
                    ssg.a(6, "TinyMlOfflineRecommender", "TinyMl command execution failed: nextTrack", e);
                    return new vlj("nextTrack", f, e.getMessage(), null, null, 24);
                }
            }
        }
        yjsVar = new yjs(this, cg6Var);
        Object obj22 = yjsVar.m;
        Object obj32 = nm6.a;
        i = yjsVar.o;
        if (i != 0) {
        }
        vjsVar = (vjs) obj22;
        if (vjsVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005e, code lost:
    
        if (r11.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v7, types: [oqi] */
    @Override // defpackage.dlj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        zjs zjsVar;
        int i;
        vjs vjsVar;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        int[] iArr;
        try {
            if (continuation instanceof zjs) {
                zjsVar = (zjs) continuation;
                int i3 = zjsVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    zjsVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = zjsVar.m;
                    Object obj2 = nm6.a;
                    i = zjsVar.o;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        vjsVar = this.e;
                        if (vjsVar == null) {
                            return Unit.a;
                        }
                        qqiVar = this.c;
                        zjsVar.j = vjsVar;
                        zjsVar.k = qqiVar;
                        i2 = 0;
                        zjsVar.l = 0;
                        zjsVar.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = zjsVar.k;
                            try {
                                qgg.h0(obj);
                                this.e = null;
                                oqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = zjsVar.l;
                        ?? r4 = zjsVar.k;
                        vjsVar = zjsVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    ssg.a(3, "TinyMlOfflineRecommender", "release TinyMl recommender", null);
                    hks hksVar = (hks) this.d.getValue();
                    synchronized (vjsVar) {
                        iArr = vjsVar.a.k;
                    }
                    zjsVar.j = null;
                    zjsVar.k = qqiVar;
                    zjsVar.l = i2;
                    zjsVar.o = 2;
                    cks cksVar = (cks) hksVar.b.getValue();
                    cksVar.getClass();
                    Object V = x97.V(dm6.b, new av7(cksVar, iArr, continuation2, 4), zjsVar);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        oqiVar = qqiVar;
                        this.e = null;
                        oqiVar.b(null);
                        return Unit.a;
                    }
                    return obj2;
                }
            }
            ssg.a(3, "TinyMlOfflineRecommender", "release TinyMl recommender", null);
            hks hksVar2 = (hks) this.d.getValue();
            synchronized (vjsVar) {
            }
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        zjsVar = new zjs(this, (cg6) continuation);
        Object obj3 = zjsVar.m;
        Object obj22 = nm6.a;
        i = zjsVar.o;
        Continuation continuation22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:26:0x005a, B:28:0x005e, B:29:0x0066), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:26:0x005a, B:28:0x005e, B:29:0x0066), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        wjs wjsVar;
        int i;
        qqi qqiVar;
        int i2;
        ?? r0;
        Throwable th;
        vjs vjsVar;
        try {
            if (cg6Var instanceof wjs) {
                wjsVar = (wjs) cg6Var;
                int i3 = wjsVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    wjsVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = wjsVar.l;
                    nm6 nm6Var = nm6.a;
                    i = wjsVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (this.e != null) {
                            return this.e;
                        }
                        qqiVar = this.c;
                        wjsVar.j = qqiVar;
                        i2 = 0;
                        wjsVar.k = 0;
                        wjsVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = wjsVar.j;
                            try {
                                qgg.h0(obj);
                                r0 = r0;
                                ssg.a(3, "TinyMlOfflineRecommender", "getRecommender: create new instance", null);
                                this.e = (vjs) obj;
                                qqi qqiVar2 = r0;
                                vjsVar = (vjs) obj;
                                qqiVar = qqiVar2;
                                qqiVar.b(null);
                                return vjsVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r0.b(null);
                                throw th;
                            }
                        }
                        i2 = wjsVar.k;
                        ?? r4 = wjsVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    if (this.e == null) {
                        vjsVar = this.e;
                        qqiVar.b(null);
                        return vjsVar;
                    }
                    llj lljVar = this.a;
                    wjsVar.j = qqiVar;
                    wjsVar.k = i2;
                    wjsVar.n = 2;
                    Object b = lljVar.b(wjsVar);
                    if (b != nm6Var) {
                        r0 = qqiVar;
                        obj = b;
                        ssg.a(3, "TinyMlOfflineRecommender", "getRecommender: create new instance", null);
                        this.e = (vjs) obj;
                        qqi qqiVar22 = r0;
                        vjsVar = (vjs) obj;
                        qqiVar = qqiVar22;
                        qqiVar.b(null);
                        return vjsVar;
                    }
                    return nm6Var;
                }
            }
            if (this.e == null) {
            }
        } catch (Throwable th3) {
            r0 = qqiVar;
            th = th3;
            r0.b(null);
            throw th;
        }
        wjsVar = new wjs(this, cg6Var);
        Object obj2 = wjsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wjsVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final olj f(vjs vjsVar, List list, s9p s9pVar, int[] iArr) {
        String str;
        int i;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (vjsVar != null) {
            synchronized (vjsVar) {
                synchronized (vjsVar) {
                    iArr4 = vjsVar.a.l;
                }
            }
            if (iArr4.length < 5) {
                str = "";
            } else {
                str = iArr4[3] + "." + iArr4[4];
            }
        } else {
            str = "N/A";
        }
        String a = iks.a((a) this.a.h.getValue());
        int size = this.a.c().size();
        Integer valueOf = list != null ? Integer.valueOf(list.size()) : null;
        int i2 = 0;
        if (vjsVar != null) {
            synchronized (vjsVar) {
                iArr3 = vjsVar.a.l;
            }
            if (iArr3 != null) {
                i = iArr3.length;
                if (vjsVar != null) {
                    synchronized (vjsVar) {
                        iArr2 = vjsVar.a.k;
                    }
                    if (iArr2 != null) {
                        i2 = iArr2.length;
                    }
                }
                return new olj(str, a, size, valueOf, i, i2, s9pVar == null ? CollectionsKt.X(o8g.R(s9pVar), null, null, null, null, 63) : null, iArr != null ? Integer.valueOf(iArr.length) : null);
            }
        }
        i = 0;
        if (vjsVar != null) {
        }
        return new olj(str, a, size, valueOf, i, i2, s9pVar == null ? CollectionsKt.X(o8g.R(s9pVar), null, null, null, null, 63) : null, iArr != null ? Integer.valueOf(iArr.length) : null);
    }
}

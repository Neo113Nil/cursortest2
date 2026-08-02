package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kjk extends gjk {
    public final dik k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final xdr p;
    public final j0q q;

    public kjk(dik dikVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        dikVar.getClass();
        this.k = dikVar;
        this.l = jyrVar;
        this.m = jyrVar2;
        this.n = jyrVar3;
        this.o = jyrVar4;
        this.p = ydr.a(zik.a);
        this.q = new j0q();
        x97.y(ot0.F(this), null, null, new m1i(this, null, 27), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r6.K(r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(kjk kjkVar, cg6 cg6Var) {
        hjk hjkVar;
        int i;
        xyo xyoVar;
        if (cg6Var instanceof hjk) {
            hjkVar = (hjk) cg6Var;
            int i2 = hjkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hjkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hjkVar.j;
                Object obj2 = nm6.a;
                i = hjkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fjk fjkVar = (fjk) kjkVar.l.getValue();
                    hjkVar.l = 1;
                    obj = fjkVar.a(hjkVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xyoVar = (xyo) obj;
                if (!(xyoVar instanceof vyo)) {
                    j0q j0qVar = kjkVar.q;
                    cik cikVar = cik.a;
                    hjkVar.l = 2;
                } else {
                    if (!(xyoVar instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    hjkVar.l = 3;
                }
                return obj2;
            }
        }
        hjkVar = new hjk(kjkVar, cg6Var);
        Object obj3 = hjkVar.j;
        Object obj22 = nm6.a;
        i = hjkVar.l;
        if (i != 0) {
        }
        xyoVar = (xyo) obj3;
        if (!(xyoVar instanceof vyo)) {
        }
        return obj22;
    }

    @Override // defpackage.gjk
    public final pjc G() {
        return this.q;
    }

    @Override // defpackage.gjk
    public final vdr H() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x014e, code lost:
    
        if (r1 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(cg6 cg6Var) {
        ijk ijkVar;
        int i;
        kik kikVar;
        String str;
        kjk kjkVar;
        String str2;
        String str3;
        String b;
        Object emit;
        if (cg6Var instanceof ijk) {
            ijkVar = (ijk) cg6Var;
            int i2 = ijkVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ijkVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ijkVar.m;
                nm6 nm6Var = nm6.a;
                i = ijkVar.o;
                dik dikVar = this.k;
                if (i != 0) {
                    qgg.h0(obj);
                    zik zikVar = zik.b;
                    xdr xdrVar = this.p;
                    xdrVar.getClass();
                    xdrVar.m(null, zikVar);
                    kik kikVar2 = (kik) this.m.getValue();
                    dikVar.getClass();
                    hv0 hv0Var = dikVar.a;
                    ijkVar.j = this;
                    ijkVar.k = kikVar2;
                    ijkVar.l = "music_paywall_screen";
                    ijkVar.o = 1;
                    Object invoke = hv0Var.invoke(ijkVar);
                    if (invoke != nm6Var) {
                        kikVar = kikVar2;
                        obj = invoke;
                        str = "music_paywall_screen";
                        kjkVar = this;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    String str4 = ijkVar.l;
                    kikVar = ijkVar.k;
                    kjk kjkVar2 = ijkVar.j;
                    qgg.h0(obj);
                    str = str4;
                    kjkVar = kjkVar2;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kjkVar = ijkVar.j;
                    qgg.h0(obj);
                    sik sikVar = (sik) obj;
                    ijkVar.j = null;
                    ijkVar.o = 3;
                    j0q j0qVar = kjkVar.q;
                    if (Intrinsics.d(sikVar, rik.a)) {
                        emit = kjkVar.L(ijkVar);
                        if (emit != nm6Var) {
                            emit = Unit.a;
                        }
                    } else if (Intrinsics.d(sikVar, qik.a)) {
                        emit = j0qVar.emit(cik.a, ijkVar);
                        if (emit != nm6Var) {
                            emit = Unit.a;
                        }
                    } else {
                        if (!Intrinsics.d(sikVar, pik.a)) {
                            b6e.s();
                            return null;
                        }
                        emit = j0qVar.emit(cik.b, ijkVar);
                        if (emit != nm6Var) {
                            emit = Unit.a;
                        }
                    }
                }
                str2 = (String) obj;
                jyr jyrVar = this.n;
                if (str2 == null) {
                    str2 = ((mh7) ((s8m) jyrVar.getValue()).a.getValue()).a();
                }
                str3 = str2;
                b = ((mh7) ((s8m) jyrVar.getValue()).a.getValue()).b();
                boolean z = dikVar.b;
                String str5 = dikVar.c;
                oik oikVar = new oik(str, null, str3, b, str5, z);
                ijkVar.j = kjkVar;
                ijkVar.k = null;
                ijkVar.l = null;
                ijkVar.o = 2;
                kikVar.getClass();
                jyr jyrVar2 = kikVar.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str3 != null) {
                    linkedHashMap.put("campaign_id", str3);
                }
                if (b != null) {
                    linkedHashMap.put("utm_campaign", b);
                }
                linkedHashMap.put("is_close_disabled", String.valueOf(z));
                linkedHashMap.put("navigation_source", str5);
                obj = x97.V(dm6.b(), new ckg(kikVar, oikVar, linkedHashMap, ((c7m) jyrVar2.getValue()).b(), ((c7m) jyrVar2.getValue()).a(), (Continuation) null), ijkVar);
            }
        }
        ijkVar = new ijk(this, cg6Var);
        Object obj2 = ijkVar.m;
        nm6 nm6Var2 = nm6.a;
        i = ijkVar.o;
        dik dikVar2 = this.k;
        if (i != 0) {
        }
        str2 = (String) obj2;
        jyr jyrVar3 = this.n;
        if (str2 == null) {
        }
        str3 = str2;
        b = ((mh7) ((s8m) jyrVar3.getValue()).a.getValue()).b();
        boolean z2 = dikVar2.b;
        String str52 = dikVar2.c;
        oik oikVar2 = new oik(str, null, str3, b, str52, z2);
        ijkVar.j = kjkVar;
        ijkVar.k = null;
        ijkVar.l = null;
        ijkVar.o = 2;
        kikVar.getClass();
        jyr jyrVar22 = kikVar.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str3 != null) {
        }
        if (b != null) {
        }
        linkedHashMap2.put("is_close_disabled", String.valueOf(z2));
        linkedHashMap2.put("navigation_source", str52);
        obj2 = x97.V(dm6.b(), new ckg(kikVar, oikVar2, linkedHashMap2, ((c7m) jyrVar22.getValue()).b(), ((c7m) jyrVar22.getValue()).a(), (Continuation) null), ijkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r7.q.emit(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (K(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(cg6 cg6Var) {
        jjk jjkVar;
        int i;
        hot hotVar;
        if (cg6Var instanceof jjk) {
            jjkVar = (jjk) cg6Var;
            int i2 = jjkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jjkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jjkVar.j;
                Object obj2 = nm6.a;
                i = jjkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    zik zikVar = zik.c;
                    xdr xdrVar = this.p;
                    xdrVar.getClass();
                    xdrVar.m(null, zikVar);
                    dqi dqiVar = (dqi) this.o.getValue();
                    jjkVar.l = 1;
                    obj = dqiVar.a(jjkVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hotVar = (hot) obj;
                if (!(hotVar instanceof got)) {
                    if (((Boolean) this.k.d.invoke(((got) hotVar).a)).booleanValue()) {
                        cik cikVar = cik.c;
                        jjkVar.l = 2;
                    } else {
                        jjkVar.l = 3;
                    }
                    return obj2;
                }
                if (!(hotVar instanceof fot)) {
                    b6e.s();
                    return null;
                }
                dfi.r("Unsuccessful UserInfo update. Error = " + hotVar, "PaywallViewModel");
                return Unit.a;
            }
        }
        jjkVar = new jjk(this, cg6Var);
        Object obj3 = jjkVar.j;
        Object obj22 = nm6.a;
        i = jjkVar.l;
        if (i != 0) {
        }
        hotVar = (hot) obj3;
        if (!(hotVar instanceof got)) {
        }
    }
}

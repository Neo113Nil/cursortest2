package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes5.dex */
public final class odd {
    public final agd a;
    public final jfd b;
    public final ked c;
    public final yjd d;
    public final qqi e = rqi.a();
    public final mm6 f;
    public rar g;
    public rar h;
    public final bdd i;
    public final iz7 j;
    public final rjq k;
    public ced l;
    public final xdr m;
    public final xdr n;
    public final xdr o;

    public odd(agd agdVar, jfd jfdVar, ked kedVar, yjd yjdVar) {
        this.a = agdVar;
        this.b = jfdVar;
        this.c = kedVar;
        this.d = yjdVar;
        yiq yiqVar = new yiq();
        this.f = hld.r(yiqVar, dm6.b());
        this.i = new bdd(0, this);
        vqi z = yiqVar.z();
        z.getClass();
        final iz7 iz7Var = new iz7();
        iz7Var.a = this;
        iz7Var.b = hld.r(z, dm6.b());
        iz7Var.c = new ReentrantLock();
        bdt I = hag.I(agd.class);
        l18 l18Var = l18.b;
        iz7Var.e = l18Var.b(I, true);
        iz7Var.f = l18Var.b(hag.I(z66.class), true);
        iz7Var.g = l18Var.b(hag.I(oq7.class), true);
        iz7Var.h = l18Var.b(hag.I(yjd.class), true);
        iz7Var.i = l18Var.b(hag.I(akd.class), true);
        final int i = 0;
        iz7Var.j = btf.b(new Function0() { // from class: led
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                iz7 iz7Var2 = iz7Var;
                switch (i2) {
                    case 0:
                        h7a d0 = zsd.d0(((z66) ((jyr) iz7Var2.f).getValue()).c(), 1);
                        at5 at5Var = new at5(26, iz7Var2);
                        return new red(new ub7(22, q6k.m(d0, at5Var, q6k.g), at5Var), 0);
                    default:
                        return zsd.u0((pjc) ((jyr) iz7Var2.j).getValue(), (pjc) ((jyr) iz7Var2.k).getValue());
                }
            }
        });
        iz7Var.k = btf.b(new htb(iz7Var));
        final int i2 = 1;
        iz7Var.l = btf.b(new Function0() { // from class: led
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                iz7 iz7Var2 = iz7Var;
                switch (i22) {
                    case 0:
                        h7a d0 = zsd.d0(((z66) ((jyr) iz7Var2.f).getValue()).c(), 1);
                        at5 at5Var = new at5(26, iz7Var2);
                        return new red(new ub7(22, q6k.m(d0, at5Var, q6k.g), at5Var), 0);
                    default:
                        return zsd.u0((pjc) ((jyr) iz7Var2.j).getValue(), (pjc) ((jyr) iz7Var2.k).getValue());
                }
            }
        });
        this.j = iz7Var;
        this.k = new rjq(false);
        this.m = ydr.a(new cgd(null, null, null, false, false, false));
        this.n = ydr.a(c5b.a);
        this.o = ydr.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (f(r8, null, r10, r0, 28) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        if (f(r8, r9, r10, r0, 28) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a0, code lost:
    
        if (f(r8, null, r10, r0, 28) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        if (f(r8, null, r10, r0, 28) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (f(r8, null, r10, r0, 28) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(odd oddVar, hed hedVar, boolean z, bz2 bz2Var, cg6 cg6Var) {
        ldd lddVar;
        int i;
        if (cg6Var instanceof ldd) {
            lddVar = (ldd) cg6Var;
            int i2 = lddVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lddVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lddVar.l;
                nm6 nm6Var = nm6.a;
                i = lddVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (hedVar == null) {
                        lddVar.j = null;
                        lddVar.k = bz2Var;
                        lddVar.n = 1;
                    } else if (hedVar instanceof eed) {
                        ced cedVar = ((eed) hedVar).a;
                        lddVar.j = null;
                        lddVar.k = bz2Var;
                        lddVar.n = 2;
                    } else if (hedVar instanceof ded) {
                        lddVar.j = null;
                        lddVar.k = bz2Var;
                        lddVar.n = 3;
                    } else if (hedVar instanceof fed) {
                        lddVar.j = hedVar;
                        lddVar.k = bz2Var;
                        lddVar.n = 4;
                    } else {
                        if (!(hedVar instanceof ged)) {
                            b6e.s();
                            return null;
                        }
                        lddVar.j = hedVar;
                        lddVar.k = bz2Var;
                        lddVar.n = 5;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    bz2Var = lddVar.k;
                    qgg.h0(obj);
                    if (bz2Var != null) {
                        bz2Var.z();
                    }
                } else if (i == 2) {
                    bz2Var = lddVar.k;
                    qgg.h0(obj);
                    if (bz2Var != null) {
                        bz2Var.z();
                    }
                } else if (i == 3) {
                    bz2Var = lddVar.k;
                    qgg.h0(obj);
                    if (bz2Var != null) {
                        bz2Var.z();
                    }
                } else if (i == 4) {
                    bz2Var = lddVar.k;
                    hedVar = lddVar.j;
                    qgg.h0(obj);
                    if (bz2Var != null) {
                        shd shdVar = ((fed) hedVar).a;
                        j2n j2nVar = (j2n) bz2Var.c;
                        j2nVar.d();
                        new lum(j2nVar.a).Q(shdVar);
                    }
                } else {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bz2Var = lddVar.k;
                    hedVar = lddVar.j;
                    qgg.h0(obj);
                    if (bz2Var != null) {
                        RemoteQueueStartException remoteQueueStartException = ((ged) hedVar).a;
                        j2n j2nVar2 = (j2n) bz2Var.c;
                        j2nVar2.d();
                        new lum(j2nVar2.a).Q(remoteQueueStartException);
                    }
                }
                return Unit.a;
            }
        }
        lddVar = new ldd(oddVar, cg6Var);
        Object obj2 = lddVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lddVar.n;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static void c(odd oddVar, ced cedVar, boolean z, boolean z2, boolean z3, int i) {
        x97.y(oddVar.f, null, null, new fzb(new ddd(oddVar, cedVar, (i & 8) != 0 ? false : z2, z, (i & 16) != 0 ? false : z3, null), oddVar, (Continuation) null), 3);
    }

    public static /* synthetic */ Object f(odd oddVar, ced cedVar, boolean z, Continuation continuation, int i) {
        return oddVar.e(cedVar, z, false, (i & 8) == 0, false, continuation);
    }

    public final void b(boolean z) {
        rar rarVar = this.g;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.b.a(z, false);
        if (z) {
            return;
        }
        ced cedVar = this.l;
        String deviceId = cedVar != null ? cedVar.b.getDeviceId() : null;
        ked kedVar = this.c;
        kedVar.h = true;
        x97.y(kedVar.b, null, null, new d57(kedVar, new zya(9, kedVar, new String[]{deviceId}), continuation, 15), 3);
    }

    public final dgd d() {
        return (dgd) this.m.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(3:(2:3|(7:5|6|(1:(1:(14:10|11|12|13|14|15|16|(1:18)(1:29)|19|(1:21)|(1:23)(1:28)|24|25|26)(2:38|39))(1:40))(3:90|(1:92)|75)|41|42|43|(3:45|46|47)(22:48|49|50|(1:52)|53|54|(1:56)(1:80)|(1:79)(2:60|61)|62|(1:78)(1:66)|67|(2:(1:70)(1:77)|(3:73|(2:76|13)|75))|14|15|16|(0)(0)|19|(0)|(0)(0)|24|25|26)))|43|(0)(0))|93|6|(0)(0)|41|42|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0120, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0121, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0176 A[Catch: all -> 0x017c, TryCatch #4 {all -> 0x017c, blocks: (B:16:0x0170, B:18:0x0176, B:19:0x0183, B:21:0x0193, B:23:0x0198, B:28:0x01ad, B:29:0x017e), top: B:15:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0193 A[Catch: all -> 0x017c, TryCatch #4 {all -> 0x017c, blocks: (B:16:0x0170, B:18:0x0176, B:19:0x0183, B:21:0x0193, B:23:0x0198, B:28:0x01ad, B:29:0x017e), top: B:15:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0198 A[Catch: all -> 0x017c, TryCatch #4 {all -> 0x017c, blocks: (B:16:0x0170, B:18:0x0176, B:19:0x0183, B:21:0x0193, B:23:0x0198, B:28:0x01ad, B:29:0x017e), top: B:15:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ad A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #4 {all -> 0x017c, blocks: (B:16:0x0170, B:18:0x0176, B:19:0x0183, B:21:0x0193, B:23:0x0198, B:28:0x01ad, B:29:0x017e), top: B:15:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e A[Catch: all -> 0x017c, TryCatch #4 {all -> 0x017c, blocks: (B:16:0x0170, B:18:0x0176, B:19:0x0183, B:21:0x0193, B:23:0x0198, B:28:0x01ad, B:29:0x017e), top: B:15:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c A[Catch: all -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a2, blocks: (B:45:0x009c, B:56:0x00e2, B:58:0x00e8, B:60:0x00ee, B:64:0x00fb, B:66:0x00ff), top: B:43:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:42:0x0094, B:48:0x00a7, B:54:0x00db, B:62:0x00f7, B:67:0x0107, B:70:0x010d, B:73:0x012a, B:84:0x01ce, B:85:0x01d1, B:50:0x00cc, B:52:0x00d2, B:53:0x00d9), top: B:41:0x0094, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ced cedVar, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation) {
        mdd mddVar;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ced cedVar2;
        oqi oqiVar;
        int i2;
        oqi oqiVar2;
        Object obj;
        v68 v68Var;
        t1q t1qVar;
        vhd vhdVar;
        vhd vhdVar2;
        boolean z9;
        boolean z10;
        ced cedVar3;
        v68 v68Var2;
        boolean z11;
        xdr xdrVar;
        xdr xdrVar2;
        vhd vhdVar3;
        v68 v68Var3;
        t1q t1qVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        rar rarVar;
        try {
            if (continuation instanceof mdd) {
                mddVar = (mdd) continuation;
                int i3 = mddVar.v;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mddVar.v = i3 - Integer.MIN_VALUE;
                    Object obj2 = mddVar.t;
                    nm6 nm6Var = nm6.a;
                    i = mddVar.v;
                    if (i != 0) {
                        qgg.h0(obj2);
                        mddVar.j = cedVar;
                        qqi qqiVar = this.e;
                        mddVar.k = qqiVar;
                        z5 = z;
                        mddVar.o = z5;
                        z6 = z2;
                        mddVar.p = z6;
                        z7 = z3;
                        mddVar.q = z7;
                        z8 = z4;
                        mddVar.r = z8;
                        mddVar.s = 0;
                        mddVar.v = 1;
                        if (qqiVar.a(mddVar) != nm6Var) {
                            cedVar2 = cedVar;
                            oqiVar = qqiVar;
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z11 = mddVar.r;
                        z10 = mddVar.q;
                        z9 = mddVar.o;
                        vhdVar2 = mddVar.n;
                        t1qVar = mddVar.m;
                        v68Var2 = mddVar.l;
                        oqiVar2 = mddVar.k;
                        cedVar3 = mddVar.j;
                        try {
                            qgg.h0(obj2);
                            z8 = z11;
                            cedVar2 = cedVar3;
                            z7 = z10;
                            vhdVar = vhdVar2;
                            v68Var = v68Var2;
                            oqiVar = oqiVar2;
                            z5 = z9;
                            vhdVar3 = vhdVar;
                            v68Var3 = v68Var;
                            t1qVar2 = t1qVar;
                            z12 = z5;
                            z13 = z7;
                            z14 = z8;
                            oqiVar2 = oqiVar;
                        } catch (Throwable th) {
                            th = th;
                            obj = null;
                            oqiVar2.b(obj);
                            throw th;
                        }
                        try {
                            this.l = cedVar2;
                            xdr xdrVar3 = this.m;
                            Object cgdVar = cedVar2 != null ? new cgd(v68Var3, t1qVar2, vhdVar3, z12, z13, z14) : new bgd(cedVar2, z12);
                            xdrVar3.getClass();
                            xdrVar3.m(null, cgdVar);
                            rjq rjqVar = this.k;
                            rjqVar.g();
                            rarVar = this.h;
                            if (rarVar != null) {
                                rarVar.g(null);
                            }
                            if (cedVar2 != null) {
                                SharedPreferences.Editor edit = this.a.b().edit();
                                edit.putBoolean("LAST_KNOWN_STATION_HOLDING_ENABLED", false);
                                edit.apply();
                            } else {
                                ox6.B(ox6.K(cedVar2.s, 15000L), hld.s(rjqVar, dm6.b()), new t58(16, this, cedVar2));
                            }
                            oqiVar2.b(null);
                            return Unit.a;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = null;
                            oqiVar2.b(obj);
                            throw th;
                        }
                    }
                    i2 = mddVar.s;
                    boolean z15 = mddVar.r;
                    boolean z16 = mddVar.q;
                    boolean z17 = mddVar.p;
                    boolean z18 = mddVar.o;
                    oqiVar = mddVar.k;
                    cedVar2 = mddVar.j;
                    qgg.h0(obj2);
                    z8 = z15;
                    z5 = z18;
                    z7 = z16;
                    z6 = z17;
                    if (!Intrinsics.d(this.l, cedVar2)) {
                        Unit unit = Unit.a;
                        oqiVar.b(null);
                        return unit;
                    }
                    ssg.a(4, null, "connection transition: " + this.l + " -> " + cedVar2, null);
                    iz7 iz7Var = this.j;
                    ReentrantLock reentrantLock = (ReentrantLock) iz7Var.c;
                    reentrantLock.lock();
                    try {
                        rar rarVar2 = (rar) iz7Var.d;
                        if (rarVar2 != null) {
                            rarVar2.g(null);
                        }
                        iz7Var.d = null;
                        reentrantLock.unlock();
                        ced cedVar4 = this.l;
                        v68Var = cedVar4 != null ? cedVar4.b : null;
                        t1qVar = (cedVar4 == null || (xdrVar2 = cedVar4.r.k) == null) ? null : (t1q) xdrVar2.getValue();
                        ced cedVar5 = this.l;
                        vhdVar = (cedVar5 == null || (xdrVar = cedVar5.u) == null) ? null : (vhd) xdrVar.getValue();
                        ced cedVar6 = this.l;
                        if (cedVar6 != null) {
                            boolean z19 = cedVar2 != null ? !Intrinsics.d(cedVar2.b.getDeviceId(), cedVar6.b.getDeviceId()) : false;
                            if (z6 || z19) {
                                mddVar.j = cedVar2;
                                mddVar.k = oqiVar;
                                mddVar.l = v68Var;
                                mddVar.m = t1qVar;
                                mddVar.n = vhdVar;
                                mddVar.o = z5;
                                mddVar.p = z6;
                                mddVar.q = z7;
                                mddVar.r = z8;
                                mddVar.s = i2;
                                mddVar.v = 2;
                                mdg mdgVar = cedVar6.a;
                                mdk stopPayload = cedVar6.b().getPayloadFactory().getStopPayload();
                                stopPayload.getClass();
                                if (cedVar6.H(mdgVar, "pause", stopPayload, mddVar) != nm6Var) {
                                    vhdVar2 = vhdVar;
                                    z9 = z5;
                                    z10 = z7;
                                    oqiVar2 = oqiVar;
                                    cedVar3 = cedVar2;
                                    v68Var2 = v68Var;
                                    z11 = z8;
                                    z8 = z11;
                                    cedVar2 = cedVar3;
                                    z7 = z10;
                                    vhdVar = vhdVar2;
                                    v68Var = v68Var2;
                                    oqiVar = oqiVar2;
                                    z5 = z9;
                                }
                                return nm6Var;
                            }
                        }
                        vhdVar3 = vhdVar;
                        v68Var3 = v68Var;
                        t1qVar2 = t1qVar;
                        z12 = z5;
                        z13 = z7;
                        z14 = z8;
                        oqiVar2 = oqiVar;
                        this.l = cedVar2;
                        xdr xdrVar32 = this.m;
                        if (cedVar2 != null) {
                        }
                        xdrVar32.getClass();
                        xdrVar32.m(null, cgdVar);
                        rjq rjqVar2 = this.k;
                        rjqVar2.g();
                        rarVar = this.h;
                        if (rarVar != null) {
                        }
                        if (cedVar2 != null) {
                        }
                        oqiVar2.b(null);
                        return Unit.a;
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
            }
            if (!Intrinsics.d(this.l, cedVar2)) {
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
            oqiVar2 = oqiVar;
            oqiVar2.b(obj);
            throw th;
        }
        mddVar = new mdd(this, continuation);
        Object obj22 = mddVar.t;
        nm6 nm6Var2 = nm6.a;
        i = mddVar.v;
        if (i != 0) {
        }
    }

    public final void g() {
        rar rarVar = this.g;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.c.h = false;
        this.b.a(true, true);
        this.g = x97.y(this.f, null, null, new cdd(this, continuation, 2), 3);
    }
}

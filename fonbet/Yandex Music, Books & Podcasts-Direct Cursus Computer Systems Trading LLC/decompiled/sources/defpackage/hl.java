package defpackage;

import android.os.SystemClock;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class hl extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hl((il) this.l, continuation, 0);
            case 1:
                return new hl((hr) this.l, continuation, 1);
            case 2:
                return new hl((xz) this.l, continuation, 2);
            case 3:
                return new hl((qxp) this.l, continuation, 3);
            case 4:
                return new hl((osh) this.l, continuation, 4);
            case 5:
                return new hl((m11) this.l, continuation, 5);
            case 6:
                return new hl((b21) this.l, continuation, 6);
            case 7:
                return new hl((u41) this.l, continuation, 7);
            case 8:
                return new hl((c51) this.l, continuation, 8);
            case 9:
                return new hl((nb1) this.l, continuation, 9);
            case 10:
                return new hl((ld1) this.l, continuation, 10);
            case 11:
                return new hl((em1) this.l, continuation, 11);
            case 12:
                return new hl((gr1) this.l, continuation, 12);
            case 13:
                return new hl((fs1) this.l, continuation, 13);
            case 14:
                return new hl((kz1) this.l, continuation, 14);
            case 15:
                return new hl((uz1) this.l, continuation, 15);
            case 16:
                return new hl((t32) this.l, continuation, 16);
            case 17:
                return new hl((a42) this.l, continuation, 17);
            case 18:
                return new hl((za2) this.l, continuation, 18);
            case 19:
                return new hl((rf2) this.l, continuation, 19);
            case 20:
                return new hl((zf2) this.l, continuation, 20);
            case 21:
                return new hl((kh2) this.l, continuation, 21);
            case 22:
                return new hl((eno) this.l, continuation, 22);
            case 23:
                return new hl((qm2) this.l, continuation, 23);
            case 24:
                return new hl((t) this.l, continuation, 24);
            case 25:
                return new hl((z03) this.l, continuation, 25);
            case 26:
                return new hl((y93) this.l, continuation, 26);
            case 27:
                return new hl((ja3) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new hl((mkn) this.l, continuation, 28);
            default:
                return new hl((m64) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 2:
                ((hl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 25:
                ((hl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((hl) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x03d1, code lost:
    
        if (r15.emit(r2, r14) == r1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03b0, code lost:
    
        if (r15 == r1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r15.g(r0, r14) != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        if (defpackage.x97.V(r15, r2, r14) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013d, code lost:
    
        if (r15 == r1) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list;
        int i = 20;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = ((il) this.l).d;
                ll llVar = ll.a;
                xdrVar.getClass();
                xdrVar.m(null, llVar);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar2 = ((hr) this.l).f;
                kr krVar = kr.a;
                xdrVar2.getClass();
                xdrVar2.m(null, krVar);
                return Unit.a;
            case 2:
                xz xzVar = (xz) this.l;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = ((e10) xzVar.m.getValue()).v0;
                ri riVar = new ri(i3, xzVar);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, riVar, this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                l18 l18Var = l18.b;
                bdt I = hag.I(yr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                yr yrVar = (yr) qdcVar.C(I);
                String str = ((oq) ((qxp) this.l).a).a;
                this.k = 1;
                Object d = yrVar.d(str, this);
                return d == nm6Var4 ? nm6Var4 : d;
            case 4:
                osh oshVar = (osh) this.l;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    cx1 cx1Var = (cx1) oshVar.c;
                    this.k = 1;
                    obj = cx1Var.a(this);
                    if (obj == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ((AtomicBoolean) oshVar.b).set(false);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = ((m11) this.l).q;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar.emit(j0, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar3 = ((b21) this.l).g;
                e21 e21Var = e21.a;
                xdrVar3.getClass();
                xdrVar3.m(null, e21Var);
                return Unit.a;
            case 7:
                u41 u41Var = (u41) this.l;
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                ?? r12 = 0;
                r12 = 0;
                if (i12 == 0) {
                    qgg.h0(obj);
                    go1 go1Var = (go1) u41Var.m.getValue();
                    String str2 = u41Var.k;
                    Long a = u41Var.l.a();
                    String valueOf = a != null ? String.valueOf(a.longValue()) : null;
                    this.k = 1;
                    go1Var.getClass();
                    obj = x97.V(dm6.b, new k3(go1Var, str2, valueOf, (Continuation) r12, 19), this);
                    if (obj == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                k31 k31Var = (k31) jf0.F((rj6) obj);
                if (k31Var != null && (list = k31Var.b) != null) {
                    List<us5> list2 = list;
                    r12 = new ArrayList(v75.o(list2, 10));
                    for (us5 us5Var : list2) {
                        us5Var.getClass();
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(fw5.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        r12.add(new r21(us5Var, ((fw5) qdcVar2.C(I2)).b().a(us5Var)));
                    }
                }
                xdr xdrVar4 = u41Var.n;
                do {
                    value = xdrVar4.getValue();
                } while (!xdrVar4.k(value, (k31Var == null || r12 == 0 || r12.isEmpty()) ? q41.a : new r41(k31Var.a, r12, false)));
                return Unit.a;
            case 8:
                Object obj2 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    c51 c51Var = (c51) this.l;
                    this.k = 1;
                    Object Q = gld.Q(new b51(c51Var, continuation, i2), this);
                    Object obj3 = Q;
                    if (Q != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    dn9 dn9Var = ((nb1) this.l).k;
                    this.k = 1;
                    if (dn9Var.m(this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                Object obj4 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    ld1 ld1Var = (ld1) this.l;
                    this.k = 1;
                    Object Q2 = gld.Q(new ku(ld1Var, continuation, i3), this);
                    Object obj5 = Q2;
                    if (Q2 != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((em1) this.l).s;
                    String j02 = j66.j0();
                    this.k = 1;
                    if (j0qVar2.emit(j02, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    tfg tfgVar = ((gr1) this.l).a;
                    this.k = 1;
                    if (tfgVar.d(this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                fs1 fs1Var = (fs1) this.l;
                nm6 nm6Var12 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    yc4 s0 = zsd.s0(szf.s0(new k5(8, fs1Var)), new cs1(fs1Var, continuation, i2));
                    ds1 ds1Var = new ds1(i2, fs1Var);
                    this.k = 1;
                    if (s0.collect(ds1Var, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                kz1 kz1Var = (kz1) this.l;
                nm6 nm6Var13 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar5 = kz1Var.n;
                    Boolean bool = Boolean.TRUE;
                    xdrVar5.getClass();
                    xdrVar5.m(null, bool);
                    vxr vxrVar = (vxr) kz1Var.k.getValue();
                    this.k = 1;
                    obj = vxrVar.a(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar6 = kz1Var.n;
                        Boolean bool2 = Boolean.FALSE;
                        xdrVar6.getClass();
                        xdrVar6.m(null, bool2);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                txr txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar3 = kz1Var.o;
                    String j03 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar62 = kz1Var.n;
                Boolean bool22 = Boolean.FALSE;
                xdrVar62.getClass();
                xdrVar62.m(null, bool22);
                return Unit.a;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                fos fosVar = ((uz1) this.l).b;
                this.k = 1;
                Object a2 = fosVar.a(this);
                return a2 == nm6Var14 ? nm6Var14 : a2;
            case 16:
                nm6 nm6Var15 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                q12 q12Var = (q12) ((t32) this.l).q.getValue();
                this.k = 1;
                Object b = ((z22) ((c72) q12Var.a.getValue())).b(this);
                return b == nm6Var15 ? nm6Var15 : b;
            case 17:
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    long j = ((a42) this.l).c;
                    this.k = 1;
                    if (y2x.o(j, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                a42 a42Var = (a42) this.l;
                synchronized (a42Var.b) {
                    try {
                        if (SystemClock.uptimeMillis() - ((AtomicLong) a42Var.h).get() >= a42Var.c) {
                            if (((AtomicInteger) a42Var.g).get() == 0) {
                                v2d v2dVar = (v2d) a42Var.f;
                                if (v2dVar == null) {
                                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                                }
                                v2dVar.invoke();
                                rsr rsrVar = (rsr) a42Var.i;
                                if (rsrVar != null && rsrVar.isOpen()) {
                                    rsrVar.close();
                                }
                                a42Var.i = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
            case 18:
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                za2 za2Var = (za2) this.l;
                bb2 bb2Var = za2Var.c;
                String string = ((dd0) za2Var.j.getValue()).a.getString(R.string.android_auto_downloaded_tabs);
                string.getClass();
                this.k = 1;
                Object a3 = bb2Var.a(string, this);
                return a3 == nm6Var17 ? nm6Var17 : a3;
            case 19:
                nm6 nm6Var18 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdr xdrVar7 = ((ze2) ((rf2) this.l).k).b;
                lf2 lf2Var = new lf2(i3, i4, continuation);
                this.k = 1;
                Object h0 = zsd.h0(xdrVar7, lf2Var, this);
                return h0 == nm6Var18 ? nm6Var18 : h0;
            case 20:
                zf2 zf2Var = (zf2) this.l;
                nm6 nm6Var19 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0(new z50(zsd.d0(zf2Var.a, 1), i3), 1);
                    ri riVar2 = new ri(17, zf2Var);
                    this.k = 1;
                    if (H0.collect(riVar2, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i26 = this.k;
                if (i26 != 0) {
                    if (i26 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                bca bcaVar = new bca(((kh2) this.l).a.a.c(), 19);
                lf2 lf2Var2 = new lf2(i3, i3, continuation);
                this.k = 1;
                Object h02 = zsd.h0(bcaVar, lf2Var2, this);
                return h02 == nm6Var20 ? nm6Var20 : h02;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                eno enoVar = (eno) this.l;
                this.k = 1;
                Object g0 = zsd.g0(enoVar, this);
                return g0 == nm6Var21 ? nm6Var21 : g0;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    qm2 qm2Var = (qm2) this.l;
                    this.k = 1;
                    Object a4 = ((lnq) qm2Var.i.getValue()).a.a(qm2Var.f, true, this);
                    if (a4 != nm6Var22) {
                        a4 = Unit.a;
                    }
                    if (a4 == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                t tVar = (t) this.l;
                nm6 nm6Var23 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    rw2 a5 = px2.a();
                    this.k = 1;
                    obj = a5.d(tVar, this);
                    break;
                } else if (i29 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i29 != 2) {
                        if (i29 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rw2 a6 = px2.a();
                    this.k = 3;
                    break;
                }
                if (((Boolean) obj).booleanValue()) {
                    bsd b2 = dm6.b();
                    ox1 ox1Var = new ox1(tVar, continuation, 4);
                    this.k = 2;
                    break;
                }
                rw2 a62 = px2.a();
                this.k = 3;
            case 25:
                nm6 nm6Var24 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = z03.o;
                ri riVar3 = new ri(i, (z03) this.l);
                this.k = 1;
                x0qVar2.collect(riVar3, this);
                return nm6Var24;
            case 26:
                y93 y93Var = (y93) this.l;
                nm6 nm6Var25 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(new ez(y93Var.a.D, i));
                    u93 u93Var = new u93(y93Var, i2);
                    this.k = 1;
                    if (b0.collect(u93Var, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                ja3 ja3Var = (ja3) this.l;
                nm6 nm6Var26 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j0q j0qVar4 = ((ob3) ja3Var.j.getValue()).F;
                ri riVar4 = new ri(24, ja3Var);
                this.k = 1;
                j0qVar4.collect(riVar4, this);
                return nm6Var26;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var27 = nm6.a;
                int i33 = this.k;
                if (i33 != 0) {
                    if (i33 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mkn mknVar = (mkn) this.l;
                this.k = 1;
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                mknVar.z(new oz1(i4, zt3Var));
                zt3Var.u(new m40(18, mknVar));
                Object q = zt3Var.q();
                return q == nm6Var27 ? nm6Var27 : q;
            default:
                nm6 nm6Var28 = nm6.a;
                int i34 = this.k;
                if (i34 != 0) {
                    if (i34 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                m64 m64Var = (m64) this.l;
                xdr xdrVar8 = m64Var.b.c;
                i64 i64Var = new i64(i2, m64Var);
                this.k = 1;
                xdrVar8.collect(i64Var, this);
                return nm6Var28;
        }
    }
}

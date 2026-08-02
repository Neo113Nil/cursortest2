package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yandex.pulse.metrics.o;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import retrofit2.Call;
import ru.yandex.music.landing.skeleton.SkeletonScreenActivity;
import ru.yandex.music.share.ShareNetworkException;

/* loaded from: classes3.dex */
public final class glp extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glp(bal balVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = balVar;
        this.k = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new glp((llp) this.l, continuation, 0);
            case 1:
                return new glp((yvp) this.l, continuation, 1);
            case 2:
                return new glp((owp) this.l, continuation, 2);
            case 3:
                return new glp((w3q) this.l, continuation, 3);
            case 4:
                return new glp((y5q) this.l, this.k, continuation, 4);
            case 5:
                return new glp((z5q) this.l, this.k, continuation, 5);
            case 6:
                return new glp((e6q) this.l, continuation, 6);
            case 7:
                return new glp((s8q) this.l, continuation, 7);
            case 8:
                return new glp((npq) this.l, continuation, 8);
            case 9:
                return new glp((SkeletonScreenActivity) this.l, continuation, 9);
            case 10:
                return new glp((sfm) this.l, continuation, 10);
            case 11:
                return new glp((dyq) this.l, continuation, 11);
            case 12:
                return new glp((nyq) this.l, continuation, 12);
            case 13:
                return new glp((tnm) this.l, continuation, 13);
            case 14:
                return new glp((p4r) this.l, continuation, 14);
            case 15:
                return new glp((q7r) this.l, continuation, 15);
            case 16:
                return new glp((slr) this.l, continuation, 16);
            case 17:
                return new glp((toh) this.l, continuation, 17);
            case 18:
                return new glp((fpr) this.l, continuation, 18);
            case 19:
                return new glp((iur) this.l, continuation, 19);
            case 20:
                return new glp((ixr) this.l, continuation, 20);
            case 21:
                return new glp((y3s) this.l, continuation, 21);
            case 22:
                return new glp((y8s) this.l, continuation, 22);
            case 23:
                return new glp((i9s) this.l, continuation, 23);
            case 24:
                return new glp((kw6) this.l, continuation, 24);
            case 25:
                return new glp((z7g) this.l, continuation, 25);
            case 26:
                return new glp((r2f) this.l, continuation, 26);
            case 27:
                return new glp((lls) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new glp((fos) this.l, continuation, 28);
            default:
                return new glp((nrs) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 2:
                ((glp) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 3:
                ((glp) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((glp) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0329, code lost:
    
        if (defpackage.q7r.a(r9, r13, r12) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x031c, code lost:
    
        if (r13 == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0430, code lost:
    
        if (r9.b(r12) == r0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0412, code lost:
    
        if (r13 == r0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03f1, code lost:
    
        if (r13 == r0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03c8, code lost:
    
        if (defpackage.y2x.o(10000, r12) == r0) goto L231;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object G;
        int i = this.j;
        int i2 = 22;
        int i3 = 19;
        int i4 = 28;
        int i5 = 3;
        int i6 = 2;
        Object obj2 = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    llp llpVar = (llp) obj2;
                    ail ailVar = llpVar.d;
                    gfl gflVar = new gfl(i4, llpVar);
                    this.k = 1;
                    if (ailVar.collect(gflVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    yvp yvpVar = (yvp) obj2;
                    Function2 function2 = yvpVar.n;
                    jxp jxpVar = yvpVar.k.a;
                    this.k = 1;
                    if (function2.invoke(jxpVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    vdr c = ((owp) obj2).c.c();
                    z0i z0iVar = new z0i(i6, i2, continuation);
                    this.k = 1;
                    if (zsd.h0(c, z0iVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ugb ugbVar = ugb.a;
                throw new ShareNetworkException(0);
            case 3:
                w3q w3qVar = (w3q) obj2;
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    fkn fknVar = ((ezb) ((wyb) ((jyr) w3qVar.c).getValue())).d;
                    ryp rypVar = new ryp(i5, w3qVar);
                    this.k = 1;
                    if (fknVar.a.collect(rypVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                y5q y5qVar = (y5q) obj2;
                y5qVar.c(null, y5qVar.b.a(this.k));
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                return ((z5q) obj2).a.a(this.k);
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((e6q) obj2).a(this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                Object obj3 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    s8q s8qVar = (s8q) obj2;
                    nur nurVar = s8qVar.g.a;
                    this.k = 1;
                    y7u y7uVar = s8qVar.k;
                    qfn qfnVar = new qfn(y7uVar.b);
                    ybu D = f8g.D(y7uVar.d, y7uVar.e);
                    gxc gxcVar = y7uVar.c;
                    cr crVar = (cr) ((nnd) nurVar.c).b;
                    Object V = x97.V((a) crVar.g, new ggn(crVar, D, qfnVar, gxcVar, null), this);
                    Object obj4 = nm6.a;
                    if (V != obj4) {
                        V = Unit.a;
                    }
                    if (V != obj4) {
                        V = Unit.a;
                    }
                    if (V != obj3) {
                        V = Unit.a;
                    }
                    if (V != obj3) {
                        V = Unit.a;
                    }
                    if (V == obj3) {
                        return obj3;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                npq npqVar = (npq) obj2;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new jpq(npqVar, i6));
                    ryp rypVar2 = new ryp(14, npqVar);
                    this.k = 1;
                    if (s0.collect(rypVar2, this) == nm6Var8) {
                        return nm6Var8;
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
                SkeletonScreenActivity skeletonScreenActivity = (SkeletonScreenActivity) obj2;
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    fqq fqqVar = (fqq) skeletonScreenActivity.Y.getValue();
                    this.k = 1;
                    if (fqqVar.a(skeletonScreenActivity, this) == nm6Var9) {
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
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    sfm sfmVar = (sfm) obj2;
                    j0q j0qVar = ((pdp) sfmVar.a).c;
                    d7i d7iVar = new d7i(sfmVar, continuation, i3);
                    this.k = 1;
                    if (zsd.O(j0qVar, d7iVar, this) == nm6Var10) {
                        return nm6Var10;
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
                Object obj5 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    g22 g22Var = (g22) ((dyq) obj2).e.getValue();
                    this.k = 1;
                    j22 j22Var = (j22) g22Var;
                    Object a = lmm.a((wb7) j22Var.b.getValue(), new i22(j22Var, null), this);
                    if (a != obj5) {
                        a = Unit.a;
                    }
                    if (a == obj5) {
                        return obj5;
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
                nyq nyqVar = (nyq) obj2;
                nm6 nm6Var11 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartDownloadManager", "scheduleWorkAsync started", null);
                    this.k = 1;
                    break;
                } else if (i17 == 1) {
                    qgg.h0(obj);
                } else if (i17 == 2) {
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        ssg.a(3, "SmartDownloadManager", "skip schedule: smart downloading disabled", null);
                        return Unit.a;
                    }
                    frt frtVar = (frt) nyqVar.b.getValue();
                    this.k = 3;
                    obj = ixf.J(frtVar, this);
                    break;
                } else if (i17 == 3) {
                    qgg.h0(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        ssg.a(3, "SmartDownloadManager", "skip schedule: smart downloading unavailable for user", null);
                        return Unit.a;
                    }
                    ssg.a(3, "SmartDownloadManager", "scheduling background work", null);
                    this.k = 4;
                    break;
                } else {
                    if (i17 == 4) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yyq yyqVar = (yyq) nyqVar.e.getValue();
                this.k = 2;
                yyqVar.getClass();
                jyr jyrVar = dzq.f;
                if (!quk.f()) {
                    obj = Boolean.FALSE;
                    break;
                } else {
                    obj = ((z22) ((c72) yyqVar.b.getValue())).b(this);
                    break;
                }
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = (zi3) ((tnm) obj2).e;
                    if (zi3Var == null) {
                        return null;
                    }
                    this.k = 1;
                    G = zi3.G(zi3Var, this);
                    if (G == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    G = ((gd4) obj).a;
                }
                return (x3r) gd4.b(G);
            case 14:
                p4r p4rVar = (p4r) obj2;
                nm6 nm6Var13 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    long j = p4rVar.c;
                    this.k = 1;
                    if (y2x.o(j, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                p4rVar.a.queueEvent(new n4r(p4rVar, 1));
                return Unit.a;
            case 15:
                q7r q7rVar = (q7r) obj2;
                nm6 nm6Var14 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    long j2 = q7r.g;
                    d7i d7iVar2 = new d7i(q7rVar, continuation, 21);
                    this.k = 1;
                    obj = tyf.M(j2, d7iVar2, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Call call = (Call) obj;
                if (call != null) {
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 16:
                nm6 nm6Var15 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    l8j l8jVar = l8j.c;
                    d7i d7iVar3 = new d7i((slr) obj2, continuation, i2);
                    this.k = 1;
                    if (x97.V(l8jVar, d7iVar3, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                toh tohVar = (toh) obj2;
                nm6 nm6Var16 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar2 = (jyr) tohVar.c;
                    pjc C = zsd.C(zsd.M0(q6k.m(tohVar.b.c, new g5r(i4), q6k.g), new gv6(continuation, new u21(10, v3g.D((frt) jyrVar2.getValue()), ((j6m) ((d6m) ((jyr) tohVar.d).getValue())).j, new laq(i5, i6, continuation)), jyrVar2, 13)), 0);
                    ryp rypVar3 = new ryp(i3, tohVar);
                    this.k = 1;
                    if (C.collect(rypVar3, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var17 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = ((fpr) obj2).c(this);
                    if (obj == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Map map = (Map) obj;
                Object obj6 = map.get("type");
                if (Intrinsics.d(obj6, "connection_ack")) {
                    return Unit.a;
                }
                if (!Intrinsics.d(obj6, "connection_error")) {
                    System.out.println((Object) hrg.n(obj6, "unknown message while waiting for connection_ack: '"));
                    return Unit.a;
                }
                throw new hp0("Connection error:\n" + map, null);
            case 19:
                iur iurVar = (iur) obj2;
                nm6 nm6Var18 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    PointerInputEventHandler pointerInputEventHandler = iurVar.r;
                    this.k = 2;
                    if (pointerInputEventHandler.invoke(iurVar, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i24 != 1 && i24 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var19 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    vdr c2 = ((z66) ((ixr) obj2).a.e).c();
                    this.k = 1;
                    obj = zsd.g0(c2, this);
                    if (obj == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(((x66) obj).a);
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((y3s) obj2).u;
                    String j0 = j66.j0();
                    this.k = 1;
                    if (j0qVar2.emit(j0, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    y8s y8sVar = (y8s) obj2;
                    gug gugVar = y8sVar.a;
                    ryp rypVar4 = new ryp(25, y8sVar);
                    this.k = 1;
                    if (gugVar.collect(rypVar4, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((i9s) obj2).o(0L, this) == nm6Var22) {
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
                Object obj7 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    kw6 kw6Var = (kw6) obj2;
                    this.k = 1;
                    kw6Var.getClass();
                    Object Q = gld.Q(new nz5(kw6Var, continuation, 5), this);
                    if (Q != obj7) {
                        Q = Unit.a;
                    }
                    if (Q == obj7) {
                        return obj7;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var23 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                z7g z7gVar = (z7g) obj2;
                this.k = 1;
                z7gVar.getClass();
                z7gVar.a.a.collect(new lrf(i6, new gpi(), z7gVar), this);
                return nm6Var23;
            case 26:
                nm6 nm6Var24 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((r2f) obj2).j0(this) == nm6Var24) {
                        return nm6Var24;
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
                lls llsVar = (lls) obj2;
                nm6 nm6Var25 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    Bundle arguments = llsVar.getArguments();
                    Long valueOf = arguments != null ? Long.valueOf(arguments.getLong("DURATION_MILLIS")) : null;
                    if (valueOf == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    long longValue = valueOf.longValue();
                    this.k = 1;
                    if (y2x.o(longValue, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                View view = llsVar.getView();
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                llsVar.z();
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var26 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a2 = ((fos) obj2).a(this);
                    return a2 == nm6Var26 ? nm6Var26 : a2;
                }
                if (i33 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                nm6 nm6Var27 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = ((nrs) obj2).h;
                xdrVar.getClass();
                xdrVar.m(null, qrs.a);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ glp(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.e0;
import com.yandex.passport.common.logger.d;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.k;
import com.yandex.passport.internal.ui.bouncer.model.l1;
import com.yandex.passport.internal.ui.bouncer.model.m;
import com.yandex.passport.internal.ui.bouncer.model.middleware.s;
import com.yandex.passport.internal.ui.bouncer.model.middleware.u;
import com.yandex.passport.internal.ui.bouncer.model.o;
import com.yandex.passport.internal.ui.bouncer.model.r;
import com.yandex.passport.internal.usecase.ui.t;
import com.yandex.plus.analytics.dwh.internal.network.DwhEventsApi;
import com.yandex.plus.analytics.dwh.internal.network.dto.c;
import com.yandex.plus.analytics.dwh.internal.network.dto.f;
import com.yandex.plus.bdui.flex.utils.g;
import com.yandex.plus.bdui.q;
import com.yandex.plus.bdui.shared.b;
import com.yandex.plus.core.network.context.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class j0v extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0v(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                j0v j0vVar = new j0v((Continuation) obj3, (l0v) this.n, 0);
                j0vVar.l = (rjc) obj;
                j0vVar.m = obj2;
                return j0vVar.invokeSuspend(Unit.a);
            case 1:
                j0v j0vVar2 = new j0v((Continuation) obj3, (z6v) this.n, 1);
                j0vVar2.l = (rjc) obj;
                j0vVar2.m = obj2;
                return j0vVar2.invokeSuspend(Unit.a);
            case 2:
                j0v j0vVar3 = new j0v((Continuation) obj3, (yuv) this.n, 2);
                j0vVar3.l = (rjc) obj;
                j0vVar3.m = obj2;
                return j0vVar3.invokeSuspend(Unit.a);
            case 3:
                j0v j0vVar4 = new j0v((Continuation) obj3, (pjc) this.n, 3);
                j0vVar4.l = (rjc) obj;
                j0vVar4.m = obj2;
                return j0vVar4.invokeSuspend(Unit.a);
            case 4:
                j0v j0vVar5 = new j0v((Continuation) obj3, (afw) this.n, 4);
                j0vVar5.l = (rjc) obj;
                j0vVar5.m = obj2;
                return j0vVar5.invokeSuspend(Unit.a);
            case 5:
                j0v j0vVar6 = new j0v((Continuation) obj3, (bca) this.n, 5);
                j0vVar6.l = (rjc) obj;
                j0vVar6.m = obj2;
                return j0vVar6.invokeSuspend(Unit.a);
            case 6:
                j0v j0vVar7 = new j0v((Continuation) obj3, (ghw) this.n, 6);
                j0vVar7.l = (rjc) obj;
                j0vVar7.m = obj2;
                return j0vVar7.invokeSuspend(Unit.a);
            case 7:
                j0v j0vVar8 = new j0v((Continuation) obj3, (rlw) this.n, 7);
                j0vVar8.l = (rjc) obj;
                j0vVar8.m = obj2;
                return j0vVar8.invokeSuspend(Unit.a);
            case 8:
                j0v j0vVar9 = new j0v((Continuation) obj3, (aqw) this.n, 8);
                j0vVar9.l = (rjc) obj;
                j0vVar9.m = obj2;
                return j0vVar9.invokeSuspend(Unit.a);
            case 9:
                j0v j0vVar10 = new j0v((Continuation) obj3, (gqw) this.n, 9);
                j0vVar10.l = (rjc) obj;
                j0vVar10.m = obj2;
                return j0vVar10.invokeSuspend(Unit.a);
            case 10:
                j0v j0vVar11 = new j0v((Continuation) obj3, (mrw) this.n, 10);
                j0vVar11.l = (rjc) obj;
                j0vVar11.m = obj2;
                return j0vVar11.invokeSuspend(Unit.a);
            case 11:
                j0v j0vVar12 = new j0v((Continuation) obj3, (ysw) this.n, 11);
                j0vVar12.l = (rjc) obj;
                j0vVar12.m = obj2;
                return j0vVar12.invokeSuspend(Unit.a);
            case 12:
                j0v j0vVar13 = new j0v((s) this.n, (Continuation) obj3, 12);
                j0vVar13.l = (k) obj;
                j0vVar13.m = (l1) obj2;
                return j0vVar13.invokeSuspend(Unit.a);
            case 13:
                j0v j0vVar14 = new j0v((u) this.n, (Continuation) obj3, 13);
                j0vVar14.l = (m) obj;
                j0vVar14.m = (l1) obj2;
                return j0vVar14.invokeSuspend(Unit.a);
            case 14:
                j0v j0vVar15 = new j0v((String) this.m, (Map) this.n, (Continuation) obj3, 14);
                j0vVar15.l = (DwhEventsApi) obj2;
                return j0vVar15.invokeSuspend(Unit.a);
            case 15:
                j0v j0vVar16 = new j0v((g) this.n, (Continuation) obj3, 15);
                j0vVar16.l = (Set) obj;
                j0vVar16.m = (b) obj2;
                return j0vVar16.invokeSuspend(Unit.a);
            case 16:
                j0v j0vVar17 = new j0v((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.m, (ArrayList) this.n, (Continuation) obj3, 16);
                j0vVar17.l = (a) obj;
                return j0vVar17.invokeSuspend(Unit.a);
            case 17:
                j0v j0vVar18 = new j0v((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.n, (Continuation) obj3, 17);
                j0vVar18.l = (a) obj;
                j0vVar18.m = (Pair) obj2;
                return j0vVar18.invokeSuspend(Unit.a);
            case 18:
                j0v j0vVar19 = new j0v((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.n, (Continuation) obj3, 18);
                j0vVar19.l = (a) obj;
                j0vVar19.m = obj2;
                return j0vVar19.invokeSuspend(Unit.a);
            default:
                j0v j0vVar20 = new j0v((com.yandex.plus.core.network.retrofit.client.a) this.m, (ukn) this.n, (Continuation) obj3, 19);
                j0vVar20.l = (com.yandex.plus.core.network.request.b) obj2;
                return j0vVar20.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v56, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r4v61, types: [aur, pyc] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc fsVar;
        pjc u21Var;
        pjc fsVar2;
        pjc fsVar3;
        Object t7oVar;
        b1 b1Var;
        int i = 8;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    pjc a = ((Boolean) this.m).booleanValue() ? ((l0v) this.n).d.a() : new fs(15, yy1.e);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, a, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    pjc y4sVar = ((a7v) this.m).i ? new y4s(zsd.b0(new cla(y1g.L(((z6v) this.n).a.a), 14)), 28) : new fs(15, continuation);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, y4sVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = (rjc) this.l;
                    pjc c = ((Boolean) this.m).booleanValue() ? ((e15) ((iuv) ((yuv) this.n).e.getValue()).a.getValue()).c(3) : z4b.a;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, c, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar4 = (rjc) this.l;
                    lsw lswVar = (lsw) this.m;
                    pjc pjcVar = (pjc) this.n;
                    s2i s2iVar = new s2i();
                    lswVar.getClass();
                    pjcVar.getClass();
                    mc4 mc4Var = (mc4) lswVar.b;
                    mc4Var.getClass();
                    k3i k3iVar = ksw.a;
                    if (k3iVar == null) {
                        synchronized (ksw.class) {
                            try {
                                k3iVar = ksw.a;
                                if (k3iVar == null) {
                                    yk3 b = k3i.b();
                                    b.d = j3i.d;
                                    b.e = k3i.a("ynison_state.YnisonStateService", "PutYnisonState");
                                    b.a = true;
                                    d0 o = d0.o();
                                    z0c z0cVar = tym.a;
                                    b.b = new sym(o);
                                    b.c = new sym(e0.k());
                                    k3iVar = b.n();
                                    ksw.a = k3iVar;
                                }
                            } finally {
                            }
                        }
                    }
                    k3i k3iVar2 = k3iVar;
                    ks3 ks3Var = (ks3) lswVar.c;
                    ks3Var.getClass();
                    if (k3iVar2.a != j3i.d) {
                        l1j.m(k3iVar2, "Expected a bidi streaming method, but got ");
                        return null;
                    }
                    eno enoVar = new eno(new xg(mc4Var, k3iVar2, ks3Var, s2iVar, new bo4(pjcVar), (Continuation) null, 3));
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar4, enoVar, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar5 = (rjc) this.l;
                    if (((Boolean) this.m).booleanValue()) {
                        afw afwVar = (afw) this.n;
                        String str = afw.l;
                        qfw a2 = afwVar.a();
                        fsVar = zsd.b0(new xo2(zsd.M0(a2.F, new jfw(2, a2, continuation)), i));
                    } else {
                        fsVar = new fs(15, gfw.e);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar5, fsVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar6 = (rjc) this.l;
                    pjc pjcVar2 = ((sqw) this.m) == null ? (bca) this.n : z4b.a;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar6, pjcVar2, this) == nm6Var6) {
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
                    rjc rjcVar7 = (rjc) this.l;
                    Pair pair = (Pair) this.m;
                    clc clcVar = new clc(new l8v(((ghw) this.n).u, pair, 12), new y6v(pair, continuation, 29));
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar7, clcVar, this) == nm6Var7) {
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
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar8 = (rjc) this.l;
                    pjc pjcVar3 = ((Boolean) this.m).booleanValue() ? ((rlw) this.n).b.b.c : z4b.a;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar8, pjcVar3, this) == nm6Var8) {
                        return nm6Var8;
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
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar9 = (rjc) this.l;
                    daq daqVar = (daq) this.m;
                    if (daqVar == null) {
                        u21Var = z4b.a;
                    } else {
                        aqw aqwVar = (aqw) this.n;
                        u21Var = new u21(27, ((hiw) aqwVar.j.getValue()).a(daqVar), daqVar, aqwVar.g.b.a);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar9, u21Var, this) == nm6Var9) {
                        return nm6Var9;
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
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar10 = (rjc) this.l;
                    h7a a3 = ((hiw) ((gqw) this.n).i.getValue()).a((naq) this.m);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar10, a3, this) == nm6Var10) {
                        return nm6Var10;
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
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar11 = (rjc) this.l;
                    boolean booleanValue = ((Boolean) this.m).booleanValue();
                    mrw mrwVar = (mrw) this.n;
                    if (booleanValue) {
                        y4s D = v3g.D((frt) mrwVar.h.getValue());
                        pjc b0 = zsd.b0(new vpw(((fos) mrwVar.g.getValue()).b, i4));
                        vpw vpwVar = new vpw(((z66) mrwVar.i.getValue()).c(), i2);
                        xdr xdrVar = mrwVar.b().a;
                        hew hewVar = (hew) mrwVar.k.getValue();
                        Context context = (Context) mrwVar.d.getValue();
                        hewVar.getClass();
                        context.getClass();
                        if (Build.VERSION.SDK_INT >= 31) {
                            int i16 = 10;
                            fsVar3 = zsd.P(zsd.b0(new clc(jf0.z(new e7v(frc.a.g, 22), new d9w(i16)), new k5u(i2, i3, continuation))), zsd.b0(new clc(jf0.z((pjc) hewVar.b.getValue(), new d9w(i16)), new k5u(2, i3, continuation))), (pjc) hewVar.a.getValue(), ((odd) hewVar.c.getValue()).m, new av6(context, continuation, 1));
                        } else {
                            fsVar3 = new fs(15, Boolean.TRUE);
                        }
                        int i17 = 3;
                        pjc b02 = zsd.b0(new vpw(((v3i) mrwVar.l.getValue()).b, i17));
                        pjc b03 = zsd.b0(new kp2(D, i17));
                        xdr xdrVar2 = fzk.e;
                        int i18 = 4;
                        pjc b04 = zsd.b0(new kp2(D, i18));
                        jyr jyrVar = p6m.f;
                        pjc b05 = o6m.e() ? zsd.b0(new vpw(((j6m) ((d6m) mrwVar.m.getValue())).j, i18)) : new fs(15, Boolean.TRUE);
                        hrw hrwVar = new hrw(null);
                        xdrVar.getClass();
                        xdrVar2.getClass();
                        fsVar2 = new ub7(18, new pjc[]{b03, b04, b0, vpwVar, xdrVar, fsVar3, b02, b05, xdrVar2}, hrwVar);
                    } else {
                        fsVar2 = new fs(15, mrwVar.a());
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar11, fsVar2, this) == nm6Var11) {
                        return nm6Var11;
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
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar12 = (rjc) this.l;
                    pjc b2 = ((ysw) this.n).c.b((sqw) this.m);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar12, b2, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                k kVar = (k) this.l;
                l1 l1Var = (l1) this.m;
                nm6 nm6Var13 = nm6.a;
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
                s sVar = (s) this.n;
                this.l = null;
                this.m = null;
                this.k = 1;
                Object b3 = s.b(sVar, kVar, l1Var, this);
                return b3 == nm6Var13 ? nm6Var13 : b3;
            case 13:
                m mVar = (m) this.l;
                l1 l1Var2 = (l1) this.m;
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                try {
                    if (i21 == 0) {
                        qgg.h0(obj);
                        u uVar = (u) this.n;
                        r7o r7oVar = z7o.b;
                        t tVar = uVar.a;
                        l lVar = mVar.a;
                        this.l = null;
                        this.m = l1Var2;
                        this.k = 1;
                        if (tVar.g(lVar, this) == nm6Var14) {
                            return nm6Var14;
                        }
                    } else {
                        if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    b1Var = l1Var2.d;
                } catch (wis e) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(e);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (b1Var == null) {
                    throw new IllegalStateException("loginProperties is missing");
                }
                t7oVar = new r(b1Var.a);
                r7o r7oVar4 = z7o.b;
                Throwable a4 = z7o.a(t7oVar);
                if (a4 != null) {
                    d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error deleting account", a4);
                    }
                    t7oVar = new o("DeleteAccountActor", "Error deleting account", a4);
                }
                return t7oVar;
            case 14:
                DwhEventsApi dwhEventsApi = (DwhEventsApi) this.l;
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    String str2 = (String) this.m;
                    Map map = (Map) this.n;
                    if (map == null) {
                        map = e5b.a;
                        map.getClass();
                    }
                    f fVar = new f(t75.c(new c(str2, map)));
                    this.l = null;
                    this.k = 1;
                    if (dwhEventsApi.a(fVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                Set set = (Set) this.l;
                b bVar = (b) this.m;
                nm6 nm6Var16 = nm6.a;
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
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = ((g) this.n).b;
                this.l = null;
                this.m = null;
                this.k = 1;
                Serializable e3 = com.yandex.plus.bdui.plus.content.controller.f.e(fVar2, set, bVar, 3000L, this);
                return e3 == nm6Var16 ? nm6Var16 : e3;
            case 16:
                a aVar = (a) this.l;
                nm6 nm6Var17 = nm6.a;
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
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.m;
                ArrayList arrayList = (ArrayList) this.n;
                this.l = null;
                this.k = 1;
                Object a5 = com.yandex.plus.home.plaque.feature.internal.presentation.b.a(bVar2, aVar, arrayList, this);
                return a5 == nm6Var17 ? nm6Var17 : a5;
            case 17:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar3 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.n;
                a aVar2 = (a) this.l;
                Pair pair2 = (Pair) this.m;
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                com.yandex.plus.bdui.plus.content.controller.f fVar3 = (com.yandex.plus.bdui.plus.content.controller.f) bVar3.b;
                q qVar = new q(2, (com.yandex.plus.core.network.error.b) bVar3.f, com.yandex.plus.core.network.error.b.class, "adapt", "adapt(Ljava/lang/Throwable;Lcom/yandex/plus/core/network/error/NetworkException$ErrorType;)Lcom/yandex/plus/core/network/error/NetworkException;", 0, 16);
                this.l = null;
                this.m = null;
                this.k = 1;
                Object z = com.yandex.plus.bdui.plus.analytics.b.z(new com.yandex.plus.bdui.templating.render.a(qVar, (com.yandex.plus.core.network.error.k) fVar3.c), new aa0((pyc) fVar3.b, aVar2, (Object) pair2, (Continuation) null), this);
                return z == nm6Var18 ? nm6Var18 : z;
            case 18:
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar4 = (com.yandex.plus.home.plaque.feature.internal.presentation.b) this.n;
                a aVar3 = (a) this.l;
                Object obj2 = this.m;
                nm6 nm6Var19 = nm6.a;
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
                com.yandex.plus.bdui.plus.content.controller.f fVar4 = (com.yandex.plus.bdui.plus.content.controller.f) bVar4.c;
                q qVar2 = new q(2, (com.yandex.plus.core.network.error.b) bVar4.f, com.yandex.plus.core.network.error.b.class, "adapt", "adapt(Ljava/lang/Throwable;Lcom/yandex/plus/core/network/error/NetworkException$ErrorType;)Lcom/yandex/plus/core/network/error/NetworkException;", 0, 17);
                this.l = null;
                this.m = null;
                this.k = 1;
                Object z2 = com.yandex.plus.bdui.plus.analytics.b.z(new com.yandex.plus.bdui.templating.render.a(qVar2, (com.yandex.plus.core.network.error.k) fVar4.c), new aa0((pyc) fVar4.b, aVar3, obj2, (Continuation) null), this);
                return z2 == nm6Var19 ? nm6Var19 : z2;
            default:
                com.yandex.plus.core.network.request.b bVar5 = (com.yandex.plus.core.network.request.b) this.l;
                nm6 nm6Var20 = nm6.a;
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
                com.yandex.plus.core.network.okhttp.client.c cVar = new com.yandex.plus.core.network.okhttp.client.c((com.yandex.plus.core.network.retrofit.client.a) this.m, 1);
                ck0 ck0Var = new ck0(bVar5, (ukn) this.n, continuation, i);
                this.l = null;
                this.k = 1;
                Object z3 = com.yandex.plus.bdui.plus.analytics.b.z(cVar, ck0Var, this);
                return z3 == nm6Var20 ? nm6Var20 : z3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0v(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0v(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
    }
}

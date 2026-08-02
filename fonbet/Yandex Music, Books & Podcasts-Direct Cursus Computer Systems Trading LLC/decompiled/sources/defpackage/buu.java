package defpackage;

import com.yandex.plus.adapter.auth.api.g;
import com.yandex.plus.bdui.flex.ui.a;
import com.yandex.plus.bdui.plus.auth.d;
import com.yandex.plus.bdui.plus.auth.e;
import com.yandex.plus.domain.auth.api.b;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.internal.di.l;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class buu extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ buu(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new buu((fk0) this.l, continuation, 0);
            case 1:
                return new buu((ou7) this.l, continuation, 1);
            case 2:
                return new buu((v8v) this.l, continuation, 2);
            case 3:
                return new buu((giv) this.l, continuation, 3);
            case 4:
                return new buu((hv0) this.l, continuation, 4);
            case 5:
                return new buu((l) this.l, continuation, 5);
            case 6:
                return new buu((u) this.l, continuation, 6);
            case 7:
                return new buu((i) this.l, continuation, 7);
            case 8:
                return new buu((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u) this.l, continuation, 8);
            default:
                return new buu((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i) this.l, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((buu) create(continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0231, code lost:
    
        if (defpackage.fk0.c((defpackage.fk0) r3, r8, r9, null, r13, 12) == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0211, code lost:
    
        if (((defpackage.fk0) r3).f(r1, r13) == r0) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        t7o t7oVar;
        Object f;
        int i = this.j;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Float f2 = new Float(0.0f);
                    this.k = 1;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Float f3 = new Float(2.5f);
                act S = weo.S(2500, 0, nya.d, 2);
                this.k = 2;
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object s = ((ou7) obj2).s(this);
                    return s == nm6Var2 ? nm6Var2 : s;
                }
                if (i3 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    pjc g = ((v8v) obj2).a.g();
                    this.k = 1;
                    obj = zsd.i0(g, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxq xxqVar = (xxq) obj;
                if (xxqVar != null) {
                    return xxqVar.a;
                }
                return null;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    pjc g2 = ((giv) obj2).a.g();
                    this.k = 1;
                    obj = zsd.i0(g2, this);
                    if (obj == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xxq xxqVar2 = (xxq) obj;
                if (xxqVar2 != null) {
                    return xxqVar2.a;
                }
                return null;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke = ((hv0) obj2).invoke(this);
                    return invoke == nm6Var5 ? nm6Var5 : invoke;
                }
                if (i6 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.domain.auth.impl.i iVar = ((l) obj2).a.w;
                    if (!(iVar.h.getValue() instanceof b)) {
                        iVar = null;
                    }
                    if (iVar == null) {
                        return null;
                    }
                    this.k = 1;
                    b = iVar.b(this);
                    if (b == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                return (String) (b instanceof t7o ? null : b);
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                try {
                    if (i8 == 0) {
                        qgg.h0(obj);
                        u uVar = (u) obj2;
                        r7o r7oVar2 = z7o.b;
                        com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b bVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.b) uVar.e.j.getValue();
                        this.k = 1;
                        obj = bVar.b(this);
                        if (obj == nm6Var7) {
                            return nm6Var7;
                        }
                    } else {
                        if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar3 = z7o.b;
                } catch (wis e) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(e);
                    obj = t7oVar;
                    if (obj instanceof t7o) {
                    }
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar = new t7o(th);
                    obj = t7oVar;
                    if (obj instanceof t7o) {
                    }
                }
                if (obj instanceof t7o) {
                    return null;
                }
                return obj;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    buu buuVar = ((i) obj2).a().G;
                    this.k = 1;
                    obj = buuVar.invoke(this);
                    if (obj == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                if (plusPayGoogleBillingConfig != null) {
                    return plusPayGoogleBillingConfig.getGoogleCountryCode();
                }
                return null;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u uVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u) obj2;
                    com.yandex.plus.domain.auth.impl.i iVar2 = uVar2.G;
                    g c = a.c((com.yandex.plus.ui.core.theme.a) ((com.yandex.plus.pay.ui.design.plus.api.a) uVar2.s).a.a.getValue());
                    this.k = 1;
                    f = iVar2.f(c, this);
                    if (f == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    f = ((z7o) obj).a;
                }
                Throwable a = z7o.a(f);
                if (a != null) {
                    return new d(a);
                }
                b bVar2 = (b) f;
                return new e(bVar2.a, bVar2.b, bVar2.d);
            default:
                nm6 nm6Var10 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.e eVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.e) ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.i) obj2).v).f.getValue();
                    this.k = 1;
                    obj = eVar.a.b(this);
                    if (obj == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                PlusPayGoogleBillingConfig plusPayGoogleBillingConfig2 = (PlusPayGoogleBillingConfig) obj;
                if (plusPayGoogleBillingConfig2 != null) {
                    return plusPayGoogleBillingConfig2.getGoogleCountryCode();
                }
                return null;
        }
    }
}

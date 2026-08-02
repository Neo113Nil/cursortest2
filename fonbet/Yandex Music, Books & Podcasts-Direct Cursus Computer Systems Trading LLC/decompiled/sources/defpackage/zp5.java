package defpackage;

import android.view.View;
import com.yandex.passport.data.network.l;
import com.yandex.plus.home.dailyquests.feature.internal.utils.a;
import com.yandex.plus.home.dailyquests.feature.internal.utils.e;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class zp5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public float l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp5(l lVar, View view, float f, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.m = lVar;
        this.n = view;
        this.l = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zp5((fk0) this.m, this.l, (osa) this.n, continuation, 0);
            case 1:
                return new zp5((fvf) this.m, this.l, (poi) this.n, continuation, 1);
            case 2:
                return new zp5((yk3) this.m, this.l, (tm0) this.n, continuation, 2);
            case 3:
                zp5 zp5Var = new zp5((d8t) this.n, continuation);
                zp5Var.m = obj;
                return zp5Var;
            case 4:
                return new zp5((fk0) this.m, this.l, (uf7) this.n, continuation, 4);
            case 5:
                return new zp5((fuw) this.m, this.l, (b9r) this.n, continuation, 5);
            default:
                return new zp5((l) this.m, (View) this.n, this.l, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zp5) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var;
        float D;
        int i = this.j;
        int i2 = 2;
        Object obj2 = this.n;
        int i3 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (fk0.c((fk0) this.m, new Float(this.l), (osa) obj2, null, this, 12) == nm6Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new o24((fvf) this.m, this.l, i3));
                    ot4 ot4Var = new ot4((poi) obj2, 2);
                    this.k = 1;
                    if (s0.collect(ot4Var, this) == nm6Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (fk0.c((fk0) ((yk3) this.m).c, new Float(this.l), (tm0) obj2, null, this, 12) == nm6Var3) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.m;
                    mm6Var = mm6Var2;
                    D = v5g.D(mm6Var2.getCoroutineContext());
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    D = this.l;
                    mm6Var = (mm6) this.m;
                    qgg.h0(obj);
                }
                while (gld.T(mm6Var)) {
                    was wasVar = new was((d8t) obj2, D);
                    this.m = mm6Var;
                    this.l = D;
                    this.k = 1;
                    if (bzf.D(getContext()).P(wasVar, this) == nm6Var4) {
                        break;
                    }
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) this.m;
                    Float f = new Float((-this.l) * 0.5f);
                    this.k = 1;
                    Object e = fk0Var.e();
                    oct octVar = fk0Var.a;
                    if (nqi.a(fk0Var.h, new bk0(fk0Var, f, new tf7((uf7) obj2, octVar, e, (cn0) octVar.a.invoke(f)), fk0Var.c.d, null, null), this) == nm6Var5) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (fk0.c(((fuw) this.m).d, new Float(this.l), (b9r) obj2, null, this, 12) == nm6Var6) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    View view = (View) obj2;
                    float f2 = this.l;
                    this.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    e eVar = new e(f2, zt3Var.e, new a(i2, view, zt3Var));
                    view.addOnAttachStateChangeListener(eVar);
                    WeakHashMap weakHashMap = wdu.a;
                    if (view.isAttachedToWindow()) {
                        eVar.onViewAttachedToWindow(view);
                    }
                    zt3Var.u(new a(i3, view, eVar));
                    Object q = zt3Var.q();
                    if (q != nm6Var7) {
                        q = Unit.a;
                    }
                    if (q == nm6Var7) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp5(d8t d8tVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.n = d8tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp5(Object obj, float f, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = f;
        this.n = obj2;
    }
}

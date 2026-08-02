package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class t1e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ u1e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1e(u1e u1eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = u1eVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new t1e(this.l, continuation, 0);
            case 1:
                return new t1e(this.l, continuation, 1);
            case 2:
                return new t1e(this.l, continuation, 2);
            default:
                return new t1e(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((t1e) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        u1e u1eVar = this.l;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(1000L, this) == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ekf ekfVar = u1eVar.D;
                StationId a = u1eVar.x.a();
                if (a == null) {
                    break;
                } else {
                    ekfVar.a(a.h(), wre.b, true, ah.h);
                    break;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                rar rarVar = u1eVar.J;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    if (!((lwc) u1eVar.o.getValue()).a()) {
                        break;
                    } else {
                        s2e s2eVar = u1eVar.C;
                        if (s2eVar != null) {
                            int i6 = 4;
                            pjc b0 = zsd.b0(new ifd(s2eVar.q, i6));
                            m1e m1eVar = new m1e(u1eVar, i6);
                            this.k = 1;
                            if (b0.collect(m1eVar, this) == nm6Var3) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    s9f[] s9fVarArr = u1e.N;
                    cmf cmfVar = (cmf) u1eVar.l.getValue();
                    this.k = 1;
                    cmfVar.getClass();
                    obj = x97.V(dm6.b, new amf(cmfVar, continuation, i2), this);
                    if (obj == nm6Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    x1e x1eVar = u1eVar.a;
                    x97.y(x1eVar.e, null, null, new jmd(x1eVar, continuation, i2), 3);
                }
                break;
        }
        return Unit.a;
    }
}

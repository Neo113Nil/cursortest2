package defpackage;

import com.yandex.plus.webview.api.contract.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class mxr extends aur implements pyc {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxr(nxr nxrVar, Continuation continuation) {
        super(3, continuation);
        this.l = nxrVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                return new mxr((nxr) this.l, (Continuation) obj3).invokeSuspend(Unit.a);
            default:
                mxr mxrVar = new mxr(3, (Continuation) obj3);
                mxrVar.l = (d) obj2;
                return mxrVar.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = ((nxr) this.l).k;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar.emit(unit, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                d dVar = (d) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.l = null;
                this.k = 1;
                Object l = dVar.l(this);
                return l == nm6Var2 ? nm6Var2 : l;
        }
    }

    public /* synthetic */ mxr(int i, Continuation continuation) {
        super(i, continuation);
    }
}

package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w5w extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ y5w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5w(y5w y5wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = y5wVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new w5w(this.l, continuation, 0);
            default:
                return new w5w(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((w5w) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    AndroidComposeView androidComposeView = this.l.a;
                    this.k = 1;
                    Object l = androidComposeView.p.l(this);
                    if (l != nm6Var) {
                        l = Unit.a;
                    }
                    if (l == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    AndroidComposeView androidComposeView2 = this.l.a;
                    this.k = 1;
                    Object c = androidComposeView2.q.c(this);
                    if (c != nm6Var2) {
                        c = Unit.a;
                    }
                    if (c == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}

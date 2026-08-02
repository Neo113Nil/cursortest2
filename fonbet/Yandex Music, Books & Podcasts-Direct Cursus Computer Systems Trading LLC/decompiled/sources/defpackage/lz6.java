package defpackage;

import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.c0;
import com.yandex.passport.internal.ui.challenge.logout.d;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lz6 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz6(Continuation continuation, Function1 function1, int i) {
        super(2, continuation);
        this.j = i;
        this.l = function1;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                lz6 lz6Var = new lz6(continuation, this.l, 0);
                lz6Var.k = obj;
                return lz6Var;
            case 1:
                lz6 lz6Var2 = new lz6(continuation, this.l, 1);
                lz6Var2.k = obj;
                return lz6Var2;
            case 2:
                lz6 lz6Var3 = new lz6(this.l, continuation, 2);
                lz6Var3.k = obj;
                return lz6Var3;
            case 3:
                lz6 lz6Var4 = new lz6(this.l, continuation, 3);
                lz6Var4.k = obj;
                return lz6Var4;
            case 4:
                lz6 lz6Var5 = new lz6(this.l, continuation, 4);
                lz6Var5.k = obj;
                return lz6Var5;
            default:
                lz6 lz6Var6 = new lz6(this.l, continuation, 5);
                lz6Var6.k = obj;
                return lz6Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((lz6) create((t9k) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((lz6) create((t9k) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((lz6) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((lz6) create((c0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((lz6) create((b1) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((lz6) create((h0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Function1 function1 = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                t9k t9kVar = (t9k) this.k;
                t9kVar.getClass();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                t9k t9kVar2 = (t9k) this.k;
                t9kVar2.getClass();
                break;
            case 2:
                hmm hmmVar = (hmm) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                lpi b = hmmVar.b();
                function1.invoke(b);
                break;
            case 3:
                c0 c0Var = (c0) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (!Intrinsics.d(c0Var, c0.a)) {
                    b6e.s();
                    break;
                } else {
                    function1.invoke(d.b);
                    break;
                }
            case 4:
                b1 b1Var = (b1) this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                function1.invoke(b1Var);
                break;
            default:
                h0 h0Var = (h0) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                function1.invoke(h0Var);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz6(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = function1;
    }
}

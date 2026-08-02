package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jwo extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public /* synthetic */ Object k;
    public final /* synthetic */ float l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(float f, nvr nvrVar, Continuation continuation) {
        super(2, continuation);
        this.l = f;
        this.m = nvrVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                jwo jwoVar = new jwo((uqn) this.m, this.l, continuation);
                jwoVar.k = obj;
                return jwoVar;
            default:
                jwo jwoVar2 = new jwo(this.l, (nvr) this.m, continuation);
                jwoVar2.k = obj;
                return jwoVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((jwo) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((jwo) create((fa0) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        float f = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((uqn) obj2).a = ((rwo) this.k).a(f);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((fa0) this.k).a(f - ((nvr) obj2).g.e());
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(uqn uqnVar, float f, Continuation continuation) {
        super(2, continuation);
        this.m = uqnVar;
        this.l = f;
    }
}

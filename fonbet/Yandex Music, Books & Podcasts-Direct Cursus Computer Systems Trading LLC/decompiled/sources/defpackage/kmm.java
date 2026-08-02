package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhmm;", "it", "<anonymous>", "(Lhmm;)Lhmm;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class kmm extends aur implements Function2<hmm, Continuation<? super hmm>, Object> {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ aur l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kmm(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.l = (aur) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        kmm kmmVar = new kmm(this.l, continuation);
        kmmVar.k = obj;
        return kmmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kmm) create((hmm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            lpi b = ((hmm) this.k).b();
            this.k = b;
            this.j = 1;
            return this.l.invoke(b, this) == nm6Var ? nm6Var : b;
        }
        if (i != 1) {
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        lpi lpiVar = (lpi) this.k;
        qgg.h0(obj);
        return lpiVar;
    }
}

package defpackage;

import com.yandex.urbanads.internal.network.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class tir implements ru00 {
    public final /* synthetic */ uir a;
    public final /* synthetic */ me0 b;

    public tir(uir uirVar, me0 me0Var) {
        this.a = uirVar;
        this.b = me0Var;
    }

    @Override // defpackage.ru00
    public final Object getHeaders(Continuation continuation) {
        uir uirVar = this.a;
        return new b(uirVar.a, uirVar.d, uirVar.c, uirVar.e, this.b, uirVar.g).a((ContinuationImpl) continuation);
    }
}

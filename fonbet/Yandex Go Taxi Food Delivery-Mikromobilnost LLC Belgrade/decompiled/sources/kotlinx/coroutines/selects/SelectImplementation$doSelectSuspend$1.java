package kotlinx.coroutines.selects;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.player.ui.debug.internal.providers.SessionColorProviderImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {SessionColorProviderImpl.SHORT_SESSION_MAX_STALLED_LENGTH_MS_YELLOW_BOUND, 453}, m = "doSelectSuspend", v = 1)
/* loaded from: classes9.dex */
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(this);
    }
}

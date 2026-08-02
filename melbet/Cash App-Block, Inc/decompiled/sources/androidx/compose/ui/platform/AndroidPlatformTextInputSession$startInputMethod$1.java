package androidx.compose.ui.platform;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.startInputMethod(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}

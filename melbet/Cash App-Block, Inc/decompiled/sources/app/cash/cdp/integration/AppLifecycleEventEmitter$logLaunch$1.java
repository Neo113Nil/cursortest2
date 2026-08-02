package app.cash.cdp.integration;

import android.util.DisplayMetrics;
import com.squareup.cash.cdf.app.AppLifecycleLaunch;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppLifecycleEventEmitter$logLaunch$1 extends ContinuationImpl {
    public DisplayMetrics L$0;
    public String L$1;
    public AppLifecycleLaunch.UserInterfaceStyle L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppLifecycleEventEmitter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleEventEmitter$logLaunch$1(AppLifecycleEventEmitter appLifecycleEventEmitter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appLifecycleEventEmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AppLifecycleEventEmitter.access$logLaunch(this.this$0, this);
    }
}

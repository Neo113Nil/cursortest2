package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.text.input.TextInputService;
import androidx.datastore.core.SimpleActor;
import app.cash.molecule.GatedFrameClock;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements CoroutineScope {
    public final CoroutineScope coroutineScope;
    public final AtomicReference methodSessionMutex = new AtomicReference(null);
    public final TextInputService textInputService;
    public final View view;

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, CoroutineScope coroutineScope) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = coroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startInputMethod(PlatformTextInputMethodRequest platformTextInputMethodRequest, ContinuationImpl continuationImpl) {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        int i;
        if (continuationImpl instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) continuationImpl;
            int i2 = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidPlatformTextInputSession$startInputMethod$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SimpleActor.AnonymousClass1 anonymousClass1 = new SimpleActor.AnonymousClass1(5, platformTextInputMethodRequest, this);
                    Continuation continuation = null;
                    GatedFrameClock.AnonymousClass1 anonymousClass12 = new GatedFrameClock.AnonymousClass1(this, continuation, 8);
                    androidPlatformTextInputSession$startInputMethod$1.label = 1;
                    if (JobKt.coroutineScope(new FlowQuery$asFlow$1(anonymousClass1, this.methodSessionMutex, anonymousClass12, continuation, 1), androidPlatformTextInputSession$startInputMethod$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
        Object obj2 = androidPlatformTextInputSession$startInputMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }
}

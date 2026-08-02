package com.bugsnag.android;

import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class BugsnagExitInfoPlugin$configureEventSynthesizer$2 extends Lambda implements Function0 {
    public final /* synthetic */ Object $exitInfoPluginStore;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $traceEventEnhancer;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BugsnagExitInfoPlugin$configureEventSynthesizer$2(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$exitInfoPluginStore = obj2;
        this.$traceEventEnhancer = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.$traceEventEnhancer;
        Object obj2 = this.$exitInfoPluginStore;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                BugsnagExitInfoPlugin.access$synthesizeNewEventsIfRequired((BugsnagExitInfoPlugin) obj3, (ComponentRegistry.Builder) obj2, (TraceEventEnhancer) obj);
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj3;
                abstractComposeView.removeOnAttachStateChangeListener((AndroidGraphicsContext.AnonymousClass2) obj2);
                Countries.getPoolingContainerListenerHolder(abstractComposeView).listeners.remove((ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}

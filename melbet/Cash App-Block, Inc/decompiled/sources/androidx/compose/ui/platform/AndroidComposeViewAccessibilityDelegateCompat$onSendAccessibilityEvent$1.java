package androidx.compose.ui.platform;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import coil3.ImageLoader$Builder;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
        switch (i) {
            case 0:
                View view = androidComposeViewAccessibilityDelegateCompat.view;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                ScrollObservationScope scrollObservationScope = (ScrollObservationScope) obj;
                if (scrollObservationScope.isValidOwnerScope()) {
                    ImageLoader$Builder imageLoader$Builder = androidComposeViewAccessibilityDelegateCompat.view.snapshotObserver;
                    ((SnapshotStateObserver) imageLoader$Builder.application).observeReads(scrollObservationScope, androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeededLambda, new ViewRegistryKt$buildView$1$2$1$1(5, scrollObservationScope, androidComposeViewAccessibilityDelegateCompat));
                }
                return Unit.INSTANCE;
        }
    }
}

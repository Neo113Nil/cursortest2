package androidx.compose.ui.viewinterop;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$4 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewFactoryHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidViewHolder$layoutNode$1$4(ViewFactoryHolder viewFactoryHolder, int i) {
        super(1);
        this.$r8$classId = i;
        this.$this_run = viewFactoryHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.$r8$classId;
        ViewFactoryHolder viewFactoryHolder = this.$this_run;
        switch (i) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(viewFactoryHolder);
                    TypeIntrinsics.asMutableMap(androidComposeView.getAndroidViewsHandler$ui().layoutNodeToHolder).remove(androidComposeView.getAndroidViewsHandler$ui().holderToLayoutNode.remove(viewFactoryHolder));
                    viewFactoryHolder.setImportantForAccessibility(0);
                }
                viewFactoryHolder.removeAllViewsInLayout();
                return Unit.INSTANCE;
            case 1:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = viewFactoryHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = viewFactoryHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            default:
                viewFactoryHolder.bringIntoViewRequester = (Function1) obj;
                return Unit.INSTANCE;
        }
    }
}

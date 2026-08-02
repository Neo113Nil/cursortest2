package androidx.compose.ui.viewinterop;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$3 extends Lambda implements Function1 {
    public final /* synthetic */ LayoutNode $layoutNode;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewFactoryHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidViewHolder$layoutNode$1$3(ViewFactoryHolder viewFactoryHolder, LayoutNode layoutNode, int i) {
        super(1);
        this.$r8$classId = i;
        this.$this_run = viewFactoryHolder;
        this.$layoutNode = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets windowInsets;
        int i = this.$r8$classId;
        final LayoutNode layoutNode = this.$layoutNode;
        ViewFactoryHolder viewFactoryHolder = this.$this_run;
        switch (i) {
            case 0:
                Owner owner = (Owner) obj;
                View view = viewFactoryHolder.view;
                final AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().holderToLayoutNode.put(viewFactoryHolder, layoutNode);
                    androidComposeView.getAndroidViewsHandler$ui().addView(viewFactoryHolder);
                    androidComposeView.getAndroidViewsHandler$ui().layoutNodeToHolder.put(layoutNode, viewFactoryHolder);
                    viewFactoryHolder.setImportantForAccessibility(1);
                    ViewCompat.setAccessibilityDelegate(viewFactoryHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
                        
                            if (r3.intValue() == r7.semanticsOwner.getUnmergedRootSemanticsNode().id) goto L19;
                         */
                        @Override // androidx.core.view.AccessibilityDelegateCompat
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.unwrap());
                            AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView2.composeAccessibilityDelegate;
                            if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui()) {
                                accessibilityNodeInfoCompat.setVisibleToUser(false);
                            }
                            LayoutNode layoutNode2 = layoutNode;
                            LayoutNode parent$ui = layoutNode2.getParent$ui();
                            while (true) {
                                if (parent$ui == null) {
                                    parent$ui = null;
                                    break;
                                } else if (parent$ui.nodes.m889hasH91voCI$ui(8)) {
                                    break;
                                } else {
                                    parent$ui = parent$ui.getParent$ui();
                                }
                            }
                            Integer valueOf = parent$ui != null ? Integer.valueOf(parent$ui.semanticsId) : null;
                            if (valueOf != null) {
                            }
                            valueOf = -1;
                            int intValue = valueOf.intValue();
                            AndroidComposeView androidComposeView3 = androidComposeView;
                            accessibilityNodeInfoCompat.setParent(androidComposeView3, intValue);
                            int i2 = layoutNode2.semanticsId;
                            int orDefault = androidComposeViewAccessibilityDelegateCompat.idToBeforeMap.getOrDefault(i2);
                            if (orDefault != -1) {
                                AndroidViewHolder semanticsIdToView = ArcadeThemeKt.semanticsIdToView(androidComposeView2.getAndroidViewsHandler$ui(), orDefault);
                                if (semanticsIdToView != null) {
                                    accessibilityNodeInfoCompat.setTraversalBefore(semanticsIdToView);
                                } else {
                                    accessibilityNodeInfoCompat.setTraversalBefore(androidComposeView3, orDefault);
                                }
                                AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView2, i2, accessibilityNodeInfoCompat.unwrap(), androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalBeforeVal);
                            }
                            int orDefault2 = androidComposeViewAccessibilityDelegateCompat.idToAfterMap.getOrDefault(i2);
                            if (orDefault2 != -1) {
                                AndroidViewHolder semanticsIdToView2 = ArcadeThemeKt.semanticsIdToView(androidComposeView2.getAndroidViewsHandler$ui(), orDefault2);
                                if (semanticsIdToView2 != null) {
                                    accessibilityNodeInfoCompat.setTraversalAfter(semanticsIdToView2);
                                } else {
                                    accessibilityNodeInfoCompat.setTraversalAfter(androidComposeView3, orDefault2);
                                }
                                AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(androidComposeView2, i2, accessibilityNodeInfoCompat.unwrap(), androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalAfterVal);
                            }
                        }
                    });
                }
                if (view.getParent() != viewFactoryHolder) {
                    viewFactoryHolder.addView(view);
                }
                break;
            case 1:
                AndroidView_androidKt.access$layoutAccordingTo(viewFactoryHolder, layoutNode);
                break;
            default:
                AndroidView_androidKt.access$layoutAccordingTo(viewFactoryHolder, layoutNode);
                ((AndroidComposeView) viewFactoryHolder.owner).isPendingInteropViewLayoutChangeDispatch = true;
                int[] iArr = viewFactoryHolder.position;
                int i2 = iArr[0];
                int i3 = iArr[1];
                View view2 = viewFactoryHolder.view;
                view2.getLocationOnScreen(iArr);
                long j = viewFactoryHolder.size;
                long mo838getSizeYbymL2g = ((LayoutCoordinates) obj).mo838getSizeYbymL2g();
                viewFactoryHolder.size = mo838getSizeYbymL2g;
                WindowInsetsCompat windowInsetsCompat = viewFactoryHolder.insets;
                if (windowInsetsCompat != null && ((i2 != iArr[0] || i3 != iArr[1] || !IntSize.m1055equalsimpl0(j, mo838getSizeYbymL2g)) && (windowInsets = viewFactoryHolder.insetToLayoutPosition(windowInsetsCompat).toWindowInsets()) != null)) {
                    view2.dispatchApplyWindowInsets(windowInsets);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.spatial.RectManager;
import androidx.datastore.core.SimpleActor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.memory.MemoryCacheService;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final class AndroidAutofillManager implements FocusListener {
    public final MutableIntSet currentlyDisplayedIDs;
    public final String packageName;
    public boolean pendingAutofillCommit;
    public final MemoryCacheService platformAutofillManager;
    public final RectManager rectManager;
    public final Rect reusableRect = new Rect();
    public final AutofillId rootAutofillId;
    public final SimpleActor semanticsOwner;
    public final AndroidComposeView view;

    public AndroidAutofillManager(MemoryCacheService memoryCacheService, SimpleActor simpleActor, AndroidComposeView androidComposeView, RectManager rectManager, String str) {
        this.platformAutofillManager = memoryCacheService;
        this.semanticsOwner = simpleActor;
        this.view = androidComposeView;
        this.rectManager = rectManager;
        this.packageName = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("Required value was null.");
        }
        this.rootAutofillId = autofillId;
        this.currentlyDisplayedIDs = new MutableIntSet();
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public final void onFocusChanged(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        LayoutNode requireLayoutNode;
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode requireLayoutNode2;
        SemanticsConfiguration semanticsConfiguration2;
        if (focusTargetNode != null && (requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(focusTargetNode)) != null && (semanticsConfiguration2 = requireLayoutNode2.getSemanticsConfiguration()) != null) {
            MutableScatterMap mutableScatterMap = semanticsConfiguration2.props;
            if (mutableScatterMap.contains(SemanticsActions.OnAutofillText) || mutableScatterMap.contains(SemanticsActions.OnFillData)) {
                ((AutofillManager) this.platformAutofillManager.imageLoader).notifyViewExited(this.view, requireLayoutNode2.semanticsId);
            }
        }
        if (focusTargetNode2 == null || (requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode2)) == null || (semanticsConfiguration = requireLayoutNode.getSemanticsConfiguration()) == null) {
            return;
        }
        MutableScatterMap mutableScatterMap2 = semanticsConfiguration.props;
        if (mutableScatterMap2.contains(SemanticsActions.OnAutofillText) || mutableScatterMap2.contains(SemanticsActions.OnFillData)) {
            final int i = requireLayoutNode.semanticsId;
            this.rectManager.rects.withRect(i, new Function4() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Number) obj).intValue();
                    int intValue2 = ((Number) obj2).intValue();
                    int intValue3 = ((Number) obj3).intValue();
                    int intValue4 = ((Number) obj4).intValue();
                    AndroidAutofillManager androidAutofillManager = AndroidAutofillManager.this;
                    MemoryCacheService memoryCacheService = androidAutofillManager.platformAutofillManager;
                    ((AutofillManager) memoryCacheService.imageLoader).notifyViewEntered(androidAutofillManager.view, i, new Rect(intValue, intValue2, intValue3, intValue4));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}

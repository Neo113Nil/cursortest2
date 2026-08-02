package app.cash.local.views.brand.checkout;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.room.Room;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.protos.cash.local.client.v1.LocalText;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class CheckoutFulfillmentSectionKt {
    public static final void CheckoutFulfillmentSection(Modifier modifier, LocalBrandLocationCartViewModel.Fulfillment fulfillment, List list, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        String format2;
        boolean z;
        fulfillment.getClass();
        list.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(713853790);
        int i2 = i | (gapComposer2.changedInstance(fulfillment) ? 32 : 16) | (gapComposer2.changedInstance(list) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | (gapComposer2.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changedInstance(function1) ? 8388608 : 4194304);
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            AnnotatedString annotatedString = null;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Delivery) {
                gapComposer2.startReplaceGroup(-471963264);
                String str = ((LocalBrandLocationCartViewModel.Fulfillment.Delivery) fulfillment).address;
                str.getClass();
                format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_fulfillment_delivery_to)).format(new Object[]{str});
                format2.getClass();
                z = false;
                gapComposer2.end(false);
            } else {
                if (!(fulfillment instanceof LocalBrandLocationCartViewModel.Fulfillment.Pickup)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -471964371, false);
                }
                gapComposer2.startReplaceGroup(-471960066);
                format2 = new MessageFormat(Room.stringResource(gapComposer2, R.string.local_views_fulfillment_pickup_at)).format(new Object[]{((LocalBrandLocationCartViewModel.Fulfillment.Pickup) fulfillment).address});
                format2.getClass();
                z = false;
                gapComposer2.end(false);
            }
            LocalText selectedEstimatedCompletion = fulfillment.getSelectedEstimatedCompletion();
            if (selectedEstimatedCompletion == null) {
                gapComposer2.startReplaceGroup(-1134956058);
            } else {
                gapComposer2.startReplaceGroup(794672507);
                annotatedString = LocalViewsKt.toAnnotatedString(selectedEstimatedCompletion, gapComposer2);
            }
            gapComposer2.end(z);
            gapComposer = gapComposer2;
            CheckoutExpandableReviewRowKt.CheckoutReviewRow(null, format2, annotatedString, fulfillment.isExpanded(), function0, null, false, false, gapComposer, (i2 << 3) & 57344, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, fulfillment.isExpanded(), null, null, null, null, Expect_jvmKt.rememberComposableLambda(911266512, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(fulfillment, function02, function03, function04, list, function1, 1), gapComposer), gapComposer, 1572870, 30);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(modifier, (Object) fulfillment, (Object) list, (Function) function0, (Function) function02, (Function) function03, (Function) function04, function1, i, 2);
        }
    }
}

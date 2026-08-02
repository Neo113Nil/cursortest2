package com.google.android.gms.internal.mlkit_genai_prompt;

import android.content.SharedPreferences;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1;
import androidx.compose.ui.scrollcapture.ScrollCaptureCandidate;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransaction;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransactions;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.preferences.SharedPreferencesKeyValue;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class zzagy {
    public static final void SingleUsePaymentTransaction(Modifier modifier, SUPOrderTransaction sUPOrderTransaction, Composer composer, int i) {
        sUPOrderTransaction.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1843992855);
        int i2 = i | 6 | (gapComposer.changedInstance(sUPOrderTransaction) ? 32 : 16);
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(2057292604, new BulletinTileKt$$ExternalSyntheticLambda6(sUPOrderTransaction), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(modifier, sUPOrderTransaction, i, i3);
        }
    }

    public static final void SingleUsePaymentTransactionList(Modifier modifier, SUPOrderTransactions sUPOrderTransactions, Composer composer, int i) {
        sUPOrderTransactions.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1132975766);
        int i2 = i | 6 | (gapComposer.changedInstance(sUPOrderTransactions) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1236028527, new BulletinTileKt$$ExternalSyntheticLambda6(sUPOrderTransactions), gapComposer), gapComposer, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda2(modifier, sUPOrderTransactions, i, 17);
        }
    }

    public static SharedPreferencesKeyValue provideHypeAnimationLastShownTimestamp(SharedPreferences sharedPreferences) {
        return Room.LongKeyValue$default(sharedPreferences, "hype-animation-last-shown-timestamp");
    }

    public static SharedPreferencesKeyValue provideLowDiskSpaceAlertShownTimestampPreference(SharedPreferences sharedPreferences) {
        return Room.LongKeyValue$default(sharedPreferences, "low-disk-space-alert-last-shown-timestamp");
    }

    public static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i, ScrollCapture$onScrollCaptureSearch$1 scrollCapture$onScrollCaptureSearch$1) {
        SemanticsNode semanticsNode2;
        MutableVector mutableVector = new MutableVector(0, new SemanticsNode[16]);
        List children$ui = semanticsNode.getChildren$ui(false, false, false);
        while (true) {
            mutableVector.addAll(mutableVector.size, children$ui);
            while (true) {
                int i2 = mutableVector.size;
                if (i2 == 0) {
                    return;
                }
                semanticsNode2 = (SemanticsNode) mutableVector.removeAt(i2 - 1);
                boolean isHidden = SemanticsOwnerKt.isHidden(semanticsNode2);
                SemanticsConfiguration semanticsConfiguration = semanticsNode2.unmergedConfig;
                MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
                if (!isHidden && !mutableScatterMap.containsKey(SemanticsProperties.Disabled)) {
                    NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode2.findCoordinatorToGetBounds$ui();
                    if (findCoordinatorToGetBounds$ui == null) {
                        throw Boxes$$ExternalSyntheticOutline1.m1150m("Expected semantics node to have a coordinator.");
                    }
                    IntRect roundToIntRect = IntRectKt.roundToIntRect(ValueInsets.boundsInWindow(findCoordinatorToGetBounds$ui, true));
                    if (roundToIntRect.left < roundToIntRect.right && roundToIntRect.top < roundToIntRect.bottom) {
                        Object obj = semanticsConfiguration.props.get(SemanticsActions.ScrollByOffset);
                        if (obj == null) {
                            obj = null;
                        }
                        Function2 function2 = (Function2) obj;
                        Object obj2 = mutableScatterMap.get(SemanticsProperties.VerticalScrollAxisRange);
                        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) (obj2 != null ? obj2 : null);
                        if (function2 != null && scrollAxisRange != null && ((Number) scrollAxisRange.maxValue.invoke()).floatValue() > RecyclerView.DECELERATION_RATE) {
                            int i3 = 1 + i;
                            scrollCapture$onScrollCaptureSearch$1.invoke(new ScrollCaptureCandidate(semanticsNode2, i3, roundToIntRect, findCoordinatorToGetBounds$ui));
                            visitScrollCaptureCandidates(semanticsNode2, i3, scrollCapture$onScrollCaptureSearch$1);
                        }
                    }
                }
            }
            children$ui = semanticsNode2.getChildren$ui(false, false, false);
        }
    }
}

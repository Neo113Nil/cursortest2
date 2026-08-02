package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenterKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class DragAndDrop_androidKt {
    public static final void AddViewAttributes(RealObservabilityManager realObservabilityManager, Map map, Composer composer, int i) {
        realObservabilityManager.getClass();
        map.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-736831117);
        int i2 = 16;
        int i3 = (gapComposer.changed(realObservabilityManager) ? 4 : 2) | i | (gapComposer.changedInstance(map) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(map) | ((i3 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GenieViewKt$GenieView$1$1(realObservabilityManager, map, null, 25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(realObservabilityManager, map, i, i2);
        }
    }

    public static final void HandleDefaultDisplayPreference(BinaryBitmap binaryBitmap, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1237427610);
        int i2 = (gapComposer.changed(binaryBitmap) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            binaryBitmap.HandleDefaultDisplayPreference(gapComposer, i2 & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinHomePresenterKt$$ExternalSyntheticLambda0(binaryBitmap, i, i3);
        }
    }

    public static final long getPositionInRoot(DragAndDropEvent dragAndDropEvent) {
        DragEvent dragEvent = dragAndDropEvent.dragEvent;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & BodyPartID.bodyIdMax);
    }

    public static final DragEvent toAndroidDragEvent(DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.dragEvent;
    }
}

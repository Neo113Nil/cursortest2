package androidx.media3.exoplayer.audio;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class DeviceTypeUtil {
    public static final void RemoveAttachmentButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 function02;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1317814780);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 40.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape), Strings.getColors(gapComposer).semantic.icon.standard, roundedCornerShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(Strings.getColors(gapComposer).component.button.prominent.background.ripple, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 14), false, null, new Role(0), function0, 12);
            function02 = function0;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Trace.m1191Iconww6aTOc(Icons.NavClose16, Room.stringResource(gapComposer, R.string.support_chat_remove_file_button_content_description), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f), Strings.getColors(gapComposer).semantic.icon.inverse, gapComposer, 390, 0);
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function02, modifier, i, 5);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddFavorites.deepLinkSpecs;
    }

    public static boolean isBluetoothDevice(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }
}

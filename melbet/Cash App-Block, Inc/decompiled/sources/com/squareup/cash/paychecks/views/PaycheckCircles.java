package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.google.android.gms.internal.mlkit_vision_face.zzmn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PaycheckCircles {
    public static final PaycheckCircles INSTANCE = new PaycheckCircles();

    public enum Placement {
        /* JADX INFO: Fake field, exist only in values array */
        APPLET(48.0f, 8.0f, 3.0f),
        /* JADX INFO: Fake field, exist only in values array */
        RECEIPT(24.0f, 4.0f, 2.0f);

        Placement(float f, float f2, float f3) {
        }
    }

    public final void AvatarCircle(Image image, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        image.getClass();
        modifier.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1166633730);
        int i2 = i | (gapComposer2.changedInstance(image) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changed(true) ? 256 : 128);
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer = gapComposer2;
            zzmn.m2026FoundationRemoteImageNXws8ko(new PaycheckCircles$$ExternalSyntheticLambda3(i3), ComposeUtilsKt.getThemedUrl(image, gapComposer2), ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape), null, null, null, null, null, new Color(MooncakeTheme.getColors(gapComposer2).secondaryButtonBackground), null, null, Expect_jvmKt.rememberComposableLambda(-407974817, new PaycheckCircles$$ExternalSyntheticLambda4(0), gapComposer2), gapComposer, 0, 48, 1784);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, image, modifier, i, 24);
        }
    }

    public final void OverflowCircle(int i, Composer composer, Modifier modifier, String str) {
        str.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-66319927);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(modifier, RoundedCornerShapeKt.CircleShape), MooncakeTheme.getColors(gapComposer).secondaryButtonBackground, ColorKt.RectangleShape), 6.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            KeypadKt.m3639AutoScaleTextgQjefEo(str, null, MooncakeTheme.getTypography(gapComposer).smallTitle, MooncakeTheme.getColors(gapComposer).secondaryLabel, 0, 0, 0L, 0, gapComposer, i2 & 14, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, str, modifier, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void UnknownCircle(int i, int i2, Composer composer, Modifier modifier, boolean z) {
        int i3;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        long j;
        long j2;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1946973636);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) == 18)) {
                gapComposer.skipToGroupEnd();
            } else {
                boolean z3 = i4 != 0 ? false : z2;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                if (z3) {
                    gapComposer.startReplaceGroup(1153999862);
                    j = MooncakeTheme.getColors(gapComposer).primaryButtonBackground;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1154070697);
                    j = MooncakeTheme.getColors(gapComposer).icon;
                    gapComposer.end(false);
                }
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                ImageKt.Image(Countries.painterResource(R.drawable.applet_paycheck_logo, 0, gapComposer), null, ClipKt.clip(companion, roundedCornerShape), null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
                if (z3) {
                    gapComposer.startReplaceGroup(1154395732);
                    j2 = MooncakeTheme.getColors(gapComposer).secondaryButtonBackground;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1154468954);
                    j2 = MooncakeTheme.getColors(gapComposer).secondaryButtonTint;
                    gapComposer.end(false);
                }
                Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                boolean changed = gapComposer.changed(j2);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new c7$$ExternalSyntheticLambda6(j2, 17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CanvasKt.Canvas(6, gapComposer, fillMaxSize, (Function1) rememberedValue);
                gapComposer.end(true);
                z2 = z3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(this, modifier, z2, i, i2, 4);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) == 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}

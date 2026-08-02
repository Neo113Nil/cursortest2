package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.android.material.resources.MaterialAttributes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.withpersona.sdk2.inquiry.selfie.CameraState;
import com.withpersona.sdk2.inquiry.selfie.PoseConfig;
import com.withpersona.sdk2.inquiry.selfie.PoseConfigs;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public abstract class MaterialColors {
    public static final void GenericText(GenericBaseViewModel.TextViewModel textViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        TextStyle textStyle;
        textViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(177392523);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(textViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextElement.Style style = textViewModel.style;
            Integer num = textViewModel.maxLineNumber;
            switch (style.ordinal()) {
                case 1:
                    gapComposer.startReplaceGroup(937972457);
                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography == null) {
                        mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography.bigMoney;
                    gapComposer.end(false);
                    break;
                case 2:
                    gapComposer.startReplaceGroup(937974056);
                    MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography2 == null) {
                        mooncakeTypography2 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography2.header1;
                    gapComposer.end(false);
                    break;
                case 3:
                    gapComposer.startReplaceGroup(937975624);
                    MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography3 == null) {
                        mooncakeTypography3 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography3.header2;
                    gapComposer.end(false);
                    break;
                case 4:
                    gapComposer.startReplaceGroup(937977192);
                    MooncakeTypography mooncakeTypography4 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography4 == null) {
                        mooncakeTypography4 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography4.header3;
                    gapComposer.end(false);
                    break;
                case 5:
                    gapComposer.startReplaceGroup(937978760);
                    MooncakeTypography mooncakeTypography5 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography5 == null) {
                        mooncakeTypography5 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography5.header4;
                    gapComposer.end(false);
                    break;
                case 6:
                    gapComposer.startReplaceGroup(937980230);
                    MooncakeTypography mooncakeTypography6 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography6 == null) {
                        mooncakeTypography6 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography6.input;
                    gapComposer.end(false);
                    break;
                case 7:
                    gapComposer.startReplaceGroup(937981802);
                    MooncakeTypography mooncakeTypography7 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography7 == null) {
                        mooncakeTypography7 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography7.mainTitle;
                    gapComposer.end(false);
                    break;
                case 8:
                    gapComposer.startReplaceGroup(937983465);
                    MooncakeTypography mooncakeTypography8 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography8 == null) {
                        mooncakeTypography8 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography8.mainBody;
                    gapComposer.end(false);
                    break;
                case 9:
                    gapComposer.startReplaceGroup(937985163);
                    MooncakeTypography mooncakeTypography9 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography9 == null) {
                        mooncakeTypography9 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography9.smallTitle;
                    gapComposer.end(false);
                    break;
                case 10:
                    gapComposer.startReplaceGroup(937986890);
                    MooncakeTypography mooncakeTypography10 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography10 == null) {
                        mooncakeTypography10 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography10.smallBody;
                    gapComposer.end(false);
                    break;
                case 11:
                default:
                    gapComposer.startReplaceGroup(938001866);
                    MooncakeTypography mooncakeTypography11 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography11 == null) {
                        mooncakeTypography11 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography11.smallBody;
                    gapComposer.end(false);
                    break;
                case 12:
                    gapComposer.startReplaceGroup(937988718);
                    MooncakeTypography mooncakeTypography12 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography12 == null) {
                        mooncakeTypography12 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography12.strongCaption;
                    gapComposer.end(false);
                    break;
                case 13:
                    gapComposer.startReplaceGroup(937990440);
                    MooncakeTypography mooncakeTypography13 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography13 == null) {
                        mooncakeTypography13 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography13.caption;
                    gapComposer.end(false);
                    break;
                case 14:
                    gapComposer.startReplaceGroup(938000331);
                    MooncakeTypography mooncakeTypography14 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography14 == null) {
                        mooncakeTypography14 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = mooncakeTypography14.identifier;
                    gapComposer.end(false);
                    break;
                case 15:
                    gapComposer.startReplaceGroup(937997611);
                    MooncakeTypography mooncakeTypography15 = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography15 == null) {
                        mooncakeTypography15 = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    textStyle = TextStyle.m994copyp1EtxEg$default(mooncakeTypography15.caption, 0L, Room.getSp(12), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(18), null, null, 0, 16646141);
                    gapComposer.end(false);
                    break;
            }
            int intValue = num != null ? num.intValue() : 1;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            long j = textStyle.paragraphStyle.lineHeight;
            Room.m1167checkArithmeticR2X_6o(j);
            float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(Room.pack(1095216660480L & j, TextUnit.m1059getValueimpl(j) * intValue));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = num != null ? SizeKt.m277height3ABfNKs(companion, mo231toDpGaN1DYA) : SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1074005885, new FormRemoteImageKt$$ExternalSyntheticLambda0(textViewModel, modifier, textStyle, 28), gapComposer);
            if (textViewModel.selectable) {
                gapComposer.startReplaceGroup(-1829800227);
                SimpleLayoutKt.SelectionContainer(null, rememberComposableLambda, gapComposer, 48, 1);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1829743559);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(textViewModel, modifier, i, 24);
        }
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
    }

    public static Integer getColorOrNull(Context context, int i) {
        TypedValue resolve = MaterialAttributes.resolve(context.getTheme(), i);
        if (resolve != null) {
            return Integer.valueOf(resolveColor(context, resolve));
        }
        return null;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i) {
        TypedValue resolve = MaterialAttributes.resolve(context.getTheme(), i);
        if (resolve == null) {
            return null;
        }
        int i2 = resolve.resourceId;
        if (i2 != 0) {
            return ResourcesCompat.getColorStateList(context.getResources(), i2, context.getTheme());
        }
        int i3 = resolve.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static Selfie.Pose getCurrentPose(CameraState cameraState) {
        return (Selfie.Pose) CollectionsKt.first(cameraState.getPosesNeeded());
    }

    public static PoseConfig getCurrentPoseConfig(CameraState cameraState) {
        Selfie.Pose currentPoseOrNull = cameraState.getCurrentPoseOrNull();
        PoseConfig poseConfig = PoseConfig.Default;
        if (currentPoseOrNull == null) {
            return poseConfig;
        }
        PoseConfigs poseConfigs = cameraState.getPoseConfigs();
        poseConfigs.getClass();
        PoseConfig poseConfig2 = (PoseConfig) poseConfigs.poseConfigs.get(currentPoseOrNull);
        return poseConfig2 == null ? poseConfig : poseConfig2;
    }

    public static boolean isColorLight(int i) {
        return i != 0 && ColorUtils.calculateLuminance(i) > 0.5d;
    }

    public static int layer(float f, int i, int i2) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int resolveColor(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }
}

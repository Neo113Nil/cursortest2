package com.squareup.cash.formview.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt$$ExternalSyntheticLambda5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class FormViewCtaButtons extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState buttonsVisibility$delegate;
    public DisclaimerProps disclaimer;
    public final ButtonProps primary;
    public final ButtonProps secondary;

    public final class ButtonProps {
        public final ParcelableSnapshotMutableState style$delegate;
        public final ParcelableSnapshotMutableState isEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        public final ParcelableSnapshotMutableState text$delegate = Updater.mutableStateOf$default("");
        public final ParcelableSnapshotMutableState type$delegate = Updater.mutableStateOf$default(ButtonType.Normal);
        public final ParcelableSnapshotMutableState icon$delegate = Updater.mutableStateOf$default(null);
        public final SharedFlowImpl clicks = FlowKt.MutableSharedFlow$default(0, 50, null, 5);

        public ButtonProps(ButtonStyle buttonStyle) {
            this.style$delegate = Updater.mutableStateOf$default(buttonStyle);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonStyle {
        public static final /* synthetic */ ButtonStyle[] $VALUES;
        public static final ButtonStyle Primary;
        public static final ButtonStyle Secondary;
        public static final ButtonStyle Tertiary;

        static {
            ButtonStyle buttonStyle = new ButtonStyle("Primary", 0);
            Primary = buttonStyle;
            ButtonStyle buttonStyle2 = new ButtonStyle("Secondary", 1);
            Secondary = buttonStyle2;
            ButtonStyle buttonStyle3 = new ButtonStyle("Tertiary", 2);
            Tertiary = buttonStyle3;
            $VALUES = new ButtonStyle[]{buttonStyle, buttonStyle2, buttonStyle3};
        }

        public static ButtonStyle valueOf(String str) {
            return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
        }

        public static ButtonStyle[] values() {
            return (ButtonStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonType {
        public static final /* synthetic */ ButtonType[] $VALUES;
        public static final ButtonType Destructive;
        public static final ButtonType Normal;

        static {
            ButtonType buttonType = new ButtonType("Normal", 0);
            Normal = buttonType;
            ButtonType buttonType2 = new ButtonType("Destructive", 1);
            Destructive = buttonType2;
            $VALUES = new ButtonType[]{buttonType, buttonType2};
        }

        public static ButtonType valueOf(String str) {
            return (ButtonType) Enum.valueOf(ButtonType.class, str);
        }

        public static ButtonType[] values() {
            return (ButtonType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ButtonVisibility {
        public static final /* synthetic */ ButtonVisibility[] $VALUES;
        public static final ButtonVisibility Both;
        public static final ButtonVisibility PrimaryOnly;
        public static final ButtonVisibility SecondaryOnly;

        static {
            ButtonVisibility buttonVisibility = new ButtonVisibility("Both", 0);
            Both = buttonVisibility;
            ButtonVisibility buttonVisibility2 = new ButtonVisibility("PrimaryOnly", 1);
            PrimaryOnly = buttonVisibility2;
            ButtonVisibility buttonVisibility3 = new ButtonVisibility("SecondaryOnly", 2);
            SecondaryOnly = buttonVisibility3;
            $VALUES = new ButtonVisibility[]{buttonVisibility, buttonVisibility2, buttonVisibility3, new ButtonVisibility("None", 3)};
        }

        public static ButtonVisibility valueOf(String str) {
            return (ButtonVisibility) Enum.valueOf(ButtonVisibility.class, str);
        }

        public static ButtonVisibility[] values() {
            return (ButtonVisibility[]) $VALUES.clone();
        }
    }

    public final class DisclaimerProps {
        public final ParcelableSnapshotMutableState text$delegate = Updater.mutableStateOf$default(null);
        public final SharedFlowImpl clicks = FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LayoutMode {
        public static final /* synthetic */ LayoutMode[] $VALUES;
        public static final LayoutMode NeverCollapse;
        public static final LayoutMode VerticalStack;

        static {
            LayoutMode layoutMode = new LayoutMode("NeverCollapse", 0);
            NeverCollapse = layoutMode;
            LayoutMode layoutMode2 = new LayoutMode("VerticalStack", 1);
            VerticalStack = layoutMode2;
            $VALUES = new LayoutMode[]{layoutMode, layoutMode2, new LayoutMode("Automatic", 2)};
        }

        public static LayoutMode valueOf(String str) {
            return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
        }

        public static LayoutMode[] values() {
            return (LayoutMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewCtaButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        context.getClass();
        this.buttonsVisibility$delegate = Updater.mutableStateOf$default(ButtonVisibility.Both);
        this.primary = new ButtonProps(ButtonStyle.Primary);
        this.secondary = new ButtonProps(ButtonStyle.Secondary);
        this.disclaimer = new DisclaimerProps();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1099981580);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        boolean z2 = false;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.buttonsVisibility$delegate;
            int ordinal = ((ButtonVisibility) parcelableSnapshotMutableState.getValue()).ordinal();
            if (ordinal == 0 || ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                z = false;
            }
            int ordinal2 = ((ButtonVisibility) parcelableSnapshotMutableState.getValue()).ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                    }
                }
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1732641089, new SlottedCardKt$$ExternalSyntheticLambda5(i3, this, z2, z), gapComposer), gapComposer, 3072, 7);
            }
            z2 = true;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1732641089, new SlottedCardKt$$ExternalSyntheticLambda5(i3, this, z2, z), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormViewCtaButtons$$ExternalSyntheticLambda1(this, i);
        }
    }

    public final void CtaButton(ButtonStyle buttonStyle, ButtonType buttonType, boolean z, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ButtonProminence buttonProminence;
        boolean z2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1048542749);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(buttonStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(buttonType.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int ordinal = buttonStyle.ordinal();
            if (ordinal == 0) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else if (ordinal == 1) {
                buttonProminence = ButtonProminence.STANDARD;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.SUBTLE;
            }
            ButtonProminence buttonProminence2 = buttonProminence;
            int ordinal2 = buttonType.ordinal();
            if (ordinal2 == 0) {
                z2 = false;
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                z2 = true;
            }
            gapComposer = gapComposer2;
            SizeKt.ButtonCta(function0, modifier, buttonProminence2, z2, z, null, composableLambdaImpl, gapComposer, ((i2 >> 9) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (57344 & (i2 << 6)) | ((i2 << 3) & 3670016), 32);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(this, buttonStyle, buttonType, z, function0, modifier, composableLambdaImpl, i);
        }
    }

    public final void setDisclaimer(DisclaimerProps disclaimerProps) {
        disclaimerProps.getClass();
        this.disclaimer = disclaimerProps;
    }

    public final void setLayoutMode(LayoutMode layoutMode) {
        layoutMode.getClass();
    }

    public final void CtaButton(ButtonProps buttonProps, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1890653464);
        int i2 = i | (gapComposer.changed(buttonProps) ? 4 : 2) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ButtonStyle buttonStyle = (ButtonStyle) buttonProps.style$delegate.getValue();
            ButtonType buttonType = (ButtonType) buttonProps.type$delegate.getValue();
            boolean booleanValue = ((Boolean) buttonProps.isEnabled$delegate.getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(buttonProps, 28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CtaButton(buttonStyle, buttonType, booleanValue, (Function0) rememberedValue, modifier, Expect_jvmKt.rememberComposableLambda(522137474, new FormView$$ExternalSyntheticLambda0(buttonProps, i3), gapComposer), gapComposer, 221184 | ((i2 << 12) & 3670016));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(this, buttonProps, modifier, i, 11);
        }
    }
}

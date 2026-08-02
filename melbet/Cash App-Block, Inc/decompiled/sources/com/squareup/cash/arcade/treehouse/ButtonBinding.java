package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.ImageResource;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import coil3.size.SizeKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class ButtonBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState arcadeProminence$delegate;
    public final ParcelableSnapshotMutableState arcadeStyle$delegate;
    public final ParcelableSnapshotMutableState backgroundColor$delegate;
    public final ParcelableSnapshotMutableState icon$delegate;
    public final ParcelableSnapshotMutableState iconResId$delegate;
    public final ParcelableSnapshotMutableState iconTint$delegate;
    public final ParcelableSnapshotMutableState isButtonEnabled$delegate;
    public Modifier modifier;
    public final ParcelableSnapshotMutableState mooncakeStyle$delegate;
    public final ParcelableSnapshotMutableState onClick$delegate;
    public final ParcelableSnapshotMutableState size$delegate;
    public final ParcelableSnapshotMutableState text$delegate;
    public final ParcelableSnapshotMutableState textColor$delegate;
    public final ParcelableSnapshotMutableState textStyle$delegate;
    public final ThemeInfo themeInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ArcadeStyle {
        public static final /* synthetic */ ArcadeStyle[] $VALUES;
        public static final ArcadeStyle COMPACT;
        public static final ArcadeStyle CTA;
        public static final ArcadeStyle DEFAULT;
        public static final ArcadeStyle DROPDOWN;

        static {
            ArcadeStyle arcadeStyle = new ArcadeStyle("DEFAULT", 0);
            DEFAULT = arcadeStyle;
            ArcadeStyle arcadeStyle2 = new ArcadeStyle("COMPACT", 1);
            COMPACT = arcadeStyle2;
            ArcadeStyle arcadeStyle3 = new ArcadeStyle("CTA", 2);
            CTA = arcadeStyle3;
            ArcadeStyle arcadeStyle4 = new ArcadeStyle("DROPDOWN", 3);
            DROPDOWN = arcadeStyle4;
            $VALUES = new ArcadeStyle[]{arcadeStyle, arcadeStyle2, arcadeStyle3, arcadeStyle4};
        }

        public static ArcadeStyle valueOf(String str) {
            return (ArcadeStyle) Enum.valueOf(ArcadeStyle.class, str);
        }

        public static ArcadeStyle[] values() {
            return (ArcadeStyle[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.themeInfo = ThemeHelpersKt.findThemeInfo(context);
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.text$delegate = Updater.mutableStateOf$default("");
        this.onClick$delegate = Updater.mutableStateOf$default(null);
        this.textColor$delegate = Updater.mutableStateOf$default(null);
        this.backgroundColor$delegate = Updater.mutableStateOf$default(null);
        this.isButtonEnabled$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.textStyle$delegate = Updater.mutableStateOf$default(null);
        this.icon$delegate = Updater.mutableStateOf$default(null);
        this.iconResId$delegate = Updater.mutableStateOf$default(null);
        this.iconTint$delegate = Updater.mutableStateOf$default(null);
        this.size$delegate = Updater.mutableStateOf$default(MooncakePillButton.Size.LARGE);
        this.mooncakeStyle$delegate = Updater.mutableStateOf$default(MooncakePillButton.Style.PRIMARY);
        this.arcadeStyle$delegate = Updater.mutableStateOf$default(null);
        this.arcadeProminence$delegate = Updater.mutableStateOf$default(null);
    }

    public static boolean toArcadeButtonDestructive(ButtonProminence buttonProminence) {
        if (Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveProminent) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveSubtle) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveStandard)) {
            return true;
        }
        if (Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.prominent) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.subtle)) {
            return false;
        }
        Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.standard);
        return false;
    }

    public static com.squareup.cash.arcade.components.button.ButtonProminence toArcadeButtonProminence(ButtonProminence buttonProminence) {
        return (Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.prominent) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveProminent)) ? com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT : (Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.subtle) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveSubtle)) ? com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE : (Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.standard) || Intrinsics.areEqual(buttonProminence, ArcadeButtonProminences.destructiveStandard)) ? com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD : com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
    }

    public final void Button(ArcadeStyle arcadeStyle, Function0 function0, ButtonProminence buttonProminence, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1566761859);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(arcadeStyle.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(buttonProminence) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(this) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(1, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function02 = (Function0) rememberedValue;
            int ordinal = arcadeStyle.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1992642172);
                int i3 = (i2 >> 6) & 14;
                int i4 = i2 >> 3;
                DefaultButton(buttonProminence, function02, z, composableLambdaImpl, gapComposer, i3 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1992516188);
                int i5 = (i2 >> 6) & 14;
                int i6 = i2 >> 3;
                CompactButton(buttonProminence, function02, z, composableLambdaImpl, gapComposer, i5 | (i6 & 896) | (i6 & 7168) | (i6 & 57344));
                gapComposer.end(false);
            } else if (ordinal == 2) {
                gapComposer.startReplaceGroup(-1992394296);
                int i7 = (i2 >> 6) & 14;
                int i8 = i2 >> 3;
                CTAButton(buttonProminence, function02, z, composableLambdaImpl, gapComposer, i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344));
                gapComposer.end(false);
            } else if (ordinal != 3) {
                gapComposer.startReplaceGroup(-1992083676);
                int i9 = (i2 >> 6) & 14;
                int i10 = i2 >> 3;
                DefaultButton(buttonProminence, function02, z, composableLambdaImpl, gapComposer, i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1992268777);
                SizeKt.ButtonDropdown(function02, Modifier.Companion.$$INSTANCE, z, null, composableLambdaImpl, gapComposer, ((i2 >> 3) & 896) | 48 | (i2 & 57344), 8);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(this, arcadeStyle, function0, buttonProminence, z, composableLambdaImpl, i);
        }
    }

    public final void CTAButton(ButtonProminence buttonProminence, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ButtonBinding buttonBinding;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-627817280);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonProminence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            buttonBinding = this;
            i2 |= gapComposer.changedInstance(buttonBinding) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            buttonBinding = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SizeKt.ButtonCta(function0, Modifier.Companion.$$INSTANCE, toArcadeButtonProminence(buttonProminence), toArcadeButtonDestructive(buttonProminence), z, null, composableLambdaImpl, gapComposer, ((i2 >> 3) & 14) | 48 | (57344 & (i2 << 6)) | ((i2 << 9) & 3670016), 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda5(buttonBinding, buttonProminence, function0, z, composableLambdaImpl, i, 0);
        }
    }

    public final void CompactButton(ButtonProminence buttonProminence, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ButtonBinding buttonBinding;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(918071315);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonProminence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            buttonBinding = this;
            i2 |= gapComposer.changedInstance(buttonBinding) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            buttonBinding = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SizeKt.ButtonCompact(function0, Modifier.Companion.$$INSTANCE, toArcadeButtonProminence(buttonProminence), toArcadeButtonDestructive(buttonProminence), z, null, composableLambdaImpl, gapComposer, ((i2 >> 3) & 14) | 48 | (57344 & (i2 << 6)) | ((i2 << 9) & 3670016), 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda5(buttonBinding, buttonProminence, function0, z, composableLambdaImpl, i, 2);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2050047763);
        int i3 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.arcadeStyle$delegate;
            ArcadeStyle arcadeStyle = (ArcadeStyle) parcelableSnapshotMutableState.getValue();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.isButtonEnabled$delegate;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.onClick$delegate;
            if (arcadeStyle != null) {
                gapComposer.startReplaceGroup(1462106782);
                ArcadeStyle arcadeStyle2 = (ArcadeStyle) parcelableSnapshotMutableState.getValue();
                arcadeStyle2.getClass();
                Function0 function0 = (Function0) parcelableSnapshotMutableState3.getValue();
                ButtonProminence buttonProminence = (ButtonProminence) this.arcadeProminence$delegate.getValue();
                if (buttonProminence == null) {
                    buttonProminence = ArcadeButtonProminences.standard;
                }
                Button(arcadeStyle2, function0, buttonProminence, ((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue(), Expect_jvmKt.rememberComposableLambda(1374779336, new Function3(this) { // from class: com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda0
                    public final /* synthetic */ ButtonBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        ButtonBinding buttonBinding = this.f$0;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                int i7 = ButtonBinding.$r8$clinit;
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    ImageResource imageResource = (ImageResource) buttonBinding.icon$delegate.getValue();
                                    ImageResource.Token token = imageResource instanceof ImageResource.Token ? (ImageResource.Token) imageResource : null;
                                    if (token == null) {
                                        gapComposer2.startReplaceGroup(-756888170);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-756888169);
                                        zzd zzdVar = Icons.Companion;
                                        String str = token.id;
                                        zzdVar.getClass();
                                        Icons icons = zzd.get(str);
                                        if (icons != null) {
                                            gapComposer2.startReplaceGroup(-213104417);
                                            Color color = (Color) buttonBinding.iconTint$delegate.getValue();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (androidx.compose.ui.Modifier) null, color != null ? color.value : Color.Unspecified, gapComposer2, 48, 4);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-213005434);
                                            gapComposer2.end(false);
                                        }
                                        gapComposer2.end(false);
                                    }
                                    String str2 = (String) buttonBinding.text$delegate.getValue();
                                    Color color2 = (Color) buttonBinding.textColor$delegate.getValue();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color2 != null ? color2.value : Color.Unspecified, (Composer) gapComposer2, (androidx.compose.ui.Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = buttonBinding.iconResId$delegate;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                int i8 = ButtonBinding.$r8$clinit;
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    gapComposer3.skipToGroupEnd();
                                } else if (((Integer) parcelableSnapshotMutableState4.getValue()) != null) {
                                    gapComposer3.startReplaceGroup(181963871);
                                    gapComposer3.startReplaceGroup(302311945);
                                    long j = ((Color) gapComposer3.consume(ComposeMooncakeThemeKt.LocalTextColor)).value;
                                    if (j == 16) {
                                        j = MooncakeTheme.getColors(gapComposer3).label;
                                    }
                                    gapComposer3.end(false);
                                    androidx.compose.ui.Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
                                    Integer num = (Integer) parcelableSnapshotMutableState4.getValue();
                                    num.getClass();
                                    ImageKt.Image(Countries.painterResource(num.intValue(), 0, gapComposer3), null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 432, 56);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(182279079);
                                    gapComposer3.end(false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i3 << 15) & 458752) | 24576);
                gapComposer.end(false);
                i2 = 0;
            } else {
                gapComposer.startReplaceGroup(1462613508);
                String str = (String) this.text$delegate.getValue();
                Function0 function02 = (Function0) parcelableSnapshotMutableState3.getValue();
                MooncakePillButton.Size size = (MooncakePillButton.Size) this.size$delegate.getValue();
                MooncakePillButton.Style style = (MooncakePillButton.Style) this.mooncakeStyle$delegate.getValue();
                style.getClass();
                i2 = 0;
                KeypadKt.m3640ButtonGFipHI0(str, function02, null, null, size, style, null, ((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue(), 0, null, Expect_jvmKt.rememberComposableLambda(1337182491, new Function3(this) { // from class: com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda0
                    public final /* synthetic */ ButtonBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        ButtonBinding buttonBinding = this.f$0;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                int i7 = ButtonBinding.$r8$clinit;
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    ImageResource imageResource = (ImageResource) buttonBinding.icon$delegate.getValue();
                                    ImageResource.Token token = imageResource instanceof ImageResource.Token ? (ImageResource.Token) imageResource : null;
                                    if (token == null) {
                                        gapComposer2.startReplaceGroup(-756888170);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-756888169);
                                        zzd zzdVar = Icons.Companion;
                                        String str2 = token.id;
                                        zzdVar.getClass();
                                        Icons icons = zzd.get(str2);
                                        if (icons != null) {
                                            gapComposer2.startReplaceGroup(-213104417);
                                            Color color = (Color) buttonBinding.iconTint$delegate.getValue();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (androidx.compose.ui.Modifier) null, color != null ? color.value : Color.Unspecified, gapComposer2, 48, 4);
                                            gapComposer2.end(false);
                                        } else {
                                            gapComposer2.startReplaceGroup(-213005434);
                                            gapComposer2.end(false);
                                        }
                                        gapComposer2.end(false);
                                    }
                                    String str22 = (String) buttonBinding.text$delegate.getValue();
                                    Color color2 = (Color) buttonBinding.textColor$delegate.getValue();
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, color2 != null ? color2.value : Color.Unspecified, (Composer) gapComposer2, (androidx.compose.ui.Modifier) null, (TextStyle) null, (TextLineBalancing) null, str22, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = buttonBinding.iconResId$delegate;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                int i8 = ButtonBinding.$r8$clinit;
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    gapComposer3.skipToGroupEnd();
                                } else if (((Integer) parcelableSnapshotMutableState4.getValue()) != null) {
                                    gapComposer3.startReplaceGroup(181963871);
                                    gapComposer3.startReplaceGroup(302311945);
                                    long j = ((Color) gapComposer3.consume(ComposeMooncakeThemeKt.LocalTextColor)).value;
                                    if (j == 16) {
                                        j = MooncakeTheme.getColors(gapComposer3).label;
                                    }
                                    gapComposer3.end(false);
                                    androidx.compose.ui.Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
                                    Integer num = (Integer) parcelableSnapshotMutableState4.getValue();
                                    num.getClass();
                                    ImageKt.Image(Countries.painterResource(num.intValue(), 0, gapComposer3), null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 432, 56);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(182279079);
                                    gapComposer3.end(false);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 0, 6, 2892);
                gapComposer.end(false);
            }
        } else {
            i2 = 0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, i2);
        }
    }

    public final void DefaultButton(ButtonProminence buttonProminence, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ButtonBinding buttonBinding;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1852632143);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(buttonProminence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            buttonBinding = this;
            i2 |= gapComposer.changedInstance(buttonBinding) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            buttonBinding = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            SizeKt.Button(function0, Modifier.Companion.$$INSTANCE, toArcadeButtonProminence(buttonProminence), toArcadeButtonDestructive(buttonProminence), z, null, composableLambdaImpl, gapComposer, ((i2 >> 3) & 14) | 48 | (57344 & (i2 << 6)) | ((i2 << 9) & 3670016), 32);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda5(buttonBinding, buttonProminence, function0, z, composableLambdaImpl, i, 1);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this;
    }

    public final void setIconResId(Integer num) {
        this.iconResId$delegate.setValue(num);
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}

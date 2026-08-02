package com.squareup.cash.formview.components;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AbstractComposeView;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ArcadeFormButtonView extends AbstractComposeView {
    public final FormBlocker.Element.ButtonElement element;
    public final FormElementViewBuilder$toView$2 onEvent;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FormBlocker.Element.ButtonElement.Style.values().length];
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormBlocker.Element.ButtonElement.Style.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FormBlocker.Element.ButtonElement.Type.values().length];
            try {
                iArr2[FormBlocker.Element.ButtonElement.Type.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FormBlocker.Element.ButtonElement.Type.DESTRUCTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[FormBlocker.Element.ButtonElement.Size.values().length];
            try {
                iArr3[FormBlocker.Element.ButtonElement.Size.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[FormBlocker.Element.ButtonElement.Size.CTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[FormBlocker.Element.ButtonElement.Size.COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormButtonView(Context context, FormElementViewBuilder$toView$2 formElementViewBuilder$toView$2, FormBlocker.Element.ButtonElement buttonElement) {
        super(context, null, 6, 0);
        context.getClass();
        this.onEvent = formElementViewBuilder$toView$2;
        this.element = buttonElement;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1864666471);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(this, 26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1646453618, new FormCashtag$8$$ExternalSyntheticLambda0(14, this, (Function0) rememberedValue), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(this, i, 15);
        }
    }

    public final void ElementButton(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        ButtonProminence buttonProminence;
        ButtonProminence buttonProminence2;
        boolean z;
        Modifier.Companion companion;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-534303887);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | 48 | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            FormBlocker.Element.ButtonElement buttonElement = this.element;
            FormBlocker.Element.ButtonElement.Style style = buttonElement.style;
            style.getClass();
            int i3 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i3 == 1) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else if (i3 == 2) {
                buttonProminence = ButtonProminence.STANDARD;
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.SUBTLE;
            }
            FormBlocker.Element.ButtonElement.Type type2 = buttonElement.type;
            int i4 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
            if (i4 == -1 || i4 == 1) {
                buttonProminence2 = buttonProminence;
                z = false;
            } else if (i4 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                buttonProminence2 = buttonProminence;
                z = true;
            }
            FormBlocker.Element.ButtonElement.Size size = buttonElement.size;
            int i5 = size == null ? -1 : WhenMappings.$EnumSwitchMapping$2[size.ordinal()];
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (i5 == -1 || i5 == 1) {
                companion = companion2;
                gapComposer.startReplaceGroup(-297733075);
                SizeKt.Button(function0, companion, buttonProminence2, z, false, null, composableLambdaImpl, gapComposer, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 1572864, 48);
                gapComposer.end(false);
            } else if (i5 == 2) {
                companion = companion2;
                gapComposer.startReplaceGroup(-297505814);
                SizeKt.ButtonCta(function0, companion, buttonProminence2, z, false, null, composableLambdaImpl, gapComposer, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 1572864, 48);
                gapComposer.end(false);
            } else {
                if (i5 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1930056665, false);
                }
                gapComposer.startReplaceGroup(-297271578);
                companion = companion2;
                SizeKt.ButtonCompact(function0, companion, buttonProminence2, z, false, null, composableLambdaImpl, gapComposer, (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 1572864, 48);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(this, i, function0, modifier2, composableLambdaImpl, 3);
        }
    }
}

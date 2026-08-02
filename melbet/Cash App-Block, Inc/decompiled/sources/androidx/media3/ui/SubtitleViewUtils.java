package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.compose.animation.CrossfadeKt$Crossfade$5$1;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.media3.common.text.Cue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.threedsdataonly.viewmodels.ThreeDsViewModel;
import com.squareup.cash.threedsdataonly.views.ThreeDsViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SubtitleViewUtils {
    public static final void ThreeDsProgress(ThreeDsViewModel threeDsViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1380535842);
        int i2 = (gapComposer.changedInstance(threeDsViewModel) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            gapComposer.startReplaceGroup(-1003410150);
            gapComposer.startReplaceGroup(212064437);
            gapComposer.end(false);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new Measurer2(density);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new ConstraintLayoutScope();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue5 = parcelableSnapshotMutableState;
            }
            MutableState mutableState2 = (MutableState) rememberedValue5;
            boolean changedInstance = gapComposer.changedInstance(measurer2) | gapComposer.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == obj) {
                rememberedValue6 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState2, measurer2, constraintSetForInlineDsl, mutableState, 7);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 7);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Function0 function0 = (Function0) rememberedValue7;
            boolean changedInstance2 = gapComposer.changedInstance(measurer2);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == obj) {
                rememberedValue8 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 7);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue8), Expect_jvmKt.rememberComposableLambda(1200550679, new CrossfadeKt$Crossfade$5$1(mutableState2, constraintLayoutScope, function0, threeDsViewModel, 2), gapComposer), measurePolicy, gapComposer, 48);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(threeDsViewModel, i, i3);
        }
    }

    public static final void ThreeDsView(ThreeDsViewModel threeDsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1673385259);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(threeDsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (threeDsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-125527573, new ThreeDsViewKt$$ExternalSyntheticLambda0(function1, threeDsViewModel, i3), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(threeDsViewModel, function1, realImageLoader, i, 16);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAllowList.deepLinkSpecs;
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.textSize = -3.4028235E38f;
        builder.textSizeType = PKIFailureInfo.systemUnavail;
        CharSequence charSequence = builder.text;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                builder.text = SpannableString.valueOf(charSequence);
                builder.bitmap = null;
            }
            CharSequence charSequence2 = builder.text;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float resolveTextSize(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}

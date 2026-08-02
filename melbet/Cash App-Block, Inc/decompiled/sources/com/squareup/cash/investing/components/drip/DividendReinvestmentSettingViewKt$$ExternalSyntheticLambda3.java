package com.squareup.cash.investing.components.drip;

import androidx.biometric.KeyguardUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.InterruptibleKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ DividendReinvestmentSettingViewModel f$1;

    public /* synthetic */ DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3(DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel, Function1 function1) {
        this.f$1 = dividendReinvestmentSettingViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$0;
        DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    NavigationIconType navigationIconType = NavigationIconType.BACK;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3654ToolbarA_Dysh8(null, m177backgroundbw27NRU, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24582, 364);
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU2);
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
                    Painter painterResource = Countries.painterResource(R.drawable.icon_recurring_automatic_32, 0, gapComposer);
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(SpacerKt.m301paddingqDBjuR0(companion, 32.0f, 8.0f, 32.0f, RecyclerView.DECELERATION_RATE), MooncakeTheme.getColors(gapComposer).green, RoundedCornerShapeKt.CircleShape), 14.0f, 14.0f, 14.0f, 14.0f);
                    long j = MooncakeTheme.getColors(gapComposer).primaryButtonTint;
                    ImageKt.Image(painterResource, null, m301paddingqDBjuR0, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 56);
                    gapComposer.end(true);
                    if (dividendReinvestmentSettingViewModel == null || (str = dividendReinvestmentSettingViewModel.title) == null) {
                        str = "";
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1), 1.0f), 32.0f, 24.0f, 32.0f, RecyclerView.DECELERATION_RATE), MooncakeTheme.getTypography(gapComposer).header3, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    String m = Boxes$$ExternalSyntheticOutline1.m(dividendReinvestmentSettingViewModel.message, " [", dividendReinvestmentSettingViewModel.ctaLabel, "](ignored)");
                    Modifier m301paddingqDBjuR02 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer).background, rectangleShapeKt$RectangleShape$1), 1.0f), 32.0f, 12.0f, 32.0f, 24.0f);
                    TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).mainBody;
                    long j2 = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                    SpanStyle spanStyle = new SpanStyle(MooncakeTheme.getColors(gapComposer).green, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(13, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(m, (Function2) rememberedValue2, m301paddingqDBjuR02, textStyle, j2, spanStyle, null, 0, 0, null, 0, gapComposer, 0, 1984);
                    gapComposer.startReplaceGroup(1909709052);
                    gapComposer.startReplaceGroup(338698947);
                    for (DividendReinvestmentSettingViewModel.Section section : dividendReinvestmentSettingViewModel.sections) {
                        BoxKt.Box(SpacerKt.padding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), MooncakeTheme.getColors(gapComposer).secondaryBackground, rectangleShapeKt$RectangleShape$1), new PaddingValuesImpl(24.0f, 12.0f, 24.0f, 12.0f)), gapComposer, 0);
                        gapComposer.startReplaceGroup(338708638);
                        Iterator it = section.entries.iterator();
                        while (it.hasNext()) {
                            InterruptibleKt.EntryRow((DividendReinvestmentSettingViewModel.Entry) it.next(), function1, gapComposer, 0);
                        }
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String str2 = dividendReinvestmentSettingViewModel.disclosure;
                    Modifier m301paddingqDBjuR03 = SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer2).secondaryBackground, rectangleShapeKt$RectangleShape$1), 32.0f, 24.0f, 32.0f, 48.0f);
                    TextStyle textStyle2 = MooncakeTheme.getTypography(gapComposer2).smallBody;
                    long j3 = MooncakeTheme.getColors(gapComposer2).secondaryLabel;
                    SpanStyle spanStyle2 = new SpanStyle(MooncakeTheme.getColors(gapComposer2).secondaryLabel, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438);
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(14, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(str2, (Function2) rememberedValue3, m301paddingqDBjuR03, textStyle2, j3, spanStyle2, null, 0, 3, null, 0, gapComposer2, 0, 1728);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3(Function1 function1, DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel) {
        this.f$0 = function1;
        this.f$1 = dividendReinvestmentSettingViewModel;
    }
}

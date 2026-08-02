package com.squareup.cash.card.onboarding;

import android.content.Context;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31(float f, float f2, ProductDetailsPageViewModel productDetailsPageViewModel, Function1 function1, MutableState mutableState) {
        this.f$0 = f;
        this.f$1 = f2;
        this.f$2 = productDetailsPageViewModel;
        this.f$3 = function1;
        this.f$4 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearGradient m132linearGradientmHitzGk;
        int i = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$3;
        float f = this.f$1;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        float f2 = this.f$0;
        switch (i) {
            case 0:
                ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) obj6;
                MutableState mutableState = (MutableState) obj5;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                float mo267calculateTopPaddingD9Ej5fM = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).statusBars, gapComposer).mo267calculateTopPaddingD9Ej5fM();
                boolean changed = gapComposer.changed(f2) | gapComposer.changed(f) | gapComposer.changed(density) | gapComposer.changed(mo267calculateTopPaddingD9Ej5fM);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj4) {
                    rememberedValue = Integer.valueOf(density.mo230roundToPx0680j_4(((Dp) RangesKt___RangesKt.coerceAtLeast(new Dp((f - ((((f2 * 0.75f) / 1.5857725f) + 96.0f) + mo267calculateTopPaddingD9Ej5fM)) - 16.0f), new Dp(RecyclerView.DECELERATION_RATE))).value));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                int intValue = ((Number) rememberedValue).intValue();
                if (productDetailsPageViewModel == null) {
                    gapComposer.startReplaceGroup(530676756);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(530676757);
                    String str = productDetailsPageViewModel.paymentDeviceId;
                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(productDetailsPageViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new PaymentDeviceCustomizationViewKt$PaymentDeviceCustomizationView$5$1$1$3$2$1$1(function1, productDetailsPageViewModel, null, 1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14);
                    float f3 = ((Dp) mutableState.getValue()).value;
                    boolean changed3 = gapComposer.changed(intValue);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == obj4) {
                        rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda21(intValue, 5);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Modifier layout = ValueInsets.layout(companion, (Function3) rememberedValue3);
                    m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r3, new Pair[]{new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(m675copywmQWz5c$default)), new Pair(Float.valueOf(0.05f), new Color(j)), new Pair(Float.valueOf(1.0f), new Color(j))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                    Modifier background$default = ImageKt.background$default(layout, m132linearGradientmHitzGk, null, 6);
                    boolean changed4 = gapComposer.changed(function1);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue4 == obj4) {
                        rememberedValue4 = new SsnViewKt$$ExternalSyntheticLambda1(21, function1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function12 = (Function1) rememberedValue4;
                    boolean changed5 = gapComposer.changed(function1) | gapComposer.changedInstance(productDetailsPageViewModel);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue5 == obj4) {
                        rememberedValue5 = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda27(function1, productDetailsPageViewModel, 1);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    HeroSectionKt.m3444ProductDetailsPageContentjIwJxvA(productDetailsPageViewModel, background$default, true, f3, function12, (Function1) rememberedValue5, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            default:
                PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj6;
                Context context = (Context) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.padding(companion, paddingValues), f2, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m279heightInVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(companion, zzagn.rememberNestedScrollInteropConnection(gapComposer2), null);
                    GridCells.Fixed fixed = new GridCells.Fixed(3);
                    PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(8.0f, 8.0f, 8.0f, 8.0f);
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.Center;
                    boolean changedInstance = gapComposer2.changedInstance(personalizePaymentStickersViewModel) | gapComposer2.changedInstance(context) | gapComposer2.changed(f) | gapComposer2.changed(function1);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue6 == obj4) {
                        rememberedValue6 = new SliderKt$$ExternalSyntheticLambda8(f, context, personalizePaymentStickersViewModel, function1);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    LazyGridDslKt.LazyVerticalGrid(fixed, nestedScroll, null, paddingValuesImpl, arrangement$Center$1, arrangement$Center$1, null, false, null, (Function1) rememberedValue6, gapComposer2, 1772544, 916);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda31(float f, PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel, Context context, float f2, Function1 function1) {
        this.f$0 = f;
        this.f$2 = personalizePaymentStickersViewModel;
        this.f$4 = context;
        this.f$1 = f2;
        this.f$3 = function1;
    }
}

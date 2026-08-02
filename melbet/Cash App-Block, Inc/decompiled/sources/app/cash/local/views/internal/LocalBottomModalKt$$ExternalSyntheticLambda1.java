package app.cash.local.views.internal;

import androidx.camera.core.processing.TargetUtils;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.serialization.encoding.AbstractDecoder;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBottomModalKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LocalBottomModalKt$$ExternalSyntheticLambda1(LocalBottomModalViewModel localBottomModalViewModel, Function1 function1, int i) {
        this.$r8$classId = 0;
        this.f$0 = localBottomModalViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        float f = 1.0f;
        Object obj4 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$1;
        int i2 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) obj5;
                RowScope rowScope = (RowScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                rowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean z = localBottomModalViewModel.enabled;
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier align = localBottomModalViewModel.payload instanceof LocalBottomModalViewModel.Payload.OpenTabInfo ? rowScope.align(rowScope.weight(1.0f, companion, true), vertical) : rowScope.align(SizeKt.fillMaxWidth(companion, 1.0f), vertical);
                    boolean changed = gapComposer.changed(function1) | gapComposer.changed(i2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i2, 3, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, align, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(1242445578, new SliderDefaults$$ExternalSyntheticLambda3(localBottomModalViewModel, 23), gapComposer), gapComposer, 1573248, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    AbstractDecoder.NewsArticle(investingCryptoNewsArticleViewModel, i2, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ImmutableList immutableList = (ImmutableList) obj5;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    float m259getMaxWidthD9Ej5fM = immutableList.isEmpty() ? RecyclerView.DECELERATION_RATE : (boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() - ((immutableList.size() - 1) * 8.0f)) / immutableList.size();
                    Modifier selectableGroup = SelectableKt.selectableGroup(SizeKt.fillMaxWidth(companion, 1.0f));
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, selectableGroup);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(function0);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer3.startReplaceGroup(-191295772);
                    int i3 = 0;
                    for (Object obj6 : immutableList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        SchedulePaymentViewModel.FrequencyOption frequencyOption = (SchedulePaymentViewModel.FrequencyOption) obj6;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                        boolean changed2 = gapComposer3.changed(function1) | gapComposer3.changedInstance(frequencyOption);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue2 == obj4) {
                            rememberedValue2 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(29, function1, frequencyOption);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        QuickPayViewKt.FrequencyButton(0, gapComposer3, layoutWeightElement, frequencyOption.label, (Function0) rememberedValue2, i3 == i2);
                        i3 = i4;
                        f = 1.0f;
                    }
                    gapComposer3.end(false);
                    gapComposer3.end(true);
                    if (immutableList.isEmpty()) {
                        gapComposer3.startReplaceGroup(-1158699341);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1159365314);
                        State m155animateDpAsStateAjpBEmI = AnimateAsStateKt.m155animateDpAsStateAjpBEmI((m259getMaxWidthD9Ej5fM + 8.0f) * i2, TargetUtils.sharp$default((zzb) ((Motion) gapComposer3.consume(MotionKt.LocalMotion)).springs.text), null, null, gapComposer3, 0, 12);
                        Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, matchParentSize);
                        ComposeUiNode.Companion.getClass();
                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function02);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        boolean changed3 = gapComposer3.changed(m155animateDpAsStateAjpBEmI);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue3 == obj4) {
                            rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda10(m155animateDpAsStateAjpBEmI, 17);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.m290width3ABfNKs(OffsetKt.offset(companion, (Function1) rememberedValue3), m259getMaxWidthD9Ej5fM), 1.0f);
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        BoxKt.Box(ImageKt.m178borderxT4_qwU(fillMaxHeight, 1.0f, colors.semantic.background.brand, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer3, 0);
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalBottomModalKt$$ExternalSyntheticLambda1(int i, int i2, Object obj, Function1 function1) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = function1;
    }
}

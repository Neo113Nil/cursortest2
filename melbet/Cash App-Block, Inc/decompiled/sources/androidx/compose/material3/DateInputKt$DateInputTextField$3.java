package androidx.compose.material3;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.featuretoggle.UnleashContext;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.MainContainerDelegate;
import com.squareup.cash.work.viewmodels.PayHistoryStubViewModel;
import com.squareup.cash.work.viewmodels.TaxFormItemViewModel;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.franklin.investing.resources.Period;
import com.squareup.util.cash.Countries;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes3.dex */
public final class DateInputKt$DateInputTextField$3 implements Function2 {
    public final /* synthetic */ Object $errorText;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DateInputKt$DateInputTextField$3(Object obj, int i) {
        this.$r8$classId = i;
        this.$errorText = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.$errorText;
        switch (i2) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                MutableState mutableState = (MutableState) obj3;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (StringsKt.isBlank((CharSequence) mutableState.getValue())) {
                        gapComposer.startReplaceGroup(-1548950640);
                    } else {
                        gapComposer.startReplaceGroup(-327061465);
                        TextKt.m561TextNvy7gAk((String) mutableState.getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, gapComposer, 0, 0, 262142);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                UnleashContext unleashContext = (UnleashContext) obj3;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.m3c_dialog);
                    Modifier modifier = (Modifier) unleashContext.sessionId;
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AlertDialogKt.LocalBasicAlertDialogOverride;
                    Modifier m289sizeInqDBjuR0$default = SizeKt.m289sizeInqDBjuR0$default(modifier, 280.0f, RecyclerView.DECELERATION_RATE, 560.0f, RecyclerView.DECELERATION_RATE, 10);
                    boolean changed = gapComposer2.changed(m568getString2EP1pXo);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj4 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        androidx.compose.material.IconKt$$ExternalSyntheticLambda0 iconKt$$ExternalSyntheticLambda0 = new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(m568getString2EP1pXo, 7);
                        gapComposer2.updateRememberedValue(iconKt$$ExternalSyntheticLambda0);
                        obj4 = iconKt$$ExternalSyntheticLambda0;
                    }
                    Modifier then = m289sizeInqDBjuR0$default.then(SemanticsModifierKt.semantics(companion, false, (Function1) obj4));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer2);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer2.inserting || !Intrinsics.areEqual(gapComposer2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer2, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, (ComposableLambdaImpl) unleashContext.properties, gapComposer2, true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Number) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer3, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$12);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer3, true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                ExtendedSpans extendedSpans = (ExtendedSpans) obj3;
                AnnotatedString annotatedString = textLayoutResult.layoutInput.text;
                if (annotatedString.getStringAnnotations(0, "extended_spans_marker").isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$1("ExtendedSpans#extend(AnnotatedString) wasn't called for this Text().");
                    return null;
                }
                List list = extendedSpans.painters;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    RoundedCornerSpanPainter roundedCornerSpanPainter = (RoundedCornerSpanPainter) list.get(i3);
                    roundedCornerSpanPainter.getClass();
                    arrayList.add(new RoundedCornerSpanPainter$$ExternalSyntheticLambda0(roundedCornerSpanPainter, annotatedString.getStringAnnotations(annotatedString.text.length(), "rounded_corner_span"), textLayoutResult));
                }
                extendedSpans.drawInstructions = arrayList;
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Number) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, ((InvestingRecurringFrequencyPickerViewModel.Content.Option) obj3).frequency.getLabelResId()), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Number) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str = ((Period) obj3).label;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Number) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    String str2 = ((RecentChatHistoryViewModel$Loaded.Session) obj3).title;
                    if (str2 == null) {
                        str2 = re$$ExternalSyntheticOutline0.m(gapComposer6, 1041268654, R.string.moneybot_chat_history_item_default_title, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(1041268127);
                        gapComposer6.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Number) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    UtilsKt.m3677OffersStyledTextCnvfe3Y(null, (StyledText) obj3, ((com.squareup.cash.arcade.Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 1, null, 0, 0, gapComposer7, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Number) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    UtilsKt.m3677OffersStyledTextCnvfe3Y(null, ((OffersCommonOfferRowViewModel) obj3).rowViewModel.title, ((com.squareup.cash.arcade.Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 1, null, 0, 0, gapComposer8, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Number) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    int ordinal = ThemeHelpersKt.themeInfo((Context) obj3).theme.ordinal();
                    if (ordinal == 0) {
                        i = R.drawable.merchant_placeholder_light;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = R.drawable.merchant_placeholder_dark;
                    }
                    ImageKt.Image(Countries.painterResource(i, 0, gapComposer9), Room.stringResource(gapComposer9, R.string.placeholder_avatar), SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer9, Painter.$stable | 24960, 104);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Number) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj);
                gapComposer10.startReplaceGroup(803056131);
                MoleculePresenter moleculePresenter = (MoleculePresenter) ((MainContainerDelegate) obj3).toolbarPresenter$delegate.getValue();
                Object rememberedValue2 = gapComposer10.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CachedPagingDataKt$cachedIn$4(2, null, 12);
                    gapComposer10.updateRememberedValue(rememberedValue2);
                }
                TabToolbarInternalViewModel tabToolbarInternalViewModel = (TabToolbarInternalViewModel) moleculePresenter.models(new SafeFlow((Function2) rememberedValue2), gapComposer10, 0);
                gapComposer10.end(false);
                return tabToolbarInternalViewModel;
            case 11:
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj2;
                coroutineScope.getClass();
                variantSandboxedComponent.getClass();
                JobKt.launch$default(coroutineScope, null, null, new WorkflowNode$tick$1$1(variantSandboxedComponent, (CoroutineScope) obj3, (Continuation) null), 3);
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent2 = (VariantSandboxedComponent) obj2;
                coroutineScope2.getClass();
                variantSandboxedComponent2.getClass();
                ((DateInputKt$DateInputTextField$3) obj3).invoke(coroutineScope2, variantSandboxedComponent2);
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope3 = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent3 = (VariantSandboxedComponent) obj2;
                coroutineScope3.getClass();
                variantSandboxedComponent3.getClass();
                ((FieldBinding$$ExternalSyntheticLambda4) obj3).invoke(coroutineScope3, variantSandboxedComponent3);
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope4 = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent4 = (VariantSandboxedComponent) obj2;
                coroutineScope4.getClass();
                variantSandboxedComponent4.getClass();
                ((TooltipKt$TooltipBox$3) obj3).invoke(coroutineScope4, variantSandboxedComponent4);
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope5 = (CoroutineScope) obj;
                VariantSandboxedComponent variantSandboxedComponent5 = (VariantSandboxedComponent) obj2;
                coroutineScope5.getClass();
                variantSandboxedComponent5.getClass();
                ((FieldBinding$$ExternalSyntheticLambda4) obj3).invoke(coroutineScope5, variantSandboxedComponent5);
                return Unit.INSTANCE;
            case 16:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Number) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PayHistoryStubViewModel) obj3).payDate, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Number) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((TaxFormItemViewModel) obj3).title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}

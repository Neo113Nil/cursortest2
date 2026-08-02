package com.squareup.cash.music.views;

import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.camera.core.impl.utils.Threads;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.window.PopupProperties;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.presenters.plugins.PendingInput;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.screens.MoneybotTextInputAnswer;
import com.squareup.cash.moneybot.screens.MoneybotTextInputQuestion;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ProcessingIndicator;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.BriefViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlotContentViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SuggestionListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TextCardViewModel;
import com.squareup.cash.moneybot.views.card.FocusedHeader;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.plugins.ActionCardKt;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.SearchViewAction;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.home.OffersHomeViewKt;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cropview.Edge;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.Strings;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import xyz.block.genie.state.GenieRootViewState;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, TemplateCardPresenter templateCardPresenter) {
        this.$r8$classId = 11;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
        this.f$2 = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 19;
        Integer num = null;
        int i3 = 2;
        final int i4 = 1;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TrackRowKt.MusicSheetContent((MusicViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((CardProduct.Companion) obj4).Content((ActionCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((Error.Code.Companion) obj4).Content((BriefViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((WorkCookieJar) obj4).Content((CellActionCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((SizeMap) obj4).Content((GenieCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((Edge.Companion) obj4).Content((NavigationCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((Op.Companion) obj4).Content((PromptButtonListViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((CardProduct.Companion) obj4).Content((SlottedCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((Error.Code.Companion) obj4).Content((SuggestionListViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((WorkCookieJar) obj4).Content((TemplateCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((Edge.Companion) obj4).Content((TextCardViewModel) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) obj5;
                MoneybotTextInputQuestion moneybotTextInputQuestion = (MoneybotTextInputQuestion) obj;
                MoneybotTextInputAnswer moneybotTextInputAnswer = (MoneybotTextInputAnswer) obj2;
                moneybotTextInputQuestion.getClass();
                PendingInput pendingInput = (PendingInput) mutableState.getValue();
                PendingInput.Text text = pendingInput instanceof PendingInput.Text ? (PendingInput.Text) pendingInput : null;
                if (text != null) {
                    if (!text.question.equals(moneybotTextInputQuestion)) {
                        text = null;
                    }
                    if (text != null) {
                        if (moneybotTextInputAnswer instanceof MoneybotTextInputAnswer.Selected) {
                            mutableState2.setValue(MapsKt__MapsKt.plus((Map) mutableState2.getValue(), new Pair(text.placeholderKey, new SelectedInlineContentValue.Text(((MoneybotTextInputAnswer.Selected) moneybotTextInputAnswer).text))));
                            mutableState3.setValue(null);
                        }
                        mutableState.setValue(null);
                        break;
                    }
                }
                break;
            case 12:
                final FocusedHeader focusedHeader = (FocusedHeader) obj4;
                FocusedHeader focusedHeader2 = (FocusedHeader) obj3;
                List list = (List) obj5;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                subcomposeMeasureScope.getClass();
                if (focusedHeader == null) {
                    list = CollectionsKt__CollectionsJVMKt.listOf(focusedHeader2);
                }
                if (!list.isEmpty()) {
                    final FocusedHeader focusedHeader3 = (FocusedHeader) list.get(0);
                    Integer valueOf = Integer.valueOf(((Measurable) CollectionsKt.first(subcomposeMeasureScope.subcompose(focusedHeader3, new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i5 = r2;
                            FocusedHeader focusedHeader4 = focusedHeader3;
                            Composer composer = (Composer) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            switch (i5) {
                                case 0:
                                    return InsightChartKt.m3625$r8$lambda$BVcVxqijGYfi8CPmkVWgU4CKes(focusedHeader4, composer, intValue);
                                default:
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str = focusedHeader4.header;
                                        String str2 = focusedHeader4.largeValue;
                                        FocusedHeader.Description description = focusedHeader4.description;
                                        Color color = null;
                                        String str3 = description != null ? description.description : null;
                                        Icon icon = description != null ? description.icon : null;
                                        com.squareup.protos.cash.ui.Color color2 = description != null ? description.iconTintColor : null;
                                        if (color2 == null) {
                                            gapComposer.startReplaceGroup(-1843570624);
                                            gapComposer.end(false);
                                        } else {
                                            color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1187455969, color2, gapComposer, false);
                                        }
                                        InsightChartKt.m3627ChartHeaderContentjM_yU8I(str, str2, str3, icon, color, null, gapComposer, 0, 32);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, true, -1381278734)))).mo833measureBRTryo0(constraints.value).height);
                    int size = list.size() - 1;
                    if (1 <= size) {
                        int i5 = 1;
                        while (true) {
                            final FocusedHeader focusedHeader4 = (FocusedHeader) list.get(i5);
                            Integer valueOf2 = Integer.valueOf(((Measurable) CollectionsKt.first(subcomposeMeasureScope.subcompose(focusedHeader4, new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    int i52 = r2;
                                    FocusedHeader focusedHeader42 = focusedHeader4;
                                    Composer composer = (Composer) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    switch (i52) {
                                        case 0:
                                            return InsightChartKt.m3625$r8$lambda$BVcVxqijGYfi8CPmkVWgU4CKes(focusedHeader42, composer, intValue);
                                        default:
                                            GapComposer gapComposer = (GapComposer) composer;
                                            if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str = focusedHeader42.header;
                                                String str2 = focusedHeader42.largeValue;
                                                FocusedHeader.Description description = focusedHeader42.description;
                                                Color color = null;
                                                String str3 = description != null ? description.description : null;
                                                Icon icon = description != null ? description.icon : null;
                                                com.squareup.protos.cash.ui.Color color2 = description != null ? description.iconTintColor : null;
                                                if (color2 == null) {
                                                    gapComposer.startReplaceGroup(-1843570624);
                                                    gapComposer.end(false);
                                                } else {
                                                    color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1187455969, color2, gapComposer, false);
                                                }
                                                InsightChartKt.m3627ChartHeaderContentjM_yU8I(str, str2, str3, icon, color, null, gapComposer, 0, 32);
                                            } else {
                                                gapComposer.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, true, -1381278734)))).mo833measureBRTryo0(constraints.value).height);
                            if (valueOf2.compareTo(valueOf) > 0) {
                                valueOf = valueOf2;
                            }
                            if (i5 != size) {
                                i5++;
                            }
                        }
                    }
                    num = valueOf;
                }
                int intValue = num != null ? num.intValue() : 0;
                if (focusedHeader == null) {
                    focusedHeader = focusedHeader2;
                }
                Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope.subcompose("content", new ComposableLambdaImpl(new Function2() { // from class: com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        int i52 = i4;
                        FocusedHeader focusedHeader42 = focusedHeader;
                        Composer composer = (Composer) obj6;
                        int intValue2 = ((Integer) obj7).intValue();
                        switch (i52) {
                            case 0:
                                return InsightChartKt.m3625$r8$lambda$BVcVxqijGYfi8CPmkVWgU4CKes(focusedHeader42, composer, intValue2);
                            default:
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    String str = focusedHeader42.header;
                                    String str2 = focusedHeader42.largeValue;
                                    FocusedHeader.Description description = focusedHeader42.description;
                                    Color color = null;
                                    String str3 = description != null ? description.description : null;
                                    Icon icon = description != null ? description.icon : null;
                                    com.squareup.protos.cash.ui.Color color2 = description != null ? description.iconTintColor : null;
                                    if (color2 == null) {
                                        gapComposer.startReplaceGroup(-1843570624);
                                        gapComposer.end(false);
                                    } else {
                                        color = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1187455969, color2, gapComposer, false);
                                    }
                                    InsightChartKt.m3627ChartHeaderContentjM_yU8I(str, str2, str3, icon, color, null, gapComposer, 0, 32);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }, true, -1835633833)))).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, 0, 0, intValue, 0, 11));
                break;
            case 13:
                ((Integer) obj2).getClass();
                InsightChartKt.ChartHeader((ChatCardViewModel.InsightCard.Chart) obj4, (FocusedHeader) obj3, (ChatCardViewModel.InsightCard.Chart.Legend) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 14:
                MutableState mutableState4 = (MutableState) obj4;
                Function1 function1 = (Function1) obj3;
                ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) obj5;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, 200.0f, RecyclerView.DECELERATION_RATE, 2);
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(34.0f);
                    long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(-8.0f) & BodyPartID.bodyIdMax);
                    if (Strings.getColors(gapComposer).isLight) {
                        gapComposer.startReplaceGroup(1584482248);
                        j = Strings.getColors(gapComposer).semantic.background.f1047app;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1584579557);
                        j = Strings.getColors(gapComposer).semantic.background.subtle;
                        gapComposer.end(false);
                    }
                    long j2 = j;
                    boolean booleanValue = ((Boolean) mutableState4.getValue()).booleanValue();
                    PopupProperties popupProperties = new PopupProperties(true, 16);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda2(i2, mutableState4);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AndroidMenu_androidKt.m516DropdownMenuIlH_yew(booleanValue, (Function0) rememberedValue, m292widthInVpY3zN4$default, floatToRawIntBits, null, popupProperties, m340RoundedCornerShape0680j_4, j2, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-38782023, new PoolToastKt$$ExternalSyntheticLambda0(15, function1, managedActivityResultLauncher, mutableState4), gapComposer), gapComposer, 200112, 1808);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                CardViewApi21Impl.AttachmentMenuItem(Updater.updateChangedFlags(49), (Composer) obj, (Icons) obj3, (String) obj4, (Function0) obj5);
                break;
            case 16:
                Function0 function0 = (Function0) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                LazyListState lazyListState = (LazyListState) obj5;
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7));
                    boolean changed = gapComposer2.changed(function0) | gapComposer2.changedInstance(coroutineScope) | gapComposer2.changed(lazyListState);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BasicShieetScope$$ExternalSyntheticLambda10(i3, function0, coroutineScope, lazyListState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    CardViewApi21Impl.AutoScrollIcon(0, gapComposer2, m, (Function0) rememberedValue2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                zzacn.FeedbackOptionDropdown((MoneybotFeedbackViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ActionCardKt.ActionCardIcon((ActionCardViewModel.Icon) obj4, (Modifier) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                break;
            case 19:
                ((Integer) obj2).getClass();
                TextCardKt.GenieCard((GenieCardViewModel) obj4, (GenieLogger) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 20:
                KeyValueMap keyValueMap = (KeyValueMap) obj4;
                ViewPlan viewPlan = (ViewPlan) obj3;
                Modifier modifier = (Modifier) obj5;
                Composer composer3 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Threads.GenieView(viewPlan, modifier, keyValueMap != null ? new GenieRootViewState(keyValueMap) : null, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                SlottedCardKt.SlotContentHost((SlotContentViewModel) obj4, (String) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            case 22:
                ((Integer) obj2).getClass();
                TextCardKt.SuggestionList((SuggestionListViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                TextCardKt.TemplateCardButton((TemplateCardViewModel.TapBehavior.ButtonGroup.Button) obj4, (Modifier) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                PagerDefaults.ThinkingIndicator((Modifier) obj5, (ProcessingIndicator) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                KeypadKt.MooncakeShimmerBox((Modifier) obj5, (Alignment) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            case 26:
                ((Integer) obj2).getClass();
                UtilsKt.OffersGreenStatus((OffersGreenStatusViewModel) obj4, (Modifier) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 27:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj5;
                String str = (String) obj;
                List list2 = (List) obj2;
                str.getClass();
                list2.getClass();
                ((MutableState) obj3).setValue(new SearchViewAction.FilterRowClick(str, list2));
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                ((Function0) obj4).invoke();
                break;
            case 28:
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj5;
                Function1 function12 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-943662782, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(i2, offerDetailsSheetViewModel, function12), gapComposer4), gapComposer4, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                OffersHomeViewKt.OffersHome((Modifier) obj5, (OffersHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(int i, int i2, Modifier modifier, Object obj, Function function) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = function;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(RealImageLoader realImageLoader, OfferDetailsSheetViewModel offerDetailsSheetViewModel, Function1 function1) {
        this.$r8$classId = 28;
        this.f$0 = realImageLoader;
        this.f$2 = offerDetailsSheetViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function;
    }
}

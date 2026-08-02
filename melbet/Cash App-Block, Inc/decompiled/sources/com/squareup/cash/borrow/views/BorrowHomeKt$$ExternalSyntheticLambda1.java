package com.squareup.cash.borrow.views;

import android.content.Context;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.biometric.BiometricPrompt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.q2$$ExternalSyntheticLambda8;
import coil3.RealImageLoader;
import coil3.memory.RealStrongMemoryCache;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.filament.MaterialInstance;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.boost.backend.RealBoostSyncer;
import com.squareup.cash.boost.db.RewardMerchantQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$models$eventHandling$1$1$1;
import com.squareup.cash.businessaccount.kybrestriction.viewmodels.KybRestrictionBannerViewEvent;
import com.squareup.cash.buynowpaylater.components.SingleUsePaymentOrderDetailsView;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderDetailsViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.TextModel;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView$$ExternalSyntheticLambda8;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubRowItemView;
import com.squareup.cash.buynowpaylater.views.ImageUtilsKt;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2$CustomizationMode$Pattern$STAMP;
import com.squareup.cash.card.onboarding.CardStyleItemViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.core.instancing.CardScreenBounds;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.cashapplite.viewmodels.CashInRowViewModel;
import com.squareup.cash.cashapplite.viewmodels.LiteCashInViewEvent;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.RecipientConfig$Adapter;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.filament.Vector4Animator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.RewardsData;
import com.squareup.protos.franklin.ui.RewardSelection;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.protos.rewardly.ui.UiRewardSlot;
import com.squareup.protos.rewardly.ui.UiSelectedReward;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class BorrowHomeKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BorrowHomeKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        List list;
        List<String> list2;
        List<UiRewardSlot> list3;
        List<String> list4;
        List list5;
        List list6;
        List list7;
        int i = this.$r8$classId;
        int i2 = 17;
        int i3 = 2;
        int i4 = 20;
        int i5 = 21;
        int i6 = 3;
        int i7 = 1;
        Continuation continuation = null;
        int i8 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                BorrowHomeViewModel borrowHomeViewModel = (BorrowHomeViewModel) obj3;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj;
                lazyScaffoldContentScope.getClass();
                LazyListScope.item$default(lazyScaffoldContentScope, null, null, new ComposableLambdaImpl(new BorrowHomeKt$$ExternalSyntheticLambda0(lazyScaffoldContentScope, borrowHomeViewModel, false, 28), true, 1045405342), 3);
                ArrayList arrayList = borrowHomeViewModel.tileList;
                lazyScaffoldContentScope.$$delegate_0.items(arrayList.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(0, arrayList), new ComposableLambdaImpl(new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(arrayList, (Function1) obj2, false ? 1 : 0), true, 2039820996));
                return Unit.INSTANCE;
            case 1:
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries = ((RealBoostSyncer) obj3).activeRewardTokenOverrideQueries;
                sessionQueries.deleteAll();
                sessionQueries.getClass();
                sessionQueries.driver.execute(1043052947, "INSERT OR IGNORE INTO activeRewardOverride\nVALUES (?)", new BadgeKt$$ExternalSyntheticLambda3((String) obj2, r8));
                sessionQueries.notifyQueries(1043052947, new RewardQueries$$ExternalSyntheticLambda4(7));
                return Unit.INSTANCE;
            case 2:
                RealBoostSyncer realBoostSyncer = (RealBoostSyncer) obj3;
                RewardsData rewardsData = (RewardsData) obj2;
                realBoostSyncer.nonatomicResetRewards(rewardsData, false);
                if (rewardsData == null || (list7 = rewardsData.program_details) == null) {
                    linkedHashMap = null;
                } else {
                    List<UiRewardProgramDetails> list8 = list7;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    linkedHashMap = new LinkedHashMap(mapCapacity);
                    for (UiRewardProgramDetails uiRewardProgramDetails : list8) {
                        String str = uiRewardProgramDetails.reward_token;
                        str.getClass();
                        linkedHashMap.put(str, uiRewardProgramDetails);
                    }
                }
                if (rewardsData == null || (list6 = rewardsData.reward_selection_states) == null) {
                    linkedHashMap2 = null;
                } else {
                    List list9 = list6;
                    int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                    linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                    for (Object obj4 : list9) {
                        linkedHashMap2.put(((UiRewardSelectionState) obj4).reward_token, obj4);
                    }
                }
                if (rewardsData != null && (list5 = rewardsData.rewards) != null) {
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        UiReward uiReward = (UiReward) it.next();
                        final String str2 = uiReward.token;
                        str2.getClass();
                        UiRewardProgramDetails uiRewardProgramDetails2 = linkedHashMap != null ? (UiRewardProgramDetails) linkedHashMap.get(str2) : continuation;
                        final UiRewardSelectionState uiRewardSelectionState = linkedHashMap2 != null ? (UiRewardSelectionState) linkedHashMap2.get(str2) : continuation;
                        final RewardQueries rewardQueries = realBoostSyncer.rewardQueries;
                        final String str3 = uiReward.category;
                        final UiRewardAvatars uiRewardAvatars = uiReward.reward_avatars;
                        final String str4 = uiReward.title;
                        final String str5 = uiReward.main_text;
                        final List list10 = uiRewardProgramDetails2 != null ? uiRewardProgramDetails2.detail_rows : null;
                        final String str6 = uiRewardProgramDetails2 != null ? uiRewardProgramDetails2.styled_footer_text : null;
                        final List list11 = uiRewardProgramDetails2 != null ? uiRewardProgramDetails2.boost_details : null;
                        final List list12 = uiReward.boost_attributes;
                        final String str7 = uiReward.full_title_text;
                        final Long l = uiReward.expiration_date_time_ms;
                        Iterator it2 = it;
                        final Long l2 = uiReward.activation_date_time_ms;
                        final String str8 = uiReward.discount_text;
                        Boolean bool = uiReward.draggable;
                        final boolean booleanValue = bool != null ? bool.booleanValue() : true;
                        final String str9 = uiReward.affiliate_link_url;
                        final String str10 = uiReward.user_agent;
                        final String str11 = uiReward.offerly_token;
                        Boolean bool2 = uiReward.is_custom_offer;
                        final boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        final UiRewardProgramDetails.BottomUpsell bottomUpsell = uiRewardProgramDetails2 != null ? uiRewardProgramDetails2.bottom_upsell : null;
                        Boolean bool3 = uiReward.redeemable_with_cash_app_pay;
                        final boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                        Boolean bool4 = uiReward.redeemable_with_cash_card;
                        final boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                        final AppLinks appLinks = uiReward.app_links;
                        rewardQueries.getClass();
                        rewardQueries.driver.execute(1789778853, "INSERT INTO reward\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                AndroidStatement androidStatement = (AndroidStatement) obj5;
                                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, str2, 1, str3);
                                UiRewardAvatars uiRewardAvatars2 = uiRewardAvatars;
                                RewardQueries rewardQueries2 = rewardQueries;
                                androidStatement.bindBytes(2, uiRewardAvatars2 != null ? (byte[]) ((WireAdapter) rewardQueries2.rewardAdapter.avatarsAdapter).encode(uiRewardAvatars2) : null);
                                androidStatement.bindString(3, str4);
                                androidStatement.bindString(4, str5);
                                List list13 = list10;
                                androidStatement.bindBytes(5, list13 != null ? (byte[]) ((WireRepeatedAdapter) rewardQueries2.rewardAdapter.program_detail_rowsAdapter).encode(list13) : null);
                                androidStatement.bindString(6, str6);
                                List list14 = list11;
                                androidStatement.bindBytes(7, list14 != null ? (byte[]) ((WireRepeatedAdapter) rewardQueries2.rewardAdapter.boost_detail_rowsAdapter).encode(list14) : null);
                                List list15 = list12;
                                androidStatement.bindBytes(8, list15 != null ? (byte[]) ((WireRepeatedAdapter) rewardQueries2.rewardAdapter.boost_attributesAdapter).encode(list15) : null);
                                androidStatement.bindString(9, str7);
                                androidStatement.bindLong(10, l);
                                androidStatement.bindLong(11, l2);
                                androidStatement.bindString(12, str8);
                                UiRewardSelectionState uiRewardSelectionState2 = uiRewardSelectionState;
                                androidStatement.bindBytes(13, uiRewardSelectionState2 != null ? (byte[]) ((WireAdapter) rewardQueries2.rewardAdapter.reward_selection_stateAdapter).encode(uiRewardSelectionState2) : null);
                                androidStatement.bindBoolean(14, Boolean.valueOf(booleanValue));
                                androidStatement.bindString(15, str9);
                                androidStatement.bindString(16, str10);
                                androidStatement.bindString(17, str11);
                                androidStatement.bindBoolean(18, Boolean.valueOf(booleanValue2));
                                UiRewardProgramDetails.BottomUpsell bottomUpsell2 = bottomUpsell;
                                androidStatement.bindBytes(19, bottomUpsell2 != null ? (byte[]) ((WireAdapter) rewardQueries2.rewardAdapter.boost_detail_bottom_upsellAdapter).encode(bottomUpsell2) : null);
                                androidStatement.bindBoolean(20, Boolean.valueOf(booleanValue3));
                                androidStatement.bindBoolean(21, Boolean.valueOf(booleanValue4));
                                AppLinks appLinks2 = appLinks;
                                androidStatement.bindBytes(22, appLinks2 != null ? (byte[]) ((WireAdapter) rewardQueries2.rewardAdapter.app_linksAdapter).encode(appLinks2) : null);
                                return Unit.INSTANCE;
                            }
                        });
                        rewardQueries.notifyQueries(1789778853, new RewardQueries$$ExternalSyntheticLambda4(0));
                        for (String str12 : uiReward.merchant_tokens) {
                            SessionQueries sessionQueries2 = realBoostSyncer.rewardMerchantQueries;
                            String str13 = uiReward.merchant_name;
                            sessionQueries2.getClass();
                            str12.getClass();
                            sessionQueries2.driver.execute(1918448829, "INSERT OR REPLACE INTO rewardMerchant\nVALUES (?, ?, ?)", new RewardMerchantQueries$$ExternalSyntheticLambda3(str2, str12, str13, 0));
                            sessionQueries2.notifyQueries(1918448829, new RewardQueries$$ExternalSyntheticLambda4(12));
                        }
                        it = it2;
                        continuation = null;
                    }
                }
                int i9 = 19;
                if (rewardsData != null && (list4 = rewardsData.selectable_rewards_tokens) != null) {
                    for (String str14 : list4) {
                        RewardQueries rewardQueries2 = realBoostSyncer.selectableRewardQueries;
                        rewardQueries2.getClass();
                        str14.getClass();
                        rewardQueries2.driver.execute(607759919, "INSERT INTO selectableReward\nVALUES (?)", new BadgeKt$$ExternalSyntheticLambda3(str14, i9));
                        rewardQueries2.notifyQueries(607759919, new RewardQueries$$ExternalSyntheticLambda4(20));
                    }
                }
                if (rewardsData != null && (list3 = rewardsData.slots) != null) {
                    for (UiRewardSlot uiRewardSlot : list3) {
                        UiSelectedReward uiSelectedReward = uiRewardSlot.selected_reward;
                        if (uiSelectedReward != null) {
                            SessionQueries sessionQueries3 = realBoostSyncer.selectedRewardQueries;
                            String str15 = uiSelectedReward.token;
                            str15.getClass();
                            String str16 = uiSelectedReward.reward_token;
                            str16.getClass();
                            sessionQueries3.getClass();
                            sessionQueries3.driver.execute(455257098, "INSERT INTO selectedReward\nVALUES (?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str15, str16, 10));
                            sessionQueries3.notifyQueries(455257098, new RewardQueries$$ExternalSyntheticLambda4(21));
                        }
                        RewardSlotQueries rewardSlotQueries = realBoostSyncer.rewardSlotQueries;
                        String str17 = uiRewardSlot.token;
                        str17.getClass();
                        RewardSlotState rewardSlotState = uiRewardSlot.state;
                        rewardSlotState.getClass();
                        UiSelectedReward uiSelectedReward2 = uiRewardSlot.selected_reward;
                        String str18 = uiSelectedReward2 != null ? uiSelectedReward2.token : null;
                        rewardSlotQueries.getClass();
                        rewardSlotQueries.driver.execute(1887073607, "INSERT INTO rewardSlot\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(str17, (Object) rewardSlotQueries, (Object) rewardSlotState, str18, 1));
                        rewardSlotQueries.notifyQueries(1887073607, new RewardQueries$$ExternalSyntheticLambda4(i9));
                    }
                }
                if (rewardsData != null && (list2 = rewardsData.ordered_reward_tokens) != null) {
                    for (String str19 : list2) {
                        SessionQueries sessionQueries4 = realBoostSyncer.orderedRewardTokenQueries;
                        sessionQueries4.getClass();
                        str19.getClass();
                        sessionQueries4.driver.execute(703051811, "INSERT INTO orderedRewardToken\nVALUES (?)", new BadgeKt$$ExternalSyntheticLambda3(str19, 17));
                        sessionQueries4.notifyQueries(703051811, new RewardQueries$$ExternalSyntheticLambda4(9));
                    }
                }
                if (rewardsData != null && (list = rewardsData.reward_selections) != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        realBoostSyncer.nonatomicInsertRewardSelection((RewardSelection) it3.next());
                    }
                }
                return Unit.INSTANCE;
            case 3:
                List list13 = (List) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(16.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                float f = 0.0f;
                for (Object obj5 : list13) {
                    int i10 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    float f2 = (((BorrowLimitHubViewModel.ProgressBarSegment) obj5).percent * intBitsToFloat) + f;
                    float f3 = i8 == CollectionsKt__CollectionsKt.getLastIndex(list13) ? mo236toPx0680j_4 / 2.0f : 0.0f;
                    AndroidPath Path = AndroidPath_androidKt.Path();
                    AndroidPath.addRoundRect$default(Path, new RoundRect(f, RecyclerView.DECELERATION_RATE, f2, mo236toPx0680j_4, 0L, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax), 0L));
                    DrawScope.m745drawPathLG529CI$default(drawScope, Path, ((Color) arrayList2.get(i8)).value, RecyclerView.DECELERATION_RATE, null, 60);
                    f = f2;
                    i8 = i10;
                    mo236toPx0680j_4 = mo236toPx0680j_4;
                }
                return Unit.INSTANCE;
            case 4:
                String str20 = (String) obj;
                str20.getClass();
                ((Function1) obj2).invoke(new KybRestrictionBannerViewEvent.PrimaryActionEvent(str20, (KybEligibilityWarning.BannerDetail) obj3));
                return Unit.INSTANCE;
            case 5:
                StableCoroutineScope stableCoroutineScope = (StableCoroutineScope) obj3;
                NavigationCardPresenter navigationCardPresenter = (NavigationCardPresenter) obj2;
                KybRestrictionBannerViewEvent kybRestrictionBannerViewEvent = (KybRestrictionBannerViewEvent) obj;
                kybRestrictionBannerViewEvent.getClass();
                if (kybRestrictionBannerViewEvent instanceof KybRestrictionBannerViewEvent.ImpressionEvent) {
                    JobKt.launch$default(stableCoroutineScope, null, null, new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, i8), 3);
                } else if (kybRestrictionBannerViewEvent instanceof KybRestrictionBannerViewEvent.PrimaryActionEvent) {
                    JobKt.launch$default(stableCoroutineScope, null, null, new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, i7), 3);
                } else {
                    if (!(kybRestrictionBannerViewEvent instanceof KybRestrictionBannerViewEvent.SubtitleMarkdownActionEvent)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(stableCoroutineScope, null, null, new KybRestrictionBannerPresenter$models$eventHandling$1$1$1(navigationCardPresenter, kybRestrictionBannerViewEvent, continuation, i3), 3);
                }
                return Unit.INSTANCE;
            case 6:
                AfterPayOrderDetailsView afterPayOrderDetailsView = (AfterPayOrderDetailsView) obj3;
                ((ScrollView) obj).getClass();
                AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel showingOrderDetailsViewModel = (AfterPayOrderDetailsViewModel.ShowingOrderDetailsViewModel) ((AfterPayOrderDetailsViewModel) obj2);
                SingleUsePaymentOrderDetailsView singleUsePaymentOrderDetailsView = afterPayOrderDetailsView.singleUsePaymentOrderDetailsView;
                AppCompatImageView appCompatImageView = afterPayOrderDetailsView.infoTextIcon;
                FigmaTextView figmaTextView = afterPayOrderDetailsView.infoTextView;
                TimelineView timelineView = afterPayOrderDetailsView.timelineView;
                timelineView.setOnItemClickListener(new MaterialButton$$ExternalSyntheticLambda3(afterPayOrderDetailsView, i2));
                afterPayOrderDetailsView.orderDetailsHeaderView.setModel(showingOrderDetailsViewModel);
                TextModel textModel = showingOrderDetailsViewModel.balanceSummary;
                if (textModel != null) {
                    afterPayOrderDetailsView.remainingTextView.setModel(textModel);
                }
                timelineView.setModel(showingOrderDetailsViewModel.timelineModel);
                TextModel textModel2 = showingOrderDetailsViewModel.infoText;
                if (textModel2 != null) {
                    figmaTextView.setVisibility(0);
                    appCompatImageView.setVisibility(0);
                    ImageUtilsKt.applyTextModel(figmaTextView, textModel2, new AfterPayOrderDetailsView$$ExternalSyntheticLambda8(afterPayOrderDetailsView, 3));
                } else {
                    figmaTextView.setVisibility(8);
                    appCompatImageView.setVisibility(8);
                }
                TextModel textModel3 = showingOrderDetailsViewModel.orderDetailsTitle;
                if (textModel3 != null) {
                    ImageUtilsKt.applyTextModel(afterPayOrderDetailsView.purchaseDetailsTextView, textModel3, new CalendarRowKt$$ExternalSyntheticLambda10(14));
                }
                afterPayOrderDetailsView.purchaseDetailsView.setModel(showingOrderDetailsViewModel.orderDetailSections);
                SUPOrderDetailsViewModel sUPOrderDetailsViewModel = showingOrderDetailsViewModel.supOrderDetails;
                if (sUPOrderDetailsViewModel != null) {
                    singleUsePaymentOrderDetailsView.setVisibility(0);
                    singleUsePaymentOrderDetailsView.setModel(sUPOrderDetailsViewModel);
                }
                return Unit.INSTANCE;
            case 7:
                Context context = (Context) obj;
                context.getClass();
                AfterPayOrderHubRowItemView afterPayOrderHubRowItemView = new AfterPayOrderHubRowItemView(context, (RealImageLoader) obj3);
                afterPayOrderHubRowItemView.setBackgroundColor(ThemeHelpersKt.findThemeInfo(context).colorPalette.background);
                afterPayOrderHubRowItemView.setEventReceiver(new ShopHubResultsListKt$$ExternalSyntheticLambda21(i6, (Function1) obj2));
                return afterPayOrderHubRowItemView;
            case 8:
                float floatValue = ((Float) obj).floatValue();
                ((Ref$FloatRef) obj3).element = floatValue;
                MaterialInstance materialInstance = ((CardModelView) obj2).textMaterialInstance;
                if (materialInstance != null) {
                    materialInstance.setParameter("textureOffset", floatValue, RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationY((1.0f - ((Number) ((Animatable) obj3).getValue()).floatValue()) * ((ParcelableSnapshotMutableFloatState) ((MutableFloatState) obj2)).getFloatValue());
                return Unit.INSTANCE;
            case 10:
                PatternStampState patternStampState = (PatternStampState) obj2;
                ((Float) obj).getClass();
                ((SignatureState) obj3).clear();
                EmptyList emptyList = EmptyList.INSTANCE;
                patternStampState.originalStamps$delegate.setValue(emptyList);
                patternStampState.originalMinScales$delegate.setValue(emptyList);
                patternStampState.setStamps$customizations(emptyList);
                patternStampState.movingStamps$delegate.setValue(emptyList);
                patternStampState.customizationDeque.clear();
                return Unit.INSTANCE;
            case 11:
                PatternStampState patternStampState2 = (PatternStampState) obj2;
                ((Float) obj).getClass();
                if (!(((CardStudioViewModelV2.Content) obj3).customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP)) {
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    patternStampState2.originalStamps$delegate.setValue(emptyList2);
                    patternStampState2.originalMinScales$delegate.setValue(emptyList2);
                    patternStampState2.setStamps$customizations(emptyList2);
                    patternStampState2.movingStamps$delegate.setValue(emptyList2);
                    patternStampState2.customizationDeque.clear();
                }
                return Unit.INSTANCE;
            case 12:
                Placeable placeable = (Placeable) obj3;
                Constraints constraints = (Constraints) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, (Constraints.m1025getMaxWidthimpl(constraints.value) - placeable.width) / 2, (Constraints.m1024getMaxHeightimpl(constraints.value) - placeable.height) / 2, new CalendarRowKt$$ExternalSyntheticLambda10(r8), 4);
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((CardStyleItemViewModel) obj3).accessibilityText);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new ComposeDialogKt$$ExternalSyntheticLambda10(10, (Function0) obj2));
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState = (MutableState) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                LazyListScope.item$default(filterBarScope, null, null, CanvasKt.lambda$301236938, 3);
                int i11 = 0;
                for (Object obj6 : ((CardStylePickerViewModel) obj3).headers) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    String str21 = (String) obj6;
                    FilterBarScope.legacyChip$default(filterBarScope, new q2$$ExternalSyntheticLambda8(mutableState, i11, 9), null, false, i11 == ((Number) mutableState.getValue()).intValue(), null, str21, new ComposableLambdaImpl(new OpenSourceKt$$ExternalSyntheticLambda5(str21, i7), true, -1465278949), 22);
                    i11 = i12;
                }
                LazyListScope.item$default(filterBarScope, null, null, CanvasKt.lambda$979563187, 3);
                return Unit.INSTANCE;
            case 15:
                Lifecycle lifecycle = (Lifecycle) obj3;
                HeatRenderer heatRenderer = (HeatRenderer) obj2;
                ((DisposableEffectScope) obj).getClass();
                lifecycle.addObserver(heatRenderer);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i4, lifecycle, heatRenderer);
            case 16:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(i5, (CardScene) obj3, (Engine) obj2);
            case 17:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(22, (CardDesignLibraryScene) obj3, (Engine) obj2);
            case 18:
                State state = (State) obj2;
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                for (Object obj7 : (ArrayList) obj3) {
                    int i13 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Placeable placeable2 = (Placeable) obj7;
                    if (i8 < ((List) state.getValue()).size()) {
                        CardScreenBounds cardScreenBounds = (CardScreenBounds) ((List) state.getValue()).get(i8);
                        placementScope2.place(placeable2, MathKt__MathJVMKt.roundToInt(cardScreenBounds.left), MathKt__MathJVMKt.roundToInt(cardScreenBounds.top), RecyclerView.DECELERATION_RATE);
                    }
                    i8 = i13;
                }
                return Unit.INSTANCE;
            case 19:
                CardTheme cardTheme = (CardTheme) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindBytes(0, cardTheme != null ? (byte[]) ((RecipientConfig$Adapter) localTabContentQueries.local_tab_contentAdapter).request_dataAdapter.encode(cardTheme) : null);
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindBytes(0, (byte[]) ((RecipientConfig$Adapter) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).pay_dataAdapter.encode((TouchData) obj3));
                return Unit.INSTANCE;
            case 21:
                SlerpAnimator slerpAnimator = (SlerpAnimator) obj3;
                slerpAnimator.setCurrentFraction(((Number) ((Animatable) obj).getValue()).floatValue());
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((CardWobbleState) obj2).wobbleRotation;
                Object animatedValue = slerpAnimator.getAnimatedValue();
                animatedValue.getClass();
                parcelableSnapshotMutableState.setValue((Quat) animatedValue);
                return Unit.INSTANCE;
            case 22:
                Vector4Animator vector4Animator = (Vector4Animator) obj3;
                vector4Animator.setCurrentFraction(((Number) ((Animatable) obj).getValue()).floatValue());
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = ((CardWobbleState) obj2).wobbleTranslation;
                Object animatedValue2 = vector4Animator.getAnimatedValue();
                animatedValue2.getClass();
                parcelableSnapshotMutableState2.setValue((Vector4) animatedValue2);
                return Unit.INSTANCE;
            case 23:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(23, (HeartScene) obj3, (HeartScene) obj2);
            case 24:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(24, (MiniCardScene) obj3, (MiniCardScene) obj2);
            case 25:
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                long positionChangeInternal = PointerEventKt.positionChangeInternal(pointerInputChange, false);
                ((RealStrongMemoryCache) ((BiometricPrompt) obj3).mClientFragmentManager).m1456addPositionUv8p0NA(pointerInputChange.uptimeMillis, pointerInputChange.position);
                ((TagPoseController) obj2).onDrag(Float.intBitsToFloat((int) (positionChangeInternal >> 32)), Float.intBitsToFloat((int) (positionChangeInternal & BodyPartID.bodyIdMax)));
                pointerInputChange.consume();
                return Unit.INSTANCE;
            case 26:
                ((DisposableEffectScope) obj).getClass();
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(25, (WandScene) obj3, (WandScene) obj2);
            case 27:
                ((Function1) obj2).invoke(new Dp(((Density) obj3).mo233toDpu2uoSUM((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax))));
                return Unit.INSTANCE;
            case 28:
                ((CopyCodeState) obj).getClass();
                ((Function1) obj2).invoke(new LiteCashInViewEvent.CopyRowClicked((CashInRowViewModel) obj3));
                return Unit.INSTANCE;
            default:
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj3;
                ((TransactionWrapper) obj).getClass();
                localTabContentQueries2.driver.execute(1842742361, "DELETE FROM sync_entity", null);
                return localTabContentQueries2.driver.executeQuery(1842742362, "SELECT changes()", (Function1) obj2, 0, null);
        }
    }

    public /* synthetic */ BorrowHomeKt$$ExternalSyntheticLambda1(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }
}

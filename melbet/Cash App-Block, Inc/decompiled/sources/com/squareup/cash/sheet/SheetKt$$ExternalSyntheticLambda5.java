package com.squareup.cash.sheet;

import android.content.Context;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.molecule.PlatformKt;
import bo.app.j1$$ExternalSyntheticLambda14;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.SizeKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.text.InlineIconPosition;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.favorites.viewmodels.FavoriteState;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.StartPoolAmountKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.viewmodels.ChannelListViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda10;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.promotionsreferrals.views.PromotionsTitleBarKt;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.retro.views.SelectPaymentPlanViewKt;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewEvent$Action;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda21;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.support.chat.viewmodels.ChatExitPromptSheetViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.CardNuxState$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda5(StartPoolViewModel startPoolViewModel, Function1 function1, RealSheetState realSheetState) {
        this.$r8$classId = 1;
        this.f$0 = startPoolViewModel;
        this.f$2 = function1;
        this.f$1 = realSheetState;
    }

    private final Object invoke$com$squareup$cash$score$applets$views$ScoreAppletTileKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3) {
        final ScoreAppletTileViewModel scoreAppletTileViewModel = (ScoreAppletTileViewModel) this.f$0;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$1;
        final ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1 = (ScoreAppletViewsModule$$ExternalSyntheticLambda1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Loading;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(525506706);
                String str = ((ScoreAppletTileViewModel.Loading) scoreAppletTileViewModel).title;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.m3606LoadingServiceAppletTile942rkJo(str, (Function0) rememberedValue, 88.0f, appletTileAppearance.useRedesignedTiles, gapComposer, 432, 0);
                gapComposer.end(false);
            } else if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Installed) {
                gapComposer.startReplaceGroup(525824487);
                ScoreAppletTileViewModel.Installed installed = (ScoreAppletTileViewModel.Installed) scoreAppletTileViewModel;
                boolean changed = gapComposer.changed(scoreAppletViewsModule$$ExternalSyntheticLambda1) | gapComposer.changedInstance(scoreAppletTileViewModel);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new Function0() { // from class: com.squareup.cash.score.applets.views.ScoreAppletTileKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i2;
                            ScoreAppletTileViewModel scoreAppletTileViewModel2 = scoreAppletTileViewModel;
                            ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda12 = scoreAppletViewsModule$$ExternalSyntheticLambda1;
                            switch (i3) {
                                case 0:
                                    scoreAppletViewsModule$$ExternalSyntheticLambda12.invoke(new ScoreAppletTileViewEvent$Action(((ScoreAppletTileViewModel.Installed) scoreAppletTileViewModel2).action));
                                    break;
                                default:
                                    scoreAppletViewsModule$$ExternalSyntheticLambda12.invoke(new ScoreAppletTileViewEvent$Action(((ScoreAppletTileViewModel.Uninstalled) scoreAppletTileViewModel2).action));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ViewPropertyAnimatorListenerAdapter.InstalledScoreAppletTile(installed, (Function0) rememberedValue2, appletTileAppearance.useRedesignedTiles, gapComposer, 0);
                gapComposer.end(false);
            } else if (scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Uninstalled) {
                gapComposer.startReplaceGroup(526091459);
                ScoreAppletTileViewModel.Uninstalled uninstalled = (ScoreAppletTileViewModel.Uninstalled) scoreAppletTileViewModel;
                boolean changed2 = gapComposer.changed(scoreAppletViewsModule$$ExternalSyntheticLambda1) | gapComposer.changedInstance(scoreAppletTileViewModel);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new Function0() { // from class: com.squareup.cash.score.applets.views.ScoreAppletTileKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i3 = i;
                            ScoreAppletTileViewModel scoreAppletTileViewModel2 = scoreAppletTileViewModel;
                            ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda12 = scoreAppletViewsModule$$ExternalSyntheticLambda1;
                            switch (i3) {
                                case 0:
                                    scoreAppletViewsModule$$ExternalSyntheticLambda12.invoke(new ScoreAppletTileViewEvent$Action(((ScoreAppletTileViewModel.Installed) scoreAppletTileViewModel2).action));
                                    break;
                                default:
                                    scoreAppletViewsModule$$ExternalSyntheticLambda12.invoke(new ScoreAppletTileViewEvent$Action(((ScoreAppletTileViewModel.Uninstalled) scoreAppletTileViewModel2).action));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                ViewPropertyAnimatorListenerAdapter.UninstalledScoreAppletTile(uninstalled, (Function0) rememberedValue3, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(scoreAppletTileViewModel instanceof ScoreAppletTileViewModel.Failure)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1229975412, false);
                }
                gapComposer.startReplaceGroup(526294168);
                String str2 = ((ScoreAppletTileViewModel.Failure) scoreAppletTileViewModel).title;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new DateScrubber$$ExternalSyntheticLambda0(25);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                SharedUIKt.FailedAppletTile(48, gapComposer, str2, (Function0) rememberedValue4);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f$0;
        ButtonProminence buttonProminence = (ButtonProminence) this.f$1;
        String str = (String) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            SizeKt.ButtonCta(function0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(360849296, new SheetKt$$ExternalSyntheticLambda8(str, 27), gapComposer), gapComposer, 1572912, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3) {
        DirectoryListItem.Header header = (DirectoryListItem.Header) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        RealImageLoader realImageLoader = (RealImageLoader) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyGridItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(16.0f, 20.0f, 16.0f, 20.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShopHubResultsListKt$$ExternalSyntheticLambda21(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MooncakeHeaderViewKt.MooncakeHeaderView(header, fillMaxWidth, realImageLoader, paddingValuesImpl, (Ui.EventReceiver) rememberedValue, gapComposer, 3120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        DirectoryListItem.CardAvatarSectionViewModel cardAvatarSectionViewModel = (DirectoryListItem.CardAvatarSectionViewModel) this.f$0;
        RealImageLoader realImageLoader = (RealImageLoader) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyGridItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ShopMessageKt.CardAvatarSectionView(cardAvatarSectionViewModel, realImageLoader, function1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), gapComposer, 3072);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        DirectoryListItem.MessageSectionViewModel messageSectionViewModel = (DirectoryListItem.MessageSectionViewModel) this.f$0;
        RealImageLoader realImageLoader = (RealImageLoader) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyGridItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 24.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ShopMessageKt.ShopMessage(messageSectionViewModel, realImageLoader, m298padding3ABfNKs, (Function1) rememberedValue, gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$chat$views$ChatExitPromptSheetView$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        ChatExitPromptSheetViewModel chatExitPromptSheetViewModel = (ChatExitPromptSheetViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = ChatExitPromptSheetView.$r8$clinit;
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean z = chatExitPromptSheetViewModel instanceof ChatExitPromptSheetViewModel.Survey;
            float mo267calculateTopPaddingD9Ej5fM = z ? RecyclerView.DECELERATION_RATE : paddingValues.mo267calculateTopPaddingD9Ej5fM();
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape), RecyclerView.DECELERATION_RATE, mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), null, 3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z2 = chatExitPromptSheetViewModel instanceof ChatExitPromptSheetViewModel.Prompt;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2) {
                gapComposer.startReplaceGroup(967982193);
                ChatExitPromptSheetViewModel.Prompt prompt = (ChatExitPromptSheetViewModel.Prompt) chatExitPromptSheetViewModel;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda14(26, parcelableSnapshotMutableIntState);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                ChatExitPromptViewKt.ExitPromptContent(prompt, function1, (Function1) rememberedValue, gapComposer, MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            } else if (Intrinsics.areEqual(chatExitPromptSheetViewModel, ChatExitPromptSheetViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(967987956);
                ChatExitPromptViewKt.Loading(parcelableSnapshotMutableIntState.getIntValue(), 0, gapComposer);
                gapComposer.end(false);
            } else {
                if (!z) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 967980780, false);
                }
                gapComposer.startReplaceGroup(967990440);
                ChatSurveyViewModel chatSurveyViewModel = ((ChatExitPromptSheetViewModel.Survey) chatExitPromptSheetViewModel).surveyModel;
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ScoreHomeKt$$ExternalSyntheticLambda5(12, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ChatSurveyKt.ChatSurvey(chatSurveyViewModel, (Function1) rememberedValue2, gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$support$views$ScreenshotReviewViewKt$$ExternalSyntheticLambda40(Object obj, Object obj2, Object obj3) {
        ScreenshotReviewViewModel.Screenshot screenshot = (ScreenshotReviewViewModel.Screenshot) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Function1 function12 = (Function1) this.f$2;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ScreenshotReviewViewKt.ScreenshotRow(lazyItemScopeImpl, screenshot, function1, (CellDefaultAccessory) function12.invoke(screenshot), gapComposer, intValue & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$tax$applet$views$TaxesAppletTile$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        TaxesAppletTileModel taxesAppletTileModel = (TaxesAppletTileModel) this.f$0;
        TaxesAppletTile taxesAppletTile = (TaxesAppletTile) this.f$1;
        AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            gapComposer.skipToGroupEnd();
        } else if (taxesAppletTileModel instanceof TaxesAppletTileModel.Installed) {
            gapComposer.startReplaceGroup(386780703);
            taxesAppletTile.InstalledUI((TaxesAppletTileModel.Installed) taxesAppletTileModel, appletTileAppearance, gapComposer, 0);
            gapComposer.end(false);
        } else if (taxesAppletTileModel instanceof TaxesAppletTileModel.Uninstalled) {
            gapComposer.startReplaceGroup(386783253);
            taxesAppletTile.UninstalledUI((TaxesAppletTileModel.Uninstalled) taxesAppletTileModel, gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(taxesAppletTileModel instanceof TaxesAppletTileModel.Loading)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 386779875, false);
            }
            gapComposer.startReplaceGroup(-894532414);
            String stringResource = Room.stringResource(gapComposer, R.string.taxes_applet_tile_title);
            gapComposer.startReplaceGroup(-894126283);
            SharedUIKt.m3606LoadingServiceAppletTile942rkJo(stringResource, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick, 88.0f, appletTileAppearance.useRedesignedTiles, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer.end(false);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$AddMoneyViewKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        AddMoneyViewModel addMoneyViewModel = (AddMoneyViewModel) this.f$0;
        View view = (View) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String payWithGooglePayLabel = addMoneyViewModel.getPayWithGooglePayLabel();
            int i = 11;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (payWithGooglePayLabel == null) {
                gapComposer.startReplaceGroup(-1375942394);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1375942393);
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                boolean payWithGooglePayButtonEnabled = addMoneyViewModel.getPayWithGooglePayButtonEnabled();
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SizeKt.ButtonCta((Function0) rememberedValue, null, buttonProminence, false, payWithGooglePayButtonEnabled, null, Expect_jvmKt.rememberComposableLambda(242879051, new ShopErrorKt$$ExternalSyntheticLambda0(payWithGooglePayLabel, 5), gapComposer), gapComposer, 1573248, 42);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            boolean confirmationButtonEnabled = addMoneyViewModel.getConfirmationButtonEnabled();
            boolean changedInstance = gapComposer.changedInstance(view) | gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function1, 6);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, null, buttonProminence2, false, confirmationButtonEnabled, null, Expect_jvmKt.rememberComposableLambda(1497212275, new TaxReturnsViewKt$$ExternalSyntheticLambda5(addMoneyViewModel, i), gapComposer), gapComposer, 1573248, 42);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    private final Object invoke$com$squareup$cash$transfers$views$AddMoneyViewKt$$ExternalSyntheticLambda19(Object obj, Object obj2, Object obj3) {
        boolean z;
        AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem;
        Modifier modifier;
        Function1 function1;
        Modifier modifier2;
        Function0 function0;
        char c;
        NeverEqualPolicy neverEqualPolicy;
        Object j1__externalsyntheticlambda14;
        ArrayList arrayList;
        Object userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
        Modifier.Companion companion;
        AddMoneyViewModel.AtmPicker atmPicker = (AddMoneyViewModel.AtmPicker) this.f$0;
        Function1 function12 = (Function1) this.f$1;
        Function0 function02 = (Function0) this.f$2;
        InputChipGridScope inputChipGridScope = (InputChipGridScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inputChipGridScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inputChipGridScope) ? 4 : 2;
        }
        int i = intValue;
        char c2 = 18;
        ?? r14 = 1;
        boolean z2 = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            ArrayList arrayList2 = atmPicker.amountPickerItems;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            int i2 = 0;
            InputChipGridScope inputChipGridScope2 = inputChipGridScope;
            for (Object obj4 : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                AddMoneyViewModel.AtmPicker.AmountPickerItem amountPickerItem2 = (AddMoneyViewModel.AtmPicker.AmountPickerItem) obj4;
                if (amountPickerItem2 instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount) {
                    z = ((AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount) amountPickerItem2).enabled;
                } else {
                    if (!(amountPickerItem2 instanceof AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = ((AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom) amountPickerItem2).enabled;
                }
                boolean z3 = z;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier weight = inputChipGridScope2.weight(1.0f, companion2, r14);
                int size = atmPicker.amountPickerItems.size() - r14;
                NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                if (i2 == size) {
                    gapComposer.startReplaceGroup(-1912355036);
                    boolean changedInstance = gapComposer.changedInstance(amountPickerItem2) | gapComposer.changed(z3) | gapComposer.changed(function12) | gapComposer.changed(function02);
                    c = c2;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy2) {
                        function0 = function02;
                        neverEqualPolicy = neverEqualPolicy2;
                        amountPickerItem = amountPickerItem2;
                        companion = companion2;
                        function1 = function12;
                        modifier2 = weight;
                        userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(amountPickerItem, z3, function1, function0, 18);
                        gapComposer.updateRememberedValue(userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                    } else {
                        amountPickerItem = amountPickerItem2;
                        companion = companion2;
                        function1 = function12;
                        modifier2 = weight;
                        function0 = function02;
                        userJavascriptInterfaceBase$$ExternalSyntheticLambda25 = rememberedValue;
                        neverEqualPolicy = neverEqualPolicy2;
                    }
                    modifier = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) userJavascriptInterfaceBase$$ExternalSyntheticLambda25);
                    gapComposer.end(z2);
                } else {
                    amountPickerItem = amountPickerItem2;
                    modifier = companion2;
                    function1 = function12;
                    modifier2 = weight;
                    function0 = function02;
                    c = c2;
                    neverEqualPolicy = neverEqualPolicy2;
                    gapComposer.startReplaceGroup(-1911899832);
                    gapComposer.end(z2);
                }
                Modifier then = modifier2.then(modifier);
                boolean z4 = r14;
                String label = amountPickerItem.getLabel();
                boolean selected = amountPickerItem.getSelected();
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(amountPickerItem) | gapComposer.changed(i2) | gapComposer.changedInstance(atmPicker) | gapComposer.changed(function0);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    Function1 function13 = function1;
                    arrayList = arrayList3;
                    function12 = function13;
                    function02 = function0;
                    j1__externalsyntheticlambda14 = new j1$$ExternalSyntheticLambda14(function12, amountPickerItem, i2, atmPicker, function02, 5);
                    gapComposer.updateRememberedValue(j1__externalsyntheticlambda14);
                } else {
                    j1__externalsyntheticlambda14 = rememberedValue2;
                    function12 = function1;
                    function02 = function0;
                    arrayList = arrayList3;
                }
                InputChipGridScope inputChipGridScope3 = inputChipGridScope2;
                ArrayList arrayList4 = arrayList;
                boolean z5 = z2;
                GapComposer gapComposer2 = gapComposer;
                inputChipGridScope3.InputChip(label, then, (String) null, (Function0) j1__externalsyntheticlambda14, selected, z3, gapComposer2, 3670016 & (i << 18), 4);
                arrayList4.add(Unit.INSTANCE);
                c2 = c;
                r14 = z4;
                gapComposer = gapComposer2;
                z2 = z5;
                arrayList3 = arrayList4;
                inputChipGridScope2 = inputChipGridScope3;
                i2 = i3;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$InstrumentDetailsViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f$0;
        InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(1205459708, new TaxReturnsView$$ExternalSyntheticLambda1(11, instrumentDetailsViewModel, paddingValues, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$InstrumentLinkingOptionsSheetViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        RealImageLoader realImageLoader = (RealImageLoader) this.f$0;
        InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-793478116, new TaxReturnsView$$ExternalSyntheticLambda1(13, paddingValues, instrumentLinkingOptionsViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$WithdrawViewKt$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3) {
        InlineIconPosition inlineIconPosition;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) this.f$0;
        WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle = (WithdrawViewModel.ViewAmount.DepositPreferenceStyle) this.f$1;
        String str = (String) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((FlowRowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str2 = depositPreferenceOption.title;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Painter painter = Icons.InstantFill16.painter(gapComposer);
            int ordinal = depositPreferenceStyle.ordinal();
            if (ordinal == 0) {
                inlineIconPosition = InlineIconPosition.END;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                inlineIconPosition = InlineIconPosition.START;
            }
            zzacp.m2014InlineIconTextQqsJerU(str2, painter, null, 0L, inlineIconPosition, textStyle, j, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer, Painter.$stable << 3, 0, 32652);
            if (depositPreferenceStyle == WithdrawViewModel.ViewAmount.DepositPreferenceStyle.WITH_BUTTONS) {
                gapComposer.startReplaceGroup(1814610942);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, " · " + str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1814862724);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.AtmPicker atmPicker = (RecurringReloadConfigurationViewModel.AtmPicker) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Function0 function0 = (Function0) this.f$2;
        InputChipGridScope inputChipGridScope = (InputChipGridScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inputChipGridScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inputChipGridScope) ? 4 : 2;
        }
        int i = intValue;
        char c = 18;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            for (RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem : atmPicker.getAmountPickerItems()) {
                Modifier weight = inputChipGridScope.weight(1.0f, Modifier.Companion.$$INSTANCE, true);
                String label = amountPickerItem.getLabel();
                boolean selected = amountPickerItem.getSelected();
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(amountPickerItem) | gapComposer.changed(function0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda10(function1, amountPickerItem, function0, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                inputChipGridScope.InputChip(label, weight, (String) null, (Function0) rememberedValue, selected, false, (Composer) gapComposer, 3670016 & (i << 18), 36);
                c = c;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Function0 function0 = (Function0) this.f$2;
        InputChipGridScope inputChipGridScope = (InputChipGridScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        inputChipGridScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(inputChipGridScope) ? 4 : 2;
        }
        int i = intValue;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            for (RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem : selectScheduledAmountAtmPicker.amountPickerItems) {
                Modifier weight = inputChipGridScope.weight(1.0f, Modifier.Companion.$$INSTANCE, true);
                String label = amountPickerItem.getLabel();
                boolean selected = amountPickerItem.getSelected();
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(amountPickerItem) | gapComposer.changed(function0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda10(function1, amountPickerItem, function0, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                inputChipGridScope.InputChip(label, weight, (String) null, (Function0) rememberedValue, selected, false, (Composer) gapComposer, (i << 18) & 3670016, 36);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    private final Object invoke$com$squareup$cash$wallet$views$HeroCardNullStateKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        Object obj4;
        List list;
        Modifier wrapContentHeight;
        BiasAlignment.Horizontal horizontal;
        GapComposer gapComposer;
        GapComposer gapComposer2;
        ?? r10;
        Object obj5;
        boolean z;
        CardSchemeViewModel.CardNullStateBooklet.Content content = (CardSchemeViewModel.CardNullStateBooklet.Content) this.f$0;
        Function2 function2 = (Function2) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.CenterHorizontally;
        BiasAlignment.Horizontal horizontal3 = Alignment.Companion.Start;
        ((ScrollingScaffoldContentScope) obj).getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer3.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxSize, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(32.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal3, gapComposer3, 48);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean z2 = content.showCardGrid;
            List list2 = content.benefitsList;
            List list3 = content.rotatingCards;
            Object obj6 = Composer.Companion.Empty;
            if (!z2 || list3.size() < 6) {
                obj4 = obj6;
                list = list2;
                gapComposer3.startReplaceGroup(-736468292);
                wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                horizontal = horizontal3;
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(wrapContentHeight, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal2, gapComposer3, 54);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m300paddingVpY3zN4$default);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                function2.invoke(gapComposer3, 0);
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                ((DefaultSizes) gapComposer3.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 16.0f, 8.0f);
                List list4 = list3;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CardSchemeViewModel.Module.HeroCard) it.next()).cardDetails);
                }
                RevolvingInteractiveCardsKt.RevolvingInteractiveCards(m301paddingqDBjuR0, arrayList, ((CardSchemeViewModel.Module.HeroCard) CollectionsKt.first(list3)).use3D, null, null, true, false, ((CardSchemeViewModel.Module.HeroCard) CollectionsKt.first(list3)).disableFilament, false, gapComposer3, 196608, 344);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(true);
                ViewfinderKt.HeroHeader(content.title, (Modifier) null, content.body, (TextStyle) null, gapComposer4, 0, 10);
                gapComposer4.end(false);
                gapComposer = gapComposer4;
            } else {
                gapComposer3.startReplaceGroup(-737836167);
                CardTransitionKt.CardTransition("card_nux", gapComposer3, 6);
                CardNuxState rememberCardNuxState = CardTransitionKt.rememberCardNuxState(((CardSchemeViewModel.Module.HeroCard) CollectionsKt.first(list3)).cardDetails, gapComposer3);
                List take = CollectionsKt.take(list3, 6);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                Iterator it2 = take.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(RevolvingInteractiveCardsKt.toCardViewModelInternal(((CardSchemeViewModel.Module.HeroCard) it2.next()).cardDetails));
                }
                CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) rememberCardNuxState.lazyCardGridNuxScene.getValue();
                boolean changedInstance = gapComposer3.changedInstance(cardGridNuxScene) | gapComposer3.changedInstance(arrayList2);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changedInstance || rememberedValue == obj6) {
                    rememberedValue = new WorkflowNode$tick$1$1(cardGridNuxScene, arrayList2, null, 18);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                float[] fArr = CardGridNuxScene.X_AXIS;
                Updater.LaunchedEffect(cardGridNuxScene, arrayList2, (Function2) rememberedValue, gapComposer3);
                Engine engine = (Engine) rememberCardNuxState.lazySwampEngine.getValue();
                boolean changedInstance2 = gapComposer3.changedInstance(rememberCardNuxState);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj6) {
                    rememberedValue2 = new CardNuxState$$ExternalSyntheticLambda0(rememberCardNuxState, 3);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    z = false;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    z = false;
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j = colors.semantic.background.f1047app;
                Modifier aspectRatio = OffsetKt.aspectRatio(0.6f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), z);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, aspectRatio);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                Integer valueOf2 = Integer.valueOf(hashCode3);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer3, valueOf2, composeUiNode$Companion$SetModifier$17);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                obj4 = obj6;
                list = list2;
                FlowsKt.CardGridNux(androidx.compose.foundation.layout.SizeKt.fillMaxSize(companion, 1.0f), arrayList2, engine, cardGridNuxScene, function0, gapComposer3, 4614);
                GapComposer gapComposer5 = gapComposer3;
                Modifier background$default = ImageKt.background$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.Transparent), new Color(j)})), null, 6);
                ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(background$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal2, gapComposer5, 48);
                int hashCode4 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer5, m300paddingVpY3zN4$default2);
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer5, composeUiNode$Companion$SetModifier$17, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                Updater.m576setimpl(gapComposer5, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                content = content;
                ViewfinderKt.HeroHeader(content.title, (Modifier) null, content.body, (TextStyle) null, gapComposer5, 0, 10);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer5, true, true, false);
                horizontal = horizontal3;
                gapComposer = gapComposer5;
            }
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(-735264252);
                gapComposer.end(false);
                gapComposer2 = gapComposer;
            } else {
                gapComposer.startReplaceGroup(-735516034);
                List<CardSchemeViewModel.CardNullStateBooklet.BenefitItem> list5 = list;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (CardSchemeViewModel.CardNullStateBooklet.BenefitItem benefitItem : list5) {
                    arrayList3.add(new ListUnorderedItem(benefitItem.text, benefitItem.icon, null, null, 12));
                }
                GapComposer gapComposer6 = gapComposer;
                ListUnorderedKt.ListUnordered(Tags.toImmutableList(arrayList3), (Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, gapComposer6, 24576, 46);
                GapComposer gapComposer7 = gapComposer6;
                gapComposer7.end(false);
                gapComposer2 = gapComposer7;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal2)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 0);
            int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier5, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-1272679777);
            GapComposer gapComposer8 = gapComposer2;
            for (CardSchemeViewModel.CardNullStateBooklet.BookletTile bookletTile : content.bookletTiles) {
                if (bookletTile instanceof CardSchemeViewModel.CardNullStateBooklet.Grid) {
                    gapComposer8.startReplaceGroup(-1299636028);
                    CardSchemeViewModel.CardNullStateBooklet.Grid grid = (CardSchemeViewModel.CardNullStateBooklet.Grid) bookletTile;
                    String str = grid.title;
                    boolean changedInstance3 = gapComposer8.changedInstance(bookletTile);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    obj5 = obj4;
                    if (changedInstance3 || rememberedValue3 == obj5) {
                        rememberedValue3 = new AlertBannerKt$$ExternalSyntheticLambda3(grid, 18);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    BookletGridKt.BookletGrid(null, str, null, (Function1) rememberedValue3, gapComposer8, 0, 5);
                    gapComposer8.end(false);
                } else {
                    obj5 = obj4;
                    if (!(bookletTile instanceof CardSchemeViewModel.CardNullStateBooklet.Tile)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, -1299637982, false);
                    }
                    gapComposer8.startReplaceGroup(-1299627733);
                    CardSchemeViewModel.CardNullStateBooklet.Tile tile = (CardSchemeViewModel.CardNullStateBooklet.Tile) bookletTile;
                    Composer composer2 = gapComposer8;
                    BookletGridKt.m3424BookletTileeHTjO5g(null, tile.title, tile.body, tile.image, RecyclerView.DECELERATION_RATE, null, null, composer2, 24576, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                    gapComposer8 = composer2;
                    gapComposer8.end(false);
                }
                obj4 = obj5;
                gapComposer8 = gapComposer8;
            }
            gapComposer8.end(false);
            gapComposer8.end(true);
            CardSchemeViewModel.Module.Disclosure disclosure = content.disclosures;
            if (disclosure == null) {
                gapComposer8.startReplaceGroup(-734417612);
                gapComposer8.end(false);
            } else {
                gapComposer8.startReplaceGroup(-734417611);
                ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default4 = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    r10 = 0;
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                } else {
                    r10 = 0;
                    gapComposer8.startReplaceGroup(-1762997739);
                    gapComposer8.end(false);
                }
                ModalKt.HorizontalDivider(r10, r10, gapComposer8, ImageKt.m177backgroundbw27NRU(m300paddingVpY3zN4$default4, colors2.semantic.border.subtle, ColorKt.RectangleShape));
                UtilsKt.Disclosure(disclosure, function1, gapComposer8, r10);
                gapComposer8.end(r10);
            }
            gapComposer8.end(true);
        } else {
            gapComposer3.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        String str;
        Modifier wrapContentHeight;
        ScrollingScaffoldContentScope scrollingScaffoldContentScope;
        Shaker shaker;
        Function1 function1;
        ComposableLambdaImpl composableLambdaImpl;
        List list;
        int i2 = this.$r8$classId;
        int i3 = 12;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        final int i4 = 2;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                RealSheetState realSheetState = (RealSheetState) obj5;
                String str2 = (String) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paddingValues.mo264calculateBottomPaddingD9Ej5fM() + 16.0f, 7);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(realSheetState);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        i = 0;
                        rememberedValue = new SheetKt$$ExternalSyntheticLambda7(coroutineScope, realSheetState, i);
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        i = 0;
                    }
                    SizeKt.Button((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1302995024, new SheetKt$$ExternalSyntheticLambda8(str2, i), gapComposer), gapComposer, 1573296, 56);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj6;
                Function1 function12 = (Function1) obj4;
                RealSheetState realSheetState2 = (RealSheetState) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Modifier padding = SpacerKt.padding(OffsetKt.consumeWindowInsets(companion, Arrangement$End$1.current(gapComposer2).statusBars), paddingValues2);
                    if (startPoolViewModel instanceof StartPoolViewModel.Amount) {
                        gapComposer2.startReplaceGroup(113407387);
                        StartPoolAmountKt.StartPoolAmount((StartPoolViewModel.Amount) startPoolViewModel, function12, padding, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (startPoolViewModel instanceof StartPoolViewModel.Name) {
                        gapComposer2.startReplaceGroup(113410009);
                        PoolToastKt.StartPoolName((StartPoolViewModel.Name) startPoolViewModel, function12, padding, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (startPoolViewModel instanceof StartPoolViewModel.Submit) {
                        gapComposer2.startReplaceGroup(113412626);
                        PoolToastKt.StartPoolSubmit((StartPoolViewModel.Submit) startPoolViewModel, padding, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (startPoolViewModel instanceof StartPoolViewModel.Success) {
                        gapComposer2.startReplaceGroup(-779094296);
                        UserDismissMode userDismissMode = UserDismissMode.None;
                        realSheetState2.getClass();
                        realSheetState2.userDismissMode$delegate.setValue(userDismissMode);
                        PoolToastKt.StartPoolSuccess(padding, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(startPoolViewModel instanceof StartPoolViewModel.Error)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 113406143, false);
                        }
                        gapComposer2.startReplaceGroup(113423834);
                        PoolToastKt.StartPoolError((StartPoolViewModel.Error) startPoolViewModel, function12, padding, gapComposer2, 0);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function13 = (Function1) obj6;
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet) obj5;
                String str3 = (String) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer3.changed(function13) | gapComposer3.changedInstance(prepurchaseCardInfoSheet);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda11(i3, function13, prepurchaseCardInfoSheet);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.Button((Function0) rememberedValue2, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-675333697, new SheetKt$$ExternalSyntheticLambda8(str3, 21), gapComposer3), gapComposer3, 1573296, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj6;
                MutableState mutableState = (MutableState) obj5;
                Context context = (Context) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                boolean shouldExecute = gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16);
                Applier applier = gapComposer4.applier;
                if (shouldExecute) {
                    String stringResource = Room.stringResource(gapComposer4, R.string.open_source_title_content_description);
                    String stringResource2 = Room.stringResource(gapComposer4, R.string.open_source_title_action);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion2, 24.0f), 1.0f), new OpenSourceKt$$ExternalSyntheticLambda9(stringResource, stringResource2, ref$ObjectRef, mutableState, 0));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer4, 54);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, clearAndSetSemantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue3;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, companion2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String stringResource3 = Room.stringResource(gapComposer4, R.string.open_source_title1);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).numeralSmall, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer4, ValueInsets.onGloballyPositioned(ImageKt.m182clickableO2vRcR0$default(SpacerKt.m302paddingqDBjuR0$default(companion2, 6.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), mutableInteractionSourceImpl, null, false, null, null, new OpenSourceKt$$ExternalSyntheticLambda10(ref$ObjectRef, mutableState, 0), 28), new OpenSourceKt$$ExternalSyntheticLambda11(0, ref$ObjectRef, context)), ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).numeralSmall, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.open_source_heart), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).numeralSmall, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.open_source_s), (Map) null, (Function1) null, false);
                    gapComposer4.end(true);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).numeralSmall, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.open_source_title2), (Map) null, (Function1) null, false);
                    gapComposer4.end(true);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 2808, 0L, (Composer) gapComposer4, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 24.0f, 2), 1.0f), ((Typography) gapComposer4.consume(staticProvidableCompositionLocal)).labelMedium, new TextLineBalancing(1), Room.stringResource(gapComposer4, R.string.open_source_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj6;
                Function1 function14 = (Function1) obj5;
                ProfileViewModel.Loaded.ProfileHeader.FavoriteAction favoriteAction = (ProfileViewModel.Loaded.ProfileHeader.FavoriteAction) obj4;
                FavoriteState favoriteState = (FavoriteState) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                favoriteState.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(favoriteState.ordinal()) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    gapComposer5.skipToGroupEnd();
                } else if (favoriteState != FavoriteState.REQUEST_IN_FLIGHT) {
                    gapComposer5.startReplaceGroup(1407636662);
                    r15 = favoriteState != FavoriteState.FAVORITE ? 0 : 1;
                    Modifier testTag = TestTagKt.testTag(companion, r15 != 0 ? "unfavoriteButton" : "favoriteButton");
                    Icons icons = r15 != 0 ? Icons.FavoriteFill24 : Icons.NavigationFavorite;
                    String stringResource4 = Room.stringResource(gapComposer5, r15 != 0 ? R.string.unfavorite : R.string.favorite);
                    boolean changed2 = gapComposer5.changed(function14) | gapComposer5.changedInstance(favoriteAction);
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ProfileKt$$ExternalSyntheticLambda11((int) (null == true ? 1 : 0), (Object) function14, (Object) favoriteAction);
                        gapComposer5.updateRememberedValue(rememberedValue4);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource4, (Function0) rememberedValue4, testTag, null, null, null, null, null, false, gapComposer5, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(1409129777);
                    TransactorKt.CustomAction(titleBarActionScope, null, null, BadgeNameKt.lambda$2004763253, gapComposer5, 3072, 3);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                final ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton = (ProfileViewModel.Loaded.ProfileHeader.ActionButton) obj6;
                Function1 function15 = (Function1) obj5;
                final ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton2 = (ProfileViewModel.Loaded.ProfileHeader.ActionButton) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    if (actionButton != null) {
                        gapComposer6.startReplaceGroup(1115804343);
                        ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        boolean changed3 = gapComposer6.changed(function15);
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (changed3 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new ProfileKt$$ExternalSyntheticLambda0(11, function15);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        final Object[] objArr = null == true ? 1 : 0;
                        SizeKt.ButtonCta((Function0) rememberedValue5, horizontalWeight, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(-98644957, new Function3() { // from class: com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i5 = objArr;
                                ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton3 = actionButton;
                                switch (i5) {
                                    case 0:
                                        Composer composer7 = (Composer) obj8;
                                        int intValue7 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, actionButton3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer8 = (Composer) obj8;
                                        int intValue8 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer8 = (GapComposer) composer8;
                                        if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, actionButton3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer6), gapComposer6, 1573248, 56);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1116039199);
                        gapComposer6.end(false);
                    }
                    if (actionButton2 != null) {
                        gapComposer6.startReplaceGroup(1116100083);
                        ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        boolean changed4 = gapComposer6.changed(function15);
                        Object rememberedValue6 = gapComposer6.rememberedValue();
                        if (changed4 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new ProfileKt$$ExternalSyntheticLambda0(12, function15);
                            gapComposer6.updateRememberedValue(rememberedValue6);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue6, horizontalWeight2, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(514327194, new Function3() { // from class: com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                int i5 = r2;
                                ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton3 = actionButton2;
                                switch (i5) {
                                    case 0:
                                        Composer composer7 = (Composer) obj8;
                                        int intValue7 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, actionButton3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer8 = (Composer) obj8;
                                        int intValue8 = ((Integer) obj9).intValue();
                                        ((RowScope) obj7).getClass();
                                        GapComposer gapComposer8 = (GapComposer) composer8;
                                        if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, actionButton3.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer6), gapComposer6, 1573248, 56);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1116338783);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function16 = (Function1) obj6;
                ChannelListViewModel channelListViewModel = (ChannelListViewModel) obj5;
                Category.CategoryType.ChannelList channelList = (Category.CategoryType.ChannelList) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    List list2 = ((ChannelListViewModel.Loaded) channelListViewModel).sponsoredFamilyMembers;
                    list2.getClass();
                    SponsoredFamilyMember sponsoredFamilyMember = (SponsoredFamilyMember) list2.get(0);
                    ArrayList arrayList = channelList.channels;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Accessory accessory = ((Channel) it.next()).accessory;
                            Accessory.Toggle toggle = accessory instanceof Accessory.Toggle ? (Accessory.Toggle) accessory : null;
                            if (toggle != null && toggle.isToggledOn) {
                                z = true;
                                ChannelListViewKt.SponsoredAccountCellItem(function16, sponsoredFamilyMember, z, false, gapComposer7, 3072);
                            }
                        }
                    }
                    z = false;
                    ChannelListViewKt.SponsoredAccountCellItem(function16, sponsoredFamilyMember, z, false, gapComposer7, 3072);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel = (PromotionsReferralsHomeViewModel) obj6;
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                Function1 function17 = (Function1) obj4;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope2 = (ScrollingScaffoldContentScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                scrollingScaffoldContentScope2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(scrollingScaffoldContentScope2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    gapComposer8.skipToGroupEnd();
                } else if (promotionsReferralsHomeViewModel instanceof PromotionsReferralsHomeViewModel.Loading) {
                    gapComposer8.startReplaceGroup(-1876014245);
                    Modifier weight = scrollingScaffoldContentScope2.weight(1.0f, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, weight);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    PromotionsTitleBarKt.PromotionHomeLoading(gapComposer8, 0);
                    gapComposer8.end(true);
                    gapComposer8.end(false);
                } else {
                    if (!(promotionsReferralsHomeViewModel instanceof PromotionsReferralsHomeViewModel.Loaded)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, -476159521, false);
                    }
                    gapComposer8.startReplaceGroup(-1875901281);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-963057778, new CalloutKt$$ExternalSyntheticLambda0(r15, promotionsReferralsHomeViewModel, function17), gapComposer8), gapComposer8, 56);
                    gapComposer8.end(false);
                }
                return Unit.INSTANCE;
            case 8:
                ScrollState scrollState = (ScrollState) obj6;
                SelectPaymentPlanViewModel selectPaymentPlanViewModel = (SelectPaymentPlanViewModel) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = Recorder$$ExternalSyntheticOutline1.m(selectPaymentPlanViewModel.requiresFullScroll && scrollState.getCanScrollForward(), gapComposer9);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue7;
                    if (!scrollState.getCanScrollForward()) {
                        mutableState2.setValue(Boolean.FALSE);
                    }
                    SelectPaymentPlanViewModel.ButtonState buttonState = selectPaymentPlanViewModel.confirmButtonState;
                    Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    if (((Boolean) mutableState2.getValue()).booleanValue()) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer9, -767580988, R.string.retro_scroll_to_continue, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-767501411);
                        gapComposer9.end(false);
                        str = selectPaymentPlanViewModel.confirmButtonTitle;
                    }
                    String str4 = str;
                    if (((Boolean) mutableState2.getValue()).booleanValue() && (buttonState instanceof SelectPaymentPlanViewModel.ButtonState.Loaded)) {
                        buttonState = new SelectPaymentPlanViewModel.ButtonState.Loaded(false);
                    }
                    SelectPaymentPlanViewModel.ButtonState buttonState2 = buttonState;
                    boolean changed5 = gapComposer9.changed(function18);
                    Object rememberedValue8 = gapComposer9.rememberedValue();
                    if (changed5 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(18, function18);
                        gapComposer9.updateRememberedValue(rememberedValue8);
                    }
                    SelectPaymentPlanViewKt.SubmitButton((Function0) rememberedValue8, str4, buttonState2, fillMaxWidth3, gapComposer9, 3072);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                SavingsAppletTileViewModel savingsAppletTileViewModel = (SavingsAppletTileViewModel) obj6;
                Function0 function0 = (Function0) obj5;
                AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    gapComposer10.skipToGroupEnd();
                } else if (savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Installed) {
                    gapComposer10.startReplaceGroup(1055042386);
                    TypedValueCompat.InstalledUI((SavingsAppletTileViewModel.Installed) savingsAppletTileViewModel, appletTileAppearance, function0, gapComposer10, 0);
                    gapComposer10.end(false);
                } else if (savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Loading) {
                    gapComposer10.startReplaceGroup(1055044958);
                    SharedUIKt.LoadingBalanceAppletTile(((SavingsAppletTileViewModel.Loading) savingsAppletTileViewModel).title, function0, false, appletTileAppearance.useRedesignedTiles, gapComposer10, 0);
                    gapComposer10.end(false);
                } else {
                    if (!(savingsAppletTileViewModel instanceof SavingsAppletTileViewModel.Uninstalled)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 1055037866, false);
                    }
                    gapComposer10.startReplaceGroup(1055051496);
                    TypedValueCompat.UninstalledUI((SavingsAppletTileViewModel.Uninstalled) savingsAppletTileViewModel, function0, gapComposer10, 0);
                    gapComposer10.end(false);
                }
                return Unit.INSTANCE;
            case 10:
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) obj6;
                Shaker shaker2 = (Shaker) obj5;
                Function1 function19 = (Function1) obj4;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    SavingsScreenHeaderKt.IconAndLabel(0, gapComposer11, columnScope.weight(1.0f, companion, true), savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.iconId, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.iconLabel);
                    SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.balance;
                    wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    SavingsScreenHeaderKt.BalanceHeader(savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, wrapContentHeight, shaker2, function19, true, gapComposer11, 24624, 0);
                    SavingsScreenHeaderKt.GoalFooter(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.footer, function19, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(columnScope.weight(1.0f, companion, true), 1.0f), gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                SavingsScreenViewModel.Content content = (SavingsScreenViewModel.Content) obj6;
                Function1 function110 = (Function1) obj5;
                Function1 function111 = (Function1) obj4;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope3 = (ScrollingScaffoldContentScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                scrollingScaffoldContentScope3.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(scrollingScaffoldContentScope3) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer12, 1);
                    gapComposer12.startReplaceGroup(-1678145003);
                    for (final SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement : content.elements) {
                        String str5 = content.title;
                        final Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                        savingsScreenElement.getClass();
                        str5.getClass();
                        rememberShaker.getClass();
                        function110.getClass();
                        function111.getClass();
                        if (savingsScreenElement instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) {
                            gapComposer12.startReplaceGroup(1947538453);
                            scrollingScaffoldContentScope = scrollingScaffoldContentScope3;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1710004821, new CashMapViewKt$$ExternalSyntheticLambda15(savingsScreenElement, fillMaxWidth4, scrollingScaffoldContentScope, rememberShaker, function111), gapComposer12);
                            gapComposer12.end(false);
                            composableLambdaImpl = rememberComposableLambda;
                            shaker = rememberShaker;
                            function1 = function111;
                        } else {
                            scrollingScaffoldContentScope = scrollingScaffoldContentScope3;
                            if (savingsScreenElement instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) {
                                gapComposer12.startReplaceGroup(1947853103);
                                shaker = rememberShaker;
                                function1 = function111;
                                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-2037070444, new SwipeToDismissKt$$ExternalSyntheticLambda3((Object) savingsScreenElement, (Object) fillMaxWidth4, (Object) scrollingScaffoldContentScope, (Object) rememberShaker, function111, (Object) function110, 21), gapComposer12);
                                gapComposer12.end(false);
                            } else {
                                shaker = rememberShaker;
                                function1 = function111;
                                if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.TransferButtons) {
                                    gapComposer12.startReplaceGroup(1948232264);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(2021279027, new PoolGoalMetKt$$ExternalSyntheticLambda0(savingsScreenElement, shaker, function1, fillMaxWidth4), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.GoalFolderList) {
                                    gapComposer12.startReplaceGroup(1948370524);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1784661202, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, fillMaxWidth4, function1, i4), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard) {
                                    gapComposer12.startReplaceGroup(1948496322);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1548043377, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, function1, fillMaxWidth4), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.Card) {
                                    gapComposer12.startReplaceGroup(1948910544);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1311425552, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, fillMaxWidth4, function1, r9), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection) {
                                    gapComposer12.startReplaceGroup(1949132845);
                                    final Object[] objArr2 = null == true ? 1 : 0;
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1074807727, new Function2() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj7, Object obj8) {
                                            int i5 = objArr2;
                                            Modifier modifier = fillMaxWidth4;
                                            SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement2 = savingsScreenElement;
                                            Composer composer13 = (Composer) obj7;
                                            int intValue13 = ((Integer) obj8).intValue();
                                            switch (i5) {
                                                case 0:
                                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                                    if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenHeaderKt.BetweenSection((SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection) savingsScreenElement2, modifier, gapComposer13, 0, 0);
                                                    } else {
                                                        gapComposer13.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    GapComposer gapComposer14 = (GapComposer) composer13;
                                                    if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.WithinSection((SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection) savingsScreenElement2, modifier, gapComposer14, 0);
                                                    } else {
                                                        gapComposer14.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    GapComposer gapComposer15 = (GapComposer) composer13;
                                                    if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.SectionHeader((SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) savingsScreenElement2, modifier, gapComposer15, 0);
                                                    } else {
                                                        gapComposer15.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection) {
                                    gapComposer12.startReplaceGroup(1949233998);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(838189902, new Function2() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj7, Object obj8) {
                                            int i5 = r3;
                                            Modifier modifier = fillMaxWidth4;
                                            SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement2 = savingsScreenElement;
                                            Composer composer13 = (Composer) obj7;
                                            int intValue13 = ((Integer) obj8).intValue();
                                            switch (i5) {
                                                case 0:
                                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                                    if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenHeaderKt.BetweenSection((SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection) savingsScreenElement2, modifier, gapComposer13, 0, 0);
                                                    } else {
                                                        gapComposer13.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    GapComposer gapComposer14 = (GapComposer) composer13;
                                                    if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.WithinSection((SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection) savingsScreenElement2, modifier, gapComposer14, 0);
                                                    } else {
                                                        gapComposer14.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    GapComposer gapComposer15 = (GapComposer) composer13;
                                                    if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.SectionHeader((SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) savingsScreenElement2, modifier, gapComposer15, 0);
                                                    } else {
                                                        gapComposer15.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) {
                                    gapComposer12.startReplaceGroup(1949334190);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(601572077, new Function2() { // from class: com.squareup.cash.savings.views.SavingsScreenViewKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj7, Object obj8) {
                                            int i5 = i4;
                                            Modifier modifier = fillMaxWidth4;
                                            SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement2 = savingsScreenElement;
                                            Composer composer13 = (Composer) obj7;
                                            int intValue13 = ((Integer) obj8).intValue();
                                            switch (i5) {
                                                case 0:
                                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                                    if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenHeaderKt.BetweenSection((SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection) savingsScreenElement2, modifier, gapComposer13, 0, 0);
                                                    } else {
                                                        gapComposer13.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    GapComposer gapComposer14 = (GapComposer) composer13;
                                                    if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.WithinSection((SavingsScreenViewModel.Content.SavingsScreenElement.WithinSection) savingsScreenElement2, modifier, gapComposer14, 0);
                                                    } else {
                                                        gapComposer14.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    GapComposer gapComposer15 = (GapComposer) composer13;
                                                    if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                                        SavingsScreenViewKt.SectionHeader((SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) savingsScreenElement2, modifier, gapComposer15, 0);
                                                    } else {
                                                        gapComposer15.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.CellDefaultElement) {
                                    gapComposer12.startReplaceGroup(1949433080);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(364954252, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, fillMaxWidth4, function1, 5), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.ButtonGroup) {
                                    gapComposer12.startReplaceGroup(1949552957);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-701260400, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, fillMaxWidth4, function1, null == true ? 1 : 0), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.ActivitySection) {
                                    gapComposer12.startReplaceGroup(1949677143);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-937878225, new CalloutKt$$ExternalSyntheticLambda0(i3, savingsScreenElement, function1), gapComposer12);
                                    gapComposer12.end(false);
                                } else if (savingsScreenElement instanceof SavingsScreenViewModel.Content.SavingsScreenElement.Disclosure) {
                                    gapComposer12.startReplaceGroup(1949949726);
                                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1174496050, new SavingsScreenViewKt$$ExternalSyntheticLambda11(savingsScreenElement, fillMaxWidth4, function1, r15), gapComposer12);
                                    gapComposer12.end(false);
                                } else {
                                    gapComposer12.startReplaceGroup(1950044245);
                                    gapComposer12.end(false);
                                    composableLambdaImpl = ButtonGroupKt.f647lambda$109950412;
                                }
                            }
                        }
                        composableLambdaImpl.invoke((Object) gapComposer12, (Object) 0);
                        rememberShaker = shaker;
                        function111 = function1;
                        scrollingScaffoldContentScope3 = scrollingScaffoldContentScope;
                        r9 = 4;
                    }
                    gapComposer12.end(false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer12, null);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                return invoke$com$squareup$cash$score$applets$views$ScoreAppletTileKt$$ExternalSyntheticLambda9(obj, obj2, obj3);
            case 13:
                CashCreditScoreHomeData.RecommendationOverlayData recommendationOverlayData = (CashCreditScoreHomeData.RecommendationOverlayData) obj6;
                StyledCardViewModel styledCardViewModel = (StyledCardViewModel) obj5;
                Function1 function112 = (Function1) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    CalloutKt.RecommendationSheetContent(recommendationOverlayData, styledCardViewModel, function112, SpacerKt.padding(companion, paddingValues3), gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return invoke$com$squareup$cash$shopping$sup$views$SingleUsePaymentHalfSheetContentKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 15:
                return invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda12(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$shopping$views$search$ShopHubResultsListKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$support$chat$views$ChatExitPromptSheetView$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 19:
                return invoke$com$squareup$cash$support$views$ScreenshotReviewViewKt$$ExternalSyntheticLambda40(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$tax$applet$views$TaxesAppletTile$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$transfers$views$AddMoneyViewKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$transfers$views$AddMoneyViewKt$$ExternalSyntheticLambda19(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$transfers$views$InstrumentDetailsViewKt$$ExternalSyntheticLambda6(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$transfers$views$InstrumentLinkingOptionsSheetViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$transfers$views$WithdrawViewKt$$ExternalSyntheticLambda22(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$transfers$views$composer$RecurringReloadConfigurationComposersKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$transfers$views$composer$ScheduledReloadConfigurationComposersKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$wallet$views$HeroCardNullStateKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj6;
                Function1 function113 = (Function1) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    CardSchemeViewModel cardSchemeViewModel = walletHomeViewModel$WalletScheme.cardSchemeViewModel;
                    CardSchemeViewModel.Content content2 = cardSchemeViewModel instanceof CardSchemeViewModel.Content ? (CardSchemeViewModel.Content) cardSchemeViewModel : null;
                    List list3 = content2 != null ? content2.cardHomeActions : null;
                    if (list3 == null) {
                        list3 = EmptyList.INSTANCE;
                    }
                    if (!list3.isEmpty()) {
                        gapComposer14.startReplaceGroup(-1785177299);
                        WalletHomeViewKt.CombinedCardHomeActions(titleBarActionScope2, list3, function113, gapComposer14, intValue14 & 14);
                        gapComposer14.end(false);
                    } else if (content2 == null || (list = content2.overflowModules) == null || !(!list.isEmpty())) {
                        gapComposer14.startReplaceGroup(-1784721320);
                        gapComposer14.end(false);
                    } else {
                        gapComposer14.startReplaceGroup(-1784989036);
                        Modifier testTag2 = TestTagKt.testTag(companion, "Settings");
                        Icons icons2 = Icons.Settings24;
                        String stringResource5 = Room.stringResource(gapComposer14, R.string.overflow_menu);
                        Object rememberedValue9 = gapComposer14.rememberedValue();
                        if (rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new WalletHomeViewKt$$ExternalSyntheticLambda6(7, mutableState3);
                            gapComposer14.updateRememberedValue(rememberedValue9);
                        }
                        TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource5, (Function0) rememberedValue9, testTag2, null, null, null, null, null, false, gapComposer14, (intValue14 & 14) | 27696, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                        gapComposer14.end(false);
                    }
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda5(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}

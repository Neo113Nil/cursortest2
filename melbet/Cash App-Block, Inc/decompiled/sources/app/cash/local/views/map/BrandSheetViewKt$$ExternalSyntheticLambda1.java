package app.cash.local.views.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewModel;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.sheet.LoyaltySheetEvent;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.local.viewmodels.sheet.MenuPickerSheetModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.internal.ExpandableSectionStyle;
import app.cash.local.views.pos.LocalPosBrandOnboardingViewKt$WhenMappings;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountDocumentDownloaderDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.AccountFooterViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloaderViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.activity.viewmodels.ActivityCustomerModel;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewModel;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditStateType;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.afterpayapplet.views.AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda21;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$$ExternalSyntheticLambda22;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.InlineMessage;

/* loaded from: classes3.dex */
public final /* synthetic */ class BrandSheetViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(MenuPickerSheetModel menuPickerSheetModel, Function1 function1) {
        this.$r8$classId = 8;
        this.f$1 = menuPickerSheetModel;
        this.f$2 = function1;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda24(Object obj, Object obj2, Object obj3) {
        ContactHeaderViewModel contactHeaderViewModel = ((ActivityFeedEntry.QuickAccessBar) this.f$1).viewModel;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ActivityInviteItemViewModel activityInviteItemViewModel = contactHeaderViewModel.inviteItemViewModel;
            gapComposer.startReplaceGroup(-237357964);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (activityInviteItemViewModel instanceof ActivityInviteItemViewModel.Ready) {
                gapComposer.startReplaceGroup(-1845205933);
                createListBuilder.add(new AvatarCarouselEntry(((ActivityInviteItemViewModel.Ready) activityInviteItemViewModel).text, "invite_friends", ActivityTabViewKt.createInviteFriendsAvatar(gapComposer), Room.stringResource(gapComposer, R.string.activity_qab_offer_hint), 8));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1845130014);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-237351627);
            List<ActivityCustomerModel> list = contactHeaderViewModel.recipients;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ActivityCustomerModel activityCustomerModel : list) {
                AvatarViewModel avatarViewModel = activityCustomerModel.avatar;
                String str = avatarViewModel.displayName;
                if (str == null) {
                    str = activityCustomerModel.displayName;
                }
                createListBuilder.add(new AvatarCarouselEntry(str, activityCustomerModel.customerId, AvatarEntry.m3382copyDuSw1wk$default(AvatarsKt.toAvatarEntry(avatarViewModel, gapComposer), 0L, null, null, 239), Room.stringResource(gapComposer, R.string.activity_qab_avatar_hint), 8));
                arrayList.add(Boolean.TRUE);
            }
            gapComposer.end(false);
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(false);
            ImmutableList immutableList = Tags.toImmutableList(build);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DebugUtils.AvatarCarousel(immutableList, (Function1) rememberedValue, m302paddingqDBjuR0$default, null, gapComposer, 0, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda27(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$2;
        final ActivityFeedEntry.InviteFriendsItem inviteFriendsItem = (ActivityFeedEntry.InviteFriendsItem) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl composableLambdaImpl = com.squareup.cash.activity.views.AvatarsKt.lambda$753129536;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1160157023, new Function2() { // from class: com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    int i3 = i;
                    ActivityFeedEntry.InviteFriendsItem inviteFriendsItem2 = inviteFriendsItem;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inviteFriendsItem2.inviteTitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str = inviteFriendsItem2.inviteSubtitle;
                                if (str != null) {
                                    gapComposer3.startReplaceGroup(-1574668779);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1574618807);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl, rememberComposableLambda, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-692645351, new Function2() { // from class: com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    int i3 = i2;
                    ActivityFeedEntry.InviteFriendsItem inviteFriendsItem2 = inviteFriendsItem;
                    switch (i3) {
                        case 0:
                            Composer composer2 = (Composer) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inviteFriendsItem2.inviteTitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj4;
                            int intValue3 = ((Integer) obj5).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String str = inviteFriendsItem2.inviteSubtitle;
                                if (str != null) {
                                    gapComposer3.startReplaceGroup(-1574668779);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1574618807);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, push, 0L, null, gapComposer, 817889334, 0, 3444);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda28(Object obj, Object obj2, Object obj3) {
        ActivityFeedEntry.InlineAppMessage inlineAppMessage = (ActivityFeedEntry.InlineAppMessage) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(animateItem$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            InlineAppMessageViewModel.Ready ready = inlineAppMessage.appMessage;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InlineAppMessageKt.InlineAppMessage(ready, (Function1) rememberedValue, m302paddingqDBjuR0$default, gapComposer, 0);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda30(Object obj, Object obj2, Object obj3) {
        ActivityFeedEntry.CardAppMessage cardAppMessage = (ActivityFeedEntry.CardAppMessage) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(animateItem$default, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            CardAppMessageViewModel.Ready ready = cardAppMessage.appMessage;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(cardAppMessage);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CombinedModifier$$ExternalSyntheticLambda0(22, function1, cardAppMessage);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(m302paddingqDBjuR0$default, ready, function12, null, null, (Function1) rememberedValue2, gapComposer, 0, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$applets$views$AfterpayAppletTile$$ExternalSyntheticLambda16(Object obj, Object obj2, Object obj3) {
        Triple triple;
        FamilyAppletTile familyAppletTile = (FamilyAppletTile) this.f$1;
        AfterpayAppletTileViewModel.Installed.CreditState creditState = (AfterpayAppletTileViewModel.Installed.CreditState) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            CreditStateType creditStateType = creditState.creditState;
            familyAppletTile.getClass();
            int ordinal = creditStateType.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                gapComposer.startReplaceGroup(-1212532568);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                triple = new Triple(new Color(colors.semantic.text.brand), Icons.LogoAfterpay16, new Color(Color.White));
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1212535195, false);
                }
                gapComposer.startReplaceGroup(-1212529032);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Color color = new Color(colors2.surface.money.applet.asset.background);
                Icons icons = Icons.Alert24;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                triple = new Triple(color, icons, new Color(colors3.semantic.text.danger));
                gapComposer.end(false);
            }
            SharedUIKt.m3604FilledCircleWithIconJqkWdHE(((Color) triple.first).value, (Icons) triple.second, ((Color) triple.third).value, RecyclerView.DECELERATION_RATE, gapComposer, 0, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        Function0 function0;
        Function1 function1 = (Function1) this.f$2;
        AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection = (AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection) this.f$1;
        EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        embeddedHeaderScope.getClass();
        boolean z = embeddedHeaderScope.hasMore;
        int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(embeddedHeaderScope) ? 4 : 2;
        }
        int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1968996496, new AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8(embeddedActivitySection, i2), gapComposer);
            if (z) {
                gapComposer.startReplaceGroup(-2086232932);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2078598701, new AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda8(embeddedActivitySection, i), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            } else {
                gapComposer.startReplaceGroup(-2085934495);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            if (z) {
                gapComposer.startReplaceGroup(-2085831327);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ReceiptUiKt$$ExternalSyntheticLambda3(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                gapComposer.end(false);
                function0 = (Function0) rememberedValue;
            } else {
                gapComposer.startReplaceGroup(-2085752959);
                gapComposer.end(false);
                function0 = null;
            }
            ViewfinderDefaults.SectionHeader(rememberComposableLambda, (Modifier) null, composableLambdaImpl, function0, (Function2) null, gapComposer, 6, 18);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletTitleBarKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        boolean z;
        TappableIcon tappableIcon = (TappableIcon) this.f$1;
        Function0 function0 = (Function0) this.f$2;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (tappableIcon == null) {
            gapComposer.startReplaceGroup(-174862159);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-174862158);
            zzd zzdVar = Icons.Companion;
            String str = tappableIcon.arcadeIconId;
            zzdVar.getClass();
            Icons icons = zzd.get(str);
            if (icons == null) {
                gapComposer.startReplaceGroup(-249216582);
                gapComposer.end(false);
                z = false;
            } else {
                gapComposer.startReplaceGroup(-249216581);
                String str2 = tappableIcon.accessibilityText;
                if (str2 == null) {
                    str2 = "";
                }
                z = false;
                TransactorKt.IconAction(titleBarActionScope, icons, str2, function0, null, null, null, null, null, null, false, gapComposer, intValue & 14, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletUpsellSheetViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        AfterpayAppletUpsellSheetViewModel afterpayAppletUpsellSheetViewModel = (AfterpayAppletUpsellSheetViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            AfterpayAppletUpsellSheetViewModel.CtaButton ctaButton = afterpayAppletUpsellSheetViewModel.ctaButton;
            if (ctaButton == null) {
                gapComposer.startReplaceGroup(1783822787);
            } else {
                gapComposer.startReplaceGroup(1783822788);
                AfterpaySearchViewKt.SheetButton(ctaButton, function1, gapComposer, 0);
            }
            gapComposer.end(false);
            AfterpayAppletUpsellSheetViewModel.CtaButton ctaButton2 = afterpayAppletUpsellSheetViewModel.secondaryButton;
            if (ctaButton2 == null) {
                gapComposer.startReplaceGroup(1783906487);
            } else {
                gapComposer.startReplaceGroup(1783906488);
                AfterpaySearchViewKt.SheetButton(ctaButton2, function1, gapComposer, 0);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda30(Object obj, Object obj2, Object obj3) {
        final AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel upsellCardSectionViewModel = (AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel) this.f$1;
        final Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        final int i = 1;
        final int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel = upsellCardSectionViewModel.upsellCard;
            AfterpayAppletUpsellCardViewModel.CallToAction callToAction = afterpayAppletUpsellCardViewModel.callToAction;
            Function0 function0 = null;
            AfterpayAppletUpsellCardViewModel.CallToAction.Button button = callToAction instanceof AfterpayAppletUpsellCardViewModel.CallToAction.Button ? (AfterpayAppletUpsellCardViewModel.CallToAction.Button) callToAction : null;
            AfterpayAppletUpsellCardViewModel.ButtonViewModel buttonViewModel = button != null ? button.button : null;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(upsellCardSectionViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel upsellCardSectionViewModel2 = upsellCardSectionViewModel;
                        Function1 function12 = function1;
                        switch (i3) {
                            case 0:
                                function12.invoke(new AfterpaySearchViewEvent.UpsellCardViewed(upsellCardSectionViewModel2.upsellCard.viewAnalyticsEventSpec));
                                break;
                            default:
                                AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel2 = upsellCardSectionViewModel2.upsellCard;
                                function12.invoke(new AfterpaySearchViewEvent.UpsellCardTapped(afterpayAppletUpsellCardViewModel2.actionUrl, afterpayAppletUpsellCardViewModel2.tapAnalyticsEventSpecs));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(m302paddingqDBjuR0$default, (Function0) rememberedValue);
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(upsellCardSectionViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.UpsellCardSectionViewModel upsellCardSectionViewModel2 = upsellCardSectionViewModel;
                        Function1 function12 = function1;
                        switch (i3) {
                            case 0:
                                function12.invoke(new AfterpaySearchViewEvent.UpsellCardViewed(upsellCardSectionViewModel2.upsellCard.viewAnalyticsEventSpec));
                                break;
                            default:
                                AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel2 = upsellCardSectionViewModel2.upsellCard;
                                function12.invoke(new AfterpaySearchViewEvent.UpsellCardTapped(afterpayAppletUpsellCardViewModel2.actionUrl, afterpayAppletUpsellCardViewModel2.tapAnalyticsEventSpecs));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            if (buttonViewModel == null) {
                gapComposer.startReplaceGroup(327757900);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(327757901);
                boolean changed3 = gapComposer.changed(function1) | gapComposer.changedInstance(buttonViewModel);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda5(24, function1, buttonViewModel);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                function0 = (Function0) rememberedValue3;
                gapComposer.end(false);
            }
            AnalyticsMappersKt.AfterpayAppletUpsellCard(afterpayAppletUpsellCardViewModel, onVisible$default, function02, function0, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$homesection$RetroCellActivityKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        RetroTransaction retroTransaction = (RetroTransaction) this.f$1;
        Function2 function2 = (Function2) this.f$2;
        RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        realCellActivityAccessoryScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(realCellActivityAccessoryScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            LegalSectionKt.RetroAccessory(realCellActivityAccessoryScope, retroTransaction, function2, gapComposer, intValue & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$TransactionRowKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        realCellActivityAccessoryScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(realCellActivityAccessoryScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            AfterpayCardKt.TransactionAccessory(realCellActivityAccessoryScope, transactionRowViewModel, function1, gapComposer, intValue & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda14(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$2;
        SheetAppMessageModel.Loaded loaded = (SheetAppMessageModel.Loaded) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1) | gapComposer.changed(loaded);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SheetAppMessageView$$ExternalSyntheticLambda21(function1, loaded, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1097585456, new SheetAppMessageView$$ExternalSyntheticLambda22(loaded), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda25(Object obj, Object obj2, Object obj3) {
        SheetAppMessageModel.CtaButton ctaButton = (SheetAppMessageModel.CtaButton) this.f$1;
        SheetAppMessageModel.Loaded loaded = (SheetAppMessageModel.Loaded) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, SheetAppMessageView.m2982getTextColorXeAY9LY(loaded, gapComposer, 0), (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ctaButton.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3) {
        HeroNumericsHeader.BodyText bodyText = (HeroNumericsHeader.BodyText) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String translatedOrNull = ArcadeComponentProtoBindingKt.translatedOrNull(bodyText.markdown_text);
            if (translatedOrNull != null) {
                gapComposer.startReplaceGroup(1413005809);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z, 4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(translatedOrNull, (Function2) rememberedValue, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1413179192);
                Icons arcadeIcon = ArcadeComponentProtoBindingKt.toArcadeIcon(bodyText.icon);
                if (arcadeIcon == null) {
                    gapComposer.startReplaceGroup(1413219491);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1413219492);
                    Trace.m1191Iconww6aTOc(arcadeIcon, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f));
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(bodyText.text), (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Modifier wrapContentHeight;
        ButtonProminence buttonProminence;
        boolean z;
        int i2 = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        float f = 1.0f;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        final int i3 = 0;
        int i4 = 1;
        switch (i2) {
            case 0:
                BrandCollectionModel.Location location = (BrandCollectionModel.Location) obj6;
                Function1 function1 = (Function1) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                    BrandSheetViewKt.BrandSheetContent(SpacerKt.padding(companion, paddingValues), location, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LocalEditorialContent.Text text = (LocalEditorialContent.Text) obj6;
                Function1 function12 = (Function1) obj5;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    LocalAddBrandsViewKt.LocalEditorialText(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), text.value, function12, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                FulfillmentPickerViewModel fulfillmentPickerViewModel = (FulfillmentPickerViewModel) obj6;
                Function1 function13 = (Function1) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.padding(companion2, paddingValues2), null, 3);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, animateContentSize$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z2 = fulfillmentPickerViewModel instanceof FulfillmentPickerViewModel.Delivery;
                    if (z2) {
                        i = R.string.local_views_fulfillment_delivery_address;
                    } else {
                        if (!(fulfillmentPickerViewModel instanceof FulfillmentPickerViewModel.Pickup)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i = R.string.local_views_fulfillment_pickup_location;
                    }
                    Transformations.SheetHeader(Room.stringResource(gapComposer3, i), companion2, (Function2) null, (String) null, gapComposer3, 48, 12);
                    if (fulfillmentPickerViewModel instanceof FulfillmentPickerViewModel.Pickup) {
                        gapComposer3.startReplaceGroup(-1166316820);
                        FulfillmentRadioCellKt.PickupView(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), (FulfillmentPickerViewModel.Pickup) fulfillmentPickerViewModel, function13, gapComposer3, 54);
                        gapComposer3.end(false);
                    } else {
                        if (!z2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1166318060, false);
                        }
                        gapComposer3.startReplaceGroup(-1166311186);
                        FulfillmentRadioCellKt.DeliveryView(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), (FulfillmentPickerViewModel.Delivery) fulfillmentPickerViewModel, function13, gapComposer3, 54);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                SchedulingDayTimePickerViewModel.ModelState.LoadedDays loadedDays = (SchedulingDayTimePickerViewModel.ModelState.LoadedDays) obj6;
                Function1 function14 = (Function1) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 17) != 16)) {
                    FulfillmentRadioCellKt.SchedulingDayOptions(loadedDays.schedulingDays, loadedDays.selectedDay, function14, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                TextStyle textStyle = (TextStyle) obj5;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str = ((LocalBottomModalViewModel.Payload.ItemInfo) obj6).strokedAmountText;
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                if (str == null) {
                    gapComposer5.startReplaceGroup(440637673);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(440637674);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.disabled, (Composer) gapComposer5, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                Composer composer5 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), ((ExpandableSectionStyle) obj6).contentPadding);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer5, 0);
                GapComposer gapComposer6 = (GapComposer) composer5;
                int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer5, padding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer7.startReusableNode();
                if (gapComposer7.inserting) {
                    gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer7.useNode();
                }
                Updater.m576setimpl(composer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                ProvidedValue defaultProvidedValue$runtime = ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).bodySmall);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                } else {
                    gapComposer7.startReplaceGroup(-1762997739);
                    gapComposer7.end(false);
                }
                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(colors2.semantic.text.subtle, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(1463406781, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 7), composer5), composer5, 56);
                gapComposer7.end(true);
                return Unit.INSTANCE;
            case 6:
                LocalPosBrandOnboardingViewModel.CallToAction callToAction = (LocalPosBrandOnboardingViewModel.CallToAction) obj6;
                Function1 function15 = (Function1) obj5;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (gapComposer8.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    LocalPosBrandOnboardingViewModel.CallToAction.Style style = callToAction.style;
                    int i5 = LocalPosBrandOnboardingViewKt$WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
                    Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                    if (i5 == 3) {
                        gapComposer8.startReplaceGroup(-1478494878);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer8, 54);
                        int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, fillMaxWidth);
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
                        Updater.m576setimpl(gapComposer8, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer8, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), 24.0f);
                        Painter painter = Icons.CheckFill24.painter(gapComposer8);
                        long j = Strings.getColors(gapComposer8).semantic.icon.prominent;
                        ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer8, Painter.$stable | 25008, 40);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer8).semantic.text.standard, (Composer) gapComposer8, (Modifier) companion3, Strings.getTypography(gapComposer8).labelMedium, (TextLineBalancing) null, callToAction.label, (Map) null, (Function1) null, false);
                        gapComposer8.end(true);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-1477612742);
                        wrapContentHeight = SizeKt.wrapContentHeight(companion3, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(wrapContentHeight, 1.0f);
                        int ordinal = style.ordinal();
                        if (ordinal == 0) {
                            buttonProminence = ButtonProminence.PROMINENT;
                        } else {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$1("not happening");
                                }
                                return null;
                            }
                            buttonProminence = ButtonProminence.STANDARD;
                        }
                        ButtonProminence buttonProminence2 = buttonProminence;
                        boolean changed = gapComposer8.changed(function15);
                        Object rememberedValue = gapComposer8.rememberedValue();
                        if (changed || rememberedValue == obj4) {
                            rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(10, function15);
                            gapComposer8.updateRememberedValue(rememberedValue);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(192711785, new SliderDefaults$$ExternalSyntheticLambda3(callToAction, 26), gapComposer8), gapComposer8, 1572912, 56);
                        gapComposer8.end(false);
                    }
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LoyaltySheetModel loyaltySheetModel = (LoyaltySheetModel) obj6;
                final Function1 function16 = (Function1) obj5;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                paddingValues3.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer7).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer7;
                boolean shouldExecute = gapComposer9.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18);
                Applier applier = gapComposer9.applier;
                if (shouldExecute) {
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.padding(companion4, paddingValues3), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer9, 0);
                    int hashCode4 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer9, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(function0);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer9).semantic.text.prominent, (Composer) gapComposer9, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer9).sectionTitle, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, loyaltySheetModel.title, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer9).semantic.text.prominent, (Composer) gapComposer9, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer9).keypadTotal, (TextLineBalancing) null, String.valueOf(loyaltySheetModel.balance), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer9).semantic.text.prominent, (Composer) gapComposer9, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, 7), Strings.getTypography(gapComposer9).bodySmall, (TextLineBalancing) null, loyaltySheetModel.pointsLabel, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer9).semantic.text.standard, (Composer) gapComposer9, SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Strings.getTypography(gapComposer9).bodySmall, (TextLineBalancing) null, loyaltySheetModel.body, (Map) null, (Function1) null, false);
                    GapComposer gapComposer10 = gapComposer9;
                    gapComposer10.startReplaceGroup(-1126621299);
                    ArrayList arrayList = loyaltySheetModel.tiers;
                    int size = arrayList.size();
                    int i6 = 0;
                    GapComposer gapComposer11 = gapComposer10;
                    while (i6 < size) {
                        final LoyaltySheetModel.Tier tier = (LoyaltySheetModel.Tier) arrayList.get(i6);
                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion4, f), RecyclerView.DECELERATION_RATE, 8.0f, i4);
                        boolean z3 = tier.isEnabled;
                        boolean changed2 = gapComposer11.changed(function16) | gapComposer11.changedInstance(tier);
                        Object rememberedValue2 = gapComposer11.rememberedValue();
                        Object obj7 = rememberedValue2;
                        if (changed2 || rememberedValue2 == obj4) {
                            Object obj8 = new Function0() { // from class: app.cash.local.views.sheet.LoyaltySheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i7 = i3;
                                    LoyaltySheetModel.Tier tier2 = tier;
                                    Function1 function17 = function16;
                                    switch (i7) {
                                        case 0:
                                            function17.invoke(new LoyaltySheetEvent.SelectTier(tier2.token));
                                            break;
                                        default:
                                            function17.invoke(new LoyaltySheetEvent.SelectTier(tier2.token));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer11.updateRememberedValue(obj8);
                            obj7 = obj8;
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default2, z3, null, null, (Function0) obj7, 14);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer11, 48);
                        ArrayList arrayList2 = arrayList;
                        int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer11, m183clickableoSLSa3U$default);
                        ComposeUiNode.Companion.getClass();
                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                        gapComposer11.startReusableNode();
                        if (gapComposer11.inserting) {
                            gapComposer11.createNode(function02);
                        } else {
                            gapComposer11.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer11, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer11, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode5);
                        int i7 = size;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer11, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        int i8 = i6;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        LoyaltySheetModel loyaltySheetModel2 = loyaltySheetModel;
                        LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer11, materializeModifier5, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer11, 0);
                        BiasAlignment.Horizontal horizontal2 = horizontal;
                        Arrangement$Top$1 arrangement$Top$12 = arrangement$Top$1;
                        int hashCode6 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer11.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer11, m);
                        gapComposer11.startReusableNode();
                        if (gapComposer11.inserting) {
                            gapComposer11.createNode(function02);
                        } else {
                            gapComposer11.useNode();
                        }
                        Updater.m576setimpl(gapComposer11, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer11, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer11, composeUiNode$Companion$SetModifier$13, gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer11, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                        GapComposer gapComposer12 = gapComposer11;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer11).semantic.text.standard, (Composer) gapComposer12, (Modifier) null, Strings.getTypography(gapComposer11).bodySmall, (TextLineBalancing) null, tier.name, (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer12).semantic.text.subtle, (Composer) gapComposer12, (Modifier) null, Strings.getTypography(gapComposer12).bodySmall, (TextLineBalancing) null, tier.points, (Map) null, (Function1) null, false);
                        GapComposer gapComposer13 = gapComposer12;
                        gapComposer13.end(true);
                        boolean z4 = tier.isSelected;
                        boolean z5 = tier.isEnabled;
                        boolean changed3 = gapComposer13.changed(function16) | gapComposer13.changedInstance(tier);
                        Object rememberedValue3 = gapComposer13.rememberedValue();
                        if (changed3 || rememberedValue3 == obj4) {
                            z = true;
                            final boolean z6 = true ? 1 : 0;
                            rememberedValue3 = new Function0() { // from class: app.cash.local.views.sheet.LoyaltySheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i72 = z6;
                                    LoyaltySheetModel.Tier tier2 = tier;
                                    Function1 function17 = function16;
                                    switch (i72) {
                                        case 0:
                                            function17.invoke(new LoyaltySheetEvent.SelectTier(tier2.token));
                                            break;
                                        default:
                                            function17.invoke(new LoyaltySheetEvent.SelectTier(tier2.token));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer13.updateRememberedValue(rememberedValue3);
                        } else {
                            z = true;
                        }
                        ModalKt.Radio(z4, null, null, z5, (Function0) rememberedValue3, gapComposer13, 0, 6);
                        gapComposer13.end(z);
                        i6 = i8 + 1;
                        size = i7;
                        arrayList = arrayList2;
                        horizontal = horizontal2;
                        loyaltySheetModel = loyaltySheetModel2;
                        arrangement$Top$1 = arrangement$Top$12;
                        i4 = 1;
                        f = 1.0f;
                        i3 = 0;
                        gapComposer11 = gapComposer13;
                    }
                    LoyaltySheetModel loyaltySheetModel3 = loyaltySheetModel;
                    gapComposer11.end(i3);
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion4, 1.0f), RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5);
                    boolean z7 = loyaltySheetModel3.ctaEnabled;
                    boolean changed4 = gapComposer11.changed(function16);
                    Object rememberedValue4 = gapComposer11.rememberedValue();
                    Object obj9 = rememberedValue4;
                    if (changed4 || rememberedValue4 == obj4) {
                        Object brandSheetViewKt$$ExternalSyntheticLambda0 = new BrandSheetViewKt$$ExternalSyntheticLambda0(20, function16);
                        gapComposer11.updateRememberedValue(brandSheetViewKt$$ExternalSyntheticLambda0);
                        obj9 = brandSheetViewKt$$ExternalSyntheticLambda0;
                    }
                    coil3.size.SizeKt.Button((Function0) obj9, m302paddingqDBjuR0$default2, null, false, z7, null, Expect_jvmKt.rememberComposableLambda(-664208874, new SliderDefaults$$ExternalSyntheticLambda3(loyaltySheetModel3, 27), gapComposer11), gapComposer11, 1572912, 44);
                    gapComposer11.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                MenuPickerSheetModel menuPickerSheetModel = (MenuPickerSheetModel) obj6;
                Function1 function17 = (Function1) obj5;
                PaddingValues paddingValues4 = (PaddingValues) obj;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                paddingValues4.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer8).changed(paddingValues4) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer8;
                if (gapComposer14.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SpacerKt.padding(companion5, paddingValues4), 8.0f, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer14, 0);
                    int hashCode7 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer14, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion5, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 24.0f, 2);
                    String stringResource = Room.stringResource(gapComposer14, R.string.local_views_menu_picker_choose_your_menu);
                    Colors colors3 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors3.semantic.text.prominent, (Composer) gapComposer14, m302paddingqDBjuR0$default3, ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).tabTitle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    gapComposer14.startReplaceGroup(-1457883098);
                    List list = menuPickerSheetModel.menus;
                    int size2 = list.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        LocationMenu.Menu menu = (LocationMenu.Menu) list.get(i9);
                        if (i9 > 0) {
                            gapComposer14.startReplaceGroup(-2017625799);
                            ModalKt.HorizontalDivider(6, 0, gapComposer14, SpacerKt.m299paddingVpY3zN4(companion5, 12.0f, 8.0f));
                            gapComposer14.end(false);
                        } else {
                            gapComposer14.startReplaceGroup(-2017524894);
                            gapComposer14.end(false);
                        }
                        boolean changed5 = gapComposer14.changed(function17) | gapComposer14.changedInstance(menu);
                        Object rememberedValue5 = gapComposer14.rememberedValue();
                        if (changed5 || rememberedValue5 == obj4) {
                            rememberedValue5 = new n$$ExternalSyntheticLambda0(6, function17, menu);
                            gapComposer14.updateRememberedValue(rememberedValue5);
                        }
                        LoyaltySheetKt.MenuPickerRow(menu, (Function0) rememberedValue5, gapComposer14, 0);
                    }
                    gapComposer14.end(false);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function18 = (Function1) obj5;
                AccountDocumentsDownloaderViewModel accountDocumentsDownloaderViewModel = (AccountDocumentsDownloaderViewModel) obj6;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer9).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer9;
                if (gapComposer15.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changed6 = gapComposer15.changed(function18);
                    Object rememberedValue6 = gapComposer15.rememberedValue();
                    if (changed6 || rememberedValue6 == obj4) {
                        rememberedValue6 = new TabContentViewKt$$ExternalSyntheticLambda6(3, function18);
                        gapComposer15.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue6, null, false, Expect_jvmKt.rememberComposableLambda(-1744498588, new AccountDocumentDownloaderDialogViewKt$$ExternalSyntheticLambda2(accountDocumentsDownloaderViewModel, i4), gapComposer15), gapComposer15, ((intValue8 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                AccountFooterViewModel accountFooterViewModel = (AccountFooterViewModel) obj6;
                SettingVisibility settingVisibility = accountFooterViewModel.createBusinessAccountVisibility;
                Function1 function19 = (Function1) obj5;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer10;
                if (gapComposer16.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    SettingVisibility settingVisibility2 = accountFooterViewModel.createPersonalAccountVisibility;
                    SettingVisibility settingVisibility3 = SettingVisibility.HIDDEN;
                    if (settingVisibility != settingVisibility3) {
                        gapComposer16.startReplaceGroup(541512383);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean z8 = settingVisibility != SettingVisibility.DISABLED;
                        boolean changed7 = gapComposer16.changed(function19);
                        Object rememberedValue7 = gapComposer16.rememberedValue();
                        if (changed7 || rememberedValue7 == obj4) {
                            rememberedValue7 = new TabContentViewKt$$ExternalSyntheticLambda6(10, function19);
                            gapComposer16.updateRememberedValue(rememberedValue7);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue7, fillMaxWidth3, null, false, z8, null, AccountToDoKt.lambda$667925245, gapComposer16, 1572912, 44);
                        gapComposer16.end(false);
                    } else {
                        gapComposer16.startReplaceGroup(541889405);
                        gapComposer16.end(false);
                    }
                    if (settingVisibility2 != settingVisibility3) {
                        gapComposer16.startReplaceGroup(541985567);
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean z9 = settingVisibility2 != SettingVisibility.DISABLED;
                        boolean changed8 = gapComposer16.changed(function19);
                        Object rememberedValue8 = gapComposer16.rememberedValue();
                        if (changed8 || rememberedValue8 == obj4) {
                            rememberedValue8 = new TabContentViewKt$$ExternalSyntheticLambda6(11, function19);
                            gapComposer16.updateRememberedValue(rememberedValue8);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue8, fillMaxWidth4, null, false, z9, null, AccountToDoKt.f107lambda$2040587354, gapComposer16, 1572912, 44);
                        gapComposer16.end(false);
                    } else {
                        gapComposer16.startReplaceGroup(542362589);
                        gapComposer16.end(false);
                    }
                    Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed9 = gapComposer16.changed(function19);
                    Object rememberedValue9 = gapComposer16.rememberedValue();
                    if (changed9 || rememberedValue9 == obj4) {
                        rememberedValue9 = new TabContentViewKt$$ExternalSyntheticLambda6(12, function19);
                        gapComposer16.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue9, fillMaxWidth5, null, true, false, null, AccountToDoKt.f105lambda$1973947464, gapComposer16, 1575984, 52);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                AccountSwitcherViewModel accountSwitcherViewModel = (AccountSwitcherViewModel) obj6;
                Function1 function110 = (Function1) obj5;
                PaddingValues paddingValues5 = (PaddingValues) obj;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                paddingValues5.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer11).changed(paddingValues5) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer11;
                if (gapComposer17.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    BadgeTitleKt.AccountSwitcherContent(accountSwitcherViewModel, function110, SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues5), gapComposer17, 0, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ActivityEmbeddedViewModel.LoadingError loadingError = (ActivityEmbeddedViewModel.LoadingError) obj6;
                Function1 function111 = (Function1) obj5;
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer12).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer12;
                if (gapComposer18.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    gapComposer18.startReplaceGroup(202740793);
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, companion);
                    boolean changed10 = gapComposer18.changed(function111);
                    Object rememberedValue10 = gapComposer18.rememberedValue();
                    if (changed10 || rememberedValue10 == obj4) {
                        rememberedValue10 = new BalanceFeedKt$$ExternalSyntheticLambda4(5, function111);
                        gapComposer18.updateRememberedValue(rememberedValue10);
                    }
                    com.squareup.cash.activity.views.AvatarsKt.LoadingError(loadingError, (Function0) rememberedValue10, animateItem$default, gapComposer18, 0);
                    gapComposer18.end(false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda24(obj, obj2, obj3);
            case 14:
                ActivityFeedEntry.NewUserExperience newUserExperience = (ActivityFeedEntry.NewUserExperience) obj6;
                Function1 function112 = (Function1) obj5;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer13;
                if (gapComposer19.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ActivityTabViewKt.NewUserExperience(newUserExperience, function112, gapComposer19, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda27(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda28(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$activity$views$ActivityTabViewKt$$ExternalSyntheticLambda30(obj, obj2, obj3);
            case 18:
                return invoke$com$squareup$cash$afterpayapplet$applets$views$AfterpayAppletTile$$ExternalSyntheticLambda16(obj, obj2, obj3);
            case 19:
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj6;
                AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow allocationRow = (AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow) obj5;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer14;
                if (gapComposer20.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    familyAppletTile.m3526AllocationSegmentedCircleuFdPcIQ(allocationRow, RecyclerView.DECELERATION_RATE, false, gapComposer20, 0, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletPurchasesEmbeddedViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletTitleBarKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpayAppletUpsellSheetViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$afterpayapplet$views$AfterpaySearchViewKt$$ExternalSyntheticLambda30(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$afterpayapplet$views$homesection$RetroCellActivityKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$TransactionRowKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda14(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$appmessages$views$sheet$SheetAppMessageView$$ExternalSyntheticLambda25(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda12(obj, obj2, obj3);
            default:
                Image image = (Image) obj6;
                InlineMessage inlineMessage = (InlineMessage) obj5;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer15;
                if (gapComposer21.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String urlForTheme = ThemablesKt.urlForTheme(image, gapComposer21);
                    Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(urlForTheme, ArcadeComponentProtoBindingKt.translatedOrNull(inlineMessage.title_text), (RealImageLoader) gapComposer21.consume(LocalImageLoaderKt.LocalImageLoader), ImageKt.m177backgroundbw27NRU(fillMaxWidth6, colors4.semantic.background.subtle, ColorKt.RectangleShape), null, ContentScale.Companion.FillWidth, null, gapComposer21, 12582912, 0, 3952);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$2 = function1;
        this.f$1 = obj;
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(FulfillmentPickerViewModel fulfillmentPickerViewModel, Function1 function1) {
        this.$r8$classId = 2;
        this.f$1 = fulfillmentPickerViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(BrandCollectionModel.Location location, Function1 function1) {
        this.$r8$classId = 0;
        this.f$1 = location;
        this.f$2 = function1;
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(AccountSwitcherViewModel accountSwitcherViewModel, Function1 function1) {
        this.$r8$classId = 11;
        this.f$1 = accountSwitcherViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda1(SheetAppMessageModel.CtaButton ctaButton, SheetAppMessageView sheetAppMessageView, SheetAppMessageModel.Loaded loaded) {
        this.$r8$classId = 27;
        this.f$1 = ctaButton;
        this.f$2 = loaded;
    }
}

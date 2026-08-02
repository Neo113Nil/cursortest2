package com.squareup.cash.graphics.backend.gl;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.CornerPathEffect;
import android.icu.text.MessageFormat;
import android.view.SurfaceView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.navigation.compose.NavHostKt$NavHost$32;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import app.cash.versioned.VersionedKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.views.OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlDependencies;
import com.squareup.cash.family.familyhub.presenters.StocksControlPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.requestsponsorship.viewmodels.SponsorSuggestionSection;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.BaseModelView;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.investing.backend.real.InvestmentEntitySyncEntityStorageObserver;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.categories.InvestmentCategorySyncEntityStorageObserver;
import com.squareup.cash.investing.components.MooncakeInvestingStockRowView;
import com.squareup.cash.investing.components.categories.InvestingFilterResultRow;
import com.squareup.cash.investing.components.categories.InvestingSubFilterSelection;
import com.squareup.cash.investing.components.drip.DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.stock.details.SineWave;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.db.categories.CategoryQueries;
import com.squareup.cash.investing.db.categories.CategoryQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.merchant.views.MerchantBlockingViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4;
import com.squareup.cash.overlays.FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.protos.cash.marketdata.GetDiscoveryResponse;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityCategory;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityCategoryEntry;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.GetFeatureFlagsResponse;
import com.squareup.protos.franklin.common.FeatureFlag;
import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.protos.franklin.common.UnlinkInstrumentResponse;
import com.squareup.protos.franklin.investing.GetCustomerInvestmentSettingsResponse;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda12;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.http2.Huffman;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class GLSceneScope$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda10(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 26;
        int i3 = 16;
        int i4 = 15;
        int i5 = 7;
        int i6 = 8;
        int i7 = 23;
        int i8 = 24;
        int i9 = 10;
        final int i10 = 0;
        Continuation continuation = null;
        int i11 = 1;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                GLSceneScope gLSceneScope = (GLSceneScope) obj3;
                LightStateImpl lightStateImpl = (LightStateImpl) obj2;
                ((DisposableEffectScope) obj).getClass();
                gLSceneScope._lights.add(lightStateImpl);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(29, gLSceneScope, lightStateImpl);
            case 1:
                String str = (String) obj2;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies = ((StocksControlPresenter) obj3).deps;
                String str2 = baseDependentControlDependencies.stringManager.get(R.string.family_account_dependent_stock_investing_disabling_confirmation_dialog_title);
                AndroidStringManager androidStringManager = baseDependentControlDependencies.stringManager;
                ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str, "first_name", str);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_stock_investing_disabling_confirmation_dialog_message)).format(m);
                format2.getClass();
                return new ControlDisablingConfirmationScreen(str2, format2, androidStringManager.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.STOCKS, askedQuestion, 96);
            case 2:
                BlockerAction blockerAction = (BlockerAction) obj3;
                Function1 function1 = (Function1) obj2;
                AppMessageViewEvent appMessageViewEvent = (AppMessageViewEvent) obj;
                appMessageViewEvent.getClass();
                if ((appMessageViewEvent instanceof AppMessageViewEvent.AppMessageActionTaken) && blockerAction != null) {
                    function1.invoke(blockerAction);
                }
                return Unit.INSTANCE;
            case 3:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.stickyHeader$default(lazyListScope, null, SponsorRowViewKt.lambda$182395138, 3);
                List list = ((SelectContactMethodViewModel.Content) obj3).contactMethods;
                lazyListScope.items(list.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 17), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(9, (Function1) obj2, list), true, 802480018));
                return Unit.INSTANCE;
            case 4:
                SelectSponsorViewModel.SelectSponsor selectSponsor = (SelectSponsorViewModel.SelectSponsor) obj3;
                Function1 function12 = (Function1) obj2;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                String str3 = selectSponsor.addContactCardInlineText;
                String str4 = selectSponsor.addContactsCardContactButtonTitle;
                if (str3 != null && str4 != null) {
                    LazyListScope.item$default(lazyListScope2, null, null, new ComposableLambdaImpl(new OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda5(str3, function12, str4), true, -1904468255), 3);
                }
                if (selectSponsor.isNoResultsCardShown) {
                    LazyListScope.item$default(lazyListScope2, null, null, SponsorRowViewKt.lambda$1375668170, 3);
                }
                for (SponsorSuggestionSection sponsorSuggestionSection : selectSponsor.sections) {
                    sponsorSuggestionSection.getClass();
                    List list2 = sponsorSuggestionSection.suggestions;
                    function12.getClass();
                    if (!list2.isEmpty()) {
                        LazyListScope.stickyHeader$default(lazyListScope2, null, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(sponsorSuggestionSection, 13), true, 662333107), 3);
                    }
                    lazyListScope2.items(list2.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list2, 18), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(i9, function12, list2), true, 802480018));
                }
                return Unit.INSTANCE;
            case 5:
                AddFavoritesViewModel addFavoritesViewModel = (AddFavoritesViewModel) obj3;
                Function1 function13 = (Function1) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                for (Object obj4 : addFavoritesViewModel.sections) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    SectionViewModel sectionViewModel = (SectionViewModel) obj4;
                    final String str5 = sectionViewModel.name;
                    List list3 = sectionViewModel.favorites;
                    LazyListScope.stickyHeader$default(lazyListScope3, null, new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            ((Integer) obj6).getClass();
                            Composer composer = (Composer) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            ((LazyItemScopeImpl) obj5).getClass();
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                                if (i10 == 0) {
                                    gapComposer.startReplaceGroup(1210837005);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1210895626);
                                    gapComposer.end(false);
                                }
                                ViewfinderDefaults.SectionHeader(str5, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                                gapComposer.end(true);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1340516894), 3);
                    lazyListScope3.items(list3.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list3, 19), new ComposableLambdaImpl(new NavHostKt$NavHost$32(list3, function13, list3, addFavoritesViewModel, str5, 1), true, 802480018));
                    i10 = i12;
                }
                if (addFavoritesViewModel.searchQuery.getValue().length() == 0 && !addFavoritesViewModel.contactsPermissionGranted) {
                    LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new ErrorView$$ExternalSyntheticLambda3(i3, function13), true, 1121185483), 3);
                }
                return Unit.INSTANCE;
            case 6:
                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) obj3;
                ApiResult.Success success = (ApiResult.Success) obj2;
                JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new FormCashtag.AnonymousClass8.AnonymousClass2(realFeatureFlagManager, success, continuation, i4));
                InstrumentQueries instrumentQueries = realFeatureFlagManager.featureFlagQueries;
                instrumentQueries.driver.execute(706668973, "DELETE FROM featureFlags\nWHERE local = 0", null);
                instrumentQueries.notifyQueries(706668973, new OfflineQueries$$ExternalSyntheticLambda1(26));
                for (FeatureFlag featureFlag : ((GetFeatureFlagsResponse) success.response).feature_flags) {
                    String str6 = featureFlag.name;
                    str6.getClass();
                    instrumentQueries.insertRemote(str6, featureFlag);
                }
                realFeatureFlagManager.localFlags.getClass();
                EmptyIterator.INSTANCE.getClass();
                return Unit.INSTANCE;
            case 7:
                ScrollState scrollState = (ScrollState) obj3;
                ((Density) obj).getClass();
                return new IntOffset(((Number) ((State) obj2).getValue()).floatValue() == 1.0f ? (-scrollState.value$delegate.getIntValue()) & BodyPartID.bodyIdMax : 0L);
            case 8:
                InteractiveCardView interactiveCardView = (InteractiveCardView) obj;
                interactiveCardView.getClass();
                interactiveCardView.render((CardModelView.ViewModel) obj3);
                BaseModelView.setCameraPosition$default(interactiveCardView, 0.0d, 0.0d, 4.75d, 3, null);
                interactiveCardView.setCustomizationMask((Bitmap) obj2);
                return Unit.INSTANCE;
            case 9:
                MutableState mutableState = (MutableState) obj2;
                String str7 = (String) obj;
                str7.getClass();
                mutableState.setValue(((ArcadeFormMoneyInput) obj3).scrubber.scrub((String) mutableState.getValue(), str7));
                return Unit.INSTANCE;
            case 10:
                GLSceneScope gLSceneScope2 = (GLSceneScope) obj3;
                Triple triple = (Triple) obj2;
                ((DisposableEffectScope) obj).getClass();
                gLSceneScope2._renderables.add(triple);
                return new FakeOverlayLayerKt$FullWidthPopup$lambda$0$0$$inlined$onDispose$1(i11, gLSceneScope2, triple);
            case 11:
                EngineSurfaceViewTarget engineSurfaceViewTarget = (EngineSurfaceViewTarget) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                SurfaceView surfaceView = (SurfaceView) obj;
                surfaceView.getClass();
                if (((EngineSurfaceViewTarget) mutableState2.getValue()) != engineSurfaceViewTarget) {
                    surfaceView.getHolder().removeCallback((EngineSurfaceViewTarget) mutableState2.getValue());
                    surfaceView.getHolder().addCallback(engineSurfaceViewTarget);
                    mutableState2.setValue(engineSurfaceViewTarget);
                }
                return Unit.INSTANCE;
            case 12:
                TransfersPresenter transfersPresenter = (TransfersPresenter) obj3;
                String str8 = (String) obj2;
                PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) obj;
                passcodeDialogViewModel.getClass();
                return PasscodeDialogViewModel.copy$default(passcodeDialogViewModel, str8 != null ? transfersPresenter.getDefaultMessage() : transfersPresenter.stringManager.get(((CardBrandGuesser$Brand) transfersPresenter.initialTab) == CardBrandGuesser$Brand.BALANCE ? R.string.history_passcode_invalid_message_passcode : R.string.history_passcode_invalid_message_cvv), false, VersionedKt.update(passcodeDialogViewModel.resetInvalidInput, Unit.INSTANCE), 2);
            case 13:
                TransfersPresenter transfersPresenter2 = (TransfersPresenter) obj3;
                PasscodeDialogViewModel passcodeDialogViewModel2 = (PasscodeDialogViewModel) obj;
                passcodeDialogViewModel2.getClass();
                return PasscodeDialogViewModel.copy$default(passcodeDialogViewModel2, transfersPresenter2.stringManager.get(((ApiResult.Failure) obj2) instanceof ApiResult.Failure.NetworkFailure ? R.string.passcode_dialog_error_network : ((CardBrandGuesser$Brand) transfersPresenter2.initialTab) == CardBrandGuesser$Brand.BALANCE ? R.string.history_passcode_dialog_error_passcode : R.string.history_passcode_dialog_error_cvv), false, null, 10);
            case 14:
                ((TransactionWrapper) obj).getClass();
                InstrumentQueries instrumentQueries2 = ((RealInstrumentManager) obj3).profileQueries;
                instrumentQueries2.driver.execute(1114359387, "UPDATE profile\nSET verification_instrument_token = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(((UnlinkInstrumentResponse) ((ApiResult.Success) obj2).response).verification_instrument_token, 17));
                instrumentQueries2.notifyQueries(1114359387, new ProfileQueries$$ExternalSyntheticLambda4(i6));
                return Unit.INSTANCE;
            case 15:
                SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = (SelectPaymentInstrumentViewModel) obj3;
                LazyListScope lazyListScope4 = (LazyListScope) obj;
                lazyListScope4.getClass();
                LazyListScope.items$default(lazyListScope4, selectPaymentInstrumentViewModel.instruments.size(), new ActivityItemLayout$$ExternalSyntheticLambda4(i7), new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(i2, selectPaymentInstrumentViewModel, (ParcelableSnapshotMutableIntState) obj2), true, 405547269), 4);
                return Unit.INSTANCE;
            case 16:
                ((TransactionWrapper) obj).getClass();
                InvestmentEntityQueries investmentEntityQueries = ((InvestmentEntitySyncEntityStorageObserver) obj3).investmentEntityQueries;
                investmentEntityQueries.resetOrdering();
                int i13 = 0;
                for (Object obj5 : ((SyncInvestmentEntityRanking) obj2).investment_entity_tokens) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    String str9 = (String) obj5;
                    Long valueOf = Long.valueOf(i13);
                    investmentEntityQueries.getClass();
                    str9.getClass();
                    investmentEntityQueries.driver.execute(1861239178, "UPDATE investment_entity\nSET search_ordering = ?\nWHERE token = ?", new WebLoginConfigQueries$$ExternalSyntheticLambda3(valueOf, str9));
                    investmentEntityQueries.notifyQueries(1861239178, new InvestmentEntityQueries$$ExternalSyntheticLambda1(27));
                    i13 = i14;
                }
                return Unit.INSTANCE;
            case 17:
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                ((TransactionWrapper) obj).getClass();
                for (Map.Entry entry : ((Map) obj3).entrySet()) {
                    InvestmentEntityToken investmentEntityToken = (InvestmentEntityToken) entry.getKey();
                    CurrentPrice currentPrice = (CurrentPrice) entry.getValue();
                    String str10 = investmentEntityToken.value;
                    gpsConfigQueries.getClass();
                    str10.getClass();
                    currentPrice.getClass();
                    gpsConfigQueries.driver.execute(-1405678553, "INSERT OR REPLACE INTO investing_entity_price_cache\nVALUES (?, ?)", new GpsConfigQueries$$ExternalSyntheticLambda3(24, str10, gpsConfigQueries, currentPrice));
                    gpsConfigQueries.notifyQueries(-1405678553, new InvestmentEntityQueries$$ExternalSyntheticLambda1(i3));
                }
                return Unit.INSTANCE;
            case 18:
                RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) obj3;
                GetDiscoveryResponse getDiscoveryResponse = (GetDiscoveryResponse) obj2;
                InvestingDiscoveryQueries investingDiscoveryQueries = realInvestingSyncer.discoveryQueries;
                investingDiscoveryQueries.driver.execute(1783215651, "DELETE FROM investing_discovery", null);
                investingDiscoveryQueries.notifyQueries(1783215651, new InvestmentEntityQueries$$ExternalSyntheticLambda1(i4));
                int i15 = 0;
                for (Object obj6 : getDiscoveryResponse.categories) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    InvestmentEntityCategory investmentEntityCategory = (InvestmentEntityCategory) obj6;
                    for (InvestmentEntityCategoryEntry investmentEntityCategoryEntry : investmentEntityCategory.investment_entities) {
                        InvestingDiscoveryQueries investingDiscoveryQueries2 = realInvestingSyncer.discoveryQueries;
                        String str11 = investmentEntityCategory.name;
                        str11.getClass();
                        String str12 = investmentEntityCategory.description;
                        String str13 = investmentEntityCategoryEntry.investment_entity_token;
                        str13.getClass();
                        investingDiscoveryQueries2.insert(str11, i15, str13, str12, investmentEntityCategory.in_search_suggestion, false);
                    }
                    i15 = i16;
                }
                int i17 = 0;
                for (Object obj7 : getDiscoveryResponse.search_categories) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    InvestmentEntityCategory investmentEntityCategory2 = (InvestmentEntityCategory) obj7;
                    for (InvestmentEntityCategoryEntry investmentEntityCategoryEntry2 : investmentEntityCategory2.investment_entities) {
                        InvestingDiscoveryQueries investingDiscoveryQueries3 = realInvestingSyncer.discoveryQueries;
                        String str14 = investmentEntityCategory2.name;
                        str14.getClass();
                        String str15 = investmentEntityCategory2.description;
                        String str16 = investmentEntityCategoryEntry2.investment_entity_token;
                        str16.getClass();
                        investingDiscoveryQueries3.insert(str14, i17, str16, str15, investmentEntityCategory2.in_search_suggestion, true);
                    }
                    i17 = i18;
                }
                return Unit.INSTANCE;
            case 19:
                GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj2;
                final GpsConfigQueries gpsConfigQueries2 = ((RealInvestingSyncer) obj3).settingsQueries;
                gpsConfigQueries2.driver.execute(1590500097, "DELETE\nFROM investing_settings", null);
                gpsConfigQueries2.notifyQueries(1590500097, new InvestmentEntityQueries$$ExternalSyntheticLambda1(i7));
                final Money money = getCustomerInvestmentSettingsResponse.purchase_limit;
                final Money money2 = getCustomerInvestmentSettingsResponse.sell_limit;
                final String str17 = getCustomerInvestmentSettingsResponse.equities_discovery_url;
                final List list4 = getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles;
                final String str18 = getCustomerInvestmentSettingsResponse.bitcoin_discovery_url;
                final String str19 = getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url;
                final String str20 = getCustomerInvestmentSettingsResponse.my_watchlist_description;
                final String str21 = getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url;
                final LearnMoreConfiguration learnMoreConfiguration = getCustomerInvestmentSettingsResponse.my_first_stock_configuration;
                final LearnMoreConfiguration learnMoreConfiguration2 = getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration;
                final Money money3 = getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt;
                final Money money4 = getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt;
                final CustomOrderConfiguration customOrderConfiguration = getCustomerInvestmentSettingsResponse.custom_order_configuration;
                final String str22 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title;
                final String str23 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text;
                final String str24 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title;
                final String str25 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text;
                final String str26 = getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title;
                final String str27 = getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text;
                final String str28 = getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token;
                Boolean bool = getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled;
                final boolean booleanValue = bool != null ? bool.booleanValue() : false;
                final String str29 = getCustomerInvestmentSettingsResponse.investing_home_disclosure_text;
                final String str30 = getCustomerInvestmentSettingsResponse.entity_details_disclosure_text;
                final String str31 = getCustomerInvestmentSettingsResponse.documents_disclosure_text;
                final String str32 = getCustomerInvestmentSettingsResponse.drip_disclosure_text;
                gpsConfigQueries2.driver.execute(-1815047282, "INSERT INTO investing_settings\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new Function1() { // from class: com.squareup.cash.investing.db.InvestingSettingsQueries$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        AndroidStatement androidStatement = (AndroidStatement) obj8;
                        androidStatement.getClass();
                        Money money5 = Money.this;
                        GpsConfigQueries gpsConfigQueries3 = gpsConfigQueries2;
                        androidStatement.bindBytes(0, money5 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).application).encode(money5) : null);
                        Money money6 = money2;
                        androidStatement.bindBytes(1, money6 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).defaults).encode(money6) : null);
                        androidStatement.bindString(2, str17);
                        androidStatement.bindString(3, str18);
                        androidStatement.bindString(4, str19);
                        androidStatement.bindString(5, str20);
                        androidStatement.bindString(6, str21);
                        LearnMoreConfiguration learnMoreConfiguration3 = learnMoreConfiguration;
                        androidStatement.bindBytes(7, learnMoreConfiguration3 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).mainCoroutineContextLazy).encode(learnMoreConfiguration3) : null);
                        List list5 = list4;
                        androidStatement.bindBytes(8, list5 != null ? (byte[]) ((WireRepeatedAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).memoryCacheLazy).encode(list5) : null);
                        LearnMoreConfiguration learnMoreConfiguration4 = learnMoreConfiguration2;
                        androidStatement.bindBytes(9, learnMoreConfiguration4 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).diskCacheLazy).encode(learnMoreConfiguration4) : null);
                        Money money7 = money3;
                        androidStatement.bindBytes(10, money7 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).eventListenerFactory).encode(money7) : null);
                        Money money8 = money4;
                        androidStatement.bindBytes(11, money8 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).componentRegistry).encode(money8) : null);
                        CustomOrderConfiguration customOrderConfiguration2 = customOrderConfiguration;
                        androidStatement.bindBytes(12, customOrderConfiguration2 != null ? (byte[]) ((WireAdapter) ((ImageLoader$Builder) gpsConfigQueries3.gpsConfigAdapter).extras).encode(customOrderConfiguration2) : null);
                        androidStatement.bindString(13, str22);
                        androidStatement.bindString(14, str23);
                        androidStatement.bindString(15, str24);
                        androidStatement.bindString(16, str25);
                        androidStatement.bindString(17, str26);
                        androidStatement.bindString(18, str27);
                        androidStatement.bindString(19, str28);
                        androidStatement.bindBoolean(20, Boolean.valueOf(booleanValue));
                        androidStatement.bindString(21, str29);
                        androidStatement.bindString(22, str30);
                        androidStatement.bindString(23, str31);
                        androidStatement.bindString(24, str32);
                        return Unit.INSTANCE;
                    }
                });
                gpsConfigQueries2.notifyQueries(-1815047282, new InvestmentEntityQueries$$ExternalSyntheticLambda1(24));
                return Unit.INSTANCE;
            case 20:
                InvestmentCategorySyncEntityStorageObserver investmentCategorySyncEntityStorageObserver = (InvestmentCategorySyncEntityStorageObserver) obj3;
                String str33 = (String) obj2;
                ((TransactionWrapper) obj).getClass();
                CategoryQueries categoryQueries = investmentCategorySyncEntityStorageObserver.categoryQueries;
                categoryQueries.getClass();
                str33.getClass();
                CategoryToken categoryToken = (CategoryToken) new OffersSheetQueries$ForSheetKeyQuery(categoryQueries, str33, new CategoryQueries$$ExternalSyntheticLambda4(categoryQueries, i10)).executeAsOneOrNull();
                if (categoryToken != null) {
                    String str34 = categoryToken.value;
                    investmentCategorySyncEntityStorageObserver.entityInCategoryQueries.deleteForCategory(str34);
                    investmentCategorySyncEntityStorageObserver.filtersForCategoryQueries.deleteForCategory(str34);
                    categoryQueries.getClass();
                    categoryQueries.driver.execute(-1273958680, "DELETE FROM category\nWHERE token = ?", new MerchantBlockingViewKt$$ExternalSyntheticLambda15(i9, categoryQueries, categoryToken));
                    categoryQueries.notifyQueries(-1273958680, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(i5));
                }
                return Unit.INSTANCE;
            case 21:
                SearchResult searchResult = (SearchResult) obj3;
                Function1 function14 = (Function1) obj2;
                MooncakeInvestingStockRowView mooncakeInvestingStockRowView = (MooncakeInvestingStockRowView) obj;
                mooncakeInvestingStockRowView.getClass();
                mooncakeInvestingStockRowView.render(searchResult.getContentModel(), false);
                mooncakeInvestingStockRowView.setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(mooncakeInvestingStockRowView, searchResult, function14, searchResult.getContentModel().investmentEntityToken, 4));
                return Unit.INSTANCE;
            case 22:
                InvestingFilterResultViewModel investingFilterResultViewModel = (InvestingFilterResultViewModel) obj3;
                InvestingFilterResultRow investingFilterResultRow = (InvestingFilterResultRow) obj;
                investingFilterResultRow.getClass();
                InvestingNewsKt$$ExternalSyntheticLambda0 investingNewsKt$$ExternalSyntheticLambda0 = new InvestingNewsKt$$ExternalSyntheticLambda0(i5, (Function1) obj2);
                investingFilterResultRow.resultCountView.setText(investingFilterResultViewModel.countLabel);
                MooncakePillButton mooncakePillButton = investingFilterResultRow.resetFiltersView;
                String str35 = investingFilterResultViewModel.resetLabel;
                mooncakePillButton.setText(str35);
                if (str35 == null) {
                    mooncakePillButton.setOnClickListener(null);
                    mooncakePillButton.setClickable(false);
                } else {
                    mooncakePillButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(investingNewsKt$$ExternalSyntheticLambda0, 5));
                }
                return Unit.INSTANCE;
            case 23:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                int i19 = InvestingSubFilterSelection.$r8$clinit;
                layoutSpec.getClass();
                int resolve = ((Huffman.Node) layoutSpec.getParent().appLaunchedCallback).resolve();
                List list5 = ((SubFilterViewModel.SubFilterSelectionViewModel) obj3).options;
                return new XInt((resolve - (((InvestingSubFilterSelection) obj2).getDip(8) * (list5.size() - 1))) / list5.size());
            case 24:
                Function1 function15 = (Function1) obj3;
                DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel = (DividendReinvestmentSettingViewModel) obj2;
                LazyListScope lazyListScope5 = (LazyListScope) obj;
                lazyListScope5.getClass();
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3(function15, dividendReinvestmentSettingViewModel), true, 1819344777), 3);
                LazyListScope.item$default(lazyListScope5, null, null, new ComposableLambdaImpl(new DividendReinvestmentSettingViewKt$$ExternalSyntheticLambda3(dividendReinvestmentSettingViewModel, function15), true, -2039865664), 3);
                return Unit.INSTANCE;
            case 25:
                InvestingAnalystGraphView investingAnalystGraphView = (InvestingAnalystGraphView) obj3;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(investingAnalystGraphView.m3816leftTENr5nQ(investingAnalystGraphView.barView) + ((int) ((investingAnalystGraphView.m3820widthTENr5nQ(investingAnalystGraphView.barView) - investingAnalystGraphView.dotDiameter) * (((InvestingAnalystOpinionsViewModel$Content.InvestingAnalystOpinionsGraphModel) obj2).score / 100.0f))));
            case 26:
                LazyListScope lazyListScope6 = (LazyListScope) obj;
                lazyListScope6.getClass();
                List list6 = ((InvestingRecurringFrequencyPickerViewModel.Content) ((InvestingRecurringFrequencyPickerViewModel) obj3)).options;
                lazyListScope6.items(list6.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list6, i7), new ComposableLambdaImpl(new AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4(list6, (MutableState) obj2, i11), true, 802480018));
                return Unit.INSTANCE;
            case 27:
                LazyListScope lazyListScope7 = (LazyListScope) obj;
                lazyListScope7.getClass();
                List list7 = ((InvestingOrderTypeSelectionViewModel) obj3).orderTypes;
                lazyListScope7.items(list7.size(), null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list7, i8), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(12, (Function1) obj2, list7), true, 802480018));
                return Unit.INSTANCE;
            case 28:
                LazyListScope lazyListScope8 = (LazyListScope) obj;
                lazyListScope8.getClass();
                LazyListScope.item$default(lazyListScope8, null, null, new ComposableLambdaImpl(new MoneyTabBookletKt$$ExternalSyntheticLambda4(21, obj3, (Function1) obj2), true, -1233774538), 3);
                return Unit.INSTANCE;
            default:
                SineWave sineWave = (SineWave) obj3;
                State state = (State) obj2;
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                cacheDrawScope.getClass();
                float f = 125.0f;
                float f2 = -(cacheDrawScope.getDensity() * 125.0f);
                char c = ' ';
                float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (cacheDrawScope.cacheParams.mo587getSizeNHjbRc() & BodyPartID.bodyIdMax));
                float density = (cacheDrawScope.getDensity() * 125.0f) / 10.0f;
                float f3 = intBitsToFloat - f2;
                AndroidPath Path = AndroidPath_androidKt.Path();
                IntRange intRange = new IntRange(0, ((int) Math.ceil(f3 / density)) + 1, 1);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                IntProgressionIterator it = intRange.iterator();
                float f4 = f2;
                while (it.hasNext) {
                    int nextInt = it.nextInt();
                    float f5 = f;
                    char c2 = c;
                    float f6 = density;
                    float f7 = f2;
                    float density2 = (cacheDrawScope.getDensity() * 12.0f * ((float) Math.sin(((f4 - f2) / (cacheDrawScope.getDensity() * f)) * 6.2831855f))) + Float.intBitsToFloat((int) (((Float.floatToRawIntBits(Recorder$$ExternalSyntheticOutline2.m(intBitsToFloat2, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((f3 / 2.0f) + f2) << c2)) & BodyPartID.bodyIdMax));
                    if (nextInt == 0) {
                        Path.moveTo(f4, density2);
                    } else {
                        Path.lineTo(f4, density2);
                    }
                    f4 += f6;
                    if (f4 > intBitsToFloat) {
                        f4 = intBitsToFloat;
                    }
                    arrayList.add(Unit.INSTANCE);
                    f = f5;
                    c = c2;
                    f2 = f7;
                    density = f6;
                }
                return cacheDrawScope.onDrawWithContent(new CacheDrawScope$onDrawBehind$1(i10, new BankingConfigQueries$$ExternalSyntheticLambda0(state, sineWave, Path, new Stroke(cacheDrawScope.getDensity() * 4.0f, RecyclerView.DECELERATION_RATE, 0, 0, new AndroidPathEffect(new CornerPathEffect(cacheDrawScope.getDensity() * f)), 14), 18)));
        }
    }
}

package androidx.navigation.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.navigation.NavBackStackEntry;
import androidx.room.util.DBUtil;
import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewEvent;
import com.squareup.cash.favorites.viewmodels.AddFavoritesViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteViewModel;
import com.squareup.cash.favorites.viewmodels.SectionViewModel;
import com.squareup.cash.moneybot.views.plugins.SlottedProgressRingKt$StackedBubbles$1$2$1;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$CardAvatarSectionView$1$1$1$1$1;
import com.squareup.cash.shopping.views.search.ShopMessageKt;
import com.squareup.cash.ui.CashInsetsListenerKt;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.compose.ListsKt;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$32 implements Function4 {
    public final /* synthetic */ Object $backStackEntry;
    public final /* synthetic */ Object $inPredictiveBack$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $saveableStateHolder;
    public final /* synthetic */ Object $transitionState;
    public final /* synthetic */ Object $visibleEntries$delegate;

    public /* synthetic */ NavHostKt$NavHost$32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.$transitionState = obj;
        this.$backStackEntry = obj2;
        this.$saveableStateHolder = obj3;
        this.$inPredictiveBack$delegate = obj4;
        this.$visibleEntries$delegate = obj5;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj6 = Composer.Companion.Empty;
        ComposableLambdaImpl composableLambdaImpl = null;
        Object obj7 = this.$visibleEntries$delegate;
        Object obj8 = this.$transitionState;
        Object obj9 = this.$backStackEntry;
        Object obj10 = this.$saveableStateHolder;
        Object obj11 = this.$inPredictiveBack$delegate;
        final int i6 = 0;
        switch (i5) {
            case 0:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj2;
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                boolean areEqual = Intrinsics.areEqual(((SeekableTransitionState) obj8).currentState$delegate.getValue(), (NavBackStackEntry) obj9);
                if (!((Boolean) ((MutableState) obj11).getValue()).booleanValue() && !areEqual) {
                    List list = (List) ((State) obj7).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            Object previous = listIterator.previous();
                            if (Intrinsics.areEqual(navBackStackEntry, (NavBackStackEntry) previous)) {
                                obj5 = previous;
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    navBackStackEntry = (NavBackStackEntry) obj5;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (navBackStackEntry == null) {
                    gapComposer.startReplaceGroup(105930796);
                } else {
                    gapComposer.startReplaceGroup(-1520603531);
                    CashInsetsListenerKt.LocalOwnersProvider(navBackStackEntry, (SaveableStateHolder) obj10, Expect_jvmKt.rememberComposableLambda(-1263531443, new ButtonKt$Button$2.AnonymousClass1(10, navBackStackEntry, animatedContentScopeImpl), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
                }
                gapComposer.end(false);
                return Unit.INSTANCE;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                final Function1 function1 = (Function1) obj9;
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer2).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer2).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i & 1, (i & 147) != 146)) {
                    final FavoriteViewModel favoriteViewModel = (FavoriteViewModel) ((List) obj8).get(intValue);
                    gapComposer2.startReplaceGroup(984650149);
                    boolean z3 = favoriteViewModel.isRequestInFlight;
                    Recipient recipient = favoriteViewModel.recipient;
                    String str = favoriteViewModel.title;
                    String str2 = favoriteViewModel.subtitle;
                    String str3 = recipient.displayName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    Color color = favoriteViewModel.accentColor;
                    Image image = favoriteViewModel.photoImage;
                    Icons badgeIcon = TypefaceCompatUtil.badgeIcon(recipient, false);
                    boolean z4 = recipient.isFavorited;
                    boolean z5 = favoriteViewModel.isBusiness;
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(favoriteViewModel);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == obj6) {
                        rememberedValue = new Function0() { // from class: com.squareup.cash.favorites.components.AddFavoritesViewKt$AddFavorites$3$2$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i6;
                                FavoriteViewModel favoriteViewModel2 = favoriteViewModel;
                                Function1 function12 = function1;
                                switch (i7) {
                                    case 0:
                                        function12.invoke(new AddFavoritesViewEvent.FavoriteClicked(favoriteViewModel2.customerId, favoriteViewModel2.title, favoriteViewModel2.accentColor, favoriteViewModel2.photoImage, favoriteViewModel2.monogram, favoriteViewModel2.section));
                                        break;
                                    default:
                                        function12.invoke(new AddFavoritesViewEvent.ListRowClicked(favoriteViewModel2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changedInstance(favoriteViewModel);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj6) {
                        final int i7 = 1;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.favorites.components.AddFavoritesViewKt$AddFavorites$3$2$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i7;
                                FavoriteViewModel favoriteViewModel2 = favoriteViewModel;
                                Function1 function12 = function1;
                                switch (i72) {
                                    case 0:
                                        function12.invoke(new AddFavoritesViewEvent.FavoriteClicked(favoriteViewModel2.customerId, favoriteViewModel2.title, favoriteViewModel2.accentColor, favoriteViewModel2.photoImage, favoriteViewModel2.monogram, favoriteViewModel2.section));
                                        break;
                                    default:
                                        function12.invoke(new AddFavoritesViewEvent.ListRowClicked(favoriteViewModel2));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AddFavoritesViewKt.PersonRowItem(function0, (Function0) rememberedValue2, null, z3, str, str2, str4, color, image, badgeIcon, z4, z5, gapComposer2, 0);
                    if (!favoriteViewModel.equals(CollectionsKt.last((List) obj10)) || Intrinsics.areEqual(((SectionViewModel) CollectionsKt.last(((AddFavoritesViewModel) obj11).sections)).name, (String) obj7)) {
                        z = false;
                        gapComposer2.startReplaceGroup(985774518);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(985719741);
                        z = false;
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj11;
                OffersStyledTextKt$$ExternalSyntheticLambda0 offersStyledTextKt$$ExternalSyntheticLambda0 = (OffersStyledTextKt$$ExternalSyntheticLambda0) obj10;
                Function1 function13 = (Function1) obj7;
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer3).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer3).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Object obj12 = ((List) obj8).get(intValue3);
                    gapComposer3.startReplaceGroup(-176019013);
                    OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) obj12;
                    gapComposer3.startReplaceGroup(1475996866);
                    if (!(offersCommonOfferRowViewModel instanceof OffersCommonOfferRowViewModel)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1060765855, false);
                    }
                    gapComposer3.startReplaceGroup(1476283956);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    String str5 = colors.isLight ? offersCommonOfferRowViewModel.rowViewModel.avatar.lightImageUrl : offersCommonOfferRowViewModel.rowViewModel.avatar.darkImageUrl;
                    if (str5 == null) {
                        gapComposer3.startReplaceGroup(1476500831);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1476500832);
                        StyledText styledText = offersCommonOfferRowViewModel.rowViewModel.subtitle;
                        if (styledText == null) {
                            gapComposer3.startReplaceGroup(1931542401);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1931542402);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-2094542262, new DateInputKt$DateInputTextField$3(styledText, 7), gapComposer3);
                            gapComposer3.end(false);
                        }
                        ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                        int i8 = 15;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-504672291, new ButtonKt$Button$2.AnonymousClass1(i8, offersCommonOfferRowViewModel, str5), gapComposer3);
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1195576260, new DateInputKt$DateInputTextField$3(offersCommonOfferRowViewModel, 8), gapComposer3);
                        boolean changed3 = gapComposer3.changed(function13) | gapComposer3.changedInstance(offersCommonOfferRowViewModel);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue3 == obj6) {
                            rememberedValue3 = new CardModelView$1$3$4$2(i8, function13, offersCommonOfferRowViewModel);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue3, null, false, false, composableLambdaImpl2, null, push, 0L, null, gapComposer3, 805306422, 0, 3444);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(false);
                    gapComposer3.end(false);
                    LazyListState lazyListState = (LazyListState) obj9;
                    boolean changed4 = gapComposer3.changed(offersStyledTextKt$$ExternalSyntheticLambda0) | gapComposer3.changedInstance(obj12);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue4 == obj6) {
                        rememberedValue4 = new VerifyCheckDepositPresenter$models$3$2(18, offersStyledTextKt$$ExternalSyntheticLambda0, obj12);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    if (((Boolean) ListsKt.rememberLazyListItemVisibility(lazyListState, (Function1) rememberedValue4, gapComposer3).getValue()).booleanValue()) {
                        gapComposer3.startReplaceGroup(-175903694);
                        boolean changedInstance = gapComposer3.changedInstance(obj12) | gapComposer3.changed(function12);
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        if (changedInstance || rememberedValue5 == obj6) {
                            rememberedValue5 = new OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2(1, obj12, function12);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        }
                        Updater.SideEffect((Function0) rememberedValue5, gapComposer3);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-175697079);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                Function1 function14 = (Function1) obj11;
                Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = (Overlay$$ExternalSyntheticLambda0) obj10;
                Function1 function15 = (Function1) obj7;
                List list2 = (List) obj8;
                lazyGridItemScopeImpl.getClass();
                if ((intValue6 & 6) == 0) {
                    z2 = true;
                    i3 = intValue6 | (((GapComposer) composer4).changed(lazyGridItemScopeImpl) ? 4 : 2);
                } else {
                    z2 = true;
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer4).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i3 & 1, (i3 & 147) != 146 ? z2 : false)) {
                    Object obj13 = list2.get(intValue5);
                    CategoryOffersTileViewModel categoryOffersTileViewModel = (CategoryOffersTileViewModel) list2.get(intValue5);
                    gapComposer4.startReplaceGroup(1176452975);
                    Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(companion, 1.0f), "CategoryTile");
                    boolean changed5 = gapComposer4.changed(function15) | gapComposer4.changed(categoryOffersTileViewModel);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue6 == obj6) {
                        rememberedValue6 = new CardModelView$1$3$4$2(r11, function15, categoryOffersTileViewModel);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    ShadowKt.OffersCategoryTile(testTag, categoryOffersTileViewModel, (Function0) rememberedValue6, gapComposer4, 6);
                    gapComposer4.end(false);
                    LazyGridState lazyGridState = (LazyGridState) obj9;
                    boolean changed6 = gapComposer4.changed(overlay$$ExternalSyntheticLambda0) | ((i3 & 112) == 32 ? z2 : false);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changed6 || rememberedValue7 == obj6) {
                        rememberedValue7 = new SlottedProgressRingKt$StackedBubbles$1$2$1.AnonymousClass1(overlay$$ExternalSyntheticLambda0, intValue5, 2);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function16 = (Function1) rememberedValue7;
                    lazyGridState.getClass();
                    function16.getClass();
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (rememberedValue8 == obj6) {
                        rememberedValue8 = Updater.derivedStateOf(new ListsKt$$ExternalSyntheticLambda0(23, (Object) lazyGridState, (Object) function16));
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    if (((Boolean) ((State) rememberedValue8).getValue()).booleanValue()) {
                        gapComposer4.startReplaceGroup(79205582);
                        boolean changedInstance2 = gapComposer4.changedInstance(obj13) | gapComposer4.changed(function14);
                        Object rememberedValue9 = gapComposer4.rememberedValue();
                        if (changedInstance2 || rememberedValue9 == obj6) {
                            rememberedValue9 = new OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2(2, obj13, function14);
                            gapComposer4.updateRememberedValue(rememberedValue9);
                        }
                        Updater.SideEffect((Function0) rememberedValue9, gapComposer4);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(79412197);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LazyGridItemScopeImpl lazyGridItemScopeImpl2 = (LazyGridItemScopeImpl) obj;
                int intValue7 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue8 = ((Number) obj4).intValue();
                DirectoryListItem.TextRowSectionViewModel textRowSectionViewModel = (DirectoryListItem.TextRowSectionViewModel) obj11;
                Function1 function17 = (Function1) obj10;
                Function1 function18 = (Function1) obj9;
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((GapComposer) composer5).changed(lazyGridItemScopeImpl2) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((GapComposer) composer5).changed(intValue7) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) ((ArrayList) obj8).get(intValue7);
                    gapComposer5.startReplaceGroup(1023770216);
                    DirectoryAnalyticsData directoryAnalyticsData = itemViewModel.analyticsData;
                    DirectoryAnalyticsData copy$default = DirectoryAnalyticsData.copy$default(directoryAnalyticsData, DirectoryAnalyticsData.ItemAnalyticsData.copy$default(directoryAnalyticsData.item, Integer.valueOf(intValue7)), null, null, 509);
                    boolean changed7 = gapComposer5.changed(function18) | gapComposer5.changedInstance(copy$default);
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    if (changed7 || rememberedValue10 == obj6) {
                        rememberedValue10 = new ShopHubResultsListKt$CardAvatarSectionView$1$1$1$1$1(function18, copy$default, 1);
                        gapComposer5.updateRememberedValue(rememberedValue10);
                    }
                    Function0 function02 = (Function0) rememberedValue10;
                    function02.getClass();
                    itemViewModel.$$delegate_0.reportViewed(function02);
                    boolean changed8 = gapComposer5.changed(function17) | gapComposer5.changed(function18) | gapComposer5.changedInstance(textRowSectionViewModel) | gapComposer5.changedInstance(copy$default);
                    Object rememberedValue11 = gapComposer5.rememberedValue();
                    if (changed8 || rememberedValue11 == obj6) {
                        rememberedValue11 = new AbstractTypeChecker$$Lambda$0(function17, function18, textRowSectionViewModel, copy$default, 5);
                        gapComposer5.updateRememberedValue(rememberedValue11);
                    }
                    ShopMessageKt.TextRowSectionItem(itemViewModel, (Function1) rememberedValue11, (RealImageLoader) obj7, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 12.0f), null, 0, gapComposer5, 3072);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}

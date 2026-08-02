package com.squareup.cash.directory_ui.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material3.DateInputKt$DateInputContent$3;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.material3.DatePickerKt$IconButtonWithTooltip$1;
import androidx.compose.material3.TooltipKt$animateTooltip$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.primitives.LocationToken;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandLocationsBottomSheetModel$Location;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$Overlay$contentWithLocals$1;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.datefilterbar.views.DateFilterBarKt;
import com.squareup.cash.deposits.physical.view.address.AddressSearchKt;
import com.squareup.cash.deposits.physical.viewmodels.address.AddressSearchViewModel;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.music.views.TrackRowKt;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolRow;
import com.squareup.cash.pools.views.PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1;
import com.squareup.cash.pools.views.PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5;
import com.squareup.cash.pools.views.PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$6;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.PayHistoryStubViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.investing.resources.Period;
import com.squareup.util.android.PhoneNumbers;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$6;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4 implements Function4 {
    public final /* synthetic */ Object $columns$inlined;
    public final /* synthetic */ Object $content$inlined;
    public final /* synthetic */ List $items;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(List list, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.$items = list;
        this.$content$inlined = obj;
        this.$columns$inlined = obj2;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolMemberListViewKt$PoolMemberList$lambda$0$0$1$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String m;
        Function0 function0;
        CellDefaultAccessory.ButtonCompact buttonCompact;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Function1 function1 = (Function1) this.$content$inlined;
        int i2 = 2;
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        int i3 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            PoolListSection.PoolListPerson poolListPerson = (PoolListSection.PoolListPerson) this.$items.get(intValue);
            gapComposer.startReplaceGroup(1283290799);
            Image image = poolListPerson.photoImage;
            boolean z = poolListPerson.isRemovable;
            if (image == null) {
                gapComposer.startReplaceGroup(1283236020);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1344078611, image, gapComposer, false);
            }
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
            Boolean valueOf = Boolean.valueOf(z);
            if (!z) {
                valueOf = null;
            }
            if (valueOf == null) {
                gapComposer.startReplaceGroup(1283477045);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(1283477046);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(poolListPerson);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1(function1, poolListPerson, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                gapComposer.end(false);
                function0 = (Function0) rememberedValue;
            }
            boolean z2 = !poolListPerson.isRequestInFlight;
            Boolean valueOf2 = Boolean.valueOf(z);
            if (!z) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                gapComposer.startReplaceGroup(1285261405);
                gapComposer.end(false);
                buttonCompact = null;
            } else {
                gapComposer.startReplaceGroup(1285261406);
                CellDefaultAccessory.ButtonCompact buttonCompact2 = new CellDefaultAccessory.ButtonCompact(null, null, true, Expect_jvmKt.rememberComposableLambda(1568369462, new BorrowHomeOverlayKt$Overlay$contentWithLocals$1(i2, poolListPerson, (PoolMemberListViewModel) this.$columns$inlined), gapComposer), 11);
                gapComposer.end(false);
                buttonCompact = buttonCompact2;
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1877351042, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5(poolListPerson, function1, m), gapComposer), Expect_jvmKt.rememberComposableLambda(-1470323555, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$6(poolListPerson, i3), gapComposer), animateItem$default, function0, null, z2, true, Expect_jvmKt.rememberComposableLambda(971841367, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$6(poolListPerson, 3), gapComposer), null, buttonCompact, 0L, null, gapComposer, 14155830, 0, 3344);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$pay$PayHistoryListViewKt$PayHistoryListContent$lambda$3$0$0$$inlined$items$default$4(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        Object obj5 = (Function1) this.$content$inlined;
        final PayHistoryListViewModel.Loaded loaded = (PayHistoryListViewModel.Loaded) this.$columns$inlined;
        if ((intValue2 & 6) == 0) {
            i = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        int i2 = 16;
        if ((intValue2 & 48) == 0) {
            i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
            PayHistoryStubViewModel payHistoryStubViewModel = (PayHistoryStubViewModel) ((ArrayList) this.$items).get(intValue);
            gapComposer.startReplaceGroup(-567606146);
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label("+ ".concat(payHistoryStubViewModel.amount), 0);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2004208799, new Function2() { // from class: com.squareup.cash.work.views.pay.PayHistoryListViewKt$PayHistoryListContent$2$1$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    int i5 = i3;
                    PayHistoryListViewModel.Loaded loaded2 = loaded;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj6;
                            int intValue3 = ((Number) obj7).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                SellerCardKt.SellerCard(loaded2.sellerCard, null, SellerCardSize.Medium, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 10);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj6;
                            int intValue4 = ((Number) obj7).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.merchantName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1892045730, new Function2() { // from class: com.squareup.cash.work.views.pay.PayHistoryListViewKt$PayHistoryListContent$2$1$1$3$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    int i5 = i4;
                    PayHistoryListViewModel.Loaded loaded2 = loaded;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj6;
                            int intValue3 = ((Number) obj7).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                SellerCardKt.SellerCard(loaded2.sellerCard, null, SellerCardSize.Medium, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 10);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj6;
                            int intValue4 = ((Number) obj7).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.merchantName, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean changed = gapComposer.changed(obj5) | gapComposer.changedInstance(payHistoryStubViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardModelView$1$3$4$2(29, obj5, payHistoryStubViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-500230872, new DateInputKt$DateInputTextField$3(payHistoryStubViewModel, i2), gapComposer), null, label, 0L, null, gapComposer, 12582966, 0, 3444);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String m;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String m2;
        int i14;
        int i15;
        String str;
        int i16;
        int i17 = this.$r8$classId;
        int i18 = 10;
        int i19 = 9;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i20 = 3;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj5 = this.$columns$inlined;
        Object obj6 = this.$content$inlined;
        List list = this.$items;
        final int i21 = 0;
        switch (i17) {
            case 0:
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyGridItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    Object obj7 = list.get(intValue);
                    gapComposer.startReplaceGroup(-99841802);
                    ((ComposableLambdaImpl) obj6).invoke(lazyGridItemScopeImpl, Integer.valueOf(intValue), Integer.valueOf(((Ref$IntRef) obj5).element), obj7, gapComposer, Integer.valueOf(i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LazyGridItemScopeImpl lazyGridItemScopeImpl2 = (LazyGridItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyGridItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    LocalBrandLocationMenuViewModel.MenuCategory.MenuItem menuItem = (LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) list.get(intValue3);
                    gapComposer2.startReplaceGroup(-2140806554);
                    LocalCaloriesTextKt.MenuCategoryItemCell(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), (LocalBrandLocationMenuViewModel.MenuCategory) obj6, menuItem, (Function1) obj5, gapComposer2, 6);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                MutableState mutableState = (MutableState) obj5;
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    LocalBrandLocationsBottomSheetModel$Location localBrandLocationsBottomSheetModel$Location = (LocalBrandLocationsBottomSheetModel$Location) ((ArrayList) list).get(intValue5);
                    gapComposer3.startReplaceGroup(-943728438);
                    boolean changedInstance = gapComposer3.changedInstance(localBrandLocationsBottomSheetModel$Location);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    Object obj8 = rememberedValue;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(i20, localBrandLocationsBottomSheetModel$Location, mutableState);
                        gapComposer3.updateRememberedValue(cardModelView$1$3$4$2);
                        obj8 = cardModelView$1$3$4$2;
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) obj8, 15), RecyclerView.DECELERATION_RATE, 24.0f, 1);
                    LocationToken locationToken = (LocationToken) mutableState.getValue();
                    String str2 = locationToken != null ? locationToken.value : null;
                    LoyaltySheetKt.FulfillmentPickupLocationRow(m300paddingVpY3zN4$default, localBrandLocationsBottomSheetModel$Location, str2 == null ? false : str2.equals(localBrandLocationsBottomSheetModel$Location.token), gapComposer3, 0);
                    if (intValue5 < ((FulfillmentPickerViewModel.Pickup) obj6).locations.size() - 1) {
                        gapComposer3.startReplaceGroup(-943462242);
                        ModalKt.HorizontalDivider(0, 1, gapComposer3, null);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-943426685);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue7 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue8 = ((Number) obj4).intValue();
                Function1 function1 = (Function1) obj5;
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((GapComposer) composer4).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((GapComposer) composer4).changed(intValue7) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    SchedulingDay schedulingDay = (SchedulingDay) list.get(intValue7);
                    gapComposer4.startReplaceGroup(1288378638);
                    String str3 = schedulingDay.day_label;
                    str3.getClass();
                    String str4 = schedulingDay.day_date_label;
                    str4.getClass();
                    SchedulingDay schedulingDay2 = (SchedulingDay) obj6;
                    boolean areEqual = Intrinsics.areEqual(schedulingDay.scheduling_day_token, schedulingDay2 != null ? schedulingDay2.scheduling_day_token : null);
                    boolean changed = gapComposer4.changed(function1) | gapComposer4.changedInstance(schedulingDay);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    Object obj9 = rememberedValue2;
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$22 = new CardModelView$1$3$4$2(4, function1, schedulingDay);
                        gapComposer4.updateRememberedValue(cardModelView$1$3$4$22);
                        obj9 = cardModelView$1$3$4$22;
                    }
                    FulfillmentRadioCellKt.SchedulingTimePickerChip(null, str3, str4, areEqual, (Function0) obj9, null, gapComposer4, 0);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue9 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((GapComposer) composer5).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((GapComposer) composer5).changed(intValue9) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    LocalHomeViewModel.TabContent.Widget widget = (LocalHomeViewModel.TabContent.Widget) list.get(intValue9);
                    gapComposer5.startReplaceGroup(1902732644);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, intValue9 == 0 ? RecyclerView.DECELERATION_RATE : 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    LocalHomeViewKt.WalletWidgetContent(widget, !StringsKt.contains((CharSequence) ((List) obj6).get(intValue9), (CharSequence) "__dup_", false), (Function1) obj5, gapComposer5, 0);
                    gapComposer5.end(true);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LazyItemScopeImpl lazyItemScopeImpl4 = (LazyItemScopeImpl) obj;
                int intValue11 = ((Number) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue12 = ((Number) obj4).intValue();
                Function1 function12 = (Function1) obj5;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((GapComposer) composer6).changed(lazyItemScopeImpl4) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((GapComposer) composer6).changed(intValue11) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                    EarnerEnrollmentBlockerViewModel.CategorySelection.Category category = (EarnerEnrollmentBlockerViewModel.CategorySelection.Category) ((ArrayList) list).get(intValue11);
                    gapComposer6.startReplaceGroup(1104739622);
                    boolean z = category.category == ((EarnerEnrollmentBlockerViewModel.CategorySelection) obj6).selectedCategory;
                    boolean changed2 = gapComposer6.changed(function12) | gapComposer6.changedInstance(category);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    Object obj10 = rememberedValue3;
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$23 = new CardModelView$1$3$4$2(i19, function12, category);
                        gapComposer6.updateRememberedValue(cardModelView$1$3$4$23);
                        obj10 = cardModelView$1$3$4$23;
                    }
                    SsnViewKt.EarnerCategorySelectionRow(category, z, (Function0) obj10, gapComposer6, 0);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LazyItemScopeImpl lazyItemScopeImpl5 = (LazyItemScopeImpl) obj;
                final int intValue13 = ((Number) obj2).intValue();
                Composer composer7 = (Composer) obj3;
                int intValue14 = ((Number) obj4).intValue();
                final Function1 function13 = (Function1) obj5;
                final MutableState mutableState2 = (MutableState) obj6;
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((GapComposer) composer7).changed(lazyItemScopeImpl5) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((GapComposer) composer7).changed(intValue13) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                    final DateFilter dateFilter = (DateFilter) list.get(intValue13);
                    gapComposer7.startReplaceGroup(-316518899);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    Object obj11 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy) {
                        DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new DescriptorKCallable$$Lambda$6(intValue13, mutableState2));
                        gapComposer7.updateRememberedValue(derivedStateOf);
                        obj11 = derivedStateOf;
                    }
                    State state = (State) obj11;
                    boolean booleanValue = ((Boolean) state.getValue()).booleanValue();
                    if (dateFilter instanceof DateFilter.Monthly) {
                        gapComposer7.startReplaceGroup(-541943543);
                        gapComposer7.end(false);
                        DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter;
                        m = YearMonth.of(monthly.year, monthly.month).format(booleanValue ? DateFilterBarKt.monthSelectedFormatter : DateFilterBarKt.monthUnselectedFormatter);
                        m.getClass();
                    } else if (dateFilter instanceof DateFilter.Yearly) {
                        gapComposer7.startReplaceGroup(-541937252);
                        gapComposer7.end(false);
                        m = Year.of(((DateFilter.Yearly) dateFilter).year).format(DateFilterBarKt.yearFormatter);
                        m.getClass();
                    } else {
                        if (!(dateFilter instanceof DateFilter.AllTime)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -541944465, false);
                        }
                        m = re$$ExternalSyntheticOutline0.m(gapComposer7, -541935944, R.string.date_filter_bar_all_time, gapComposer7, false);
                    }
                    boolean booleanValue2 = ((Boolean) state.getValue()).booleanValue();
                    boolean changed3 = ((((i7 & 112) ^ 48) > 32 && gapComposer7.changed(intValue13)) || (i7 & 48) == 32) | gapComposer7.changed(mutableState2) | gapComposer7.changed(function13) | gapComposer7.changedInstance(dateFilter);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    Object obj12 = rememberedValue5;
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        Function0 function0 = new Function0() { // from class: com.squareup.cash.datefilterbar.views.DateFilterBarKt$DateFilterBar$2$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Integer valueOf = Integer.valueOf(intValue13);
                                DateTimeFormatter dateTimeFormatter = DateFilterBarKt.monthSelectedFormatter;
                                mutableState2.setValue(valueOf);
                                function13.invoke(dateFilter);
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer7.updateRememberedValue(function0);
                        obj12 = function0;
                    }
                    FillrAnalyticsServiceBuilder.DateFilterChip(3072, gapComposer7, Expect_jvmKt.rememberComposableLambda(-362825274, new DatePickerKt$IconButtonWithTooltip$1(m, r15 ? 1 : 0), gapComposer7), null, (Function0) obj12, booleanValue2);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LazyItemScopeImpl lazyItemScopeImpl6 = (LazyItemScopeImpl) obj;
                int intValue15 = ((Number) obj2).intValue();
                Composer composer8 = (Composer) obj3;
                int intValue16 = ((Number) obj4).intValue();
                Function1 function14 = (Function1) obj5;
                SearchBarKeyboardState searchBarKeyboardState = (SearchBarKeyboardState) obj6;
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (((GapComposer) composer8).changed(lazyItemScopeImpl6) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= ((GapComposer) composer8).changed(intValue15) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                    AddressSearchViewModel addressSearchViewModel = (AddressSearchViewModel) ((ArrayList) list).get(intValue15);
                    gapComposer8.startReplaceGroup(250604385);
                    String str5 = addressSearchViewModel.primaryText;
                    String str6 = addressSearchViewModel.secondaryText;
                    boolean changed4 = gapComposer8.changed(searchBarKeyboardState) | gapComposer8.changed(function14) | gapComposer8.changedInstance(addressSearchViewModel);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    Object obj13 = rememberedValue6;
                    if (changed4 || rememberedValue6 == neverEqualPolicy) {
                        KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(i20, searchBarKeyboardState, function14, addressSearchViewModel);
                        gapComposer8.updateRememberedValue(kClassImpl$Data$$Lambda$23);
                        obj13 = kClassImpl$Data$$Lambda$23;
                    }
                    AddressSearchKt.AddressCell(str5, str6, (Function0) obj13, gapComposer8, 0);
                    gapComposer8.end(false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LazyItemScopeImpl lazyItemScopeImpl7 = (LazyItemScopeImpl) obj;
                int intValue17 = ((Number) obj2).intValue();
                Composer composer9 = (Composer) obj3;
                int intValue18 = ((Number) obj4).intValue();
                Function1 function15 = (Function1) obj5;
                SearchBarKeyboardState searchBarKeyboardState2 = (SearchBarKeyboardState) obj6;
                if ((intValue18 & 6) == 0) {
                    i9 = intValue18 | (((GapComposer) composer9).changed(lazyItemScopeImpl7) ? 4 : 2);
                } else {
                    i9 = intValue18;
                }
                if ((intValue18 & 48) == 0) {
                    i9 |= ((GapComposer) composer9).changed(intValue17) ? 32 : 16;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                    SearchLocation searchLocation = (SearchLocation) list.get(intValue17);
                    gapComposer9.startReplaceGroup(451366128);
                    String obj14 = searchLocation.primaryText.toString();
                    CharSequence charSequence = searchLocation.secondaryText;
                    String obj15 = charSequence != null ? charSequence.toString() : null;
                    boolean changed5 = gapComposer9.changed(searchBarKeyboardState2) | gapComposer9.changed(function15) | gapComposer9.changedInstance(searchLocation);
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    Object obj16 = rememberedValue7;
                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                        KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$232 = new KClassImpl$Data$$Lambda$23(4, searchBarKeyboardState2, function15, searchLocation);
                        gapComposer9.updateRememberedValue(kClassImpl$Data$$Lambda$232);
                        obj16 = kClassImpl$Data$$Lambda$232;
                    }
                    AddressSearchKt.AddressCell(obj14, obj15, (Function0) obj16, gapComposer9, 0);
                    gapComposer9.end(false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                LazyItemScopeImpl lazyItemScopeImpl8 = (LazyItemScopeImpl) obj;
                int intValue19 = ((Number) obj2).intValue();
                Composer composer10 = (Composer) obj3;
                int intValue20 = ((Number) obj4).intValue();
                Function1 function16 = (Function1) obj5;
                if ((intValue20 & 6) == 0) {
                    i10 = intValue20 | (((GapComposer) composer10).changed(lazyItemScopeImpl8) ? 4 : 2);
                } else {
                    i10 = intValue20;
                }
                if ((intValue20 & 48) == 0) {
                    i10 |= ((GapComposer) composer10).changed(intValue19) ? 32 : 16;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                    Period period = (Period) ((ArrayList) list).get(intValue19);
                    gapComposer10.startReplaceGroup(-238296856);
                    SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                    boolean areEqual2 = Intrinsics.areEqual(period.token, (String) obj6);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1414121972, new DateInputKt$DateInputTextField$3(period, 5), gapComposer10);
                    boolean changed6 = gapComposer10.changed(function16) | gapComposer10.changedInstance(period);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    Object obj17 = rememberedValue8;
                    if (changed6 || rememberedValue8 == neverEqualPolicy) {
                        VerifyCheckDepositPresenter$models$3$2 verifyCheckDepositPresenter$models$3$2 = new VerifyCheckDepositPresenter$models$3$2(11, function16, period);
                        gapComposer10.updateRememberedValue(verifyCheckDepositPresenter$models$3$2);
                        obj17 = verifyCheckDepositPresenter$models$3$2;
                    }
                    InputChipKt.SelectionCard(rememberComposableLambda, CustomOrderPeriodSelectorKt.f455lambda$791520395, areEqual2, null, false, (Function1) obj17, gapComposer10, 3126, 48);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                LazyItemScopeImpl lazyItemScopeImpl9 = (LazyItemScopeImpl) obj;
                int intValue21 = ((Number) obj2).intValue();
                Composer composer11 = (Composer) obj3;
                int intValue22 = ((Number) obj4).intValue();
                Function1 function17 = (Function1) obj5;
                if ((intValue22 & 6) == 0) {
                    i11 = intValue22 | (((GapComposer) composer11).changed(lazyItemScopeImpl9) ? 4 : 2);
                } else {
                    i11 = intValue22;
                }
                if ((intValue22 & 48) == 0) {
                    i11 |= ((GapComposer) composer11).changed(intValue21) ? 32 : 16;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                    Track track = (Track) list.get(intValue21);
                    gapComposer11.startReplaceGroup(1294517982);
                    float f = ((MusicViewModel.Loaded) obj6).playbackProgress;
                    boolean changed7 = gapComposer11.changed(function17);
                    Object rememberedValue9 = gapComposer11.rememberedValue();
                    if (changed7 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(i18, function17);
                        gapComposer11.updateRememberedValue(rememberedValue9);
                    }
                    TrackRowKt.TrackRow(null, (Function1) rememberedValue9, track, f, gapComposer11, 0);
                    gapComposer11.end(false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                LazyItemScopeImpl lazyItemScopeImpl10 = (LazyItemScopeImpl) obj;
                int intValue23 = ((Number) obj2).intValue();
                Composer composer12 = (Composer) obj3;
                int intValue24 = ((Number) obj4).intValue();
                Function1 function18 = (Function1) obj5;
                if ((intValue24 & 6) == 0) {
                    i12 = intValue24 | (((GapComposer) composer12).changed(lazyItemScopeImpl10) ? 4 : 2);
                } else {
                    i12 = intValue24;
                }
                if ((intValue24 & 48) == 0) {
                    i12 |= ((GapComposer) composer12).changed(intValue23) ? 32 : 16;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                    final WirelessProviderListViewModel.ProviderItem providerItem = (WirelessProviderListViewModel.ProviderItem) list.get(intValue23);
                    gapComposer12.startReplaceGroup(-337599382);
                    CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(providerItem.id.equals(((WirelessProviderListViewModel.Content) obj6).selectedProviderId));
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1693148659, new Function2() { // from class: com.squareup.cash.phoneplans.WirelessProviderListViewKt$WirelessProviderListContent$1$6$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj18, Object obj19) {
                            String m3;
                            int i22 = i21;
                            WirelessProviderListViewModel.ProviderItem providerItem2 = providerItem;
                            switch (i22) {
                                case 0:
                                    Composer composer13 = (Composer) obj18;
                                    int intValue25 = ((Number) obj19).intValue();
                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                    if (gapComposer13.shouldExecute(1 & intValue25, (intValue25 & 3) != 2)) {
                                        Image image = providerItem2.logo;
                                        if (image == null) {
                                            gapComposer13.startReplaceGroup(495807201);
                                            gapComposer13.end(false);
                                            m3 = null;
                                        } else {
                                            m3 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer13, -676742880, image, gapComposer13, false);
                                        }
                                        String str7 = m3;
                                        if (str7 == null) {
                                            gapComposer13.startReplaceGroup(495825646);
                                            gapComposer13.end(false);
                                        } else {
                                            gapComposer13.startReplaceGroup(495825647);
                                            AsyncImageKt.m1438AsyncImage10Xjiaw(str7, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), null, null, null, gapComposer13, 432, 2040);
                                            gapComposer13.end(false);
                                        }
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer14 = (Composer) obj18;
                                    int intValue26 = ((Number) obj19).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, providerItem2.name, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12);
                    final int i22 = r15 ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-968920908, new Function2() { // from class: com.squareup.cash.phoneplans.WirelessProviderListViewKt$WirelessProviderListContent$1$6$1$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj18, Object obj19) {
                            String m3;
                            int i222 = i22;
                            WirelessProviderListViewModel.ProviderItem providerItem2 = providerItem;
                            switch (i222) {
                                case 0:
                                    Composer composer13 = (Composer) obj18;
                                    int intValue25 = ((Number) obj19).intValue();
                                    GapComposer gapComposer13 = (GapComposer) composer13;
                                    if (gapComposer13.shouldExecute(1 & intValue25, (intValue25 & 3) != 2)) {
                                        Image image = providerItem2.logo;
                                        if (image == null) {
                                            gapComposer13.startReplaceGroup(495807201);
                                            gapComposer13.end(false);
                                            m3 = null;
                                        } else {
                                            m3 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer13, -676742880, image, gapComposer13, false);
                                        }
                                        String str7 = m3;
                                        if (str7 == null) {
                                            gapComposer13.startReplaceGroup(495825646);
                                            gapComposer13.end(false);
                                        } else {
                                            gapComposer13.startReplaceGroup(495825647);
                                            AsyncImageKt.m1438AsyncImage10Xjiaw(str7, null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), null, null, null, gapComposer13, 432, 2040);
                                            gapComposer13.end(false);
                                        }
                                    } else {
                                        gapComposer13.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer14 = (Composer) obj18;
                                    int intValue26 = ((Number) obj19).intValue();
                                    GapComposer gapComposer14 = (GapComposer) composer14;
                                    if (gapComposer14.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, providerItem2.name, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer14.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer12);
                    boolean changed8 = gapComposer12.changed(function18) | gapComposer12.changedInstance(providerItem);
                    Object rememberedValue10 = gapComposer12.rememberedValue();
                    Object obj18 = rememberedValue10;
                    if (changed8 || rememberedValue10 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$24 = new CardModelView$1$3$4$2(19, function18, providerItem);
                        gapComposer12.updateRememberedValue(cardModelView$1$3$4$24);
                        obj18 = cardModelView$1$3$4$24;
                    }
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, null, (Function0) obj18, null, false, true, null, null, radio, 0L, null, gapComposer12, 1572918, 0, 3508);
                    gapComposer12.end(false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                LazyItemScopeImpl lazyItemScopeImpl11 = (LazyItemScopeImpl) obj;
                int intValue25 = ((Number) obj2).intValue();
                Composer composer13 = (Composer) obj3;
                int intValue26 = ((Number) obj4).intValue();
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj6;
                Function1 function19 = (Function1) obj5;
                if ((intValue26 & 6) == 0) {
                    i13 = intValue26 | (((GapComposer) composer13).changed(lazyItemScopeImpl11) ? 4 : 2);
                } else {
                    i13 = intValue26;
                }
                if ((intValue26 & 48) == 0) {
                    i13 |= ((GapComposer) composer13).changed(intValue25) ? 32 : 16;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(i13 & 1, (i13 & 147) != 146)) {
                    PoolListSection.PoolListPerson poolListPerson = (PoolListSection.PoolListPerson) list.get(intValue25);
                    gapComposer13.startReplaceGroup(-1138173657);
                    Image image = poolListPerson.photoImage;
                    if (image == null) {
                        gapComposer13.startReplaceGroup(-1138225057);
                        gapComposer13.end(false);
                        m2 = null;
                    } else {
                        m2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer13, -729453598, image, gapComposer13, false);
                    }
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl11, companion);
                    boolean z2 = !poolListPerson.isRequestInFlight;
                    CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, poolListPerson.addedToPool, Expect_jvmKt.rememberComposableLambda(-980357288, new TooltipKt$animateTooltip$2(poolListPerson, i19), gapComposer13), 11);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1123771703, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$5(function19, poolListPerson, m2), gapComposer13);
                    ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(534837176, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$6(poolListPerson, r15 ? 1 : 0), gapComposer13);
                    boolean changed9 = gapComposer13.changed(delegatingSoftwareKeyboardController) | gapComposer13.changed(function19) | gapComposer13.changedInstance(poolListPerson);
                    Object rememberedValue11 = gapComposer13.rememberedValue();
                    Object obj19 = rememberedValue11;
                    if (changed9 || rememberedValue11 == neverEqualPolicy) {
                        KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$233 = new KClassImpl$Data$$Lambda$23(i18, delegatingSoftwareKeyboardController, function19, poolListPerson);
                        gapComposer13.updateRememberedValue(kClassImpl$Data$$Lambda$233);
                        obj19 = kClassImpl$Data$$Lambda$233;
                    }
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda4, rememberComposableLambda5, animateItem$default, (Function0) obj19, null, z2, true, Expect_jvmKt.rememberComposableLambda(1296197310, new PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$6(poolListPerson, r14), gapComposer13), null, buttonCompact, 0L, null, gapComposer13, 14155830, 0, 3344);
                    gapComposer13.end(false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                LazyItemScopeImpl lazyItemScopeImpl12 = (LazyItemScopeImpl) obj;
                int intValue27 = ((Number) obj2).intValue();
                Composer composer14 = (Composer) obj3;
                int intValue28 = ((Number) obj4).intValue();
                if ((intValue28 & 6) == 0) {
                    i14 = intValue28 | (((GapComposer) composer14).changed(lazyItemScopeImpl12) ? 4 : 2);
                } else {
                    i14 = intValue28;
                }
                if ((intValue28 & 48) == 0) {
                    i14 |= ((GapComposer) composer14).changed(intValue27) ? 32 : 16;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(i14 & 1, (i14 & 147) != 146)) {
                    PoolRow poolRow = (PoolRow) ((ArrayList) list).get(intValue27);
                    gapComposer14.startReplaceGroup(1391894109);
                    PoolToastKt.PoolRow(null, (Function1) obj6, poolRow, ((PoolCategory) obj5) == PoolCategory.ACTIVE, gapComposer14, 0);
                    gapComposer14.end(false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return invoke$com$squareup$cash$pools$views$PoolMemberListViewKt$PoolMemberList$lambda$0$0$1$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            case 15:
                LazyItemScopeImpl lazyItemScopeImpl13 = (LazyItemScopeImpl) obj;
                int intValue29 = ((Number) obj2).intValue();
                Composer composer15 = (Composer) obj3;
                int intValue30 = ((Number) obj4).intValue();
                Function1 function110 = (Function1) obj5;
                ContactMethodDetailsViewModel contactMethodDetailsViewModel = (ContactMethodDetailsViewModel) obj6;
                if ((intValue30 & 6) == 0) {
                    i15 = intValue30 | (((GapComposer) composer15).changed(lazyItemScopeImpl13) ? 4 : 2);
                } else {
                    i15 = intValue30;
                }
                if ((intValue30 & 48) == 0) {
                    i15 |= ((GapComposer) composer15).changed(intValue29) ? 32 : 16;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(i15 & 1, (i15 & 147) != 146)) {
                    Alias alias = (Alias) list.get(intValue29);
                    gapComposer15.startReplaceGroup(299818596);
                    if (contactMethodDetailsViewModel.isPhoneAliasType) {
                        String normalize = PhoneNumbers.normalize(alias.value);
                        if (normalize == null || (str = PhoneNumbers.format(normalize, PhoneNumbers.getRegionFromNumber(normalize, "US"), null)) == null) {
                            str = alias.value;
                        }
                    } else {
                        str = alias.value;
                    }
                    CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(alias.isChecked);
                    boolean z3 = (alias.isChecked && contactMethodDetailsViewModel.checkedAliases.size() == 1) ? false : true;
                    ComposableLambdaImpl rememberComposableLambda6 = Expect_jvmKt.rememberComposableLambda(-50350252, new DateInputKt$DateInputContent$3(str, i20), gapComposer15);
                    boolean changed10 = gapComposer15.changed(function110) | gapComposer15.changedInstance(alias);
                    Object rememberedValue12 = gapComposer15.rememberedValue();
                    Object obj20 = rememberedValue12;
                    if (changed10 || rememberedValue12 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$25 = new CardModelView$1$3$4$2(20, function110, alias);
                        gapComposer15.updateRememberedValue(cardModelView$1$3$4$25);
                        obj20 = cardModelView$1$3$4$25;
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda6, null, (Function0) obj20, z3, false, null, null, 0L, checkbox, null, gapComposer15, 6, 1514);
                    gapComposer15.end(false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                return invoke$com$squareup$cash$work$views$pay$PayHistoryListViewKt$PayHistoryListContent$lambda$3$0$0$$inlined$items$default$4(obj, obj2, obj3, obj4);
            default:
                LazyItemScopeImpl lazyItemScopeImpl14 = (LazyItemScopeImpl) obj;
                int intValue31 = ((Number) obj2).intValue();
                Composer composer16 = (Composer) obj3;
                int intValue32 = ((Number) obj4).intValue();
                if ((intValue32 & 6) == 0) {
                    i16 = intValue32 | (((GapComposer) composer16).changed(lazyItemScopeImpl14) ? 4 : 2);
                } else {
                    i16 = intValue32;
                }
                if ((intValue32 & 48) == 0) {
                    i16 |= ((GapComposer) composer16).changed(intValue31) ? 32 : 16;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(i16 & 1, (i16 & 147) != 146)) {
                    PartnerAccount partnerAccount = (PartnerAccount) list.get(intValue31);
                    gapComposer16.startReplaceGroup(1225269675);
                    ListItemKt.AccountItem(((Set) obj6).contains(partnerAccount.id), false, (Function1) obj5, partnerAccount, null, gapComposer16, 48, 16);
                    gapComposer16.end(false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}

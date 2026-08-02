package com.squareup.cash.maps.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.google.pay.GooglePayLoadingViewKt;
import com.squareup.cash.history.payments.views.PaymentHistoryWidgetKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphPriceModel;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.invitations.InviteContactsHeaderViewModel;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.protos.cash.cashcustomergateway.api.v1.LocalBrand;
import com.squareup.protos.cash.money.content.FinishSetupTileV1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.ContactsStatus;
import com.squareup.protos.franklin.ui.MerchantData;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;
import utils.StringUtilsKt;
import xyz.block.genie.GenieCreateSessionResponse;
import xyz.block.genie.GenieFetchSceneResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class CashMapViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 10;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                ((CashClusterItem) obj).getClass();
                return rectangleShapeKt$RectangleShape$1;
            case 1:
                byte[] bArr = (byte[]) obj;
                int intValue = ((Integer) obj2).intValue();
                bArr.getClass();
                return new GenieCreateSessionResponse(bArr, intValue);
            case 2:
                byte[] bArr2 = (byte[]) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bArr2.getClass();
                return new GenieFetchSceneResponse(bArr2, intValue2);
            case 3:
                Composer composer = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                GooglePayLoadingViewKt.GooglePayLoadingView((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                PaymentHistoryWidgetKt.EmptyState((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                return (!((Boolean) obj).booleanValue() || ((FinishSetupTileV1) obj2) == null) ? AppletAvailabilityState.UNAVAILABLE : AppletAvailabilityState.AVAILABLE;
            case 7:
                Composer composer2 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer2, 199734, 0, 2000);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer3 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m177backgroundbw27NRU);
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
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer3, null);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer4 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-523705990, new CashMapViewKt$$ExternalSyntheticLambda1(i2), gapComposer4), gapComposer4, 3072, 7);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer5 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj3 = DefaultSizes.border.annotationsMap;
                    Colors colors3 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    BoxKt.Box(ImageKt.m178borderxT4_qwU(companion, 1.0f, colors3.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ((DefaultSizes) gapComposer6.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.annotationsMap;
                    Colors colors4 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    BoxKt.Box(ImageKt.m178borderxT4_qwU(companion, 1.0f, colors4.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer7 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, ArcadeBordersKt.lambda$1576343699, gapComposer7, 3072, 7);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.RecurringAutomatic24, (String) null, (Modifier) null, 0L, gapComposer8, 54, 12);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer9 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Object rememberedValue = gapComposer9.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(i2);
                        gapComposer9.updateRememberedValue(rememberedValue);
                    }
                    GraphState graphState = new GraphState((Function1) rememberedValue);
                    graphState.priceModel$delegate.setValue(new CustomOrderGraphPriceModel(2000L, 0L, CollectionsKt__CollectionsKt.listOf((Object[]) new PriceValue[]{new PriceValue(100L), new PriceValue(200L), new PriceValue(300L)})));
                    graphState.currentPrice = 700L;
                    Colors colors5 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, 18.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    CustomOrderGraphKt.CustomOrderGraph(graphState, CustomOrderGraphKt.GRAPH_MODEL_720, 500.0f, "$10,000", "$5,000", null, gapComposer9, 28080, 32);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                CustomOrderGraphKt.ChartLines((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                Composer composer10 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.InformationFill16, (String) null, (Modifier) null, 0L, gapComposer10, 54, 12);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer11 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.investing_components_etf_top_10), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer12 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.investing_components_etf_sectors), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer13 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (!gapComposer13.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer14 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer15 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.CircleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors6 = (Colors) gapComposer15.consume(staticProvidableCompositionLocal);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors6.semantic.background.brand, rectangleShapeKt$RectangleShape$1), 16.0f);
                    Icons icons = Icons.ContactAdd16;
                    Colors colors7 = (Colors) gapComposer15.consume(staticProvidableCompositionLocal);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m298padding3ABfNKs, colors7.semantic.icon.inverse, gapComposer15, 54, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer16 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    InviteContactsHeaderViewModel inviteContactsHeaderViewModel = new InviteContactsHeaderViewModel("Invite Friends, Get $10 Each", "By inviting friends, you confirm that recipients have given consent to receive this message.", true);
                    InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel = new InviteContactsViewModel.PromotionUpsellViewModel("Invite friends, get up to $500", "Ends on 2/15. Terms Apply.", "Learn more", "https://internal.cash.app/dl/flow/PROMOTION_OPT_IN", new InviteContactsViewModel.PromotionUpsellViewModel.PromotionIllustration("fake:///PruningCash.png", "fake:///PruningCash.png", 120, 104));
                    int i4 = -16777217;
                    int i5 = 63;
                    String str = null;
                    boolean z = false;
                    boolean z2 = false;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    String str5 = null;
                    String str6 = null;
                    Image image = null;
                    String str7 = null;
                    String str8 = null;
                    boolean z6 = false;
                    long j = 0;
                    BlockState blockState = null;
                    MerchantData merchantData = null;
                    boolean z7 = false;
                    String str9 = null;
                    Color color = null;
                    Region region = null;
                    String str10 = null;
                    Long l = null;
                    String str11 = null;
                    String str12 = null;
                    String str13 = null;
                    boolean z8 = false;
                    ContactsStatus contactsStatus = null;
                    boolean z9 = false;
                    boolean z10 = false;
                    String str14 = null;
                    LocalBrand localBrand = null;
                    AbstractPersistentList persistentListOf = Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Shrek", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5));
                    InviteContactsViewModel.Contact.Status status = InviteContactsViewModel.Contact.Status.INVITED;
                    InviteContactsViewEvent.Close close = InviteContactsViewEvent.Close.INSTANCE;
                    InviteContactsViewModel.RecommendedContact recommendedContact = new InviteContactsViewModel.RecommendedContact(null, new InviteContactsViewModel.Contact(persistentListOf, status, "Shrek, lives in a swamp", close));
                    AbstractPersistentList persistentListOf2 = Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Fiona", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5));
                    InviteContactsViewModel.Contact.Status status2 = InviteContactsViewModel.Contact.Status.NOT_INVITED;
                    InviteContactsViewModel.RecommendedContact recommendedContact2 = new InviteContactsViewModel.RecommendedContact(null, new InviteContactsViewModel.Contact(persistentListOf2, status2, "Princess Fiona", close));
                    AbstractPersistentList persistentListOf3 = Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Magic Mirror", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5));
                    InviteContactsViewModel.Contact.Status status3 = InviteContactsViewModel.Contact.Status.CASH_CUSTOMER;
                    AbstractPersistentList persistentListOf4 = Tags.persistentListOf(recommendedContact, recommendedContact2, new InviteContactsViewModel.RecommendedContact(null, new InviteContactsViewModel.Contact(persistentListOf3, status3, "Why is this evil", close)));
                    AbstractPersistentList persistentListOf5 = Tags.persistentListOf(new InviteContactsViewModel.Contact(Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Donkey", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5)), status2, "Yep, is a Donkey", close), new InviteContactsViewModel.Contact(Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Gingerbread Man", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5)), status3, "Is made of cookie dough", close), new InviteContactsViewModel.Contact(Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "Lord Fardquaad", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5)), status3, "Hopefully his name is spelt right", close), new InviteContactsViewModel.Contact(Tags.persistentListOf(new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, "The three little pigs", str11, str12, str13, z8, contactsStatus, z9, z10, str14, localBrand, i4, i5)), status3, "Yep, they're pigs", close));
                    Object rememberedValue2 = gapComposer16.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InvestmentHoldingQueries$$ExternalSyntheticLambda4(29);
                        gapComposer16.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    Object rememberedValue3 = gapComposer16.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda0(i3);
                        gapComposer16.updateRememberedValue(rememberedValue3);
                    }
                    Function1 function12 = (Function1) rememberedValue3;
                    Object rememberedValue4 = gapComposer16.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new ClusterItemKt$$ExternalSyntheticLambda0(21);
                        gapComposer16.updateRememberedValue(rememberedValue4);
                    }
                    InviteErrorDialogKt.InviteContactsBody(null, function1, "", function12, "Search phone or email", inviteContactsHeaderViewModel, true, "Get $15", persistentListOf4, persistentListOf5, false, (Function0) rememberedValue4, "", "", promotionUpsellViewModel, false, null, gapComposer16, 14183856, 3510, 98305);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer17 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    InviteContactsHeaderViewModel inviteContactsHeaderViewModel2 = new InviteContactsHeaderViewModel("Invite Friends, Get $10 Each", "By inviting friends, you confirm that recipients have given consent to receive this message.", true);
                    InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel2 = new InviteContactsViewModel.PromotionUpsellViewModel("Invite friends, get up to $500", "Ends on 2/15. Terms Apply.", "Learn more", "https://internal.cash.app/dl/flow/PROMOTION_OPT_IN", new InviteContactsViewModel.PromotionUpsellViewModel.PromotionIllustration("fake:///PruningCash.png", "fake:///PruningCash.png", 120, 104));
                    SmallPersistentVector smallPersistentVector = SmallPersistentVector.EMPTY;
                    Object rememberedValue5 = gapComposer17.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new InvestmentHoldingQueries$$ExternalSyntheticLambda4(27);
                        gapComposer17.updateRememberedValue(rememberedValue5);
                    }
                    Function1 function13 = (Function1) rememberedValue5;
                    Object rememberedValue6 = gapComposer17.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new InvestmentHoldingQueries$$ExternalSyntheticLambda4(28);
                        gapComposer17.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function14 = (Function1) rememberedValue6;
                    Object rememberedValue7 = gapComposer17.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ClusterItemKt$$ExternalSyntheticLambda0(20);
                        gapComposer17.updateRememberedValue(rememberedValue7);
                    }
                    InviteErrorDialogKt.InviteContactsBody(null, function13, "", function14, "Search phone or email", inviteContactsHeaderViewModel2, false, "Get $15", smallPersistentVector, smallPersistentVector, true, (Function0) rememberedValue7, "Allow access", "Make it easy to find friends, protect your account, and prevent spam by allowing Cash App to access and store your contact list.\n \nYou can change these permissions at any time in Settings.", promotionUpsellViewModel2, false, null, gapComposer17, 920153520, 3510, 98305);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                int intValue20 = ((Integer) obj).intValue();
                ((InviteContactsViewModel.Contact) obj2).getClass();
                return "rec_" + intValue20;
            case 25:
                int intValue21 = ((Integer) obj).intValue();
                ((InviteContactsViewModel.Contact) obj2).getClass();
                return "contact_" + intValue21;
            case 26:
                LocationViewModel locationViewModel = (LocationViewModel) obj2;
                ((SaveableHolder) obj).getClass();
                locationViewModel.getClass();
                return CollectionsKt__CollectionsKt.listOf(Double.valueOf(locationViewModel.lat), Double.valueOf(locationViewModel.lng), Float.valueOf(locationViewModel.zoom));
            case 27:
                Composer composer18 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    CardAppMessageViewModel.Ready ready = new CardAppMessageViewModel.Ready("token", new AppMessageImage.Static.Fixed(new Image("fake:///BlueBottle.png", (String) null, 6), false, 104, 104), "Invite friends, get $15 when they get started", (String) null, 0, (StringUtilsKt) null, 120);
                    Object rememberedValue8 = gapComposer18.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new CashMapViewKt$$ExternalSyntheticLambda0(12);
                        gapComposer18.updateRememberedValue(rememberedValue8);
                    }
                    Function1 function15 = (Function1) rememberedValue8;
                    Object rememberedValue9 = gapComposer18.rememberedValue();
                    if (rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CashMapViewKt$$ExternalSyntheticLambda0(13);
                        gapComposer18.updateRememberedValue(rememberedValue9);
                    }
                    MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(null, ready, function15, null, null, (Function1) rememberedValue9, gapComposer18, 196992, 25);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer19 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    CardAppMessageViewModel.Ready ready2 = new CardAppMessageViewModel.Ready("token", new AppMessageImage.Static.Fixed(new Image("fake:///BlueBottle.png", (String) null, 6), false, 104, 104), "Invite friends, get $15 when they get started", "Lorem suspendisse", 0, (StringUtilsKt) null, 112);
                    Object rememberedValue10 = gapComposer19.rememberedValue();
                    if (rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new CashMapViewKt$$ExternalSyntheticLambda0(14);
                        gapComposer19.updateRememberedValue(rememberedValue10);
                    }
                    Function1 function16 = (Function1) rememberedValue10;
                    Object rememberedValue11 = gapComposer19.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new CashMapViewKt$$ExternalSyntheticLambda0(15);
                        gapComposer19.updateRememberedValue(rememberedValue11);
                    }
                    MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(null, ready2, function16, null, null, (Function1) rememberedValue11, gapComposer19, 196992, 25);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer20 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    CardAppMessageViewModel.Ready ready3 = new CardAppMessageViewModel.Ready("token", new AppMessageImage.Static.Fixed(new Image("fake:///BlueBottle.png", (String) null, 6), false, 104, 104), "Invite friends, get $15 when they get started", "Lorem suspendisse", 0, new Actions$One(new Action("Invite friends", null, new AppMessageViewEvent.AppMessageViewed("token"))), 80);
                    Object rememberedValue12 = gapComposer20.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new CashMapViewKt$$ExternalSyntheticLambda0(i2);
                        gapComposer20.updateRememberedValue(rememberedValue12);
                    }
                    Function1 function17 = (Function1) rememberedValue12;
                    Object rememberedValue13 = gapComposer20.rememberedValue();
                    if (rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new CashMapViewKt$$ExternalSyntheticLambda0(11);
                        gapComposer20.updateRememberedValue(rememberedValue13);
                    }
                    MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(null, ready3, function17, null, null, (Function1) rememberedValue13, gapComposer20, 196992, 25);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CashMapViewKt$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
    }
}

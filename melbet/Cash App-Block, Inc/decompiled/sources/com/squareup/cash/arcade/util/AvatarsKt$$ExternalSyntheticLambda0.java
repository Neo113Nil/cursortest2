package com.squareup.cash.arcade.util;

import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0990, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.Companion.Empty) goto L347;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.$r8$classId;
        ComposableLambdaImpl composableLambdaImpl = BitcoinPerformanceSummaryViewKt.f255lambda$1250222084;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = null;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                ((Integer) obj3).getClass();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(704167394);
                String str = painterRequest.url;
                Function1 function12 = painterRequest.onError;
                if (function12 == null) {
                    gapComposer.startReplaceGroup(1230638956);
                } else {
                    gapComposer.startReplaceGroup(1230638957);
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (!changed) {
                        obj4 = rememberedValue;
                        break;
                    }
                    Object avatarsKt$$ExternalSyntheticLambda1 = new AvatarsKt$$ExternalSyntheticLambda1(false ? 1 : 0, function12);
                    gapComposer.updateRememberedValue(avatarsKt$$ExternalSyntheticLambda1);
                    obj4 = avatarsKt$$ExternalSyntheticLambda1;
                    function1 = (Function1) obj4;
                }
                gapComposer.end(false);
                AsyncImagePainter m1447rememberAsyncImagePainter3HmZ8SU = AsyncImageKt.m1447rememberAsyncImagePainter3HmZ8SU(str, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), null, null, function1, gapComposer, 0, 892);
                gapComposer.end(false);
                return m1447rememberAsyncImagePainter3HmZ8SU;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (!gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (!gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    realCellActivityAvatarScope.Avatar(CardViewApi21Impl.addCash(gapComposer4), gapComposer4, (intValue3 << 6) & 896);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                RealCellActivityAvatarScope realCellActivityAvatarScope2 = (RealCellActivityAvatarScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope2.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(realCellActivityAvatarScope2) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    realCellActivityAvatarScope2.Avatar(AvatarEntry.m3382copyDuSw1wk$default(CardViewApi21Impl.addCash(gapComposer5), 0L, new AvatarImage.LocalIcon(Icons.Borrow24, 0L, 6), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE), gapComposer5, (intValue4 << 6) & 896);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                RealCellActivityAvatarScope realCellActivityAvatarScope3 = (RealCellActivityAvatarScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope3.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(realCellActivityAvatarScope3) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    realCellActivityAvatarScope3.Avatar(CardViewApi21Impl.addCash(gapComposer6), gapComposer6, (intValue5 << 6) & 896);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                str2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(str2) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    TickersAmountCaptionKt.TickersAmountCaption(intValue6 & 14, gapComposer7, null, str2);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue7 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                gapComposer8.startReplaceGroup(928967816);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer8, intValue7 & 14, 1);
                gapComposer8.end(false);
                return rememberAsyncImagePainter;
            case 8:
                Composer composer7 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.balance_home_banking_details_help_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer8 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.benefits_leaflet_error_button_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer9 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.bills_subscriptions_merchant_list_done_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer10 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer10).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer12, 0);
                    int hashCode = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer12, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Transformations.SheetHeader(BitcoinInvoiceEntryViewKt.f245lambda$1214956078, (Modifier) null, (Function2) null, (Function2) null, gapComposer12, 6, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer12, null);
                    String stringResource = Room.stringResource(gapComposer12, R.string.profile_section_btc_symbol_learn_more_details);
                    TextStyle textStyle = ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    long j = colors.semantic.text.subtle;
                    ((DefaultSizes) gapComposer12.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer12, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer12, null);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer11 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer11).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Modifier padding2 = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues2);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                    int hashCode2 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer13, padding2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Transformations.SheetHeader(BitcoinInvoiceEntryViewKt.lambda$459466141, (Modifier) null, (Function2) null, (Function2) null, gapComposer13, 6, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer13, null);
                    String stringResource2 = Room.stringResource(gapComposer13, R.string.profile_section_btc_satoshis_learn_more_details);
                    TextStyle textStyle2 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    long j2 = colors2.semantic.text.subtle;
                    ((DefaultSizes) gapComposer13.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer13, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle2, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer13, null);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer12 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.profile_section_btc_satoshis_learn_more), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer13 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer15, null);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue15 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj2);
                gapComposer16.startReplaceGroup(1427359608);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer16, intValue15 & 14, 1);
                gapComposer16.end(false);
                return rememberAsyncImagePainter2;
            case 16:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue16 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj2);
                gapComposer17.startReplaceGroup(1372582296);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, null, gapComposer17, intValue16 & 14, 1);
                gapComposer17.end(false);
                return rememberAsyncImagePainter3;
            case 17:
                Composer composer14 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.bitcoin_stories_error_refresh), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer15 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) 32, (Object) gapComposer19, (Object) 54);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer16 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer16;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) 24, (Object) gapComposer20, (Object) 54);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer17 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer17;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    composableLambdaImpl.invoke((Object) 32, (Object) gapComposer21, (Object) 54);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                int intValue21 = ((Integer) obj).intValue();
                Composer composer18 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer18).changed(intValue21) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer18;
                if (gapComposer22.shouldExecute(1 & intValue22, (intValue22 & 19) != 18)) {
                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), intValue21), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                    Colors colors3 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors3.semantic.background.subtle, ColorKt.RectangleShape), gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer19 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer19;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer23, R.string.bitcoin_views_auto_withdraw_upsell_get_bitkey_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer20 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer20;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer24, R.string.bitcoin_views_auto_withdraw_upsell_get_started_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer21 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer21;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer25, R.string.try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer22 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer22;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.bitcoin_deposits_share_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer23 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer23;
                if (gapComposer27.shouldExecute(1 & intValue27, (intValue27 & 17) != 16)) {
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 150.0f, BitcoinAddressCopySheetViewKt.m3417convertTextUnitToDpo2QH7mI(((Typography) gapComposer27.consume(ArcadeThemeKt.LocalTypography)).labelMedium.spanStyle.fontSize, gapComposer27));
                    Colors colors4 = (Colors) gapComposer27.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer27, -1762997026, gapComposer27, false);
                    } else {
                        gapComposer27.startReplaceGroup(-1762997739);
                        gapComposer27.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors4.semantic.background.subtle, RoundedCornerShapeKt.CircleShape), gapComposer27, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer24 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer24;
                if (gapComposer28.shouldExecute(1 & intValue28, (intValue28 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 48.0f);
                    Colors colors5 = (Colors) gapComposer28.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer28, -1762997026, gapComposer28, false);
                    } else {
                        gapComposer28.startReplaceGroup(-1762997739);
                        gapComposer28.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors5.semantic.background.subtle, RoundedCornerShapeKt.CircleShape), gapComposer28, 0);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer25 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer25;
                if (gapComposer29.shouldExecute(1 & intValue29, (intValue29 & 17) != 16)) {
                    Modifier m287sizeVpY3zN42 = SizeKt.m287sizeVpY3zN4(companion, 100.0f, BitcoinAddressCopySheetViewKt.m3417convertTextUnitToDpo2QH7mI(((Typography) gapComposer29.consume(ArcadeThemeKt.LocalTypography)).bodySmall.spanStyle.fontSize, gapComposer29));
                    Colors colors6 = (Colors) gapComposer29.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer29, -1762997026, gapComposer29, false);
                    } else {
                        gapComposer29.startReplaceGroup(-1762997739);
                        gapComposer29.end(false);
                    }
                    long j3 = colors6.semantic.background.subtle;
                    ((DefaultSizes) gapComposer29.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN42, j3, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer29, 0);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer26 = (Composer) obj2;
                int intValue30 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer26;
                if (gapComposer30.shouldExecute(intValue30 & 1, (intValue30 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer30, R.string.bitcoin_wallet_address_share), (Map) null, (Function1) null, false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}

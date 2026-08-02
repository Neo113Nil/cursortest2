package com.squareup.cash.instruments.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.investing.primitives.FilterToken;
import java.time.Instant;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.investcore.trading.syncvalues.TradingState;
import squareup.cash.portfolios.syncvalues.PortfolioState;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentCellKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InstrumentCellKt$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-717293092);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
                gapComposer.end(false);
                break;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.continue_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Set set = (Set) obj2;
                FamilyProfile familyProfile = (FamilyProfile) obj3;
                set.getClass();
                familyProfile.getClass();
                if (!booleanValue || !set.contains(EligibleFeature.MONEY_INVESTING_APPLET) || (familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    break;
                } else {
                    break;
                }
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                PortfolioState portfolioState = (PortfolioState) obj2;
                TradingState tradingState = (TradingState) obj3;
                if (portfolioState != null && portfolioState.has_portfolio) {
                    boolean z = tradingState != null ? tradingState.has_active_brokerage_account : false;
                    Instant instant = tradingState != null ? tradingState.brokerage_account_transfer_estimated_completion : null;
                    if (!booleanValue2 || z || instant != null) {
                        if (!Intrinsics.areEqual(portfolioState.has_holdings, Boolean.FALSE)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 4:
                FilterToken filterToken = (FilterToken) obj;
                String str = (String) obj2;
                filterToken.getClass();
                str.getClass();
                break;
            case 5:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer3 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.investing_components_cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer4 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer5, null);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer5 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.investing_components_stockselection_select_stock), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 9:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue7 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj2);
                gapComposer7.startReplaceGroup(1456439135);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer7, intValue7 & 14, 1);
                gapComposer7.end(false);
                break;
            case 10:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue8 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                gapComposer8.startReplaceGroup(562504224);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer8, intValue8 & 14, 1);
                gapComposer8.end(false);
                break;
            case 11:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue9 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer9 = (GapComposer) ((Composer) obj2);
                gapComposer9.startReplaceGroup(1085299096);
                AsyncImagePainter rememberAsyncImagePainter4 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, null, gapComposer9, intValue9 & 14, 1);
                gapComposer9.end(false);
                break;
            case 12:
                Composer composer6 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer6;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer10, null);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer10, null);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer7 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.investing_components_category_filter_reset_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 14:
                PainterRequest painterRequest5 = (PainterRequest) obj;
                int intValue12 = ((Integer) obj3).intValue();
                painterRequest5.getClass();
                GapComposer gapComposer12 = (GapComposer) ((Composer) obj2);
                gapComposer12.startReplaceGroup(-1900012502);
                AsyncImagePainter rememberAsyncImagePainter5 = AsyncImageKt.rememberAsyncImagePainter(painterRequest5, null, gapComposer12, intValue12 & 14, 1);
                gapComposer12.end(false);
                break;
            case 15:
                Composer composer8 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer8;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.investing_components_custom_order_set), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer9 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer9;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer14, R.string.investing_components_current_price_content_description);
                    String stringResource2 = Room.stringResource(gapComposer14, R.string.investing_components_current_price_upper);
                    boolean changed = gapComposer14.changed(stringResource);
                    Object rememberedValue = gapComposer14.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SyncDetailsQueries$$ExternalSyntheticLambda2(stringResource, 29);
                        gapComposer14.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer14, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 17:
                PainterRequest painterRequest6 = (PainterRequest) obj;
                int intValue15 = ((Integer) obj3).intValue();
                painterRequest6.getClass();
                GapComposer gapComposer15 = (GapComposer) ((Composer) obj2);
                gapComposer15.startReplaceGroup(1621026357);
                AsyncImagePainter rememberAsyncImagePainter6 = AsyncImageKt.rememberAsyncImagePainter(painterRequest6, null, gapComposer15, intValue15 & 14, 1);
                gapComposer15.end(false);
                break;
            case 18:
                Composer composer10 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer10;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.investing_crypto_components_transfer_change_order_type), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer11 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer11;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.investing_crypto_components_transfer_change_order_type), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer12 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer12;
                if (!gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer13 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer13;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Icons icons = Icons.RecurringAutomatic16;
                    Colors colors = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, colors.semantic.text.subtle, gapComposer19, 54, 4);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 22:
                PainterRequest painterRequest7 = (PainterRequest) obj;
                int intValue20 = ((Integer) obj3).intValue();
                painterRequest7.getClass();
                GapComposer gapComposer20 = (GapComposer) ((Composer) obj2);
                gapComposer20.startReplaceGroup(-80337329);
                AsyncImagePainter rememberAsyncImagePainter7 = AsyncImageKt.rememberAsyncImagePainter(painterRequest7, null, gapComposer20, intValue20 & 14, 1);
                gapComposer20.end(false);
                break;
            case 23:
                PainterRequest painterRequest8 = (PainterRequest) obj;
                int intValue21 = ((Integer) obj3).intValue();
                painterRequest8.getClass();
                GapComposer gapComposer21 = (GapComposer) ((Composer) obj2);
                gapComposer21.startReplaceGroup(-225032467);
                AsyncImagePainter rememberAsyncImagePainter8 = AsyncImageKt.rememberAsyncImagePainter(painterRequest8, null, gapComposer21, intValue21 & 14, 1);
                gapComposer21.end(false);
                break;
            case 24:
                Composer composer14 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer14;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.investing_components_auto_invest_done), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 25:
                PainterRequest painterRequest9 = (PainterRequest) obj;
                int intValue23 = ((Integer) obj3).intValue();
                painterRequest9.getClass();
                GapComposer gapComposer23 = (GapComposer) ((Composer) obj2);
                gapComposer23.startReplaceGroup(-1535034900);
                AsyncImagePainter rememberAsyncImagePainter9 = AsyncImageKt.rememberAsyncImagePainter(painterRequest9, null, gapComposer23, intValue23 & 14, 1);
                gapComposer23.end(false);
                break;
            case 26:
                Composer composer15 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer15;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer24, R.string.cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer16 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer16;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer25, SizeKt.m277height3ABfNKs(companion, 8.0f));
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer17 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer17;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer26, R.string.blockers_invite_header_recommended_contacts_arcade), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer26, 0, 30);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            default:
                Composer composer18 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer18;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer27, SizeKt.m277height3ABfNKs(companion, 16.0f));
                    ModalKt.HorizontalDivider(6, 0, gapComposer27, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                    SpacerKt.Spacer(gapComposer27, SizeKt.m277height3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

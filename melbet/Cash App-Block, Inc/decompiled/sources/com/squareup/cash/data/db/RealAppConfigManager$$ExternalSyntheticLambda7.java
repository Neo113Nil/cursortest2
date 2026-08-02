package com.squareup.cash.data.db;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScope;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.view.map.LimitReachedModalArcadeKt;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.deposits.physical.viewmodels.map.LimitReachedDialogViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealAppConfigManager$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealAppConfigManager$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 5;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        switch (i) {
            case 0:
                SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
                SuggestedRecipientsData suggestedRecipientsData2 = (SuggestedRecipientsData) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (suggestedRecipientsData == null) {
                    suggestedRecipientsData = RecipientConfig.DEFAULT_DATA;
                }
                if (suggestedRecipientsData2 == null) {
                    suggestedRecipientsData2 = RecipientConfig.DEFAULT_DATA;
                }
                break;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.cancel_confirmation_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue3 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(242936197);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer3, intValue3 & 14, 1);
                gapComposer3.end(false);
                break;
            case 4:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue4 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj2);
                gapComposer4.startReplaceGroup(-342689385);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer4, intValue4 & 14, 1);
                gapComposer4.end(false);
                break;
            case 5:
                Composer composer3 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.capture_check_face_permission_dialog_primary_button_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer4 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.capture_check_face_permission_dialog_secondary_button_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 7:
                UiScope uiScope = (UiScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer5).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer5;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer7.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                    Object value = uiScope.$$delegate_0.getTransition().targetState$delegate.getValue();
                    boolean changed = gapComposer7.changed(delegatingSoftwareKeyboardController) | ((intValue7 & 14) == 4);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new RealAppConfigManager$update$2$2(uiScope, delegatingSoftwareKeyboardController, continuation, i2);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer7, value, (Function2) rememberedValue);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer6 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer6;
                if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer7 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (!gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer8 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    Painter painterResource = Countries.painterResource(R.drawable.lock_icon, 0, gapComposer10);
                    FixedScale fixedScale = new FixedScale(0.57f);
                    long j = Color.White;
                    ImageKt.Image(painterResource, null, fillMaxSize, null, fixedScale, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer10, Painter.$stable | 1597872, 40);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer9 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer10 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ShimmerCellsKt.PlaceholderText(0.7f, gapComposer12, 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer11 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ShimmerCellsKt.PlaceholderText(0.7f, gapComposer13, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 14:
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer12).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    VisibleKt.ShimmerBox(null, false, null, Expect_jvmKt.rememberComposableLambda(245938164, new CheckDepositAmountKt$$ExternalSyntheticLambda8(realCellActivityAvatarScope, 28), gapComposer14), gapComposer14, 3072, 7);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer13 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ShimmerCellsKt.PlaceholderText(2.0f, gapComposer15, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 16:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer14).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    realCellActivityAccessoryScope.custom(ShimmerCellsKt.lambda$2086226604);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer15 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.sync_contacts_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.sync_contacts_row_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 20:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue20 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer20 = (GapComposer) ((Composer) obj2);
                gapComposer20.startReplaceGroup(1761085860);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer20, intValue20 & 14, 1);
                gapComposer20.end(false);
                break;
            case 21:
                CashCluster cashCluster = (CashCluster) obj;
                Composer composer18 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                cashCluster.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= (intValue21 & 8) == 0 ? ((GapComposer) composer18).changed(cashCluster) : ((GapComposer) composer18).changedInstance(cashCluster) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer18;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    AtmWithdrawalMapViewArcadeKt.AtmClusterArcade(cashCluster, gapComposer21, (intValue21 & 14) | 8);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer19 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer19;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.blockers_done), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 23:
                Composer composer20 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer20;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer23, R.string.exit), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 24:
                Composer composer21 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer21;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    LimitReachedDialogViewModel limitReachedDialogViewModel = new LimitReachedDialogViewModel(new PaperCashDepositBlocker.LimitsReachedDialog("Deposit Limit Reached", "You’ve reached your paper deposit limit, so you will not be able to deposit in person. Please try again later.", "Show map", null, 8, null));
                    Object rememberedValue2 = gapComposer24.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda14(r8);
                        gapComposer24.updateRememberedValue(rememberedValue2);
                    }
                    LimitReachedModalArcadeKt.LimitReachedModalArcade(limitReachedDialogViewModel, (Function1) rememberedValue2, gapComposer24, 48);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 25:
                CashCluster cashCluster2 = (CashCluster) obj;
                Composer composer22 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                cashCluster2.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= (intValue25 & 8) == 0 ? ((GapComposer) composer22).changed(cashCluster2) : ((GapComposer) composer22).changedInstance(cashCluster2) ? 4 : 2;
                }
                GapComposer gapComposer25 = (GapComposer) composer22;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 19) != 18)) {
                    PaperMoneyDepositMapViewKt.PaperDepositCluster(cashCluster2, gapComposer25, (intValue25 & 14) | 8);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer23 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer23;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.pmd_map_filter_sheet_apply), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer24 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer24;
                if (!gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    gapComposer27.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer25 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer25;
                if (!gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    gapComposer28.skipToGroupEnd();
                }
                break;
            default:
                Composer composer26 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer26;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer29, R.string.direct_deposit_edit_paycheck_amount_continue), (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

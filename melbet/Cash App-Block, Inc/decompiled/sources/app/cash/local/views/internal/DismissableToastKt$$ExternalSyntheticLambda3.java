package app.cash.local.views.internal;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import coil3.size.SizeKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.amountslider.ChangeCurrencyAmountCaptionKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ToastActionScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.treehouse.LegacyAmountPickerBinding;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.payments.views.composer.ErrorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class DismissableToastKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda3(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ToastActionScope toastActionScope = (ToastActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                toastActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(toastActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    zzd zzdVar = Icons.Companion;
                    toastActionScope.IconAction(((intValue << 12) & 57344) | 6, gapComposer, null, Room.stringResource(gapComposer, R.string.local_views_toast_dismiss), this.f$0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                float f = ((Dp) function0.invoke()).value;
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, 0, 0, ConstraintsKt.m1032constrainHeightK40F9xA(Dp.m1037equalsimpl0(f, Float.NaN) ? 0 : measureScope.mo230roundToPx0680j_4(f), constraints.value), 0, 11));
                break;
            case 2:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    TransactorKt.IconAction(titleBarActionScope, Icons.NavigationDiscover, Room.stringResource(gapComposer2, R.string.local_views_search_items), this.f$0, null, null, null, null, null, null, false, gapComposer2, (intValue2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                MeasureScope measureScope2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                measureScope2.getClass();
                measurable2.getClass();
                int mo230roundToPx0680j_4 = measureScope2.mo230roundToPx0680j_4((1.0f - ((Number) function0.invoke()).floatValue()) * 58.0f);
                Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU((-mo230roundToPx0680j_4) * 2, 0, ((Constraints) obj3).value));
                break;
            case 4:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                SizeKt.Button(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, true, null, LocalBrandLocationRowKt.lambda$1925360258, (Composer) obj2, 1597872, 40);
                break;
            case 5:
                ToastActionScope toastActionScope2 = (ToastActionScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                toastActionScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(toastActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    toastActionScope2.TextAction((intValue3 << 9) & 7168, gapComposer3, null, Room.stringResource(gapComposer3, R.string.inline_message_dismissed_toast_undo), this.f$0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 6:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    modalButtonScope.PrimaryModalButtonDestructive(((intValue4 << 12) & 57344) | 3072, 6, gapComposer4, AvatarsKt.lambda$1328290514, null, this.f$0, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 7:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    modalButtonScope2.SecondaryModalButton(this.f$0, null, false, AvatarsKt.lambda$847525855, gapComposer5, ((intValue5 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 8:
                String str = (String) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                int i2 = LegacyAmountPickerBinding.$r8$clinit;
                str.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(str) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    ChangeCurrencyAmountCaptionKt.ChangeCurrencyAmountCaption(intValue6 & 14, gapComposer6, null, str, function0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, null, ButtonProminence.PROMINENT, false, false, null, BillsSubscriptionsMerchantListViewKt.lambda$182234115, gapComposer7, 1573248, 58);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 11:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    TransactorKt.IconAction(titleBarActionScope2, Icons.Refresh24, Room.stringResource(gapComposer9, R.string.refresh_content_description), this.f$0, null, null, null, null, null, null, false, gapComposer9, (intValue9 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer10, 54, 108);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, AddFavoritesViewKt.lambda$1976177665, gapComposer11, 1573296, 56);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, AddFavoritesViewKt.lambda$811657249, gapComposer12, 1573296, 56);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 15:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer13).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    TransactorKt.IconAction(titleBarActionScope3, Icons.NumberPad24, Room.stringResource(gapComposer13, R.string.investing_components_custom_order_calculator), this.f$0, null, null, null, null, null, null, false, gapComposer13, (intValue13 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 16:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    modalButtonScope3.SecondaryModalButton(this.f$0, null, false, InviteErrorDialogKt.f458lambda$1629652393, gapComposer14, ((intValue14 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 17:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    modalButtonScope4.PrimaryModalButton(this.f$0, null, false, InviteErrorDialogKt.lambda$1763567871, gapComposer15, ((intValue15 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 18:
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer16).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    modalButtonScope5.PrimaryModalButtonDestructive(((intValue16 << 12) & 57344) | 3072, 6, gapComposer16, MoneybotChatHistoryViewKt.f480lambda$269802467, null, this.f$0, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 19:
                ModalButtonScope modalButtonScope6 = (ModalButtonScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                modalButtonScope6.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(modalButtonScope6) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    modalButtonScope6.SecondaryModalButton(this.f$0, null, false, MoneybotChatHistoryViewKt.lambda$1381550448, gapComposer17, ((intValue17 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 20:
                ModalButtonScope modalButtonScope7 = (ModalButtonScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                modalButtonScope7.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(modalButtonScope7) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    modalButtonScope7.PrimaryModalButtonDestructive(((intValue18 << 12) & 57344) | 3072, 6, gapComposer18, ExpandableContentKt.f495lambda$1236442413, null, this.f$0, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 21:
                ModalButtonScope modalButtonScope8 = (ModalButtonScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                modalButtonScope8.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer19).changed(modalButtonScope8) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    modalButtonScope8.SecondaryModalButton(this.f$0, null, false, ExpandableContentKt.f498lambda$260423450, gapComposer19, ((intValue19 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 22:
                ModalButtonScope modalButtonScope9 = (ModalButtonScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                modalButtonScope9.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(modalButtonScope9) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    modalButtonScope9.SecondaryModalButton(this.f$0, null, false, ExpandableContentKt.f499lambda$329955404, gapComposer20, ((intValue20 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 23:
                ModalButtonScope modalButtonScope10 = (ModalButtonScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                modalButtonScope10.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(modalButtonScope10) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    modalButtonScope10.PrimaryModalButton(this.f$0, null, true, AliasPickerViewKt.lambda$165908010, gapComposer21, ((intValue21 << 12) & 57344) | 3456, 2);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 24:
                ModalButtonScope modalButtonScope11 = (ModalButtonScope) obj;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                modalButtonScope11.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer22).changed(modalButtonScope11) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    modalButtonScope11.PrimaryModalButton(this.f$0, null, true, AliasPickerViewKt.f526lambda$84098565, gapComposer22, ((intValue22 << 12) & 57344) | 3456, 2);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 25:
                ModalButtonScope modalButtonScope12 = (ModalButtonScope) obj;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                modalButtonScope12.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer23).changed(modalButtonScope12) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    modalButtonScope12.SecondaryModalButton(this.f$0, null, true, AliasPickerViewKt.lambda$1618265512, gapComposer23, ((intValue23 << 12) & 57344) | 3456, 2);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 26:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer24).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    SizeKt.ButtonCta(this.f$0, adaptiveStackScope.horizontalWeight(companion, 1.0f), ButtonProminence.STANDARD, false, false, null, ErrorKt.lambda$2106016631, gapComposer24, 1573248, 56);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 27:
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((GapComposer) composer25).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 19) != 18)) {
                    SizeKt.ButtonCta(this.f$0, adaptiveStackScope2.horizontalWeight(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, ErrorKt.lambda$332176339, gapComposer25, 1573248, 56);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    SyncContactsRowKt.SyncContactsRow(0, gapComposer26, null, function0);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            default:
                Composer composer27 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    SyncContactsRowKt.SyncContactsCard(0, 14, gapComposer27, null, null, null, this.f$0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

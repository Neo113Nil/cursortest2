package com.squareup.cash.borrow.views;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import app.cash.local.primitives.GiftCardAccountNumber;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewEvent;
import app.cash.local.viewmodels.LocalCashAllActivityViewEvent;
import app.cash.local.viewmodels.LocalOpenTabCheckoutViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.music.viewmodels.MusicViewEvent;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.DevicePixelPosition;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.views.ItemCoordinates;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3 implements Function1 {
    public final Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i2) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new BorrowHomeOverlayEvent.BulletinInfoOverlayEvent.TapLink(str));
                return Unit.INSTANCE;
            case 1:
                String str2 = ((PaymentMethodToken) obj).value;
                str2.getClass();
                function1.invoke(new LocalBrandLocationCheckoutViewEvent.PaymentMethodSelected(str2));
                return Unit.INSTANCE;
            case 2:
                ((GiftCardAccountNumber) obj).value.getClass();
                function1.invoke(LocalBrandLocationCheckoutViewEvent.RemoveGiftCardClicked.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                String str3 = ((PaymentMethodToken) obj).value;
                str3.getClass();
                function1.invoke(new LocalOpenTabCheckoutViewEvent.PaymentMethodSelected(str3));
                return Unit.INSTANCE;
            case 4:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new LocalCashAllActivityViewEvent.UrlClicked(str4));
                return Unit.INSTANCE;
            case 5:
                String str5 = ((RecurringPreferenceId) obj).entityId;
                str5.getClass();
                function1.invoke(new BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked(str5));
                return Unit.INSTANCE;
            case 6:
                BorrowHomeOverlayEvent.RepaymentSheetEvent repaymentSheetEvent = (BorrowHomeOverlayEvent.RepaymentSheetEvent) obj;
                repaymentSheetEvent.getClass();
                function1.invoke(repaymentSheetEvent);
                return Unit.INSTANCE;
            case 7:
                BorrowHomeOverlayEvent.RepaymentSheetEvent repaymentSheetEvent2 = (BorrowHomeOverlayEvent.RepaymentSheetEvent) obj;
                repaymentSheetEvent2.getClass();
                function1.invoke(repaymentSheetEvent2);
                return Unit.INSTANCE;
            case 8:
                SelectSponsorViewEvent selectSponsorViewEvent = (SelectSponsorViewEvent) obj;
                selectSponsorViewEvent.getClass();
                function1.invoke(selectSponsorViewEvent);
                return Unit.INSTANCE;
            case 9:
                String str6 = ((RecurringPreferenceId) obj).entityId;
                str6.getClass();
                function1.invoke(new InvestingStockDetailsViewEvent.RecurringPurchaseItemTap(str6));
                return Unit.INSTANCE;
            case 10:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new MusicViewEvent.TrackTapped(str7));
                return Unit.INSTANCE;
            case 11:
                String str8 = (String) obj;
                str8.getClass();
                function1.invoke(new PersonalizePaymentRecipientViewEvent.ReactionTapped(str8));
                return Unit.INSTANCE;
            case 12:
                ItemCoordinates itemCoordinates = (ItemCoordinates) obj;
                itemCoordinates.getClass();
                long j = itemCoordinates.size;
                Size size = new Size((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
                long j2 = itemCoordinates.offset;
                function1.invoke(new PersonalizePaymentRecipientViewEvent.OnCanvasDrawn(new CanvasDetails(size, new DevicePixelPosition(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2))))));
                return Unit.INSTANCE;
            case 13:
                function1.invoke(new PersonalizePaymentViewEvent.SelectBackground(((Number) obj).intValue()));
                return Unit.INSTANCE;
            case 14:
                ItemCoordinates itemCoordinates2 = (ItemCoordinates) obj;
                itemCoordinates2.getClass();
                long j3 = itemCoordinates2.size;
                long j4 = itemCoordinates2.offset;
                int i3 = (int) (j3 & BodyPartID.bodyIdMax);
                if (i3 != 0 && (i = (int) (j3 >> 32)) != 0) {
                    function1.invoke(new PersonalizePaymentViewEvent.OnCanvasDrawn(new CanvasDetails(new Size(i, i3), new DevicePixelPosition(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j4))))));
                }
                return Unit.INSTANCE;
            case 15:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                function1.invoke(new PersonalizePaymentViewEvent.OnAmountDrawn(new CanvasDetails(UtilKt.m3706toSizeozmzZPI(layoutCoordinates.mo838getSizeYbymL2g()), UtilKt.m3705toDevicePixelPositionk4lQ0M(ValueInsets.positionInParent(layoutCoordinates)))));
                return Unit.INSTANCE;
            case 16:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                function1.invoke(new PersonalizePaymentViewEvent.OnAmountDrawn(new CanvasDetails(UtilKt.m3706toSizeozmzZPI(layoutCoordinates2.mo838getSizeYbymL2g()), UtilKt.m3705toDevicePixelPositionk4lQ0M(ValueInsets.positionInParent(layoutCoordinates2)))));
                return Unit.INSTANCE;
            case 17:
                String str9 = (String) obj;
                str9.getClass();
                function1.invoke(str9);
                return Unit.INSTANCE;
            default:
                KotlinType kotlinType = (KotlinType) obj;
                kotlinType.getClass();
                return function1.invoke(kotlinType).toString();
        }
    }
}

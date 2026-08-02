package defpackage;

import android.content.Context;
import com.yandex.go.scooters.domain.model.ScootersBookingException;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import com.yandex.go.scooters.domain.model.ScootersEmptyParkingException;
import com.yandex.go.scooters.domain.model.ScootersPassesListException;
import com.yandex.go.scooters.domain.model.ScootersPreselectionException;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$BackDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$OkDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyButAnotherOnParkingException;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import com.yandex.go.scooters.passes.exception.ScootersPassActionException;
import com.yandex.go.scooters.tariff_fix.domain.model.ScootersFixTariffOfferBuildingException;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class tko0 implements sjn0 {
    public final Context a;

    public tko0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hkn0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [gkn0] */
    public static fkn0 b(Context context, hkn0 hkn0Var, hkn0 hkn0Var2, hkn0 hkn0Var3) {
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = ScootersErrorDialogAnalyticsState.SCOOTER_IS_BUSY;
        ikn0 gkn0Var = hkn0Var == null ? new gkn0(context.getString(kyh0.scooters_booking_failed_scooter_is_busy_title)) : hkn0Var;
        if (hkn0Var2 == 0) {
            hkn0Var2 = new gkn0("");
        }
        ikn0 ikn0Var = hkn0Var2;
        ikn0 ikn0Var2 = hkn0Var3;
        if (hkn0Var3 == null) {
            ikn0Var2 = new gkn0(context.getString(kyh0.scooters_booking_failed_scooter_is_busy_subtitle));
        }
        return new fkn0(scootersErrorDialogAnalyticsState, gkn0Var, ikn0Var, ikn0Var2, null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_booking_failed_look_for_another_on_parking)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.FIND_ANOTHER_SCOOTER_ON_PARKING), 496);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [hkn0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [gkn0] */
    public static fkn0 c(Context context, hkn0 hkn0Var, hkn0 hkn0Var2, hkn0 hkn0Var3) {
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = ScootersErrorDialogAnalyticsState.SCOOTER_IS_BUSY;
        ikn0 gkn0Var = hkn0Var == null ? new gkn0(context.getString(kyh0.scooters_booking_failed_scooter_is_busy_title)) : hkn0Var;
        if (hkn0Var2 == 0) {
            hkn0Var2 = new gkn0("");
        }
        ikn0 ikn0Var = hkn0Var2;
        ikn0 ikn0Var2 = hkn0Var3;
        if (hkn0Var3 == null) {
            ikn0Var2 = new gkn0(context.getString(kyh0.scooters_booking_failed_scooter_is_busy_subtitle));
        }
        return new fkn0(scootersErrorDialogAnalyticsState, gkn0Var, ikn0Var, ikn0Var2, null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_booking_failed_look_for_another)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 496);
    }

    @Override // defpackage.sjn0
    public final jkn0 a(Throwable th) {
        FormattedText formattedText;
        FormattedText formattedText2;
        FormattedText formattedText3;
        FormattedText formattedText4;
        FormattedText formattedText5;
        FormattedText formattedText6;
        ojn0 ojn0Var;
        ojn0 ojn0Var2;
        ojn0 ojn0Var3;
        boolean z = th instanceof ScootersBookingException;
        Context context = this.a;
        if (z) {
            ScootersBookingException scootersBookingException = (ScootersBookingException) th;
            qkn0 payload = scootersBookingException.getPayload();
            if (payload instanceof mkn0) {
                pjn0 content = scootersBookingException.getContent();
                int i = sko0.a[((mkn0) payload).a.ordinal()];
                if (i == 4 || i == 5) {
                    Throwable throwable = scootersBookingException.getThrowable();
                    if (throwable instanceof ScooterIsBusyButAnotherOnParkingException) {
                        if (content == null || (formattedText4 = content.b) == null) {
                            formattedText4 = null;
                        }
                        hkn0 hkn0Var = formattedText4 != null ? new hkn0(formattedText4) : null;
                        if (content == null || (formattedText5 = content.c) == null) {
                            formattedText5 = null;
                        }
                        hkn0 hkn0Var2 = formattedText5 != null ? new hkn0(formattedText5) : null;
                        if (content == null || (formattedText6 = content.d) == null) {
                            formattedText6 = null;
                        }
                        return b(context, hkn0Var, hkn0Var2, formattedText6 != null ? new hkn0(formattedText6) : null);
                    }
                    if (throwable instanceof ScooterIsBusyException) {
                        if (content == null || (formattedText = content.b) == null) {
                            formattedText = null;
                        }
                        hkn0 hkn0Var3 = formattedText != null ? new hkn0(formattedText) : null;
                        if (content == null || (formattedText2 = content.c) == null) {
                            formattedText2 = null;
                        }
                        hkn0 hkn0Var4 = formattedText2 != null ? new hkn0(formattedText2) : null;
                        if (content == null || (formattedText3 = content.d) == null) {
                            formattedText3 = null;
                        }
                        return c(context, hkn0Var3, hkn0Var4, formattedText3 != null ? new hkn0(formattedText3) : null);
                    }
                } else if (content != null) {
                    String str = content.a;
                    FormattedText formattedText7 = content.d;
                    FormattedText formattedText8 = content.c;
                    FormattedText formattedText9 = content.b;
                    List list = content.f;
                    int size = list != null ? list.size() : 0;
                    if (size == 0) {
                        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState = ScootersErrorDialogAnalyticsState.BOOK_FAILED;
                        hkn0 hkn0Var5 = new hkn0(formattedText9);
                        hkn0 hkn0Var6 = new hkn0(formattedText8);
                        hkn0 hkn0Var7 = new hkn0(formattedText7);
                        if (str == null) {
                            str = null;
                        }
                        return new fkn0(scootersErrorDialogAnalyticsState, hkn0Var5, hkn0Var6, hkn0Var7, null, str != null ? new dkn0(str) : null, content.e, new m2v(null, null, null, ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT), 336);
                    }
                    if (size != 1) {
                        if (size == 2 && list != null && list.size() == 2 && (ojn0Var2 = (ojn0) a.S(0, list)) != null && (ojn0Var3 = (ojn0) a.S(1, list)) != null) {
                            ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState2 = ScootersErrorDialogAnalyticsState.BOOK_FAILED;
                            hkn0 hkn0Var8 = new hkn0(formattedText9);
                            hkn0 hkn0Var9 = new hkn0(formattedText8);
                            hkn0 hkn0Var10 = new hkn0(formattedText7);
                            if (str == null) {
                                str = null;
                            }
                            dkn0 dkn0Var = str != null ? new dkn0(str) : null;
                            String str2 = content.e;
                            hkn0 hkn0Var11 = new hkn0(ojn0Var2.b);
                            String str3 = ojn0Var2.c;
                            String str4 = ojn0Var2.a;
                            Object obj = ojn0Var2.d;
                            if (obj == null) {
                                obj = ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT;
                            }
                            m2v m2vVar = new m2v(hkn0Var11, str3, str4, obj);
                            hkn0 hkn0Var12 = new hkn0(ojn0Var3.b);
                            String str5 = ojn0Var3.c;
                            String str6 = ojn0Var3.a;
                            Object obj2 = ojn0Var3.d;
                            if (obj2 == null) {
                                obj2 = ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT;
                            }
                            return new bkn0(scootersErrorDialogAnalyticsState2, hkn0Var8, hkn0Var9, hkn0Var10, dkn0Var, null, str2, m2vVar, new m2v(hkn0Var12, str5, str6, obj2), 336);
                        }
                    } else if (list != null && list.size() == 1 && (ojn0Var = (ojn0) a.S(0, list)) != null) {
                        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState3 = ScootersErrorDialogAnalyticsState.BOOK_FAILED;
                        hkn0 hkn0Var13 = new hkn0(formattedText9);
                        hkn0 hkn0Var14 = new hkn0(formattedText8);
                        hkn0 hkn0Var15 = new hkn0(formattedText7);
                        if (str == null) {
                            str = null;
                        }
                        dkn0 dkn0Var2 = str != null ? new dkn0(str) : null;
                        String str7 = content.e;
                        hkn0 hkn0Var16 = new hkn0(ojn0Var.b);
                        String str8 = ojn0Var.c;
                        String str9 = ojn0Var.a;
                        Object obj3 = ojn0Var.d;
                        if (obj3 == null) {
                            obj3 = ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT;
                        }
                        return new fkn0(scootersErrorDialogAnalyticsState3, hkn0Var13, hkn0Var14, hkn0Var15, null, dkn0Var2, str7, new m2v(hkn0Var16, str8, str9, obj3), 336);
                    }
                }
            }
        } else {
            if (th instanceof ScootersFixTariffOfferBuildingException) {
                ScootersErrorCode errorCode = ((ScootersFixTariffOfferBuildingException) th).getErrorCode();
                int i2 = errorCode != null ? sko0.a[errorCode.ordinal()] : -1;
                if (i2 == 1) {
                    return new bkn0(ScootersErrorDialogAnalyticsState.NOT_ENOUGH_CHARGE, new gkn0(context.getString(kyh0.scooters_not_enough_charge_title)), null, new gkn0(context.getString(kyh0.scooters_not_enough_charge_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.scooters_fix_not_enough_charge_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_not_enough_charge_retry)), null, 14), 468);
                }
                if (i2 == 2) {
                    return new bkn0(ScootersErrorDialogAnalyticsState.TOO_CLOSE_DESTINATION, new gkn0(context.getString(kyh0.scooters_to_close_destination_title)), null, new gkn0(context.getString(kyh0.scooters_to_close_destination_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.scooters_fix_error_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_to_close_destination_retry)), null, 14), 468);
                }
                if (i2 == 3) {
                    return new bkn0(ScootersErrorDialogAnalyticsState.TOO_FAR_DESTINATION, new gkn0(context.getString(kyh0.scooters_to_far_destination_title)), null, new gkn0(context.getString(kyh0.scooters_to_far_destination_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.scooters_fix_error_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_to_far_destination_retry)), null, 14), 468);
                }
            } else {
                if (th instanceof ScooterIsBusyButAnotherOnParkingException) {
                    return b(context, null, null, null);
                }
                if (th instanceof ScooterIsBusyException) {
                    return c(context, null, null, null);
                }
                if (th instanceof ScootersEmptyParkingException) {
                    return new fkn0(ScootersErrorDialogAnalyticsState.EMPTY_PARKING, new gkn0(context.getString(kyh0.scooters_no_available_scooters_title)), null, new gkn0(context.getString(kyh0.scooters_no_available_scooters_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_pf_okay)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                }
                if (th instanceof ScootersPreselectionException) {
                    ScootersPreselectionException scootersPreselectionException = (ScootersPreselectionException) th;
                    ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState4 = ScootersErrorDialogAnalyticsState.SCOOTER_NOT_FOUND;
                    String title = scootersPreselectionException.getTitle();
                    if (title == null) {
                        title = context.getString(kyh0.scooters_data_load_failed);
                    }
                    gkn0 gkn0Var = new gkn0(title);
                    String subtitle = scootersPreselectionException.getSubtitle();
                    if (subtitle == null) {
                        subtitle = context.getString(kyh0.scooters_general_error_subtitle);
                    }
                    return new bkn0(scootersErrorDialogAnalyticsState4, gkn0Var, null, new gkn0(subtitle), new ckn0(f1h0.ic_dialog_error), null, null, null, null, 2004);
                }
                if (th instanceof ScootersPassesListException) {
                    ScootersPassesListException scootersPassesListException = (ScootersPassesListException) th;
                    if (scootersPassesListException instanceof ScootersPassesListException.ScootersPassesNotFoundException) {
                        return new fkn0(ScootersErrorDialogAnalyticsState.PASSES_NOT_FOUND, new gkn0(context.getString(kyh0.scooters_passes_list_not_found_title)), null, new gkn0(context.getString(kyh0.scooters_passes_list_not_found_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.common_got_it)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                    }
                    if (scootersPassesListException instanceof ScootersPassesListException.ScootersPassesListFailedException) {
                        return new bkn0(ScootersErrorDialogAnalyticsState.PASSES_LIST_FAILURE, new gkn0(context.getString(kyh0.scooters_data_load_failed)), null, new gkn0(context.getString(kyh0.scooters_general_error_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, null, 2004);
                    }
                    w511.b();
                    return null;
                }
                if (th instanceof ScootersPassActionException.ScootersPassPurchaseFailedException) {
                    ScootersPassActionException.ScootersPassPurchaseFailedException scootersPassPurchaseFailedException = (ScootersPassActionException.ScootersPassPurchaseFailedException) th;
                    if (jl40.l(scootersPassPurchaseFailedException.getErrorCode(), ScootersErrorCode.INVALID_PAYMENT_METHOD.toString().toLowerCase(Locale.ROOT))) {
                        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState5 = ScootersErrorDialogAnalyticsState.NO_FUNDS;
                        String title2 = scootersPassPurchaseFailedException.getTitle();
                        if (title2 == null) {
                            title2 = context.getString(kyh0.scooters_data_load_failed);
                        }
                        String subtitle2 = scootersPassPurchaseFailedException.getSubtitle();
                        if (subtitle2 == null) {
                            subtitle2 = context.getString(kyh0.scooters_general_error_subtitle);
                        }
                        return new bkn0(scootersErrorDialogAnalyticsState5, new gkn0(title2), null, new gkn0(subtitle2), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.common_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_booking_failed_card_is_not_allowed_btn)), ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_PAYMENT_METHODS, 6), 468);
                    }
                    ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState6 = ScootersErrorDialogAnalyticsState.PASS_ACTION_FAILED;
                    String title3 = scootersPassPurchaseFailedException.getTitle();
                    if (title3 == null) {
                        title3 = context.getString(kyh0.scooters_passes_default_error_title);
                    }
                    String subtitle3 = scootersPassPurchaseFailedException.getSubtitle();
                    if (subtitle3 == null) {
                        subtitle3 = context.getString(kyh0.scooters_passes_default_error_subtitle);
                    }
                    return new fkn0(scootersErrorDialogAnalyticsState6, new gkn0(title3), null, new gkn0(subtitle3), scootersPassPurchaseFailedException.getErrorCode(), new ckn0(f1h0.ic_dialog_error), null, new m2v(new gkn0(context.getString(kyh0.common_got_it)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 452);
                }
                if (th instanceof ScootersPassActionException.ScootersPassActionFailedStatusException) {
                    ScootersPassActionException.ScootersPassActionFailedStatusException scootersPassActionFailedStatusException = (ScootersPassActionException.ScootersPassActionFailedStatusException) th;
                    ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState7 = ScootersErrorDialogAnalyticsState.PASS_ACTION_FAILED;
                    String title4 = scootersPassActionFailedStatusException.getTitle();
                    if (title4 == null) {
                        title4 = context.getString(kyh0.scooters_passes_default_error_title);
                    }
                    String subtitle4 = scootersPassActionFailedStatusException.getSubtitle();
                    if (subtitle4 == null) {
                        subtitle4 = context.getString(kyh0.scooters_passes_default_error_subtitle);
                    }
                    return new fkn0(scootersErrorDialogAnalyticsState7, new gkn0(title4), null, new gkn0(subtitle4), scootersPassActionFailedStatusException.getErrorCode(), new ckn0(f1h0.ic_dialog_error), null, new m2v(new gkn0(context.getString(kyh0.common_got_it)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 452);
                }
                if (th instanceof ScootersPassActionException.ScootersPassActionFailedException) {
                    ScootersPassActionException.ScootersPassActionFailedException scootersPassActionFailedException = (ScootersPassActionException.ScootersPassActionFailedException) th;
                    ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState8 = ScootersErrorDialogAnalyticsState.PASS_ACTION_FAILED;
                    String title5 = scootersPassActionFailedException.getTitle();
                    if (title5 == null) {
                        title5 = context.getString(kyh0.scooters_data_load_failed);
                    }
                    String subtitle5 = scootersPassActionFailedException.getSubtitle();
                    if (subtitle5 == null) {
                        subtitle5 = context.getString(kyh0.scooters_general_error_subtitle);
                    }
                    return new fkn0(scootersErrorDialogAnalyticsState8, new gkn0(title5), null, new gkn0(subtitle5), scootersPassActionFailedException.getErrorCode(), new ckn0(f1h0.ic_dialog_error), null, new m2v(new gkn0(context.getString(kyh0.common_got_it)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 452);
                }
                if (th instanceof ScootersBookingFailedException) {
                    ScootersErrorCode errorCode2 = ((ScootersBookingFailedException) th).getErrorCode();
                    switch (errorCode2 != null ? sko0.a[errorCode2.ordinal()] : -1) {
                        case 5:
                            return c(context, null, null, null);
                        case 6:
                            return new bkn0(ScootersErrorDialogAnalyticsState.OFFER_EXPIRED, new gkn0(context.getString(kyh0.scooters_booking_failed_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_offer_expired)), new ckn0(f1h0.ic_dialog_error), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_check_new_offer)), null, null, ScootersErrorDialogPresentation$RetryDialogButtonListenerType.DEFAULT), 980);
                        case 7:
                            return new fkn0(ScootersErrorDialogAnalyticsState.BOOK_FAILED, new gkn0(context.getString(kyh0.scooters_booking_failed_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_already_has_a_book)), null, null, null, new m2v(new gkn0(context.getString(kyh0.dialog_common_ok)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                        case 8:
                            return new fkn0(ScootersErrorDialogAnalyticsState.DEBT, new gkn0(context.getString(kyh0.scooters_booking_failed_you_have_a_dept_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_you_have_a_dept_subtitle)), null, null, null, new m2v(new gkn0(context.getString(kyh0.dialog_common_ok)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 500);
                        case 9:
                            return new bkn0(ScootersErrorDialogAnalyticsState.CARD_NOT_ALLOWED, new gkn0(context.getString(kyh0.scooters_booking_failed_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_card_is_not_allowed_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, new m2v(new gkn0(context.getString(kyh0.scooters_booking_failed_card_is_not_allowed_btn)), null, null, ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_PAYMENT_METHODS), 980);
                        case 10:
                            return new fkn0(ScootersErrorDialogAnalyticsState.MOS_RU_FAILED, new gkn0(context.getString(kyh0.scooters_booking_failed_title)), null, new gkn0(context.getString(kyh0.scooters_mos_ru_booking_fail_subtitle)), null, new ckn0(f1h0.ic_dialog_error), null, new m2v(new gkn0(context.getString(kyh0.scooters_mos_ru_booking_fail_verify_button)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.OPEN_MOS_RU), 212);
                        case 11:
                            return new bkn0(ScootersErrorDialogAnalyticsState.FRAUDER, new gkn0(context.getString(kyh0.scooters_booking_frauder_error_title)), null, new gkn0(context.getString(kyh0.scooters_booking_frauder_error_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.common_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_open_support)), ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_SUPPORT, 6), 468);
                        case 12:
                            return new bkn0(ScootersErrorDialogAnalyticsState.NO_FUNDS, new gkn0(context.getString(kyh0.scooters_deposit_failed_title)), null, new gkn0(context.getString(kyh0.scooters_deposit_failed_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, r100.C(new gkn0(context.getString(kyh0.common_back)), null, 14), r100.E(new gkn0(context.getString(kyh0.scooters_booking_failed_card_is_not_allowed_btn)), ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_PAYMENT_METHODS, 6), 468);
                        case 13:
                            return new fkn0(ScootersErrorDialogAnalyticsState.LOCKED_RESOURCES_LIMIT_ENRICHED, new gkn0(context.getString(kyh0.scooters_booking_failed_orders_limit_reached_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_orders_limit_reached_subtitle)), null, new ckn0(f1h0.ic_dialog_error), null, new m2v(new gkn0(context.getString(kyh0.common_got_it)), null, null, ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT), 468);
                        default:
                            return new bkn0(ScootersErrorDialogAnalyticsState.BOOK_FAILED, new gkn0(context.getString(kyh0.scooters_booking_failed_title)), null, new gkn0(context.getString(kyh0.scooters_booking_failed_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, null, 2004);
                    }
                }
            }
        }
        return null;
    }
}

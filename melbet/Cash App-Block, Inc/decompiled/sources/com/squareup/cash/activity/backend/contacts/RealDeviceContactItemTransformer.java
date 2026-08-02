package com.squareup.cash.activity.backend.contacts;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.recipients.backend.real.RealRecipientSearchController$search$$inlined$map$2;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.franklin.ui.UiCustomer;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealDeviceContactItemTransformer implements DeviceContactItemTransformer {
    public final RealContactRepository contactRepository;

    public RealDeviceContactItemTransformer(RealContactRepository realContactRepository) {
        this.contactRepository = realContactRepository;
    }

    public static FormattedPaymentHistoryActivityData formattedPaymentHistoryActivityData(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ActivityItemGlobalId activityItemGlobalId, PaymentHistoryData paymentHistoryData) {
        return new FormattedPaymentHistoryActivityData(formattedPaymentHistoryActivityItem.getUiPayment(), formattedPaymentHistoryActivityItem.getUiSender(), formattedPaymentHistoryActivityItem.getUiRecipient(), formattedPaymentHistoryActivityItem.isBadged(), formattedPaymentHistoryActivityItem.getVersion(), formattedPaymentHistoryActivityItem.getSection(), activityItemGlobalId, formattedPaymentHistoryActivityItem.getRowId(), paymentHistoryData, formattedPaymentHistoryActivityItem.getProductClassifiers());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformActivityItem(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ActivityItemGlobalId activityItemGlobalId, ContinuationImpl continuationImpl) {
        RealDeviceContactItemTransformer$transformActivityItem$1 realDeviceContactItemTransformer$transformActivityItem$1;
        int i;
        String str;
        Recipient recipient;
        String str2;
        PaymentHistoryData paymentHistoryData;
        String str3;
        int i2;
        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem;
        ActivityItemGlobalId activityItemGlobalId2 = activityItemGlobalId;
        if (continuationImpl instanceof RealDeviceContactItemTransformer$transformActivityItem$1) {
            realDeviceContactItemTransformer$transformActivityItem$1 = (RealDeviceContactItemTransformer$transformActivityItem$1) continuationImpl;
            int i3 = realDeviceContactItemTransformer$transformActivityItem$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realDeviceContactItemTransformer$transformActivityItem$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = realDeviceContactItemTransformer$transformActivityItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeviceContactItemTransformer$transformActivityItem$1.label;
                int i4 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiCustomer uiRecipient = formattedPaymentHistoryActivityItem2.getRole() == Role.SENDER ? formattedPaymentHistoryActivityItem2.getUiRecipient() : formattedPaymentHistoryActivityItem2.getUiSender();
                    Boolean bool = uiRecipient.is_cash_customer;
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.areEqual(bool, bool2) && uiRecipient.photo_url != null) {
                        return formattedPaymentHistoryActivityData(formattedPaymentHistoryActivityItem2, activityItemGlobalId2, formattedPaymentHistoryActivityItem2.getPaymentHistoryData());
                    }
                    if (Intrinsics.areEqual(uiRecipient.is_cash_customer, bool2)) {
                        str = uiRecipient.id;
                    } else {
                        String str4 = uiRecipient.sms_number;
                        str = str4 == null ? uiRecipient.email_address : str4;
                    }
                    RealRecipientSearchController$search$$inlined$map$2 realRecipientSearchController$search$$inlined$map$2 = new RealRecipientSearchController$search$$inlined$map$2(this.contactRepository.contacts(), i4);
                    if (str == null) {
                        recipient = null;
                        if (recipient != null) {
                            String email = recipient.getEmail();
                            String sms = recipient.getSms();
                            String lookupKey = recipient.getLookupKey();
                            if ((sms == null || StringsKt.isBlank(sms)) && ((email == null || StringsKt.isBlank(email)) && (lookupKey == null || StringsKt.isBlank(lookupKey)))) {
                                str3 = null;
                            } else {
                                if (lookupKey == null || StringsKt.isBlank(lookupKey)) {
                                    i2 = 0;
                                    str3 = "contact:?";
                                } else {
                                    str3 = "contact:?recipient_id=".concat(lookupKey);
                                    i2 = 1;
                                }
                                if (sms == null || StringsKt.isBlank(sms)) {
                                    i4 = i2;
                                } else {
                                    if (i2 != 0) {
                                        str3 = str3.concat("&");
                                    }
                                    str3 = Recorder$$ExternalSyntheticOutline2.m(str3, "sms=", sms);
                                }
                                if (email != null && !StringsKt.isBlank(email)) {
                                    if (i4 != 0) {
                                        str3 = str3.concat("&");
                                    }
                                    str3 = Recorder$$ExternalSyntheticOutline2.m(str3, "email=", email);
                                }
                            }
                            paymentHistoryData = PaymentHistoryData.copy$default(formattedPaymentHistoryActivityItem2.getPaymentHistoryData(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, recipient.getDisplayName(), null, new UiAvatar(null, null, null, null, str3 != null ? new Image(str3, str3, 4) : null, null, null, 32639), null, null, -1, -1, -17301505, 1);
                        } else {
                            paymentHistoryData = formattedPaymentHistoryActivityItem2.getPaymentHistoryData();
                        }
                        return formattedPaymentHistoryActivityData(formattedPaymentHistoryActivityItem2, activityItemGlobalId2, paymentHistoryData);
                    }
                    realDeviceContactItemTransformer$transformActivityItem$1.L$0 = formattedPaymentHistoryActivityItem2;
                    realDeviceContactItemTransformer$transformActivityItem$1.L$1 = activityItemGlobalId2;
                    realDeviceContactItemTransformer$transformActivityItem$1.L$6 = str;
                    realDeviceContactItemTransformer$transformActivityItem$1.label = 1;
                    Object first = FlowKt.first(realRecipientSearchController$search$$inlined$map$2, realDeviceContactItemTransformer$transformActivityItem$1);
                    if (first == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str5 = str;
                    obj = first;
                    str2 = str5;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = realDeviceContactItemTransformer$transformActivityItem$1.L$6;
                    ActivityItemGlobalId activityItemGlobalId3 = realDeviceContactItemTransformer$transformActivityItem$1.L$1;
                    FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem3 = realDeviceContactItemTransformer$transformActivityItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    activityItemGlobalId2 = activityItemGlobalId3;
                    formattedPaymentHistoryActivityItem2 = formattedPaymentHistoryActivityItem3;
                }
                recipient = (Recipient) ((Map) obj).get(str2);
                if (recipient != null) {
                }
                return formattedPaymentHistoryActivityData(formattedPaymentHistoryActivityItem2, activityItemGlobalId2, paymentHistoryData);
            }
        }
        realDeviceContactItemTransformer$transformActivityItem$1 = new RealDeviceContactItemTransformer$transformActivityItem$1(this, continuationImpl);
        Object obj2 = realDeviceContactItemTransformer$transformActivityItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeviceContactItemTransformer$transformActivityItem$1.label;
        int i42 = 1;
        if (i != 0) {
        }
        recipient = (Recipient) ((Map) obj2).get(str2);
        if (recipient != null) {
        }
        return formattedPaymentHistoryActivityData(formattedPaymentHistoryActivityItem2, activityItemGlobalId2, paymentHistoryData);
    }
}

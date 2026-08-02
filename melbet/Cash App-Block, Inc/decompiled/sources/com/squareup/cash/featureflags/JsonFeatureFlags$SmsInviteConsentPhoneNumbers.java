package com.squareup.cash.featureflags;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$SmsInviteConsentPhoneNumbers extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$SmsInviteConsentPhoneNumbers INSTANCE = new JsonFeatureFlags$SmsInviteConsentPhoneNumbers(SmsInviteConsentPhoneNumbersOptions.class, new FeatureFlag$JsonFeatureFlag.Options("default", new SmsInviteConsentPhoneNumbersOptions(null, null, null, 7, null)), "cashclient/sms_invite_consent_phone_number_area_codes");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$SmsInviteConsentPhoneNumbers$SmsInviteConsentPhoneNumbersOptions", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class SmsInviteConsentPhoneNumbersOptions {
        public final List FL;
        public final List OK;
        public final List WA;

        public SmsInviteConsentPhoneNumbersOptions(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? EmptyList.INSTANCE : list2, (i & 4) != 0 ? EmptyList.INSTANCE : list3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmsInviteConsentPhoneNumbersOptions)) {
                return false;
            }
            SmsInviteConsentPhoneNumbersOptions smsInviteConsentPhoneNumbersOptions = (SmsInviteConsentPhoneNumbersOptions) obj;
            return Intrinsics.areEqual(this.FL, smsInviteConsentPhoneNumbersOptions.FL) && Intrinsics.areEqual(this.OK, smsInviteConsentPhoneNumbersOptions.OK) && Intrinsics.areEqual(this.WA, smsInviteConsentPhoneNumbersOptions.WA);
        }

        public final int hashCode() {
            return this.WA.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.FL.hashCode() * 31, 31, this.OK);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("SmsInviteConsentPhoneNumbersOptions(FL=", ", OK=", ", WA=", this.FL, this.OK), this.WA, ")");
        }

        public SmsInviteConsentPhoneNumbersOptions(List list, List list2, List list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.FL = list;
            this.OK = list2;
            this.WA = list3;
        }
    }
}

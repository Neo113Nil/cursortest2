package com.google.i18n.phonenumbers;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class Phonenumber$PhoneNumber implements Serializable {
    public boolean hasCountryCode;
    public boolean hasCountryCodeSource;
    public boolean hasExtension;
    public boolean hasItalianLeadingZero;
    public boolean hasNationalNumber;
    public boolean hasNumberOfLeadingZeros;
    public boolean hasPreferredDomesticCarrierCode;
    public boolean hasRawInput;
    public int countryCode_ = 0;
    public long nationalNumber_ = 0;
    public String extension_ = "";
    public boolean italianLeadingZero_ = false;
    public int numberOfLeadingZeros_ = 1;
    public String rawInput_ = "";
    public String preferredDomesticCarrierCode_ = "";
    public int countryCodeSource_ = 5;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phonenumber$PhoneNumber)) {
            return false;
        }
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = (Phonenumber$PhoneNumber) obj;
        if (this == phonenumber$PhoneNumber) {
            return true;
        }
        return this.countryCode_ == phonenumber$PhoneNumber.countryCode_ && this.nationalNumber_ == phonenumber$PhoneNumber.nationalNumber_ && this.extension_.equals(phonenumber$PhoneNumber.extension_) && this.italianLeadingZero_ == phonenumber$PhoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phonenumber$PhoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phonenumber$PhoneNumber.rawInput_) && this.countryCodeSource_ == phonenumber$PhoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phonenumber$PhoneNumber.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode;
    }

    public final int hashCode() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Thread$State$EnumUnboxingLocalUtility.m(this.countryCodeSource_, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((((JsonLogicResult$Success$$ExternalSyntheticOutline0.m((Long.valueOf(this.nationalNumber_).hashCode() + ((2173 + this.countryCode_) * 53)) * 53, 53, this.extension_) + (this.italianLeadingZero_ ? 1231 : 1237)) * 53) + this.numberOfLeadingZeros_) * 53, 53, this.rawInput_), 53), 53, this.preferredDomesticCarrierCode_) + (this.hasPreferredDomesticCarrierCode ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.countryCode_);
        sb.append(" National Number: ");
        sb.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.hasNumberOfLeadingZeros) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.numberOfLeadingZeros_);
        }
        if (this.hasExtension) {
            sb.append(" Extension: ");
            sb.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            sb.append(" Country Code Source: ");
            sb.append(zzel$EnumUnboxingLocalUtility.stringValueOf$10(this.countryCodeSource_));
        }
        if (this.hasPreferredDomesticCarrierCode) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.preferredDomesticCarrierCode_);
        }
        return sb.toString();
    }
}

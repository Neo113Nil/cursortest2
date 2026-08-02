package com.squareup.address.typeahead.backend.api;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class AddressKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Country.values().length];
            try {
                iArr[Country.US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Country.CA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Country.AU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String buildAsString(GlobalAddress globalAddress, boolean z) {
        if (globalAddress == null) {
            return "";
        }
        Country country = globalAddress.country_code;
        int i = country == null ? -1 : WhenMappings.$EnumSwitchMapping$0[country.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            if (globalAddress.address_line_1 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Address Line 1 is required for US/CA/AU addresses.");
                return null;
            }
            if (globalAddress.locality == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Locality is required for US/CA/AU addresses.");
                return null;
            }
            if (globalAddress.postal_code == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Postal code is required for US/CA/AU  addresses.");
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(globalAddress.address_line_1);
        String str = globalAddress.address_line_2;
        if (str != null && !StringsKt.isBlank(str)) {
            sb.append(", ");
            sb.append(globalAddress.address_line_2);
        }
        if (z) {
            sb.append(", ");
        } else {
            sb.append('\n');
        }
        sb.append(globalAddress.locality);
        if (globalAddress.country_code != Country.GB) {
            String str2 = globalAddress.administrative_district_level_1;
            if (str2 != null && !StringsKt.isBlank(str2)) {
                sb.append(", ");
                sb.append(globalAddress.administrative_district_level_1);
            }
            sb.append(' ');
        } else {
            sb.append(", ");
        }
        String str3 = globalAddress.postal_code;
        if (str3 != null) {
            sb.append(str3);
        }
        String sb2 = sb.toString();
        for (int length = sb2.length() - 1; -1 < length; length--) {
            char charAt = sb2.charAt(length);
            if (charAt != ',' && charAt != ' ') {
                return sb2.substring(0, length + 1);
            }
        }
        return "";
    }
}

package com.squareup.cash.multiplatform.bitcoin.parsers;

import com.squareup.cash.beacondetection.real.IBeaconParser;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.encoding.Bech32;
import com.squareup.cash.multiplatform.bitcoin.parsers.util.LightningHumanReadableAddressValidator;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes.dex */
public final class RealLightningInvoiceParser {
    public static LightningInvoice parse(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "lightning://", true)) {
            str = StringsKt___StringsKt.drop(12, str);
        } else if (StringsKt__StringsJVMKt.startsWith(str, "lightning:", true)) {
            str = StringsKt___StringsKt.drop(10, str);
        }
        try {
            LightningPrefixes access$toLightningPrefix = IBeaconParser.access$toLightningPrefix(Bech32.decode(str, false).getHrp());
            if (access$toLightningPrefix == null) {
                return null;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return new LightningInvoice.Invoice(access$toLightningPrefix, lowerCase);
        } catch (Exception unused) {
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (LightningHumanReadableAddressValidator.isAddressValid(lowerCase2)) {
                return new LightningInvoice.LUD16Address(lowerCase2);
            }
            return null;
        }
    }
}

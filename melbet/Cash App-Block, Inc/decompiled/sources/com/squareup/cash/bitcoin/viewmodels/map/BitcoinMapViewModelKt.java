package com.squareup.cash.bitcoin.viewmodels.map;

import com.squareup.address.typeahead.backend.api.AddressKt;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import com.squareup.protos.cash.btcnetwork.external.PaymentMethods;
import com.squareup.protos.common.location.GlobalAddress;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class BitcoinMapViewModelKt {
    public static final BitcoinLocationFilter DefaultLocationFilter = new BitcoinLocationFilter(false);

    public static final BitcoinLocationViewModel toViewModel(BitcoinSellerLocation bitcoinSellerLocation, boolean z) {
        bitcoinSellerLocation.getClass();
        Double d = bitcoinSellerLocation.latitude;
        d.getClass();
        double doubleValue = d.doubleValue();
        Double d2 = bitcoinSellerLocation.longitude;
        d2.getClass();
        double doubleValue2 = d2.doubleValue();
        GlobalAddress globalAddress = bitcoinSellerLocation.address;
        String buildAsString = globalAddress != null ? AddressKt.buildAsString(globalAddress, false) : null;
        String str = bitcoinSellerLocation.name;
        str.getClass();
        EnumSet noneOf = EnumSet.noneOf(BitcoinLocationViewModel.PaymentMethod.class);
        PaymentMethods paymentMethods = bitcoinSellerLocation.payment_methods;
        if (paymentMethods != null && Intrinsics.areEqual(paymentMethods.lightning, Boolean.TRUE)) {
            noneOf.add(BitcoinLocationViewModel.PaymentMethod.LIGHTNING);
        }
        noneOf.getClass();
        Boolean bool = bitcoinSellerLocation.is_square_seller;
        return new BitcoinLocationViewModel(doubleValue, doubleValue2, buildAsString, str, noneOf, bool != null ? bool.booleanValue() : false, bitcoinSellerLocation.icon_url, bitcoinSellerLocation.description, z, false);
    }
}

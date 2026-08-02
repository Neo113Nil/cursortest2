package com.squareup.address.typeahead.backend.api;

import com.google.mlkit.vision.text.zzd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AddressComponents$Country {
    public static final /* synthetic */ AddressComponents$Country[] $VALUES;
    public static final zzd Companion;
    public static final AddressComponents$Country US;

    static {
        AddressComponents$Country addressComponents$Country = new AddressComponents$Country("US", 0);
        US = addressComponents$Country;
        $VALUES = new AddressComponents$Country[]{addressComponents$Country};
        Companion = new zzd(14);
    }

    public static AddressComponents$Country valueOf(String str) {
        return (AddressComponents$Country) Enum.valueOf(AddressComponents$Country.class, str);
    }

    public static AddressComponents$Country[] values() {
        return (AddressComponents$Country[]) $VALUES.clone();
    }
}

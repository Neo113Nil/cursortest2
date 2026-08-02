package com.squareup.cash.lynx.api.v1_0;

import com.google.mlkit.vision.text.zzc;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public enum EnrichmentType implements WireEnum {
    BINFO_DETAILS(1),
    BANKINFO_DETAILS(2),
    BROWSER_INTERACTION_DETAILS(3),
    MICROAUTH_VERIFICATION_DETAILS(4),
    SVB_BALANCE_DETAILS(5),
    INSTRUMENT_LINK_METADATA(6),
    INSTRUMENT_LINK_OWNER_DETAILS(7);

    public final int value;
    public static final zzc Companion = new zzc(26);
    public static final EnrichmentType$Companion$ADAPTER$1 ADAPTER = new EnrichmentType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EnrichmentType.class), Syntax.PROTO_2, null);

    EnrichmentType(int i) {
        this.value = i;
    }

    public static final EnrichmentType fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 1:
                return BINFO_DETAILS;
            case 2:
                return BANKINFO_DETAILS;
            case 3:
                return BROWSER_INTERACTION_DETAILS;
            case 4:
                return MICROAUTH_VERIFICATION_DETAILS;
            case 5:
                return SVB_BALANCE_DETAILS;
            case 6:
                return INSTRUMENT_LINK_METADATA;
            case 7:
                return INSTRUMENT_LINK_OWNER_DETAILS;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

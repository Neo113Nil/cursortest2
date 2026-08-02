package com.fillr.browsersdk.tls.asn1;

import java.util.HashMap;

/* loaded from: classes4.dex */
public enum ASN1Type {
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(1),
    INTEGER(2),
    BIT_STRING(3),
    /* JADX INFO: Fake field, exist only in values array */
    OCTET_STRING(4),
    NULL(5),
    OBJECT_IDENTIFIER(6),
    SEQUENCE(48),
    SET(49),
    UTF_STRING(12),
    /* JADX INFO: Fake field, exist only in values array */
    PRINTABLE_STRING(19),
    UTC_TIME(23);

    public static final HashMap VALUES = new HashMap();
    public final byte tag;

    static {
        for (ASN1Type aSN1Type : values()) {
            VALUES.put(Byte.valueOf(aSN1Type.tag), aSN1Type);
        }
    }

    ASN1Type(int i) {
        this.tag = (byte) i;
    }
}

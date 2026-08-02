package com.plaid.internal.core.protos.income_verification_manager;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes5.dex */
public enum b implements Internal.EnumLite {
    DOCUMENT_TYPE_UNKNOWN(0),
    DOCUMENT_TYPE_PAYSTUB(1),
    DOCUMENT_TYPE_BANK_STATEMENT(2),
    DOCUMENT_TYPE_US_TAX_W2(3),
    DOCUMENT_TYPE_US_MILITARY_ERAS(4),
    DOCUMENT_TYPE_US_MILITARY_LES(5),
    DOCUMENT_TYPE_US_MILITARY_CLES(6),
    DOCUMENT_TYPE_GIG(7),
    DOCUMENT_TYPE_NONE(8),
    DOCUMENT_TYPE_US_TAX_1099_MISC(9),
    DOCUMENT_TYPE_US_TAX_1099_K(10),
    DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF(11),
    UNRECOGNIZED(-1);

    public static final int DOCUMENT_TYPE_BANK_STATEMENT_VALUE = 2;
    public static final int DOCUMENT_TYPE_GIG_VALUE = 7;
    public static final int DOCUMENT_TYPE_NONE_VALUE = 8;
    public static final int DOCUMENT_TYPE_PAYSTUB_VALUE = 1;
    public static final int DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF_VALUE = 11;
    public static final int DOCUMENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int DOCUMENT_TYPE_US_MILITARY_CLES_VALUE = 6;
    public static final int DOCUMENT_TYPE_US_MILITARY_ERAS_VALUE = 4;
    public static final int DOCUMENT_TYPE_US_MILITARY_LES_VALUE = 5;
    public static final int DOCUMENT_TYPE_US_TAX_1099_K_VALUE = 10;
    public static final int DOCUMENT_TYPE_US_TAX_1099_MISC_VALUE = 9;
    public static final int DOCUMENT_TYPE_US_TAX_W2_VALUE = 3;
    public static final a b = new a();
    public final int a;

    public class a implements Internal.EnumLiteMap<b> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final b findValueByNumber(int i) {
            return b.forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.b$b, reason: collision with other inner class name */
    public static final class C0018b implements Internal.EnumVerifier {
        public static final C0018b a = new C0018b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return b.forNumber(i) != null;
        }
    }

    b(int i) {
        this.a = i;
    }

    public static b forNumber(int i) {
        switch (i) {
            case 0:
                return DOCUMENT_TYPE_UNKNOWN;
            case 1:
                return DOCUMENT_TYPE_PAYSTUB;
            case 2:
                return DOCUMENT_TYPE_BANK_STATEMENT;
            case 3:
                return DOCUMENT_TYPE_US_TAX_W2;
            case 4:
                return DOCUMENT_TYPE_US_MILITARY_ERAS;
            case 5:
                return DOCUMENT_TYPE_US_MILITARY_LES;
            case 6:
                return DOCUMENT_TYPE_US_MILITARY_CLES;
            case 7:
                return DOCUMENT_TYPE_GIG;
            case 8:
                return DOCUMENT_TYPE_NONE;
            case 9:
                return DOCUMENT_TYPE_US_TAX_1099_MISC;
            case 10:
                return DOCUMENT_TYPE_US_TAX_1099_K;
            case 11:
                return DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<b> internalGetValueMap() {
        return b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C0018b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static b valueOf(int i) {
        return forNumber(i);
    }
}

package com.miteksystems.misnap.core;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/Barcode;", "", "Companion", "$serializer", "Type", "core_release"}, k = 1, mv = {1, 8, 0})
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class Barcode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String a;
    public final byte[] b;
    public final Type c;
    public final Boolean d;
    public final Vds e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/Barcode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Barcode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return Barcode$$serializer.INSTANCE;
        }
    }

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        QR("QR"),
        /* JADX INFO: Fake field, exist only in values array */
        DATA_MATRIX("DATA_MATRIX"),
        /* JADX INFO: Fake field, exist only in values array */
        RSS("RSS"),
        /* JADX INFO: Fake field, exist only in values array */
        CODE_39("39"),
        /* JADX INFO: Fake field, exist only in values array */
        CODE_128("128"),
        /* JADX INFO: Fake field, exist only in values array */
        PDF417("PDF417"),
        /* JADX INFO: Fake field, exist only in values array */
        AZTEC_CODE("AZTEC"),
        /* JADX INFO: Fake field, exist only in values array */
        CODE_2_OF_5("2_OF_5"),
        /* JADX INFO: Fake field, exist only in values array */
        CODE_93("93"),
        /* JADX INFO: Fake field, exist only in values array */
        CODABAR("CODABAR");

        public final String a;

        Type(String str) {
            this.a = str;
        }
    }

    public /* synthetic */ Barcode(int i, String str, byte[] bArr, Type type2, Boolean bool, Vds vds) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bArr;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = type2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = vds;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Barcode)) {
            return false;
        }
        Barcode barcode = (Barcode) obj;
        return Intrinsics.areEqual(this.a, barcode.a) && Intrinsics.areEqual(this.b, barcode.b) && this.c == barcode.c && Intrinsics.areEqual(this.d, barcode.d) && Intrinsics.areEqual(this.e, barcode.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        byte[] bArr = this.b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Type type2 = this.c;
        int hashCode3 = (hashCode2 + (type2 == null ? 0 : type2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Vds vds = this.e;
        return hashCode4 + (vds != null ? vds.hashCode() : 0);
    }

    public final String toString() {
        return "Barcode(encodedBarcode=" + this.a + ", rawBarcode=" + Arrays.toString(this.b) + ", type=" + this.c + ", isVds=" + this.d + ", vds=" + this.e + ')';
    }

    public Barcode(String str, byte[] bArr, Type type2, Boolean bool, Vds vds) {
        this.a = str;
        this.b = bArr;
        this.c = type2;
        this.d = bool;
        this.e = vds;
    }
}

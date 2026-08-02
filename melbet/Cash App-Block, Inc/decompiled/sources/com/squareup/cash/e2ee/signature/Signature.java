package com.squareup.cash.e2ee.signature;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/signature/Signature;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Signature {
    public final List certs;
    public final byte[] key;

    public Signature(List list, byte[] bArr) {
        bArr.getClass();
        this.key = bArr;
        this.certs = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Signature.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            Signature signature = (Signature) obj;
            List list = signature.certs;
            if (Arrays.equals(this.key, signature.key)) {
                List list2 = this.certs;
                if (list2.size() == list.size()) {
                    int i = 0;
                    for (Object obj2 : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        if (Arrays.equals((byte[]) obj2, (byte[]) list.get(i))) {
                            i = i2;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.certs.hashCode() + (Arrays.hashCode(this.key) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("Signature(key=", Arrays.toString(this.key), ", certs=", ")", this.certs);
    }
}

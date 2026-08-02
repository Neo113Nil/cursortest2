package defpackage;

import com.yandex.xplat.common.Encoding;
import com.yandex.xplat.common.HashType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class qbh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HashType.values().length];
        try {
            iArr[HashType.Md5.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HashType.Sha256.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HashType.Sha512.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Encoding.values().length];
        try {
            iArr2[Encoding.Base64.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Encoding.Utf8.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}

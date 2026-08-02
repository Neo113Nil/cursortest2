package defpackage;

import com.yandex.fintechsdk.core.nfc.api.NfcCardType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class z760 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NfcCardType.values().length];
        try {
            iArr[NfcCardType.TROIKA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}

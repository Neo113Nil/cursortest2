package defpackage;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneBankCacheInitiatedReceiverType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class rh01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.values().length];
        try {
            iArr[TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.CONTACT_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.CLIPBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.MYSELF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferEvents$TransferPhoneBankCacheInitiatedReceiverType.MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class z331 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VaultRarity.values().length];
        try {
            iArr[VaultRarity.COMMON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VaultRarity.RARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VaultRarity.LEGENDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

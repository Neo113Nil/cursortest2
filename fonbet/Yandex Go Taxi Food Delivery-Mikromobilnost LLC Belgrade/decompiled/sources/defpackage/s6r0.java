package defpackage;

import com.ybsdk.feature.settings.api.SettingsOpeningSource;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class s6r0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SettingsOpeningSource.values().length];
        try {
            iArr[SettingsOpeningSource.MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SettingsOpeningSource.TRANSFERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

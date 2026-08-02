package defpackage;

import com.yandex.go.trusted_contacts.domain.entities.TrustedContactsMode;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class xg11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrustedContactsMode.values().length];
        try {
            iArr[TrustedContactsMode.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrustedContactsMode.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

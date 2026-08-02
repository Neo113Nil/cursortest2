package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class tg11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrustedContactsErrorActionDto.values().length];
        try {
            iArr[TrustedContactsErrorActionDto.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrustedContactsErrorActionDto.BACK_TO_CONTACT_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class qlr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ErrorScreenAction.values().length];
        try {
            iArr[ErrorScreenAction.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ErrorScreenAction.BACK_TO_CONTACT_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ErrorScreenAction.TRY_AGAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.trusted_contacts.domain.entities.DialogButton;
import com.yandex.go.trusted_contacts.ui.TrustedContactsButtonAction;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class rh11 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[DialogButton.values().length];
        try {
            iArr[DialogButton.ADDITIONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DialogButton.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TrustedContactsButtonAction.values().length];
        try {
            iArr2[TrustedContactsButtonAction.CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TrustedContactsButtonAction.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ErrorScreenAction.values().length];
        try {
            iArr3[ErrorScreenAction.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ErrorScreenAction.BACK_TO_CONTACT_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ErrorScreenAction.TRY_AGAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}

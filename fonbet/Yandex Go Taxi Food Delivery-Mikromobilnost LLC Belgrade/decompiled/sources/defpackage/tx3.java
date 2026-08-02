package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tx3 implements qas0 {
    public final BottomSheetDialogView.State a;

    public tx3(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx3) && this.a.equals(((tx3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExitConfirmationNotice(bottomSheetState=" + this.a + Extension.C_BRAKE;
    }
}

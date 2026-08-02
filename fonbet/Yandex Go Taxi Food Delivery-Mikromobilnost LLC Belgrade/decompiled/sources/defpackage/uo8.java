package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uo8 implements vo8 {
    public final BottomSheetDialogView.State a;

    public uo8(BottomSheetDialogView.State state) {
        this.a = state;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uo8) && this.a.equals(((uo8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(content=" + this.a + Extension.C_BRAKE;
    }
}

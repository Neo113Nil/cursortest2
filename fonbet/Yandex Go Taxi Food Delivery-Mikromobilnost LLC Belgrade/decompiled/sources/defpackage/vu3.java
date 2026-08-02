package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vu3 implements zu3 {
    public final BottomSheetDialogView.State.a a;
    public final YbButtonView.a b;
    public final YbButtonView.a c;

    public vu3(BottomSheetDialogView.State.a aVar, YbButtonView.a aVar2, YbButtonView.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public final BottomSheetDialogView.State.a a() {
        return this.a;
    }

    public final YbButtonView.a b() {
        return this.b;
    }

    public final YbButtonView.a c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu3)) {
            return false;
        }
        vu3 vu3Var = (vu3) obj;
        return this.a.equals(vu3Var.a) && this.b.equals(vu3Var.b) && jl40.l(this.c, vu3Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        YbButtonView.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ConfirmSaveBeforeExit(content=" + this.a + ", primaryButtonState=" + this.b + ", secondaryButtonState=" + this.c + Extension.C_BRAKE;
    }
}

package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qij implements rij {
    public final bij a;
    public final BottomSheetDialogView.State b;

    public qij(bij bijVar, BottomSheetDialogView.State state) {
        this.a = bijVar;
        this.b = state;
    }

    @Override // defpackage.rij
    public final BottomSheetDialogView.State a() {
        return this.b;
    }

    public final bij b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qij)) {
            return false;
        }
        qij qijVar = (qij) obj;
        return jl40.l(this.a, qijVar.a) && this.b.equals(qijVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(entity=" + this.a + ", bottomSheet=" + this.b + Extension.C_BRAKE;
    }
}

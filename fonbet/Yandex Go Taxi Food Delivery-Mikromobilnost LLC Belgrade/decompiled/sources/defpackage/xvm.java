package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;

/* loaded from: classes5.dex */
public final class xvm {
    public static final xvm g = new xvm(DuePickerButtonType.UNKNOWN, null, 0, null, null, false, 62);
    public final DuePickerButtonType a;
    public final String b;
    public final int c;
    public final String d;
    public final ControlButtonState e;
    public final boolean f;

    public xvm(DuePickerButtonType duePickerButtonType, String str, int i, String str2, ControlButtonState controlButtonState, boolean z, int i2) {
        str = (i2 & 2) != 0 ? "" : str;
        i = (i2 & 4) != 0 ? -1 : i;
        str2 = (i2 & 8) != 0 ? "" : str2;
        controlButtonState = (i2 & 16) != 0 ? ControlButtonState.INVALID_MAIN : controlButtonState;
        z = (i2 & 32) != 0 ? false : z;
        this.a = duePickerButtonType;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = controlButtonState;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvm)) {
            return false;
        }
        xvm xvmVar = (xvm) obj;
        return this.a == xvmVar.a && jl40.l(this.b, xvmVar.b) && this.c == xvmVar.c && jl40.l(this.d, xvmVar.d) && this.e == xvmVar.e && this.f == xvmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + unr0.b(oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DuePickerControlButtonModel(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", titleRes=");
        smw0.t(this.c, ", subtitle=", this.d, ", state=", sb);
        sb.append(this.e);
        sb.append(", isShimmering=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}

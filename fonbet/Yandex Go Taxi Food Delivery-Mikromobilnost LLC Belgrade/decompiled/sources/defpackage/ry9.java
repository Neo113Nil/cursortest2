package defpackage;

import com.yandex.go.chargers.error.api.ChargersErrorUiState$Action;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ry9 {
    public final CharSequence a;
    public final ChargersErrorUiState$Action b;

    public ry9(String str, ChargersErrorUiState$Action chargersErrorUiState$Action) {
        this.a = str;
        this.b = chargersErrorUiState$Action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry9)) {
            return false;
        }
        ry9 ry9Var = (ry9) obj;
        return jl40.l(this.a, ry9Var.a) && this.b == ry9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(text=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}

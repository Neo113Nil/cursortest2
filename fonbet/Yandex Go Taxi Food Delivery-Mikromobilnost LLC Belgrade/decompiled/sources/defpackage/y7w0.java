package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y7w0 implements z7w0 {
    public final AdditionalAction a;
    public final String b;

    public y7w0(AdditionalAction additionalAction, String str) {
        this.a = additionalAction;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7w0)) {
            return false;
        }
        y7w0 y7w0Var = (y7w0) obj;
        return this.a == y7w0Var.a && jl40.l(this.b, y7w0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.e(this.a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return "Modal(additionalAction=" + this.a + ", shouldLogPerf=true, tariffClass=" + this.b + Extension.C_BRAKE;
    }
}

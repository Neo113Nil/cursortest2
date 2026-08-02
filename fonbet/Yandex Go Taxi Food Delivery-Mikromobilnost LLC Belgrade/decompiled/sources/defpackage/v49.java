package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v49 {
    public final String a;
    public final float b;

    public v49(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v49)) {
            return false;
        }
        v49 v49Var = (v49) obj;
        return this.a.equals(v49Var.a) && Float.compare(this.b, v49Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CashbackUiState(text=" + this.a + ", alpha=" + this.b + Extension.C_BRAKE;
    }
}

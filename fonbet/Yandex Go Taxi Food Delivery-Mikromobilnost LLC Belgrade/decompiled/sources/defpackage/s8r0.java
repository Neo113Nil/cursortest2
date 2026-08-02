package defpackage;

import com.yandex.go.settings.presentation.models.SettingsItemId;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class s8r0 implements v8r0 {
    public final SettingsItemId a;
    public final String b;
    public final au2 c;
    public final String d;
    public final boolean e;

    public s8r0(SettingsItemId settingsItemId, String str, au2 au2Var, String str2, boolean z) {
        this.a = settingsItemId;
        this.b = str;
        this.c = au2Var;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s8r0) {
            s8r0 s8r0Var = (s8r0) obj;
            if (this.a == s8r0Var.a && jl40.l(this.b, s8r0Var.b) && this.c == s8r0Var.c && jl40.l(this.d, s8r0Var.d) && this.e == s8r0Var.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v8r0
    public final SettingsItemId getId() {
        return this.a;
    }

    @Override // defpackage.v8r0
    public final String getSubtitle() {
        return this.d;
    }

    @Override // defpackage.v8r0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", isAccent=true, enabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}

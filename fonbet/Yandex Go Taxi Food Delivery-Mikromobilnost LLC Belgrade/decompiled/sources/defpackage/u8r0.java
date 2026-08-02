package defpackage;

import com.yandex.go.settings.presentation.models.SettingsItemId;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class u8r0 implements v8r0 {
    public final SettingsItemId a;
    public final String b;
    public final au2 c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public /* synthetic */ u8r0(SettingsItemId settingsItemId, String str, au2 au2Var, boolean z, String str2, int i) {
        this(settingsItemId, str, au2Var, z, (i & 16) != 0 ? "" : str2, (i & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8r0)) {
            return false;
        }
        u8r0 u8r0Var = (u8r0) obj;
        return this.a == u8r0Var.a && jl40.l(this.b, u8r0Var.b) && jl40.l(this.c, u8r0Var.c) && this.d == u8r0Var.d && jl40.l(this.e, u8r0Var.e) && this.f == u8r0Var.f;
    }

    @Override // defpackage.v8r0
    public final SettingsItemId getId() {
        return this.a;
    }

    @Override // defpackage.v8r0
    public final String getSubtitle() {
        return this.e;
    }

    @Override // defpackage.v8r0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.b(unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Toggle(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", checked=");
        sb.append(this.d);
        sb.append(", subtitle=");
        return nnm.i(this.e, ", controlled=", Extension.C_BRAKE, sb, this.f);
    }

    public u8r0(SettingsItemId settingsItemId, String str, au2 au2Var, boolean z, String str2, boolean z2) {
        this.a = settingsItemId;
        this.b = str;
        this.c = au2Var;
        this.d = z;
        this.e = str2;
        this.f = z2;
    }
}

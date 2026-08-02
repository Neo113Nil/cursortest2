package defpackage;

import com.yandex.go.settings.presentation.models.SettingsItemId;

/* loaded from: classes11.dex */
public final class t8r0 implements v8r0 {
    public final SettingsItemId a;
    public final String b;
    public final au2 c;
    public final String d;

    public t8r0(SettingsItemId settingsItemId, String str, au2 au2Var, String str2, int i) {
        str2 = (i & 8) != 0 ? "" : str2;
        this.a = settingsItemId;
        this.b = str;
        this.c = au2Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8r0)) {
            return false;
        }
        t8r0 t8r0Var = (t8r0) obj;
        return this.a == t8r0Var.a && jl40.l(this.b, t8r0Var.b) && jl40.l(this.c, t8r0Var.c) && jl40.l(this.d, t8r0Var.d);
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
        return unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Navigation(id=" + this.a + ", title=" + this.b + ", icon=" + this.c + ", subtitle=" + this.d + ", payload=null)";
    }
}

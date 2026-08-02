package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ww7 extends yw7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public ww7(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // defpackage.yw7
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww7)) {
            return false;
        }
        ww7 ww7Var = (ww7) obj;
        return jl40.l(this.a, ww7Var.a) && this.b.equals(ww7Var.b) && jl40.l(this.c, ww7Var.c) && this.d.equals(ww7Var.d) && this.e == ww7Var.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.yw7
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // defpackage.yw7
    public final String m() {
        return this.d;
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckItem(id=", this.a, ", iconUrl=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", isChecked=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}

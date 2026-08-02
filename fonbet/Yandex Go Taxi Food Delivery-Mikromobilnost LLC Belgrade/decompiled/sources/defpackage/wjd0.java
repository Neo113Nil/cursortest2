package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wjd0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wjd0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjd0)) {
            return false;
        }
        wjd0 wjd0Var = (wjd0) obj;
        return this.a.equals(wjd0Var.a) && this.b.equals(wjd0Var.b) && this.c.equals(wjd0Var.c) && this.d.equals(wjd0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("PlusRemoveCardsNotification(confirmDialogTitle=", this.a, ", confirmDialogText=", this.b, ", confirmDialogMainButtonText="), this.c, ", noCardText=", this.d, Extension.C_BRAKE);
    }
}

package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class po3 extends o3o {
    public final f78 b;
    public final String c;
    public final String d;
    public final ikn e;

    public po3(f78 f78Var, String str, String str2) {
        this.b = f78Var;
        this.c = str;
        this.d = str2;
        this.e = new ikn(new d33((n3r) f78Var.c.get(1), this));
    }

    @Override // defpackage.o3o
    public final long g() {
        String str = this.d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = cvt.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // defpackage.o3o
    public final twh o() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        Pattern pattern = twh.e;
        try {
            return q5g.C(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.o3o
    public final ij3 z() {
        return this.e;
    }
}

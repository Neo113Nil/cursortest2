package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class cnh {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final cee c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final yde g;
    public final byte[] h;

    static {
        int i2 = dvt.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public cnh(bnh bnhVar) {
        vq1.A((bnhVar.c && ((Uri) bnhVar.e) == null) ? false : true);
        UUID uuid = (UUID) bnhVar.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) bnhVar.e;
        this.c = (cee) bnhVar.f;
        this.d = bnhVar.a;
        this.f = bnhVar.c;
        this.e = bnhVar.b;
        this.g = (yde) bnhVar.g;
        byte[] bArr = (byte[]) bnhVar.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnh)) {
            return false;
        }
        cnh cnhVar = (cnh) obj;
        return this.a.equals(cnhVar.a) && Objects.equals(this.b, cnhVar.b) && Objects.equals(this.c, cnhVar.c) && this.d == cnhVar.d && this.f == cnhVar.f && this.e == cnhVar.e && this.g.equals(cnhVar.g) && Arrays.equals(this.h, cnhVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}

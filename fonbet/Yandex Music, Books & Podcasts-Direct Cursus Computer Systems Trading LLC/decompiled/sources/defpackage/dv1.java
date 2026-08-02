package defpackage;

import android.media.AudioAttributes;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class dv1 {
    public static final dv1 g = new dv1(0, 0, 1, 1, 0);
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public jzi f;

    static {
        int i2 = dvt.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public dv1(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static dv1 a(Bundle bundle) {
        String str = h;
        int i2 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = i;
        int i3 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = j;
        int i4 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = k;
        int i5 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = l;
        return new dv1(i2, i3, i4, i5, bundle.containsKey(str5) ? bundle.getInt(str5) : 0);
    }

    public final jzi b() {
        if (this.f == null) {
            jzi jziVar = new jzi();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i2 = dvt.a;
            if (i2 >= 29) {
                mi.E(usage, this.d);
            }
            if (i2 >= 32) {
                cv1.a(usage, this.e);
            }
            jziVar.a = usage.build();
            this.f = jziVar;
        }
        return this.f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dv1.class == obj.getClass()) {
            dv1 dv1Var = (dv1) obj;
            if (this.a == dv1Var.a && this.b == dv1Var.b && this.c == dv1Var.c && this.d == dv1Var.d && this.e == dv1Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}

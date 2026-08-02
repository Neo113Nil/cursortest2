package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class cvj {
    public static final imp e = new imp();
    public final Object a;
    public final bvj b;
    public final String c;
    public volatile byte[] d;

    public cvj(String str, Object obj, bvj bvjVar) {
        if (TextUtils.isEmpty(str)) {
            xq0.x("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = obj;
        this.b = bvjVar;
    }

    public static cvj a(Object obj, String str) {
        return new cvj(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cvj) {
            return this.c.equals(((cvj) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return su4.o(new StringBuilder("Option{key='"), this.c, "'}");
    }
}

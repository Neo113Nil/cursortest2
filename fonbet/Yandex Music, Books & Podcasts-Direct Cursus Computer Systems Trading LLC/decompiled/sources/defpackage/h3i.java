package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class h3i {
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final List a;
    public final String b;
    public final String c;

    public h3i(String str, List list, String str2) {
        this.b = str;
        this.c = str2;
        this.a = list;
    }

    public static final CopyOnWriteArraySet a() {
        if (bp6.a.contains(h3i.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            bp6.a(h3i.class, th);
            return null;
        }
    }

    public final ArrayList b() {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return new ArrayList(this.a);
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public final String c() {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }
}

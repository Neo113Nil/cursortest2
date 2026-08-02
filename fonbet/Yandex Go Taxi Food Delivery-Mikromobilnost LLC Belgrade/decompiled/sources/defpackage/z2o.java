package defpackage;

/* loaded from: classes.dex */
public abstract class z2o extends hjv {
    public abstract void m(zfs zfsVar, Object obj);

    public final long n(Object obj) {
        zfs a = a();
        try {
            m(a, obj);
            return a.a();
        } finally {
            k(a);
        }
    }
}

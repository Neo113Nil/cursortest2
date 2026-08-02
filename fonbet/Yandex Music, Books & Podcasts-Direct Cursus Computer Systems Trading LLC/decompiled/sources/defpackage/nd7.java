package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class nd7 implements Comparable {
    public xc7 a;
    public int b;
    public String c;
    public Locale d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xc7 xc7Var = ((nd7) obj).a;
        int a = pd7.a(this.a.p(), xc7Var.p());
        return a != 0 ? a : pd7.a(this.a.g(), xc7Var.g());
    }
}

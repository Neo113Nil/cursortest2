package defpackage;

/* loaded from: classes5.dex */
public final class gtd {
    public static final float a = 20;

    public static qtd a(float f, int i, long j) {
        long j2;
        if (j != 16) {
            j = d85.b(j, d85.d(j) * 0.7f, 0.0f, 0.0f, 0.0f, 14);
            j2 = j;
        } else {
            j2 = j;
        }
        std stdVar = new std(j, 3, null);
        if ((i & 4) != 0) {
            f = a;
        }
        float f2 = f;
        float f3 = (i & 8) != 0 ? 0.15f : 0.0f;
        std stdVar2 = std.d;
        stdVar2.getClass();
        return new qtd(j2, t75.c(stdVar), f2, f3, stdVar2);
    }
}

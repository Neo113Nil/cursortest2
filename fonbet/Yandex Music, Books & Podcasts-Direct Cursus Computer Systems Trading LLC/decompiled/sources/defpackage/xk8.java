package defpackage;

/* loaded from: classes3.dex */
public final class xk8 {
    public final /* synthetic */ int a;

    public xk8(ehv ehvVar) {
        this.a = 12;
    }

    public static void a(gc8 gc8Var, String str) {
        gc8Var.I(new RuntimeException("Failed to handle set_cursor_action", new IllegalArgumentException(str)));
    }

    public static Integer b(int i, long j) {
        if (0 <= j && j <= i) {
            long j2 = j >> 31;
            return Integer.valueOf((j2 == 0 || j2 == -1) ? (int) j : j > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        if (j == -1) {
            return Integer.valueOf(i);
        }
        return null;
    }
}

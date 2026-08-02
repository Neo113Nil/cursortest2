package defpackage;

/* loaded from: classes5.dex */
public final class hyd {
    public int a;
    public int b;
    public boolean c;
    public int d;

    public hyd(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? i : 10;
        int i4 = (i2 & 32) != 0 ? Integer.MIN_VALUE : 30;
        this.a = i;
        this.b = i3;
        this.c = true;
        this.d = i4;
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            return;
        }
        xq0.x("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.");
        throw null;
    }
}

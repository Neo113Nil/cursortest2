package defpackage;

/* loaded from: classes.dex */
public abstract class sf1 {
    public static final java.lang.ThreadLocal IHQe1A4L2xu = new java.lang.ThreadLocal();
    public static final long oh6vYeIP = IHQe1A4L2xu(0, 0);

    public static final long IHQe1A4L2xu(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final android.text.TextDirectionHeuristic oh6vYeIP(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR : android.text.TextDirectionHeuristics.LOCALE : android.text.TextDirectionHeuristics.ANYRTL_LTR : android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR : android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
    }
}

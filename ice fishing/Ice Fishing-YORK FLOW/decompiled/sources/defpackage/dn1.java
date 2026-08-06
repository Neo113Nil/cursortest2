package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class dn1 {
    public static final java.lang.ThreadLocal ZpBGe2uQfcn8 = new java.lang.ThreadLocal();
    public static final long giKS3J6vZuNy = ZpBGe2uQfcn8(0, 0);

    public static final long ZpBGe2uQfcn8(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final android.text.TextDirectionHeuristic giKS3J6vZuNy(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR : android.text.TextDirectionHeuristics.LOCALE : android.text.TextDirectionHeuristics.ANYRTL_LTR : android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL : android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR : android.text.TextDirectionHeuristics.RTL : android.text.TextDirectionHeuristics.LTR;
    }
}

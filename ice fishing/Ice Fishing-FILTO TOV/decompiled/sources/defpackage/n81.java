package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class n81 {
    public static final ThreadLocal GWasM1elztuh = new ThreadLocal();
    public static final long Yi7zF1RB1 = GWasM1elztuh(0, 0);

    public static final long GWasM1elztuh(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic Yi7zF1RB1(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}

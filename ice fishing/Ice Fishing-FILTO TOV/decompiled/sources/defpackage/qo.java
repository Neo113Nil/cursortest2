package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class qo {
    public static final float GWasM1elztuh = ViewConfiguration.getScrollFriction();
    public static final double X1lG3V04pd;
    public static final double Yi7zF1RB1;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        Yi7zF1RB1 = log;
        X1lG3V04pd = log - 1.0d;
    }
}

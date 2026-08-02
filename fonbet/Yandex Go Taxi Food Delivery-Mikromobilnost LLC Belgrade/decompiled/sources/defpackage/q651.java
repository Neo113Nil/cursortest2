package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class q651 {
    public final u1w a;
    public final u1w b;

    public q651(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        lowerBound = bounds.getLowerBound();
        this.a = u1w.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.b = u1w.d(upperBound);
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public q651(u1w u1wVar, u1w u1wVar2) {
        this.a = u1wVar;
        this.b = u1wVar2;
    }
}

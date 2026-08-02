package defpackage;

import android.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class ph0 {
    public static final nh0 a() {
        return new nh0(new Path());
    }

    public static final Path.Direction b(bak bakVar) {
        int ordinal = bakVar.ordinal();
        if (ordinal == 0) {
            return Path.Direction.CCW;
        }
        if (ordinal == 1) {
            return Path.Direction.CW;
        }
        b6e.s();
        return null;
    }

    public static final void c(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}

package defpackage;

import android.widget.RemoteViews;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class wce {
    public static final wce a = new wce();

    public final void a(@NotNull e9t e9tVar, @NotNull RemoteViews remoteViews, @NotNull b95 b95Var, int i) {
        if (b95Var instanceof n2o) {
            int i2 = ((n2o) b95Var).a;
            remoteViews.getClass();
            vvn.d(remoteViews, i, "setColorFilter", i2);
        } else {
            int U = c3x.U(b95Var.a(e9tVar.a));
            remoteViews.getClass();
            remoteViews.setInt(i, "setColorFilter", U);
        }
    }
}

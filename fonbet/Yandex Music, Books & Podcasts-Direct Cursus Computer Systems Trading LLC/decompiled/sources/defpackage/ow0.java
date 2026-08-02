package defpackage;

import android.os.Build;
import android.widget.RemoteViews;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ow0 {
    public static final ow0 a = new ow0();

    public final void a(@NotNull RemoteViews remoteViews, int i, @NotNull u38 u38Var) {
        remoteViews.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setBoolean(i, "setClipToOutline", true);
            if (u38Var instanceof n38) {
                remoteViews.setViewOutlinePreferredRadius(i, ((n38) u38Var).a, 1);
                return;
            } else {
                e7o.i(u38Var.getClass().getCanonicalName(), "Rounded corners should not be ");
                return;
            }
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(@NotNull RemoteViews remoteViews, int i, @NotNull u38 u38Var) {
        if (u38Var instanceof s38) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (u38Var instanceof o38) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (u38Var instanceof n38) {
            remoteViews.setViewLayoutHeight(i, ((n38) u38Var).a, 1);
        } else if (Intrinsics.d(u38Var, p38.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            b6e.s();
        }
    }

    public final void c(@NotNull RemoteViews remoteViews, int i, @NotNull u38 u38Var) {
        if (u38Var instanceof s38) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (u38Var instanceof o38) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (u38Var instanceof n38) {
            remoteViews.setViewLayoutWidth(i, ((n38) u38Var).a, 1);
        } else if (Intrinsics.d(u38Var, p38.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            b6e.s();
        }
    }
}

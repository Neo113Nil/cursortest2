package defpackage;

import android.graphics.Outline;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class fyj {
    public static final fyj a = new fyj();

    public final void a(@NotNull Outline outline, @NotNull eak eakVar) {
        if (eakVar instanceof nh0) {
            outline.setPath(((nh0) eakVar).a);
        } else {
            qq6.d("Unable to obtain android.graphics.Path");
        }
    }
}

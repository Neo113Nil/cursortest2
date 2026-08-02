package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class hf0 {
    public static final hf0 a = new hf0();

    public final void a(@NotNull View view, jfm jfmVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = jfmVar instanceof uh0 ? PointerIcon.getSystemIcon(context, ((uh0) jfmVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}

package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import ru.yandex.music.R;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes5.dex */
public abstract class txc extends s98 {
    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        int M;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("dialog.arg.theme")) {
            M = weo.M(getContext(), R.attr.fullScreenDialogTheme);
        } else {
            ou0 ou0Var = (ou0) Preconditions.nonNull((ou0) arguments.getSerializable("dialog.arg.theme"));
            Context context = getContext();
            ou0Var.getClass();
            M = weo.N(context, yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge : R.style.AppTheme_Dark_EdgeToEdge, R.attr.fullScreenDialogTheme);
        }
        setStyle(2, M);
    }

    @Override // androidx.fragment.app.o
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (onCreateAnimation == null && i2 != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(getContext(), i2);
        }
        if (onCreateAnimation != null) {
            View view = (View) Preconditions.nonNull(getView());
            view.setLayerType(2, null);
            onCreateAnimation.setAnimationListener(new sxc(0, view));
        }
        return onCreateAnimation;
    }

    @Override // defpackage.h7w, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}

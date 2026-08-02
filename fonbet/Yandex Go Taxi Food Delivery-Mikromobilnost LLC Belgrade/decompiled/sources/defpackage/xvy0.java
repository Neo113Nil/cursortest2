package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.function.Consumer;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public abstract class xvy0 {
    public static final void a(int i, View view) {
        Drawable background = view.getBackground();
        if ((view instanceof TextureView) || background == null || background.getAlpha() == 0) {
            return;
        }
        view.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(View view, ThemeType themeType, boolean z, Consumer consumer) {
        boolean z2;
        boolean z3;
        if (view instanceof nwy0) {
            nwy0 nwy0Var = (nwy0) view;
            nwy0Var.applyTheme(themeType);
            z2 = nwy0Var.applyThemeForChildrenByDefault();
            z3 = nwy0Var.allowTraverse();
        } else {
            if (z) {
                consumer.accept(view);
            }
            z2 = z;
            z3 = true;
        }
        if (z3) {
            if (view instanceof RecyclerView) {
                Object adapter = ((RecyclerView) view).getAdapter();
                if (adapter instanceof nwy0) {
                    ((nwy0) adapter).applyTheme(themeType);
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    b(viewGroup.getChildAt(i), themeType, z2, consumer);
                }
            }
        }
    }
}

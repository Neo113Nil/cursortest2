package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes14.dex */
public final class ylr0 implements zo31 {
    public final FrameLayout a;
    public final RecyclerView b;
    public final ButtonComponent c;
    public final LinearLayout d;
    public final ToolbarComponent e;
    public final CircularProgressBar f;

    public ylr0(FrameLayout frameLayout, RecyclerView recyclerView, ButtonComponent buttonComponent, LinearLayout linearLayout, ToolbarComponent toolbarComponent, CircularProgressBar circularProgressBar) {
        this.a = frameLayout;
        this.b = recyclerView;
        this.c = buttonComponent;
        this.d = linearLayout;
        this.e = toolbarComponent;
        this.f = circularProgressBar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}

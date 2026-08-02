package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes10.dex */
public final class zl70 extends bys {
    public boolean z;

    @Override // defpackage.dvy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        if (this.z) {
            super.applyTheme(themeType);
        }
    }

    @Override // defpackage.dvy0
    public final void f(xwy0 xwy0Var) {
        wys wysVar = (wys) xwy0Var;
        if (this.z) {
            super.f(wysVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvy0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        nwy0 nwy0Var = recyclerView instanceof nwy0 ? (nwy0) recyclerView : null;
        this.z = nwy0Var != null ? nwy0Var.getIsTrackingsRedesignEnabled() : true;
        super.onAttachedToRecyclerView(recyclerView);
    }
}

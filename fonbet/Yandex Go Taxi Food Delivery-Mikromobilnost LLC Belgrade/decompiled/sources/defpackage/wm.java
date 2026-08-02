package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class wm extends RecyclerView.Adapter {
    public final c a;
    public List b = EmptyList.a;
    public s8i0 c = new wly0();

    public wm(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return !((r8i0) this.b.get(i)).f ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((vm) x0Var).W((r8i0) this.b.get(i), this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(zkh0.achievement_item_view, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i2 = p8h0.achievement_count;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
        if (robotoTextView != null) {
            i2 = p8h0.icon_active;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, inflate);
            if (appCompatImageView != null) {
                i2 = p8h0.icon_inactive;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, inflate);
                if (appCompatImageView2 != null) {
                    i2 = p8h0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i2, inflate);
                    if (robotoTextView2 != null) {
                        rm rmVar = new rm(constraintLayout, constraintLayout, robotoTextView, appCompatImageView, appCompatImageView2, robotoTextView2);
                        return i == 0 ? new tm(this, rmVar) : new um(this, rmVar);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}

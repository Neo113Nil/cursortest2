package ru.yandex.taxi.preorder.suggested.selection;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import defpackage.aph0;
import defpackage.b8v0;
import defpackage.d6v0;
import defpackage.ecv0;
import defpackage.nwf0;
import defpackage.o5v0;
import defpackage.pav;
import defpackage.pwf0;
import defpackage.r4v0;
import defpackage.s4v0;
import defpackage.tse;
import defpackage.x9v0;
import defpackage.zt;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.preorder.suggested.selection.SuggestsView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class b extends RecyclerView.Adapter {
    public boolean A;
    public ecv0 B;
    public PointType D;
    public final tse a;
    public final pav b;
    public final ru.yandex.taxi.widget.c c;
    public final d6v0 w;
    public List x = EmptyList.a;
    public final nwf0 y = pwf0.b(SuggestsView.a.class);
    public SuggestsView.State z = SuggestsView.State.FULL;
    public o5v0 C = o5v0.c;

    public b(tse tseVar, pav pavVar, ru.yandex.taxi.widget.c cVar, d6v0 d6v0Var) {
        this.a = tseVar;
        this.b = pavVar;
        this.c = cVar;
        this.w = d6v0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        b8v0 b8v0Var = (b8v0) this.x.get(i);
        if (b8v0Var instanceof s4v0) {
            return 0;
        }
        return (!(b8v0Var instanceof x9v0) || ((x9v0) b8v0Var).A == null) ? 1 : 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i, List list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(x0Var, i, list);
            return;
        }
        b8v0 b8v0Var = (b8v0) this.x.get(i);
        if ((b8v0Var instanceof x9v0) && (x0Var instanceof c) && !(x0Var instanceof a)) {
            boolean z = false;
            Object obj = list.get(0);
            if (!(obj instanceof SuggestsView.State)) {
                if (obj instanceof o5v0) {
                    c cVar = (c) x0Var;
                    x9v0 x9v0Var = (x9v0) b8v0Var;
                    if (((o5v0) obj).a && ((com.yandex.go.preorder.suggested.menu.a) this.w).b(x9v0Var)) {
                        z = true;
                    }
                    cVar.Y(x9v0Var, z, this.C.b);
                    return;
                }
                return;
            }
            c cVar2 = (c) x0Var;
            SuggestsView.State state = (SuggestsView.State) obj;
            cVar2.Z(state.getMaxLines());
            x9v0 x9v0Var2 = (x9v0) b8v0Var;
            FormattedText formattedText = x9v0Var2.g;
            CharSequence charSequence = x9v0Var2.f;
            int subtitleVisibility = ((charSequence == null || charSequence.length() == 0) && (formattedText == null || formattedText.equals(FormattedText.c))) ? 8 : state.getSubtitleVisibility();
            ListItemComponent listItemComponent = cVar2.O;
            if (subtitleVisibility == 0) {
                listItemComponent.showSubtitle();
            } else {
                listItemComponent.hideSubtitle();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new r4v0(LayoutInflater.from(viewGroup.getContext()).inflate(aph0.suggest_category_view, viewGroup, false));
        }
        nwf0 nwf0Var = this.y;
        if (i != 6) {
            ListItemComponent listItemComponent = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
            listItemComponent.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new c(this.a, listItemComponent, listItemComponent, (SuggestsView.a) nwf0Var.b, this.b, this.c);
        }
        ListItemComponent listItemComponent2 = new ListItemComponent(viewGroup.getContext(), null, 0, 6, null);
        listItemComponent2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new a(this.a, listItemComponent2, listItemComponent2, (SuggestsView.a) nwf0Var.b, this.b, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        super.onViewRecycled(x0Var);
        if (x0Var instanceof a) {
            ((a) x0Var).b0();
        } else if (x0Var instanceof c) {
            ((c) x0Var).b0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        boolean z = false;
        if (i == 0 && this.A) {
            this.A = false;
            ecv0 ecv0Var = this.B;
            if (ecv0Var != null) {
                ecv0Var.run();
            }
        }
        b8v0 b8v0Var = (b8v0) this.x.get(i);
        if ((x0Var instanceof a) && (b8v0Var instanceof x9v0)) {
            ((a) x0Var).X((x9v0) b8v0Var, this.z, this.D, false, zt.c);
            return;
        }
        if ((x0Var instanceof c) && (b8v0Var instanceof x9v0)) {
            c cVar = (c) x0Var;
            x9v0 x9v0Var = (x9v0) b8v0Var;
            SuggestsView.State state = this.z;
            PointType pointType = this.D;
            if (this.C.a && ((com.yandex.go.preorder.suggested.menu.a) this.w).b(x9v0Var)) {
                z = true;
            }
            cVar.X(x9v0Var, state, pointType, z, this.C.b);
            return;
        }
        if ((x0Var instanceof r4v0) && (b8v0Var instanceof s4v0)) {
            ((r4v0) x0Var).N.setTitle(((s4v0) b8v0Var).a);
        }
    }
}

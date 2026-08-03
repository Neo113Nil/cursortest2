package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: g, reason: collision with root package name */
    public final h f3683g;

    /* renamed from: h, reason: collision with root package name */
    public int f3684h = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3685i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3686j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f3687k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3688l;

    public f(h hVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f3686j = z10;
        this.f3687k = layoutInflater;
        this.f3683g = hVar;
        this.f3688l = i10;
        a();
    }

    public final void a() {
        h hVar = this.f3683g;
        i iVar = hVar.f3708s;
        if (iVar != null) {
            hVar.i();
            ArrayList arrayList = hVar.f3699j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((i) arrayList.get(i10)) == iVar) {
                    this.f3684h = i10;
                    return;
                }
            }
        }
        this.f3684h = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final i getItem(int i10) {
        ArrayList k3;
        boolean z10 = this.f3686j;
        h hVar = this.f3683g;
        if (z10) {
            hVar.i();
            k3 = hVar.f3699j;
        } else {
            k3 = hVar.k();
        }
        int i11 = this.f3684h;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (i) k3.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        boolean z10 = this.f3686j;
        h hVar = this.f3683g;
        if (z10) {
            hVar.i();
            k3 = hVar.f3699j;
        } else {
            k3 = hVar.k();
        }
        return this.f3684h < 0 ? k3.size() : k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f3687k.inflate(this.f3688l, viewGroup, false);
        }
        int i11 = getItem(i10).f3711b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f3711b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3683g.l() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        o oVar = (o) view;
        if (this.f3685i) {
            listMenuItemView.setForceShowIcon(true);
        }
        oVar.b(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4653j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f38797a;

    /* renamed from: b, reason: collision with root package name */
    public int f38798b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38799c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38800d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f38801e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38802f;

    public C4653j(m mVar, LayoutInflater layoutInflater, boolean z3, int i) {
        this.f38800d = z3;
        this.f38801e = layoutInflater;
        this.f38797a = mVar;
        this.f38802f = i;
        a();
    }

    public final void a() {
        m mVar = this.f38797a;
        o oVar = mVar.f38817O;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f38806C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f38798b = i;
                    return;
                }
            }
        }
        this.f38798b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l9;
        m mVar = this.f38797a;
        if (this.f38800d) {
            mVar.i();
            l9 = mVar.f38806C;
        } else {
            l9 = mVar.l();
        }
        int i6 = this.f38798b;
        if (i6 >= 0 && i >= i6) {
            i++;
        }
        return (o) l9.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l9;
        m mVar = this.f38797a;
        if (this.f38800d) {
            mVar.i();
            l9 = mVar.f38806C;
        } else {
            l9 = mVar.l();
        }
        return this.f38798b < 0 ? l9.size() : l9.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f38801e.inflate(this.f38802f, viewGroup, false);
        }
        int i6 = getItem(i).f38852u;
        int i9 = i - 1;
        int i10 = i9 >= 0 ? getItem(i9).f38852u : i6;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f38797a.m() && i6 != i10) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        z zVar = (z) view;
        if (this.f38799c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

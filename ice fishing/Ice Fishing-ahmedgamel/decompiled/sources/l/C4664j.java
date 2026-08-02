package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4664j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f38724a;

    /* renamed from: b, reason: collision with root package name */
    public int f38725b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38726c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f38727d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f38728e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38729f;

    public C4664j(m mVar, LayoutInflater layoutInflater, boolean z6, int i) {
        this.f38727d = z6;
        this.f38728e = layoutInflater;
        this.f38724a = mVar;
        this.f38729f = i;
        a();
    }

    public final void a() {
        m mVar = this.f38724a;
        o oVar = mVar.f38744O;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f38733C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f38725b = i;
                    return;
                }
            }
        }
        this.f38725b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l9;
        m mVar = this.f38724a;
        if (this.f38727d) {
            mVar.i();
            l9 = mVar.f38733C;
        } else {
            l9 = mVar.l();
        }
        int i4 = this.f38725b;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) l9.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l9;
        m mVar = this.f38724a;
        if (this.f38727d) {
            mVar.i();
            l9 = mVar.f38733C;
        } else {
            l9 = mVar.l();
        }
        return this.f38725b < 0 ? l9.size() : l9.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f38728e.inflate(this.f38729f, viewGroup, false);
        }
        int i4 = getItem(i).f38779u;
        int i6 = i - 1;
        int i9 = i6 >= 0 ? getItem(i6).f38779u : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f38724a.m() && i4 != i9) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        z zVar = (z) view;
        if (this.f38726c) {
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

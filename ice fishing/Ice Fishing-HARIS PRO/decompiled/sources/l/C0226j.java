package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0229m f3703a;

    /* renamed from: b, reason: collision with root package name */
    public int f3704b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3705c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3706d;
    public final LayoutInflater e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3707f;

    public C0226j(MenuC0229m menuC0229m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f3706d = z2;
        this.e = layoutInflater;
        this.f3703a = menuC0229m;
        this.f3707f = i;
        a();
    }

    public final void a() {
        MenuC0229m menuC0229m = this.f3703a;
        o oVar = menuC0229m.f3727v;
        if (oVar != null) {
            menuC0229m.i();
            ArrayList arrayList = menuC0229m.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f3704b = i;
                    return;
                }
            }
        }
        this.f3704b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        ArrayList l2;
        MenuC0229m menuC0229m = this.f3703a;
        if (this.f3706d) {
            menuC0229m.i();
            l2 = menuC0229m.j;
        } else {
            l2 = menuC0229m.l();
        }
        int i2 = this.f3704b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0229m menuC0229m = this.f3703a;
        if (this.f3706d) {
            menuC0229m.i();
            l2 = menuC0229m.j;
        } else {
            l2 = menuC0229m.l();
        }
        return this.f3704b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.e.inflate(this.f3707f, viewGroup, false);
        }
        int i2 = getItem(i).f3737b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3737b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3703a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        z zVar = (z) view;
        if (this.f3705c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

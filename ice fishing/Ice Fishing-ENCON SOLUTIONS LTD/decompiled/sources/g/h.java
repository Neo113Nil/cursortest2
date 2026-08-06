package g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final j f3044a;

    /* renamed from: b, reason: collision with root package name */
    public int f3045b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3046c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3047d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f3048e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3049f;

    public h(j jVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f3047d = z2;
        this.f3048e = layoutInflater;
        this.f3044a = jVar;
        this.f3049f = i2;
        a();
    }

    public final void a() {
        j jVar = this.f3044a;
        k kVar = jVar.f3069s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f3060j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((k) arrayList.get(i2)) == kVar) {
                    this.f3045b = i2;
                    return;
                }
            }
        }
        this.f3045b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i2) {
        ArrayList k2;
        j jVar = this.f3044a;
        if (this.f3047d) {
            jVar.i();
            k2 = jVar.f3060j;
        } else {
            k2 = jVar.k();
        }
        int i3 = this.f3045b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (k) k2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k2;
        j jVar = this.f3044a;
        if (this.f3047d) {
            jVar.i();
            k2 = jVar.f3060j;
        } else {
            k2 = jVar.k();
        }
        return this.f3045b < 0 ? k2.size() : k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3048e.inflate(this.f3049f, viewGroup, false);
        }
        int i3 = getItem(i2).f3073b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f3073b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3044a.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        q qVar = (q) view;
        if (this.f3046c) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

package g;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148h extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public final j f1957f;

    /* renamed from: g, reason: collision with root package name */
    public int f1958g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1959h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1960i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f1961j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1962k;

    public C0148h(j jVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f1960i = z2;
        this.f1961j = layoutInflater;
        this.f1957f = jVar;
        this.f1962k = i2;
        a();
    }

    public final void a() {
        j jVar = this.f1957f;
        k kVar = jVar.f1981s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f1973j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((k) arrayList.get(i2)) == kVar) {
                    this.f1958g = i2;
                    return;
                }
            }
        }
        this.f1958g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k getItem(int i2) {
        ArrayList k2;
        j jVar = this.f1957f;
        if (this.f1960i) {
            jVar.i();
            k2 = jVar.f1973j;
        } else {
            k2 = jVar.k();
        }
        int i3 = this.f1958g;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (k) k2.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k2;
        j jVar = this.f1957f;
        if (this.f1960i) {
            jVar.i();
            k2 = jVar.f1973j;
        } else {
            k2 = jVar.k();
        }
        return this.f1958g < 0 ? k2.size() : k2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f1961j.inflate(this.f1962k, viewGroup, false);
        }
        int i3 = getItem(i2).f1986b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f1986b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1957f.l() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        q qVar = (q) view;
        if (this.f1959h) {
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

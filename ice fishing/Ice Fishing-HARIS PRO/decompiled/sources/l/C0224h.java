package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f3696a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0225i f3697b;

    public C0224h(C0225i c0225i) {
        this.f3697b = c0225i;
        a();
    }

    public final void a() {
        MenuC0229m menuC0229m = this.f3697b.f3700c;
        o oVar = menuC0229m.f3727v;
        if (oVar != null) {
            menuC0229m.i();
            ArrayList arrayList = menuC0229m.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f3696a = i;
                    return;
                }
            }
        }
        this.f3696a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        C0225i c0225i = this.f3697b;
        MenuC0229m menuC0229m = c0225i.f3700c;
        menuC0229m.i();
        ArrayList arrayList = menuC0229m.j;
        c0225i.getClass();
        int i2 = this.f3696a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0225i c0225i = this.f3697b;
        MenuC0229m menuC0229m = c0225i.f3700c;
        menuC0229m.i();
        int size = menuC0229m.j.size();
        c0225i.getClass();
        return this.f3696a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3697b.f3699b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

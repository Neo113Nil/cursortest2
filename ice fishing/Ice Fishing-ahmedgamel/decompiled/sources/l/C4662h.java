package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4662h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f38716a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4663i f38717b;

    public C4662h(C4663i c4663i) {
        this.f38717b = c4663i;
        a();
    }

    public final void a() {
        m mVar = this.f38717b.f38720v;
        o oVar = mVar.f38744O;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f38733C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f38716a = i;
                    return;
                }
            }
        }
        this.f38716a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        C4663i c4663i = this.f38717b;
        m mVar = c4663i.f38720v;
        mVar.i();
        ArrayList arrayList = mVar.f38733C;
        c4663i.getClass();
        int i4 = this.f38716a;
        if (i4 >= 0 && i >= i4) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C4663i c4663i = this.f38717b;
        m mVar = c4663i.f38720v;
        mVar.i();
        int size = mVar.f38733C.size();
        c4663i.getClass();
        return this.f38716a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f38717b.f38719u.inflate(C5248R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

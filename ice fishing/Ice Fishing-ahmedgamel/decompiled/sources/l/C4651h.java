package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.icefishingapp.icefishing.C5275R;
import java.util.ArrayList;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4651h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f38789a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4652i f38790b;

    public C4651h(C4652i c4652i) {
        this.f38790b = c4652i;
        a();
    }

    public final void a() {
        m mVar = this.f38790b.f38793v;
        o oVar = mVar.f38817O;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f38806C;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o) arrayList.get(i)) == oVar) {
                    this.f38789a = i;
                    return;
                }
            }
        }
        this.f38789a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i) {
        C4652i c4652i = this.f38790b;
        m mVar = c4652i.f38793v;
        mVar.i();
        ArrayList arrayList = mVar.f38806C;
        c4652i.getClass();
        int i6 = this.f38789a;
        if (i6 >= 0 && i >= i6) {
            i++;
        }
        return (o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C4652i c4652i = this.f38790b;
        m mVar = c4652i.f38793v;
        mVar.i();
        int size = mVar.f38806C.size();
        c4652i.getClass();
        return this.f38789a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f38790b.f38792u.inflate(C5275R.layout.abc_list_menu_item_layout, viewGroup, false);
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

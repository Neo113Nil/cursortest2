package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class g9g extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ h9g b;

    public g9g(h9g h9gVar) {
        this.b = h9gVar;
        a();
    }

    public final void a() {
        hxh hxhVar = this.b.c;
        rxh rxhVar = hxhVar.v;
        if (rxhVar != null) {
            hxhVar.i();
            ArrayList arrayList = hxhVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((rxh) arrayList.get(i)) == rxhVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rxh getItem(int i) {
        h9g h9gVar = this.b;
        hxh hxhVar = h9gVar.c;
        hxhVar.i();
        ArrayList arrayList = hxhVar.j;
        h9gVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (rxh) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h9g h9gVar = this.b;
        hxh hxhVar = h9gVar.c;
        hxhVar.i();
        int size = hxhVar.j.size();
        h9gVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((myh) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

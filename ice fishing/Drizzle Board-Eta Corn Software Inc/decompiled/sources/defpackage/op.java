package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class op extends BaseAdapter {
    public final /* synthetic */ pp NCTxEWno;
    public int qoPGr6Ce = -1;

    public op(pp ppVar) {
        this.NCTxEWno = ppVar;
        qoPGr6Ce();
    }

    @Override // android.widget.Adapter
    /* renamed from: NCTxEWno, reason: merged with bridge method [inline-methods] */
    public final cs getItem(int i) {
        yr yrVar = this.NCTxEWno.wxUZMvaN;
        yrVar.jb9XjC4I();
        ArrayList arrayList = yrVar.eVhOlqcC;
        int i2 = this.qoPGr6Ce;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (cs) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        yr yrVar = this.NCTxEWno.wxUZMvaN;
        yrVar.jb9XjC4I();
        int size = yrVar.eVhOlqcC.size();
        return this.qoPGr6Ce < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.NCTxEWno.MdtA4re8.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((qs) view).qoPGr6Ce(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        qoPGr6Ce();
        super.notifyDataSetChanged();
    }

    public final void qoPGr6Ce() {
        yr yrVar = this.NCTxEWno.wxUZMvaN;
        cs csVar = yrVar.RXQxj5Oe;
        if (csVar != null) {
            yrVar.jb9XjC4I();
            ArrayList arrayList = yrVar.eVhOlqcC;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((cs) arrayList.get(i)) == csVar) {
                    this.qoPGr6Ce = i;
                    return;
                }
            }
        }
        this.qoPGr6Ce = -1;
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vr extends BaseAdapter {
    public boolean MdtA4re8;
    public int NCTxEWno = -1;
    public final int P7K7Inc8;
    public final LayoutInflater VgvYg0wo;
    public final yr qoPGr6Ce;
    public final boolean wxUZMvaN;

    public vr(yr yrVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.wxUZMvaN = z;
        this.VgvYg0wo = layoutInflater;
        this.qoPGr6Ce = yrVar;
        this.P7K7Inc8 = i;
        qoPGr6Ce();
    }

    @Override // android.widget.Adapter
    /* renamed from: NCTxEWno, reason: merged with bridge method [inline-methods] */
    public final cs getItem(int i) {
        ArrayList ow5vqvCr;
        boolean z = this.wxUZMvaN;
        yr yrVar = this.qoPGr6Ce;
        if (z) {
            yrVar.jb9XjC4I();
            ow5vqvCr = yrVar.eVhOlqcC;
        } else {
            ow5vqvCr = yrVar.ow5vqvCr();
        }
        int i2 = this.NCTxEWno;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (cs) ow5vqvCr.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList ow5vqvCr;
        boolean z = this.wxUZMvaN;
        yr yrVar = this.qoPGr6Ce;
        if (z) {
            yrVar.jb9XjC4I();
            ow5vqvCr = yrVar.eVhOlqcC;
        } else {
            ow5vqvCr = yrVar.ow5vqvCr();
        }
        return this.NCTxEWno < 0 ? ow5vqvCr.size() : ow5vqvCr.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.VgvYg0wo.inflate(this.P7K7Inc8, viewGroup, false);
        }
        int i2 = getItem(i).NCTxEWno;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).NCTxEWno : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.qoPGr6Ce.OnDfzHZD() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        qs qsVar = (qs) view;
        if (this.MdtA4re8) {
            listMenuItemView.setForceShowIcon(true);
        }
        qsVar.qoPGr6Ce(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        qoPGr6Ce();
        super.notifyDataSetChanged();
    }

    public final void qoPGr6Ce() {
        yr yrVar = this.qoPGr6Ce;
        cs csVar = yrVar.RXQxj5Oe;
        if (csVar != null) {
            yrVar.jb9XjC4I();
            ArrayList arrayList = yrVar.eVhOlqcC;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((cs) arrayList.get(i)) == csVar) {
                    this.NCTxEWno = i;
                    return;
                }
            }
        }
        this.NCTxEWno = -1;
    }
}

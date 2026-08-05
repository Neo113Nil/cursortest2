package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pp implements ps, AdapterView.OnItemClickListener {
    public LayoutInflater MdtA4re8;
    public Context NCTxEWno;
    public os P7K7Inc8;
    public ExpandedMenuView VgvYg0wo;
    public op b2ZJblxo;
    public yr wxUZMvaN;

    public pp(ContextWrapper contextWrapper) {
        this.NCTxEWno = contextWrapper;
        this.MdtA4re8 = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.ps
    public final boolean MdtA4re8(cs csVar) {
        return false;
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        if (this.VgvYg0wo == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.VgvYg0wo;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.ps
    public final void P7K7Inc8(os osVar) {
        throw null;
    }

    @Override // defpackage.ps
    public final void Qr9iLBAD(Context context, yr yrVar) {
        if (this.NCTxEWno != null) {
            this.NCTxEWno = context;
            if (this.MdtA4re8 == null) {
                this.MdtA4re8 = LayoutInflater.from(context);
            }
        }
        this.wxUZMvaN = yrVar;
        op opVar = this.b2ZJblxo;
        if (opVar != null) {
            opVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.VgvYg0wo.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // defpackage.ps
    public final boolean b2ZJblxo(cs csVar) {
        return false;
    }

    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        op opVar = this.b2ZJblxo;
        if (opVar != null) {
            opVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.ps
    public final int getId() {
        return 0;
    }

    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        boolean hasVisibleItems = ka0Var.hasVisibleItems();
        Context context = ka0Var.qoPGr6Ce;
        if (!hasVisibleItems) {
            return false;
        }
        zr zrVar = new zr();
        zrVar.NCTxEWno = ka0Var;
        DPHdAVYO dPHdAVYO = new DPHdAVYO(context);
        AhLfQVuM ahLfQVuM = (AhLfQVuM) dPHdAVYO.NCTxEWno;
        pp ppVar = new pp(ahLfQVuM.qoPGr6Ce);
        zrVar.wxUZMvaN = ppVar;
        ppVar.P7K7Inc8 = zrVar;
        ka0Var.NCTxEWno(ppVar, context);
        pp ppVar2 = zrVar.wxUZMvaN;
        op opVar = ppVar2.b2ZJblxo;
        if (opVar == null) {
            opVar = new op(ppVar2);
            ppVar2.b2ZJblxo = opVar;
        }
        ahLfQVuM.b2ZJblxo = opVar;
        ahLfQVuM.Qr9iLBAD = zrVar;
        View view = ka0Var.lDXGDhIF;
        if (view != null) {
            ahLfQVuM.VgvYg0wo = view;
        } else {
            ahLfQVuM.MdtA4re8 = ka0Var.ygLcUYwZ;
            ahLfQVuM.wxUZMvaN = ka0Var.OnDfzHZD;
        }
        ahLfQVuM.P7K7Inc8 = zrVar;
        PVxc5pbY qoPGr6Ce = dPHdAVYO.qoPGr6Ce();
        zrVar.MdtA4re8 = qoPGr6Ce;
        qoPGr6Ce.setOnDismissListener(zrVar);
        WindowManager.LayoutParams attributes = zrVar.MdtA4re8.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        zrVar.MdtA4re8.show();
        os osVar = this.P7K7Inc8;
        if (osVar == null) {
            return true;
        }
        osVar.Ey6iv0m0(ka0Var);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.wxUZMvaN.OxcuoDLp(this.b2ZJblxo.getItem(i), this, 0);
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        return false;
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
        os osVar = this.P7K7Inc8;
        if (osVar != null) {
            osVar.qoPGr6Ce(yrVar, z);
        }
    }
}

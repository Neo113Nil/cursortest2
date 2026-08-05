package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ov implements ps {
    public boolean MdtA4re8;
    public r2 NCTxEWno;
    public int wxUZMvaN;

    @Override // defpackage.ps
    public final boolean MdtA4re8(cs csVar) {
        return false;
    }

    @Override // defpackage.ps
    public final Parcelable OnDfzHZD() {
        nv nvVar = new nv();
        nvVar.NCTxEWno = this.NCTxEWno.getSelectedItemId();
        SparseArray<t1> badgeDrawables = this.NCTxEWno.getBadgeDrawables();
        bz bzVar = new bz();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            t1 valueAt = badgeDrawables.valueAt(i);
            bzVar.put(keyAt, valueAt != null ? valueAt.P7K7Inc8.qoPGr6Ce : null);
        }
        nvVar.MdtA4re8 = bzVar;
        return nvVar;
    }

    @Override // defpackage.ps
    public final void Qr9iLBAD(Context context, yr yrVar) {
        this.NCTxEWno.NCTxEWno(yrVar);
    }

    @Override // defpackage.ps
    public final void VgvYg0wo(Parcelable parcelable) {
        if (parcelable instanceof nv) {
            r2 r2Var = this.NCTxEWno;
            nv nvVar = (nv) parcelable;
            int i = nvVar.NCTxEWno;
            int size = r2Var.hzgxAD8d.NCTxEWno.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem qoPGr6Ce = r2Var.hzgxAD8d.qoPGr6Ce(i2);
                if (i == qoPGr6Ce.getItemId()) {
                    r2Var.jb9XjC4I = i;
                    r2Var.eVhOlqcC = i2;
                    r2Var.setCheckedItem(qoPGr6Ce);
                    break;
                }
                i2++;
            }
            Context context = this.NCTxEWno.getContext();
            bz bzVar = nvVar.MdtA4re8;
            SparseArray sparseArray = new SparseArray(bzVar.size());
            for (int i3 = 0; i3 < bzVar.size(); i3++) {
                int keyAt = bzVar.keyAt(i3);
                v1 v1Var = (v1) bzVar.valueAt(i3);
                sparseArray.put(keyAt, v1Var != null ? new t1(context, v1Var) : null);
            }
            r2 r2Var2 = this.NCTxEWno;
            SparseArray sparseArray2 = r2Var2.FySoLYna;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int keyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(keyAt2) < 0) {
                    sparseArray2.append(keyAt2, (t1) sparseArray.get(keyAt2));
                }
            }
            lv[] lvVarArr = r2Var2.Qr9iLBAD;
            if (lvVarArr != null) {
                for (lv lvVar : lvVarArr) {
                    if (lvVar instanceof iv) {
                        iv ivVar = (iv) lvVar;
                        t1 t1Var = (t1) sparseArray2.get(ivVar.getId());
                        if (t1Var != null) {
                            ivVar.setBadge(t1Var);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ps
    public final boolean b2ZJblxo(cs csVar) {
        return false;
    }

    @Override // defpackage.ps
    public final void eVhOlqcC(boolean z) {
        kv kvVar;
        int i;
        j1 j1Var;
        if (this.MdtA4re8) {
            return;
        }
        r2 r2Var = this.NCTxEWno;
        if (z) {
            r2Var.qoPGr6Ce();
            return;
        }
        kv kvVar2 = r2Var.hzgxAD8d;
        if (kvVar2 == null || r2Var.Qr9iLBAD == null) {
            return;
        }
        r2Var.fVMzMhyS.MdtA4re8 = true;
        kvVar2.NCTxEWno();
        r2Var.fVMzMhyS.MdtA4re8 = false;
        if (r2Var.Qr9iLBAD != null && (kvVar = r2Var.hzgxAD8d) != null && kvVar.NCTxEWno.size() == r2Var.Qr9iLBAD.length) {
            for (0; i < r2Var.Qr9iLBAD.length; i + 1) {
                if (!(r2Var.hzgxAD8d.qoPGr6Ce(i) instanceof pd) || (r2Var.Qr9iLBAD[i] instanceof fv)) {
                    i = ((r2Var.hzgxAD8d.qoPGr6Ce(i) instanceof pd) || !((r2Var.hzgxAD8d.qoPGr6Ce(i).hasSubMenu() && !(r2Var.Qr9iLBAD[i] instanceof pv)) || ((r2Var.hzgxAD8d.qoPGr6Ce(i).hasSubMenu() || (r2Var.Qr9iLBAD[i] instanceof iv)) ? false : true))) ? i + 1 : 0;
                }
            }
            int i2 = r2Var.jb9XjC4I;
            int size = r2Var.hzgxAD8d.NCTxEWno.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem qoPGr6Ce = r2Var.hzgxAD8d.qoPGr6Ce(i3);
                if (qoPGr6Ce.isChecked()) {
                    r2Var.setCheckedItem(qoPGr6Ce);
                    r2Var.jb9XjC4I = qoPGr6Ce.getItemId();
                    r2Var.eVhOlqcC = i3;
                }
            }
            if (i2 != r2Var.jb9XjC4I && (j1Var = r2Var.NCTxEWno) != null) {
                ArrayList arrayList = vd0.NCTxEWno;
                if (!arrayList.contains(r2Var) && r2Var.isLaidOut()) {
                    arrayList.add(r2Var);
                    rd0 clone = j1Var.clone();
                    ArrayList arrayList2 = (ArrayList) vd0.qoPGr6Ce().get(r2Var);
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj = arrayList2.get(i4);
                            i4++;
                            ((rd0) obj).gjV1z5T1(r2Var);
                        }
                    }
                    clone.Qr9iLBAD(r2Var, true);
                    if (r2Var.getTag(R.id.transition_current_scene) != null) {
                        m1.qoPGr6Ce();
                        return;
                    }
                    r2Var.setTag(R.id.transition_current_scene, null);
                    ud0 ud0Var = new ud0();
                    ud0Var.NCTxEWno = clone;
                    ud0Var.MdtA4re8 = r2Var;
                    r2Var.addOnAttachStateChangeListener(ud0Var);
                    r2Var.getViewTreeObserver().addOnPreDrawListener(ud0Var);
                }
            }
            int i5 = r2Var.P7K7Inc8;
            boolean z2 = i5 != -1 ? i5 == 0 : r2Var.getCurrentVisibleContentItemCount() > 3;
            for (int i6 = 0; i6 < size; i6++) {
                r2Var.fVMzMhyS.MdtA4re8 = true;
                r2Var.Qr9iLBAD[i6].setExpanded(r2Var.HdOGZAzC);
                lv lvVar = r2Var.Qr9iLBAD[i6];
                if (lvVar instanceof iv) {
                    iv ivVar = (iv) lvVar;
                    ivVar.setLabelVisibilityMode(r2Var.P7K7Inc8);
                    ivVar.setItemIconGravity(r2Var.b2ZJblxo);
                    ivVar.setItemGravity(r2Var.pRiPUEwG);
                    ivVar.setShifting(z2);
                }
                if (r2Var.hzgxAD8d.qoPGr6Ce(i6) instanceof cs) {
                    r2Var.Qr9iLBAD[i6].qoPGr6Ce((cs) r2Var.hzgxAD8d.qoPGr6Ce(i6));
                }
                r2Var.fVMzMhyS.MdtA4re8 = false;
            }
            return;
        }
        r2Var.qoPGr6Ce();
    }

    @Override // defpackage.ps
    public final int getId() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.ps
    public final boolean k3x7lurq(ka0 ka0Var) {
        return false;
    }

    @Override // defpackage.ps
    public final boolean ow5vqvCr() {
        return false;
    }

    @Override // defpackage.ps
    public final void qoPGr6Ce(yr yrVar, boolean z) {
    }
}

package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e implements k, DialogInterface.OnClickListener {
    public f MdtA4re8;
    public PVxc5pbY NCTxEWno;
    public final /* synthetic */ l VgvYg0wo;
    public CharSequence wxUZMvaN;

    public e(l lVar) {
        this.VgvYg0wo = lVar;
    }

    @Override // defpackage.k
    public final int MdtA4re8() {
        return 0;
    }

    @Override // defpackage.k
    public final boolean NCTxEWno() {
        PVxc5pbY pVxc5pbY = this.NCTxEWno;
        if (pVxc5pbY != null) {
            return pVxc5pbY.isShowing();
        }
        return false;
    }

    @Override // defpackage.k
    public final void OnDfzHZD(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.k
    public final void OxcuoDLp(ListAdapter listAdapter) {
        this.MdtA4re8 = (f) listAdapter;
    }

    @Override // defpackage.k
    public final void P7K7Inc8(CharSequence charSequence) {
        this.wxUZMvaN = charSequence;
    }

    @Override // defpackage.k
    public final Drawable VgvYg0wo() {
        return null;
    }

    @Override // defpackage.k
    public final void b2ZJblxo(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.k
    public final void dismiss() {
        PVxc5pbY pVxc5pbY = this.NCTxEWno;
        if (pVxc5pbY != null) {
            pVxc5pbY.dismiss();
            this.NCTxEWno = null;
        }
    }

    @Override // defpackage.k
    public final void k3x7lurq(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.k
    public final int lDXGDhIF() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        l lVar = this.VgvYg0wo;
        lVar.setSelection(i);
        if (lVar.getOnItemClickListener() != null) {
            lVar.performItemClick(null, i, this.MdtA4re8.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.k
    public final void ow5vqvCr(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.k
    public final CharSequence sjUBp5pO() {
        return this.wxUZMvaN;
    }

    @Override // defpackage.k
    public final void ygLcUYwZ(int i, int i2) {
        if (this.MdtA4re8 == null) {
            return;
        }
        l lVar = this.VgvYg0wo;
        DPHdAVYO dPHdAVYO = new DPHdAVYO(lVar.getPopupContext());
        AhLfQVuM ahLfQVuM = (AhLfQVuM) dPHdAVYO.NCTxEWno;
        CharSequence charSequence = this.wxUZMvaN;
        if (charSequence != null) {
            ahLfQVuM.wxUZMvaN = charSequence;
        }
        f fVar = this.MdtA4re8;
        int selectedItemPosition = lVar.getSelectedItemPosition();
        ahLfQVuM.b2ZJblxo = fVar;
        ahLfQVuM.Qr9iLBAD = this;
        ahLfQVuM.eVhOlqcC = selectedItemPosition;
        ahLfQVuM.jb9XjC4I = true;
        PVxc5pbY qoPGr6Ce = dPHdAVYO.qoPGr6Ce();
        this.NCTxEWno = qoPGr6Ce;
        AlertController$RecycleListView alertController$RecycleListView = qoPGr6Ce.b2ZJblxo.VgvYg0wo;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.NCTxEWno.show();
    }
}

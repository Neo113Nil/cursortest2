package defpackage;

import android.os.Bundle;
import android.view.View;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.presentation.ui.SortSprintFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class lb0 implements View.OnClickListener {
    public final /* synthetic */ View.OnCreateContextMenuListener MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ lb0(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.NCTxEWno;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.MdtA4re8;
        switch (i) {
            case 0:
                mb0 mb0Var = (mb0) onCreateContextMenuListener;
                mb0Var.dismiss();
                mb0Var.NCTxEWno.qoPGr6Ce();
                break;
            case 1:
                ((mb0) onCreateContextMenuListener).dismiss();
                break;
            default:
                SortSprintFragment sortSprintFragment = (SortSprintFragment) onCreateContextMenuListener;
                kn knVar = sortSprintFragment.tef3qNMP;
                i90 i90Var = ((w70) ((x70) knVar.getValue()).MdtA4re8.NCTxEWno.Qr9iLBAD()).qoPGr6Ce;
                uu sjUBp5pO = ej0.sjUBp5pO(sortSprintFragment);
                String str = i90Var.NCTxEWno;
                sjUBp5pO.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("traitKey", str);
                sjUBp5pO.MdtA4re8(R.id.action_sort_sprint_to_sprint_round, bundle, null);
                x90 x90Var = ((x70) knVar.getValue()).NCTxEWno;
                amk52bBQ amk52bbq = b10.NCTxEWno;
                x90Var.jb9XjC4I(x5.dHozS53r(i90.P7K7Inc8));
                break;
        }
    }
}

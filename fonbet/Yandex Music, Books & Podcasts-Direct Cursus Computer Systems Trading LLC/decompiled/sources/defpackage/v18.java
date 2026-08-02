package defpackage;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.i;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public final class v18 implements xjj {
    public final /* synthetic */ i a;

    public v18(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.xjj
    public final void onChanged(Object obj) {
        boolean z;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (((dzf) obj) != null) {
            i iVar = this.a;
            z = iVar.mShowsDialog;
            if (z) {
                View requireView = iVar.requireView();
                if (requireView.getParent() != null) {
                    xq0.q("DialogFragment can not be attached to a container view");
                    return;
                }
                dialog = iVar.mDialog;
                if (dialog != null) {
                    if (y.M(3)) {
                        StringBuilder sb = new StringBuilder("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        dialog3 = iVar.mDialog;
                        sb.append(dialog3);
                        Log.d("FragmentManager", sb.toString());
                    }
                    dialog2 = iVar.mDialog;
                    dialog2.setContentView(requireView);
                }
            }
        }
    }
}

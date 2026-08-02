package defpackage;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class wdj implements pq60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wdj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) obj2;
                if (((pey) obj) != null) {
                    z = dialogFragment.mShowsDialog;
                    if (z) {
                        View requireView = dialogFragment.requireView();
                        if (requireView.getParent() != null) {
                            ny61.r("DialogFragment can not be attached to a container view");
                            break;
                        } else if (dialogFragment.mDialog != null) {
                            if (FragmentManager.O(3)) {
                                Objects.toString(dialogFragment.mDialog);
                            }
                            dialogFragment.mDialog.setContentView(requireView);
                            break;
                        }
                    }
                }
                break;
            default:
                ((sm7) obj2).a.O(new l52(1, this, obj));
                break;
        }
    }
}

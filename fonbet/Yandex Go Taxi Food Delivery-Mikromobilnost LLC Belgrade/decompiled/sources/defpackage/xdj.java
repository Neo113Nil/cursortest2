package defpackage;

import android.view.View;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes10.dex */
public final class xdj extends acs {
    public final /* synthetic */ acs a;
    public final /* synthetic */ DialogFragment b;

    public xdj(DialogFragment dialogFragment, acs acsVar) {
        this.b = dialogFragment;
        this.a = acsVar;
    }

    @Override // defpackage.acs
    public final View b(int i) {
        acs acsVar = this.a;
        return acsVar.c() ? acsVar.b(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.acs
    public final boolean c() {
        return this.a.c() || this.b.onHasView();
    }
}

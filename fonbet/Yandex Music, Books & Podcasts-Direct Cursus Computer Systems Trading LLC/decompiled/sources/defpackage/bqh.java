package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class bqh extends i {
    public final boolean g = false;
    public gr0 h;
    public crh i;

    public bqh() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gr0 gr0Var = this.h;
        if (gr0Var != null) {
            if (this.g) {
                ((wqh) gr0Var).i();
            } else {
                ((aqh) gr0Var).q();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.g) {
            wqh wqhVar = new wqh(getContext());
            this.h = wqhVar;
            wqhVar.h(this.i);
        } else {
            this.h = new aqh(getContext());
        }
        return this.h;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        super.onStop();
        gr0 gr0Var = this.h;
        if (gr0Var == null || this.g) {
            return;
        }
        ((aqh) gr0Var).h(false);
    }
}

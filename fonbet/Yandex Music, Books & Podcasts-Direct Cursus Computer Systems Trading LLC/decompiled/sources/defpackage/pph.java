package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.i;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class pph extends i {
    public final boolean g = false;
    public gr0 h;
    public crh i;

    public pph() {
        setCancelable(true);
    }

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gr0 gr0Var = this.h;
        if (gr0Var == null) {
            return;
        }
        if (!this.g) {
            oph ophVar = (oph) gr0Var;
            ophVar.getWindow().setLayout(o2g.a0(ophVar.getContext()), -2);
        } else {
            lqh lqhVar = (lqh) gr0Var;
            Context context = lqhVar.h;
            lqhVar.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : o2g.a0(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.g) {
            lqh lqhVar = new lqh(getContext());
            this.h = lqhVar;
            y();
            lqhVar.f(this.i);
        } else {
            oph ophVar = new oph(getContext());
            this.h = ophVar;
            y();
            ophVar.g(this.i);
        }
        return this.h;
    }

    public final void y() {
        if (this.i == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.i = crh.b(arguments.getBundle("selector"));
            }
            if (this.i == null) {
                this.i = crh.c;
            }
        }
    }
}

package defpackage;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes7.dex */
public final class tf81 implements x071 {
    public final ao61 a;

    public tf81(ao61 ao61Var) {
        this.a = ao61Var;
    }

    @Override // defpackage.x071
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // defpackage.x071
    public final CheckBox getMuteControl() {
        r581 r581Var = this.a.c;
        kgx kgxVar = ao61.g[2];
        return (CheckBox) r581Var.a.get();
    }

    @Override // defpackage.x071
    public final ProgressBar getVideoProgress() {
        r581 r581Var = this.a.d;
        kgx kgxVar = ao61.g[3];
        return (ProgressBar) r581Var.a.get();
    }
}

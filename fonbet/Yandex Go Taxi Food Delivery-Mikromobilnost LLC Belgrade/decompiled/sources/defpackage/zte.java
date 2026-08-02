package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public final class zte {
    public final uq1 a;
    public final ej6 b;
    public final tue c;

    public zte(uq1 uq1Var, ej6 ej6Var, tue tueVar) {
        this.a = uq1Var;
        this.b = ej6Var;
        this.c = tueVar;
    }

    public final void a(View view, String str, String str2) {
        this.a.a().setMessage(str).setPositiveButton(str2).setDismissListener(new ce0(view, 8)).show();
    }
}

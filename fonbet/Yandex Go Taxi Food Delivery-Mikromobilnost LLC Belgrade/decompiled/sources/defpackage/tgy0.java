package defpackage;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.a;

/* loaded from: classes15.dex */
public final class tgy0 {
    public final SharedPreferences a;
    public final qro b;
    public final i3y c = a.a(new oew0(14, this));

    public tgy0(SharedPreferences sharedPreferences, wff0 wff0Var, qro qroVar) {
        this.a = sharedPreferences;
        this.b = qroVar;
        wff0Var.a(new fn3(17, this));
    }

    public final void a(Set set) {
        i3y i3yVar = this.c;
        ((Set) i3yVar.getValue()).addAll(set);
        this.a.edit().remove("TEST_IDS_KEY").putStringSet("TEST_IDS_KEY", set).apply();
        this.b.a.a((Set) i3yVar.getValue());
    }
}

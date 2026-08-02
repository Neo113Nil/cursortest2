package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class zgu {
    public final Looper a;
    public final ml21 b;
    public final SharedPreferences c;
    public final vgu d;
    public boolean e;

    public zgu(Looper looper, ml21 ml21Var, SharedPreferences sharedPreferences, vgu vguVar, wff0 wff0Var) {
        this.a = looper;
        this.b = ml21Var;
        this.c = sharedPreferences;
        this.d = vguVar;
        wff0Var.a(new fn3(6, this));
    }
}

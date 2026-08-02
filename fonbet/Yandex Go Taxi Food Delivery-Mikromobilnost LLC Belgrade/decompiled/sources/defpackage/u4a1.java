package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u4a1 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ o5a1 e;

    public u4a1(o5a1 o5a1Var, String str, long j) {
        Objects.requireNonNull(o5a1Var);
        this.e = o5a1Var;
        cvw.i(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.Kg().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.Kg().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}

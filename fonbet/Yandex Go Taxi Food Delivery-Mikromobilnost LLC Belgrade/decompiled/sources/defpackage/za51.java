package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class za51 {
    public final rz10 a;
    public final SharedPreferences b;

    public za51(Context context, rz10 rz10Var) {
        this.a = rz10Var;
        this.b = context.getSharedPreferences("messenger", 0);
    }
}

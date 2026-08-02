package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class ku0 {
    public final frt a;
    public final SharedPreferences b;

    public ku0(frt frtVar, Context context) {
        this.a = frtVar;
        this.b = context.getSharedPreferences("app_statistics", 0);
    }
}

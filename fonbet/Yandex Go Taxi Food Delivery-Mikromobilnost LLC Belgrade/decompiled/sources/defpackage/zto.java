package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public final class zto {
    public final SharedPreferences a;

    public zto(Context context) {
        this.a = context.getSharedPreferences("explorer_last_location_prefs", 0);
    }
}

package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class rx1 {
    public final Context a;
    public final jyr b;

    public rx1(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                this.b = btf.b(new ita(16, this));
                break;
            default:
                this.a = context;
                this.b = btf.b(new ri1(12, this));
                break;
        }
    }

    public boolean a(xxq xxqVar) {
        xxqVar.getClass();
        if (((Boolean) this.b.getValue()).booleanValue()) {
            return false;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("PLAYER_VIDEO_PREFERENCES" + xxqVar.a, 0);
        sharedPreferences.getClass();
        return sharedPreferences.getBoolean("KEY_PLAYER_VIDEO", true);
    }
}

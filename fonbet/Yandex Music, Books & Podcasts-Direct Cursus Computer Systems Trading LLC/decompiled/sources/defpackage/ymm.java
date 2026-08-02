package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class ymm implements oot {
    public final jyr a = btf.b(new hvl(24));
    public final jyr b = btf.b(new hvl(25));
    public final Context c;

    public ymm(Context context) {
        this.c = context;
    }

    @Override // defpackage.oot
    public final boolean a(t0u t0uVar) {
        return t0uVar.c < 290000;
    }

    @Override // defpackage.oot
    public final void b(uiq uiqVar, t0u t0uVar) {
        try {
            d(t0uVar);
            e();
        } finally {
            uiqVar.x();
        }
    }

    public final SharedPreferences c(t0u t0uVar) {
        int i = t0uVar.c;
        Context context = this.c;
        return i < 260000 ? context.getSharedPreferences("Yandex_Music", 0) : ost.a(context, ((frt) this.b.getValue()).c());
    }

    public final void d(t0u t0uVar) {
        int i = c(t0uVar).getInt("save_path_position", 0);
        ((n8q) this.a.getValue()).a((i == 1 || i == 2) ? thr.d : thr.c);
        c(t0uVar).edit().remove("stream_tracks_ids").remove("save_path_position").apply();
    }

    public final void e() {
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("Yandex_Music", 0);
        sharedPreferences.edit().remove("is_repeat").remove("is_repeat_list").putInt("repeat_mode", (sharedPreferences.getBoolean("is_repeat", false) ? hyn.d : sharedPreferences.getBoolean("is_repeat_list", false) ? hyn.e : hyn.f).a).apply();
    }
}

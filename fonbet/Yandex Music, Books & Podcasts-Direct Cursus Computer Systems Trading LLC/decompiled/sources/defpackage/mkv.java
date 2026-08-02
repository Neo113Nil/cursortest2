package defpackage;

import java.util.HashMap;
import java.util.UUID;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

/* loaded from: classes6.dex */
public final class mkv {
    public static final UUID b;
    public final OkHttpClient a;

    static {
        UUID uuid = un3.d;
        uuid.getClass();
        b = uuid;
    }

    public mkv(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    public final gqb a(DrmSecurityLevel drmSecurityLevel, nnd nndVar) {
        drmSecurityLevel.getClass();
        nndVar.getClass();
        OkHttpClient okHttpClient = this.a;
        u76 u76Var = new u76();
        u76Var.a = new roj(okHttpClient);
        u76Var.b = new x9o(new io7());
        n20 n20Var = new n20(drmSecurityLevel == DrmSecurityLevel.Low);
        yeg yegVar = new yeg();
        HashMap hashMap = new HashMap();
        UUID uuid = un3.a;
        UUID uuid2 = b;
        uuid2.getClass();
        return new gqb(u76Var, new tl7(uuid2, n20Var, u76Var, hashMap, true, new int[0], true, yegVar, -9223372036854775807L), nndVar);
    }
}

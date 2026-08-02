package defpackage;

import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApiConfig;

/* loaded from: classes6.dex */
public final class swe {
    public static final twh d;
    public final OkHttpClient a;
    public final n4f b;
    public final InternalVideoManifestApiConfig c;

    static {
        twh twhVar;
        Pattern pattern = twh.e;
        try {
            twhVar = q5g.C("application/json");
        } catch (IllegalArgumentException unused) {
            twhVar = null;
        }
        d = twhVar;
    }

    public swe(OkHttpClient okHttpClient, n4f n4fVar, oxa oxaVar, InternalVideoManifestApiConfig internalVideoManifestApiConfig) {
        okHttpClient.getClass();
        this.a = okHttpClient;
        this.b = n4fVar;
        this.c = internalVideoManifestApiConfig;
    }
}

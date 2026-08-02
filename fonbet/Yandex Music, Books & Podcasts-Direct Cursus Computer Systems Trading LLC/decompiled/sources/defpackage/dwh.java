package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class dwh {
    public final OkHttpClient a;

    public dwh(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
        if (okHttpClient.s.contains(izm.HTTP_2)) {
            xq0.x("Failed requirement.");
            throw null;
        }
    }
}

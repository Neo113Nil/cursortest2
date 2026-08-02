package ru.yandex.video.m3.ott.data.net.impl;

import com.google.gson.reflect.TypeToken;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.net.ProfileApi;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ProfileApiImpl;", "Lru/yandex/video/m3/ott/data/net/ProfileApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "userAgent", "", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Ljava/lang/String;)V", "getProfile", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/Ott$Profile;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileApiImpl implements ProfileApi {
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String OTT_PROFILE_ME = "https://api.ott.yandex.net/v1/profiles/me";
    private final AccountProvider accountProvider;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final String userAgent;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ProfileApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, String str) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.userAgent = str;
    }

    @Override // ru.yandex.video.m3.ott.data.net.ProfileApi
    public Future<Ott.Profile> getProfile() {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ProfileApiImpl$getProfile$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.Profile invoke() {
                OkHttpClient okHttpClient;
                String str;
                AccountProvider accountProvider;
                JsonConverter jsonConverter;
                okHttpClient = ProfileApiImpl.this.okHttpClient;
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h("https://api.ott.yandex.net/v1/profiles/me");
                str = ProfileApiImpl.this.userAgent;
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                accountProvider = ProfileApiImpl.this.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider.getAuthToken());
                addAuthHeader.getClass();
                kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(addAuthHeader))).execute();
                try {
                    rvj0 rvj0Var = execute.z;
                    String string = rvj0Var != null ? rvj0Var.string() : null;
                    execute.close();
                    if (string == null) {
                        return null;
                    }
                    jsonConverter = ProfileApiImpl.this.jsonConverter;
                    return (Ott.Profile) jsonConverter.from(string, new TypeToken<Ott.Profile>() { // from class: ru.yandex.video.m3.ott.data.net.impl.ProfileApiImpl$getProfile$1$invoke$lambda$1$$inlined$from$1
                    }.getType());
                } finally {
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ProfileApiImpl$Companion;", "", "()V", "HEADER_USER_AGENT", "", "OTT_PROFILE_ME", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

package ru.yandex.video.m3.ott.data.net.impl;

import com.google.gson.reflect.TypeToken;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.ott.data.dto.WatchParams;
import ru.yandex.video.m3.ott.data.net.WatchParamsApi;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/WatchParamsApiImpl;", "Lru/yandex/video/m3/ott/data/net/WatchParamsApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "userAgent", "", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Ljava/lang/String;)V", "getWatchParams", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/WatchParams;", "contentId", "sendWatchParams", "watchParams", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WatchParamsApiImpl implements WatchParamsApi {
    private static final wg10 APPLICATION_JSON;
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String OTT_WATCH_PARAMS = "https://api.ott.yandex.net/v7/hd/watch-params/";
    private final AccountProvider accountProvider;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final String userAgent;
    private static final Companion Companion = new Companion(0 == true ? 1 : 0);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        wg10 wg10Var = null;
        Regex regex = wg10.e;
        try {
            wg10Var = qje.o("application/json");
        } catch (IllegalArgumentException unused) {
        }
        APPLICATION_JSON = wg10Var;
    }

    public WatchParamsApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, String str) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.userAgent = str;
    }

    @Override // ru.yandex.video.m3.ott.data.net.WatchParamsApi
    public Future<WatchParams> getWatchParams(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.WatchParamsApiImpl$getWatchParams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final WatchParams invoke() {
                AccountProvider accountProvider;
                OkHttpClient okHttpClient;
                String str;
                AccountProvider accountProvider2;
                JsonConverter jsonConverter;
                accountProvider = WatchParamsApiImpl.this.accountProvider;
                if (accountProvider.getAuthToken().length() > 0) {
                    okHttpClient = WatchParamsApiImpl.this.okHttpClient;
                    t4j0 t4j0Var = new t4j0();
                    t4j0Var.h("https://api.ott.yandex.net/v7/hd/watch-params/" + contentId);
                    str = WatchParamsApiImpl.this.userAgent;
                    t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                    accountProvider2 = WatchParamsApiImpl.this.accountProvider;
                    t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider2.getAuthToken());
                    addAuthHeader.getClass();
                    kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(addAuthHeader))).execute();
                    try {
                        rvj0 rvj0Var = execute.z;
                        String string = rvj0Var != null ? rvj0Var.string() : null;
                        execute.close();
                        if (string != null) {
                            jsonConverter = WatchParamsApiImpl.this.jsonConverter;
                            return (WatchParams) jsonConverter.from(string, new TypeToken<WatchParams>() { // from class: ru.yandex.video.m3.ott.data.net.impl.WatchParamsApiImpl$getWatchParams$1$invoke$lambda$1$$inlined$from$1
                            }.getType());
                        }
                    } finally {
                    }
                }
                return null;
            }
        });
    }

    @Override // ru.yandex.video.m3.ott.data.net.WatchParamsApi
    public Future<?> sendWatchParams(final WatchParams watchParams) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.WatchParamsApiImpl$sendWatchParams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final zy11 invoke() {
                AccountProvider accountProvider;
                OkHttpClient okHttpClient;
                String str;
                AccountProvider accountProvider2;
                wg10 wg10Var;
                JsonConverter jsonConverter;
                accountProvider = WatchParamsApiImpl.this.accountProvider;
                if (accountProvider.getAuthToken().length() <= 0) {
                    return null;
                }
                okHttpClient = WatchParamsApiImpl.this.okHttpClient;
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h("https://api.ott.yandex.net/v7/hd/watch-params/");
                str = WatchParamsApiImpl.this.userAgent;
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                accountProvider2 = WatchParamsApiImpl.this.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider2.getAuthToken());
                int i = m5j0.a;
                wg10Var = WatchParamsApiImpl.APPLICATION_JSON;
                jsonConverter = WatchParamsApiImpl.this.jsonConverter;
                addAuthHeader.e("POST", wms.a(jsonConverter.to(watchParams), wg10Var));
                rvj0 rvj0Var = ((nci0) okHttpClient.newCall(new d5j0(addAuthHeader))).execute().z;
                if (rvj0Var == null) {
                    return null;
                }
                rvj0Var.close();
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/WatchParamsApiImpl$Companion;", "", "<init>", "()V", "Lwg10;", "APPLICATION_JSON", "Lwg10;", "", "HEADER_USER_AGENT", "Ljava/lang/String;", "OTT_WATCH_PARAMS", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

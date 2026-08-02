package ru.yandex.video.m3.ott.data.net.impl;

import defpackage.d5j0;
import defpackage.d5z0;
import defpackage.h5z0;
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
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.net.TimingsApi;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/TimingsApiImpl;", "Lru/yandex/video/m3/ott/data/net/TimingsApi;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "", "userAgent", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Ljava/lang/String;)V", "Lru/yandex/video/m3/ott/data/dto/Ott$TimingsInfo;", "timingsInfo", "Ljava/util/concurrent/Future;", "Lzy11;", "sendTiming", "(Lru/yandex/video/m3/ott/data/dto/Ott$TimingsInfo;)Ljava/util/concurrent/Future;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/config/AccountProvider;", "Ljava/lang/String;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimingsApiImpl implements TimingsApi {
    private static final wg10 APPLICATION_JSON;
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String OTT_TIMINGS = "https://timing.ott.yandex.net/v1/timings";
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

    public TimingsApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, String str) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.userAgent = str;
    }

    @Override // ru.yandex.video.m3.ott.data.net.TimingsApi
    public Future<zy11> sendTiming(final Ott.TimingsInfo timingsInfo) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.TimingsApiImpl$sendTiming$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m760invoke() {
                AccountProvider accountProvider;
                JsonConverter jsonConverter;
                OkHttpClient okHttpClient;
                String str;
                AccountProvider accountProvider2;
                wg10 wg10Var;
                accountProvider = TimingsApiImpl.this.accountProvider;
                if (accountProvider.getAuthToken().length() > 0) {
                    jsonConverter = TimingsApiImpl.this.jsonConverter;
                    String str2 = jsonConverter.to(timingsInfo);
                    d5z0 d5z0Var = h5z0.a;
                    d5z0Var.t("TimingsApiImpl");
                    d5z0Var.a(str2, new Object[0]);
                    okHttpClient = TimingsApiImpl.this.okHttpClient;
                    t4j0 t4j0Var = new t4j0();
                    t4j0Var.h("https://timing.ott.yandex.net/v1/timings");
                    str = TimingsApiImpl.this.userAgent;
                    t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                    accountProvider2 = TimingsApiImpl.this.accountProvider;
                    t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider2.getAuthToken());
                    int i = m5j0.a;
                    wg10Var = TimingsApiImpl.APPLICATION_JSON;
                    addAuthHeader.e("POST", wms.a(str2, wg10Var));
                    rvj0 rvj0Var = ((nci0) okHttpClient.newCall(new d5j0(addAuthHeader))).execute().z;
                    if (rvj0Var != null) {
                        rvj0Var.close();
                    }
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m760invoke();
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/TimingsApiImpl$Companion;", "", "<init>", "()V", "Lwg10;", "APPLICATION_JSON", "Lwg10;", "", "HEADER_USER_AGENT", "Ljava/lang/String;", "OTT_TIMINGS", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

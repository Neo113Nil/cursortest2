package ru.yandex.video.m3.ott.data.net.impl;

import defpackage.cvu0;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.ott.data.exception.ForbiddenByLicenseException;
import ru.yandex.video.m3.ott.data.net.LicenseCheckerApi;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/LicenseCheckerApiImpl;", "Lru/yandex/video/m3/ott/data/net/LicenseCheckerApi;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "", "userAgent", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/config/AccountProvider;Ljava/lang/String;)V", "contentId", "Ljava/util/concurrent/Future;", "Lzy11;", "checkLicense", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/config/AccountProvider;", "Ljava/lang/String;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LicenseCheckerApiImpl implements LicenseCheckerApi {
    private static final int EXPECTATION_FAILED = 417;
    private static final int FORBIDDEN = 403;
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final int INVALID_SESSION_KEY = 401;
    private static final String OTT_CHECK_LICENSE_URL = "https://api.ott.yandex.net/v1/master-playlists/{contentId}/status";
    private static final int PRECONDITION_FAILED = 412;
    private static final int SERVICE_UNAVAILABLE_BLACKBOX = 503;
    private final AccountProvider accountProvider;
    private final OkHttpClient okHttpClient;
    private final String userAgent;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public LicenseCheckerApiImpl(OkHttpClient okHttpClient, AccountProvider accountProvider, String str) {
        this.okHttpClient = okHttpClient;
        this.accountProvider = accountProvider;
        this.userAgent = str;
    }

    @Override // ru.yandex.video.m3.ott.data.net.LicenseCheckerApi
    public Future<zy11> checkLicense(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.LicenseCheckerApiImpl$checkLicense$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m759invoke() {
                OkHttpClient okHttpClient;
                String str;
                AccountProvider accountProvider;
                okHttpClient = LicenseCheckerApiImpl.this.okHttpClient;
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h(cvu0.v("https://api.ott.yandex.net/v1/master-playlists/{contentId}/status", "{contentId}", contentId, false));
                str = LicenseCheckerApiImpl.this.userAgent;
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                accountProvider = LicenseCheckerApiImpl.this.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider.getAuthToken());
                addAuthHeader.getClass();
                kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(addAuthHeader))).execute();
                try {
                    int i = execute.w;
                    if (i == 401 || i == 403 || i == 412 || i == 417 || i == 503) {
                        throw new ForbiddenByLicenseException(null, 1, null);
                    }
                    execute.close();
                } finally {
                }
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m759invoke();
                return zy11.a;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/LicenseCheckerApiImpl$Companion;", "", "()V", "EXPECTATION_FAILED", "", "FORBIDDEN", "HEADER_USER_AGENT", "", "INVALID_SESSION_KEY", "OTT_CHECK_LICENSE_URL", "PRECONDITION_FAILED", "SERVICE_UNAVAILABLE_BLACKBOX", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

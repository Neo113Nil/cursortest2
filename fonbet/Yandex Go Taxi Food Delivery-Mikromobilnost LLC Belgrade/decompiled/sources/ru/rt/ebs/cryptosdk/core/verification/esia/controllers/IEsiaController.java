package ru.rt.ebs.cryptosdk.core.verification.esia.controllers;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptRequest;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptResult;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0018\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/controllers/IEsiaController;", "", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaInterceptRequest;", "request", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaInterceptResult;", "processUrl", "(Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaInterceptRequest;)Lru/rt/ebs/cryptosdk/core/verification/esia/entities/models/EsiaInterceptResult;", "", "url", "Lzy11;", "setEsiaRedirectUrl", "(Ljava/lang/String;)V", "clearSession", "()V", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", "supportTlsHost", "(Ljava/lang/String;)Z", "isIgnoreHost", "Landroid/net/Uri;", "isEsiaUrlWithoutPath", "(Landroid/net/Uri;)Z", LaunchBrowserActivity.KEY_URI, "isBrowserUrl", "isHandleUrl", "isRedirectUrl", "getHomePageUri", "()Landroid/net/Uri;", "homePageUri", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEsiaController {
    void clearSession();

    Uri getHomePageUri();

    boolean isBrowserUrl(Uri uri);

    boolean isEsiaUrlWithoutPath(Uri url);

    boolean isHandleUrl(Uri uri);

    boolean isIgnoreHost(String host);

    boolean isRedirectUrl(Uri uri);

    EsiaInterceptResult processUrl(EsiaInterceptRequest request);

    void setEsiaRedirectUrl(String url);

    boolean supportTlsHost(String host);
}

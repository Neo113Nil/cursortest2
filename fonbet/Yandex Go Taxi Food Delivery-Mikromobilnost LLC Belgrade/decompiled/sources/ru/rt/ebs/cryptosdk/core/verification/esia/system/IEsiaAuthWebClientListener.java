package ru.rt.ebs.cryptosdk.core.verification.esia.system;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.EsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.SslErrorEsiaVerificationEbsException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/system/IEsiaAuthWebClientListener;", "", "Lzy11;", "onPageStarted", "()V", "onPageFinished", "onPageCommitVisible", "", "redirectUrl", "onProcessRedirectUrl", "(Ljava/lang/String;)V", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;", "error", "onProcessError", "(Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;)V", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/SslErrorEsiaVerificationEbsException;", "onSslError", "(Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/SslErrorEsiaVerificationEbsException;)V", "", ErrorResponseData.JSON_ERROR_CODE, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "onErrorLoadPage", "(ILjava/lang/String;)Z", "Landroid/net/Uri;", "url", "onProcessEsiaUrlWithoutPath", "(Landroid/net/Uri;)V", "onProcessBrowserUrl", "redirectFrom", "redirectTo", "onChangeUrlByRedirect", "(Ljava/lang/String;Ljava/lang/String;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEsiaAuthWebClientListener {
    void onChangeUrlByRedirect(String redirectFrom, String redirectTo);

    boolean onErrorLoadPage(int errorCode, String description);

    void onPageCommitVisible();

    void onPageFinished();

    void onPageStarted();

    void onProcessBrowserUrl(Uri url);

    void onProcessError(EsiaVerificationEbsException error);

    void onProcessEsiaUrlWithoutPath(Uri url);

    void onProcessRedirectUrl(String redirectUrl);

    void onSslError(SslErrorEsiaVerificationEbsException error);
}

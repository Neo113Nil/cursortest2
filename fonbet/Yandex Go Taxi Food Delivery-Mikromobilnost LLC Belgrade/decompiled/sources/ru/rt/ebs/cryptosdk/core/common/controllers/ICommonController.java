package ru.rt.ebs.cryptosdk.core.common.controllers;

import defpackage.sls;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lru/rt/ebs/cryptosdk/core/common/controllers/ICommonController;", "", "", "isUseGost", "()Z", "Lkotlin/Function0;", "Lzy11;", "action", "checkRoot", "(Lsls;)V", "checkVerifyIntegrity", "()V", "verifyIntegrity", "Ljava/lang/Exception;", Constants.KEY_EXCEPTION, "failVerifyIntegrity", "(Ljava/lang/Exception;)V", "verifySelfSignCertificates", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ICommonController {
    void checkRoot(sls action);

    void checkVerifyIntegrity();

    void failVerifyIntegrity(Exception exception);

    boolean isUseGost();

    void verifyIntegrity(sls action);

    void verifySelfSignCertificates(sls action);
}

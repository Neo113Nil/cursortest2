package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IVerificationListener;", "", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "cookieVrf", "Lzy11;", "onSuccess", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "", Constants.KEY_EXCEPTION, "onError", "(Ljava/lang/Throwable;)V", "onCancel", "()V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationListener {
    void onCancel();

    void onError(Throwable exception);

    void onSuccess(Token cookieVrf);
}

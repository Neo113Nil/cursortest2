package ru.rt.ebs.cryptosdk.core.verification.adapter.controllers;

import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H&¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u0004¨\u0006\u001c"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/adapter/controllers/IAdapterController;", "", "Lzy11;", "startEsiaAuthentication", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/rt/ebs/cryptosdk/core/verification/adapter/entities/models/EsiaAuthenticationUrl;", "getEsiaAuthenticationUrl", "()Lru/rt/ebs/cryptosdk/core/verification/adapter/entities/models/EsiaAuthenticationUrl;", "", "redirectUrl", "setEsiaAuthenticationSessionRedirectUrl", "(Ljava/lang/String;)V", "finishEsiaAuthentication", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "getEbsSessionId", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "setEbsRedirectUrl", "removeEbsRedirectUrl", "()V", "startExtEsiaAuthentication", "getExtEsiaAuthenticationUrl", "setExtEsiaAuthenticationRedirectUrl", "finishExtEsiaAuthentication", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;", "ebsToken", "setEbsToken", "(Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/EbsToken;)V", "finishVerification", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IAdapterController {
    Object finishEsiaAuthentication(Continuation<? super zy11> continuation);

    Object finishExtEsiaAuthentication(Continuation<? super zy11> continuation);

    Object finishVerification(Continuation<? super zy11> continuation);

    Token getEbsSessionId();

    EsiaAuthenticationUrl getEsiaAuthenticationUrl();

    EsiaAuthenticationUrl getExtEsiaAuthenticationUrl();

    void removeEbsRedirectUrl();

    void setEbsRedirectUrl(String redirectUrl);

    void setEbsToken(EbsToken ebsToken);

    void setEsiaAuthenticationSessionRedirectUrl(String redirectUrl);

    void setExtEsiaAuthenticationRedirectUrl(String redirectUrl);

    Object startEsiaAuthentication(Continuation<? super zy11> continuation);

    Object startExtEsiaAuthentication(Continuation<? super zy11> continuation);
}

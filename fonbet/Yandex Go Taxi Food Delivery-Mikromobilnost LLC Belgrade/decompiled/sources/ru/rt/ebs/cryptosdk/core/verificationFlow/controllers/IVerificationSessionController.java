package ru.rt.ebs.cryptosdk.core.verificationFlow.controllers;

import java.net.URI;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationResult;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0010H&¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0017J\u001b\u0010\u001f\u001a\u00020\u00042\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0004H&¢\u0006\u0004\b\"\u0010\u0017R\u0014\u0010$\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/controllers/IVerificationSessionController;", "", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "verificationRequestScheme", "Lzy11;", "createSession", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;)V", "Ljava/net/URI;", "url", "setEbsLocation", "(Ljava/net/URI;)V", "getEbsLocation", "()Ljava/net/URI;", "", "getCookieAdapterValue", "()Ljava/lang/String;", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "resSecret", "setResSecret", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;)V", "getResSecret", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "removeResSecret", "()V", "cookieVrf", "setCookieVrf", "getCookieVrf", "successfulVerification", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "errorVerification", "(Ljava/lang/Exception;)V", "cancelVerification", "release", "", "isActive", "()Z", "getVerificationRequestScheme", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "getVerificationResult", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationResult;", "verificationResult", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IVerificationSessionController {
    void cancelVerification();

    void createSession(VerificationRequestScheme verificationRequestScheme);

    void errorVerification(Exception error);

    String getCookieAdapterValue();

    Token getCookieVrf();

    URI getEbsLocation();

    Token getResSecret();

    VerificationRequestScheme getVerificationRequestScheme();

    VerificationResult getVerificationResult();

    boolean isActive();

    void release();

    void removeResSecret();

    void setCookieVrf(Token cookieVrf);

    void setEbsLocation(URI url);

    void setResSecret(Token resSecret);

    void successfulVerification();
}

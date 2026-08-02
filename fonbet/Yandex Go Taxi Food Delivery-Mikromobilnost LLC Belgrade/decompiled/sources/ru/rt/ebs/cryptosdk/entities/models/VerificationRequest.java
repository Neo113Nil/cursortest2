package ru.rt.ebs.cryptosdk.entities.models;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/VerificationRequest;", "T", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "", "verificationRequestScheme", "designOptions", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "<init>", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;)V", "getVerificationRequestScheme", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "getDesignOptions", "()Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VerificationRequest<T extends VerificationRequestScheme> {
    private final DesignOptions designOptions;
    private final T verificationRequestScheme;

    public VerificationRequest(T t, DesignOptions designOptions) {
        this.verificationRequestScheme = t;
        this.designOptions = designOptions;
    }

    public final DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    public final T getVerificationRequestScheme() {
        return this.verificationRequestScheme;
    }
}

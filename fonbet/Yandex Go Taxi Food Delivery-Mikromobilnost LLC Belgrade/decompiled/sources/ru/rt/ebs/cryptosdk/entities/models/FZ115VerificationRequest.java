package ru.rt.ebs.cryptosdk.entities.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/FZ115VerificationRequest;", "Lru/rt/ebs/cryptosdk/entities/models/VerificationRequest;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;", "verificationRequestScheme", "designOptions", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "<init>", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;)V", "Builder", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FZ115VerificationRequest extends VerificationRequest<VerificationRequestScheme.FZ115> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/FZ115VerificationRequest$Builder;", "Lru/rt/ebs/cryptosdk/entities/models/VerificationRequestBuilder;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;", "Lru/rt/ebs/cryptosdk/entities/models/FZ115VerificationRequest;", "verificationRequestScheme", "<init>", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;)V", "build", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder extends VerificationRequestBuilder<VerificationRequestScheme.FZ115, FZ115VerificationRequest> {
        public Builder(VerificationRequestScheme.FZ115 fz115) {
            super(fz115);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.rt.ebs.cryptosdk.entities.models.VerificationRequestBuilder
        public FZ115VerificationRequest build() {
            return new FZ115VerificationRequest(getVerificationRequestScheme(), getDesignOptions(), null);
        }
    }

    public /* synthetic */ FZ115VerificationRequest(VerificationRequestScheme.FZ115 fz115, DesignOptions designOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(fz115, designOptions);
    }

    private FZ115VerificationRequest(VerificationRequestScheme.FZ115 fz115, DesignOptions designOptions) {
        super(fz115, designOptions);
    }
}

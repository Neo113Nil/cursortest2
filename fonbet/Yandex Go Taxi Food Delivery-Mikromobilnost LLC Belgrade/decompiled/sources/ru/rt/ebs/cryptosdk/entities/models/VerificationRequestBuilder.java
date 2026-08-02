package ru.rt.ebs.cryptosdk.entities.models;

import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;
import ru.rt.ebs.cryptosdk.entities.models.VerificationRequest;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0014\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0006\u001a\u00028\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\u00020\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/rt/ebs/cryptosdk/entities/models/VerificationRequestBuilder;", "VRS", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "VR", "Lru/rt/ebs/cryptosdk/entities/models/VerificationRequest;", "", "verificationRequestScheme", "<init>", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;)V", "getVerificationRequestScheme", "()Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "setVerificationRequestScheme", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "designOptions", "Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "getDesignOptions", "()Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;", "setDesignOptions", "(Lru/rt/ebs/cryptosdk/entities/models/DesignOptions;)V", "options", "build", "()Lru/rt/ebs/cryptosdk/entities/models/VerificationRequest;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VerificationRequestBuilder<VRS extends VerificationRequestScheme, VR extends VerificationRequest<VRS>> {
    private DesignOptions designOptions = DefaultDesignOptions.INSTANCE;
    private VRS verificationRequestScheme;

    public VerificationRequestBuilder(VRS vrs) {
        this.verificationRequestScheme = vrs;
    }

    public abstract VR build();

    public final VerificationRequestBuilder<VRS, VR> designOptions(DesignOptions options) {
        this.designOptions = options;
        return this;
    }

    public final DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    public final VRS getVerificationRequestScheme() {
        return this.verificationRequestScheme;
    }

    public final void setDesignOptions(DesignOptions designOptions) {
        this.designOptions = designOptions;
    }

    public final void setVerificationRequestScheme(VRS vrs) {
        this.verificationRequestScheme = vrs;
    }
}

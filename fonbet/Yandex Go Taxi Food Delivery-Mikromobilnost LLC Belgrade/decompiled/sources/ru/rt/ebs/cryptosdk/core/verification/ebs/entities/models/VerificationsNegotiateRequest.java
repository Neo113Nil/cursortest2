package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import defpackage.kju0;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/VerificationsNegotiateRequest;", "", "Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;", kju0.j, "<init>", "(Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;)V", "a", "Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;", "getMetadata", "()Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final /* data */ class VerificationsNegotiateRequest {

    /* renamed from: a, reason: from kotlin metadata */
    @ysq0(kju0.j)
    private final MetaData metadata;

    public VerificationsNegotiateRequest(MetaData metaData) {
        this.metadata = metaData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VerificationsNegotiateRequest) && jl40.l(this.metadata, ((VerificationsNegotiateRequest) obj).metadata);
    }

    public final int hashCode() {
        return this.metadata.hashCode();
    }

    public final String toString() {
        return "VerificationsNegotiateRequest(metadata=" + this.metadata + Extension.C_BRAKE;
    }
}

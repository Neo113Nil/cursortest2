package ru.rt.ebs.cryptosdk.core.security.entities.models;

import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;", "", "certificates", "", "Ljava/security/cert/X509Certificate;", "<init>", "(Ljava/util/List;)V", "getCertificates$cryptosdk_core_prodRelease", "()Ljava/util/List;", "Builder", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TLSOptions {
    private final List<X509Certificate> certificates;

    /* JADX WARN: Multi-variable type inference failed */
    private TLSOptions(List<? extends X509Certificate> list) {
        this.certificates = list;
    }

    public final List<X509Certificate> getCertificates$cryptosdk_core_prodRelease() {
        return this.certificates;
    }

    public /* synthetic */ TLSOptions(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0002\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions$Builder;", "", "certificates", "", "Ljava/security/cert/X509Certificate;", "<init>", "(Ljava/util/List;)V", "build", "Lru/rt/ebs/cryptosdk/core/security/entities/models/TLSOptions;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private List<? extends X509Certificate> certificates;

        public /* synthetic */ Builder(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.a : list);
        }

        public final TLSOptions build() {
            return new TLSOptions(this.certificates, null);
        }

        public final Builder certificates(List<? extends X509Certificate> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder(List<? extends X509Certificate> list) {
            this.certificates = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}

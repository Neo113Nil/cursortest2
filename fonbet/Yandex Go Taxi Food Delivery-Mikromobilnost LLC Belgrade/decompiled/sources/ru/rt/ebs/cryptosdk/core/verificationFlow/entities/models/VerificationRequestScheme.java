package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import defpackage.sqb1;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioCollectionType;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0019\u001aBE\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0000H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "", "sid", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "adapterApiUri", "Ljava/net/URI;", "isAppendAdapterPort", "", "consumerApiUri", "consumerApiToken", "isAppendEbsPort", "ebsPort", "", "<init>", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;Ljava/net/URI;ZLjava/net/URI;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;ZI)V", "getSid", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "getAdapterApiUri", "()Ljava/net/URI;", "()Z", "getConsumerApiUri", "getConsumerApiToken", "getEbsPort", "()I", "empty", "FZ115", "WithoutEsia", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$WithoutEsia;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VerificationRequestScheme {
    private final URI adapterApiUri;
    private final Token consumerApiToken;
    private final URI consumerApiUri;
    private final int ebsPort;
    private final boolean isAppendAdapterPort;
    private final boolean isAppendEbsPort;
    private final Token sid;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0001H\u0016¨\u0006\u0010"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$FZ115;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "sid", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "adapterApiUri", "Ljava/net/URI;", "isAppendAdapterPort", "", "consumerApiUri", "consumerApiToken", "isAppendEbsPort", "ebsPort", "", "<init>", "(Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;Ljava/net/URI;ZLjava/net/URI;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;ZI)V", "empty", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FZ115 extends VerificationRequestScheme {
        public FZ115(Token token, URI uri, boolean z, URI uri2, Token token2, boolean z2, int i) {
            super(token, uri, z, uri2, token2, z2, i, null);
        }

        @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme
        public VerificationRequestScheme empty() {
            return new FZ115(sqb1.b(), URI.create(""), false, URI.create(""), sqb1.b(), false, 0);
        }
    }

    private VerificationRequestScheme(Token token, URI uri, boolean z, URI uri2, Token token2, boolean z2, int i) {
        this.sid = token;
        this.adapterApiUri = uri;
        this.isAppendAdapterPort = z;
        this.consumerApiUri = uri2;
        this.consumerApiToken = token2;
        this.isAppendEbsPort = z2;
        this.ebsPort = i;
    }

    public abstract VerificationRequestScheme empty();

    public final URI getAdapterApiUri() {
        return this.adapterApiUri;
    }

    public final Token getConsumerApiToken() {
        return this.consumerApiToken;
    }

    public final URI getConsumerApiUri() {
        return this.consumerApiUri;
    }

    public final int getEbsPort() {
        return this.ebsPort;
    }

    public final Token getSid() {
        return this.sid;
    }

    /* renamed from: isAppendAdapterPort, reason: from getter */
    public final boolean getIsAppendAdapterPort() {
        return this.isAppendAdapterPort;
    }

    /* renamed from: isAppendEbsPort, reason: from getter */
    public final boolean getIsAppendEbsPort() {
        return this.isAppendEbsPort;
    }

    public /* synthetic */ VerificationRequestScheme(Token token, URI uri, boolean z, URI uri2, Token token2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(token, uri, z, uri2, token2, z2, i);
    }

    public /* synthetic */ VerificationRequestScheme(Token token, URI uri, boolean z, URI uri2, Token token2, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(token, uri, z, uri2, token2, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 0 : i, null);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001a\u001a\u00020\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme$WithoutEsia;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/VerificationRequestScheme;", "bioCollectionType", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioCollectionType;", "sid", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "adapterApiUri", "Ljava/net/URI;", "isAppendAdapterPort", "", "consumerApiUri", "consumerApiToken", "vrfSessionId", "uploadUri", "setCookieAdapterValue", "", "<init>", "(Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioCollectionType;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;Ljava/net/URI;ZLjava/net/URI;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;Ljava/net/URI;Ljava/lang/String;)V", "getBioCollectionType", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/BioCollectionType;", "getVrfSessionId", "()Lru/rt/ebs/cryptosdk/core/common/entities/models/Token;", "getUploadUri", "()Ljava/net/URI;", "getSetCookieAdapterValue", "()Ljava/lang/String;", "empty", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithoutEsia extends VerificationRequestScheme {
        private final BioCollectionType bioCollectionType;
        private final String setCookieAdapterValue;
        private final URI uploadUri;
        private final Token vrfSessionId;

        public /* synthetic */ WithoutEsia(BioCollectionType bioCollectionType, Token token, URI uri, boolean z, URI uri2, Token token2, Token token3, URI uri3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bioCollectionType, token, uri, z, uri2, token2, token3, uri3, (i & 256) != 0 ? "" : str);
        }

        @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme
        public VerificationRequestScheme empty() {
            return new WithoutEsia(BioCollectionType.FACE_ONLY, sqb1.b(), URI.create(""), false, URI.create(""), sqb1.b(), sqb1.b(), URI.create(""), null, 256, null);
        }

        public final BioCollectionType getBioCollectionType() {
            return this.bioCollectionType;
        }

        public final String getSetCookieAdapterValue() {
            return this.setCookieAdapterValue;
        }

        public final URI getUploadUri() {
            return this.uploadUri;
        }

        public final Token getVrfSessionId() {
            return this.vrfSessionId;
        }

        public WithoutEsia(BioCollectionType bioCollectionType, Token token, URI uri, boolean z, URI uri2, Token token2, Token token3, URI uri3, String str) {
            super(token, uri, z, uri2, token2, false, 0, 96, null);
            this.bioCollectionType = bioCollectionType;
            this.vrfSessionId = token3;
            this.uploadUri = uri3;
            this.setCookieAdapterValue = str;
        }
    }
}

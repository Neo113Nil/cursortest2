package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.psq0;
import defpackage.qje;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "", "", "treeSize", "", "sha256RootHash", "<init>", "(ILjava/lang/String;)V", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IILjava/lang/String;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$domesticroots_certificatetransparency_release", "(Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getTreeSize", "getTreeSize$annotations", "()V", "Ljava/lang/String;", "getSha256RootHash", "getSha256RootHash$annotations", "Companion", "$serializer", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FinalTreeHead {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String sha256RootHash;
    private final int treeSize;

    @jxi
    public /* synthetic */ FinalTreeHead(int i, int i2, String str, psq0 psq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, FinalTreeHead$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.treeSize = i2;
        this.sha256RootHash = str;
        if (i2 < 0) {
            ny61.g("Failed requirement.");
            throw null;
        }
        if (str.length() == 44) {
            return;
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    public static /* synthetic */ FinalTreeHead copy$default(FinalTreeHead finalTreeHead, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = finalTreeHead.treeSize;
        }
        if ((i2 & 2) != 0) {
            str = finalTreeHead.sha256RootHash;
        }
        return finalTreeHead.copy(i, str);
    }

    public static /* synthetic */ void getSha256RootHash$annotations() {
    }

    public static /* synthetic */ void getTreeSize$annotations() {
    }

    public static final /* synthetic */ void write$Self$domesticroots_certificatetransparency_release(FinalTreeHead self, yjd output, SerialDescriptor serialDesc) {
        output.A(0, self.treeSize, serialDesc);
        output.o(serialDesc, 1, self.sha256RootHash);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTreeSize() {
        return this.treeSize;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSha256RootHash() {
        return this.sha256RootHash;
    }

    public final FinalTreeHead copy(int treeSize, String sha256RootHash) {
        return new FinalTreeHead(treeSize, sha256RootHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalTreeHead)) {
            return false;
        }
        FinalTreeHead finalTreeHead = (FinalTreeHead) other;
        return this.treeSize == finalTreeHead.treeSize && jl40.l(this.sha256RootHash, finalTreeHead.sha256RootHash);
    }

    public final String getSha256RootHash() {
        return this.sha256RootHash;
    }

    public final int getTreeSize() {
        return this.treeSize;
    }

    public int hashCode() {
        return this.sha256RootHash.hashCode() + (Integer.hashCode(this.treeSize) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FinalTreeHead(treeSize=");
        sb.append(this.treeSize);
        sb.append(", sha256RootHash=");
        return b64.p(sb, this.sha256RootHash, ')');
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return FinalTreeHead$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FinalTreeHead(int i, String str) {
        this.treeSize = i;
        this.sha256RootHash = str;
        if (i >= 0) {
            if (str.length() == 44) {
                return;
            }
            ny61.g("Failed requirement.");
            throw null;
        }
        ny61.g("Failed requirement.");
        throw null;
    }
}

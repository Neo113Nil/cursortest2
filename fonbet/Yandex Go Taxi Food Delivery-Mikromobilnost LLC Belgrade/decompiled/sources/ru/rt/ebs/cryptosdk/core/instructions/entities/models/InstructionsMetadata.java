package ru.rt.ebs.cryptosdk.core.instructions.entities.models;

import defpackage.b64;
import defpackage.jl40;
import defpackage.m2a1;
import defpackage.oyr;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/rt/ebs/cryptosdk/core/instructions/entities/models/InstructionsMetadata;", "", "", "url", "checksum", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final /* data */ class InstructionsMetadata {

    /* renamed from: a, reason: from kotlin metadata */
    @ysq0("urlinstruction")
    private final String url;

    /* renamed from: b, reason: from kotlin metadata */
    @ysq0("checksum")
    private final String checksum;

    /* renamed from: c, reason: from kotlin metadata */
    @ysq0("version")
    private final String version;

    public InstructionsMetadata(String str, String str2, String str3) {
        this.url = str;
        this.checksum = str2;
        this.version = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getChecksum() {
        return this.checksum;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: c, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstructionsMetadata)) {
            return false;
        }
        InstructionsMetadata instructionsMetadata = (InstructionsMetadata) obj;
        return jl40.l(this.url, instructionsMetadata.url) && jl40.l(this.checksum, instructionsMetadata.checksum) && jl40.l(this.version, instructionsMetadata.version);
    }

    public final int hashCode() {
        return this.version.hashCode() + m2a1.a(this.checksum, this.url.hashCode() * 31);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.checksum;
        return oyr.t(b64.v("InstructionsMetadata(url=", str, ", checksum=", str2, ", version="), this.version, Extension.C_BRAKE);
    }
}

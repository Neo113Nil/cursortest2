package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import defpackage.oyr;
import java.io.File;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/NegotiateHandler;", "", "negotiate", "Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;", "bioSampleFile", "Ljava/io/File;", "instructionsHandlerBody", "", "<init>", "(Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;Ljava/io/File;Ljava/lang/String;)V", "getNegotiate", "()Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/Negotiate;", "getBioSampleFile", "()Ljava/io/File;", "getInstructionsHandlerBody", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NegotiateHandler {
    private final File bioSampleFile;
    private final String instructionsHandlerBody;
    private final Negotiate negotiate;

    public NegotiateHandler(Negotiate negotiate, File file, String str) {
        this.negotiate = negotiate;
        this.bioSampleFile = file;
        this.instructionsHandlerBody = str;
    }

    public static /* synthetic */ NegotiateHandler copy$default(NegotiateHandler negotiateHandler, Negotiate negotiate, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            negotiate = negotiateHandler.negotiate;
        }
        if ((i & 2) != 0) {
            file = negotiateHandler.bioSampleFile;
        }
        if ((i & 4) != 0) {
            str = negotiateHandler.instructionsHandlerBody;
        }
        return negotiateHandler.copy(negotiate, file, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Negotiate getNegotiate() {
        return this.negotiate;
    }

    /* renamed from: component2, reason: from getter */
    public final File getBioSampleFile() {
        return this.bioSampleFile;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInstructionsHandlerBody() {
        return this.instructionsHandlerBody;
    }

    public final NegotiateHandler copy(Negotiate negotiate, File bioSampleFile, String instructionsHandlerBody) {
        return new NegotiateHandler(negotiate, bioSampleFile, instructionsHandlerBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NegotiateHandler)) {
            return false;
        }
        NegotiateHandler negotiateHandler = (NegotiateHandler) other;
        return jl40.l(this.negotiate, negotiateHandler.negotiate) && jl40.l(this.bioSampleFile, negotiateHandler.bioSampleFile) && jl40.l(this.instructionsHandlerBody, negotiateHandler.instructionsHandlerBody);
    }

    public final File getBioSampleFile() {
        return this.bioSampleFile;
    }

    public final String getInstructionsHandlerBody() {
        return this.instructionsHandlerBody;
    }

    public final Negotiate getNegotiate() {
        return this.negotiate;
    }

    public int hashCode() {
        return this.instructionsHandlerBody.hashCode() + ((this.bioSampleFile.hashCode() + (this.negotiate.hashCode() * 31)) * 31);
    }

    public String toString() {
        Negotiate negotiate = this.negotiate;
        File file = this.bioSampleFile;
        String str = this.instructionsHandlerBody;
        StringBuilder sb = new StringBuilder("NegotiateHandler(negotiate=");
        sb.append(negotiate);
        sb.append(", bioSampleFile=");
        sb.append(file);
        sb.append(", instructionsHandlerBody=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}

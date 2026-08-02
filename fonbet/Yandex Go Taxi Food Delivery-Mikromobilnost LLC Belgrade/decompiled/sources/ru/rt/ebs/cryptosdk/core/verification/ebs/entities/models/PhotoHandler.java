package ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models;

import defpackage.jl40;
import java.io.File;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/ebs/entities/models/PhotoHandler;", "", "bioSampleFile", "Ljava/io/File;", "instructionsHandlerBody", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getBioSampleFile", "()Ljava/io/File;", "getInstructionsHandlerBody", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PhotoHandler {
    private final File bioSampleFile;
    private final String instructionsHandlerBody;

    public PhotoHandler(File file, String str) {
        this.bioSampleFile = file;
        this.instructionsHandlerBody = str;
    }

    public static /* synthetic */ PhotoHandler copy$default(PhotoHandler photoHandler, File file, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            file = photoHandler.bioSampleFile;
        }
        if ((i & 2) != 0) {
            str = photoHandler.instructionsHandlerBody;
        }
        return photoHandler.copy(file, str);
    }

    /* renamed from: component1, reason: from getter */
    public final File getBioSampleFile() {
        return this.bioSampleFile;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstructionsHandlerBody() {
        return this.instructionsHandlerBody;
    }

    public final PhotoHandler copy(File bioSampleFile, String instructionsHandlerBody) {
        return new PhotoHandler(bioSampleFile, instructionsHandlerBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoHandler)) {
            return false;
        }
        PhotoHandler photoHandler = (PhotoHandler) other;
        return jl40.l(this.bioSampleFile, photoHandler.bioSampleFile) && jl40.l(this.instructionsHandlerBody, photoHandler.instructionsHandlerBody);
    }

    public final File getBioSampleFile() {
        return this.bioSampleFile;
    }

    public final String getInstructionsHandlerBody() {
        return this.instructionsHandlerBody;
    }

    public int hashCode() {
        return this.instructionsHandlerBody.hashCode() + (this.bioSampleFile.hashCode() * 31);
    }

    public String toString() {
        return "PhotoHandler(bioSampleFile=" + this.bioSampleFile + ", instructionsHandlerBody=" + this.instructionsHandlerBody + Extension.C_BRAKE;
    }
}

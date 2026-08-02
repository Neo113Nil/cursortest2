package ru.rt.ebs.cryptosdk.core.registration.entities.models;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/rt/ebs/cryptosdk/core/registration/entities/models/UpdateRegistrationRequest;", "", "", "installID", "programID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getInstallID", "()Ljava/lang/String;", "b", "getProgramID", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final /* data */ class UpdateRegistrationRequest {

    /* renamed from: a, reason: from kotlin metadata */
    @ysq0("install_id")
    private final String installID;

    /* renamed from: b, reason: from kotlin metadata */
    @ysq0("kpm_program_id")
    private final String programID;

    public UpdateRegistrationRequest(String str, String str2) {
        this.installID = str;
        this.programID = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateRegistrationRequest)) {
            return false;
        }
        UpdateRegistrationRequest updateRegistrationRequest = (UpdateRegistrationRequest) obj;
        return jl40.l(this.installID, updateRegistrationRequest.installID) && jl40.l(this.programID, updateRegistrationRequest.programID);
    }

    public final int hashCode() {
        return this.programID.hashCode() + (this.installID.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("UpdateRegistrationRequest(installID=", this.installID, ", programID=", this.programID, Extension.C_BRAKE);
    }
}

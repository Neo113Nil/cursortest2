package ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.i731;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, d2 = {"Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;", "Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/EsiaVerificationEbsException;", "Landroid/os/Parcelable;", "", "exceptionCode", "exceptionMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/verification/esia/entities/exceptions/VerificationAttemptsExceededEbsException;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExceptionCode", "getExceptionMessage", "Companion", "i731", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VerificationAttemptsExceededEbsException extends EsiaVerificationEbsException implements Parcelable {
    private final String exceptionCode;
    private final String exceptionMessage;
    public static final i731 Companion = new i731();
    public static final Parcelable.Creator<VerificationAttemptsExceededEbsException> CREATOR = new Creator();

    public VerificationAttemptsExceededEbsException(String str, String str2) {
        super(str, str2);
        this.exceptionCode = str;
        this.exceptionMessage = str2;
    }

    public static /* synthetic */ VerificationAttemptsExceededEbsException copy$default(VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verificationAttemptsExceededEbsException.exceptionCode;
        }
        if ((i & 2) != 0) {
            str2 = verificationAttemptsExceededEbsException.exceptionMessage;
        }
        return verificationAttemptsExceededEbsException.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExceptionCode() {
        return this.exceptionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public final VerificationAttemptsExceededEbsException copy(String exceptionCode, String exceptionMessage) {
        return new VerificationAttemptsExceededEbsException(exceptionCode, exceptionMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationAttemptsExceededEbsException)) {
            return false;
        }
        VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException = (VerificationAttemptsExceededEbsException) other;
        return jl40.l(this.exceptionCode, verificationAttemptsExceededEbsException.exceptionCode) && jl40.l(this.exceptionMessage, verificationAttemptsExceededEbsException.exceptionMessage);
    }

    public final String getExceptionCode() {
        return this.exceptionCode;
    }

    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public int hashCode() {
        return this.exceptionMessage.hashCode() + (this.exceptionCode.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return unr0.p("VerificationAttemptsExceededEbsException(exceptionCode=", this.exceptionCode, ", exceptionMessage=", this.exceptionMessage, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.exceptionCode);
        dest.writeString(this.exceptionMessage);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationAttemptsExceededEbsException> {
        @Override // android.os.Parcelable.Creator
        public final VerificationAttemptsExceededEbsException createFromParcel(Parcel parcel) {
            return new VerificationAttemptsExceededEbsException(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationAttemptsExceededEbsException[] newArray(int i) {
            return new VerificationAttemptsExceededEbsException[i];
        }
    }
}

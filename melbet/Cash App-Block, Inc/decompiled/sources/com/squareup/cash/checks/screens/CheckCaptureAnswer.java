package com.squareup.cash.checks.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.checks.screens.CheckCaptureQuestion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public interface CheckCaptureAnswer extends Parcelable {

    public final class Canceled implements CheckCaptureAnswer {
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new CheckCaptureQuestion.Creator(25);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -1524311085;
        }

        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class Failure implements CheckCaptureAnswer {
        public static final Parcelable.Creator<Failure> CREATOR = new CheckCaptureQuestion.Creator(26);
        public final CheckFace face;
        public final List warnings;

        public Failure(CheckFace checkFace, List list) {
            checkFace.getClass();
            list.getClass();
            this.face = checkFace;
            this.warnings = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.face == failure.face && Intrinsics.areEqual(this.warnings, failure.warnings);
        }

        public final int hashCode() {
            return this.warnings.hashCode() + (this.face.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(face=" + this.face + ", warnings=" + this.warnings + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.face.name());
            parcel.writeStringList(this.warnings);
        }
    }

    public final class Success implements CheckCaptureAnswer {
        public static final Parcelable.Creator<Success> CREATOR = new CheckCaptureQuestion.Creator(27);
        public final CheckFace face;
        public final ByteString imageByteString;

        public Success(CheckFace checkFace, ByteString byteString) {
            checkFace.getClass();
            byteString.getClass();
            this.face = checkFace;
            this.imageByteString = byteString;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.face == success.face && Intrinsics.areEqual(this.imageByteString, success.imageByteString);
        }

        public final int hashCode() {
            return this.imageByteString.hashCode() + (this.face.hashCode() * 31);
        }

        public final String toString() {
            return "Success(face=" + this.face + ", imageByteString=" + this.imageByteString + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.face.name());
            parcel.writeSerializable(this.imageByteString);
        }
    }
}

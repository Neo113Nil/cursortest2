package com.squareup.cash.fileupload.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class FileUploadService$Result {

    public final class Success extends FileUploadService$Result {
        public final String fileToken;

        public Success(String str) {
            str.getClass();
            this.fileToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.fileToken, ((Success) obj).fileToken);
        }

        public final String getFileToken() {
            return this.fileToken;
        }

        public final int hashCode() {
            return this.fileToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(fileToken=", this.fileToken, ")");
        }
    }

    public abstract class Failure extends FileUploadService$Result {

        public final class File extends Failure {
            public final boolean clientDetermined;
            public final FileError fileError;

            public File(FileError fileError, int i) {
                boolean z = (i & 2) == 0;
                this.fileError = fileError;
                this.clientDetermined = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof File)) {
                    return false;
                }
                File file = (File) obj;
                return this.fileError == file.fileError && this.clientDetermined == file.clientDetermined;
            }

            public final boolean getClientDetermined() {
                return this.clientDetermined;
            }

            public final FileError getFileError() {
                return this.fileError;
            }

            public final int hashCode() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.fileError.hashCode() * 31, 31, this.clientDetermined);
            }

            public final String toString() {
                return "File(fileError=" + this.fileError + ", clientDetermined=" + this.clientDetermined + ", statusCode=null)";
            }
        }

        public final class Delivery extends Failure {
            public final boolean retryable;
            public final Integer statusCode;

            public Delivery(Integer num, boolean z) {
                this.retryable = z;
                this.statusCode = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Delivery)) {
                    return false;
                }
                Delivery delivery = (Delivery) obj;
                return this.retryable == delivery.retryable && Intrinsics.areEqual(this.statusCode, delivery.statusCode);
            }

            public final boolean getRetryable() {
                return this.retryable;
            }

            public final Integer getStatusCode() {
                return this.statusCode;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.retryable) * 31;
                Integer num = this.statusCode;
                return hashCode + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                return "Delivery(retryable=" + this.retryable + ", statusCode=" + this.statusCode + ")";
            }

            public /* synthetic */ Delivery() {
                this(null, true);
            }
        }
    }
}

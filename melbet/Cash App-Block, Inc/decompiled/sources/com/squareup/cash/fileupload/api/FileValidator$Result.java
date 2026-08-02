package com.squareup.cash.fileupload.api;

/* loaded from: classes4.dex */
public abstract class FileValidator$Result {

    public final class Failure extends FileValidator$Result {
        public final FileError error;
        public final FileMetadata metadata;

        public Failure(FileError fileError, FileMetadata fileMetadata) {
            this.error = fileError;
            this.metadata = fileMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.metadata.equals(failure.metadata);
        }

        @Override // com.squareup.cash.fileupload.api.FileValidator$Result
        public final FileMetadata getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return this.metadata.hashCode() + (this.error.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(error=" + this.error + ", metadata=" + this.metadata + ")";
        }
    }

    public final class Success extends FileValidator$Result {
        public final FileMetadata metadata;

        public Success(FileMetadata fileMetadata) {
            this.metadata = fileMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.metadata.equals(((Success) obj).metadata);
        }

        @Override // com.squareup.cash.fileupload.api.FileValidator$Result
        public final FileMetadata getMetadata() {
            return this.metadata;
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }

        public final String toString() {
            return "Success(metadata=" + this.metadata + ")";
        }
    }

    public abstract FileMetadata getMetadata();
}

package androidx.camera.video;

/* loaded from: classes3.dex */
public final class FileOutputOptions {
    public final AutoValue_FileOutputOptions_FileOutputOptionsInternal mFileOutputOptionsInternal;
    public final AutoValue_FileOutputOptions_FileOutputOptionsInternal mOutputOptionsInternal;

    public FileOutputOptions(AutoValue_FileOutputOptions_FileOutputOptionsInternal autoValue_FileOutputOptions_FileOutputOptionsInternal) {
        this.mOutputOptionsInternal = autoValue_FileOutputOptions_FileOutputOptionsInternal;
        this.mFileOutputOptionsInternal = autoValue_FileOutputOptions_FileOutputOptionsInternal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileOutputOptions)) {
            return false;
        }
        return this.mFileOutputOptionsInternal.equals(((FileOutputOptions) obj).mFileOutputOptionsInternal);
    }

    public final int hashCode() {
        return this.mFileOutputOptionsInternal.hashCode();
    }

    public final String toString() {
        return this.mFileOutputOptionsInternal.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}

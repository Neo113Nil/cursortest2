package androidx.camera.video;

import java.io.File;

/* loaded from: classes3.dex */
public final class AutoValue_FileOutputOptions_FileOutputOptionsInternal {
    public final long durationLimitMillis;
    public final File file;
    public final long fileSizeLimit;

    public AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j, long j2, File file) {
        this.fileSizeLimit = j;
        this.durationLimitMillis = j2;
        this.file = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_FileOutputOptions_FileOutputOptionsInternal)) {
            return false;
        }
        AutoValue_FileOutputOptions_FileOutputOptionsInternal autoValue_FileOutputOptions_FileOutputOptionsInternal = (AutoValue_FileOutputOptions_FileOutputOptionsInternal) obj;
        return this.fileSizeLimit == autoValue_FileOutputOptions_FileOutputOptionsInternal.fileSizeLimit && this.durationLimitMillis == autoValue_FileOutputOptions_FileOutputOptionsInternal.durationLimitMillis && this.file.equals(autoValue_FileOutputOptions_FileOutputOptionsInternal.file);
    }

    public final int hashCode() {
        long j = this.fileSizeLimit;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.durationLimitMillis;
        return this.file.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * (-721379959));
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.fileSizeLimit + ", durationLimitMillis=" + this.durationLimitMillis + ", location=null, file=" + this.file + "}";
    }
}

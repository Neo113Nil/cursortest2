package com.datadog.android.core.internal.persistence;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ConsentAwareStorage$Batch {
    public final File file;
    public final File metaFile;

    public ConsentAwareStorage$Batch(File file, File file2) {
        this.file = file;
        this.metaFile = file2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentAwareStorage$Batch)) {
            return false;
        }
        ConsentAwareStorage$Batch consentAwareStorage$Batch = (ConsentAwareStorage$Batch) obj;
        return this.file.equals(consentAwareStorage$Batch.file) && Intrinsics.areEqual(this.metaFile, consentAwareStorage$Batch.metaFile);
    }

    public final int hashCode() {
        int hashCode = this.file.hashCode() * 31;
        File file = this.metaFile;
        return hashCode + (file == null ? 0 : file.hashCode());
    }

    public final String toString() {
        return "Batch(file=" + this.file + ", metaFile=" + this.metaFile + ")";
    }
}

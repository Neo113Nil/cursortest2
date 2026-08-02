package com.datadog.android.core.internal.persistence.file;

import java.io.File;

/* loaded from: classes4.dex */
public interface FileOrchestrator {
    File getMetadataFile(File file);

    File getRootDir();

    File getWritableFile();
}

package com.datadog.android.core.internal.persistence.datastore;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.google.android.filament.Box;
import java.io.File;

/* loaded from: classes10.dex */
public final class DatastoreFileWriter {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public final NdkCrashLogDeserializer dataStoreFileHelper;
    public final String featureName;
    public final Object fileReaderWriter;
    public final InternalLogger internalLogger;
    public final File storageDir;

    public DatastoreFileWriter(NdkCrashLogDeserializer ndkCrashLogDeserializer, String str, File file, InternalLogger internalLogger, Box box) {
        str.getClass();
        internalLogger.getClass();
        this.dataStoreFileHelper = ndkCrashLogDeserializer;
        this.featureName = str;
        this.storageDir = file;
        this.internalLogger = internalLogger;
        this.fileReaderWriter = box;
    }

    public DatastoreFileWriter(NdkCrashLogDeserializer ndkCrashLogDeserializer, String str, File file, InternalLogger internalLogger, PlainFileReaderWriter plainFileReaderWriter) {
        internalLogger.getClass();
        this.dataStoreFileHelper = ndkCrashLogDeserializer;
        this.featureName = str;
        this.storageDir = file;
        this.internalLogger = internalLogger;
        this.fileReaderWriter = plainFileReaderWriter;
    }
}

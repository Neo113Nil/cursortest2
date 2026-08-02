package com.squareup.cash.fileupload.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FileError {
    public static final /* synthetic */ FileError[] $VALUES;
    public static final FileError FILE_TOO_LARGE;
    public static final FileError INVALID_FILE;
    public static final FileError UNSUPPORTED_FILE_TYPE;

    static {
        FileError fileError = new FileError("INVALID_FILE", 0);
        INVALID_FILE = fileError;
        FileError fileError2 = new FileError("FILE_TOO_LARGE", 1);
        FILE_TOO_LARGE = fileError2;
        FileError fileError3 = new FileError("UNSUPPORTED_FILE_TYPE", 2);
        UNSUPPORTED_FILE_TYPE = fileError3;
        $VALUES = new FileError[]{fileError, fileError2, fileError3};
    }

    public static FileError valueOf(String str) {
        return (FileError) Enum.valueOf(FileError.class, str);
    }

    public static FileError[] values() {
        return (FileError[]) $VALUES.clone();
    }
}

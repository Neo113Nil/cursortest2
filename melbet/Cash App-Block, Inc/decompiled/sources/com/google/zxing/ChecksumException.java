package com.google.zxing;

/* loaded from: classes4.dex */
public final class ChecksumException extends ReaderException {
    public static final ChecksumException INSTANCE;

    static {
        ChecksumException checksumException = new ChecksumException();
        INSTANCE = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }
}

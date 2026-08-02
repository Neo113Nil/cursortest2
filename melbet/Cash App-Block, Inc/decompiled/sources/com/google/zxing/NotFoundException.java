package com.google.zxing;

/* loaded from: classes4.dex */
public final class NotFoundException extends ReaderException {
    public static final NotFoundException INSTANCE;

    static {
        NotFoundException notFoundException = new NotFoundException();
        INSTANCE = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    public static NotFoundException getNotFoundInstance() {
        return ReaderException.isStackTrace ? new NotFoundException() : INSTANCE;
    }
}

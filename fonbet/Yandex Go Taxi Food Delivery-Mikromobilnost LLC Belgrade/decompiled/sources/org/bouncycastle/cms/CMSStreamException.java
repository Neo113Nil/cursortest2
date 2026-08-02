package org.bouncycastle.cms;

import java.io.IOException;

/* loaded from: classes4.dex */
public class CMSStreamException extends IOException {
    private final Throwable underlying;

    public CMSStreamException(String str, CMSException cMSException) {
        super(str);
        this.underlying = cMSException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.underlying;
    }
}

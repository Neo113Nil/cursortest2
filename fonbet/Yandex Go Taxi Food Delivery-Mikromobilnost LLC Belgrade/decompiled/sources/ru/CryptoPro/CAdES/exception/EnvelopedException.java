package ru.CryptoPro.CAdES.exception;

import org.bouncycastle.cms.CMSException;

/* loaded from: classes4.dex */
public class EnvelopedException extends CMSException {
    public EnvelopedException(String str) {
        super(str);
    }

    public EnvelopedException(String str, Exception exc) {
        super(str, exc);
    }
}

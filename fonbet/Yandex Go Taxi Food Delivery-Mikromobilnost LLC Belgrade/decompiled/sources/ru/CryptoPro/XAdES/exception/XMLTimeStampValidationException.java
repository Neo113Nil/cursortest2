package ru.CryptoPro.XAdES.exception;

import defpackage.oyr;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public class XMLTimeStampValidationException extends XAdESException {
    private final List<AdESException> a;

    public XMLTimeStampValidationException(Exception exc, Integer num) {
        super(exc, num);
        this.a = new LinkedList();
    }

    public void add(AdESException adESException) {
        this.a.add(adESException);
    }

    public void clear() {
        this.a.clear();
    }

    public List<AdESException> get() {
        return Collections.unmodifiableList(this.a);
    }

    @Override // ru.CryptoPro.AdES.exception.AdESException, java.lang.Throwable
    public String toString() {
        String adESException = super.toString();
        for (AdESException adESException2 : this.a) {
            StringBuilder v = oyr.v(adESException, "{");
            v.append(adESException2.toString());
            v.append("}");
            adESException = v.toString();
        }
        return adESException;
    }

    public XMLTimeStampValidationException(Integer num) {
        super(num);
        this.a = new LinkedList();
    }

    public XMLTimeStampValidationException(String str, Exception exc, Integer num) {
        super(str, exc, num);
        this.a = new LinkedList();
    }
}

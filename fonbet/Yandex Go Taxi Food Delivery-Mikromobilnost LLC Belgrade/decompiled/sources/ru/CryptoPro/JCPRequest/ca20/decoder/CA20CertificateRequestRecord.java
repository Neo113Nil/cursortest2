package ru.CryptoPro.JCPRequest.ca20.decoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
public class CA20CertificateRequestRecord extends CA20Status {
    public String b;
    public String c;
    public Map d;

    public CA20CertificateRequestRecord(String str, String str2, String str3, Map map) {
        super(str3);
        new HashMap();
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public String getCertRequestId() {
        return this.b;
    }

    public Map getOtherFields() {
        return this.d;
    }

    public String getUserId() {
        return this.c;
    }

    public void setCertRequestId(String str) {
        this.b = str;
    }

    public void setOtherFields(Map map) {
        this.d = map;
    }

    public void setUserId(String str) {
        this.c = str;
    }

    @Override // ru.CryptoPro.JCPRequest.ca20.status.CA20Status
    public String toString() {
        StringBuilder sb = new StringBuilder("certificate request id: ");
        sb.append(this.b);
        sb.append(", user id: ");
        sb.append(this.c);
        sb.append(", status: ");
        sb.append(this.a);
        Iterator it = this.d.entrySet().iterator();
        String str = ", [";
        while (true) {
            sb.append(str);
            if (!it.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(Extension.COLON_SPACE);
            sb.append((String) entry.getValue());
            str = Extension.FIX_SPACE;
        }
    }
}

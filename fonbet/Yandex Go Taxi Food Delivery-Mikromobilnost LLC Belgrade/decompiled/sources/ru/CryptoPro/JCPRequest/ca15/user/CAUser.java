package ru.CryptoPro.JCPRequest.ca15.user;

import java.util.Iterator;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public class CAUser {
    public static final CAUser NULL = new CAUser();
    public String a;
    public String b;
    public final Map c;

    public CAUser(Map map) {
        this.a = null;
        this.b = null;
        this.c = map;
    }

    public String getPassword() {
        return this.b;
    }

    public String getTokenID() {
        return this.a;
    }

    public boolean isCA20() {
        return false;
    }

    public boolean isCertAuthorization() {
        return false;
    }

    public void setPassword(String str) {
        this.b = str;
    }

    public void setTokenID(String str) {
        this.a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("tokenID: ");
        sb.append(this.a);
        sb.append(", password: ");
        sb.append(this.b);
        Map map = this.c;
        if (map != null) {
            sb.append(", [");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb.append(Extension.FIX_SPACE);
                }
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public CAUser(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public CAUser() {
        this.a = null;
        this.b = null;
    }
}

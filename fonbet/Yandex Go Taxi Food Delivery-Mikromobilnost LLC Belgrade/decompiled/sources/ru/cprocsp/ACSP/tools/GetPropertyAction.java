package ru.cprocsp.ACSP.tools;

import java.security.PrivilegedAction;
import java.security.Security;

/* loaded from: classes4.dex */
public class GetPropertyAction implements PrivilegedAction {
    private String defaultVal;
    private String theProp;
    private boolean theSecurity;

    public GetPropertyAction(String str, String str2, boolean z) {
        this.theProp = str;
        this.defaultVal = str2;
        this.theSecurity = z;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        boolean z = this.theSecurity;
        String str = this.theProp;
        String property = z ? Security.getProperty(str) : System.getProperty(str);
        return property == null ? this.defaultVal : property;
    }

    public GetPropertyAction(String str, boolean z) {
        this.theProp = str;
        this.theSecurity = z;
    }
}

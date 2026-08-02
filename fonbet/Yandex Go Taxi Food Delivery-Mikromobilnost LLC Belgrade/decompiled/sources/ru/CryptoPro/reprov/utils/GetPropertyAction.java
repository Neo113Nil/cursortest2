package ru.CryptoPro.reprov.utils;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public class GetPropertyAction implements PrivilegedAction {
    public final String a;
    public final String b;

    public GetPropertyAction(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        String property = System.getProperty(this.a);
        return property == null ? this.b : property;
    }

    public GetPropertyAction(String str) {
        this.a = str;
    }
}

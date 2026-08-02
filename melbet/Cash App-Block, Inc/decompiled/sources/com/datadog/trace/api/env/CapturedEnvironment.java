package com.datadog.trace.api.env;

import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class CapturedEnvironment {
    public static final CapturedEnvironment INSTANCE = new CapturedEnvironment();
    public final HashMap properties;

    public CapturedEnvironment() {
        HashMap hashMap = new HashMap();
        this.properties = hashMap;
        String str = System.getenv("DD_AZURE_APP_SERVICES");
        String str2 = System.getenv("WEBSITE_SITE_NAME");
        if ((!"true".equalsIgnoreCase(str) && !"1".equals(str)) || str2 == null) {
            String property = System.getProperty("sun.java.command");
            if (property != null && !property.equals("")) {
                String[] split = property.trim().split(" ");
                if (split.length != 0 && !split[0].equals("")) {
                    String str3 = split[0];
                    str2 = str3.endsWith(".jar") ? new File(str3).getName().replace(".jar", "") : str3;
                }
            }
            str2 = null;
        }
        hashMap.put("service.name", str2);
    }
}

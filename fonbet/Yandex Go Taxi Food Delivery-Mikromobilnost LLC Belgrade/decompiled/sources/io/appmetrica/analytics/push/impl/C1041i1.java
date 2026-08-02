package io.appmetrica.analytics.push.impl;

import defpackage.ny61;

/* renamed from: io.appmetrica.analytics.push.impl.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1041i1 {
    public String a;

    public final String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            String str2 = (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
            this.a = str2;
            return str2;
        } catch (Exception e) {
            ny61.j(e);
            return null;
        }
    }
}

package com.yandex.metrica.push.utils;

import defpackage.b6e;

/* loaded from: classes3.dex */
public class d {
    private String a;

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
        } catch (Exception e) {
            b6e.q(e);
            return null;
        }
    }

    public String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        String a = a();
        this.a = a;
        return a;
    }
}

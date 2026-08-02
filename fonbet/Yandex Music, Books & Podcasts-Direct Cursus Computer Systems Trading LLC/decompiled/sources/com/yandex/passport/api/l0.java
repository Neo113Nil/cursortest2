package com.yandex.passport.api;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes4.dex */
public final class l0 {
    public static o0 a(int i, Intent intent) {
        String str;
        Bundle extras;
        Object obj;
        Bundle extras2;
        Object obj2;
        com.yandex.passport.api.exception.j jVar = null;
        jVar = null;
        if (i != -1) {
            if (i != 2) {
                return new m0(null);
            }
            if (intent != null && (extras2 = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = extras2.getSerializable("EXTRA_EXCEPTION", com.yandex.passport.api.exception.j.class);
                } else {
                    Object serializable = extras2.getSerializable("EXTRA_EXCEPTION");
                    obj2 = (com.yandex.passport.api.exception.j) (serializable instanceof com.yandex.passport.api.exception.j ? serializable : null);
                }
                jVar = (com.yandex.passport.api.exception.j) obj2;
            }
            return new m0(jVar);
        }
        if (intent == null || (extras = intent.getExtras()) == null) {
            str = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("EXTRA_TASK_ID", String.class);
            } else {
                Object serializable2 = extras.getSerializable("EXTRA_TASK_ID");
                if (!(serializable2 instanceof String)) {
                    serializable2 = null;
                }
                obj = (String) serializable2;
            }
            str = (String) obj;
        }
        return str != null ? new n0(str) : new m0(null);
    }
}

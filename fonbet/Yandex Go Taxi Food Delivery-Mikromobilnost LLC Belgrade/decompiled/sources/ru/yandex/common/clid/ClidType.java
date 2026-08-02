package ru.yandex.common.clid;

import android.content.Intent;
import defpackage.aez;

/* loaded from: classes4.dex */
public class ClidType {
    public static final String TAG = "[YSearch:ClidType]";
    private static String type = ClidManager.CLID_APPLICATION;
    private static String clid = null;

    private ClidType() {
    }

    public static String getClid() {
        aez.c();
        return clid;
    }

    public static String getType() {
        aez.c();
        return type;
    }

    public static void setClid(String str) {
        aez.c();
        clid = str;
        type = ClidManager.EXTRA_SHELL_CLID;
    }

    public static void setFromIntent(Intent intent) {
        String stringExtra = intent.getStringExtra(ClidManager.EXTRA_SHELL_CLID);
        if (stringExtra != null) {
            setClid(stringExtra);
            return;
        }
        String stringExtra2 = intent.getStringExtra(ClidManager.EXTRA_CLID_TYPE);
        if (stringExtra2 == null) {
            stringExtra2 = ClidManager.CLID_APPLICATION;
        }
        setType(stringExtra2);
    }

    public static void setType(String str) {
        aez.c();
        type = str;
    }
}

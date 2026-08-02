package com.yandex.metrica.push.common.utils;

import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import defpackage.ouj;
import defpackage.tlm;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class BaseLogger {
    protected volatile boolean isEnabled = false;

    @NonNull
    private String a(@NonNull String str, Object[] objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 5; i < stackTrace.length; i++) {
            Class<? super Object> superclass = stackTrace[i].getClass().getSuperclass();
            if (superclass == null || !superclass.equals(BaseLogger.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder m = tlm.m(substring.substring(substring.lastIndexOf(36) + 1), ".");
                m.append(stackTrace[i].getMethodName());
                str2 = m.toString();
                break;
            }
        }
        str2 = "<unknown>";
        Locale locale = Locale.US;
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder("[");
        sb.append(myPid);
        sb.append("/");
        sb.append(id);
        return ouj.q(sb, "] ", str2, ": ", str);
    }

    @NonNull
    private String b(String str, Object[] objArr) {
        return a() + a(a(str), objArr);
    }

    public abstract String a();

    public abstract String b();

    public void log(int i, Throwable th, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i, b(), b(str, objArr) + StringUtil.LF + Log.getStackTraceString(th));
        }
    }

    public boolean shouldLog() {
        return this.isEnabled;
    }

    public void log(int i, String str, Object... objArr) {
        if (shouldLog()) {
            Log.println(i, b(), b(str, objArr));
        }
    }

    @NonNull
    private String a(String str) {
        return str == null ? "" : str;
    }
}

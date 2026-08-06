package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class Hn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Gn a(Throwable th, int i2, int i3) {
        StackTraceElement[] stackTraceElementArr;
        Gn gn;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList2.add(new Dl(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i3 >= i2) {
                cause = null;
            }
            if (cause != null) {
                gn = a(cause, 30, i3 + 1);
                if (i3 >= i2) {
                    Throwable[] suppressed = th.getSuppressed();
                    arrayList = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        arrayList.add(a(th2, 1, i3));
                    }
                } else {
                    arrayList = null;
                }
                return new Gn(name, message, arrayList2, gn, arrayList);
            }
        }
        gn = null;
        if (i3 >= i2) {
        }
        return new Gn(name, message, arrayList2, gn, arrayList);
    }
}

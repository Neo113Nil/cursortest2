package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class o extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final r f2488a;

    /* renamed from: b, reason: collision with root package name */
    public r f2489b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2490c;

    public o(Context context, r rVar, Context context2) {
        super(context);
        this.f2488a = rVar;
        this.f2490c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"window".equals(str)) {
            return super.getSystemService(str);
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (int i2 = 0; i2 < stackTrace.length && i2 < 11; i2++) {
            if (stackTrace[i2].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i2].getMethodName().equals("<init>")) {
                return this.f2490c.getSystemService(str);
            }
        }
        if (this.f2489b == null) {
            this.f2489b = this.f2488a;
        }
        return this.f2489b;
    }
}

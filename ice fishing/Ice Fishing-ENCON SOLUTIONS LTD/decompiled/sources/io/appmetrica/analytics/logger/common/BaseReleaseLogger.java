package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import io.appmetrica.analytics.logger.common.impl.a;
import io.appmetrica.analytics.logger.common.impl.b;
import io.appmetrica.analytics.logger.common.impl.c;
import io.appmetrica.analytics.logger.common.impl.d;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f7360d = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f7361a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f7362b = false;

    /* renamed from: c, reason: collision with root package name */
    private final c f7363c;

    public BaseReleaseLogger(String str, String str2) {
        this.f7363c = new c(new d(str), new a(), new b());
        this.f7361a = str2;
    }

    public static void init(Context context) {
        f7360d = "[" + context.getPackageName() + "] : ";
    }

    public void error(String str, Object... objArr) {
        if (this.f7362b) {
            c cVar = this.f7363c;
            String prefix = getPrefix();
            cVar.f7366b.getClass();
            Iterator it = cVar.f7367c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f7365a.f7368a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    public String getPrefix() {
        return f7360d + this.f7361a;
    }

    public void info(String str, Object... objArr) {
        if (this.f7362b) {
            c cVar = this.f7363c;
            String prefix = getPrefix();
            cVar.f7366b.getClass();
            Iterator it = cVar.f7367c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f7365a.f7368a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z2) {
        this.f7362b = z2;
    }

    public void warning(String str, Object... objArr) {
        if (this.f7362b) {
            c cVar = this.f7363c;
            String prefix = getPrefix();
            cVar.f7366b.getClass();
            Iterator it = cVar.f7367c.a(a.a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f7365a.f7368a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(Throwable th, String str, Object... objArr) {
        if (this.f7362b) {
            c cVar = this.f7363c;
            String prefix = getPrefix();
            cVar.f7366b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Iterator it = cVar.f7367c.a(a.a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = cVar.f7365a.f7368a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}

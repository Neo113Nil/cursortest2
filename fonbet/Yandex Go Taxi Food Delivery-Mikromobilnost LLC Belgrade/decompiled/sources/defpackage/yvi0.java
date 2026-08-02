package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.view.ContextThemeWrapper;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.yandex.go.flex.main_screen.routers.c;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.y;
import flex.logger.FlexLogLevel;
import flex.network.cache.utils.CachePathNotUpdatedException;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import ru.domesticroots.certificatetransparency.loglist.a;
import ru.yandex.taxi.am.v;

/* loaded from: classes.dex */
public final class yvi0 implements ie2, rr3, a18, d9i0, bnj, r1o, jpg, v900, h030, hr20, q780 {
    public static final Object b = new Object();
    public static volatile yvi0 c;
    public Object a;

    public yvi0(uo11 uo11Var) {
        this.a = new am2(uo11Var);
    }

    public static String q(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, -1);
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String format = simpleDateFormat.format(time);
        return new Regex("expires=[^;]*").j(str, "expires=" + format);
    }

    public static yvi0 s() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        yvi0 yvi0Var = new yvi0();
                        yvi0Var.a = new ConcurrentHashMap();
                        c = yvi0Var;
                    }
                } finally {
                }
            }
        }
        yvi0 yvi0Var2 = c;
        cvw.l(yvi0Var2);
        return yvi0Var2;
    }

    @Override // defpackage.rr3
    public void B() {
    }

    @Override // defpackage.ie2
    public boolean Bc() {
        ArrayList arrayList = (ArrayList) this.a;
        return arrayList.size() == 1 && ((rkx) arrayList.get(0)).c();
    }

    @Override // defpackage.ie2
    public i35 I() {
        ArrayList arrayList = (ArrayList) this.a;
        return ((rkx) arrayList.get(0)).c() ? new qud0(arrayList, 0) : new xq90(arrayList);
    }

    @Override // defpackage.ie2
    public List Nb() {
        return (ArrayList) this.a;
    }

    @Override // defpackage.d9i0
    public dyg a(String str, InputStream inputStream, tls tlsVar) {
        StackTraceElement stackTraceElement;
        String str2;
        Integer valueOf;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        StackTraceElement stackTraceElement3;
        String num3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dyg dygVar = (dyg) tlsVar.invoke(new zoe(inputStream, byteArrayOutputStream));
        if (dygVar instanceof cyg) {
            jb7 jb7Var = (jb7) this.a;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            String str3 = "No line info";
            EmptyList emptyList = EmptyList.a;
            zjr zjrVar = (zjr) jb7Var.b;
            rjr rjrVar = zjrVar.c;
            tjr tjrVar = tjr.d;
            try {
                ((jb7) ((vg7) jb7Var.c).invoke(new fe7(str))).w(byteArray);
                return dygVar;
            } catch (CachePathNotUpdatedException e) {
                i3y f = jb7.f(str, e);
                s7s0 s7s0Var = rjrVar.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement3 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement3.getFileName();
                    str2 = fileName != null ? fileName : "No file info";
                    String methodName = stackTraceElement3.getMethodName();
                    int lineNumber = stackTraceElement3.getLineNumber();
                    valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                    if (valueOf != null && (num3 = valueOf.toString()) != null) {
                        str3 = num3;
                    }
                    tjrVar = new tjr(str2, methodName, str3);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Failed to save a path to cache file", f, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            } catch (IOException e2) {
                i3y f2 = jb7.f(str, e2);
                s7s0 s7s0Var2 = rjrVar.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName2 = stackTraceElement2.getFileName();
                    str2 = fileName2 != null ? fileName2 : "No file info";
                    String methodName2 = stackTraceElement2.getMethodName();
                    int lineNumber2 = stackTraceElement2.getLineNumber();
                    valueOf = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                    if (valueOf != null && (num2 = valueOf.toString()) != null) {
                        str3 = num2;
                    }
                    tjrVar = new tjr(str2, methodName2, str3);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "Failed to save data to cache in storage", f2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            } catch (Throwable th) {
                i3y f3 = jb7.f(str, th);
                s7s0 s7s0Var3 = rjrVar.a;
                if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName3 = stackTraceElement.getFileName();
                    str2 = fileName3 != null ? fileName3 : "No file info";
                    String methodName3 = stackTraceElement.getMethodName();
                    int lineNumber3 = stackTraceElement.getLineNumber();
                    valueOf = lineNumber3 > 0 ? Integer.valueOf(lineNumber3) : null;
                    if (valueOf != null && (num = valueOf.toString()) != null) {
                        str3 = num;
                    }
                    tjrVar = new tjr(str2, methodName3, str3);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "An error occurred while saving instance to DataStorage", f3, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            }
        }
        return dygVar;
    }

    @Override // defpackage.jpg
    public Object b(ContinuationImpl continuationImpl) {
        a aVar = (a) this.a;
        try {
            ((y97) aVar.a.a).getClass();
            return new m9i0(aVar.a(), null);
        } catch (Exception e) {
            return geb1.e(e) ? k9i0.a : new j9i0(e);
        }
    }

    @Override // defpackage.v900
    public u900 c(k4w0 k4w0Var) {
        r900 r900Var = (r900) this.a;
        d3g d3gVar = r900Var.b;
        if (d3gVar == null) {
            synchronized (r900Var) {
                d3gVar = r900Var.b;
                if (d3gVar == null) {
                    i6r i6rVar = r900Var.a;
                    i6rVar.getClass();
                    d3g d3gVar2 = new d3g(new t800(), i6rVar, k4w0Var);
                    r900Var.b = d3gVar2;
                    d3gVar = d3gVar2;
                }
            }
        }
        com.yandex.go.flex.main_screen.jason_state.a aVar = (com.yandex.go.flex.main_screen.jason_state.a) d3gVar.e.get();
        mbw0 mbw0Var = (mbw0) ((c0g) d3gVar.a).Os.get();
        q5z.h(mbw0Var);
        return new c(aVar, new nbw0(mbw0Var), i5m.a(d3gVar.f), d3gVar.Q0);
    }

    @Override // defpackage.d9i0
    public void clear() {
        ((ou) ((jb7) this.a).w).invoke();
    }

    @Override // defpackage.jpg
    public Object d(Object obj, Continuation continuation) {
        return Boolean.valueOf(((n9i0) obj) instanceof m9i0);
    }

    @Override // defpackage.d9i0
    public void e(String str) {
        StackTraceElement stackTraceElement;
        String str2;
        jb7 jb7Var = (jb7) this.a;
        try {
            ((jb7) ((jb7) ((vg7) jb7Var.c).invoke(new fe7(str))).b).c();
        } catch (Throwable th) {
            zjr zjrVar = (zjr) jb7Var.b;
            i3y f = jb7.f(str, th);
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf == null || (str2 = valueOf.toString()) == null) {
                    str2 = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str2);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "An error occurred while removing instance from DataStorage", f, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        }
    }

    @Override // defpackage.a18
    public void f(Typeface typeface) {
        hbc hbcVar = (hbc) this.a;
        if (hbcVar.t(typeface)) {
            hbcVar.l(false);
        }
    }

    @Override // defpackage.q780
    public void g(TaxiOrder taxiOrder) {
        y yVar = (y) this.a;
        if (!yVar.c.b(true) || yVar.l.a()) {
            yVar.d.b.i(taxiOrder, 0L);
        }
    }

    @Override // defpackage.hr20
    public String get(String str) {
        return ((kvj0) this.a).y.a(str);
    }

    @Override // defpackage.bnj
    public void h(smj smjVar) {
        ((zwf0) this.a).e("DummyDirectiveHandler", "Drop directive " + dnj.a(smjVar.b()) + " in handler DirectiveHandlerName(rawValue=QuarkGoCapability_DirectiveHandler)");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cd  */
    @Override // defpackage.d9i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(tls tlsVar, String str) {
        StackTraceElement stackTraceElement;
        String str2;
        String num;
        BufferedInputStream bufferedInputStream;
        StackTraceElement stackTraceElement2;
        String num2;
        jb7 jb7Var = (jb7) this.a;
        String str3 = "No line info";
        EmptyList emptyList = EmptyList.a;
        zjr zjrVar = (zjr) jb7Var.b;
        rjr rjrVar = zjrVar.c;
        tjr tjrVar = tjr.d;
        try {
            bufferedInputStream = ((jb7) ((vg7) jb7Var.c).invoke(new fe7(str))).o();
        } catch (IOException e) {
            i3y f = jb7.f(str, e);
            s7s0 s7s0Var = rjrVar.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                str2 = fileName != null ? fileName : "No file info";
                String methodName = stackTraceElement2.getMethodName();
                int lineNumber = stackTraceElement2.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str3 = num2;
                }
                tjrVar = new tjr(str2, methodName, str3);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "Failed to find correct cache file or open stream", f, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            bufferedInputStream = null;
            if (bufferedInputStream == null) {
            }
        } catch (Throwable th) {
            i3y f2 = jb7.f(str, th);
            s7s0 s7s0Var2 = rjrVar.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement.getFileName();
                str2 = fileName2 != null ? fileName2 : "No file info";
                String methodName2 = stackTraceElement.getMethodName();
                int lineNumber2 = stackTraceElement.getLineNumber();
                Integer valueOf2 = Integer.valueOf(lineNumber2);
                if (lineNumber2 <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                    str3 = num;
                }
                tjrVar = new tjr(str2, methodName2, str3);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "An error occurred while obtaining stream from storage", f2, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
            bufferedInputStream = null;
            if (bufferedInputStream == null) {
            }
        }
        if (bufferedInputStream == null) {
            return null;
        }
        return tlsVar.invoke(bufferedInputStream);
    }

    @Override // defpackage.jpg
    public ru.domesticroots.certificatetransparency.datasource.a j(yvi0 yvi0Var) {
        return new ru.domesticroots.certificatetransparency.datasource.a(this, yvi0Var);
    }

    @Override // defpackage.jpg
    public /* bridge */ /* synthetic */ Object k(Object obj, ContinuationImpl continuationImpl) {
        return zy11.a;
    }

    public synchronized void l(ijx ijxVar) {
        hlx p;
        synchronized (this) {
            p = p(nri0.d(ijxVar), ijxVar.B());
        }
        flx flxVar = (flx) this.a;
        flxVar.e();
        ilx.y((ilx) flxVar.b, p);
    }

    @Override // defpackage.bnj
    public Set m() {
        return EmptySet.a;
    }

    @Override // defpackage.r1o
    public Object n(String str) {
        j2o j2oVar = (j2o) this.a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return j2oVar.a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return j2oVar.a(str, null);
    }

    public boolean o(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return x(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    public synchronized hlx p(bix bixVar, OutputPrefixType outputPrefixType) {
        int a;
        synchronized (this) {
            a = rw21.a();
            while (v(a)) {
                a = rw21.a();
            }
        }
        return (hlx) r1.b();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        glx G = hlx.G();
        G.e();
        hlx.x((hlx) G.b, bixVar);
        G.e();
        hlx.A((hlx) G.b, a);
        KeyStatusType keyStatusType = KeyStatusType.ENABLED;
        G.e();
        hlx.z((hlx) G.b, keyStatusType);
        G.e();
        hlx.y((hlx) G.b, outputPrefixType);
        return (hlx) G.b();
    }

    @Override // defpackage.rr3
    public void r() {
        ((v) this.a).e.a.g(zy11.a);
    }

    public synchronized jb7 t() {
        return jb7.g((ilx) ((flx) this.a).b());
    }

    public Object u(ContinuationImpl continuationImpl) {
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.a;
        String uuid = AppMetricaYandex.getUuid(contextThemeWrapper);
        if (uuid != null) {
            return uuid;
        }
        kol0 kol0Var = new kol0(dvw.b(continuationImpl));
        AppMetricaYandex.requestStartupParams(contextThemeWrapper, new nc20(kol0Var), "appmetrica_uuid");
        Object a = kol0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public synchronized boolean v(int i) {
        Iterator it = Collections.unmodifiableList(((ilx) ((flx) this.a).b).B()).iterator();
        while (it.hasNext()) {
            if (((hlx) it.next()).C() == i) {
                return true;
            }
        }
        return false;
    }

    public void w(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if ((serviceConnection instanceof rjb1) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public boolean x(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((nb51.a(context).b(0, component.getPackageName()).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof rjb1) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public /* synthetic */ yvi0(Object obj) {
        this.a = obj;
    }
}

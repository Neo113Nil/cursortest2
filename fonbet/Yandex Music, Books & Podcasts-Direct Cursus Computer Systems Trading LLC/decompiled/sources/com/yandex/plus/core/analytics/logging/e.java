package com.yandex.plus.core.analytics.logging;

import android.os.Looper;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.analytics.o;
import defpackage.btf;
import defpackage.dfi;
import defpackage.jk6;
import defpackage.jyr;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class e {
    public static jk6 b;
    public static final jyr a = btf.b(new com.yandex.plus.bdui.plus.shared.serializer.d(2));
    public static final jyr c = btf.b(new com.yandex.plus.bdui.plus.shared.serializer.d(3));
    public static final jyr d = btf.b(new com.yandex.plus.bdui.plus.shared.serializer.d(4));

    public static d a(b bVar) {
        return new d(new com.yandex.plus.bdui.plus.webview.navigation.a(2), bVar);
    }

    public static final void b(b bVar, String str) {
        e(a.a, bVar, str, null);
    }

    public static UUID c() {
        Object value = a.getValue();
        value.getClass();
        return (UUID) value;
    }

    public static final void d(b bVar, String str) {
        e(a.c, bVar, str, null);
    }

    public static void e(a aVar, b bVar, String str, Throwable th) {
        StackTraceElement[] stackTrace;
        int i;
        String str2;
        String str3;
        int i2;
        Object obj;
        LinkedList linkedList;
        Thread thread;
        String name = bVar.name();
        name.getClass();
        Thread currentThread = Thread.currentThread();
        if (th != null) {
            stackTrace = th.getStackTrace();
            stackTrace.getClass();
            i = 0;
        } else {
            stackTrace = currentThread.getStackTrace();
            stackTrace.getClass();
            i = 7;
        }
        if (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            str2 = stackTraceElement.getClassName();
            str2.getClass();
            str3 = stackTraceElement.getMethodName();
            str3.getClass();
            i2 = stackTraceElement.getLineNumber();
        } else {
            str2 = "no_class";
            str3 = "no_method_name";
            i2 = -1;
        }
        String str4 = str2 + ':' + i2;
        Looper mainLooper = Looper.getMainLooper();
        String name2 = (mainLooper == null || (thread = mainLooper.getThread()) == null || currentThread.getId() != thread.getId()) ? currentThread.getName() : "Main";
        String format = ((SimpleDateFormat) d.getValue()).format(Calendar.getInstance().getTime());
        Pair pair = new Pair("session_id", c());
        Pair pair2 = new Pair("timestamp", format);
        String lowerCase = name.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Pair pair3 = new Pair("tag", lowerCase);
        Pair pair4 = new Pair("level", aVar.name());
        int i3 = i2;
        Pair pair5 = new Pair("raw_level", Integer.valueOf(aVar.ordinal()));
        StringBuilder k = dfi.k(str);
        if (th != null) {
            obj = "session_id";
            k.append(", error=" + th);
        } else {
            obj = "session_id";
        }
        Pair pair6 = new Pair(Constants.KEY_MESSAGE, k.toString());
        Pair pair7 = new Pair(SSDPDeviceDescriptionParser.TAG_LOCATION, str4);
        Pair pair8 = new Pair("function", str3);
        Pair pair9 = new Pair("thread", name2);
        jyr jyrVar = g.a;
        Integer num = (Integer) ((ThreadLocal) jyrVar.getValue()).get();
        int intValue = num != null ? num.intValue() : 0;
        ((ThreadLocal) jyrVar.getValue()).set(Integer.valueOf(intValue + 1));
        String str5 = str3;
        Object obj2 = obj;
        LinkedHashMap v = r1.v(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("thread_sequence", Integer.valueOf(intValue)), new Pair(CommonUrlParts.REQUEST_ID, null));
        o oVar = (o) c.getValue();
        if (oVar != null) {
            oVar.reportStatboxEvent("CommonLogger", v);
        }
        int i4 = f.a;
        c cVar = new c(String.valueOf(v.get(obj2)), String.valueOf(v.get("timestamp")), String.valueOf(v.get("tag")), String.valueOf(v.get("level")), String.valueOf(v.get("raw_level")), String.valueOf(v.get(Constants.KEY_MESSAGE)), String.valueOf(v.get(SSDPDeviceDescriptionParser.TAG_LOCATION)), String.valueOf(v.get("function")), String.valueOf(v.get("thread")), String.valueOf(v.get("thread_sequence")));
        ReentrantLock reentrantLock = f.b;
        reentrantLock.lock();
        while (true) {
            try {
                linkedList = f.c;
                if (linkedList.size() < f.a) {
                    break;
                } else {
                    linkedList.remove();
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        linkedList.add(cVar);
        reentrantLock.unlock();
        if (aVar == a.f) {
            Timber.INSTANCE.tag(str2).wtf("%s at %s():%s", str, str5, Integer.valueOf(i3));
        } else {
            Timber.INSTANCE.tag(str2).d("%s at %s():%s", str, str5, Integer.valueOf(i3));
        }
    }

    public static final void f(String str) {
        e(a.b, b.a, str, null);
    }
}

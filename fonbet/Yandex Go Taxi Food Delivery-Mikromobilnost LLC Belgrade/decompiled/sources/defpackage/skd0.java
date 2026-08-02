package defpackage;

import android.os.Looper;
import com.yandex.plus.core.analytics.logging.PlusLogLevel;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.a;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class skd0 {
    public static sls b;
    public static final i3y a = a.a(new mlc0(13));
    public static final i3y c = a.a(new mlc0(14));
    public static final i3y d = a.a(new mlc0(15));

    public static rkd0 a(PlusLogTag plusLogTag) {
        return new rkd0(0, new qda0(14), plusLogTag);
    }

    public static final void b(PlusLogTag plusLogTag, String str) {
        f(PlusLogLevel.DEBUG, plusLogTag, str, null);
    }

    public static final void c(PlusLogTag plusLogTag, String str, Throwable th) {
        f(PlusLogLevel.ERROR, plusLogTag, str, th);
    }

    public static UUID d() {
        return (UUID) a.getValue();
    }

    public static final void e(PlusLogTag plusLogTag, String str) {
        f(PlusLogLevel.INFO, plusLogTag, str, null);
    }

    public static void f(PlusLogLevel plusLogLevel, PlusLogTag plusLogTag, String str, Throwable th) {
        StackTraceElement[] stackTrace;
        int i;
        String str2;
        String str3;
        int i2;
        Object obj;
        LinkedList linkedList;
        Thread thread;
        String name = plusLogTag.name();
        Thread currentThread = Thread.currentThread();
        if (th != null) {
            stackTrace = th.getStackTrace();
            i = 0;
        } else {
            stackTrace = currentThread.getStackTrace();
            i = 7;
        }
        if (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            str2 = stackTraceElement.getClassName();
            str3 = stackTraceElement.getMethodName();
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
        Pair pair = new Pair("session_id", d());
        Pair pair2 = new Pair(ClidProvider.TIMESTAMP, format);
        Pair pair3 = new Pair("tag", name.toLowerCase(Locale.ROOT));
        Pair pair4 = new Pair("level", plusLogLevel.name());
        int i3 = i2;
        Pair pair5 = new Pair("raw_level", Integer.valueOf(plusLogLevel.ordinal()));
        StringBuilder t = qv10.t(str);
        if (th != null) {
            obj = "session_id";
            t.append(", error=" + th);
        } else {
            obj = "session_id";
        }
        Pair pair6 = new Pair(Constants.KEY_MESSAGE, t.toString());
        Pair pair7 = new Pair("location", str4);
        Pair pair8 = new Pair("function", str3);
        Pair pair9 = new Pair("thread", name2);
        i3y i3yVar = dyy0.a;
        Integer num = (Integer) ((ThreadLocal) i3yVar.getValue()).get();
        int intValue = num != null ? num.intValue() : 0;
        ((ThreadLocal) i3yVar.getValue()).set(Integer.valueOf(intValue + 1));
        String str5 = str3;
        Object obj2 = obj;
        LinkedHashMap b2 = aob1.b(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("thread_sequence", Integer.valueOf(intValue)), new Pair("request_id", null));
        b3u0 b3u0Var = (b3u0) c.getValue();
        if (b3u0Var != null) {
            b3u0Var.reportStatboxEvent("CommonLogger", b2);
        }
        int i4 = sop0.a;
        pkd0 pkd0Var = new pkd0(String.valueOf(b2.get(obj2)), String.valueOf(b2.get(ClidProvider.TIMESTAMP)), String.valueOf(b2.get("tag")), String.valueOf(b2.get("level")), String.valueOf(b2.get("raw_level")), String.valueOf(b2.get(Constants.KEY_MESSAGE)), String.valueOf(b2.get("location")), String.valueOf(b2.get("function")), String.valueOf(b2.get("thread")), String.valueOf(b2.get("thread_sequence")));
        ReentrantLock reentrantLock = sop0.b;
        reentrantLock.lock();
        while (true) {
            try {
                linkedList = sop0.c;
                if (linkedList.size() < sop0.a) {
                    break;
                } else {
                    linkedList.remove();
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        linkedList.add(pkd0Var);
        reentrantLock.unlock();
        if (plusLogLevel == PlusLogLevel.ASSERT) {
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(str2);
            d5z0Var.q("%s at %s():%s", str, str5, Integer.valueOf(i3));
        } else {
            d5z0 d5z0Var2 = h5z0.a;
            d5z0Var2.t(str2);
            d5z0Var2.a("%s at %s():%s", str, str5, Integer.valueOf(i3));
        }
    }

    public static final void g(PlusLogTag plusLogTag, String str) {
        f(PlusLogLevel.VERBOSE, plusLogTag, str, null);
    }

    public static final void h(PlusLogTag plusLogTag, String str, Throwable th) {
        f(PlusLogLevel.WARNING, plusLogTag, str, th);
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.Exchanger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public abstract class mal {
    public static final jyr a = btf.b(new aok(15));
    public static final jyr b = btf.b(new aok(16));
    public static final jyr c = btf.b(new aok(17));
    public static final jyr d = btf.b(new aok(18));
    public static final jyr e = btf.b(new aok(19));

    public static final void a() {
        StackTraceElement stackTraceElement;
        if (Looper.myLooper() != c()) {
            Exception exc = new Exception();
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String str = null;
            if (stackTrace.length >= 3) {
                String className = stackTrace[0].getClassName();
                String className2 = stackTrace[1].getClassName();
                int length = stackTrace.length;
                for (int i = 0; i < length; i++) {
                    stackTraceElement = stackTrace[i];
                    if (!Intrinsics.d(stackTraceElement.getClassName(), className2) && !Intrinsics.d(stackTraceElement.getClassName(), className)) {
                        break;
                    }
                }
            }
            stackTraceElement = null;
            if (stackTraceElement != null) {
                String className3 = stackTraceElement.getClassName();
                className3.getClass();
                str = StringsKt.l0('.', className3, className3) + "." + stackTraceElement.getMethodName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber();
            }
            Assertions.throwOrSkip("SharedPlayerThread", new FailedAssertionException(hrg.r("Called ", str, " on invalid thread ", Thread.currentThread().getName()), exc));
        }
    }

    public static final a b() {
        return (a) e.getValue();
    }

    public static final Looper c() {
        Object value = b.getValue();
        value.getClass();
        return (Looper) value;
    }

    public static final Object d(Function0 function0) {
        if (Looper.myLooper() == c()) {
            return function0.invoke();
        }
        Exchanger exchanger = new Exchanger();
        ((Handler) c.getValue()).postAtFrontOfQueue(new zvh(14, exchanger, function0));
        return exchanger.exchange(null);
    }
}

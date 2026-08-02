package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes5.dex */
public abstract class dar {
    public static final StackTraceElement a;
    public static final String b;
    public static final String c;

    static {
        Object t7oVar;
        Object t7oVar2;
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE._BOUNDARY", "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            r7o r7oVar = z7o.b;
            t7oVar = kq2.class.getCanonicalName();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) != null) {
            t7oVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) t7oVar;
        try {
            t7oVar2 = dar.class.getCanonicalName();
        } catch (Throwable th2) {
            r7o r7oVar3 = z7o.b;
            t7oVar2 = new t7o(th2);
        }
        if (z7o.a(t7oVar2) != null) {
            t7oVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) t7oVar2;
    }

    public static final Throwable a(Throwable th, om6 om6Var) {
        Pair pair;
        Throwable cause = th.getCause();
        int i = 0;
        if (cause != null && cause.getClass().equals(th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    pair = new Pair(th, new StackTraceElement[0]);
                    break;
                }
                if (c.v(stackTrace[i2].getClassName(), "_COROUTINE", false)) {
                    pair = new Pair(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            pair = new Pair(th, new StackTraceElement[0]);
        }
        Throwable th2 = (Throwable) pair.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pair.b;
        Throwable c2 = dob.c(th2);
        if (c2 != null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            StackTraceElement stackTraceElement = om6Var.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayDeque.add(stackTraceElement);
            }
            while (true) {
                om6Var = om6Var.getCallerFrame();
                if (om6Var == null) {
                    break;
                }
                StackTraceElement stackTraceElement2 = om6Var.getStackTraceElement();
                if (stackTraceElement2 != null) {
                    arrayDeque.add(stackTraceElement2);
                }
            }
            if (!arrayDeque.isEmpty()) {
                if (th2 != th) {
                    int length2 = stackTraceElementArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            i3 = -1;
                            break;
                        }
                        if (c.v(stackTraceElementArr[i3].getClassName(), "_COROUTINE", false)) {
                            break;
                        }
                        i3++;
                    }
                    int i4 = i3 + 1;
                    int length3 = stackTraceElementArr.length - 1;
                    if (i4 <= length3) {
                        while (true) {
                            StackTraceElement stackTraceElement3 = stackTraceElementArr[length3];
                            StackTraceElement stackTraceElement4 = (StackTraceElement) arrayDeque.getLast();
                            if (stackTraceElement3.getLineNumber() == stackTraceElement4.getLineNumber() && Intrinsics.d(stackTraceElement3.getMethodName(), stackTraceElement4.getMethodName()) && Intrinsics.d(stackTraceElement3.getFileName(), stackTraceElement4.getFileName()) && Intrinsics.d(stackTraceElement3.getClassName(), stackTraceElement4.getClassName())) {
                                arrayDeque.removeLast();
                            }
                            arrayDeque.addFirst(stackTraceElementArr[length3]);
                            if (length3 == i4) {
                                break;
                            }
                            length3--;
                        }
                    }
                }
                arrayDeque.addFirst(a);
                StackTraceElement[] stackTrace2 = th2.getStackTrace();
                int length4 = stackTrace2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length4) {
                        i5 = -1;
                        break;
                    }
                    if (Intrinsics.d(b, stackTrace2[i5].getClassName())) {
                        break;
                    }
                    i5++;
                }
                if (i5 == -1) {
                    c2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
                    return c2;
                }
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[arrayDeque.size() + i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    stackTraceElementArr2[i6] = stackTrace2[i6];
                }
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    stackTraceElementArr2[i + i5] = (StackTraceElement) it.next();
                    i++;
                }
                c2.setStackTrace(stackTraceElementArr2);
                return c2;
            }
        }
        return th;
    }

    public static final Throwable b(Throwable th) {
        Throwable c2;
        if (!ve7.b() || (c2 = dob.c(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = c2.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (Intrinsics.d(c, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length2 = i;
            }
        }
        length2 = -1;
        int i2 = length2 + 1;
        int length3 = stackTrace.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length3) {
                i4 = -1;
                break;
            }
            if (Intrinsics.d(b, stackTrace[i4].getClassName())) {
                break;
            }
            i4++;
        }
        int i5 = (length - length2) - (i4 == -1 ? 0 : length - i4);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i5];
        while (i3 < i5) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        c2.setStackTrace(stackTraceElementArr);
        return c2;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null && cause.getClass().equals(th.getClass())) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (c.v(stackTraceElement.getClassName(), "_COROUTINE", false)) {
                    return cause;
                }
            }
        }
        return th;
    }
}

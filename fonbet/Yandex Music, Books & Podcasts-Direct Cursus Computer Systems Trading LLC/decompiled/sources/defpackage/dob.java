package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class dob {
    public static final int a;
    public static final abv b;

    static {
        abv abvVar = abv.a;
        a = b(-1, Throwable.class);
        try {
            int i = n5c.a;
        } catch (Throwable unused) {
            abv abvVar2 = abv.a;
        }
        b = abvVar;
    }

    public static final Function1 a(Class cls) {
        Object obj;
        Function1 function1;
        Pair pair;
        Pair pair2;
        h01 h01Var = h01.i;
        if (a == b(0, cls)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                obj = null;
                if (i >= length) {
                    break;
                }
                final Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 != 0) {
                    if (length2 == 1) {
                        Class<?> cls2 = parameterTypes[0];
                        if (Intrinsics.d(cls2, String.class)) {
                            final int i2 = 1;
                            pair = new Pair(new k32(3, new Function1() { // from class: cob
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    switch (i2) {
                                        case 0:
                                            Object newInstance = constructor.newInstance(th.getMessage(), th);
                                            newInstance.getClass();
                                            return (Throwable) newInstance;
                                        case 1:
                                            Object newInstance2 = constructor.newInstance(th.getMessage());
                                            newInstance2.getClass();
                                            Throwable th2 = (Throwable) newInstance2;
                                            th2.initCause(th);
                                            return th2;
                                        case 2:
                                            Object newInstance3 = constructor.newInstance(th);
                                            newInstance3.getClass();
                                            return (Throwable) newInstance3;
                                        default:
                                            Object newInstance4 = constructor.newInstance(null);
                                            newInstance4.getClass();
                                            Throwable th3 = (Throwable) newInstance4;
                                            th3.initCause(th);
                                            return th3;
                                    }
                                }
                            }), 2);
                        } else if (Intrinsics.d(cls2, Throwable.class)) {
                            final int i3 = 2;
                            pair = new Pair(new k32(3, new Function1() { // from class: cob
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    switch (i3) {
                                        case 0:
                                            Object newInstance = constructor.newInstance(th.getMessage(), th);
                                            newInstance.getClass();
                                            return (Throwable) newInstance;
                                        case 1:
                                            Object newInstance2 = constructor.newInstance(th.getMessage());
                                            newInstance2.getClass();
                                            Throwable th2 = (Throwable) newInstance2;
                                            th2.initCause(th);
                                            return th2;
                                        case 2:
                                            Object newInstance3 = constructor.newInstance(th);
                                            newInstance3.getClass();
                                            return (Throwable) newInstance3;
                                        default:
                                            Object newInstance4 = constructor.newInstance(null);
                                            newInstance4.getClass();
                                            Throwable th3 = (Throwable) newInstance4;
                                            th3.initCause(th);
                                            return th3;
                                    }
                                }
                            }), 1);
                        } else {
                            pair2 = new Pair(null, -1);
                        }
                    } else if (length2 != 2) {
                        pair2 = new Pair(null, -1);
                    } else if (Intrinsics.d(parameterTypes[0], String.class) && Intrinsics.d(parameterTypes[1], Throwable.class)) {
                        final int i4 = 0;
                        pair = new Pair(new k32(3, new Function1() { // from class: cob
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Throwable th = (Throwable) obj2;
                                switch (i4) {
                                    case 0:
                                        Object newInstance = constructor.newInstance(th.getMessage(), th);
                                        newInstance.getClass();
                                        return (Throwable) newInstance;
                                    case 1:
                                        Object newInstance2 = constructor.newInstance(th.getMessage());
                                        newInstance2.getClass();
                                        Throwable th2 = (Throwable) newInstance2;
                                        th2.initCause(th);
                                        return th2;
                                    case 2:
                                        Object newInstance3 = constructor.newInstance(th);
                                        newInstance3.getClass();
                                        return (Throwable) newInstance3;
                                    default:
                                        Object newInstance4 = constructor.newInstance(null);
                                        newInstance4.getClass();
                                        Throwable th3 = (Throwable) newInstance4;
                                        th3.initCause(th);
                                        return th3;
                                }
                            }
                        }), 3);
                    } else {
                        pair2 = new Pair(null, -1);
                    }
                    arrayList.add(pair2);
                    i++;
                } else {
                    final int i5 = 3;
                    pair = new Pair(new k32(3, new Function1() { // from class: cob
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            switch (i5) {
                                case 0:
                                    Object newInstance = constructor.newInstance(th.getMessage(), th);
                                    newInstance.getClass();
                                    return (Throwable) newInstance;
                                case 1:
                                    Object newInstance2 = constructor.newInstance(th.getMessage());
                                    newInstance2.getClass();
                                    Throwable th2 = (Throwable) newInstance2;
                                    th2.initCause(th);
                                    return th2;
                                case 2:
                                    Object newInstance3 = constructor.newInstance(th);
                                    newInstance3.getClass();
                                    return (Throwable) newInstance3;
                                default:
                                    Object newInstance4 = constructor.newInstance(null);
                                    newInstance4.getClass();
                                    Throwable th3 = (Throwable) newInstance4;
                                    th3.initCause(th);
                                    return th3;
                            }
                        }
                    }), 0);
                }
                pair2 = pair;
                arrayList.add(pair2);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Pair) obj).b).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((Pair) next).b).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair3 = (Pair) obj;
            if (pair3 != null && (function1 = (Function1) pair3.a) != null) {
                return function1;
            }
        }
        return h01Var;
    }

    public static final int b(int i, Class cls) {
        Object t7oVar;
        ern.a(cls);
        try {
            r7o r7oVar = z7o.b;
            int i2 = 0;
            do {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            t7oVar = Integer.valueOf(i2);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Object valueOf = Integer.valueOf(i);
        r7o r7oVar3 = z7o.b;
        if (t7oVar instanceof t7o) {
            t7oVar = valueOf;
        }
        return ((Number) t7oVar).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable c(Throwable th) {
        Object t7oVar;
        if (th instanceof dl6) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = ((dl6) th).createCopy();
            } catch (Throwable th2) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th2);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            return (Throwable) t7oVar;
        }
        Class<?> cls = th.getClass();
        b.getClass();
        WeakHashMap weakHashMap = abv.c;
        ReentrantReadWriteLock reentrantReadWriteLock = abv.b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) weakHashMap.get(cls);
            if (function1 == null) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    Function1 function12 = (Function1) weakHashMap.get(cls);
                    if (function12 == null) {
                        function12 = a(cls);
                        weakHashMap.put(cls, function12);
                        while (i < readHoldCount) {
                            readLock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                    }
                    function1 = function12;
                } finally {
                    while (i < readHoldCount) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
            return (Throwable) function1.invoke(th);
        } finally {
            readLock.unlock();
        }
    }
}

package defpackage;

import android.util.Log;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class z98 {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public z98(int i) {
        this.c = new xiu(29);
        this.d = new b0h(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = i;
    }

    public long a(int i, int i2) {
        int i3;
        jtc jtcVar = (jtc) this.c;
        int[] iArr = (int[]) jtcVar.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) jtcVar.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            ume.a("width must be >= 0");
        }
        return ia6.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public void b(int i, Class cls) {
        NavigableMap j = j(cls);
        Integer num = (Integer) j.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                j.remove(Integer.valueOf(i));
                return;
            } else {
                j.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        while (this.b > i) {
            Object E = ((xiu) this.c).E();
            w1g.r(E);
            zl3 g = g(E.getClass());
            this.b -= g.b() * g.a(E);
            b(g.a(E), E.getClass());
            if (Log.isLoggable(g.c(), 2)) {
                Log.v(g.c(), "evicted: " + g.a(E));
            }
        }
    }

    public void d(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        k();
    }

    public void e(jkn jknVar) {
        jknVar.b.decrementAndGet();
        d((ArrayDeque) this.e, jknVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002d, B:18:0x003d, B:19:0x0041, B:20:0x0060, B:25:0x004a, B:27:0x0056, B:28:0x005a), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Object f(int i, Class cls) {
        boolean z;
        a0h a0hVar;
        int i2;
        try {
            Integer num = (Integer) j(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.b) != 0 && this.a / i2 < 2 && num.intValue() > i * 8)) {
                z = false;
                b0h b0hVar = (b0h) this.d;
                if (z) {
                    sgm sgmVar = (sgm) ((ArrayDeque) b0hVar.a).poll();
                    if (sgmVar == null) {
                        sgmVar = b0hVar.G();
                    }
                    a0hVar = (a0h) sgmVar;
                    a0hVar.b = i;
                    a0hVar.c = cls;
                } else {
                    int intValue = num.intValue();
                    sgm sgmVar2 = (sgm) ((ArrayDeque) b0hVar.a).poll();
                    if (sgmVar2 == null) {
                        sgmVar2 = b0hVar.G();
                    }
                    a0hVar = (a0h) sgmVar2;
                    a0hVar.b = intValue;
                    a0hVar.c = cls;
                }
            }
            z = true;
            b0h b0hVar2 = (b0h) this.d;
            if (z) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(a0hVar, cls);
    }

    public zl3 g(Class cls) {
        zl3 zl3Var;
        HashMap hashMap = (HashMap) this.f;
        zl3 zl3Var2 = (zl3) hashMap.get(cls);
        if (zl3Var2 != null) {
            return zl3Var2;
        }
        if (cls.equals(int[].class)) {
            zl3Var = new zl3(1);
        } else {
            if (!cls.equals(byte[].class)) {
                xq0.x("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            zl3Var = new zl3(0);
        }
        hashMap.put(cls, zl3Var);
        return zl3Var;
    }

    public msf h(int i) {
        et7 c = ((ukn) this.e).c(i);
        int i2 = c.a;
        int size = c.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        lsf[] lsfVarArr = new lsf[size];
        int i5 = 0;
        while (true) {
            List list = c.b;
            if (i3 >= size) {
                return new msf(i, lsfVarArr, (jtc) this.f, list, i4);
            }
            int i6 = (int) ((ypd) list.get(i3)).a;
            int i7 = i4;
            lsf b = ((gsf) this.d).b(i2 + i3, a(i5, i6), i5, i6, i7);
            i5 += i6;
            lsfVarArr[i3] = b;
            i3++;
            i4 = i7;
        }
    }

    public Object i(a0h a0hVar, Class cls) {
        zl3 g = g(cls);
        Object m = ((xiu) this.c).m(a0hVar);
        if (m != null) {
            this.b -= g.b() * g.a(m);
            b(g.a(m), cls);
        }
        if (m != null) {
            return m;
        }
        if (Log.isLoggable(g.c(), 2)) {
            Log.v(g.c(), "Allocated " + a0hVar.b + " bytes");
        }
        int i = a0hVar.b;
        switch (g.a) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public NavigableMap j(Class cls) {
        HashMap hashMap = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k() {
        int size;
        int i;
        ExecutorService executorService;
        byte[] bArr = cvt.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.d).iterator();
                it.getClass();
                while (it.hasNext()) {
                    jkn jknVar = (jkn) it.next();
                    if (((ArrayDeque) this.e).size() >= this.a) {
                        break;
                    }
                    if (jknVar.b.get() < this.b) {
                        it.remove();
                        jknVar.b.incrementAndGet();
                        arrayList.add(jknVar);
                        ((ArrayDeque) this.e).add(jknVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.e).size();
                    ((ArrayDeque) this.f).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    jkn jknVar2 = (jkn) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ExecutorService) this.c) == null) {
                                this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new qut(cvt.g + " Dispatcher", false));
                            }
                            executorService = (ExecutorService) this.c;
                            executorService.getClass();
                        } finally {
                        }
                    }
                    jknVar2.getClass();
                    mkn mknVar = jknVar2.c;
                    z98 z98Var = mknVar.a.a;
                    byte[] bArr2 = cvt.a;
                    try {
                        try {
                            executorService.execute(jknVar2);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            mknVar.h(interruptedIOException);
                            jknVar2.a.d(mknVar, interruptedIOException);
                            mknVar.a.a.e(jknVar2);
                        }
                    } catch (Throwable th) {
                        mknVar.a.a.e(jknVar2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }

    public synchronized void l(Object obj) {
        Class<?> cls = obj.getClass();
        zl3 g = g(cls);
        int a = g.a(obj);
        int b = g.b() * a;
        if (b <= this.a / 2) {
            b0h b0hVar = (b0h) this.d;
            sgm sgmVar = (sgm) ((ArrayDeque) b0hVar.a).poll();
            if (sgmVar == null) {
                sgmVar = b0hVar.G();
            }
            a0h a0hVar = (a0h) sgmVar;
            a0hVar.b = a;
            a0hVar.c = cls;
            ((xiu) this.c).B(a0hVar, obj);
            NavigableMap j = j(cls);
            Integer num = (Integer) j.get(Integer.valueOf(a0hVar.b));
            Integer valueOf = Integer.valueOf(a0hVar.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            j.put(valueOf, Integer.valueOf(i));
            this.b += b;
            c(this.a);
        }
    }

    public void m(int i) {
        if (i < 1) {
            xq0.o(k5r.i(i, "max < 1: "));
            return;
        }
        synchronized (this) {
            this.a = i;
        }
        k();
    }

    public void n() {
        synchronized (this) {
            this.b = 8;
        }
        k();
    }

    public z98() {
        this.a = 64;
        this.b = 5;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public z98(jtc jtcVar, int i, int i2, gsf gsfVar, ukn uknVar) {
        this.f = jtcVar;
        this.c = jtcVar;
        this.a = i;
        this.b = i2;
        this.d = gsfVar;
        this.e = uknVar;
    }
}

package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.crashlytics.internal.concurrency.a;
import defpackage.c3f;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes.dex */
public final class u0r0 {
    public final d3f a;
    public final g3f b;
    public final xpg c;
    public final lb7 d;
    public final jp21 e;
    public final c6v f;
    public final a g;

    public u0r0(d3f d3fVar, g3f g3fVar, xpg xpgVar, lb7 lb7Var, jp21 jp21Var, c6v c6vVar, a aVar) {
        this.a = d3fVar;
        this.b = g3fVar;
        this.c = xpgVar;
        this.d = lb7Var;
        this.e = jp21Var;
        this.f = c6vVar;
        this.g = aVar;
    }

    public static c3f.e.d a(t44 t44Var, lb7 lb7Var, jp21 jp21Var, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        s44 s44Var = new s44(t44Var);
        String g = ((j0r) lb7Var.c).g();
        if (g != null) {
            m54 m54Var = new m54();
            m54Var.b(g);
            s44Var.d(m54Var.a());
        } else {
            Log.isLoggable("FirebaseCrashlytics", 2);
        }
        boolean isEmpty = map.isEmpty();
        lxj lxjVar = jp21Var.d;
        if (isEmpty) {
            dlx dlxVar = (dlx) ((AtomicMarkableReference) lxjVar.c).getReference();
            synchronized (dlxVar) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(dlxVar.a));
            }
        } else {
            dlx dlxVar2 = (dlx) ((AtomicMarkableReference) lxjVar.c).getReference();
            synchronized (dlxVar2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(dlxVar2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            for (Map.Entry entry : map.entrySet()) {
                String a = dlx.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a)) {
                    hashMap.put(a, dlx.a(1024, (String) entry.getValue()));
                }
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List e = e(unmodifiableMap2);
        dlx dlxVar3 = (dlx) ((AtomicMarkableReference) jp21Var.e.c).getReference();
        synchronized (dlxVar3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(dlxVar3.a));
        }
        List e2 = e(unmodifiableMap3);
        if (!e.isEmpty() || !e2.isEmpty()) {
            u44 h = t44Var.c.h();
            h.e(e);
            h.g(e2);
            s44Var.b(h.a());
        }
        return s44Var.a();
    }

    public static c3f.e.d b(c3f.e.d dVar, jp21 jp21Var) {
        List unmodifiableList;
        dwk0 dwk0Var = jp21Var.f;
        synchronized (dwk0Var) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(dwk0Var.a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            arrayList.add(((cwk0) unmodifiableList.get(i)).g());
        }
        if (arrayList.isEmpty()) {
            return dVar;
        }
        s44 g = dVar.g();
        s54 s54Var = new s54();
        s54Var.b(arrayList);
        g.e(s54Var.a());
        return g.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static u0r0 d(Context context, c6v c6vVar, q1r q1rVar, yx1 yx1Var, lb7 lb7Var, jp21 jp21Var, kjz kjzVar, com.google.firebase.crashlytics.internal.settings.a aVar, fy60 fy60Var, p2f p2fVar, a aVar2) {
        d3f d3fVar = new d3f(context, c6vVar, yx1Var, kjzVar, aVar);
        g3f g3fVar = new g3f(q1rVar, aVar, p2fVar);
        e3f e3fVar = xpg.b;
        z811.b(context);
        return new u0r0(d3fVar, g3fVar, new xpg(new h3j0(z811.a().c(new d87(xpg.c, xpg.d)).a("FIREBASE_CRASHLYTICS_REPORT", new pzn("json"), xpg.e), aVar.b(), fy60Var)), lb7Var, jp21Var, c6vVar, aVar2);
    }

    public static List e(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            f44 f44Var = new f44();
            f44Var.b((String) entry.getKey());
            f44Var.c((String) entry.getValue());
            arrayList.add(f44Var.a());
        }
        Collections.sort(arrayList, new y60(25));
        return Collections.unmodifiableList(arrayList);
    }

    public final void f(Throwable th, Thread thread, String str, pgo pgoVar, boolean z) {
        boolean equals = str.equals("crash");
        long c = pgoVar.c();
        d3f d3fVar = this.a;
        Context context = d3fVar.a;
        int i = context.getResources().getConfiguration().orientation;
        kjz kjzVar = d3fVar.d;
        hwo0 a = hwo0.a(th, kjzVar);
        s44 s44Var = new s44();
        s44Var.g(str);
        s44Var.f(c);
        c3f.e.d.a.c b = t5f0.a.b(context);
        Boolean valueOf = b.a() > 0 ? Boolean.valueOf(b.a() != 100) : null;
        u44 u44Var = new u44();
        u44Var.c(valueOf);
        u44Var.d(b);
        u44Var.b(t5f0.a(context));
        u44Var.h(i);
        w44 w44Var = new w44();
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) a.w;
        e54 e54Var = new e54();
        e54Var.d(thread.getName());
        e54Var.c(4);
        e54Var.b(d3f.d(stackTraceElementArr, 4));
        arrayList.add(e54Var.a());
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] a2 = kjzVar.a(entry.getValue());
                    e54 e54Var2 = new e54();
                    e54Var2.d(key.getName());
                    e54Var2.c(0);
                    e54Var2.b(d3f.d(a2, 0));
                    arrayList.add(e54Var2.a());
                }
            }
        }
        w44Var.f(Collections.unmodifiableList(arrayList));
        w44Var.d(d3f.c(a, 0));
        c54 c54Var = new c54();
        c54Var.d("0");
        c54Var.c("0");
        c54Var.b(0L);
        w44Var.e(c54Var.a());
        w44Var.c(d3fVar.a());
        u44Var.f(w44Var.a());
        s44Var.b(u44Var.a());
        s44Var.c(d3fVar.b(i));
        t44 a3 = s44Var.a();
        Map a4 = pgoVar.a();
        lb7 lb7Var = this.d;
        jp21 jp21Var = this.e;
        c3f.e.d b2 = b(a(a3, lb7Var, jp21Var, a4), jp21Var);
        if (z) {
            this.b.d(b2, pgoVar.b(), equals);
        } else {
            this.g.b.a(new yno(this, b2, pgoVar, equals, 2));
        }
    }

    public final zzw g(String str, Executor executor) {
        atx0 atx0Var;
        ArrayList b = this.b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                e3f e3fVar = g3f.g;
                String e = g3f.e(file);
                e3fVar.getClass();
                arrayList.add(h3f.a(e3f.i(e), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            h3f h3fVar = (h3f) it2.next();
            if (str == null || str.equals(h3fVar.d())) {
                xpg xpgVar = this.c;
                if (h3fVar.b().f() == null || h3fVar.b().e() == null) {
                    dcr b2 = this.f.b(true);
                    c3f b3 = h3fVar.b();
                    String str2 = b2.a;
                    y34 m = b3.m();
                    m.e = str2;
                    z34 a = m.a();
                    String str3 = b2.b;
                    y34 m2 = a.m();
                    m2.f = str3;
                    h3fVar = h3f.a(m2.a(), h3fVar.d(), h3fVar.c());
                }
                h3f h3fVar2 = h3fVar;
                boolean z = str != null;
                h3j0 h3j0Var = xpgVar.a;
                synchronized (h3j0Var.f) {
                    try {
                        atx0Var = new atx0();
                        if (z) {
                            h3j0Var.i.a.getAndIncrement();
                            if (h3j0Var.f.size() < h3j0Var.e) {
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                h3j0Var.f.size();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                h3j0Var.g.execute(new lz((Object) h3j0Var, (Object) h3fVar2, (Object) atx0Var, false, 21));
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                atx0Var.c(h3fVar2);
                            } else {
                                h3j0Var.a();
                                Log.isLoggable("FirebaseCrashlytics", 3);
                                h3j0Var.i.b.getAndIncrement();
                                atx0Var.c(h3fVar2);
                            }
                        } else {
                            h3j0Var.b(h3fVar2, atx0Var);
                        }
                    } finally {
                    }
                }
                arrayList2.add(atx0Var.a.h(executor, new d7g0(24, this)));
            }
        }
        return udq0.U(arrayList2);
    }
}

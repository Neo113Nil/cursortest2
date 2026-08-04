package com.gamericefishpro.space.u6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.f2.d1;
import com.gamericefishpro.space.f2.e1;
import com.gamericefishpro.space.f2.h0;
import com.gamericefishpro.space.f2.i1;
import com.gamericefishpro.space.f2.j1;
import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.h2.b0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.n9.a4;
import com.gamericefishpro.space.n9.f1;
import com.gamericefishpro.space.n9.i2;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.z;
import com.gamericefishpro.space.ph.d0;
import com.gamericefishpro.space.r5.m0;
import com.gamericefishpro.space.r5.u0;
import com.gamericefishpro.space.s4.v;
import com.gamericefishpro.space.s4.w;
import com.gamericefishpro.space.s4.y;
import com.gamericefishpro.space.t.c0;
import com.gamericefishpro.space.t.e0;
import com.gamericefishpro.space.t.r0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.tb.u;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements d1, j1, com.gamericefishpro.space.e8.b, com.gamericefishpro.space.s4.o {
    public Object d;
    public Object e;

    public /* synthetic */ l(Object obj, Object obj2) {
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void f(f0 f0Var) {
        if (f0Var.j0 > 0) {
            if (f0Var.a0.d == b0.w && !f0Var.p() && !f0Var.q() && !f0Var.k0 && f0Var.I()) {
                com.gamericefishpro.space.h1.l lVar = f0Var.Z.f;
                if ((lVar.v & 256) != 0) {
                    while (lVar != null) {
                        if ((lVar.i & 256) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof com.gamericefishpro.space.h2.m) {
                                    com.gamericefishpro.space.h2.m mVar = (com.gamericefishpro.space.h2.m) E;
                                    mVar.m0(com.gamericefishpro.space.h2.k.q(mVar, 256));
                                } else if ((E.i & 256) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    com.gamericefishpro.space.h1.l lVar2 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i = 0;
                                    E = E;
                                    eVar = eVar;
                                    while (lVar2 != null) {
                                        if ((lVar2.i & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                eVar = eVar;
                                                E = lVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                        lVar2 = lVar2.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                        if ((lVar.v & 256) == 0) {
                            break;
                        } else {
                            lVar = lVar.y;
                        }
                    }
                }
            }
            f0Var.i0 = false;
            com.gamericefishpro.space.v0.e eVarZ = f0Var.z();
            Object[] objArr = eVarZ.d;
            int i2 = eVarZ.i;
            for (int i3 = 0; i3 < i2; i3++) {
                f((f0) objArr[i3]);
            }
        }
    }

    @Override // com.gamericefishpro.space.s4.o
    public boolean a(CharSequence charSequence, int i, int i2, v vVar) {
        if ((vVar.c & 4) > 0) {
            return true;
        }
        if (((y) this.d) == null) {
            this.d = new y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((z) this.e).getClass();
        ((y) this.d).setSpan(new w(vVar), i, i2, 33);
        return true;
    }

    @Override // com.gamericefishpro.space.f2.d1
    public e1 apply() {
        return ((h0) this.d).f(this.e);
    }

    @Override // com.gamericefishpro.space.f2.d1
    public boolean b(w0 w0Var) {
        return true;
    }

    @Override // com.gamericefishpro.space.f2.j1
    public void c(i1 i1Var) {
        c0 c0Var = (c0) this.e;
        c0Var.a();
        e0 e0Var = (e0) i1Var.e;
        Object[] objArr = e0Var.b;
        long[] jArr = e0Var.c;
        int i = e0Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((com.gamericefishpro.space.h0.y) this.d).b(obj);
            int iD = c0Var.d(objB);
            int i3 = iD >= 0 ? c0Var.c[iD] : 0;
            if (i3 == 7) {
                i1Var.remove(obj);
            } else {
                c0Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // com.gamericefishpro.space.f2.d1
    public boolean d() {
        return true;
    }

    @Override // com.gamericefishpro.space.f2.j1
    public boolean e(Object obj, Object obj2) {
        com.gamericefishpro.space.h0.y yVar = (com.gamericefishpro.space.h0.y) this.d;
        return Intrinsics.a(yVar.b(obj), yVar.b(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory g(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.e) == null) {
            Context context = (Context) this.d;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.e = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.e = map;
        }
        String str4 = (String) ((Map) this.e).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        int i = 8;
        com.gamericefishpro.space.v8.l lVar = new com.gamericefishpro.space.v8.l(i);
        com.gamericefishpro.space.lb.e eVar = new com.gamericefishpro.space.lb.e(i);
        Object obj = ((com.gamericefishpro.space.nh.a) this.d).get();
        com.gamericefishpro.space.nh.a aVar = (com.gamericefishpro.space.nh.a) this.e;
        return new com.gamericefishpro.space.j8.i(lVar, eVar, com.gamericefishpro.space.j8.a.f, (com.gamericefishpro.space.j8.k) obj, aVar);
    }

    @Override // com.gamericefishpro.space.s4.o
    public Object getResult() {
        return (y) this.d;
    }

    public KeyListener h(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((l) ((u) this.e).e).getClass();
        if (keyListener instanceof com.gamericefishpro.space.u4.g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new com.gamericefishpro.space.u4.g(keyListener);
    }

    public void i(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.d).getContext().obtainStyledAttributes(attributeSet, com.gamericefishpro.space.j.a.g, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            p(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void j() throws IOException {
        String str = (String) this.d;
        if (((FileChannel) this.e) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.e = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.e;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.e = null;
            throw new IllegalStateException(y0.g("Unable to lock file: '", str, "'."), th);
        }
    }

    public com.gamericefishpro.space.u4.c k(InputConnection inputConnection, EditorInfo editorInfo) {
        u uVar = (u) this.e;
        if (inputConnection == null) {
            uVar.getClass();
            inputConnection = null;
        } else {
            l lVar = (l) uVar.e;
            lVar.getClass();
            if (!(inputConnection instanceof com.gamericefishpro.space.u4.c)) {
                inputConnection = new com.gamericefishpro.space.u4.c((EditText) lVar.d, inputConnection, editorInfo);
            }
        }
        return (com.gamericefishpro.space.u4.c) inputConnection;
    }

    public void l(Throwable th) {
        a4 a4Var = (a4) this.d;
        t2 t2Var = (t2) this.e;
        t2Var.r();
        t2Var.B = false;
        r1 r1Var = (r1) t2Var.d;
        com.gamericefishpro.space.n9.g gVar = r1Var.v;
        v0 v0Var = r1Var.y;
        int i = 2;
        if (gVar.B(null, com.gamericefishpro.space.n9.e0.T0)) {
            String message = th.getMessage();
            t2Var.G = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        t2Var.G = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            r1.l(v0Var);
            v0Var.B.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", v0.z(r1Var.q().x()), v0.z(th.toString()));
            t2Var.C = 1;
            t2Var.P().add(a4Var);
            return;
        }
        if (i2 != 1) {
            r1.l(v0Var);
            v0Var.y.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", v0.z(r1Var.q().x()), th);
            r();
            t2Var.C = 1;
            t2Var.Q();
            return;
        }
        t2Var.P().add(a4Var);
        if (t2Var.C > ((Integer) com.gamericefishpro.space.n9.e0.w0.a(null)).intValue()) {
            t2Var.C = 1;
            r1.l(v0Var);
            v0Var.B.c("registerTriggerAsync failed. May try later. App ID, throwable", v0.z(r1Var.q().x()), v0.z(th.toString()));
            return;
        }
        r1.l(v0Var);
        v0Var.B.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", v0.z(r1Var.q().x()), v0.z(String.valueOf(t2Var.C)), v0.z(th.toString()));
        int i3 = t2Var.C;
        if (t2Var.D == null) {
            t2Var.D = new i2(t2Var, r1Var, 1);
        }
        t2Var.D.b(((long) i3) * 1000);
        int i4 = t2Var.C;
        t2Var.C = i4 + i4;
    }

    public void m(com.gamericefishpro.space.z3.f fVar) {
        com.gamericefishpro.space.c8.p pVar = (com.gamericefishpro.space.c8.p) this.e;
        u uVar = (u) this.d;
        int i = fVar.b;
        if (i != 0) {
            pVar.execute(new com.gamericefishpro.space.s4.i(i, 3, uVar));
        } else {
            pVar.execute(new com.gamericefishpro.space.r9.l(10, uVar, fVar.a, false));
        }
    }

    public void n(m0 m0Var) {
        u0 u0Var = (u0) ((r0) this.d).get(m0Var);
        if (u0Var == null) {
            return;
        }
        u0Var.a &= -2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    public Object o(com.gamericefishpro.space.pj.a aVar, com.gamericefishpro.space.b1.d context, boolean z) {
        Object objB;
        Object objY;
        Iterable<com.gamericefishpro.space.pj.a> iterable;
        com.gamericefishpro.space.b1.d dVar;
        com.gamericefishpro.space.mj.a aVar2 = aVar.a;
        com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.b1.d) this.d).v;
        com.gamericefishpro.space.lj.a aVar3 = (com.gamericefishpro.space.lj.a) context.v;
        String str = (String) context.w;
        com.gamericefishpro.space.ei.g klass = (com.gamericefishpro.space.ei.g) context.i;
        com.gamericefishpro.space.g1.b bVar = (com.gamericefishpro.space.g1.b) context.d;
        if (aVar3 == null || aVar3.a.isEmpty()) {
            objB = null;
        } else {
            bVar.i("|- ? " + str + " look in injected parameters");
            objB = aVar3.b(klass);
        }
        if (objB != null) {
            return objB;
        }
        boolean z2 = aVar.c;
        Object objY2 = cVar.y(klass, aVar2, context);
        if (objY2 == null) {
            ThreadLocal threadLocal = aVar.g;
            com.gamericefishpro.space.ph.r rVar = threadLocal != null ? (com.gamericefishpro.space.ph.r) threadLocal.get() : null;
            if (rVar == null || rVar.isEmpty()) {
                objY2 = null;
            } else {
                bVar.i("|- ? " + str + " look in stack parameters");
                com.gamericefishpro.space.lj.a aVar4 = (com.gamericefishpro.space.lj.a) rVar.h();
                if (aVar4 != null) {
                    objY2 = aVar4.b(klass);
                } else {
                    objY2 = null;
                }
            }
            if (objY2 == null) {
                if (z2 || !(aVar2 instanceof com.gamericefishpro.space.mj.c)) {
                    objY = null;
                } else {
                    bVar.i("|- ? " + str + " look at scope archetype");
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(klass, "klass");
                    Intrinsics.checkNotNullParameter(context, "context");
                    com.gamericefishpro.space.mj.c cVar2 = ((com.gamericefishpro.space.pj.a) context.e).d;
                    if (cVar2 != null) {
                        objY = cVar.y(klass, cVar2, context);
                    } else {
                        objY = null;
                    }
                }
                if (objY != null) {
                    return objY;
                }
                if (!z) {
                    Iterator it = ((ArrayList) this.e).iterator();
                    if (it.hasNext()) {
                        throw com.gamericefishpro.space.m5.a.f(it);
                    }
                } else if (!z2) {
                    bVar.i("|- ? " + str + " look in other scopes");
                    ArrayList scopes = aVar.f;
                    if (scopes.size() > 1) {
                        iterable = scopes;
                        Intrinsics.checkNotNullParameter(scopes, "scopes");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        com.gamericefishpro.space.ph.r rVar2 = new com.gamericefishpro.space.ph.r(d0.o(scopes));
                        while (!rVar2.isEmpty()) {
                            com.gamericefishpro.space.pj.a aVar5 = (com.gamericefishpro.space.pj.a) rVar2.removeLast();
                            if (linkedHashSet.add(aVar5)) {
                                Iterator it2 = aVar5.f.iterator();
                                Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                                    com.gamericefishpro.space.pj.a aVar6 = (com.gamericefishpro.space.pj.a) next;
                                    if (!linkedHashSet.contains(aVar6)) {
                                        rVar2.addLast(aVar6);
                                    }
                                }
                            }
                        }
                        iterable = linkedHashSet;
                    }
                    iterable = scopes;
                    for (com.gamericefishpro.space.pj.a s : iterable) {
                        StringBuilder sbL = com.gamericefishpro.space.m5.a.l("|- ? ", str, " look in scope '");
                        sbL.append(s.b);
                        sbL.append('\'');
                        bVar.i(sbL.toString());
                        if (s.c) {
                            dVar = context;
                        } else {
                            Intrinsics.checkNotNullParameter(s, "s");
                            dVar = new com.gamericefishpro.space.b1.d(bVar, s, klass, aVar3);
                        }
                        Object objO = o(s, dVar, false);
                        if (objO != null) {
                            return objO;
                        }
                    }
                }
                return null;
            }
        }
        return objY2;
    }

    public void p(boolean z) {
        com.gamericefishpro.space.u4.k kVar = (com.gamericefishpro.space.u4.k) ((l) ((u) this.e).e).e;
        if (kVar.i != z) {
            if (kVar.e != null) {
                com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
                com.gamericefishpro.space.u4.j jVar = kVar.e;
                kVarA.getClass();
                com.gamericefishpro.space.i9.a4.p(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = kVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    kVarA.b.remove(jVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            kVar.i = z;
            if (z) {
                com.gamericefishpro.space.u4.k.a(kVar.d, com.gamericefishpro.space.s4.k.a().b());
            }
        }
    }

    public void q(com.gamericefishpro.space.t0.u0 u0Var) {
        Object objG = ((com.gamericefishpro.space.t.h0) this.e).g(u0Var);
        if (objG != null) {
            if (!(objG instanceof com.gamericefishpro.space.t.d0)) {
                throw new ClassCastException();
            }
            com.gamericefishpro.space.t.d0 d0Var = (com.gamericefishpro.space.t.d0) objG;
            Object[] objArr = d0Var.a;
            if (d0Var.b <= 0) {
                return;
            }
            Intrinsics.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public void r() {
        r1 r1Var = (r1) ((t2) this.e).d;
        f1 f1Var = r1Var.w;
        r1.j(f1Var);
        SparseArray sparseArrayX = f1Var.x();
        a4 a4Var = (a4) this.d;
        sparseArrayX.put(a4Var.i, Long.valueOf(a4Var.e));
        f1 f1Var2 = r1Var.w;
        r1.j(f1Var2);
        int[] iArr = new int[sparseArrayX.size()];
        long[] jArr = new long[sparseArrayX.size()];
        for (int i = 0; i < sparseArrayX.size(); i++) {
            iArr[i] = sparseArrayX.keyAt(i);
            jArr[i] = ((Long) sparseArrayX.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        f1Var2.G.l(bundle);
    }

    public l(int i) {
        switch (i) {
            case 10:
                this.d = new r0(0);
                this.e = new com.gamericefishpro.space.t.q((Object) null);
                break;
            case RequestError.STOP_TRACKING /* 11 */:
            default:
                this.d = new com.gamericefishpro.space.v0.e(new f0[16]);
                break;
            case 12:
                this.d = new com.gamericefishpro.space.t.h0();
                this.e = new com.gamericefishpro.space.t.h0();
                break;
        }
    }

    public l(EditText editText, int i) {
        switch (i) {
            case 14:
                this.d = editText;
                com.gamericefishpro.space.u4.k kVar = new com.gamericefishpro.space.u4.k(editText);
                this.e = kVar;
                editText.addTextChangedListener(kVar);
                if (com.gamericefishpro.space.u4.a.b == null) {
                    synchronized (com.gamericefishpro.space.u4.a.a) {
                        try {
                            if (com.gamericefishpro.space.u4.a.b == null) {
                                com.gamericefishpro.space.u4.a aVar = new com.gamericefishpro.space.u4.a();
                                try {
                                    com.gamericefishpro.space.u4.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, com.gamericefishpro.space.u4.a.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                com.gamericefishpro.space.u4.a.b = aVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                editText.setEditableFactory(com.gamericefishpro.space.u4.a.b);
                return;
            default:
                this.d = editText;
                this.e = new u(editText);
                return;
        }
    }

    @Override // com.gamericefishpro.space.f2.d1
    public void cancel() {
    }
}

package com.gamericefishpro.space.u6;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.f1.v;
import com.gamericefishpro.space.f2.d1;
import com.gamericefishpro.space.f2.e1;
import com.gamericefishpro.space.f2.h0;
import com.gamericefishpro.space.f2.z;
import com.gamericefishpro.space.h0.o0;
import com.gamericefishpro.space.h0.w0;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.i2.u0;
import com.gamericefishpro.space.i6.w;
import com.gamericefishpro.space.n9.w3;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.i1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class s implements com.gamericefishpro.space.e8.b, d1, u0, com.gamericefishpro.space.c6.b, com.gamericefishpro.space.t0.g, OnCompleteListener {
    public final /* synthetic */ int d;
    public Object e;
    public Object i;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    @Override // com.gamericefishpro.space.i2.u0
    public void a(View view, float[] fArr) {
        com.gamericefishpro.space.o1.o.s(fArr);
        n(view, fArr);
    }

    @Override // com.gamericefishpro.space.f2.d1
    public e1 apply() {
        h0 h0Var = (h0) this.e;
        z zVarH = h();
        if (zVarH != null) {
            h0Var.b(zVarH, false);
        }
        return h0Var.f(this.i);
    }

    @Override // com.gamericefishpro.space.f2.d1
    public boolean b(w0 w0Var) {
        z zVarH = h();
        i1 i1Var = zVarH != null ? zVarH.f : null;
        if (i1Var == null || i1Var.c()) {
            return true;
        }
        h0 h0Var = (h0) this.e;
        com.gamericefishpro.space.f1.g gVarE = v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        com.gamericefishpro.space.f1.g gVarH = v.h(gVarE);
        try {
            f0 f0Var = h0Var.d;
            f0Var.K = true;
            try {
                boolean zE = i1Var.e(w0Var);
                f0Var.K = false;
                v.k(gVarE, gVarH, function1E);
                return zE;
            } catch (Throwable th) {
                zVarH.getClass();
                throw th;
            }
        } catch (Throwable th2) {
            v.k(gVarE, gVarH, function1E);
            throw th2;
        }
    }

    public void c(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.e).add(com.gamericefishpro.space.m5.a.j(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // com.gamericefishpro.space.f2.d1
    public void cancel() {
        switch (this.d) {
            case 2:
                z zVarH = h();
                if ((zVarH != null ? zVarH.f : null) != null) {
                    h0.a((h0) this.e, this.i);
                }
                break;
            default:
                if (!((com.gamericefishpro.space.b1.a) this.i).compareAndSet(1, 1)) {
                    ((com.gamericefishpro.space.b1.b) this.e).invoke();
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.f2.d1
    public boolean d() {
        i1 i1Var;
        z zVarH = h();
        if (zVarH == null || (i1Var = zVarH.f) == null) {
            return true;
        }
        return i1Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099 A[Catch: all -> 0x009a, TRY_ENTER, TryCatch #4 {all -> 0x009a, blocks: (B:46:0x0099, B:49:0x009c, B:50:0x009f), top: B:59:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[Catch: all -> 0x009a, TryCatch #4 {all -> 0x009a, blocks: (B:46:0x0099, B:49:0x009c, B:50:0x009f), top: B:59:0x0097 }] */
    @Override // com.gamericefishpro.space.c6.b
    public com.gamericefishpro.space.c6.a e(String fileName) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        com.gamericefishpro.space.s5.p pVar = (com.gamericefishpro.space.s5.p) this.i;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!Intrinsics.a(fileName, ":memory:")) {
            fileName = pVar.c.a.getDatabasePath(fileName).getAbsolutePath();
            Intrinsics.b(fileName);
        }
        boolean z = false;
        com.gamericefishpro.space.t5.a aVar = new com.gamericefishpro.space.t5.a(fileName, (pVar.a || pVar.b || Intrinsics.a(fileName, ":memory:")) ? false : true);
        com.gamericefishpro.space.b1.b onLocked = new com.gamericefishpro.space.b1.b(pVar, this, fileName, 3);
        com.gamericefishpro.space.b2.z onLockError = new com.gamericefishpro.space.b2.z(4, fileName);
        Intrinsics.checkNotNullParameter(onLocked, "onLocked");
        Intrinsics.checkNotNullParameter(onLockError, "onLockError");
        ReentrantLock reentrantLock = aVar.a;
        reentrantLock.lock();
        l lVar = aVar.b;
        if (lVar != null) {
            try {
                lVar.j();
            } catch (Throwable th) {
                th = th;
                try {
                    if (z) {
                        throw th;
                    }
                    onLockError.invoke(th);
                    throw null;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                Object objInvoke = onLocked.invoke();
                if (lVar != null && (fileChannel2 = (FileChannel) lVar.e) != null) {
                    try {
                        fileChannel2.close();
                        lVar.e = null;
                    } catch (Throwable th3) {
                        lVar.e = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return (com.gamericefishpro.space.c6.a) objInvoke;
            } catch (Throwable th4) {
                if (lVar != null && (fileChannel = (FileChannel) lVar.e) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        lVar.e = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            z = true;
            if (z) {
                throw th;
            }
            onLockError.invoke(th);
            throw null;
        }
    }

    public Bundle f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) this.e;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bVar.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle source = bVar.f;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle bundleB = f.n(key, source) ? f.B(key, source) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            bVar.f = null;
        }
        return bundleB;
    }

    public List g() {
        ArrayList arrayList;
        if (((ArrayList) this.e).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.e)) {
            arrayList = new ArrayList((ArrayList) this.e);
        }
        return arrayList;
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        return new com.gamericefishpro.space.d8.d((Context) ((com.gamericefishpro.space.e4.g) this.e).d, (com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.vb.c) this.i).get());
    }

    public z h() {
        h0 h0Var = (h0) this.e;
        f0 f0Var = (f0) h0Var.C.g(this.i);
        if (f0Var != null) {
            return (z) h0Var.y.g(f0Var);
        }
        return null;
    }

    public com.gamericefishpro.space.z5.d i() {
        com.gamericefishpro.space.z5.d dVar;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) this.e;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        synchronized (bVar.c) {
            Iterator it = bVar.d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                com.gamericefishpro.space.z5.d dVar2 = (com.gamericefishpro.space.z5.d) entry.getValue();
                if (Intrinsics.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public ArrayList j(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.e;
        com.gamericefishpro.space.s5.v vVarB = com.gamericefishpro.space.s5.v.b(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            vVarB.p(1);
        } else {
            vVarB.i(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public AutofillId k(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return w.c(com.gamericefishpro.space.k2.a.d(this.e), ((View) this.i).getAutofillId(), j);
        }
        return null;
    }

    public void l(String key, com.gamericefishpro.space.z5.d provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) this.e;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (bVar.c) {
            if (bVar.d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.d.put(key, provider);
            Unit unit = Unit.a;
        }
    }

    public void m() {
        Intrinsics.checkNotNullParameter(com.gamericefishpro.space.z4.l.class, "clazz");
        if (!((com.gamericefishpro.space.b6.b) this.e).h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        com.gamericefishpro.space.z5.a aVar = (com.gamericefishpro.space.z5.a) this.i;
        if (aVar == null) {
            aVar = new com.gamericefishpro.space.z5.a(this);
        }
        this.i = aVar;
        try {
            com.gamericefishpro.space.z4.l.class.getDeclaredConstructor(null);
            com.gamericefishpro.space.z5.a aVar2 = (com.gamericefishpro.space.z5.a) this.i;
            if (aVar2 != null) {
                String className = com.gamericefishpro.space.z4.l.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                aVar2.a.add(className);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + com.gamericefishpro.space.z4.l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public void n(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.e;
        Object parent = view.getParent();
        if (parent instanceof View) {
            n((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            com.gamericefishpro.space.o1.o.s(fArr2);
            com.gamericefishpro.space.o1.o.E(fArr2, f, f2);
            com.gamericefishpro.space.i2.f0.o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            com.gamericefishpro.space.o1.o.s(fArr2);
            com.gamericefishpro.space.o1.o.E(fArr2, left, top);
            com.gamericefishpro.space.i2.f0.o(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.i;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            com.gamericefishpro.space.o1.o.s(fArr2);
            com.gamericefishpro.space.o1.o.E(fArr2, f3, f4);
            com.gamericefishpro.space.i2.f0.o(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            com.gamericefishpro.space.o1.o.s(fArr2);
            com.gamericefishpro.space.o1.o.E(fArr2, f5, f6);
            com.gamericefishpro.space.i2.f0.o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        com.gamericefishpro.space.o1.o.t(fArr2, matrix);
        com.gamericefishpro.space.i2.f0.o(fArr, fArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(float f, com.gamericefishpro.space.c3.c cVar, x xVar) {
        if (f <= cVar.r(o0.a)) {
            return;
        }
        com.gamericefishpro.space.f1.g gVarE = v.e();
        com.gamericefishpro.space.th.a aVar = null;
        Object[] objArr = 0;
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        com.gamericefishpro.space.f1.g gVarH = v.h(gVarE);
        try {
            float fFloatValue = ((Number) ((com.gamericefishpro.space.w.j) this.i).e.getValue()).floatValue();
            s1 s1Var = (s1) this.e;
            if (s1Var != null) {
                s1Var.c(null);
            }
            com.gamericefishpro.space.w.j jVar = (com.gamericefishpro.space.w.j) this.i;
            if (jVar.y) {
                this.i = com.gamericefishpro.space.w.c.i(jVar, fFloatValue - f);
            } else {
                this.i = new com.gamericefishpro.space.w.j(com.gamericefishpro.space.w.c.j, Float.valueOf(-f), objArr == true ? 1 : 0, 60);
            }
            this.e = a0.u(xVar, null, new e0(this, aVar, 5), 3);
            Unit unit = Unit.a;
        } finally {
            v.k(gVarE, gVarH, function1E);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((Map) ((c) this.i).e).remove((com.gamericefishpro.space.r9.h) this.e);
    }

    public String toString() {
        switch (this.d) {
            case 15:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.i.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(int i, boolean z) {
        this.d = i;
    }

    public s(c cVar, com.gamericefishpro.space.r9.h hVar) {
        this.d = 14;
        this.i = cVar;
        this.e = hVar;
    }

    public s(IBinder iBinder) throws RemoteException {
        this.d = 10;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.e = new Messenger(iBinder);
            this.i = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.i = new com.gamericefishpro.space.r8.g(iBinder);
            this.e = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public s(w3 w3Var) {
        this.d = 7;
        this.i = w3Var;
    }

    public /* synthetic */ s(Object obj) {
        this.d = 15;
        this.i = obj;
        this.e = new ArrayList();
    }

    public s(com.gamericefishpro.space.b6.b impl) {
        this.d = 17;
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.e = impl;
    }

    public s(WorkDatabase_Impl database) {
        this.d = 0;
        this.e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.i = new b(database, 6);
        new h(database, 16);
    }

    public s(com.gamericefishpro.space.b1.b bVar) {
        this.d = 12;
        this.e = bVar;
        this.i = new com.gamericefishpro.space.b1.a(0);
    }

    public s(int i) {
        this.d = i;
        switch (i) {
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                this.e = new LinkedHashMap();
                this.i = new LinkedHashMap();
                break;
            case 9:
                this.e = Choreographer.getInstance();
                this.i = Looper.myLooper();
                break;
            case 16:
                this.e = new ArrayList();
                this.i = new HashMap();
                new HashMap();
                break;
            default:
                l lVar = com.gamericefishpro.space.w.c.j;
                Float fValueOf = Float.valueOf(0.0f);
                this.i = new com.gamericefishpro.space.w.j(lVar, fValueOf, (com.gamericefishpro.space.w.o) ((Function1) lVar.d).invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    public s(com.gamericefishpro.space.s5.p pVar, com.gamericefishpro.space.c6.b actual) {
        this.d = 11;
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.i = pVar;
        this.e = actual;
    }

    public s(float[] fArr) {
        this.d = 4;
        this.e = fArr;
        this.i = new int[2];
    }
}

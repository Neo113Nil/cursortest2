package com.gamericefishpro.space.u6;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import androidx.work.impl.WorkDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.gamericefishpro.space.n9.l1;
import com.gamericefishpro.space.r5.a0;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.s0;
import com.gamericefishpro.space.r5.t0;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.s5.v;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InstallReferrerStateListener, com.gamericefishpro.space.sa.h {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static e b(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new e(8, channel, fileLockLock);
                } catch (IOException e) {
                    e = e;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e4) {
                e = e4;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e5) {
            e = e5;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // com.gamericefishpro.space.sa.i
    public Object a() {
        return new com.gamericefishpro.space.qa.g(((com.gamericefishpro.space.b9.b) this.b).a, (com.gamericefishpro.space.sa.o) ((com.gamericefishpro.space.sa.g) this.c).a(), new com.gamericefishpro.space.qa.d(4));
    }

    public boolean c() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public boolean d(j id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.b) {
            zContainsKey = ((LinkedHashMap) this.c).containsKey(id);
        }
        return zContainsKey;
    }

    public View e(int i, int i2, int i3, int i4) {
        int iX;
        int i5;
        int iY;
        View viewP;
        int left;
        int i6;
        int right;
        int i7;
        t0 t0Var = (t0) this.c;
        a0 a0Var = (a0) this.b;
        switch (a0Var.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                iX = a0Var.b.x();
                break;
            default:
                iX = a0Var.b.z();
                break;
        }
        switch (a0Var.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = a0Var.b;
                i5 = b0Var.i;
                iY = b0Var.y();
                break;
            default:
                b0 b0Var2 = a0Var.b;
                i5 = b0Var2.j;
                iY = b0Var2.w();
                break;
        }
        int i8 = i5 - iY;
        int i9 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (a0Var.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    viewP = a0Var.b.p(i);
                    break;
                default:
                    viewP = a0Var.b.p(i);
                    break;
            }
            switch (a0Var.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    c0 c0Var = (c0) viewP.getLayoutParams();
                    left = viewP.getLeft() - ((c0) viewP.getLayoutParams()).a.left;
                    i6 = ((ViewGroup.MarginLayoutParams) c0Var).leftMargin;
                    break;
                default:
                    c0 c0Var2 = (c0) viewP.getLayoutParams();
                    left = viewP.getTop() - ((c0) viewP.getLayoutParams()).a.top;
                    i6 = ((ViewGroup.MarginLayoutParams) c0Var2).topMargin;
                    break;
            }
            int i10 = left - i6;
            switch (a0Var.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    c0 c0Var3 = (c0) viewP.getLayoutParams();
                    right = viewP.getRight() + ((c0) viewP.getLayoutParams()).a.right;
                    i7 = ((ViewGroup.MarginLayoutParams) c0Var3).rightMargin;
                    break;
                default:
                    c0 c0Var4 = (c0) viewP.getLayoutParams();
                    right = viewP.getBottom() + ((c0) viewP.getLayoutParams()).a.bottom;
                    i7 = ((ViewGroup.MarginLayoutParams) c0Var4).bottomMargin;
                    break;
            }
            int i11 = right + i7;
            t0Var.b = iX;
            t0Var.c = i8;
            t0Var.d = i10;
            t0Var.e = i11;
            if (i3 != 0) {
                t0Var.a = i3;
                if (t0Var.a()) {
                    return viewP;
                }
            }
            if (i4 != 0) {
                t0Var.a = i4;
                if (t0Var.a()) {
                    view = viewP;
                }
            }
            i += i9;
        }
        return view;
    }

    public Long f(String str) {
        t tVar = (t) this.b;
        v vVarB = v.b(1, "SELECT long_value FROM Preference where `key`=?");
        vVarB.i(1, str);
        tVar.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(tVar, vVarB);
        try {
            Long lValueOf = null;
            if (cursorL.moveToFirst() && !cursorL.isNull(0)) {
                lValueOf = Long.valueOf(cursorL.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorL.close();
            vVarB.c();
        }
    }

    public void g(d dVar) {
        t tVar = (t) this.b;
        tVar.b();
        tVar.c();
        try {
            ((b) this.c).f(dVar);
            tVar.u();
        } finally {
            tVar.q();
        }
    }

    public void h() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public com.gamericefishpro.space.m6.j i(j id) {
        com.gamericefishpro.space.m6.j jVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.b) {
            jVar = (com.gamericefishpro.space.m6.j) ((LinkedHashMap) this.c).remove(id);
        }
        return jVar;
    }

    public List j(String workSpecId) {
        List listL;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (Intrinsics.a(((j) entry.getKey()).a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.c).remove((j) it.next());
                }
                listL = CollectionsKt.L(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listL;
    }

    public void k(int i, int i2, int i3, int i4) {
        com.gamericefishpro.space.s.a aVar = (com.gamericefishpro.space.s.a) this.c;
        aVar.v.set(i, i2, i3, i4);
        Rect rect = aVar.i;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public com.gamericefishpro.space.m6.j l(j id) {
        com.gamericefishpro.space.m6.j jVar;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                Object jVar2 = linkedHashMap.get(id);
                if (jVar2 == null) {
                    jVar2 = new com.gamericefishpro.space.m6.j(id);
                    linkedHashMap.put(id, jVar2);
                }
                jVar = (com.gamericefishpro.space.m6.j) jVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public void m() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.a;
        }
    }

    public int n(Context context, com.gamericefishpro.space.t8.a aVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        com.gamericefishpro.space.v8.c0.g(context);
        com.gamericefishpro.space.v8.c0.g(aVar);
        int iF = aVar.f();
        int i = sparseIntArray.get(iF, -1);
        if (i != -1) {
            return i;
        }
        int iB = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= sparseIntArray.size()) {
                iB = -1;
                break;
            }
            int iKeyAt = sparseIntArray.keyAt(i2);
            if (iKeyAt > iF && sparseIntArray.get(iKeyAt) == 0) {
                break;
            }
            i2++;
        }
        if (iB == -1) {
            iB = ((com.gamericefishpro.space.s8.f) this.c).b(context, iF);
        }
        sparseIntArray.put(iF, iB);
        return iB;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        com.gamericefishpro.space.pi.h hVar = (com.gamericefishpro.space.pi.h) this.c;
        if (hVar.w()) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith("organic");
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        com.gamericefishpro.space.pi.h hVar = (com.gamericefishpro.space.pi.h) this.c;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.b;
        String str = "organic";
        if (i == 0) {
            try {
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                if (installReferrer != null) {
                    str = installReferrer;
                }
            } catch (Exception unused) {
            }
        }
        try {
            installReferrerClient.endConnection();
        } catch (Exception unused2) {
        }
        if (hVar.w()) {
            com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
            hVar.resumeWith(str);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bounds{lower=" + ((com.gamericefishpro.space.u3.b) this.b) + " upper=" + ((com.gamericefishpro.space.u3.b) this.c) + "}";
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                String str = "[ ";
                if (((com.gamericefishpro.space.i3.f) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((com.gamericefishpro.space.i3.f) this.b).A[i] + " ";
                    }
                }
                return str + "] " + ((com.gamericefishpro.space.i3.f) this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public e(com.gamericefishpro.space.b9.b bVar, com.gamericefishpro.space.sa.g gVar, com.gamericefishpro.space.qa.d dVar) {
        this.a = 9;
        this.b = bVar;
        this.c = gVar;
    }

    public e(l1 l1Var, String str) {
        this.a = 7;
        this.b = str;
        this.c = l1Var;
    }

    public e(com.gamericefishpro.space.s8.f fVar) {
        this.a = 16;
        this.b = new SparseIntArray();
        com.gamericefishpro.space.v8.c0.g(fVar);
        this.c = fVar;
    }

    public e(WorkDatabase workDatabase) {
        this.a = 0;
        this.b = workDatabase;
        this.c = new b(workDatabase);
    }

    public e(int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.b = new com.gamericefishpro.space.u4.b();
                this.c = new s0(16);
                break;
            case 17:
                this.b = new com.gamericefishpro.space.c2.e(0);
                this.c = new com.gamericefishpro.space.c2.e(0);
                break;
            default:
                this.b = new Object();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public e(com.gamericefishpro.space.i2.o closeAction) {
        this.a = 13;
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }

    public e(View view) {
        this.a = 15;
        this.b = view;
        this.c = com.gamericefishpro.space.oh.i.a(com.gamericefishpro.space.oh.j.e, new com.gamericefishpro.space.a2.b(13, this));
    }

    public e(a0 a0Var) {
        this.a = 10;
        this.b = a0Var;
        t0 t0Var = new t0();
        t0Var.a = 0;
        this.c = t0Var;
    }

    public e(WindowInsetsAnimation.Bounds bounds) {
        this.a = 1;
        this.b = com.gamericefishpro.space.u3.b.c(bounds.getLowerBound());
        this.c = com.gamericefishpro.space.u3.b.c(bounds.getUpperBound());
    }
}

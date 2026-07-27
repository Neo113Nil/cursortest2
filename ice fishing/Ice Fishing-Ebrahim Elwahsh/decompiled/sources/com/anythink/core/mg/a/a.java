package com.anythink.core.mg.a;

import android.os.SystemClock;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;
import com.anythink.core.mg.api.MgAdInfo;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import com.anythink.core.mg.api.MgPreLoadCallback;
import com.anythink.core.mg.api.MgPreLoadCallbackRegister;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17743a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17744b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final Object f17745c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<MgComparedResult> f17747e = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f17746d = new ArrayList(2);

    private static boolean a(int i) {
        return i == 0 || i == 9 || i == 8 || i == 5;
    }

    private static boolean b(ar arVar, bv bvVar) {
        MgPreLoadAdRequest preLoadInfo;
        return (bvVar == null || arVar == null || arVar.b() == null || (preLoadInfo = arVar.b().getPreLoadInfo()) == null || !preLoadInfo.isEnableCpEcpm()) ? false : true;
    }

    public final void a(b bVar) {
        synchronized (this.f17745c) {
            this.f17746d.add(bVar);
        }
    }

    private void a(MgComparedResult mgComparedResult) {
        ArrayList arrayList;
        this.f17747e.set(mgComparedResult);
        if (this.f17746d.isEmpty() || !this.f17744b.compareAndSet(false, true)) {
            return;
        }
        q.a(Thread.currentThread().getStackTrace());
        if (mgComparedResult == null) {
            mgComparedResult = MgComparedResult.create();
        }
        synchronized (this.f17745c) {
            arrayList = new ArrayList(this.f17746d);
            this.f17746d.clear();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(mgComparedResult);
            }
        }
    }

    private bv b(bv bvVar) {
        MgComparedResult a9 = a();
        if (p.a(bvVar) > ((a9 == null || a9.getMgAdInfo() == null) ? 0.0d : a9.getMgAdInfo().getUSDEcpm())) {
            return bvVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MgPreLoadAdRequest mgPreLoadAdRequest, bv bvVar, MgAdInfo mgAdInfo, long j9, boolean z8) {
        MgComparedResult create = MgComparedResult.create(bvVar, mgAdInfo, j9 > 0 ? SystemClock.elapsedRealtime() - j9 : 0L, z8);
        if (mgPreLoadAdRequest != null) {
            mgPreLoadAdRequest.setMgComparedResult(create);
        }
        q.a(Thread.currentThread().getStackTrace());
        a(create);
    }

    public final MgComparedResult a() {
        return this.f17747e.get();
    }

    private boolean a(bv bvVar) {
        MgComparedResult a9 = a();
        if (a9 != null && a9.isMgWin()) {
            double uSDEcpm = a9.getMgAdInfo() != null ? a9.getMgAdInfo().getUSDEcpm() : 0.0d;
            if (uSDEcpm > 0.0d && p.a(bvVar) < uSDEcpm) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        a(com.anythink.core.mg.api.MgComparedResult.create());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ar arVar, final bv bvVar) {
        Throwable th;
        MgPreLoadAdRequest preLoadInfo;
        boolean z8 = false;
        if (bvVar != null && arVar != null) {
            try {
                if (arVar.b() != null && (preLoadInfo = arVar.b().getPreLoadInfo()) != null && preLoadInfo.isEnableCpEcpm()) {
                    z8 = true;
                }
            } catch (Throwable th2) {
                th = th2;
                th.getMessage();
                a(MgComparedResult.create());
            }
        }
        try {
            final MgPreLoadAdRequest preLoadInfo2 = arVar.b().getPreLoadInfo();
            MgPreLoadCallbackRegister preLoadCallbackRegister = preLoadInfo2 != null ? preLoadInfo2.getPreLoadCallbackRegister() : null;
            MgAdInfo mgAdInfo = preLoadCallbackRegister != null ? preLoadCallbackRegister.getMgAdInfo() : null;
            if (preLoadCallbackRegister != null && !MgAdInfo.isMgAdInfoValid(mgAdInfo)) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                preLoadCallbackRegister.registerPreLoadCallback(new MgPreLoadCallback() { // from class: com.anythink.core.mg.a.a.1
                    @Override // com.anythink.core.mg.api.MgPreLoadCallback
                    public final void onMgAdInfo(MgAdInfo mgAdInfo2, boolean z9) {
                        String unused = a.f17743a;
                        a.this.a(preLoadInfo2, bvVar, mgAdInfo2, elapsedRealtime, z9);
                    }
                });
                preLoadCallbackRegister.startTimeoutCountDown(preLoadInfo2.getCpEcpmTimeout());
            } else {
                try {
                    a(preLoadInfo2, bvVar, mgAdInfo, 0L, false);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    th.getMessage();
                    a(MgComparedResult.create());
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}

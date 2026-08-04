package com.gamericefishpro.space.t5;

import com.gamericefishpro.space.n9.z;
import com.gamericefishpro.space.u6.l;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final z c = new z(27);
    public static final LinkedHashMap d = new LinkedHashMap();
    public final ReentrantLock a;
    public final l b;

    public a(String filename, boolean z) {
        ReentrantLock reentrantLock;
        l lVar;
        Intrinsics.checkNotNullParameter(filename, "filename");
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(filename);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(filename, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = reentrantLock;
        if (z) {
            Intrinsics.checkNotNullParameter(filename, "filename");
            lVar = new l();
            lVar.d = com.gamericefishpro.space.m5.a.h(filename, ".lck");
        } else {
            lVar = null;
        }
        this.b = lVar;
    }
}

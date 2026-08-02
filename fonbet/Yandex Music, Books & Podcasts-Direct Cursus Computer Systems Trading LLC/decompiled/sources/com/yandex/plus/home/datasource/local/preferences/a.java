package com.yandex.plus.home.datasource.local.preferences;

import android.content.Context;
import defpackage.i5f;
import defpackage.t9f;
import defpackage.x3f;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final String b;
    public final x3f c;
    public final kotlinx.coroutines.a d;
    public final ReentrantLock e;
    public final WeakHashMap f;

    public a(Context context, String str, i5f i5fVar, kotlinx.coroutines.a aVar) {
        i5fVar.getClass();
        aVar.getClass();
        this.a = context;
        this.b = str;
        this.c = i5fVar;
        this.d = aVar;
        this.e = new ReentrantLock();
        this.f = new WeakHashMap();
    }

    public final j a(t9f t9fVar, String str) {
        WeakHashMap weakHashMap = this.f;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            Object obj = weakHashMap.get(t9fVar);
            j jVar = obj instanceof j ? (j) obj : null;
            if (jVar == null) {
                j jVar2 = new j(this.a, this.b, str, t9fVar, this.c, this.d);
                weakHashMap.put(t9fVar, jVar2);
                jVar = jVar2;
            }
            reentrantLock.unlock();
            return jVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package com.yandex.plus.core.benchmark;

import defpackage.ezc;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class t {
    public final ezc a;
    public final androidx.core.app.q b;
    public final s c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Function1 function1, androidx.core.app.q qVar, s sVar) {
        this.a = (ezc) function1;
        this.b = qVar;
        this.c = sVar;
    }

    public final boolean a() {
        long nanoTime = System.nanoTime();
        AtomicReference atomicReference = this.c.a;
        o oVar = o.a;
        o oVar2 = o.b;
        while (!atomicReference.compareAndSet(oVar, oVar2)) {
            if (atomicReference.get() != oVar) {
                return false;
            }
        }
        this.c.b = nanoTime;
        return true;
    }
}

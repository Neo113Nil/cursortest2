package com.yandex.plus.pay.internal.feature.experiments.listener;

import com.yandex.plus.core.analytics.metrica.h;
import com.yandex.plus.metrica.utils.j;
import com.yandex.plus.metrica.utils.x;
import com.yandex.plus.metrica.utils.z;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class b implements Function2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public b(z zVar) {
        zVar.getClass();
        this.b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(com.yandex.plus.experiments.api.a aVar, Continuation continuation) {
        a aVar2;
        int i;
        int i2;
        b[] bVarArr;
        com.yandex.plus.experiments.api.a aVar3;
        int i3;
        int i4;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i5 = aVar2.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar2.q = i5 - Integer.MIN_VALUE;
                Object obj = aVar2.o;
                nm6 nm6Var = nm6.a;
                i = aVar2.q;
                if (i != 0) {
                    qgg.h0(obj);
                    b[] bVarArr2 = (b[]) this.b;
                    int length = bVarArr2.length;
                    i2 = 0;
                    bVarArr = bVarArr2;
                    aVar3 = aVar;
                    i3 = length;
                    i4 = 0;
                    if (i4 < i3) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = aVar2.n;
                    i4 = aVar2.m;
                    i2 = aVar2.l;
                    bVarArr = (b[]) aVar2.k;
                    com.yandex.plus.experiments.api.a aVar4 = aVar2.j;
                    qgg.h0(obj);
                    aVar3 = aVar4;
                    i4++;
                    if (i4 < i3) {
                        b bVar = bVarArr[i4];
                        aVar2.j = aVar3;
                        aVar2.k = bVarArr;
                        aVar2.l = i2;
                        aVar2.m = i4;
                        aVar2.n = i3;
                        aVar2.q = 1;
                        if (bVar.invoke(aVar3, aVar2) == nm6Var) {
                            return nm6Var;
                        }
                        i4++;
                        if (i4 < i3) {
                            return Unit.a;
                        }
                    }
                }
            }
        }
        aVar2 = new a(this, continuation);
        Object obj2 = aVar2.o;
        nm6 nm6Var2 = nm6.a;
        i = aVar2.q;
        if (i != 0) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return a((com.yandex.plus.experiments.api.a) obj, (Continuation) obj2);
            default:
                com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) obj;
                h k = ((x) ((z) this.b)).k();
                if (k != null) {
                    String str = null;
                    List list = aVar != null ? aVar.c : null;
                    j jVar = (j) k.a;
                    if (list != null) {
                        jVar.getClass();
                        str = CollectionsKt.X(list, ";", null, null, null, 62);
                    }
                    if (!Intrinsics.d(jVar.c, str)) {
                        ReentrantLock reentrantLock = jVar.a;
                        reentrantLock.lock();
                        try {
                            if (!Intrinsics.d(jVar.c, str)) {
                                jVar.c = str;
                                try {
                                    jVar.b();
                                } catch (Throwable th) {
                                    Timber.INSTANCE.tag("Metrica7RtmConfigUpdater").e("Can't update config for RTM!", th);
                                }
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th2) {
                            reentrantLock.unlock();
                            throw th2;
                        }
                    }
                }
                return Unit.a;
        }
    }

    public b(b[] bVarArr) {
        this.b = bVarArr;
    }
}

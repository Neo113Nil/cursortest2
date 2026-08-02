package com.yandex.plus.core.benchmark;

import defpackage.b6e;
import defpackage.pyc;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ j(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.a) {
            case 0:
                d dVar = (d) obj;
                long longValue = ((Long) obj2).longValue();
                long longValue2 = ((Long) obj3).longValue();
                dVar.getClass();
                int ordinal = dVar.ordinal();
                if (ordinal == 0) {
                    j = 0;
                } else if (ordinal == 1) {
                    this.b.c.getClass();
                    j = System.nanoTime() - longValue;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    j = longValue2 - longValue;
                }
                return Long.valueOf(j);
            default:
                l lVar = this.b;
                String str = lVar.a;
                d dVar2 = (d) obj;
                long longValue3 = ((Long) obj2).longValue();
                long longValue4 = ((Long) obj3).longValue();
                dVar2.getClass();
                int ordinal2 = dVar2.ordinal();
                if (ordinal2 == 0) {
                    return new e(str);
                }
                if (ordinal2 == 1) {
                    return new f(str, longValue3);
                }
                if (ordinal2 == 2) {
                    return new h(lVar.a, longValue3, longValue4);
                }
                b6e.s();
                return null;
        }
    }
}

package com.yandex.plus.home.internal.di;

import defpackage.dzf;
import defpackage.kyf;
import defpackage.uyf;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements uyf {
    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        ReentrantLock reentrantLock = s.a;
        int i = r.a[kyfVar.ordinal()];
        if (i == 1) {
            s.b.lock();
            try {
                s.b(s.f, true);
            } finally {
            }
        } else {
            if (i != 2) {
                return;
            }
            s.b.lock();
            try {
                s.b(s.f, false);
            } finally {
            }
        }
    }
}

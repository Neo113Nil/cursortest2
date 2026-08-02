package com.yandex.passport.legacy.lx;

import android.os.SystemClock;
import android.text.Editable;

/* loaded from: classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((b) this.b).mo1b(((c) this.c).call());
                    return;
                } catch (Throwable th) {
                    if (th instanceof VirtualMachineError) {
                        throw ((VirtualMachineError) th);
                    }
                    if (th instanceof ThreadDeath) {
                        throw ((ThreadDeath) th);
                    }
                    if (th instanceof LinkageError) {
                        throw ((LinkageError) th);
                    }
                    ((b) this.d).mo1b(th);
                    return;
                }
            default:
                if (SystemClock.elapsedRealtime() - ((com.yandex.plus.core.debug.panel.internal.utils.ext.a) this.b).a >= 400) {
                    ((com.yandex.plus.core.debug.panel.internal.presentation.view.g) this.c).invoke((Editable) this.d);
                    return;
                }
                return;
        }
    }
}

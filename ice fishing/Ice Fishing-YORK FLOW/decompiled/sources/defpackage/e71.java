package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class e71 implements defpackage.kl, defpackage.um {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater oh71FJcDz6S2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.e71.class, java.lang.Object.class, "result");
    public final defpackage.kl WDYagTQQm9ns;
    private volatile java.lang.Object result;

    public e71(defpackage.kl klVar) {
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        this.WDYagTQQm9ns = klVar;
        this.result = tmVar;
    }

    @Override // defpackage.um
    public final defpackage.um WDYagTQQm9ns() {
        defpackage.kl klVar = this.WDYagTQQm9ns;
        if (klVar instanceof defpackage.um) {
            return (defpackage.um) klVar;
        }
        return null;
    }

    @Override // defpackage.kl
    public final void e6mdH7fiFuta(java.lang.Object obj) {
        while (true) {
            java.lang.Object obj2 = this.result;
            defpackage.tm tmVar = defpackage.tm.oh71FJcDz6S2;
            if (obj2 == tmVar) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = oh71FJcDz6S2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, tmVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != tmVar) {
                        break;
                    }
                }
                return;
            }
            defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
            if (obj2 != tmVar2) {
                defpackage.h7.P05cfTpS5W5L("Already resumed");
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oh71FJcDz6S2;
            defpackage.tm tmVar3 = defpackage.tm.QiMR8OkAhezm;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, tmVar2, tmVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != tmVar2) {
                    break;
                }
            }
            this.WDYagTQQm9ns.e6mdH7fiFuta(obj);
            return;
        }
    }

    @Override // defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        return this.WDYagTQQm9ns.oh71FJcDz6S2();
    }

    public final java.lang.String toString() {
        return "SafeContinuation for " + this.WDYagTQQm9ns;
    }
}

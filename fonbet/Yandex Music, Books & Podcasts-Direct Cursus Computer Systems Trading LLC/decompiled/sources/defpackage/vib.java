package defpackage;

import java.util.Queue;

/* loaded from: classes5.dex */
public final class vib extends mwf {
    private static final long serialVersionUID = -176083308134819629L;
    public String a;
    public gpr b;
    public Queue c;

    @Override // defpackage.nsg
    public final boolean b() {
        return true;
    }

    @Override // defpackage.nsg
    public final boolean c() {
        return true;
    }

    @Override // defpackage.nsg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.nsg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.nsg
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.nsg
    public final boolean j() {
        return true;
    }

    @Override // defpackage.h7
    public final void n(int i, Object[] objArr) {
        hpr hprVar = new hpr();
        System.currentTimeMillis();
        hprVar.a = i;
        hprVar.b = this.b;
        Thread.currentThread().getName();
        hprVar.c = objArr;
        this.c.add(hprVar);
    }
}

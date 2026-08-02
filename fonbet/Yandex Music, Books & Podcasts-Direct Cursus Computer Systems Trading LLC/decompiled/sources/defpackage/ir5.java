package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ir5 extends dgu {
    public final /* synthetic */ int a;
    public final Object b;

    public ir5() {
        this.a = 0;
        this.b = new ArrayList(3);
    }

    @Override // defpackage.dgu
    public void a(int i) {
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((dgu) it.next()).a(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    b6e.o("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0018, code lost:
    
        if (r5 > 1.0f) goto L8;
     */
    @Override // defpackage.dgu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, float f, int i2) {
        hb9 currentAdapter;
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((dgu) it.next()).b(i, f, i2);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    b6e.o("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            default:
                n2k n2kVar = (n2k) this.b;
                tje tjeVar = n2kVar.a;
                if (tjeVar != null) {
                    float f2 = 0.0f;
                    if (f >= 0.0f) {
                        f2 = 1.0f;
                        break;
                    }
                    f = f2;
                    currentAdapter = n2kVar.getCurrentAdapter();
                    if (currentAdapter != null) {
                        i = currentAdapter.C(i);
                    }
                    tjeVar.m = i;
                    tjeVar.n = f;
                    tjeVar.c.f(i, f);
                    tjeVar.a(i, f);
                    n2kVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dgu
    public final void c(int i) {
        hb9 currentAdapter;
        switch (this.a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((dgu) it.next()).c(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    b6e.o("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            default:
                n2k n2kVar = (n2k) this.b;
                tje tjeVar = n2kVar.a;
                if (tjeVar != null) {
                    currentAdapter = n2kVar.getCurrentAdapter();
                    if (currentAdapter != null) {
                        i = currentAdapter.C(i);
                    }
                    tjeVar.m = i;
                    tjeVar.n = 0.0f;
                    tjeVar.c.b(i);
                    tjeVar.a(i, 0.0f);
                    n2kVar.invalidate();
                    break;
                }
                break;
        }
    }

    public ir5(n2k n2kVar) {
        this.a = 1;
        this.b = n2kVar;
    }
}

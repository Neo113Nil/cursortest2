package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class uyw extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean b;
    public final AtomicReference c;
    public final fsn d;
    public final pmd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyw(vyf vyfVar) {
        super(vyfVar);
        pmd pmdVar = pmd.e;
        this.c = new AtomicReference(null);
        this.d = new fsn(Looper.getMainLooper(), 1);
        this.e = pmdVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.c;
        pyw pywVar = (pyw) atomicReference.get();
        if (i != 1) {
            if (i == 2) {
                int b = this.e.b(b(), qmd.a);
                if (b == 0) {
                    atomicReference.set(null);
                    l();
                    return;
                } else {
                    if (pywVar == null) {
                        return;
                    }
                    if (pywVar.b.b == 18 && b == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            l();
            return;
        } else if (i2 == 0) {
            if (pywVar != null) {
                h66 h66Var = new h66(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, pywVar.b.toString());
                int i3 = pywVar.a;
                atomicReference.set(null);
                k(h66Var, i3);
                return;
            }
            return;
        }
        if (pywVar != null) {
            h66 h66Var2 = pywVar.b;
            int i4 = pywVar.a;
            atomicReference.set(null);
            k(h66Var2, i4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new pyw(new h66(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h(Bundle bundle) {
        pyw pywVar = (pyw) this.c.get();
        if (pywVar == null) {
            return;
        }
        h66 h66Var = pywVar.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", pywVar.a);
        bundle.putInt("failed_status", h66Var.b);
        bundle.putParcelable("failed_resolution", h66Var.c);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void i() {
        this.b = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        this.b = false;
    }

    public abstract void k(h66 h66Var, int i);

    public abstract void l();

    public final void m(h66 h66Var, int i) {
        pyw pywVar = new pyw(h66Var, i);
        while (true) {
            AtomicReference atomicReference = this.c;
            if (atomicReference.compareAndSet(null, pywVar)) {
                this.d.post(new rxw(1, this, pywVar));
                return;
            } else if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        h66 h66Var = new h66(13, null);
        AtomicReference atomicReference = this.c;
        pyw pywVar = (pyw) atomicReference.get();
        int i = pywVar == null ? -1 : pywVar.a;
        atomicReference.set(null);
        k(h66Var, i);
    }
}

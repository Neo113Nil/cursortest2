package androidx.fragment.app;

import B0.j;
import D1.h;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import Z.C0066n;
import Z.C0067o;
import Z.C0069q;
import Z.DialogInterfaceOnCancelListenerC0064l;
import Z.DialogInterfaceOnDismissListenerC0065m;
import Z.K;
import Z.M;
import Z.U;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.L;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import b.DialogC0114j;
import com.lumenpath.harispro.hrnavigator.R;
import h.AbstractActivityC0168i;
import h0.f;
import o.C0312c;
import o.C0315f;

/* loaded from: classes.dex */
public class DialogFragment extends AbstractComponentCallbacksC0070s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: W, reason: collision with root package name */
    public Handler f1963W;

    /* renamed from: X, reason: collision with root package name */
    public final j f1964X;

    /* renamed from: Y, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0064l f1965Y;

    /* renamed from: Z, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0065m f1966Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f1967a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f1968b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1969c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1970d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f1971e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1972f0;

    /* renamed from: g0, reason: collision with root package name */
    public final C0066n f1973g0;

    /* renamed from: h0, reason: collision with root package name */
    public Dialog f1974h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1975i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1976j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1977k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1978l0;

    public DialogFragment() {
        this.f1964X = new j(5, this);
        this.f1965Y = new DialogInterfaceOnCancelListenerC0064l(this);
        this.f1966Z = new DialogInterfaceOnDismissListenerC0065m(this);
        this.f1967a0 = 0;
        this.f1968b0 = 0;
        this.f1969c0 = true;
        this.f1970d0 = true;
        this.f1971e0 = -1;
        this.f1973g0 = new C0066n(this);
        this.f1978l0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public void A() {
        this.f1582D = true;
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            this.f1975i0 = false;
            dialog.show();
            View decorView = this.f1974h0.getWindow().getDecorView();
            L.f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            f.z(decorView, this);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public void B() {
        this.f1582D = true;
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void D(Bundle bundle) {
        Bundle bundle2;
        this.f1582D = true;
        if (this.f1974h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1974h0.onRestoreInstanceState(bundle2);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.f1584F != null || this.f1974h0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1974h0.onRestoreInstanceState(bundle2);
    }

    public void M() {
        N(false, false);
    }

    public final void N(boolean z2, boolean z3) {
        if (this.f1976j0) {
            return;
        }
        this.f1976j0 = true;
        this.f1977k0 = false;
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1974h0.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.f1963W.getLooper()) {
                    onDismiss(this.f1974h0);
                } else {
                    this.f1963W.post(this.f1964X);
                }
            }
        }
        this.f1975i0 = true;
        if (this.f1971e0 >= 0) {
            M j = j();
            int i = this.f1971e0;
            if (i < 0) {
                throw new IllegalArgumentException(h.e("Bad id: ", i));
            }
            j.v(new K(j, null, i), z2);
            this.f1971e0 = -1;
            return;
        }
        C0053a c0053a = new C0053a(j());
        c0053a.f1523p = true;
        M m2 = this.f1614s;
        if (m2 != null && m2 != c0053a.f1524q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0053a.b(new U(3, this));
        if (z2) {
            c0053a.d(true);
        } else {
            c0053a.d(false);
        }
    }

    public Dialog O() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0114j(H(), this.f1968b0);
    }

    public final Dialog P() {
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Q(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final R.j e() {
        return new C0067o(this, new C0069q(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1975i0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        N(true, true);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void q() {
        this.f1582D = true;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void s(AbstractActivityC0168i abstractActivityC0168i) {
        Object obj;
        super.s(abstractActivityC0168i);
        z zVar = this.f1594Q;
        zVar.getClass();
        z.a("observeForever");
        C0066n c0066n = this.f1973g0;
        w wVar = new w(zVar, c0066n);
        C0315f c0315f = zVar.f2061b;
        C0312c a2 = c0315f.a(c0066n);
        if (a2 != null) {
            obj = a2.f4118b;
        } else {
            C0312c c0312c = new C0312c(c0066n, wVar);
            c0315f.f4127d++;
            C0312c c0312c2 = c0315f.f4125b;
            if (c0312c2 == null) {
                c0315f.f4124a = c0312c;
                c0315f.f4125b = c0312c;
            } else {
                c0312c2.f4119c = c0312c;
                c0312c.f4120d = c0312c2;
                c0315f.f4125b = c0312c;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar instanceof x) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar == null) {
            wVar.b(true);
        }
        if (this.f1977k0) {
            return;
        }
        this.f1976j0 = false;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public void t(Bundle bundle) {
        super.t(bundle);
        this.f1963W = new Handler();
        this.f1970d0 = this.f1619x == 0;
        if (bundle != null) {
            this.f1967a0 = bundle.getInt("android:style", 0);
            this.f1968b0 = bundle.getInt("android:theme", 0);
            this.f1969c0 = bundle.getBoolean("android:cancelable", true);
            this.f1970d0 = bundle.getBoolean("android:showsDialog", this.f1970d0);
            this.f1971e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public void v() {
        this.f1582D = true;
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            this.f1975i0 = true;
            dialog.setOnDismissListener(null);
            this.f1974h0.dismiss();
            if (!this.f1976j0) {
                onDismiss(this.f1974h0);
            }
            this.f1974h0 = null;
            this.f1978l0 = false;
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void w() {
        this.f1582D = true;
        if (!this.f1977k0 && !this.f1976j0) {
            this.f1976j0 = true;
        }
        C0066n c0066n = this.f1973g0;
        z zVar = this.f1594Q;
        zVar.getClass();
        z.a("removeObserver");
        y yVar = (y) zVar.f2061b.b(c0066n);
        if (yVar == null) {
            return;
        }
        yVar.c();
        yVar.b(false);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final LayoutInflater x(Bundle bundle) {
        LayoutInflater x2 = super.x(bundle);
        boolean z2 = this.f1970d0;
        if (!z2 || this.f1972f0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1970d0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return x2;
        }
        if (z2 && !this.f1978l0) {
            try {
                this.f1972f0 = true;
                Dialog O2 = O();
                this.f1974h0 = O2;
                if (this.f1970d0) {
                    Q(O2, this.f1967a0);
                    Context h2 = h();
                    if (h2 instanceof Activity) {
                        this.f1974h0.setOwnerActivity((Activity) h2);
                    }
                    this.f1974h0.setCancelable(this.f1969c0);
                    this.f1974h0.setOnCancelListener(this.f1965Y);
                    this.f1974h0.setOnDismissListener(this.f1966Z);
                    this.f1978l0 = true;
                } else {
                    this.f1974h0 = null;
                }
                this.f1972f0 = false;
            } catch (Throwable th) {
                this.f1972f0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1974h0;
        return dialog != null ? x2.cloneInContext(dialog.getContext()) : x2;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public void z(Bundle bundle) {
        Dialog dialog = this.f1974h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1967a0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1968b0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1969c0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1970d0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1971e0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public DialogFragment(int i) {
        this.f1596S = i;
        this.f1964X = new j(5, this);
        this.f1965Y = new DialogInterfaceOnCancelListenerC0064l(this);
        this.f1966Z = new DialogInterfaceOnDismissListenerC0065m(this);
        this.f1967a0 = 0;
        this.f1968b0 = 0;
        this.f1969c0 = true;
        this.f1970d0 = true;
        this.f1971e0 = -1;
        this.f1973g0 = new C0066n(this);
        this.f1978l0 = false;
    }
}

package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0475n extends AbstractComponentCallbacksC0479s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public int f4969A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f4970B0;
    public final n4.c C0;

    /* renamed from: D0, reason: collision with root package name */
    public Dialog f4971D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4972E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f4973F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f4974G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f4975H0;

    /* renamed from: u0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0472k f4976u0;

    /* renamed from: v0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0473l f4977v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4978w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4979x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4980y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f4981z0;

    public DialogInterfaceOnCancelListenerC0475n() {
        new G0.c(15, this);
        this.f4976u0 = new DialogInterfaceOnCancelListenerC0472k(0, this);
        this.f4977v0 = new DialogInterfaceOnDismissListenerC0473l(this);
        this.f4978w0 = 0;
        this.f4979x0 = 0;
        this.f4980y0 = true;
        this.f4981z0 = true;
        this.f4969A0 = -1;
        this.C0 = new n4.c(18, this);
        this.f4975H0 = false;
    }

    public Dialog C() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.q(y(), this.f4979x0);
    }

    public final Dialog D() {
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final X2.a a() {
        return new C0474m(this, new C0478q(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void l() {
        this.f5016V = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void n(AbstractActivityC0484x abstractActivityC0484x) {
        super.n(abstractActivityC0484x);
        this.f5027p0.d(this.C0);
        if (this.f4974G0) {
            return;
        }
        this.f4973F0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public void o(Bundle bundle) {
        super.o(bundle);
        new Handler();
        this.f4981z0 = this.f5010P == 0;
        if (bundle != null) {
            this.f4978w0 = bundle.getInt("android:style", 0);
            this.f4979x0 = bundle.getInt("android:theme", 0);
            this.f4980y0 = bundle.getBoolean("android:cancelable", true);
            this.f4981z0 = bundle.getBoolean("android:showsDialog", this.f4981z0);
            this.f4969A0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4972E0) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4973F0) {
            return;
        }
        this.f4973F0 = true;
        this.f4974G0 = false;
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4971D0.dismiss();
        }
        this.f4972E0 = true;
        if (this.f4969A0 >= 0) {
            N f2 = f();
            int i = this.f4969A0;
            if (i < 0) {
                throw new IllegalArgumentException(Wv.f(i, "Bad id: "));
            }
            f2.v(new M(f2, i), true);
            this.f4969A0 = -1;
            return;
        }
        C0462a c0462a = new C0462a(f());
        c0462a.f4910o = true;
        N n9 = this.f5005K;
        if (n9 == null || n9 == c0462a.f4911p) {
            c0462a.b(new W(3, this));
            c0462a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void q() {
        this.f5016V = true;
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            this.f4972E0 = true;
            dialog.setOnDismissListener(null);
            this.f4971D0.dismiss();
            if (!this.f4973F0) {
                onDismiss(this.f4971D0);
            }
            this.f4971D0 = null;
            this.f4975H0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void r() {
        this.f5016V = true;
        if (!this.f4974G0 && !this.f4973F0) {
            this.f4973F0 = true;
        }
        n4.c cVar = this.C0;
        androidx.lifecycle.C c9 = this.f5027p0;
        c9.getClass();
        androidx.lifecycle.C.a("removeObserver");
        androidx.lifecycle.B b9 = (androidx.lifecycle.B) c9.f5059b.c(cVar);
        if (b9 == null) {
            return;
        }
        b9.c();
        b9.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater s(Bundle bundle) {
        Context d9;
        LayoutInflater s9 = super.s(bundle);
        boolean z6 = this.f4981z0;
        if (z6 && !this.f4970B0) {
            if (z6 && !this.f4975H0) {
                try {
                    this.f4970B0 = true;
                    Dialog C8 = C();
                    this.f4971D0 = C8;
                    if (this.f4981z0) {
                        int i = this.f4978w0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = C8.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                d9 = d();
                                if (d9 instanceof Activity) {
                                    this.f4971D0.setOwnerActivity((Activity) d9);
                                }
                                this.f4971D0.setCancelable(this.f4980y0);
                                this.f4971D0.setOnCancelListener(this.f4976u0);
                                this.f4971D0.setOnDismissListener(this.f4977v0);
                                this.f4975H0 = true;
                            }
                        }
                        C8.requestWindowFeature(1);
                        d9 = d();
                        if (d9 instanceof Activity) {
                        }
                        this.f4971D0.setCancelable(this.f4980y0);
                        this.f4971D0.setOnCancelListener(this.f4976u0);
                        this.f4971D0.setOnDismissListener(this.f4977v0);
                        this.f4975H0 = true;
                    } else {
                        this.f4971D0 = null;
                    }
                    this.f4970B0 = false;
                } catch (Throwable th) {
                    this.f4970B0 = false;
                    throw th;
                }
            }
            if (N.E(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4971D0;
            if (dialog != null) {
                return s9.cloneInContext(dialog.getContext());
            }
        } else if (N.E(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4981z0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return s9;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return s9;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public void t(Bundle bundle) {
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f4978w0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i4 = this.f4979x0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z6 = this.f4980y0;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z9 = this.f4981z0;
        if (!z9) {
            bundle.putBoolean("android:showsDialog", z9);
        }
        int i6 = this.f4969A0;
        if (i6 != -1) {
            bundle.putInt("android:backStackId", i6);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public void u() {
        this.f5016V = true;
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            this.f4972E0 = false;
            dialog.show();
            View decorView = this.f4971D0.getWindow().getDecorView();
            kotlin.jvm.internal.h.e(decorView, "<this>");
            decorView.setTag(C5248R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C5248R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C5248R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public void v() {
        this.f5016V = true;
        Dialog dialog = this.f4971D0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void w(Bundle bundle) {
        Bundle bundle2;
        this.f5016V = true;
        if (this.f4971D0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4971D0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.f5018X != null || this.f4971D0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4971D0.onRestoreInstanceState(bundle2);
    }
}

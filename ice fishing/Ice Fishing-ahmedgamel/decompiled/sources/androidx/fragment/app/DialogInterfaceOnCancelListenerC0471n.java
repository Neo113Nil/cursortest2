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
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g1.C4523c;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0471n extends AbstractComponentCallbacksC0475s implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0469l f5001A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f5002B0;
    public int C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f5003D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5004E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f5005F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f5006G0;

    /* renamed from: H0, reason: collision with root package name */
    public final C4523c f5007H0;

    /* renamed from: I0, reason: collision with root package name */
    public Dialog f5008I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f5009J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f5010K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f5011L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5012M0;

    /* renamed from: z0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC0468k f5013z0;

    public DialogInterfaceOnCancelListenerC0471n() {
        new G0.c(16, this);
        this.f5013z0 = new DialogInterfaceOnCancelListenerC0468k(0, this);
        this.f5001A0 = new DialogInterfaceOnDismissListenerC0469l(this);
        this.f5002B0 = 0;
        this.C0 = 0;
        this.f5003D0 = true;
        this.f5004E0 = true;
        this.f5005F0 = -1;
        this.f5007H0 = new C4523c(13, this);
        this.f5012M0 = false;
    }

    public Dialog C() {
        if (N.E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.q(y(), this.C0);
    }

    public final Dialog D() {
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final S0.f a() {
        return new C0470m(this, new C0474q(this));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void l() {
        this.f5048V = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void n(AbstractActivityC0480x abstractActivityC0480x) {
        super.n(abstractActivityC0480x);
        this.f5061u0.d(this.f5007H0);
        if (this.f5011L0) {
            return;
        }
        this.f5010K0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public void o(Bundle bundle) {
        super.o(bundle);
        new Handler();
        this.f5004E0 = this.f5042P == 0;
        if (bundle != null) {
            this.f5002B0 = bundle.getInt("android:style", 0);
            this.C0 = bundle.getInt("android:theme", 0);
            this.f5003D0 = bundle.getBoolean("android:cancelable", true);
            this.f5004E0 = bundle.getBoolean("android:showsDialog", this.f5004E0);
            this.f5005F0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f5009J0) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f5010K0) {
            return;
        }
        this.f5010K0 = true;
        this.f5011L0 = false;
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f5008I0.dismiss();
        }
        this.f5009J0 = true;
        if (this.f5005F0 >= 0) {
            N f3 = f();
            int i = this.f5005F0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC4404f.e(i, "Bad id: "));
            }
            f3.v(new M(f3, i), true);
            this.f5005F0 = -1;
            return;
        }
        C0458a c0458a = new C0458a(f());
        c0458a.f4942o = true;
        N n9 = this.f5037K;
        if (n9 == null || n9 == c0458a.f4943p) {
            c0458a.b(new W(3, this));
            c0458a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void q() {
        this.f5048V = true;
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            this.f5009J0 = true;
            dialog.setOnDismissListener(null);
            this.f5008I0.dismiss();
            if (!this.f5010K0) {
                onDismiss(this.f5008I0);
            }
            this.f5008I0 = null;
            this.f5012M0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void r() {
        this.f5048V = true;
        if (!this.f5011L0 && !this.f5010K0) {
            this.f5010K0 = true;
        }
        C4523c c4523c = this.f5007H0;
        androidx.lifecycle.C c9 = this.f5061u0;
        c9.getClass();
        androidx.lifecycle.C.a("removeObserver");
        androidx.lifecycle.B b9 = (androidx.lifecycle.B) c9.f5092b.c(c4523c);
        if (b9 == null) {
            return;
        }
        b9.c();
        b9.b(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater s(Bundle bundle) {
        Context d2;
        LayoutInflater s9 = super.s(bundle);
        boolean z3 = this.f5004E0;
        if (z3 && !this.f5006G0) {
            if (z3 && !this.f5012M0) {
                try {
                    this.f5006G0 = true;
                    Dialog C8 = C();
                    this.f5008I0 = C8;
                    if (this.f5004E0) {
                        int i = this.f5002B0;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = C8.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                d2 = d();
                                if (d2 instanceof Activity) {
                                    this.f5008I0.setOwnerActivity((Activity) d2);
                                }
                                this.f5008I0.setCancelable(this.f5003D0);
                                this.f5008I0.setOnCancelListener(this.f5013z0);
                                this.f5008I0.setOnDismissListener(this.f5001A0);
                                this.f5012M0 = true;
                            }
                        }
                        C8.requestWindowFeature(1);
                        d2 = d();
                        if (d2 instanceof Activity) {
                        }
                        this.f5008I0.setCancelable(this.f5003D0);
                        this.f5008I0.setOnCancelListener(this.f5013z0);
                        this.f5008I0.setOnDismissListener(this.f5001A0);
                        this.f5012M0 = true;
                    } else {
                        this.f5008I0 = null;
                    }
                    this.f5006G0 = false;
                } catch (Throwable th) {
                    this.f5006G0 = false;
                    throw th;
                }
            }
            if (N.E(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f5008I0;
            if (dialog != null) {
                return s9.cloneInContext(dialog.getContext());
            }
        } else if (N.E(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f5004E0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return s9;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return s9;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public void t(Bundle bundle) {
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f5002B0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i6 = this.C0;
        if (i6 != 0) {
            bundle.putInt("android:theme", i6);
        }
        boolean z3 = this.f5003D0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z6 = this.f5004E0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i9 = this.f5005F0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public void u() {
        this.f5048V = true;
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            this.f5009J0 = false;
            dialog.show();
            View decorView = this.f5008I0.getWindow().getDecorView();
            kotlin.jvm.internal.h.e(decorView, "<this>");
            decorView.setTag(C5275R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(C5275R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(C5275R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public void v() {
        this.f5048V = true;
        Dialog dialog = this.f5008I0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void w(Bundle bundle) {
        Bundle bundle2;
        this.f5048V = true;
        if (this.f5008I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5008I0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.f5050X != null || this.f5008I0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f5008I0.onRestoreInstanceState(bundle2);
    }
}

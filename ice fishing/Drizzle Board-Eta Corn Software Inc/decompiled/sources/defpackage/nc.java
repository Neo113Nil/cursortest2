package defpackage;

import android.app.Activity;
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
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class nc extends li implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public o7 QT4Tf9Dt;
    public Handler TrssYQ34;
    public boolean dHozS53r;
    public boolean f7oeun2L;
    public boolean hGvurcGl;
    public boolean orhfF2Ya;
    public final i1 g2aRJUAd = new i1(3, this);
    public final jc ESscZ9M1 = new jc();
    public final kc VGmz0ccI = new kc(this);
    public int LfKQckgD = 0;
    public int pP9Y2m6O = 0;
    public boolean tef3qNMP = true;
    public boolean Sjrx9cEN = true;
    public int LvHlPNBd = -1;
    public final lc Wi7iiXC4 = new lc(this);
    public boolean uQ3KJUK5 = false;

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        o7 o7Var = this.QT4Tf9Dt;
        if (o7Var != null) {
            this.orhfF2Ya = true;
            o7Var.setOnDismissListener(null);
            this.QT4Tf9Dt.dismiss();
            if (!this.dHozS53r) {
                onDismiss(this.QT4Tf9Dt);
            }
            this.QT4Tf9Dt = null;
            this.uQ3KJUK5 = false;
        }
    }

    @Override // defpackage.li
    public final void Ey6iv0m0() {
        this.euDDoUNr = true;
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        Object obj;
        super.FySoLYna(context);
        nt ntVar = this.N8VPGzVC;
        ntVar.getClass();
        nt.qoPGr6Ce("observeForever");
        lc lcVar = this.Wi7iiXC4;
        zp zpVar = new zp(ntVar, lcVar);
        p40 p40Var = ntVar.NCTxEWno;
        m40 qoPGr6Ce = p40Var.qoPGr6Ce(lcVar);
        if (qoPGr6Ce != null) {
            obj = qoPGr6Ce.MdtA4re8;
        } else {
            m40 m40Var = new m40(lcVar, zpVar);
            p40Var.VgvYg0wo++;
            m40 m40Var2 = p40Var.MdtA4re8;
            if (m40Var2 == null) {
                p40Var.NCTxEWno = m40Var;
                p40Var.MdtA4re8 = m40Var;
            } else {
                m40Var2.wxUZMvaN = m40Var;
                m40Var.VgvYg0wo = m40Var2;
                p40Var.MdtA4re8 = m40Var;
            }
            obj = null;
        }
        bq bqVar = (bq) obj;
        if (bqVar instanceof aq) {
            m1.sjUBp5pO("Cannot add the same observer with different lifecycles");
            return;
        }
        if (bqVar == null) {
            zpVar.qoPGr6Ce(true);
        }
        if (this.f7oeun2L) {
            return;
        }
        this.dHozS53r = false;
    }

    @Override // defpackage.li
    public final w30 MdtA4re8() {
        return new mc(this, new ji(this));
    }

    @Override // defpackage.li
    public final void Mq3SeTnW(Bundle bundle) {
        o7 o7Var = this.QT4Tf9Dt;
        if (o7Var != null) {
            Bundle onSaveInstanceState = o7Var.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.LfKQckgD;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.pP9Y2m6O;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.tef3qNMP;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.Sjrx9cEN;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.LvHlPNBd;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.li
    public final void SgZGMMPL() {
        this.euDDoUNr = true;
        o7 o7Var = this.QT4Tf9Dt;
        if (o7Var != null) {
            o7Var.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001b, B:12:0x0024, B:13:0x0035, B:15:0x0046, B:20:0x005d, B:22:0x0063, B:23:0x006d, B:25:0x004f, B:27:0x0055, B:28:0x005a, B:29:0x0085), top: B:9:0x001b }] */
    @Override // defpackage.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater U0LaHZX7(Bundle bundle) {
        Context eVhOlqcC;
        LayoutInflater U0LaHZX7 = super.U0LaHZX7(bundle);
        boolean z = this.Sjrx9cEN;
        if (z && !this.hGvurcGl) {
            if (z && !this.uQ3KJUK5) {
                try {
                    this.hGvurcGl = true;
                    if (ej.ytu5o6f4(3)) {
                        Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
                    }
                    o7 o7Var = new o7(aZz0PFXp(), this.pP9Y2m6O);
                    this.QT4Tf9Dt = o7Var;
                    if (this.Sjrx9cEN) {
                        int i = this.LfKQckgD;
                        if (i != 1 && i != 2) {
                            if (i == 3) {
                                Window window = o7Var.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            } else {
                                eVhOlqcC = eVhOlqcC();
                                if (eVhOlqcC != null) {
                                    this.QT4Tf9Dt.setOwnerActivity((Activity) eVhOlqcC);
                                }
                                this.QT4Tf9Dt.setCancelable(this.tef3qNMP);
                                this.QT4Tf9Dt.setOnCancelListener(this.ESscZ9M1);
                                this.QT4Tf9Dt.setOnDismissListener(this.VGmz0ccI);
                                this.uQ3KJUK5 = true;
                            }
                        }
                        o7Var.requestWindowFeature(1);
                        eVhOlqcC = eVhOlqcC();
                        if (eVhOlqcC != null) {
                        }
                        this.QT4Tf9Dt.setCancelable(this.tef3qNMP);
                        this.QT4Tf9Dt.setOnCancelListener(this.ESscZ9M1);
                        this.QT4Tf9Dt.setOnDismissListener(this.VGmz0ccI);
                        this.uQ3KJUK5 = true;
                    } else {
                        this.QT4Tf9Dt = null;
                    }
                    this.hGvurcGl = false;
                } catch (Throwable th) {
                    this.hGvurcGl = false;
                    throw th;
                }
            }
            if (ej.ytu5o6f4(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            o7 o7Var2 = this.QT4Tf9Dt;
            if (o7Var2 != null) {
                return U0LaHZX7.cloneInContext(o7Var2.getContext());
            }
        } else if (ej.ytu5o6f4(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.Sjrx9cEN) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return U0LaHZX7;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return U0LaHZX7;
    }

    @Override // defpackage.li
    public final void eIA6dogk(Bundle bundle) {
        Bundle bundle2;
        this.euDDoUNr = true;
        if (this.QT4Tf9Dt == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.QT4Tf9Dt.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.li
    public final void euDDoUNr() {
        this.euDDoUNr = true;
        o7 o7Var = this.QT4Tf9Dt;
        if (o7Var != null) {
            this.orhfF2Ya = false;
            o7Var.show();
            View decorView = this.QT4Tf9Dt.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.li
    public final void gjV1z5T1(Bundle bundle) {
        super.gjV1z5T1(bundle);
        this.TrssYQ34 = new Handler();
        this.Sjrx9cEN = this.WYNAV5pd == 0;
        if (bundle != null) {
            this.LfKQckgD = bundle.getInt("android:style", 0);
            this.pP9Y2m6O = bundle.getInt("android:theme", 0);
            this.tef3qNMP = bundle.getBoolean("android:cancelable", true);
            this.Sjrx9cEN = bundle.getBoolean("android:showsDialog", this.Sjrx9cEN);
            this.LvHlPNBd = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.li
    public final void lwWCatUu() {
        this.euDDoUNr = true;
        if (!this.f7oeun2L && !this.dHozS53r) {
            this.dHozS53r = true;
        }
        nt ntVar = this.N8VPGzVC;
        ntVar.getClass();
        nt.qoPGr6Ce("removeObserver");
        bq bqVar = (bq) ntVar.NCTxEWno.NCTxEWno(this.Wi7iiXC4);
        if (bqVar == null) {
            return;
        }
        bqVar.NCTxEWno();
        bqVar.qoPGr6Ce(false);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.orhfF2Ya) {
            return;
        }
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        zCflySGU(true, true);
    }

    @Override // defpackage.li
    public final void pRiPUEwG(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.pRiPUEwG(layoutInflater, viewGroup, bundle);
        if (this.ytu5o6f4 != null || this.QT4Tf9Dt == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.QT4Tf9Dt.onRestoreInstanceState(bundle2);
    }

    public final void zCflySGU(boolean z, boolean z2) {
        if (this.dHozS53r) {
            return;
        }
        this.dHozS53r = true;
        this.f7oeun2L = false;
        o7 o7Var = this.QT4Tf9Dt;
        if (o7Var != null) {
            o7Var.setOnDismissListener(null);
            this.QT4Tf9Dt.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.TrssYQ34.getLooper()) {
                    onDismiss(this.QT4Tf9Dt);
                } else {
                    this.TrssYQ34.post(this.g2aRJUAd);
                }
            }
        }
        this.orhfF2Ya = true;
        if (this.LvHlPNBd >= 0) {
            ej ow5vqvCr = ow5vqvCr();
            int i = this.LvHlPNBd;
            if (i < 0) {
                m1.sjUBp5pO(q70.VgvYg0wo("Bad id: ", i));
                return;
            } else {
                ow5vqvCr.RXQxj5Oe(new cj(ow5vqvCr, null, i), z);
                this.LvHlPNBd = -1;
                return;
            }
        }
        n1 n1Var = new n1(ow5vqvCr());
        n1Var.sjUBp5pO = true;
        ej ejVar = this.Ey6iv0m0;
        if (ejVar != null && ejVar != n1Var.OxcuoDLp) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        n1Var.NCTxEWno(new ak(3, this));
        if (z) {
            n1Var.wxUZMvaN(true);
        } else {
            n1Var.wxUZMvaN(false);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }
}

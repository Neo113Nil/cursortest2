package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ax {
    public wi MdtA4re8;
    public final q0 NCTxEWno = new q0();
    public boolean P7K7Inc8;
    public OnBackInvokedDispatcher VgvYg0wo;
    public boolean b2ZJblxo;
    public final Runnable qoPGr6Ce;
    public final OnBackInvokedCallback wxUZMvaN;

    public ax(Runnable runnable) {
        OnBackInvokedCallback qoPGr6Ce;
        this.qoPGr6Ce = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                qoPGr6Ce = ww.qoPGr6Ce.qoPGr6Ce(new sw(this, 0), new sw(this, 1), new tw(this, 0), new tw(this, 1));
            } else {
                qoPGr6Ce = uw.qoPGr6Ce.qoPGr6Ce(new tw(this, 2));
            }
            this.wxUZMvaN = qoPGr6Ce;
        }
    }

    public final void MdtA4re8(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.VgvYg0wo;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.wxUZMvaN) == null) {
            return;
        }
        uw uwVar = uw.qoPGr6Ce;
        if (z && !this.P7K7Inc8) {
            uwVar.NCTxEWno(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.P7K7Inc8 = true;
        } else {
            if (z || !this.P7K7Inc8) {
                return;
            }
            uwVar.MdtA4re8(onBackInvokedDispatcher, onBackInvokedCallback);
            this.P7K7Inc8 = false;
        }
    }

    public final void NCTxEWno() {
        Object obj;
        q0 q0Var = this.NCTxEWno;
        ListIterator listIterator = q0Var.listIterator(q0Var.qoPGr6Ce());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((wi) obj).qoPGr6Ce) {
                    break;
                }
            }
        }
        wi wiVar = (wi) obj;
        this.MdtA4re8 = null;
        if (wiVar == null) {
            this.qoPGr6Ce.run();
            return;
        }
        switch (wiVar.wxUZMvaN) {
            case 0:
                ej ejVar = (ej) wiVar.VgvYg0wo;
                ejVar.gjV1z5T1(true);
                if (ejVar.Qr9iLBAD.qoPGr6Ce) {
                    ejVar.zCflySGU();
                    return;
                } else {
                    ejVar.b2ZJblxo.NCTxEWno();
                    return;
                }
            case 1:
                MainActivity mainActivity = (MainActivity) wiVar.VgvYg0wo;
                uu uuVar = mainActivity.euDDoUNr;
                if (uuVar == null) {
                    fn.ytu5o6f4("navController");
                    throw null;
                }
                pu P7K7Inc8 = uuVar.NCTxEWno.P7K7Inc8();
                if (P7K7Inc8 != null) {
                    int i = P7K7Inc8.MdtA4re8.qoPGr6Ce;
                    uu uuVar2 = mainActivity.euDDoUNr;
                    if (uuVar2 == null) {
                        fn.ytu5o6f4("navController");
                        throw null;
                    }
                    int i2 = uuVar2.NCTxEWno.b2ZJblxo().Qr9iLBAD.qoPGr6Ce;
                    if (!mainActivity.ytu5o6f4.contains(Integer.valueOf(i))) {
                        uu uuVar3 = mainActivity.euDDoUNr;
                        if (uuVar3 != null) {
                            uuVar3.wxUZMvaN();
                            return;
                        } else {
                            fn.ytu5o6f4("navController");
                            throw null;
                        }
                    }
                    if (i == i2) {
                        mainActivity.finish();
                        return;
                    }
                    uu uuVar4 = mainActivity.euDDoUNr;
                    if (uuVar4 == null) {
                        fn.ytu5o6f4("navController");
                        throw null;
                    }
                    gu guVar = uuVar4.NCTxEWno;
                    if (guVar.ow5vqvCr(i2, false, false)) {
                        guVar.NCTxEWno();
                        return;
                    }
                    return;
                }
                return;
            default:
                gu guVar2 = ((uu) wiVar.VgvYg0wo).NCTxEWno;
                if (guVar2.P7K7Inc8.isEmpty()) {
                    return;
                }
                pu P7K7Inc82 = guVar2.P7K7Inc8();
                P7K7Inc82.getClass();
                if (guVar2.ow5vqvCr(P7K7Inc82.MdtA4re8.qoPGr6Ce, true, false)) {
                    guVar2.NCTxEWno();
                    return;
                }
                return;
        }
    }

    public final void qoPGr6Ce(vo voVar, wi wiVar) {
        wiVar.getClass();
        xo b2ZJblxo = voVar.b2ZJblxo();
        if (b2ZJblxo.MdtA4re8 == po.NCTxEWno) {
            return;
        }
        wiVar.NCTxEWno.add(new xw(this, b2ZJblxo, wiVar));
        wxUZMvaN();
        wiVar.MdtA4re8 = new zw(0, this, ax.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void wxUZMvaN() {
        boolean z = this.b2ZJblxo;
        boolean z2 = false;
        q0 q0Var = this.NCTxEWno;
        if (q0Var == null || !q0Var.isEmpty()) {
            Iterator<E> it = q0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((wi) it.next()).qoPGr6Ce) {
                    z2 = true;
                    break;
                }
            }
        }
        this.b2ZJblxo = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        MdtA4re8(z2);
    }
}

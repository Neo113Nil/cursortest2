package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.t;
import com.appsflyer.AppsFlyerLib;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.wizard3.WizardActivity;

/* loaded from: classes3.dex */
public final class wcb extends jnb {
    public final jyr j;
    public final ybf k;
    public final jyr l;

    public wcb(e00 e00Var) {
        e00Var.getClass();
        this.j = btf.b(new ita(6, this));
        this.k = new ybf(ern.a(ldb.class), new pva(2, this), new pva(3, new vcb(this, e00Var)));
        this.l = btf.b(new vcb(e00Var, this));
    }

    public final jdb A() {
        return (jdb) this.l.getValue();
    }

    public final void B(tcb tcbVar) {
        if (!(tcbVar instanceof pcb)) {
            if (tcbVar instanceof rcb) {
                jdb A = A();
                A.b.a(wjb.LoginScreen);
                vni vniVar = (vni) A.c.a;
                ((xcb) A.d.getValue()).getClass();
                etg etgVar = new etg();
                etgVar.setArguments(cxb.K(new Pair("auto_login", Boolean.FALSE)));
                vniVar.b(etgVar);
                return;
            }
            if (tcbVar instanceof qcb) {
                jdb A2 = A();
                vni vniVar2 = (vni) A2.c.a;
                ((xcb) A2.d.getValue()).getClass();
                vniVar2.b(new nrj());
                return;
            }
            if (!(tcbVar instanceof scb)) {
                b6e.s();
                return;
            }
            jdb A3 = A();
            vni vniVar3 = (vni) A3.c.a;
            ((xcb) A3.d.getValue()).getClass();
            vniVar3.b(new lxr());
            return;
        }
        jdb A4 = A();
        pcb pcbVar = (pcb) tcbVar;
        boolean z = pcbVar.a;
        yxc yxcVar = pcbVar.b;
        A4.getClass();
        yxcVar.getClass();
        A4.b.a(wjb.MainScreen);
        nnk nnkVar = A4.a;
        t tVar = (t) nnkVar.a;
        wst wstVar = (wst) ((jyr) nnkVar.b).getValue();
        xxq d = yxcVar.d();
        wstVar.getClass();
        if (!((Boolean) wstVar.b(d).f(vye.e)).booleanValue()) {
            int i = WizardActivity.v;
            Intent intent = new Intent(tVar, (Class<?>) WizardActivity.class);
            intent.putExtra("show_onboarding", true);
            ArrayList arrayList = new ArrayList();
            lhs lhsVar = MainScreenActivity.Q0;
            arrayList.add(imp.J(tVar, null, null, null, 14));
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                xq0.q("No intents added to TaskStackBuilder; cannot startActivities");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                tVar.startActivities(intentArr, null);
            }
        } else if (z) {
            lhs lhsVar2 = MainScreenActivity.Q0;
            tVar.startActivity(imp.J(tVar, null, null, null, 14));
        }
        tVar.finish();
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Parcelable parcelable = requireArguments().getParcelable("EntryScreenEntryTypeKey");
            if (parcelable == null) {
                xq0.x("Required value was null.");
                return;
            }
            odb odbVar = (odb) parcelable;
            if (odbVar instanceof ndb) {
                jdb A = A();
                A.b.a(wjb.LoginScreen);
                vni vniVar = (vni) A.c.a;
                ((xcb) A.d.getValue()).getClass();
                etg etgVar = new etg();
                etgVar.setArguments(cxb.K(new Pair("auto_login", Boolean.TRUE)));
                vniVar.b(etgVar);
            } else {
                if (!(odbVar instanceof mdb)) {
                    b6e.s();
                    return;
                }
                jdb A2 = A();
                A2.b.a(wjb.LoginScreen);
                vni vniVar2 = (vni) A2.c.a;
                ((xcb) A2.d.getValue()).getClass();
                etg etgVar2 = new etg();
                etgVar2.setArguments(cxb.K(new Pair("auto_login", Boolean.FALSE)));
                vniVar2.b(etgVar2);
            }
        }
        final int i = 2;
        getParentFragmentManager().f0("EntryScreenCloseOnboardingKey", this, new fuc(this) { // from class: ucb
            public final /* synthetic */ wcb b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
            @Override // defpackage.fuc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void k(Bundle bundle2, String str) {
                tcb tcbVar;
                Object value;
                Object zcbVar;
                tcb tcbVar2;
                pcb pcbVar;
                Object value2;
                idb idbVar;
                tcb tcbVar3;
                Object value3;
                idb idbVar2;
                idb ddbVar;
                switch (i) {
                    case 0:
                        if (str.equals("EntryScreenCloseLoginKey")) {
                            Parcelable parcelable2 = (icb) bundle2.getParcelable("EntryScreenLoginResultKey");
                            if (parcelable2 == null) {
                                dfi.r("Login result must be not null. Fallback to failure", "EntryScreenFragment");
                                parcelable2 = gcb.a;
                            }
                            wcb wcbVar = this.b;
                            ldb ldbVar = (ldb) wcbVar.k.getValue();
                            xdr xdrVar = ldbVar.l;
                            if (!(parcelable2 instanceof hcb)) {
                                if (!(parcelable2 instanceof gcb)) {
                                    b6e.s();
                                    break;
                                } else {
                                    idb idbVar3 = (idb) xdrVar.getValue();
                                    if (!(idbVar3 instanceof cdb) && !(idbVar3 instanceof gdb)) {
                                        if (!(idbVar3 instanceof fdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already authorized"));
                                            fdb fdbVar = (fdb) idbVar3;
                                            tcbVar = new pcb(fdbVar.b(), fdbVar.c());
                                        }
                                    } else {
                                        tcbVar = qcb.a;
                                    }
                                }
                            } else {
                                hcb hcbVar = (hcb) parcelable2;
                                kdb kdbVar = (kdb) ldbVar.k.getValue();
                                boolean z = hcbVar.b;
                                yxc yxcVar = hcbVar.a;
                                kdbVar.getClass();
                                ot0.A(jrj.b.e(), "Onboarding_StartScreen_MusicLoginCompleted", null);
                                AppsFlyerLib.getInstance().logEvent(kdbVar.a, "AF_Login", null);
                                if (z) {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("success", 1)));
                                } else {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("manual login success", 1)));
                                }
                                do {
                                    value = xdrVar.getValue();
                                    idb idbVar4 = (idb) value;
                                    if (!(idbVar4 instanceof hdb)) {
                                        if (!(idbVar4 instanceof cdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            zcbVar = new zcb(yxcVar);
                                        }
                                    } else {
                                        hdb hdbVar = (hdb) idbVar4;
                                        zcbVar = new ddb(hdbVar.c(), hdbVar.a(), yxcVar);
                                    }
                                } while (!xdrVar.k(value, zcbVar));
                                tcbVar = scb.a;
                            }
                            wcbVar.B(tcbVar);
                            break;
                        }
                        break;
                    case 1:
                        if (str.equals("EntryScreenCloseSyncKey")) {
                            wcb wcbVar2 = this.b;
                            xdr xdrVar2 = ((ldb) wcbVar2.k.getValue()).l;
                            idb idbVar5 = (idb) xdrVar2.getValue();
                            if (!(idbVar5 instanceof zcb)) {
                                boolean z2 = idbVar5 instanceof ddb;
                                tcbVar2 = qcb.a;
                                if (!z2) {
                                    if (!(idbVar5 instanceof gdb) && !(idbVar5 instanceof bdb)) {
                                        if (!(idbVar5 instanceof edb)) {
                                            if (!(idbVar5 instanceof adb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                                pcbVar = new pcb(((adb) idbVar5).a, true);
                                            }
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                            edb edbVar = (edb) idbVar5;
                                            pcbVar = new pcb(edbVar.c, edbVar.a);
                                        }
                                    } else {
                                        dfi.r("synced user is not authorized. Fallback to onboarding", "EntryScreenViewModel");
                                        do {
                                            value2 = xdrVar2.getValue();
                                            idbVar = (idb) value2;
                                            if (!(idbVar instanceof ddb)) {
                                            }
                                        } while (!xdrVar2.k(value2, idbVar));
                                        wcbVar2.B(tcbVar2);
                                    }
                                } else {
                                    ddb ddbVar2 = (ddb) idbVar5;
                                    if (ddbVar2.b) {
                                        pcbVar = new pcb(ddbVar2.c, true);
                                    }
                                    do {
                                        value2 = xdrVar2.getValue();
                                        idbVar = (idb) value2;
                                        if (!(idbVar instanceof ddb)) {
                                            if (!(idbVar instanceof zcb)) {
                                                if (!(idbVar instanceof adb) && !(idbVar instanceof edb) && !(idbVar instanceof gdb) && !(idbVar instanceof bdb)) {
                                                    b6e.s();
                                                    break;
                                                }
                                            } else {
                                                idbVar = new adb(((zcb) idbVar).a);
                                            }
                                        } else {
                                            ddb ddbVar3 = (ddb) idbVar;
                                            idbVar = new edb(ddbVar3.a, ddbVar3.b, ddbVar3.c);
                                        }
                                    } while (!xdrVar2.k(value2, idbVar));
                                    wcbVar2.B(tcbVar2);
                                    break;
                                }
                            } else {
                                pcbVar = new pcb(((zcb) idbVar5).a, true);
                            }
                            tcbVar2 = pcbVar;
                            do {
                                value2 = xdrVar2.getValue();
                                idbVar = (idb) value2;
                                if (!(idbVar instanceof ddb)) {
                                }
                            } while (!xdrVar2.k(value2, idbVar));
                            wcbVar2.B(tcbVar2);
                        }
                        break;
                    default:
                        if (str.equals("EntryScreenCloseOnboardingKey")) {
                            wcb wcbVar3 = this.b;
                            xdr xdrVar3 = ((ldb) wcbVar3.k.getValue()).l;
                            idb idbVar6 = (idb) xdrVar3.getValue();
                            if (!(idbVar6 instanceof edb)) {
                                if (!(idbVar6 instanceof adb)) {
                                    if (!(idbVar6 instanceof gdb) && !(idbVar6 instanceof ddb) && !(idbVar6 instanceof zcb) && !(idbVar6 instanceof bdb)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        tcbVar3 = rcb.a;
                                    }
                                } else {
                                    Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("no need to show onboarding for synced user with user changing"));
                                    tcbVar3 = new pcb(((adb) idbVar6).a, true);
                                }
                            } else {
                                edb edbVar2 = (edb) idbVar6;
                                tcbVar3 = new pcb(edbVar2.c, edbVar2.a);
                            }
                            do {
                                value3 = xdrVar3.getValue();
                                idbVar2 = (idb) value3;
                                if (!(idbVar2 instanceof cdb)) {
                                    if (idbVar2 instanceof gdb) {
                                        idbVar2 = new gdb(((gdb) idbVar2).a, true);
                                    } else {
                                        if (!(idbVar2 instanceof edb)) {
                                            if (!(idbVar2 instanceof ddb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                ddb ddbVar4 = (ddb) idbVar2;
                                                boolean z3 = ddbVar4.a;
                                                yxc yxcVar2 = ddbVar4.c;
                                                yxcVar2.getClass();
                                                ddbVar = new ddb(z3, true, yxcVar2);
                                            }
                                        } else {
                                            edb edbVar3 = (edb) idbVar2;
                                            boolean z4 = edbVar3.a;
                                            yxc yxcVar3 = edbVar3.c;
                                            yxcVar3.getClass();
                                            ddbVar = new edb(z4, true, yxcVar3);
                                        }
                                        idbVar2 = ddbVar;
                                    }
                                }
                            } while (!xdrVar3.k(value3, idbVar2));
                            wcbVar3.B(tcbVar3);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        getParentFragmentManager().f0("EntryScreenCloseSyncKey", this, new fuc(this) { // from class: ucb
            public final /* synthetic */ wcb b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
            @Override // defpackage.fuc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void k(Bundle bundle2, String str) {
                tcb tcbVar;
                Object value;
                Object zcbVar;
                tcb tcbVar2;
                pcb pcbVar;
                Object value2;
                idb idbVar;
                tcb tcbVar3;
                Object value3;
                idb idbVar2;
                idb ddbVar;
                switch (i2) {
                    case 0:
                        if (str.equals("EntryScreenCloseLoginKey")) {
                            Parcelable parcelable2 = (icb) bundle2.getParcelable("EntryScreenLoginResultKey");
                            if (parcelable2 == null) {
                                dfi.r("Login result must be not null. Fallback to failure", "EntryScreenFragment");
                                parcelable2 = gcb.a;
                            }
                            wcb wcbVar = this.b;
                            ldb ldbVar = (ldb) wcbVar.k.getValue();
                            xdr xdrVar = ldbVar.l;
                            if (!(parcelable2 instanceof hcb)) {
                                if (!(parcelable2 instanceof gcb)) {
                                    b6e.s();
                                    break;
                                } else {
                                    idb idbVar3 = (idb) xdrVar.getValue();
                                    if (!(idbVar3 instanceof cdb) && !(idbVar3 instanceof gdb)) {
                                        if (!(idbVar3 instanceof fdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already authorized"));
                                            fdb fdbVar = (fdb) idbVar3;
                                            tcbVar = new pcb(fdbVar.b(), fdbVar.c());
                                        }
                                    } else {
                                        tcbVar = qcb.a;
                                    }
                                }
                            } else {
                                hcb hcbVar = (hcb) parcelable2;
                                kdb kdbVar = (kdb) ldbVar.k.getValue();
                                boolean z = hcbVar.b;
                                yxc yxcVar = hcbVar.a;
                                kdbVar.getClass();
                                ot0.A(jrj.b.e(), "Onboarding_StartScreen_MusicLoginCompleted", null);
                                AppsFlyerLib.getInstance().logEvent(kdbVar.a, "AF_Login", null);
                                if (z) {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("success", 1)));
                                } else {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("manual login success", 1)));
                                }
                                do {
                                    value = xdrVar.getValue();
                                    idb idbVar4 = (idb) value;
                                    if (!(idbVar4 instanceof hdb)) {
                                        if (!(idbVar4 instanceof cdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            zcbVar = new zcb(yxcVar);
                                        }
                                    } else {
                                        hdb hdbVar = (hdb) idbVar4;
                                        zcbVar = new ddb(hdbVar.c(), hdbVar.a(), yxcVar);
                                    }
                                } while (!xdrVar.k(value, zcbVar));
                                tcbVar = scb.a;
                            }
                            wcbVar.B(tcbVar);
                            break;
                        }
                        break;
                    case 1:
                        if (str.equals("EntryScreenCloseSyncKey")) {
                            wcb wcbVar2 = this.b;
                            xdr xdrVar2 = ((ldb) wcbVar2.k.getValue()).l;
                            idb idbVar5 = (idb) xdrVar2.getValue();
                            if (!(idbVar5 instanceof zcb)) {
                                boolean z2 = idbVar5 instanceof ddb;
                                tcbVar2 = qcb.a;
                                if (!z2) {
                                    if (!(idbVar5 instanceof gdb) && !(idbVar5 instanceof bdb)) {
                                        if (!(idbVar5 instanceof edb)) {
                                            if (!(idbVar5 instanceof adb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                                pcbVar = new pcb(((adb) idbVar5).a, true);
                                            }
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                            edb edbVar = (edb) idbVar5;
                                            pcbVar = new pcb(edbVar.c, edbVar.a);
                                        }
                                    } else {
                                        dfi.r("synced user is not authorized. Fallback to onboarding", "EntryScreenViewModel");
                                        do {
                                            value2 = xdrVar2.getValue();
                                            idbVar = (idb) value2;
                                            if (!(idbVar instanceof ddb)) {
                                            }
                                        } while (!xdrVar2.k(value2, idbVar));
                                        wcbVar2.B(tcbVar2);
                                    }
                                } else {
                                    ddb ddbVar2 = (ddb) idbVar5;
                                    if (ddbVar2.b) {
                                        pcbVar = new pcb(ddbVar2.c, true);
                                    }
                                    do {
                                        value2 = xdrVar2.getValue();
                                        idbVar = (idb) value2;
                                        if (!(idbVar instanceof ddb)) {
                                            if (!(idbVar instanceof zcb)) {
                                                if (!(idbVar instanceof adb) && !(idbVar instanceof edb) && !(idbVar instanceof gdb) && !(idbVar instanceof bdb)) {
                                                    b6e.s();
                                                    break;
                                                }
                                            } else {
                                                idbVar = new adb(((zcb) idbVar).a);
                                            }
                                        } else {
                                            ddb ddbVar3 = (ddb) idbVar;
                                            idbVar = new edb(ddbVar3.a, ddbVar3.b, ddbVar3.c);
                                        }
                                    } while (!xdrVar2.k(value2, idbVar));
                                    wcbVar2.B(tcbVar2);
                                    break;
                                }
                            } else {
                                pcbVar = new pcb(((zcb) idbVar5).a, true);
                            }
                            tcbVar2 = pcbVar;
                            do {
                                value2 = xdrVar2.getValue();
                                idbVar = (idb) value2;
                                if (!(idbVar instanceof ddb)) {
                                }
                            } while (!xdrVar2.k(value2, idbVar));
                            wcbVar2.B(tcbVar2);
                        }
                        break;
                    default:
                        if (str.equals("EntryScreenCloseOnboardingKey")) {
                            wcb wcbVar3 = this.b;
                            xdr xdrVar3 = ((ldb) wcbVar3.k.getValue()).l;
                            idb idbVar6 = (idb) xdrVar3.getValue();
                            if (!(idbVar6 instanceof edb)) {
                                if (!(idbVar6 instanceof adb)) {
                                    if (!(idbVar6 instanceof gdb) && !(idbVar6 instanceof ddb) && !(idbVar6 instanceof zcb) && !(idbVar6 instanceof bdb)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        tcbVar3 = rcb.a;
                                    }
                                } else {
                                    Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("no need to show onboarding for synced user with user changing"));
                                    tcbVar3 = new pcb(((adb) idbVar6).a, true);
                                }
                            } else {
                                edb edbVar2 = (edb) idbVar6;
                                tcbVar3 = new pcb(edbVar2.c, edbVar2.a);
                            }
                            do {
                                value3 = xdrVar3.getValue();
                                idbVar2 = (idb) value3;
                                if (!(idbVar2 instanceof cdb)) {
                                    if (idbVar2 instanceof gdb) {
                                        idbVar2 = new gdb(((gdb) idbVar2).a, true);
                                    } else {
                                        if (!(idbVar2 instanceof edb)) {
                                            if (!(idbVar2 instanceof ddb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                ddb ddbVar4 = (ddb) idbVar2;
                                                boolean z3 = ddbVar4.a;
                                                yxc yxcVar2 = ddbVar4.c;
                                                yxcVar2.getClass();
                                                ddbVar = new ddb(z3, true, yxcVar2);
                                            }
                                        } else {
                                            edb edbVar3 = (edb) idbVar2;
                                            boolean z4 = edbVar3.a;
                                            yxc yxcVar3 = edbVar3.c;
                                            yxcVar3.getClass();
                                            ddbVar = new edb(z4, true, yxcVar3);
                                        }
                                        idbVar2 = ddbVar;
                                    }
                                }
                            } while (!xdrVar3.k(value3, idbVar2));
                            wcbVar3.B(tcbVar3);
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 0;
        getParentFragmentManager().f0("EntryScreenCloseLoginKey", this, new fuc(this) { // from class: ucb
            public final /* synthetic */ wcb b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
            @Override // defpackage.fuc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void k(Bundle bundle2, String str) {
                tcb tcbVar;
                Object value;
                Object zcbVar;
                tcb tcbVar2;
                pcb pcbVar;
                Object value2;
                idb idbVar;
                tcb tcbVar3;
                Object value3;
                idb idbVar2;
                idb ddbVar;
                switch (i3) {
                    case 0:
                        if (str.equals("EntryScreenCloseLoginKey")) {
                            Parcelable parcelable2 = (icb) bundle2.getParcelable("EntryScreenLoginResultKey");
                            if (parcelable2 == null) {
                                dfi.r("Login result must be not null. Fallback to failure", "EntryScreenFragment");
                                parcelable2 = gcb.a;
                            }
                            wcb wcbVar = this.b;
                            ldb ldbVar = (ldb) wcbVar.k.getValue();
                            xdr xdrVar = ldbVar.l;
                            if (!(parcelable2 instanceof hcb)) {
                                if (!(parcelable2 instanceof gcb)) {
                                    b6e.s();
                                    break;
                                } else {
                                    idb idbVar3 = (idb) xdrVar.getValue();
                                    if (!(idbVar3 instanceof cdb) && !(idbVar3 instanceof gdb)) {
                                        if (!(idbVar3 instanceof fdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already authorized"));
                                            fdb fdbVar = (fdb) idbVar3;
                                            tcbVar = new pcb(fdbVar.b(), fdbVar.c());
                                        }
                                    } else {
                                        tcbVar = qcb.a;
                                    }
                                }
                            } else {
                                hcb hcbVar = (hcb) parcelable2;
                                kdb kdbVar = (kdb) ldbVar.k.getValue();
                                boolean z = hcbVar.b;
                                yxc yxcVar = hcbVar.a;
                                kdbVar.getClass();
                                ot0.A(jrj.b.e(), "Onboarding_StartScreen_MusicLoginCompleted", null);
                                AppsFlyerLib.getInstance().logEvent(kdbVar.a, "AF_Login", null);
                                if (z) {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("success", 1)));
                                } else {
                                    lg3.e0("counter", Collections.singletonMap("auto_login", Collections.singletonMap("manual login success", 1)));
                                }
                                do {
                                    value = xdrVar.getValue();
                                    idb idbVar4 = (idb) value;
                                    if (!(idbVar4 instanceof hdb)) {
                                        if (!(idbVar4 instanceof cdb)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            zcbVar = new zcb(yxcVar);
                                        }
                                    } else {
                                        hdb hdbVar = (hdb) idbVar4;
                                        zcbVar = new ddb(hdbVar.c(), hdbVar.a(), yxcVar);
                                    }
                                } while (!xdrVar.k(value, zcbVar));
                                tcbVar = scb.a;
                            }
                            wcbVar.B(tcbVar);
                            break;
                        }
                        break;
                    case 1:
                        if (str.equals("EntryScreenCloseSyncKey")) {
                            wcb wcbVar2 = this.b;
                            xdr xdrVar2 = ((ldb) wcbVar2.k.getValue()).l;
                            idb idbVar5 = (idb) xdrVar2.getValue();
                            if (!(idbVar5 instanceof zcb)) {
                                boolean z2 = idbVar5 instanceof ddb;
                                tcbVar2 = qcb.a;
                                if (!z2) {
                                    if (!(idbVar5 instanceof gdb) && !(idbVar5 instanceof bdb)) {
                                        if (!(idbVar5 instanceof edb)) {
                                            if (!(idbVar5 instanceof adb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                                pcbVar = new pcb(((adb) idbVar5).a, true);
                                            }
                                        } else {
                                            Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("user is already synced"));
                                            edb edbVar = (edb) idbVar5;
                                            pcbVar = new pcb(edbVar.c, edbVar.a);
                                        }
                                    } else {
                                        dfi.r("synced user is not authorized. Fallback to onboarding", "EntryScreenViewModel");
                                        do {
                                            value2 = xdrVar2.getValue();
                                            idbVar = (idb) value2;
                                            if (!(idbVar instanceof ddb)) {
                                            }
                                        } while (!xdrVar2.k(value2, idbVar));
                                        wcbVar2.B(tcbVar2);
                                    }
                                } else {
                                    ddb ddbVar2 = (ddb) idbVar5;
                                    if (ddbVar2.b) {
                                        pcbVar = new pcb(ddbVar2.c, true);
                                    }
                                    do {
                                        value2 = xdrVar2.getValue();
                                        idbVar = (idb) value2;
                                        if (!(idbVar instanceof ddb)) {
                                            if (!(idbVar instanceof zcb)) {
                                                if (!(idbVar instanceof adb) && !(idbVar instanceof edb) && !(idbVar instanceof gdb) && !(idbVar instanceof bdb)) {
                                                    b6e.s();
                                                    break;
                                                }
                                            } else {
                                                idbVar = new adb(((zcb) idbVar).a);
                                            }
                                        } else {
                                            ddb ddbVar3 = (ddb) idbVar;
                                            idbVar = new edb(ddbVar3.a, ddbVar3.b, ddbVar3.c);
                                        }
                                    } while (!xdrVar2.k(value2, idbVar));
                                    wcbVar2.B(tcbVar2);
                                    break;
                                }
                            } else {
                                pcbVar = new pcb(((zcb) idbVar5).a, true);
                            }
                            tcbVar2 = pcbVar;
                            do {
                                value2 = xdrVar2.getValue();
                                idbVar = (idb) value2;
                                if (!(idbVar instanceof ddb)) {
                                }
                            } while (!xdrVar2.k(value2, idbVar));
                            wcbVar2.B(tcbVar2);
                        }
                        break;
                    default:
                        if (str.equals("EntryScreenCloseOnboardingKey")) {
                            wcb wcbVar3 = this.b;
                            xdr xdrVar3 = ((ldb) wcbVar3.k.getValue()).l;
                            idb idbVar6 = (idb) xdrVar3.getValue();
                            if (!(idbVar6 instanceof edb)) {
                                if (!(idbVar6 instanceof adb)) {
                                    if (!(idbVar6 instanceof gdb) && !(idbVar6 instanceof ddb) && !(idbVar6 instanceof zcb) && !(idbVar6 instanceof bdb)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        tcbVar3 = rcb.a;
                                    }
                                } else {
                                    Assertions.throwOrSkip("EntryScreenViewModel", new FailedAssertionException("no need to show onboarding for synced user with user changing"));
                                    tcbVar3 = new pcb(((adb) idbVar6).a, true);
                                }
                            } else {
                                edb edbVar2 = (edb) idbVar6;
                                tcbVar3 = new pcb(edbVar2.c, edbVar2.a);
                            }
                            do {
                                value3 = xdrVar3.getValue();
                                idbVar2 = (idb) value3;
                                if (!(idbVar2 instanceof cdb)) {
                                    if (idbVar2 instanceof gdb) {
                                        idbVar2 = new gdb(((gdb) idbVar2).a, true);
                                    } else {
                                        if (!(idbVar2 instanceof edb)) {
                                            if (!(idbVar2 instanceof ddb)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                ddb ddbVar4 = (ddb) idbVar2;
                                                boolean z3 = ddbVar4.a;
                                                yxc yxcVar2 = ddbVar4.c;
                                                yxcVar2.getClass();
                                                ddbVar = new ddb(z3, true, yxcVar2);
                                            }
                                        } else {
                                            edb edbVar3 = (edb) idbVar2;
                                            boolean z4 = edbVar3.a;
                                            yxc yxcVar3 = edbVar3.c;
                                            yxcVar3.getClass();
                                            ddbVar = new edb(z4, true, yxcVar3);
                                        }
                                        idbVar2 = ddbVar;
                                    }
                                }
                            } while (!xdrVar3.k(value3, idbVar2));
                            wcbVar3.B(tcbVar3);
                            break;
                        }
                        break;
                }
            }
        });
    }
}

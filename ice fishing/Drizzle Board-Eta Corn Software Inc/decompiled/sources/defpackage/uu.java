package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class uu {
    public final k0 MdtA4re8;
    public final gu NCTxEWno = new gu(this, new zt(this, 0));
    public final wi P7K7Inc8;
    public final cb0 Qr9iLBAD;
    public boolean VgvYg0wo;
    public final boolean b2ZJblxo;
    public final Context qoPGr6Ce;
    public final Activity wxUZMvaN;

    /* JADX WARN: Multi-variable type inference failed */
    public uu(Context context) {
        Object obj;
        this.qoPGr6Ce = context;
        this.MdtA4re8 = new k0(context, 0 == true ? 1 : 0);
        Iterator it = l60.RXQxj5Oe(context, new tKaxLBvG(9)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.wxUZMvaN = (Activity) obj;
        this.P7K7Inc8 = new wi(2, this);
        this.b2ZJblxo = true;
        xv xvVar = this.NCTxEWno.amk52bBQ;
        xvVar.qoPGr6Ce(new tu(xvVar));
        this.NCTxEWno.amk52bBQ.qoPGr6Ce(new NRrvEVSS(this.qoPGr6Ce));
        this.Qr9iLBAD = new cb0(new zt(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void MdtA4re8(int i, Bundle bundle, xu xuVar) {
        int i2;
        Bundle bundle2;
        int i3;
        gu guVar = this.NCTxEWno;
        pu puVar = guVar.P7K7Inc8.isEmpty() ? guVar.MdtA4re8 : ((ut) guVar.P7K7Inc8.last()).MdtA4re8;
        if (puVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        st MdtA4re8 = puVar.MdtA4re8(i);
        if (MdtA4re8 != null) {
            if (xuVar == null) {
                xuVar = MdtA4re8.NCTxEWno;
            }
            i2 = MdtA4re8.qoPGr6Ce;
            Bundle bundle3 = MdtA4re8.MdtA4re8;
            if (bundle3 != null) {
                bundle2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                bundle2.putAll(bundle3);
                if (bundle != null) {
                    if (bundle2 == null) {
                        bundle2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    }
                    bundle2.putAll(bundle);
                }
                if (i2 == 0 && xuVar != null) {
                    boolean z = xuVar.wxUZMvaN;
                    i3 = xuVar.MdtA4re8;
                    if (i3 != -1) {
                        if (i3 == -1 || !guVar.ow5vqvCr(i3, z, false)) {
                            return;
                        }
                        guVar.NCTxEWno();
                        return;
                    }
                }
                if (i2 != 0) {
                    m1.sjUBp5pO("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                    return;
                }
                pu MdtA4re82 = guVar.MdtA4re8(i2, null);
                if (MdtA4re82 != null) {
                    guVar.k3x7lurq(MdtA4re82, bundle2, xuVar);
                    return;
                }
                int i4 = pu.b2ZJblxo;
                k0 k0Var = this.MdtA4re8;
                String KlHjfFWx = ra.KlHjfFWx(k0Var, i2);
                if (MdtA4re8 == null) {
                    m1.eVhOlqcC("Navigation action/destination ", KlHjfFWx, " cannot be found from the current destination ", puVar);
                    return;
                }
                StringBuilder b2ZJblxo = q70.b2ZJblxo("Navigation destination ", KlHjfFWx, " referenced from action ");
                b2ZJblxo.append(ra.KlHjfFWx(k0Var, i));
                b2ZJblxo.append(" cannot be found from the current destination ");
                b2ZJblxo.append(puVar);
                throw new IllegalArgumentException(b2ZJblxo.toString().toString());
            }
        } else {
            i2 = i;
        }
        bundle2 = null;
        if (bundle != null) {
        }
        if (i2 == 0) {
            boolean z2 = xuVar.wxUZMvaN;
            i3 = xuVar.MdtA4re8;
            if (i3 != -1) {
            }
        }
        if (i2 != 0) {
        }
    }

    public final int NCTxEWno() {
        q0 q0Var = this.NCTxEWno.P7K7Inc8;
        int i = 0;
        if (q0Var != null && q0Var.isEmpty()) {
            return 0;
        }
        Iterator it = q0Var.iterator();
        while (it.hasNext()) {
            if (!(((ut) it.next()).MdtA4re8 instanceof ru) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final void qoPGr6Ce(bu buVar) {
        gu guVar = this.NCTxEWno;
        guVar.getClass();
        guVar.lDXGDhIF.add(buVar);
        q0 q0Var = guVar.P7K7Inc8;
        if (q0Var.isEmpty()) {
            return;
        }
        ut utVar = (ut) q0Var.last();
        uu uuVar = guVar.qoPGr6Ce;
        pu puVar = utVar.MdtA4re8;
        utVar.jb9XjC4I.qoPGr6Ce();
        buVar.qoPGr6Ce(uuVar, puVar);
    }

    public final void wxUZMvaN() {
        Bundle qoPGr6Ce;
        Intent intent;
        int NCTxEWno = NCTxEWno();
        gu guVar = this.NCTxEWno;
        int i = 0;
        if (NCTxEWno != 1) {
            if (guVar.P7K7Inc8.isEmpty()) {
                return;
            }
            pu P7K7Inc8 = guVar.P7K7Inc8();
            P7K7Inc8.getClass();
            if (guVar.ow5vqvCr(P7K7Inc8.MdtA4re8.qoPGr6Ce, true, false)) {
                guVar.NCTxEWno();
                return;
            }
            return;
        }
        Activity activity = this.wxUZMvaN;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            pu P7K7Inc82 = guVar.P7K7Inc8();
            P7K7Inc82.getClass();
            int i2 = P7K7Inc82.MdtA4re8.qoPGr6Ce;
            for (ru ruVar = P7K7Inc82.wxUZMvaN; ruVar != null; ruVar = ruVar.wxUZMvaN) {
                VM67d7Sv vM67d7Sv = ruVar.MdtA4re8;
                if (ruVar.Qr9iLBAD.qoPGr6Ce != i2) {
                    Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        VgvYg0wo.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        ru jb9XjC4I = guVar.jb9XjC4I();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        ou jb9XjC4I2 = jb9XjC4I.jb9XjC4I(new f0(intent3.getData(), intent3.getAction(), intent3.getType(), 11), jb9XjC4I);
                        if ((jb9XjC4I2 != null ? jb9XjC4I2.MdtA4re8 : null) != null && (qoPGr6Ce = jb9XjC4I2.NCTxEWno.qoPGr6Ce(jb9XjC4I2.MdtA4re8)) != null) {
                            VgvYg0wo.putAll(qoPGr6Ce);
                        }
                    }
                    kn knVar = new kn(this);
                    int i3 = vM67d7Sv.qoPGr6Ce;
                    ArrayList arrayList = (ArrayList) knVar.P7K7Inc8;
                    arrayList.clear();
                    arrayList.add(new nu(i3, null));
                    knVar.wxUZMvaN();
                    ((Intent) knVar.wxUZMvaN).putExtra("android-support-nav:controller:deepLinkExtras", VgvYg0wo);
                    knVar.qoPGr6Ce().NCTxEWno();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i2 = vM67d7Sv.qoPGr6Ce;
            }
            return;
        }
        if (this.VgvYg0wo) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray.getClass();
            ArrayList arrayList2 = new ArrayList(intArray.length);
            for (int i4 : intArray) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() < 2) {
                return;
            }
            int intValue = ((Number) d6.TrssYQ34(arrayList2)).intValue();
            if (parcelableArrayList != null) {
            }
            pu wxUZMvaN = gu.wxUZMvaN(intValue, guVar.b2ZJblxo(), null, false);
            if (wxUZMvaN instanceof ru) {
                int i5 = ru.jb9XjC4I;
                intValue = fn.jb9XjC4I((ru) wxUZMvaN).MdtA4re8.qoPGr6Ce;
            }
            pu P7K7Inc83 = guVar.P7K7Inc8();
            if (P7K7Inc83 == null || intValue != P7K7Inc83.MdtA4re8.qoPGr6Ce) {
                return;
            }
            kn knVar2 = new kn(this);
            Bundle VgvYg0wo2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
            VgvYg0wo2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
            Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle != null) {
                VgvYg0wo2.putAll(bundle);
            }
            ((Intent) knVar2.wxUZMvaN).putExtra("android-support-nav:controller:deepLinkExtras", VgvYg0wo2);
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                int i7 = i + 1;
                if (i < 0) {
                    y5.ZyZthT5G();
                    throw null;
                }
                ((ArrayList) knVar2.P7K7Inc8).add(new nu(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                knVar2.wxUZMvaN();
                i = i7;
            }
            knVar2.qoPGr6Ce().NCTxEWno();
            activity.finish();
        }
    }
}

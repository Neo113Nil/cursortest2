package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kn implements fo {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public Object P7K7Inc8;
    public final Object VgvYg0wo;
    public final Object wxUZMvaN;

    public kn(uu uuVar) {
        Intent launchIntentForPackage;
        uuVar.getClass();
        Context context = uuVar.qoPGr6Ce;
        this.NCTxEWno = context;
        this.MdtA4re8 = new k0(context, false);
        int i = 1;
        vg vgVar = new vg(new xb(new nb0(l60.RXQxj5Oe(context, new tKaxLBvG(14)), new tKaxLBvG(15), i), new tKaxLBvG(28), i));
        Activity activity = (Activity) (!vgVar.hasNext() ? null : vgVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.wxUZMvaN = launchIntentForPackage;
        this.P7K7Inc8 = new ArrayList();
        this.VgvYg0wo = uuVar.NCTxEWno.b2ZJblxo();
    }

    public void MdtA4re8(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.NCTxEWno).put(str, obj);
        x90 x90Var = (x90) ((LinkedHashMap) this.wxUZMvaN).get(str);
        if (x90Var != null) {
            x90Var.jb9XjC4I(obj);
        }
        x90 x90Var2 = (x90) ((LinkedHashMap) this.VgvYg0wo).get(str);
        if (x90Var2 != null) {
            x90Var2.jb9XjC4I(obj);
        }
    }

    public pu NCTxEWno(int i) {
        q0 q0Var = new q0();
        q0Var.addLast((ru) this.VgvYg0wo);
        while (!q0Var.isEmpty()) {
            pu puVar = (pu) q0Var.removeFirst();
            if (puVar.MdtA4re8.qoPGr6Ce == i) {
                return puVar;
            }
            if (puVar instanceof ru) {
                Iterator it = ((ru) puVar).iterator();
                while (true) {
                    su suVar = (su) it;
                    if (suVar.hasNext()) {
                        q0Var.addLast((pu) suVar.next());
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.fo
    public Object getValue() {
        ng0 ng0Var = (ng0) this.P7K7Inc8;
        if (ng0Var != null) {
            return ng0Var;
        }
        ug0 ug0Var = (ug0) ((ok) this.MdtA4re8).qoPGr6Ce();
        rg0 rg0Var = (rg0) ((ok) this.wxUZMvaN).qoPGr6Ce();
        aa aaVar = (aa) ((ok) this.VgvYg0wo).qoPGr6Ce();
        ug0Var.getClass();
        rg0Var.getClass();
        aaVar.getClass();
        VZZbw3BB vZZbw3BB = new VZZbw3BB(ug0Var, rg0Var, aaVar);
        p5 p5Var = (p5) this.NCTxEWno;
        String NCTxEWno = p5Var.NCTxEWno();
        if (NCTxEWno == null) {
            m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ng0 Qr9iLBAD = vZZbw3BB.Qr9iLBAD(p5Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno));
        this.P7K7Inc8 = Qr9iLBAD;
        return Qr9iLBAD;
    }

    public qb0 qoPGr6Ce() {
        ArrayList arrayList = (ArrayList) this.P7K7Inc8;
        Intent intent = (Intent) this.wxUZMvaN;
        ru ruVar = (ru) this.VgvYg0wo;
        if (arrayList.isEmpty()) {
            m1.Ey6iv0m0("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        pu puVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nu nuVar = (nu) obj;
            int i2 = nuVar.qoPGr6Ce;
            Bundle bundle = nuVar.NCTxEWno;
            pu NCTxEWno = NCTxEWno(i2);
            if (NCTxEWno == null) {
                int i3 = pu.b2ZJblxo;
                m1.eVhOlqcC("Navigation destination ", ra.KlHjfFWx((k0) this.MdtA4re8, i2), " cannot be found in the navigation graph ", ruVar);
                return null;
            }
            for (int i4 : NCTxEWno.NCTxEWno(puVar)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            puVar = NCTxEWno;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", x5.CTE3lpUp(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        qb0 qb0Var = new qb0((Context) this.NCTxEWno);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(qb0Var.MdtA4re8.getPackageManager());
        }
        if (component != null) {
            qb0Var.qoPGr6Ce(component);
        }
        ArrayList arrayList4 = qb0Var.NCTxEWno;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = (Intent) arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return qb0Var;
    }

    public void wxUZMvaN() {
        ArrayList arrayList = (ArrayList) this.P7K7Inc8;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((nu) obj).qoPGr6Ce;
            if (NCTxEWno(i2) == null) {
                int i3 = pu.b2ZJblxo;
                StringBuilder b2ZJblxo = q70.b2ZJblxo("Navigation destination ", ra.KlHjfFWx((k0) this.MdtA4re8, i2), " cannot be found in the navigation graph ");
                b2ZJblxo.append((ru) this.VgvYg0wo);
                throw new IllegalArgumentException(b2ZJblxo.toString());
            }
        }
    }

    public kn(p5 p5Var, ok okVar, ok okVar2, ok okVar3) {
        this.NCTxEWno = p5Var;
        this.MdtA4re8 = okVar;
        this.wxUZMvaN = okVar2;
        this.VgvYg0wo = okVar3;
    }

    public kn(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, LinearLayout linearLayout2) {
        this.NCTxEWno = linearLayout;
        this.wxUZMvaN = textView;
        this.P7K7Inc8 = imageView;
        this.VgvYg0wo = textView2;
        this.MdtA4re8 = linearLayout2;
    }

    public kn(Map map) {
        map.getClass();
        this.NCTxEWno = new LinkedHashMap(map);
        this.MdtA4re8 = new LinkedHashMap();
        this.wxUZMvaN = new LinkedHashMap();
        this.VgvYg0wo = new LinkedHashMap();
        this.P7K7Inc8 = new ui(3, this);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ui implements p50 {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ ui(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    @Override // defpackage.p50
    public final Bundle qoPGr6Ce() {
        Bundle bundle;
        hx[] hxVarArr;
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                return ((ej) obj).bvfAo0eO();
            case 1:
                uu uuVar = (uu) obj;
                gu guVar = uuVar.NCTxEWno;
                LinkedHashMap linkedHashMap = guVar.ow5vqvCr;
                q0 q0Var = guVar.P7K7Inc8;
                LinkedHashMap linkedHashMap2 = guVar.k3x7lurq;
                ArrayList arrayList = new ArrayList();
                Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                for (Map.Entry entry : zq.LfKQckgD(guVar.amk52bBQ.qoPGr6Ce).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle Qr9iLBAD = ((wv) entry.getValue()).Qr9iLBAD();
                    if (Qr9iLBAD != null) {
                        arrayList.add(str);
                        str.getClass();
                        VgvYg0wo.putBundle(str, Qr9iLBAD);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    f50.OnDfzHZD(VgvYg0wo, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", VgvYg0wo);
                }
                if (!q0Var.isEmpty()) {
                    if (bundle == null) {
                        bundle = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = q0Var.iterator();
                    while (it.hasNext()) {
                        ut utVar = (ut) it.next();
                        utVar.getClass();
                        yt ytVar = new yt(utVar, utVar.MdtA4re8.MdtA4re8.qoPGr6Ce);
                        Bundle VgvYg0wo2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                        VgvYg0wo2.putString("nav-entry-state:id", (String) ytVar.NCTxEWno);
                        VgvYg0wo2.putInt("nav-entry-state:destination-id", ytVar.qoPGr6Ce);
                        Bundle bundle2 = (Bundle) ytVar.MdtA4re8;
                        if (bundle2 == null) {
                            bundle2 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                        }
                        VgvYg0wo2.putBundle("nav-entry-state:args", bundle2);
                        VgvYg0wo2.putBundle("nav-entry-state:saved-state", (Bundle) ytVar.wxUZMvaN);
                        arrayList2.add(VgvYg0wo2);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i3 = i2 + 1;
                        iArr[i2] = intValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(str2);
                        i2 = i3;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    f50.OnDfzHZD(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        q0 q0Var2 = (q0) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = q0Var2.iterator();
                        while (it2.hasNext()) {
                            yt ytVar2 = ((xt) it2.next()).qoPGr6Ce;
                            Bundle VgvYg0wo3 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                            VgvYg0wo3.putString("nav-entry-state:id", (String) ytVar2.NCTxEWno);
                            VgvYg0wo3.putInt("nav-entry-state:destination-id", ytVar2.qoPGr6Ce);
                            Bundle bundle3 = (Bundle) ytVar2.MdtA4re8;
                            if (bundle3 == null) {
                                bundle3 = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                            }
                            VgvYg0wo3.putBundle("nav-entry-state:args", bundle3);
                            VgvYg0wo3.putBundle("nav-entry-state:saved-state", (Bundle) ytVar2.wxUZMvaN);
                            arrayList5.add(VgvYg0wo3);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
                    }
                    f50.OnDfzHZD(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (uuVar.VgvYg0wo) {
                    if (bundle == null) {
                        bundle = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", uuVar.VgvYg0wo);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle bundle4 = Bundle.EMPTY;
                bundle4.getClass();
                return bundle4;
            case 2:
                int i4 = ((NavHostFragment) obj).ESscZ9M1;
                if (i4 != 0) {
                    return w30.VgvYg0wo(new hx("android-support-nav:fragment:graphId", Integer.valueOf(i4)));
                }
                Bundle bundle5 = Bundle.EMPTY;
                bundle5.getClass();
                return bundle5;
            default:
                kn knVar = (kn) obj;
                for (Map.Entry entry4 : zq.LfKQckgD((LinkedHashMap) knVar.VgvYg0wo).entrySet()) {
                    knVar.MdtA4re8(((x90) entry4.getValue()).Qr9iLBAD(), (String) entry4.getKey());
                }
                for (Map.Entry entry5 : zq.LfKQckgD((LinkedHashMap) knVar.MdtA4re8).entrySet()) {
                    knVar.MdtA4re8(((p50) entry5.getValue()).qoPGr6Ce(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) knVar.NCTxEWno;
                if (linkedHashMap3.isEmpty()) {
                    hxVarArr = new hx[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList6.add(new hx((String) entry6.getKey(), entry6.getValue()));
                    }
                    hxVarArr = (hx[]) arrayList6.toArray(new hx[0]);
                }
                return w30.VgvYg0wo((hx[]) Arrays.copyOf(hxVarArr, hxVarArr.length));
        }
    }
}

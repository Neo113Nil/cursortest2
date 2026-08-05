package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.kolosta.rejin.jilosa.R;
import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements ok {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ e7(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // defpackage.ok
    public final Object qoPGr6Ce() {
        Bundle bundle;
        xo b2ZJblxo;
        int i = this.NCTxEWno;
        int i2 = 0;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                ((f4UNdked) obj).reportFullyDrawn();
                return null;
            case 1:
                return ((mcXgUFR8) obj).wxUZMvaN(":memory:");
            case 2:
                kk kkVar = (kk) obj;
                Context context = kkVar.NCTxEWno;
                String str = kkVar.MdtA4re8;
                tg0 tg0Var = new tg0(16, (byte) 0);
                tg0Var.MdtA4re8 = null;
                jk jkVar = new jk(context, str, tg0Var, kkVar.wxUZMvaN);
                jkVar.setWriteAheadLoggingEnabled(kkVar.P7K7Inc8);
                return jkVar;
            case 3:
                BoardDatabase_Impl boardDatabase_Impl = ((hn) obj).qoPGr6Ce;
                return Boolean.valueOf(!boardDatabase_Impl.b2ZJblxo() || boardDatabase_Impl.jb9XjC4I());
            case 4:
                return new mu((String) obj, null, null);
            case 5:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context eVhOlqcC = navHostFragment.eVhOlqcC();
                if (eVhOlqcC != null) {
                    uu uuVar = new uu(eVhOlqcC);
                    gu guVar = uuVar.NCTxEWno;
                    ij ijVar = guVar.OxcuoDLp;
                    xv xvVar = guVar.amk52bBQ;
                    vo voVar = guVar.OnDfzHZD;
                    if (navHostFragment != voVar) {
                        if (voVar != null && (b2ZJblxo = voVar.b2ZJblxo()) != null) {
                            b2ZJblxo.P7K7Inc8(ijVar);
                        }
                        guVar.OnDfzHZD = navHostFragment;
                        navHostFragment.FXJmAAN1.qoPGr6Ce(ijVar);
                    }
                    ug0 P7K7Inc8 = navHostFragment.P7K7Inc8();
                    hu huVar = guVar.ygLcUYwZ;
                    wkPeYiwH wkpeyiwh = iu.qoPGr6Ce;
                    y9 y9Var = y9.NCTxEWno;
                    wkpeyiwh.getClass();
                    y9Var.getClass();
                    VZZbw3BB vZZbw3BB = new VZZbw3BB(P7K7Inc8, wkpeyiwh, y9Var);
                    p5 qoPGr6Ce = m20.qoPGr6Ce(hu.class);
                    String NCTxEWno = qoPGr6Ce.NCTxEWno();
                    if (NCTxEWno != null) {
                        if (!fn.qoPGr6Ce(huVar, (hu) vZZbw3BB.Qr9iLBAD(qoPGr6Ce, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno)))) {
                            if (guVar.P7K7Inc8.isEmpty()) {
                                VZZbw3BB vZZbw3BB2 = new VZZbw3BB(P7K7Inc8, wkpeyiwh, y9Var);
                                p5 qoPGr6Ce2 = m20.qoPGr6Ce(hu.class);
                                String NCTxEWno2 = qoPGr6Ce2.NCTxEWno();
                                if (NCTxEWno2 != null) {
                                    guVar.ygLcUYwZ = (hu) vZZbw3BB2.Qr9iLBAD(qoPGr6Ce2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno2));
                                } else {
                                    m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
                                }
                            } else {
                                m1.Ey6iv0m0("ViewModelStore should be set before setGraph call");
                            }
                        }
                        Context aZz0PFXp = navHostFragment.aZz0PFXp();
                        ej jb9XjC4I = navHostFragment.jb9XjC4I();
                        jb9XjC4I.getClass();
                        xvVar.qoPGr6Ce(new rc(aZz0PFXp, jb9XjC4I));
                        Context aZz0PFXp2 = navHostFragment.aZz0PFXp();
                        ej jb9XjC4I2 = navHostFragment.jb9XjC4I();
                        jb9XjC4I2.getClass();
                        int i3 = navHostFragment.gjV1z5T1;
                        if (i3 == 0 || i3 == -1) {
                            i3 = R.id.nav_host_fragment_container;
                        }
                        xvVar.qoPGr6Ce(new nj(aZz0PFXp2, jb9XjC4I2, i3));
                        Bundle b2ZJblxo2 = ((mcXgUFR8) navHostFragment.ZyZthT5G.NCTxEWno).b2ZJblxo("android-support-nav:fragment:navControllerState");
                        if (b2ZJblxo2 != null) {
                            b2ZJblxo2.setClassLoader(eVhOlqcC.getClassLoader());
                            LinkedHashMap linkedHashMap = guVar.ow5vqvCr;
                            if (b2ZJblxo2.containsKey("android-support-nav:controller:navigatorState")) {
                                bundle = b2ZJblxo2.getBundle("android-support-nav:controller:navigatorState");
                                if (bundle == null) {
                                    n50.P7K7Inc8("android-support-nav:controller:navigatorState");
                                    throw null;
                                }
                            } else {
                                bundle = null;
                            }
                            guVar.wxUZMvaN = bundle;
                            guVar.VgvYg0wo = b2ZJblxo2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) m50.VgvYg0wo("android-support-nav:controller:backStack", b2ZJblxo2).toArray(new Bundle[0]) : null;
                            linkedHashMap.clear();
                            if (b2ZJblxo2.containsKey("android-support-nav:controller:backStackDestIds") && b2ZJblxo2.containsKey("android-support-nav:controller:backStackIds")) {
                                int[] intArray = b2ZJblxo2.getIntArray("android-support-nav:controller:backStackDestIds");
                                if (intArray == null) {
                                    n50.P7K7Inc8("android-support-nav:controller:backStackDestIds");
                                    throw null;
                                }
                                ArrayList<String> stringArrayList = b2ZJblxo2.getStringArrayList("android-support-nav:controller:backStackIds");
                                if (stringArrayList == null) {
                                    n50.P7K7Inc8("android-support-nav:controller:backStackIds");
                                    throw null;
                                }
                                int length = intArray.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    int i6 = i5 + 1;
                                    guVar.k3x7lurq.put(Integer.valueOf(intArray[i4]), !fn.qoPGr6Ce(stringArrayList.get(i5), "") ? stringArrayList.get(i5) : null);
                                    i4++;
                                    i5 = i6;
                                }
                            }
                            if (b2ZJblxo2.containsKey("android-support-nav:controller:backStackStates")) {
                                ArrayList<String> stringArrayList2 = b2ZJblxo2.getStringArrayList("android-support-nav:controller:backStackStates");
                                if (stringArrayList2 == null) {
                                    n50.P7K7Inc8("android-support-nav:controller:backStackStates");
                                    throw null;
                                }
                                int size = stringArrayList2.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    String str2 = stringArrayList2.get(i7);
                                    i7++;
                                    String str3 = str2;
                                    if (b2ZJblxo2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                        ArrayList VgvYg0wo = m50.VgvYg0wo("android-support-nav:controller:backStackStates:" + str3, b2ZJblxo2);
                                        q0 q0Var = new q0(VgvYg0wo.size());
                                        int size2 = VgvYg0wo.size();
                                        int i8 = 0;
                                        while (i8 < size2) {
                                            Object obj2 = VgvYg0wo.get(i8);
                                            i8++;
                                            q0Var.addLast(new xt((Bundle) obj2));
                                        }
                                        linkedHashMap.put(str3, q0Var);
                                    }
                                }
                            }
                            boolean z = b2ZJblxo2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                            Boolean valueOf = (z || !b2ZJblxo2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : null;
                            uuVar.VgvYg0wo = valueOf != null ? valueOf.booleanValue() : false;
                        }
                        ((mcXgUFR8) navHostFragment.ZyZthT5G.NCTxEWno).eIA6dogk("android-support-nav:fragment:navControllerState", new ui(1, uuVar));
                        Bundle b2ZJblxo3 = ((mcXgUFR8) navHostFragment.ZyZthT5G.NCTxEWno).b2ZJblxo("android-support-nav:fragment:graphId");
                        if (b2ZJblxo3 != null) {
                            navHostFragment.ESscZ9M1 = b2ZJblxo3.getInt("android-support-nav:fragment:graphId");
                        }
                        ((mcXgUFR8) navHostFragment.ZyZthT5G.NCTxEWno).eIA6dogk("android-support-nav:fragment:graphId", new ui(2, navHostFragment));
                        int i9 = navHostFragment.ESscZ9M1;
                        cb0 cb0Var = uuVar.Qr9iLBAD;
                        if (i9 != 0) {
                            guVar.OxcuoDLp(((vu) cb0Var.getValue()).NCTxEWno(i9), null);
                        } else {
                            Bundle bundle2 = navHostFragment.b2ZJblxo;
                            int i10 = bundle2 != null ? bundle2.getInt("android-support-nav:fragment:graphId") : 0;
                            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                            if (i10 != 0) {
                                guVar.OxcuoDLp(((vu) cb0Var.getValue()).NCTxEWno(i10), bundle3);
                            }
                        }
                        return uuVar;
                    }
                    m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
                } else {
                    m1.Ey6iv0m0("NavController cannot be created before the fragment is attached");
                }
                return null;
            case 6:
                jz jzVar = (jz) obj;
                return jzVar.NCTxEWno.wxUZMvaN(jzVar.MdtA4re8);
            case 7:
                return w30.Mq3SeTnW((vg0) obj);
            case 8:
                s50 s50Var = (s50) obj;
                s50Var.b2ZJblxo().qoPGr6Ce(new i10(i2, s50Var));
                return xe0.qoPGr6Ce;
            default:
                return obj;
        }
    }
}

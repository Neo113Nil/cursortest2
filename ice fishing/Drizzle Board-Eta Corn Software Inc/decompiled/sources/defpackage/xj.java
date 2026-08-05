package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xj {
    public final li MdtA4re8;
    public final VZZbw3BB NCTxEWno;
    public final mcXgUFR8 qoPGr6Ce;
    public boolean wxUZMvaN = false;
    public int VgvYg0wo = -1;

    public xj(mcXgUFR8 mcxgufr8, VZZbw3BB vZZbw3BB, ClassLoader classLoader, yi yiVar, Bundle bundle) {
        this.qoPGr6Ce = mcxgufr8;
        this.NCTxEWno = vZZbw3BB;
        li qoPGr6Ce = ((wj) bundle.getParcelable("state")).qoPGr6Ce(yiVar);
        this.MdtA4re8 = qoPGr6Ce;
        qoPGr6Ce.MdtA4re8 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        qoPGr6Ce.hzgxAD8d(bundle2);
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + qoPGr6Ce);
        }
    }

    public final void MdtA4re8() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "moveto ATTACHED: " + liVar);
        }
        li liVar2 = liVar.Qr9iLBAD;
        xj xjVar = null;
        VZZbw3BB vZZbw3BB = this.NCTxEWno;
        if (liVar2 != null) {
            xj xjVar2 = (xj) ((HashMap) vZZbw3BB.NCTxEWno).get(liVar2.P7K7Inc8);
            if (xjVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(liVar);
                li liVar3 = liVar.Qr9iLBAD;
                sb.append(" declared target fragment ");
                sb.append(liVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            liVar.jb9XjC4I = liVar.Qr9iLBAD.P7K7Inc8;
            liVar.Qr9iLBAD = null;
            xjVar = xjVar2;
        } else {
            String str = liVar.jb9XjC4I;
            if (str != null && (xjVar = (xj) ((HashMap) vZZbw3BB.NCTxEWno).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(liVar);
                String str2 = liVar.jb9XjC4I;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (xjVar != null) {
            xjVar.k3x7lurq();
        }
        ej ejVar = liVar.Ey6iv0m0;
        liVar.I5GHvsYW = ejVar.I5GHvsYW;
        liVar.FySoLYna = ejVar.FySoLYna;
        mcXgUFR8 mcxgufr8 = this.qoPGr6Ce;
        mcxgufr8.ygLcUYwZ(false);
        ArrayList arrayList = liVar.bvfAo0eO;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ii) obj).qoPGr6Ce();
        }
        arrayList.clear();
        liVar.RXQxj5Oe.NCTxEWno(liVar.I5GHvsYW, liVar.MdtA4re8(), liVar);
        liVar.NCTxEWno = 0;
        liVar.euDDoUNr = false;
        liVar.FySoLYna(liVar.I5GHvsYW.OxcuoDLp);
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onAttach()");
            return;
        }
        ej ejVar2 = liVar.Ey6iv0m0;
        Iterator it = ejVar2.ygLcUYwZ.iterator();
        while (it.hasNext()) {
            ((rj) it.next()).NCTxEWno(ejVar2, liVar);
        }
        ej ejVar3 = liVar.RXQxj5Oe;
        ejVar3.SgZGMMPL = false;
        ejVar3.ytu5o6f4 = false;
        ejVar3.fVMzMhyS.b2ZJblxo = false;
        ejVar3.Ey6iv0m0(0);
        mcxgufr8.jb9XjC4I(false);
    }

    public final void NCTxEWno() {
        li liVar;
        View view;
        View view2;
        li liVar2 = this.MdtA4re8;
        View view3 = liVar2.SgZGMMPL;
        while (true) {
            liVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            li liVar3 = tag instanceof li ? (li) tag : null;
            if (liVar3 != null) {
                liVar = liVar3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        li liVar4 = liVar2.FySoLYna;
        if (liVar != null && liVar != liVar4) {
            int i = liVar2.WYNAV5pd;
            yj yjVar = zj.qoPGr6Ce;
            zj.NCTxEWno(new uj(liVar2, "Attempting to nest fragment " + liVar2 + " within the view of parent fragment " + liVar + " via container with ID " + i + " without using parent's childFragmentManager"));
            zj.qoPGr6Ce(liVar2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.NCTxEWno.qoPGr6Ce;
        ViewGroup viewGroup = liVar2.SgZGMMPL;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(liVar2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        li liVar5 = (li) arrayList.get(indexOf);
                        if (liVar5.SgZGMMPL == viewGroup && (view = liVar5.ytu5o6f4) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    li liVar6 = (li) arrayList.get(i3);
                    if (liVar6.SgZGMMPL == viewGroup && (view2 = liVar6.ytu5o6f4) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        liVar2.SgZGMMPL.addView(liVar2.ytu5o6f4, i2);
    }

    public final void OnDfzHZD(ClassLoader classLoader) {
        li liVar = this.MdtA4re8;
        Bundle bundle = liVar.MdtA4re8;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (liVar.MdtA4re8.getBundle("savedInstanceState") == null) {
            liVar.MdtA4re8.putBundle("savedInstanceState", new Bundle());
        }
        liVar.wxUZMvaN = liVar.MdtA4re8.getSparseParcelableArray("viewState");
        liVar.VgvYg0wo = liVar.MdtA4re8.getBundle("viewRegistryState");
        wj wjVar = (wj) liVar.MdtA4re8.getParcelable("state");
        if (wjVar != null) {
            liVar.jb9XjC4I = wjVar.OnDfzHZD;
            liVar.eVhOlqcC = wjVar.ygLcUYwZ;
            liVar.pRiPUEwG = wjVar.lDXGDhIF;
        }
        if (liVar.pRiPUEwG) {
            return;
        }
        liVar.eIA6dogk = true;
    }

    public final void OxcuoDLp() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "moveto STARTED: " + liVar);
        }
        liVar.RXQxj5Oe.hzgxAD8d();
        liVar.RXQxj5Oe.gjV1z5T1(true);
        liVar.NCTxEWno = 5;
        liVar.euDDoUNr = false;
        liVar.euDDoUNr();
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onStart()");
            return;
        }
        xo xoVar = liVar.FXJmAAN1;
        oo ooVar = oo.ON_START;
        xoVar.wxUZMvaN(ooVar);
        if (liVar.ytu5o6f4 != null) {
            liVar.nSmgoSB5.P7K7Inc8.wxUZMvaN(ooVar);
        }
        ej ejVar = liVar.RXQxj5Oe;
        ejVar.SgZGMMPL = false;
        ejVar.ytu5o6f4 = false;
        ejVar.fVMzMhyS.b2ZJblxo = false;
        ejVar.Ey6iv0m0(5);
        this.qoPGr6Ce.KlHjfFWx(false);
    }

    public final void P7K7Inc8() {
        String str;
        li liVar = this.MdtA4re8;
        if (liVar.lDXGDhIF) {
            return;
        }
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + liVar);
        }
        Bundle bundle = liVar.MdtA4re8;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater U0LaHZX7 = liVar.U0LaHZX7(bundle2);
        liVar.Xkz7p5xa = U0LaHZX7;
        ViewGroup viewGroup2 = liVar.SgZGMMPL;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = liVar.WYNAV5pd;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + liVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) liVar.Ey6iv0m0.RXQxj5Oe.VhgXwMj9(i);
                if (viewGroup == null) {
                    if (!liVar.OxcuoDLp) {
                        try {
                            str = liVar.aZz0PFXp().getResources().getResourceName(liVar.WYNAV5pd);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(liVar.WYNAV5pd) + " (" + str + ") for fragment " + liVar);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    yj yjVar = zj.qoPGr6Ce;
                    zj.NCTxEWno(new uj(liVar, "Attempting to add fragment " + liVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    zj.qoPGr6Ce(liVar).getClass();
                }
            }
        }
        liVar.SgZGMMPL = viewGroup;
        liVar.pRiPUEwG(U0LaHZX7, viewGroup, bundle2);
        if (liVar.ytu5o6f4 != null) {
            if (ej.ytu5o6f4(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + liVar);
            }
            liVar.ytu5o6f4.setSaveFromParentEnabled(false);
            liVar.ytu5o6f4.setTag(R.id.fragment_container_view_tag, liVar);
            if (viewGroup != null) {
                NCTxEWno();
            }
            if (liVar.lwWCatUu) {
                liVar.ytu5o6f4.setVisibility(8);
            }
            View view = liVar.ytu5o6f4;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            boolean isAttachedToWindow = view.isAttachedToWindow();
            View view2 = liVar.ytu5o6f4;
            if (isAttachedToWindow) {
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new w3(1, view2));
            }
            Bundle bundle3 = liVar.MdtA4re8;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            liVar.ytu5o6f4(liVar.ytu5o6f4);
            liVar.RXQxj5Oe.Ey6iv0m0(2);
            this.qoPGr6Ce.I5GHvsYW(false);
            int visibility = liVar.ytu5o6f4.getVisibility();
            liVar.Qr9iLBAD().eVhOlqcC = liVar.ytu5o6f4.getAlpha();
            if (liVar.SgZGMMPL != null && visibility == 0) {
                View findFocus = liVar.ytu5o6f4.findFocus();
                if (findFocus != null) {
                    liVar.Qr9iLBAD().k3x7lurq = findFocus;
                    if (ej.ytu5o6f4(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + liVar);
                    }
                }
                liVar.ytu5o6f4.setAlpha(0.0f);
            }
        }
        liVar.NCTxEWno = 2;
    }

    public final void Qr9iLBAD() {
        View view;
        li liVar = this.MdtA4re8;
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + liVar);
        }
        ViewGroup viewGroup = liVar.SgZGMMPL;
        if (viewGroup != null && (view = liVar.ytu5o6f4) != null) {
            viewGroup.removeView(view);
        }
        liVar.RXQxj5Oe.Ey6iv0m0(1);
        if (liVar.ytu5o6f4 != null) {
            bk bkVar = liVar.nSmgoSB5;
            bkVar.MdtA4re8();
            if (bkVar.P7K7Inc8.MdtA4re8.compareTo(po.wxUZMvaN) >= 0) {
                liVar.nSmgoSB5.NCTxEWno(oo.ON_DESTROY);
            }
        }
        liVar.NCTxEWno = 1;
        liVar.euDDoUNr = false;
        liVar.DK9slbsy();
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onDestroyView()");
            return;
        }
        ug0 P7K7Inc8 = liVar.P7K7Inc8();
        gj gjVar = cq.MdtA4re8;
        P7K7Inc8.getClass();
        y9 y9Var = y9.NCTxEWno;
        y9Var.getClass();
        VZZbw3BB vZZbw3BB = new VZZbw3BB(P7K7Inc8, gjVar, y9Var);
        p5 qoPGr6Ce = m20.qoPGr6Ce(cq.class);
        String NCTxEWno = qoPGr6Ce.NCTxEWno();
        if (NCTxEWno == null) {
            m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
            return;
        }
        a80 a80Var = ((cq) vZZbw3BB.Qr9iLBAD(qoPGr6Ce, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno))).NCTxEWno;
        if (a80Var.MdtA4re8() > 0) {
            a80Var.wxUZMvaN(0).getClass();
            m1.qoPGr6Ce();
            return;
        }
        liVar.amk52bBQ = false;
        this.qoPGr6Ce.RXQxj5Oe(false);
        liVar.SgZGMMPL = null;
        liVar.ytu5o6f4 = null;
        liVar.nSmgoSB5 = null;
        nt ntVar = liVar.N8VPGzVC;
        ntVar.getClass();
        nt.qoPGr6Ce("setValue");
        ntVar.b2ZJblxo++;
        ntVar.VgvYg0wo = null;
        ntVar.MdtA4re8(null);
        liVar.sjUBp5pO = false;
    }

    public final void VgvYg0wo() {
        Bundle bundle;
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "moveto CREATED: " + liVar);
        }
        Bundle bundle2 = liVar.MdtA4re8;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (liVar.fVMzMhyS) {
            liVar.NCTxEWno = 1;
            Bundle bundle4 = liVar.MdtA4re8;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            liVar.RXQxj5Oe.ZyZthT5G(bundle);
            ej ejVar = liVar.RXQxj5Oe;
            ejVar.SgZGMMPL = false;
            ejVar.ytu5o6f4 = false;
            ejVar.fVMzMhyS.b2ZJblxo = false;
            ejVar.Ey6iv0m0(1);
            return;
        }
        mcXgUFR8 mcxgufr8 = this.qoPGr6Ce;
        mcxgufr8.lDXGDhIF(false);
        liVar.RXQxj5Oe.hzgxAD8d();
        liVar.NCTxEWno = 1;
        liVar.euDDoUNr = false;
        liVar.FXJmAAN1.qoPGr6Ce(new i10(4, liVar));
        liVar.gjV1z5T1(bundle3);
        liVar.fVMzMhyS = true;
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onCreate()");
        } else {
            liVar.FXJmAAN1.wxUZMvaN(oo.ON_CREATE);
            mcxgufr8.eVhOlqcC(false);
        }
    }

    public final void amk52bBQ() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "movefrom STARTED: " + liVar);
        }
        ej ejVar = liVar.RXQxj5Oe;
        ejVar.ytu5o6f4 = true;
        ejVar.fVMzMhyS.b2ZJblxo = true;
        ejVar.Ey6iv0m0(4);
        if (liVar.ytu5o6f4 != null) {
            liVar.nSmgoSB5.NCTxEWno(oo.ON_STOP);
        }
        liVar.FXJmAAN1.wxUZMvaN(oo.ON_STOP);
        liVar.NCTxEWno = 4;
        liVar.euDDoUNr = false;
        liVar.SgZGMMPL();
        if (liVar.euDDoUNr) {
            this.qoPGr6Ce.Ey6iv0m0(false);
        } else {
            m1.MdtA4re8(liVar, " did not call through to super.onStop()");
        }
    }

    public final void b2ZJblxo() {
        li NCTxEWno;
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "movefrom CREATED: " + liVar);
        }
        int i = 0;
        boolean z = liVar.OnDfzHZD && !liVar.KlHjfFWx();
        VZZbw3BB vZZbw3BB = this.NCTxEWno;
        if (z && !liVar.ygLcUYwZ) {
            vZZbw3BB.OnDfzHZD(liVar.P7K7Inc8, null);
        }
        if (!z) {
            hj hjVar = (hj) vZZbw3BB.wxUZMvaN;
            if (!((hjVar.NCTxEWno.containsKey(liVar.P7K7Inc8) && hjVar.VgvYg0wo) ? hjVar.P7K7Inc8 : true)) {
                String str = liVar.jb9XjC4I;
                if (str != null && (NCTxEWno = vZZbw3BB.NCTxEWno(str)) != null && NCTxEWno.i7xS8jrb) {
                    liVar.Qr9iLBAD = NCTxEWno;
                }
                liVar.NCTxEWno = 0;
                return;
            }
        }
        boolean z2 = liVar.I5GHvsYW != null ? ((hj) vZZbw3BB.wxUZMvaN).P7K7Inc8 : !r6.OxcuoDLp.isChangingConfigurations();
        if ((z && !liVar.ygLcUYwZ) || z2) {
            ((hj) vZZbw3BB.wxUZMvaN).VgvYg0wo(liVar, false);
        }
        liVar.RXQxj5Oe.k3x7lurq();
        liVar.FXJmAAN1.wxUZMvaN(oo.ON_DESTROY);
        liVar.NCTxEWno = 0;
        liVar.fVMzMhyS = false;
        liVar.euDDoUNr = true;
        this.qoPGr6Ce.k3x7lurq(false);
        ArrayList VgvYg0wo = vZZbw3BB.VgvYg0wo();
        int size = VgvYg0wo.size();
        while (i < size) {
            Object obj = VgvYg0wo.get(i);
            i++;
            xj xjVar = (xj) obj;
            if (xjVar != null) {
                li liVar2 = xjVar.MdtA4re8;
                if (liVar.P7K7Inc8.equals(liVar2.jb9XjC4I)) {
                    liVar2.Qr9iLBAD = liVar;
                    liVar2.jb9XjC4I = null;
                }
            }
        }
        String str2 = liVar.jb9XjC4I;
        if (str2 != null) {
            liVar.Qr9iLBAD = vZZbw3BB.NCTxEWno(str2);
        }
        vZZbw3BB.eVhOlqcC(this);
    }

    public final void eVhOlqcC() {
        li liVar = this.MdtA4re8;
        if (liVar.lDXGDhIF && liVar.sjUBp5pO && !liVar.amk52bBQ) {
            if (ej.ytu5o6f4(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + liVar);
            }
            Bundle bundle = liVar.MdtA4re8;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater U0LaHZX7 = liVar.U0LaHZX7(bundle2);
            liVar.Xkz7p5xa = U0LaHZX7;
            liVar.pRiPUEwG(U0LaHZX7, null, bundle2);
            View view = liVar.ytu5o6f4;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                liVar.ytu5o6f4.setTag(R.id.fragment_container_view_tag, liVar);
                if (liVar.lwWCatUu) {
                    liVar.ytu5o6f4.setVisibility(8);
                }
                Bundle bundle3 = liVar.MdtA4re8;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                liVar.ytu5o6f4(liVar.ytu5o6f4);
                liVar.RXQxj5Oe.Ey6iv0m0(2);
                this.qoPGr6Ce.I5GHvsYW(false);
                liVar.NCTxEWno = 2;
            }
        }
    }

    public final void jb9XjC4I() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + liVar);
        }
        liVar.NCTxEWno = -1;
        liVar.euDDoUNr = false;
        liVar.lwWCatUu();
        liVar.Xkz7p5xa = null;
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onDetach()");
            return;
        }
        ej ejVar = liVar.RXQxj5Oe;
        if (!ejVar.eIA6dogk) {
            ejVar.k3x7lurq();
            liVar.RXQxj5Oe = new ej();
        }
        this.qoPGr6Ce.ow5vqvCr(false);
        liVar.NCTxEWno = -1;
        liVar.I5GHvsYW = null;
        liVar.FySoLYna = null;
        liVar.Ey6iv0m0 = null;
        if (!liVar.OnDfzHZD || liVar.KlHjfFWx()) {
            hj hjVar = (hj) this.NCTxEWno.wxUZMvaN;
            if (!((hjVar.NCTxEWno.containsKey(liVar.P7K7Inc8) && hjVar.VgvYg0wo) ? hjVar.P7K7Inc8 : true)) {
                return;
            }
        }
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + liVar);
        }
        liVar.OxcuoDLp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k3x7lurq() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.wxUZMvaN;
        li liVar = this.MdtA4re8;
        if (z) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + liVar);
                return;
            }
            return;
        }
        try {
            this.wxUZMvaN = true;
            boolean z2 = false;
            while (true) {
                int wxUZMvaN = wxUZMvaN();
                int i = liVar.NCTxEWno;
                int i2 = 3;
                VZZbw3BB vZZbw3BB = this.NCTxEWno;
                if (wxUZMvaN == i) {
                    if (!z2 && i == -1 && liVar.OnDfzHZD && !liVar.KlHjfFWx() && !liVar.ygLcUYwZ) {
                        if (ej.ytu5o6f4(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + liVar);
                        }
                        ((hj) vZZbw3BB.wxUZMvaN).VgvYg0wo(liVar, true);
                        vZZbw3BB.eVhOlqcC(this);
                        if (ej.ytu5o6f4(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + liVar);
                        }
                        liVar.OxcuoDLp();
                    }
                    if (liVar.aZz0PFXp) {
                        if (liVar.ytu5o6f4 != null && (viewGroup = liVar.SgZGMMPL) != null) {
                            pb P7K7Inc8 = pb.P7K7Inc8(viewGroup, liVar.ow5vqvCr());
                            if (liVar.lwWCatUu) {
                                if (ej.ytu5o6f4(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + liVar);
                                }
                                P7K7Inc8.qoPGr6Ce(3, 1, this);
                            } else {
                                if (ej.ytu5o6f4(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + liVar);
                                }
                                P7K7Inc8.qoPGr6Ce(2, 1, this);
                            }
                        }
                        ej ejVar = liVar.Ey6iv0m0;
                        if (ejVar != null && liVar.ow5vqvCr && ej.eIA6dogk(liVar)) {
                            ejVar.euDDoUNr = true;
                        }
                        liVar.aZz0PFXp = false;
                        liVar.RXQxj5Oe.ygLcUYwZ();
                    }
                    this.wxUZMvaN = false;
                    return;
                }
                if (wxUZMvaN <= i) {
                    switch (i - 1) {
                        case -1:
                            jb9XjC4I();
                            break;
                        case 0:
                            if (liVar.ygLcUYwZ) {
                                if (((Bundle) ((HashMap) vZZbw3BB.MdtA4re8).get(liVar.P7K7Inc8)) == null) {
                                    vZZbw3BB.OnDfzHZD(liVar.P7K7Inc8, lDXGDhIF());
                                }
                            }
                            b2ZJblxo();
                            break;
                        case 1:
                            Qr9iLBAD();
                            liVar.NCTxEWno = 1;
                            break;
                        case 2:
                            liVar.sjUBp5pO = false;
                            liVar.NCTxEWno = 2;
                            break;
                        case 3:
                            if (ej.ytu5o6f4(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + liVar);
                            }
                            if (liVar.ygLcUYwZ) {
                                vZZbw3BB.OnDfzHZD(liVar.P7K7Inc8, lDXGDhIF());
                            } else if (liVar.ytu5o6f4 != null && liVar.wxUZMvaN == null) {
                                sjUBp5pO();
                            }
                            if (liVar.ytu5o6f4 != null && (viewGroup2 = liVar.SgZGMMPL) != null) {
                                pb P7K7Inc82 = pb.P7K7Inc8(viewGroup2, liVar.ow5vqvCr());
                                if (ej.ytu5o6f4(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + liVar);
                                }
                                P7K7Inc82.qoPGr6Ce(1, 3, this);
                            }
                            liVar.NCTxEWno = 3;
                            break;
                        case 4:
                            amk52bBQ();
                            break;
                        case 5:
                            liVar.NCTxEWno = 5;
                            break;
                        case 6:
                            ow5vqvCr();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            MdtA4re8();
                            break;
                        case 1:
                            VgvYg0wo();
                            break;
                        case 2:
                            eVhOlqcC();
                            P7K7Inc8();
                            break;
                        case 3:
                            qoPGr6Ce();
                            break;
                        case 4:
                            if (liVar.ytu5o6f4 != null && (viewGroup3 = liVar.SgZGMMPL) != null) {
                                pb P7K7Inc83 = pb.P7K7Inc8(viewGroup3, liVar.ow5vqvCr());
                                int visibility = liVar.ytu5o6f4.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (ej.ytu5o6f4(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + liVar);
                                }
                                P7K7Inc83.qoPGr6Ce(i2, 2, this);
                            }
                            liVar.NCTxEWno = 4;
                            break;
                        case 5:
                            OxcuoDLp();
                            break;
                        case 6:
                            liVar.NCTxEWno = 6;
                            break;
                        case 7:
                            ygLcUYwZ();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.wxUZMvaN = false;
            throw th;
        }
    }

    public final Bundle lDXGDhIF() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        li liVar = this.MdtA4re8;
        if (liVar.NCTxEWno == -1 && (bundle = liVar.MdtA4re8) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new wj(liVar));
        if (liVar.NCTxEWno > -1) {
            Bundle bundle3 = new Bundle();
            liVar.Mq3SeTnW(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.qoPGr6Ce.OxcuoDLp(false);
            Bundle bundle4 = new Bundle();
            liVar.ZyZthT5G.eVhOlqcC(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bvfAo0eO = liVar.RXQxj5Oe.bvfAo0eO();
            if (!bvfAo0eO.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bvfAo0eO);
            }
            if (liVar.ytu5o6f4 != null) {
                sjUBp5pO();
            }
            SparseArray<? extends Parcelable> sparseArray = liVar.wxUZMvaN;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = liVar.VgvYg0wo;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = liVar.b2ZJblxo;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void ow5vqvCr() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "movefrom RESUMED: " + liVar);
        }
        liVar.RXQxj5Oe.Ey6iv0m0(5);
        if (liVar.ytu5o6f4 != null) {
            liVar.nSmgoSB5.NCTxEWno(oo.ON_PAUSE);
        }
        liVar.FXJmAAN1.wxUZMvaN(oo.ON_PAUSE);
        liVar.NCTxEWno = 6;
        liVar.euDDoUNr = true;
        this.qoPGr6Ce.OnDfzHZD(false);
    }

    public final void qoPGr6Ce() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + liVar);
        }
        Bundle bundle = liVar.MdtA4re8;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        liVar.RXQxj5Oe.hzgxAD8d();
        liVar.NCTxEWno = 3;
        liVar.euDDoUNr = false;
        liVar.Ey6iv0m0();
        if (!liVar.euDDoUNr) {
            m1.MdtA4re8(liVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + liVar);
        }
        if (liVar.ytu5o6f4 != null) {
            Bundle bundle2 = liVar.MdtA4re8;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = liVar.wxUZMvaN;
            if (sparseArray != null) {
                liVar.ytu5o6f4.restoreHierarchyState(sparseArray);
                liVar.wxUZMvaN = null;
            }
            liVar.euDDoUNr = false;
            liVar.eIA6dogk(bundle3);
            if (!liVar.euDDoUNr) {
                m1.MdtA4re8(liVar, " did not call through to super.onViewStateRestored()");
                return;
            } else if (liVar.ytu5o6f4 != null) {
                liVar.nSmgoSB5.NCTxEWno(oo.ON_CREATE);
            }
        }
        liVar.MdtA4re8 = null;
        ej ejVar = liVar.RXQxj5Oe;
        ejVar.SgZGMMPL = false;
        ejVar.ytu5o6f4 = false;
        ejVar.fVMzMhyS.b2ZJblxo = false;
        ejVar.Ey6iv0m0(4);
        this.qoPGr6Ce.Qr9iLBAD(false);
    }

    public final void sjUBp5pO() {
        li liVar = this.MdtA4re8;
        if (liVar.ytu5o6f4 == null) {
            return;
        }
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + liVar + " with view " + liVar.ytu5o6f4);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        liVar.ytu5o6f4.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            liVar.wxUZMvaN = sparseArray;
        }
        Bundle bundle = new Bundle();
        liVar.nSmgoSB5.b2ZJblxo.eVhOlqcC(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        liVar.VgvYg0wo = bundle;
    }

    public final int wxUZMvaN() {
        Object obj;
        li liVar = this.MdtA4re8;
        if (liVar.Ey6iv0m0 == null) {
            return liVar.NCTxEWno;
        }
        int i = this.VgvYg0wo;
        int ordinal = liVar.zCflySGU.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (liVar.lDXGDhIF) {
            boolean z = liVar.sjUBp5pO;
            int i2 = this.VgvYg0wo;
            if (z) {
                i = Math.max(i2, 2);
                View view = liVar.ytu5o6f4;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i2 < 4 ? Math.min(i, liVar.NCTxEWno) : Math.min(i, 1);
            }
        }
        if (!liVar.ow5vqvCr) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = liVar.SgZGMMPL;
        if (viewGroup != null) {
            pb P7K7Inc8 = pb.P7K7Inc8(viewGroup, liVar.ow5vqvCr());
            d80 wxUZMvaN = P7K7Inc8.wxUZMvaN(liVar);
            int i3 = wxUZMvaN != null ? wxUZMvaN.NCTxEWno : 0;
            ArrayList arrayList = P7K7Inc8.MdtA4re8;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i4);
                i4++;
                d80 d80Var = (d80) obj;
                if (d80Var.MdtA4re8.equals(liVar) && !d80Var.P7K7Inc8) {
                    break;
                }
            }
            d80 d80Var2 = (d80) obj;
            r3 = d80Var2 != null ? d80Var2.NCTxEWno : 0;
            int i5 = i3 == 0 ? -1 : e80.qoPGr6Ce[q70.k3x7lurq(i3)];
            if (i5 != -1 && i5 != 1) {
                r3 = i3;
            }
        }
        if (r3 == 2) {
            i = Math.min(i, 6);
        } else if (r3 == 3) {
            i = Math.max(i, 3);
        } else if (liVar.OnDfzHZD) {
            i = liVar.KlHjfFWx() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (liVar.eIA6dogk && liVar.NCTxEWno < 5) {
            i = Math.min(i, 4);
        }
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + liVar);
        }
        return i;
    }

    public final void ygLcUYwZ() {
        boolean ytu5o6f4 = ej.ytu5o6f4(3);
        li liVar = this.MdtA4re8;
        if (ytu5o6f4) {
            Log.d("FragmentManager", "moveto RESUMED: " + liVar);
        }
        ki kiVar = liVar.VhgXwMj9;
        View view = kiVar == null ? null : kiVar.k3x7lurq;
        if (view != null) {
            if (view != liVar.ytu5o6f4) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != liVar.ytu5o6f4) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (ej.ytu5o6f4(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(liVar);
                sb.append(" resulting in focused view ");
                sb.append(liVar.ytu5o6f4.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        liVar.Qr9iLBAD().k3x7lurq = null;
        liVar.RXQxj5Oe.hzgxAD8d();
        liVar.RXQxj5Oe.gjV1z5T1(true);
        liVar.NCTxEWno = 7;
        liVar.euDDoUNr = true;
        xo xoVar = liVar.FXJmAAN1;
        oo ooVar = oo.ON_RESUME;
        xoVar.wxUZMvaN(ooVar);
        if (liVar.ytu5o6f4 != null) {
            liVar.nSmgoSB5.P7K7Inc8.wxUZMvaN(ooVar);
        }
        ej ejVar = liVar.RXQxj5Oe;
        ejVar.SgZGMMPL = false;
        ejVar.ytu5o6f4 = false;
        ejVar.fVMzMhyS.b2ZJblxo = false;
        ejVar.Ey6iv0m0(7);
        this.qoPGr6Ce.sjUBp5pO(false);
        this.NCTxEWno.OnDfzHZD(liVar.P7K7Inc8, null);
        liVar.MdtA4re8 = null;
        liVar.wxUZMvaN = null;
        liVar.VgvYg0wo = null;
    }

    public xj(mcXgUFR8 mcxgufr8, VZZbw3BB vZZbw3BB, li liVar) {
        this.qoPGr6Ce = mcxgufr8;
        this.NCTxEWno = vZZbw3BB;
        this.MdtA4re8 = liVar;
    }

    public xj(mcXgUFR8 mcxgufr8, VZZbw3BB vZZbw3BB, li liVar, Bundle bundle) {
        this.qoPGr6Ce = mcxgufr8;
        this.NCTxEWno = vZZbw3BB;
        this.MdtA4re8 = liVar;
        liVar.wxUZMvaN = null;
        liVar.VgvYg0wo = null;
        liVar.KlHjfFWx = 0;
        liVar.sjUBp5pO = false;
        liVar.ow5vqvCr = false;
        li liVar2 = liVar.Qr9iLBAD;
        liVar.jb9XjC4I = liVar2 != null ? liVar2.P7K7Inc8 : null;
        liVar.Qr9iLBAD = null;
        liVar.MdtA4re8 = bundle;
        liVar.b2ZJblxo = bundle.getBundle("arguments");
    }
}

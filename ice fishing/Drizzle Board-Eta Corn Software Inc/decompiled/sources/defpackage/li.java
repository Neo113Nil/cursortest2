package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class li implements ComponentCallbacks, View.OnCreateContextMenuListener, vo, vg0, gm, s50 {
    public static final Object gmkaJpmS = new Object();
    public String DK9slbsy;
    public ej Ey6iv0m0;
    public xo FXJmAAN1;
    public li FySoLYna;
    public t50 HdOGZAzC;
    public ni I5GHvsYW;
    public final ii KRabZ4CU;
    public int KlHjfFWx;
    public Bundle MdtA4re8;
    public final nt N8VPGzVC;
    public boolean OnDfzHZD;
    public boolean OxcuoDLp;
    public li Qr9iLBAD;
    public ViewGroup SgZGMMPL;
    public boolean U0LaHZX7;
    public Bundle VgvYg0wo;
    public ki VhgXwMj9;
    public int WYNAV5pd;
    public LayoutInflater Xkz7p5xa;
    public q50 ZyZthT5G;
    public boolean aZz0PFXp;
    public boolean amk52bBQ;
    public Bundle b2ZJblxo;
    public final ArrayList bvfAo0eO;
    public boolean eIA6dogk;
    public int eVhOlqcC;
    public boolean euDDoUNr;
    public boolean fVMzMhyS;
    public int gjV1z5T1;
    public String hzgxAD8d;
    public boolean i7xS8jrb;
    public boolean lDXGDhIF;
    public boolean lwWCatUu;
    public bk nSmgoSB5;
    public boolean ow5vqvCr;
    public boolean sjUBp5pO;
    public SparseArray wxUZMvaN;
    public boolean ygLcUYwZ;
    public View ytu5o6f4;
    public po zCflySGU;
    public int NCTxEWno = -1;
    public String P7K7Inc8 = UUID.randomUUID().toString();
    public String jb9XjC4I = null;
    public Boolean k3x7lurq = null;
    public ej RXQxj5Oe = new ej();
    public final boolean Mq3SeTnW = true;
    public boolean pRiPUEwG = true;

    public li() {
        new i1(6, this);
        this.zCflySGU = po.P7K7Inc8;
        this.N8VPGzVC = new nt();
        new AtomicInteger();
        this.bvfAo0eO = new ArrayList();
        this.KRabZ4CU = new ii(this);
        sjUBp5pO();
    }

    public abstract void DK9slbsy();

    public void Ey6iv0m0() {
        this.euDDoUNr = true;
    }

    public void FySoLYna(Context context) {
        this.euDDoUNr = true;
        ni niVar = this.I5GHvsYW;
        f4UNdked f4undked = niVar == null ? null : niVar.sjUBp5pO;
        if (f4undked != null) {
            this.euDDoUNr = false;
            RXQxj5Oe(f4undked);
        }
    }

    public final void I5GHvsYW(int i, int i2, Intent intent) {
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public final boolean KlHjfFWx() {
        return this.KlHjfFWx > 0;
    }

    public w30 MdtA4re8() {
        return new ji(this);
    }

    public final String OnDfzHZD(int i) {
        return aZz0PFXp().getResources().getString(i);
    }

    public final void OxcuoDLp() {
        sjUBp5pO();
        this.hzgxAD8d = this.P7K7Inc8;
        this.P7K7Inc8 = UUID.randomUUID().toString();
        this.ow5vqvCr = false;
        this.OnDfzHZD = false;
        this.lDXGDhIF = false;
        this.sjUBp5pO = false;
        this.OxcuoDLp = false;
        this.KlHjfFWx = 0;
        this.Ey6iv0m0 = null;
        this.RXQxj5Oe = new ej();
        this.I5GHvsYW = null;
        this.gjV1z5T1 = 0;
        this.WYNAV5pd = 0;
        this.DK9slbsy = null;
        this.lwWCatUu = false;
        this.U0LaHZX7 = false;
    }

    @Override // defpackage.vg0
    public final ug0 P7K7Inc8() {
        if (this.Ey6iv0m0 == null) {
            m1.Ey6iv0m0("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k3x7lurq() == 1) {
            m1.Ey6iv0m0("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.Ey6iv0m0.fVMzMhyS.wxUZMvaN;
        ug0 ug0Var = (ug0) hashMap.get(this.P7K7Inc8);
        if (ug0Var != null) {
            return ug0Var;
        }
        ug0 ug0Var2 = new ug0();
        hashMap.put(this.P7K7Inc8, ug0Var2);
        return ug0Var2;
    }

    public final ki Qr9iLBAD() {
        ki kiVar = this.VhgXwMj9;
        if (kiVar != null) {
            return kiVar;
        }
        ki kiVar2 = new ki();
        Object obj = gmkaJpmS;
        kiVar2.b2ZJblxo = obj;
        kiVar2.Qr9iLBAD = obj;
        kiVar2.jb9XjC4I = obj;
        kiVar2.eVhOlqcC = 1.0f;
        kiVar2.k3x7lurq = null;
        this.VhgXwMj9 = kiVar2;
        return kiVar2;
    }

    public void RXQxj5Oe(Activity activity) {
        this.euDDoUNr = true;
    }

    public void SgZGMMPL() {
        this.euDDoUNr = true;
    }

    public LayoutInflater U0LaHZX7(Bundle bundle) {
        ni niVar = this.I5GHvsYW;
        if (niVar == null) {
            m1.Ey6iv0m0("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        f4UNdked f4undked = niVar.Ey6iv0m0;
        LayoutInflater cloneInContext = f4undked.getLayoutInflater().cloneInContext(f4undked);
        cloneInContext.setFactory2(this.RXQxj5Oe.P7K7Inc8);
        return cloneInContext;
    }

    @Override // defpackage.gm
    public final mt VgvYg0wo() {
        Application application;
        Context applicationContext = aZz0PFXp().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + aZz0PFXp().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        mt mtVar = new mt(0);
        LinkedHashMap linkedHashMap = mtVar.qoPGr6Ce;
        if (application != null) {
            linkedHashMap.put(qg0.wxUZMvaN, application);
        }
        linkedHashMap.put(w30.b2ZJblxo, this);
        linkedHashMap.put(w30.Qr9iLBAD, this);
        Bundle bundle = this.b2ZJblxo;
        if (bundle != null) {
            linkedHashMap.put(w30.jb9XjC4I, bundle);
        }
        return mtVar;
    }

    public final f4UNdked VhgXwMj9() {
        ni niVar = this.I5GHvsYW;
        f4UNdked f4undked = niVar == null ? null : niVar.sjUBp5pO;
        if (f4undked != null) {
            return f4undked;
        }
        m1.ygLcUYwZ(this, " not attached to an activity.", "Fragment ");
        return null;
    }

    public View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final View Xkz7p5xa() {
        View view = this.ytu5o6f4;
        if (view != null) {
            return view;
        }
        m1.ygLcUYwZ(this, " did not return a View from onCreateView() or this was called before onCreateView().", "Fragment ");
        return null;
    }

    public final Context aZz0PFXp() {
        Context eVhOlqcC = eVhOlqcC();
        if (eVhOlqcC != null) {
            return eVhOlqcC;
        }
        m1.ygLcUYwZ(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final boolean amk52bBQ() {
        if (this.lwWCatUu) {
            return true;
        }
        ej ejVar = this.Ey6iv0m0;
        if (ejVar != null) {
            li liVar = this.FySoLYna;
            ejVar.getClass();
            if (liVar == null ? false : liVar.amk52bBQ()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        return this.FXJmAAN1;
    }

    public void eIA6dogk(Bundle bundle) {
        this.euDDoUNr = true;
    }

    public Context eVhOlqcC() {
        ni niVar = this.I5GHvsYW;
        if (niVar == null) {
            return null;
        }
        return niVar.OxcuoDLp;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public void euDDoUNr() {
        this.euDDoUNr = true;
    }

    public final void fVMzMhyS(int i, int i2, int i3, int i4) {
        if (this.VhgXwMj9 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        Qr9iLBAD().NCTxEWno = i;
        Qr9iLBAD().MdtA4re8 = i2;
        Qr9iLBAD().wxUZMvaN = i3;
        Qr9iLBAD().VgvYg0wo = i4;
    }

    public void gjV1z5T1(Bundle bundle) {
        Bundle bundle2;
        this.euDDoUNr = true;
        Bundle bundle3 = this.MdtA4re8;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.RXQxj5Oe.ZyZthT5G(bundle2);
            ej ejVar = this.RXQxj5Oe;
            ejVar.SgZGMMPL = false;
            ejVar.ytu5o6f4 = false;
            ejVar.fVMzMhyS.b2ZJblxo = false;
            ejVar.Ey6iv0m0(1);
        }
        ej ejVar2 = this.RXQxj5Oe;
        if (ejVar2.Ey6iv0m0 >= 1) {
            return;
        }
        ejVar2.SgZGMMPL = false;
        ejVar2.ytu5o6f4 = false;
        ejVar2.fVMzMhyS.b2ZJblxo = false;
        ejVar2.Ey6iv0m0(1);
    }

    public final void hzgxAD8d(Bundle bundle) {
        ej ejVar = this.Ey6iv0m0;
        if (ejVar != null) {
            if (ejVar == null ? false : ejVar.Xkz7p5xa()) {
                m1.Ey6iv0m0("Fragment already added and state has been saved");
                return;
            }
        }
        this.b2ZJblxo = bundle;
    }

    public void i7xS8jrb(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.euDDoUNr = true;
        ni niVar = this.I5GHvsYW;
        if ((niVar == null ? null : niVar.sjUBp5pO) != null) {
            this.euDDoUNr = true;
        }
    }

    public final ej jb9XjC4I() {
        if (this.I5GHvsYW != null) {
            return this.RXQxj5Oe;
        }
        m1.ygLcUYwZ(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final int k3x7lurq() {
        po poVar = this.zCflySGU;
        return (poVar == po.MdtA4re8 || this.FySoLYna == null) ? poVar.ordinal() : Math.min(poVar.ordinal(), this.FySoLYna.k3x7lurq());
    }

    public final bk lDXGDhIF() {
        bk bkVar = this.nSmgoSB5;
        if (bkVar != null) {
            return bkVar;
        }
        m1.ygLcUYwZ(this, " when getView() is null i.e., before onCreateView() or after onDestroyView()", "Can't access the Fragment View's LifecycleOwner for ");
        return null;
    }

    public void lwWCatUu() {
        this.euDDoUNr = true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.euDDoUNr = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        VhgXwMj9().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.euDDoUNr = true;
    }

    public final ej ow5vqvCr() {
        ej ejVar = this.Ey6iv0m0;
        if (ejVar != null) {
            return ejVar;
        }
        m1.ygLcUYwZ(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public void pRiPUEwG(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.RXQxj5Oe.hzgxAD8d();
        this.amk52bBQ = true;
        this.nSmgoSB5 = new bk(this, P7K7Inc8(), new d3vfVszL(7, this));
        View WYNAV5pd = WYNAV5pd(layoutInflater, viewGroup);
        this.ytu5o6f4 = WYNAV5pd;
        bk bkVar = this.nSmgoSB5;
        if (WYNAV5pd == null) {
            if (bkVar.P7K7Inc8 == null) {
                this.nSmgoSB5 = null;
                return;
            } else {
                m1.Ey6iv0m0("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        bkVar.MdtA4re8();
        if (ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.ytu5o6f4 + " for Fragment " + this);
        }
        View view = this.ytu5o6f4;
        bk bkVar2 = this.nSmgoSB5;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, bkVar2);
        View view2 = this.ytu5o6f4;
        bk bkVar3 = this.nSmgoSB5;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, bkVar3);
        View view3 = this.ytu5o6f4;
        bk bkVar4 = this.nSmgoSB5;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, bkVar4);
        nt ntVar = this.N8VPGzVC;
        bk bkVar5 = this.nSmgoSB5;
        ntVar.getClass();
        nt.qoPGr6Ce("setValue");
        ntVar.b2ZJblxo++;
        ntVar.VgvYg0wo = bkVar5;
        ntVar.MdtA4re8(null);
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        return (mcXgUFR8) this.ZyZthT5G.NCTxEWno;
    }

    public final void sjUBp5pO() {
        this.FXJmAAN1 = new xo(this);
        this.ZyZthT5G = new q50(new r50(this, new e7(8, this)));
        this.HdOGZAzC = null;
        ArrayList arrayList = this.bvfAo0eO;
        ii iiVar = this.KRabZ4CU;
        if (arrayList.contains(iiVar)) {
            return;
        }
        if (this.NCTxEWno >= 0) {
            iiVar.qoPGr6Ce();
        } else {
            arrayList.add(iiVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.P7K7Inc8);
        if (this.gjV1z5T1 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.gjV1z5T1));
        }
        if (this.DK9slbsy != null) {
            sb.append(" tag=");
            sb.append(this.DK9slbsy);
        }
        sb.append(")");
        return sb.toString();
    }

    public rg0 wxUZMvaN() {
        Application application = null;
        if (this.Ey6iv0m0 == null) {
            m1.Ey6iv0m0("Can't access ViewModels from detached fragment");
            return null;
        }
        t50 t50Var = this.HdOGZAzC;
        if (t50Var != null) {
            return t50Var;
        }
        Context applicationContext = aZz0PFXp().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ej.ytu5o6f4(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + aZz0PFXp().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        t50 t50Var2 = new t50(application, this, this.b2ZJblxo);
        this.HdOGZAzC = t50Var2;
        return t50Var2;
    }

    public final String ygLcUYwZ(int i, Object... objArr) {
        return aZz0PFXp().getResources().getString(i, objArr);
    }

    public void Mq3SeTnW(Bundle bundle) {
    }

    public void ytu5o6f4(View view) {
    }
}

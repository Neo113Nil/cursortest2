package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class yr implements Menu {
    public static final int[] WYNAV5pd = {1, 4, 5, 3, 2, 0};
    public boolean MdtA4re8;
    public final Resources NCTxEWno;
    public CharSequence OnDfzHZD;
    public final ArrayList P7K7Inc8;
    public boolean Qr9iLBAD;
    public cs RXQxj5Oe;
    public wr VgvYg0wo;
    public final ArrayList b2ZJblxo;
    public final ArrayList eVhOlqcC;
    public boolean gjV1z5T1;
    public final ArrayList jb9XjC4I;
    public boolean k3x7lurq;
    public View lDXGDhIF;
    public final Context qoPGr6Ce;
    public final boolean wxUZMvaN;
    public Drawable ygLcUYwZ;
    public int ow5vqvCr = 0;
    public boolean sjUBp5pO = false;
    public boolean OxcuoDLp = false;
    public boolean amk52bBQ = false;
    public boolean KlHjfFWx = false;
    public final ArrayList Ey6iv0m0 = new ArrayList();
    public final CopyOnWriteArrayList I5GHvsYW = new CopyOnWriteArrayList();
    public boolean FySoLYna = false;

    public yr(Context context) {
        boolean z;
        boolean z2 = false;
        this.qoPGr6Ce = context;
        Resources resources = context.getResources();
        this.NCTxEWno = resources;
        this.P7K7Inc8 = new ArrayList();
        this.b2ZJblxo = new ArrayList();
        this.Qr9iLBAD = true;
        this.jb9XjC4I = new ArrayList();
        this.eVhOlqcC = new ArrayList();
        this.k3x7lurq = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = jg0.qoPGr6Ce;
            if (Build.VERSION.SDK_INT >= 28) {
                z = fd.eVhOlqcC(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.wxUZMvaN = z2;
    }

    public final void Ey6iv0m0(Bundle bundle) {
        int size = this.P7K7Inc8.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ka0) item.getSubMenu()).Ey6iv0m0(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(eVhOlqcC(), sparseArray);
        }
    }

    public final void FySoLYna() {
        if (this.sjUBp5pO) {
            return;
        }
        this.sjUBp5pO = true;
        this.OxcuoDLp = false;
        this.amk52bBQ = false;
    }

    public final void I5GHvsYW(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.lDXGDhIF = view;
            this.OnDfzHZD = null;
            this.ygLcUYwZ = null;
        } else {
            if (i > 0) {
                this.OnDfzHZD = this.NCTxEWno.getText(i);
            } else if (charSequence != null) {
                this.OnDfzHZD = charSequence;
            }
            if (i2 > 0) {
                this.ygLcUYwZ = this.qoPGr6Ce.getDrawable(i2);
            } else if (drawable != null) {
                this.ygLcUYwZ = drawable;
            }
            this.lDXGDhIF = null;
        }
        sjUBp5pO(false);
    }

    public final void KlHjfFWx(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(eVhOlqcC());
        int size = this.P7K7Inc8.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ka0) item.getSubMenu()).KlHjfFWx(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public final void MdtA4re8(boolean z) {
        if (this.KlHjfFWx) {
            return;
        }
        this.KlHjfFWx = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar = (ps) weakReference.get();
            if (psVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                psVar.qoPGr6Ce(this, z);
            }
        }
        this.KlHjfFWx = false;
    }

    public final void NCTxEWno(ps psVar, Context context) {
        this.I5GHvsYW.add(new WeakReference(psVar));
        psVar.Qr9iLBAD(context, this);
        this.k3x7lurq = true;
    }

    public boolean OnDfzHZD() {
        return this.FySoLYna;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OxcuoDLp(MenuItem menuItem, ps psVar, int i) {
        boolean z;
        cs csVar = (cs) menuItem;
        if (csVar == null || !csVar.isEnabled()) {
            return false;
        }
        yr yrVar = csVar.ygLcUYwZ;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = csVar.sjUBp5pO;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(csVar)) && !yrVar.VgvYg0wo(yrVar, csVar)) {
            Intent intent = csVar.b2ZJblxo;
            if (intent != null) {
                try {
                    yrVar.qoPGr6Ce.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                }
            }
            ds dsVar = csVar.lwWCatUu;
            if (dsVar == null || !dsVar.NCTxEWno.onPerformDefaultAction()) {
                z = false;
                ds dsVar2 = csVar.lwWCatUu;
                boolean z2 = dsVar2 == null && dsVar2.NCTxEWno.hasSubMenu();
                if (!csVar.VgvYg0wo()) {
                    z |= csVar.expandActionView();
                    if (z) {
                        MdtA4re8(true);
                    }
                } else if (csVar.hasSubMenu() || z2) {
                    if ((i & 4) == 0) {
                        MdtA4re8(false);
                    }
                    if (!csVar.hasSubMenu()) {
                        ka0 ka0Var = new ka0(this.qoPGr6Ce, this, csVar);
                        csVar.lDXGDhIF = ka0Var;
                        ka0Var.setHeaderTitle(csVar.VgvYg0wo);
                    }
                    ka0 ka0Var2 = csVar.lDXGDhIF;
                    if (z2) {
                        dsVar2.NCTxEWno.onPrepareSubMenu(ka0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = psVar != null ? psVar.k3x7lurq(ka0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            ps psVar2 = (ps) weakReference.get();
                            if (psVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = psVar2.k3x7lurq(ka0Var2);
                            }
                        }
                    }
                    z |= r0;
                    if (!z) {
                        MdtA4re8(true);
                    }
                } else if ((i & 1) == 0) {
                    MdtA4re8(true);
                }
                return z;
            }
        }
        z = true;
        ds dsVar22 = csVar.lwWCatUu;
        if (dsVar22 == null) {
        }
        if (!csVar.VgvYg0wo()) {
        }
        return z;
    }

    public boolean P7K7Inc8(cs csVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        FySoLYna();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar = (ps) weakReference.get();
            if (psVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = psVar.b2ZJblxo(csVar);
                if (z) {
                    break;
                }
            }
        }
        RXQxj5Oe();
        if (z) {
            this.RXQxj5Oe = csVar;
        }
        return z;
    }

    public final void Qr9iLBAD(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean ygLcUYwZ = ygLcUYwZ();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.P7K7Inc8;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                cs csVar = (cs) arrayList2.get(i2);
                if (csVar.hasSubMenu()) {
                    csVar.lDXGDhIF.Qr9iLBAD(arrayList, i, keyEvent);
                }
                char c = ygLcUYwZ ? csVar.eVhOlqcC : csVar.Qr9iLBAD;
                if ((modifiers & 69647) == ((ygLcUYwZ ? csVar.k3x7lurq : csVar.jb9XjC4I) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (ygLcUYwZ && c == '\b' && i == 67)) && csVar.isEnabled()) {
                        arrayList.add(csVar);
                    }
                }
            }
        }
    }

    public final void RXQxj5Oe() {
        this.sjUBp5pO = false;
        if (this.OxcuoDLp) {
            this.OxcuoDLp = false;
            sjUBp5pO(this.amk52bBQ);
        }
    }

    public boolean VgvYg0wo(yr yrVar, MenuItem menuItem) {
        wr wrVar = this.VgvYg0wo;
        return wrVar != null && wrVar.b2ZJblxo(yrVar, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return qoPGr6Ce(0, 0, 0, this.NCTxEWno.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.qoPGr6Ce.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            cs qoPGr6Ce = qoPGr6Ce(i, i2, i3, resolveInfo.loadLabel(packageManager));
            qoPGr6Ce.setIcon(resolveInfo.loadIcon(packageManager));
            qoPGr6Ce.b2ZJblxo = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = qoPGr6Ce;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        cs qoPGr6Ce = qoPGr6Ce(i, i2, i3, charSequence);
        ka0 ka0Var = new ka0(this.qoPGr6Ce, this, qoPGr6Ce);
        qoPGr6Ce.lDXGDhIF = ka0Var;
        ka0Var.setHeaderTitle(qoPGr6Ce.VgvYg0wo);
        return ka0Var;
    }

    public final void amk52bBQ(ps psVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar2 = (ps) weakReference.get();
            if (psVar2 == null || psVar2 == psVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final cs b2ZJblxo(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.Ey6iv0m0;
        arrayList.clear();
        Qr9iLBAD(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (cs) arrayList.get(0);
        }
        boolean ygLcUYwZ = ygLcUYwZ();
        for (int i2 = 0; i2 < size; i2++) {
            cs csVar = (cs) arrayList.get(i2);
            char c = ygLcUYwZ ? csVar.eVhOlqcC : csVar.Qr9iLBAD;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (ygLcUYwZ && c == '\b' && i == 67))) {
                return csVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
        cs csVar = this.RXQxj5Oe;
        if (csVar != null) {
            wxUZMvaN(csVar);
        }
        this.P7K7Inc8.clear();
        sjUBp5pO(true);
    }

    public final void clearHeader() {
        this.ygLcUYwZ = null;
        this.OnDfzHZD = null;
        this.lDXGDhIF = null;
        sjUBp5pO(false);
    }

    @Override // android.view.Menu
    public final void close() {
        MdtA4re8(true);
    }

    public String eVhOlqcC() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cs csVar = (cs) arrayList.get(i2);
            if (csVar.qoPGr6Ce == i) {
                return csVar;
            }
            if (csVar.hasSubMenu() && (findItem = csVar.lDXGDhIF.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.P7K7Inc8.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.gjV1z5T1) {
            return true;
        }
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cs) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b2ZJblxo(i, keyEvent) != null;
    }

    public final void jb9XjC4I() {
        ArrayList ow5vqvCr = ow5vqvCr();
        if (this.k3x7lurq) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ps psVar = (ps) weakReference.get();
                if (psVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= psVar.ow5vqvCr();
                }
            }
            ArrayList arrayList = this.jb9XjC4I;
            ArrayList arrayList2 = this.eVhOlqcC;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = ow5vqvCr.size();
                for (int i = 0; i < size; i++) {
                    cs csVar = (cs) ow5vqvCr.get(i);
                    if ((csVar.gjV1z5T1 & 32) == 32) {
                        arrayList.add(csVar);
                    } else {
                        arrayList2.add(csVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(ow5vqvCr());
            }
            this.k3x7lurq = false;
        }
    }

    public boolean lDXGDhIF() {
        return this.wxUZMvaN;
    }

    public final ArrayList ow5vqvCr() {
        boolean z = this.Qr9iLBAD;
        ArrayList arrayList = this.b2ZJblxo;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.P7K7Inc8;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            cs csVar = (cs) arrayList2.get(i);
            if (csVar.isVisible()) {
                arrayList.add(csVar);
            }
        }
        this.Qr9iLBAD = false;
        this.k3x7lurq = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OxcuoDLp(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        cs b2ZJblxo = b2ZJblxo(i, keyEvent);
        boolean OxcuoDLp = b2ZJblxo != null ? OxcuoDLp(b2ZJblxo, null, i2) : false;
        if ((i2 & 2) != 0) {
            MdtA4re8(true);
        }
        return OxcuoDLp;
    }

    public cs qoPGr6Ce(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            m1.sjUBp5pO("order does not contain a valid category.");
            return null;
        }
        int i6 = (WYNAV5pd[i5] << 16) | (65535 & i3);
        cs csVar = new cs(this, i, i2, i3, i6, charSequence, this.ow5vqvCr);
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((cs) arrayList.get(size)).wxUZMvaN <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, csVar);
        sjUBp5pO(true);
        return csVar;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((cs) arrayList.get(i3)).NCTxEWno == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((cs) arrayList.get(i3)).NCTxEWno != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            sjUBp5pO(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((cs) arrayList.get(i2)).qoPGr6Ce == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        sjUBp5pO(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cs csVar = (cs) arrayList.get(i2);
            if (csVar.NCTxEWno == i) {
                csVar.gjV1z5T1 = (csVar.gjV1z5T1 & (-5)) | (z2 ? 4 : 0);
                csVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.FySoLYna = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cs csVar = (cs) arrayList.get(i2);
            if (csVar.NCTxEWno == i) {
                csVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.P7K7Inc8;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            cs csVar = (cs) arrayList.get(i2);
            if (csVar.NCTxEWno == i) {
                int i3 = csVar.gjV1z5T1;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                csVar.gjV1z5T1 = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            sjUBp5pO(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.MdtA4re8 = z;
        sjUBp5pO(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.P7K7Inc8.size();
    }

    public void sjUBp5pO(boolean z) {
        if (this.sjUBp5pO) {
            this.OxcuoDLp = true;
            if (z) {
                this.amk52bBQ = true;
                return;
            }
            return;
        }
        if (z) {
            this.Qr9iLBAD = true;
            this.k3x7lurq = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        FySoLYna();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            ps psVar = (ps) weakReference.get();
            if (psVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                psVar.eVhOlqcC(z);
            }
        }
        RXQxj5Oe();
    }

    public boolean wxUZMvaN(cs csVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.I5GHvsYW;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.RXQxj5Oe == csVar) {
            FySoLYna();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ps psVar = (ps) weakReference.get();
                if (psVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = psVar.MdtA4re8(csVar);
                    if (z) {
                        break;
                    }
                }
            }
            RXQxj5Oe();
            if (z) {
                this.RXQxj5Oe = null;
            }
        }
        return z;
    }

    public boolean ygLcUYwZ() {
        return this.MdtA4re8;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return qoPGr6Ce(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return qoPGr6Ce(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return qoPGr6Ce(i, i2, i3, this.NCTxEWno.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.NCTxEWno.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.NCTxEWno.getString(i4));
    }

    public yr k3x7lurq() {
        return this;
    }
}

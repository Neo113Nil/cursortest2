package l;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0229m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f3708y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3710b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3711c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3712d;
    public InterfaceC0227k e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3713f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3715h;
    public final ArrayList i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3716k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f3718m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f3719n;

    /* renamed from: o, reason: collision with root package name */
    public View f3720o;

    /* renamed from: v, reason: collision with root package name */
    public o f3727v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3729x;

    /* renamed from: l, reason: collision with root package name */
    public int f3717l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3721p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3722q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3723r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3724s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f3725t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f3726u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f3728w = false;

    public MenuC0229m(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3709a = context;
        Resources resources = context.getResources();
        this.f3710b = resources;
        this.f3713f = new ArrayList();
        this.f3714g = new ArrayList();
        this.f3715h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f3716k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = E.a.j(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3712d = z3;
    }

    public o a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f3708y[i5] << 16) | (65535 & i3);
        o oVar = new o(this, i, i2, i3, i6, charSequence, this.f3717l);
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f3739d <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f3709a.getPackageManager();
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
            o a2 = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f3741g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f3726u.add(new WeakReference(yVar));
        yVar.d(context, this);
        this.f3716k = true;
    }

    public final void c(boolean z2) {
        if (this.f3724s) {
            return;
        }
        this.f3724s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z2);
            }
        }
        this.f3724s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f3727v;
        if (oVar != null) {
            d(oVar);
        }
        this.f3713f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f3719n = null;
        this.f3718m = null;
        this.f3720o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3727v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = yVar.k(oVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3727v = null;
            }
        }
        return z2;
    }

    public boolean e(MenuC0229m menuC0229m, MenuItem menuItem) {
        InterfaceC0227k interfaceC0227k = this.e;
        return interfaceC0227k != null && interfaceC0227k.p(menuC0229m, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = yVar.i(oVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3727v = oVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f3736a == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f3747o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3725t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            char c2 = n2 ? oVar.j : oVar.f3742h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f3713f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        int i2;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f3713f;
            int size = arrayList2.size();
            for (0; i2 < size; i2 + 1) {
                o oVar = (o) arrayList2.get(i2);
                if (oVar.hasSubMenu()) {
                    oVar.f3747o.h(arrayList, i, keyEvent);
                }
                char c2 = n2 ? oVar.j : oVar.f3742h;
                if ((modifiers & 69647) == ((n2 ? oVar.f3743k : oVar.i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == '\b') {
                            i2 = i != 67 ? i2 + 1 : 0;
                        }
                    }
                    if (oVar.isEnabled()) {
                        arrayList.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f3729x) {
            return true;
        }
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3716k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= yVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l2.get(i);
                    if (oVar.f()) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3716k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0229m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f3715h;
        ArrayList arrayList = this.f3714g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3713f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f3715h = false;
        this.f3716k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3728w;
    }

    public boolean n() {
        return this.f3711c;
    }

    public boolean o() {
        return this.f3712d;
    }

    public final void p(boolean z2) {
        if (this.f3721p) {
            this.f3722q = true;
            if (z2) {
                this.f3723r = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f3715h = true;
            this.f3716k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.m(z2);
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        o g2 = g(i, keyEvent);
        boolean q2 = g2 != null ? q(g2, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, y yVar, int i) {
        boolean z2;
        o oVar = (o) menuItem;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f3748p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) {
            MenuC0229m menuC0229m = oVar.f3746n;
            if (!menuC0229m.e(menuC0229m, oVar)) {
                Intent intent = oVar.f3741g;
                if (intent != null) {
                    try {
                        menuC0229m.f3709a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    }
                }
                p pVar = oVar.f3733A;
                if (pVar == null || !pVar.f3760b.onPerformDefaultAction()) {
                    z2 = false;
                    p pVar2 = oVar.f3733A;
                    boolean z3 = pVar2 == null && pVar2.f3760b.hasSubMenu();
                    if (!oVar.e()) {
                        z2 |= oVar.expandActionView();
                        if (z2) {
                            c(true);
                        }
                    } else if (oVar.hasSubMenu() || z3) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            SubMenuC0216E subMenuC0216E = new SubMenuC0216E(this.f3709a, this, oVar);
                            oVar.f3747o = subMenuC0216E;
                            subMenuC0216E.setHeaderTitle(oVar.e);
                        }
                        SubMenuC0216E subMenuC0216E2 = oVar.f3747o;
                        if (z3) {
                            pVar2.f3761c.getClass();
                            pVar2.f3760b.onPrepareSubMenu(subMenuC0216E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = yVar != null ? yVar.e(subMenuC0216E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                y yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = yVar2.e(subMenuC0216E2);
                                }
                            }
                        }
                        z2 |= r0;
                        if (!z2) {
                            c(true);
                        }
                    } else if ((i & 1) == 0) {
                        c(true);
                    }
                    return z2;
                }
            }
        }
        z2 = true;
        p pVar22 = oVar.f3733A;
        if (pVar22 == null) {
        }
        if (!oVar.e()) {
        }
        return z2;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3726u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((o) arrayList.get(i3)).f3737b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((o) arrayList.get(i3)).f3737b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f3713f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((o) arrayList.get(i2)).f3736a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f3713f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f3713f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0216E) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f3737b == i) {
                oVar.g(z3);
                oVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f3728w = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z2) {
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f3737b == i) {
                oVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z2) {
        ArrayList arrayList = this.f3713f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = (o) arrayList.get(i2);
            if (oVar.f3737b == i) {
                int i3 = oVar.f3756x;
                int i4 = (i3 & (-9)) | (z2 ? 0 : 8);
                oVar.f3756x = i4;
                if (i3 != i4) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f3711c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3713f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3713f.size();
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
                ((SubMenuC0216E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f3720o = view;
            this.f3718m = null;
            this.f3719n = null;
        } else {
            if (i > 0) {
                this.f3718m = this.f3710b.getText(i);
            } else if (charSequence != null) {
                this.f3718m = charSequence;
            }
            if (i2 > 0) {
                this.f3719n = this.f3709a.getDrawable(i2);
            } else if (drawable != null) {
                this.f3719n = drawable;
            }
            this.f3720o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3721p = false;
        if (this.f3722q) {
            this.f3722q = false;
            p(this.f3723r);
        }
    }

    public final void w() {
        if (this.f3721p) {
            return;
        }
        this.f3721p = true;
        this.f3722q = false;
        this.f3723r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f3710b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f3710b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        o a2 = a(i, i2, i3, charSequence);
        SubMenuC0216E subMenuC0216E = new SubMenuC0216E(this.f3709a, this, a2);
        a2.f3747o = subMenuC0216E;
        subMenuC0216E.setHeaderTitle(a2.e);
        return subMenuC0216E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f3710b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f3710b.getString(i4));
    }
}

package l;

import O.AbstractC0324b0;
import O.Z;
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

/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f38803R = {1, 4, 5, 3, 2, 0};

    /* renamed from: A, reason: collision with root package name */
    public boolean f38804A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f38805B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f38806C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f38807D;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f38809F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f38810G;

    /* renamed from: H, reason: collision with root package name */
    public View f38811H;

    /* renamed from: O, reason: collision with root package name */
    public o f38817O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f38819Q;

    /* renamed from: n, reason: collision with root package name */
    public final Context f38820n;

    /* renamed from: u, reason: collision with root package name */
    public final Resources f38821u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38822v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f38823w;

    /* renamed from: x, reason: collision with root package name */
    public k f38824x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f38825y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f38826z;

    /* renamed from: E, reason: collision with root package name */
    public int f38808E = 0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f38812I = false;
    public boolean J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38813K = false;

    /* renamed from: L, reason: collision with root package name */
    public boolean f38814L = false;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f38815M = new ArrayList();

    /* renamed from: N, reason: collision with root package name */
    public final CopyOnWriteArrayList f38816N = new CopyOnWriteArrayList();

    /* renamed from: P, reason: collision with root package name */
    public boolean f38818P = false;

    public m(Context context) {
        boolean z3;
        boolean z6 = false;
        this.f38820n = context;
        Resources resources = context.getResources();
        this.f38821u = resources;
        this.f38825y = new ArrayList();
        this.f38826z = new ArrayList();
        this.f38804A = true;
        this.f38805B = new ArrayList();
        this.f38806C = new ArrayList();
        this.f38807D = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0324b0.f2064a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = Z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID);
                z3 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z3) {
                z6 = true;
            }
        }
        this.f38823w = z6;
    }

    public final o a(int i, int i6, int i9, CharSequence charSequence) {
        int i10;
        int i11 = ((-65536) & i9) >> 16;
        if (i11 < 0 || i11 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i12 = (f38803R[i11] << 16) | (65535 & i9);
        o oVar = new o(this, i, i6, i9, i12, charSequence, this.f38808E);
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f38854w <= i12) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i6, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f38820n.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o a9 = a(i, i6, i9, resolveInfo.loadLabel(packageManager));
            a9.setIcon(resolveInfo.loadIcon(packageManager));
            a9.f38857z = intent2;
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = a9;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f38816N.add(new WeakReference(yVar));
        yVar.h(context, this);
        this.f38807D = true;
    }

    public final void c(boolean z3) {
        if (this.f38814L) {
            return;
        }
        this.f38814L = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z3);
            }
        }
        this.f38814L = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f38817O;
        if (oVar != null) {
            d(oVar);
        }
        this.f38825y.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f38810G = null;
        this.f38809F = null;
        this.f38811H = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f38817O == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = yVar.j(oVar);
                    if (z3) {
                        break;
                    }
                }
            }
            v();
            if (z3) {
                this.f38817O = null;
            }
        }
        return z3;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f38824x;
        return kVar != null && kVar.q(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
        boolean z3 = false;
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
                z3 = yVar.c(oVar);
                if (z3) {
                    break;
                }
            }
        }
        v();
        if (z3) {
            this.f38817O = oVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f38851n == i) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (findItem = oVar.f38837H.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final o g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f38815M;
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
        boolean n9 = n();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            char c9 = n9 ? oVar.f38832C : oVar.f38830A;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (n9 && c9 == '\b' && i == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f38825y.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean n9 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f38825y;
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                o oVar = (o) arrayList2.get(i6);
                if (oVar.hasSubMenu()) {
                    oVar.f38837H.h(arrayList, i, keyEvent);
                }
                char c9 = n9 ? oVar.f38832C : oVar.f38830A;
                if ((modifiers & 69647) == ((n9 ? oVar.f38833D : oVar.f38831B) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (n9 && c9 == '\b' && i == 67)) && oVar.isEnabled()) {
                        arrayList.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f38819Q) {
            return true;
        }
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l9 = l();
        if (this.f38807D) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 |= yVar.d();
                }
            }
            ArrayList arrayList = this.f38805B;
            ArrayList arrayList2 = this.f38806C;
            if (z3) {
                arrayList.clear();
                arrayList2.clear();
                int size = l9.size();
                for (int i = 0; i < size; i++) {
                    o oVar = (o) l9.get(i);
                    if ((oVar.f38845Q & 32) == 32) {
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
            this.f38807D = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z3 = this.f38804A;
        ArrayList arrayList = this.f38826z;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f38825y;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList2.get(i);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f38804A = false;
        this.f38807D = true;
        return arrayList;
    }

    public boolean m() {
        return this.f38818P;
    }

    public boolean n() {
        return this.f38822v;
    }

    public boolean o() {
        return this.f38823w;
    }

    public final void p(boolean z3) {
        if (this.f38812I) {
            this.J = true;
            if (z3) {
                this.f38813K = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f38804A = true;
            this.f38807D = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
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
                yVar.e();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i6) {
        return q(findItem(i), null, i6);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i6) {
        o g4 = g(i, keyEvent);
        boolean q8 = g4 != null ? q(g4, null, i6) : false;
        if ((i6 & 2) != 0) {
            c(true);
        }
        return q8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, y yVar, int i) {
        boolean z3;
        o oVar = (o) menuItem;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f38838I;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) {
            m mVar = oVar.f38836G;
            if (!mVar.e(mVar, oVar)) {
                Intent intent = oVar.f38857z;
                if (intent != null) {
                    try {
                        mVar.f38820n.startActivity(intent);
                    } catch (ActivityNotFoundException e9) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e9);
                    }
                }
                p pVar = oVar.f38848T;
                if (pVar == null || !pVar.f38859b.onPerformDefaultAction()) {
                    z3 = false;
                    p pVar2 = oVar.f38848T;
                    boolean z6 = pVar2 == null && pVar2.f38859b.hasSubMenu();
                    if (!oVar.e()) {
                        z3 |= oVar.expandActionView();
                        if (z3) {
                            c(true);
                        }
                    } else if (oVar.hasSubMenu() || z6) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            SubMenuC4643E subMenuC4643E = new SubMenuC4643E(this.f38820n, this, oVar);
                            oVar.f38837H = subMenuC4643E;
                            subMenuC4643E.setHeaderTitle(oVar.f38855x);
                        }
                        SubMenuC4643E subMenuC4643E2 = oVar.f38837H;
                        if (z6) {
                            t tVar = pVar2.f38860c;
                            pVar2.f38859b.onPrepareSubMenu(subMenuC4643E2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = yVar != null ? yVar.i(subMenuC4643E2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                y yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = yVar2.i(subMenuC4643E2);
                                }
                            }
                        }
                        z3 |= r0;
                        if (!z3) {
                            c(true);
                        }
                    } else if ((i & 1) == 0) {
                        c(true);
                    }
                    return z3;
                }
            }
        }
        z3 = true;
        p pVar22 = oVar.f38848T;
        if (pVar22 == null) {
        }
        if (!oVar.e()) {
        }
        return z3;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f38816N;
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
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        int i6 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((o) arrayList.get(i9)).f38852u == i) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            int size2 = arrayList.size() - i9;
            while (true) {
                int i10 = i6 + 1;
                if (i6 >= size2 || ((o) arrayList.get(i9)).f38852u != i) {
                    break;
                }
                if (i9 >= 0) {
                    ArrayList arrayList2 = this.f38825y;
                    if (i9 < arrayList2.size()) {
                        arrayList2.remove(i9);
                    }
                }
                i6 = i10;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((o) arrayList.get(i6)).f38851n == i) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            ArrayList arrayList2 = this.f38825y;
            if (i6 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i6);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f38825y.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC4643E) item.getSubMenu()).s(bundle);
            }
        }
        int i6 = bundle.getInt("android:menu:expandedactionview");
        if (i6 <= 0 || (findItem = findItem(i6)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z6) {
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f38852u == i) {
                oVar.f38845Q = (oVar.f38845Q & (-5)) | (z6 ? 4 : 0);
                oVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f38818P = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f38852u == i) {
                oVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        ArrayList arrayList = this.f38825y;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            o oVar = (o) arrayList.get(i6);
            if (oVar.f38852u == i) {
                int i9 = oVar.f38845Q;
                int i10 = (i9 & (-9)) | (z3 ? 0 : 8);
                oVar.f38845Q = i10;
                if (i9 != i10) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f38822v = z3;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f38825y.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f38825y.size();
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
                ((SubMenuC4643E) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i6, Drawable drawable, View view) {
        if (view != null) {
            this.f38811H = view;
            this.f38809F = null;
            this.f38810G = null;
        } else {
            if (i > 0) {
                this.f38809F = this.f38821u.getText(i);
            } else if (charSequence != null) {
                this.f38809F = charSequence;
            }
            if (i6 > 0) {
                this.f38810G = E.a.b(this.f38820n, i6);
            } else if (drawable != null) {
                this.f38810G = drawable;
            }
            this.f38811H = null;
        }
        p(false);
    }

    public final void v() {
        this.f38812I = false;
        if (this.J) {
            this.J = false;
            p(this.f38813K);
        }
    }

    public final void w() {
        if (this.f38812I) {
            return;
        }
        this.f38812I = true;
        this.J = false;
        this.f38813K = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f38821u.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f38821u.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i6, int i9, CharSequence charSequence) {
        return a(i, i6, i9, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i6, int i9, CharSequence charSequence) {
        o a9 = a(i, i6, i9, charSequence);
        SubMenuC4643E subMenuC4643E = new SubMenuC4643E(this.f38820n, this, a9);
        a9.f38837H = subMenuC4643E;
        subMenuC4643E.setHeaderTitle(a9.f38855x);
        return subMenuC4643E;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i6, int i9, int i10) {
        return a(i, i6, i9, this.f38821u.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i6, int i9, int i10) {
        return addSubMenu(i, i6, i9, this.f38821u.getString(i10));
    }

    public m k() {
        return this;
    }
}

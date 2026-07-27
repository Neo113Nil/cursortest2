package g;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h.InterfaceC0168l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n.AbstractC0219a;
import w.AbstractC0264B;
import w.z;

/* loaded from: classes.dex */
public class j implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f1963u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f1964a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f1965b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1966c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1967d;

    /* renamed from: e, reason: collision with root package name */
    public A.j f1968e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1969f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1970g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1971h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1972i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1973j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1974k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1975l;

    /* renamed from: s, reason: collision with root package name */
    public k f1981s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1976m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1977n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1978o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1979p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1980q = new ArrayList();
    public final CopyOnWriteArrayList r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f1982t = false;

    public j(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f1964a = context;
        Resources resources = context.getResources();
        this.f1965b = resources;
        this.f1969f = new ArrayList();
        this.f1970g = new ArrayList();
        this.f1971h = true;
        this.f1972i = new ArrayList();
        this.f1973j = new ArrayList();
        this.f1974k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0264B.f3010a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = z.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f1967d = z3;
    }

    public final k a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f1963u[i6] << 16) | (65535 & i4);
        k kVar = new k(this, i2, i3, i4, i7, charSequence);
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((k) arrayList.get(size)).f1988d <= i7) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, kVar);
        o(true);
        return kVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f1964a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k a2 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            a2.setIcon(resolveInfo.loadIcon(packageManager));
            a2.f1991g = intent2;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = a2;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.r.add(new WeakReference(pVar));
        pVar.i(context, this);
        this.f1974k = true;
    }

    public final void c(boolean z2) {
        if (this.f1979p) {
            return;
        }
        this.f1979p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z2);
            }
        }
        this.f1979p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f1981s;
        if (kVar != null) {
            d(kVar);
        }
        this.f1969f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f1975l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f1981s == kVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = pVar.k(kVar);
                    if (z2) {
                        break;
                    }
                }
            }
            r();
            if (z2) {
                this.f1981s = null;
            }
        }
        return z2;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0168l interfaceC0168l;
        A.j jVar2 = this.f1968e;
        if (jVar2 == null || (interfaceC0168l = ((ActionMenuView) jVar2.f30g).f1152C) == null) {
            return false;
        }
        ((Toolbar) ((A.j) interfaceC0168l).f30g).getClass();
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = pVar.j(kVar);
                if (z2) {
                    break;
                }
            }
        }
        r();
        if (z2) {
            this.f1981s = kVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f1985a == i2) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.f1999o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k g(int i2, KeyEvent keyEvent) {
        ArrayList arrayList = this.f1980q;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean m2 = m();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            char c2 = m2 ? kVar.f1994j : kVar.f1992h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (m2 && c2 == '\b' && i2 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f1969f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        int i3;
        boolean m2 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            ArrayList arrayList2 = this.f1969f;
            int size = arrayList2.size();
            for (0; i3 < size; i3 + 1) {
                k kVar = (k) arrayList2.get(i3);
                if (kVar.hasSubMenu()) {
                    kVar.f1999o.h(arrayList, i2, keyEvent);
                }
                char c2 = m2 ? kVar.f1994j : kVar.f1992h;
                if ((modifiers & 69647) == ((m2 ? kVar.f1995k : kVar.f1993i) & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (m2 && c2 == '\b') {
                            i3 = i2 != 67 ? i3 + 1 : 0;
                        }
                    }
                    if (kVar.isEnabled()) {
                        arrayList.add(kVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((k) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k2 = k();
        if (this.f1974k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= pVar.h();
                }
            }
            ArrayList arrayList = this.f1972i;
            ArrayList arrayList2 = this.f1973j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = k2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    k kVar = (k) k2.get(i2);
                    if (kVar.d()) {
                        arrayList.add(kVar);
                    } else {
                        arrayList2.add(kVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f1974k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f1971h;
        ArrayList arrayList = this.f1970g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f1969f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            k kVar = (k) arrayList2.get(i2);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f1971h = false;
        this.f1974k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f1982t;
    }

    public boolean m() {
        return this.f1966c;
    }

    public boolean n() {
        return this.f1967d;
    }

    public final void o(boolean z2) {
        if (this.f1976m) {
            this.f1977n = true;
            if (z2) {
                this.f1978o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f1971h = true;
            this.f1974k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.b();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, l lVar, int i2) {
        boolean z2;
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = kVar.f2000p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(kVar)) {
            j jVar = kVar.f1998n;
            if (!jVar.e(jVar, kVar)) {
                Intent intent = kVar.f1991g;
                if (intent != null) {
                    try {
                        jVar.f1964a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                z2 = false;
                if (!kVar.c()) {
                    z2 |= kVar.expandActionView();
                    if (z2) {
                        c(true);
                    }
                } else if (kVar.hasSubMenu()) {
                    if ((i2 & 4) == 0) {
                        c(false);
                    }
                    if (!kVar.hasSubMenu()) {
                        t tVar = new t(this.f1964a, this, kVar);
                        kVar.f1999o = tVar;
                        tVar.setHeaderTitle(kVar.f1989e);
                    }
                    t tVar2 = kVar.f1999o;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.r;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = lVar != null ? lVar.d(tVar2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            p pVar = (p) weakReference.get();
                            if (pVar == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = pVar.d(tVar2);
                            }
                        }
                    }
                    z2 |= r0;
                    if (!z2) {
                        c(true);
                    }
                } else if ((i2 & 1) == 0) {
                    c(true);
                }
                return z2;
            }
        }
        z2 = true;
        if (!kVar.c()) {
        }
        return z2;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i2, int i3) {
        return p(findItem(i2), null, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        k g2 = g(i2, keyEvent);
        boolean p2 = g2 != null ? p(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return p2;
    }

    public final void q(int i2, CharSequence charSequence, int i3, View view) {
        if (view != null) {
            this.f1975l = null;
        } else {
            if (i2 > 0) {
                this.f1975l = this.f1965b.getText(i2);
            } else if (charSequence != null) {
                this.f1975l = charSequence;
            }
            if (i3 > 0) {
                AbstractC0219a.b(this.f1964a, i3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f1976m = false;
        if (this.f1977n) {
            this.f1977n = false;
            o(this.f1978o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((k) arrayList.get(i4)).f1986b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((k) arrayList.get(i4)).f1986b != i2) {
                    break;
                }
                if (i4 >= 0) {
                    ArrayList arrayList2 = this.f1969f;
                    if (i4 < arrayList2.size()) {
                        arrayList2.remove(i4);
                    }
                }
                i3 = i5;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i2) {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((k) arrayList.get(i3)).f1985a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f1969f;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i3);
            o(true);
        }
    }

    public final void s() {
        if (this.f1976m) {
            return;
        }
        this.f1976m = true;
        this.f1977n = false;
        this.f1978o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f1986b == i2) {
                kVar.f2007x = (kVar.f2007x & (-5)) | (z3 ? 4 : 0);
                kVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f1982t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f1986b == i2) {
                kVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i2, boolean z2) {
        ArrayList arrayList = this.f1969f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar = (k) arrayList.get(i3);
            if (kVar.f1986b == i2) {
                int i4 = kVar.f2007x;
                int i5 = (i4 & (-9)) | (z2 ? 0 : 8);
                kVar.f2007x = i5;
                if (i4 != i5) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f1966c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f1969f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f1965b.getString(i2));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f1965b.getString(i2));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        k a2 = a(i2, i3, i4, charSequence);
        t tVar = new t(this.f1964a, this, a2);
        a2.f1999o = tVar;
        tVar.setHeaderTitle(a2.f1989e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f1965b.getString(i5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f1965b.getString(i5));
    }

    public j j() {
        return this;
    }
}

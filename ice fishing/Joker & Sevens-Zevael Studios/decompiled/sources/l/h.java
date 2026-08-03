package l;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class h implements Menu {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f3689u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f3690a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f3691b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3692c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3693d;

    /* renamed from: e, reason: collision with root package name */
    public f8.c f3694e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3695f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3696g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3697h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3698i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3699j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3700k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f3701l;

    /* renamed from: s, reason: collision with root package name */
    public i f3708s;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3702m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3703n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3704o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3705p = false;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3706q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f3707r = new CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f3709t = false;

    public h(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f3690a = context;
        Resources resources = context.getResources();
        this.f3691b = resources;
        this.f3695f = new ArrayList();
        this.f3696g = new ArrayList();
        this.f3697h = true;
        this.f3698i = new ArrayList();
        this.f3699j = new ArrayList();
        this.f3700k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = b3.a.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f3693d = z11;
    }

    public final i a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f3689u[i14] << 16) | (65535 & i12);
        i iVar = new i(this, i10, i11, i12, i15, charSequence);
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((i) arrayList.get(size)).f3713d <= i15) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i13, iVar);
        o(true);
        return iVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f3690a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            i a6 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a6.setIcon(resolveInfo.loadIcon(packageManager));
            a6.f3716g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a6;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(n nVar, Context context) {
        this.f3707r.add(new WeakReference(nVar));
        nVar.g(context, this);
        this.f3700k = true;
    }

    public final void c(boolean z10) {
        if (this.f3705p) {
            return;
        }
        this.f3705p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nVar.a(this, z10);
            }
        }
        this.f3705p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        i iVar = this.f3708s;
        if (iVar != null) {
            d(iVar);
        }
        this.f3695f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f3701l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(i iVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3708s == iVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                n nVar = (n) weakReference.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = nVar.k(iVar);
                    if (z10) {
                        break;
                    }
                }
            }
            r();
            if (z10) {
                this.f3708s = null;
            }
        }
        return z10;
    }

    public boolean e(h hVar, MenuItem menuItem) {
        m.l lVar;
        f8.c cVar = this.f3694e;
        if (cVar == null || (lVar = ((ActionMenuView) cVar.f2340h).D) == null) {
            return false;
        }
        ((Toolbar) ((f8.c) lVar).f2340h).getClass();
        return false;
    }

    public boolean f(i iVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = nVar.f(iVar);
                if (z10) {
                    break;
                }
            }
        }
        r();
        if (z10) {
            this.f3708s = iVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f3710a == i10) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.f3724o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final i g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f3706q;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean m10 = m();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            char c3 = m10 ? iVar.f3719j : iVar.f3717h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (m10 && c3 == '\b' && i10 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f3695f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean m10 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f3695f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = (i) arrayList.get(i11);
                if (iVar.hasSubMenu()) {
                    iVar.f3724o.h(list, i10, keyEvent);
                }
                char c3 = m10 ? iVar.f3719j : iVar.f3717h;
                if ((modifiers & 69647) == ((m10 ? iVar.f3720k : iVar.f3718i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (m10 && c3 == '\b' && i10 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (this.f3700k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                n nVar = (n) weakReference.get();
                if (nVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 |= nVar.h();
                }
            }
            ArrayList arrayList = this.f3698i;
            ArrayList arrayList2 = this.f3699j;
            if (z10) {
                arrayList.clear();
                arrayList2.clear();
                int size = k3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    i iVar = (i) k3.get(i10);
                    if ((iVar.f3733x & 32) == 32) {
                        arrayList.add(iVar);
                    } else {
                        arrayList2.add(iVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f3700k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z10 = this.f3697h;
        ArrayList arrayList = this.f3696g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3695f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) arrayList2.get(i10);
            if (iVar.isVisible()) {
                arrayList.add(iVar);
            }
        }
        this.f3697h = false;
        this.f3700k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f3709t;
    }

    public boolean m() {
        return this.f3692c;
    }

    public boolean n() {
        return this.f3693d;
    }

    public final void o(boolean z10) {
        if (this.f3702m) {
            this.f3703n = true;
            if (z10) {
                this.f3704o = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f3697h = true;
            this.f3700k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            n nVar = (n) weakReference.get();
            if (nVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                nVar.c();
            }
        }
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MenuItem menuItem, j jVar, int i10) {
        boolean z10;
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        h hVar = iVar.f3723n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = iVar.f3725p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(iVar)) && !hVar.e(hVar, iVar)) {
            Intent intent = iVar.f3716g;
            if (intent != null) {
                try {
                    hVar.f3690a.startActivity(intent);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                }
            }
            z10 = false;
            if ((iVar.f3734y & 8) == 0 && iVar.f3735z != null) {
                z10 |= iVar.expandActionView();
                if (z10) {
                    c(true);
                }
            } else if (!iVar.hasSubMenu()) {
                if ((i10 & 4) == 0) {
                    c(false);
                }
                if (!iVar.hasSubMenu()) {
                    r rVar = new r(this.f3690a, this, iVar);
                    iVar.f3724o = rVar;
                    rVar.setHeaderTitle(iVar.f3714e);
                }
                r rVar2 = iVar.f3724o;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f3707r;
                if (!copyOnWriteArrayList.isEmpty()) {
                    r0 = jVar != null ? jVar.i(rVar2) : false;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        n nVar = (n) weakReference.get();
                        if (nVar == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!r0) {
                            r0 = nVar.i(rVar2);
                        }
                    }
                }
                z10 |= r0;
                if (!z10) {
                    c(true);
                }
            } else if ((i10 & 1) == 0) {
                c(true);
            }
            return z10;
        }
        z10 = true;
        if ((iVar.f3734y & 8) == 0) {
        }
        if (!iVar.hasSubMenu()) {
        }
        return z10;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return p(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        i g8 = g(i10, keyEvent);
        boolean p8 = g8 != null ? p(g8, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return p8;
    }

    public final void q(int i10, CharSequence charSequence, int i11, View view) {
        if (view != null) {
            this.f3701l = null;
        } else {
            if (i10 > 0) {
                this.f3701l = this.f3691b.getText(i10);
            } else if (charSequence != null) {
                this.f3701l = charSequence;
            }
            if (i11 > 0) {
                this.f3690a.getDrawable(i11);
            }
        }
        o(false);
    }

    public final void r() {
        this.f3702m = false;
        if (this.f3703n) {
            this.f3703n = false;
            o(this.f3704o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((i) arrayList.get(i12)).f3711b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((i) arrayList.get(i12)).f3711b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((i) arrayList.get(i11)).f3710a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        o(true);
    }

    public final void s() {
        if (this.f3702m) {
            return;
        }
        this.f3702m = true;
        this.f3703n = false;
        this.f3704o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f3711b == i10) {
                iVar.f3733x = (iVar.f3733x & (-5)) | (z11 ? 4 : 0);
                iVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f3709t = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f3711b == i10) {
                iVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f3695f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) arrayList.get(i11);
            if (iVar.f3711b == i10) {
                int i12 = iVar.f3733x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                iVar.f3733x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f3692c = z10;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f3695f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f3691b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f3691b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        i a6 = a(i10, i11, i12, charSequence);
        r rVar = new r(this.f3690a, this, a6);
        a6.f3724o = rVar;
        rVar.setHeaderTitle(a6.f3714e);
        return rVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f3691b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f3691b.getString(i13));
    }

    public h j() {
        return this;
    }
}

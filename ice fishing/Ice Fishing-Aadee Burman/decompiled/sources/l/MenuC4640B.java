package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC4640B extends E2.a implements Menu {

    /* renamed from: w, reason: collision with root package name */
    public final m f38719w;

    public MenuC4640B(Context context, m mVar) {
        super(7, context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f38719w = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f38719w.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i6, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f38719w.addIntentOptions(i, i6, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = g(menuItemArr2[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f38719w.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.k kVar = (s.k) this.f732v;
        if (kVar != null) {
            kVar.clear();
        }
        this.f38719w.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f38719w.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f38719w.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f38719w.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f38719w.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f38719w.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i6) {
        return this.f38719w.performIdentifierAction(i, i6);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i6) {
        return this.f38719w.performShortcut(i, keyEvent, i6);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((s.k) this.f732v) != null) {
            int i6 = 0;
            while (true) {
                s.k kVar = (s.k) this.f732v;
                if (i6 >= kVar.f40437v) {
                    break;
                }
                if (((I.a) kVar.h(i6)).getGroupId() == i) {
                    ((s.k) this.f732v).j(i6);
                    i6--;
                }
                i6++;
            }
        }
        this.f38719w.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((s.k) this.f732v) != null) {
            int i6 = 0;
            while (true) {
                s.k kVar = (s.k) this.f732v;
                if (i6 >= kVar.f40437v) {
                    break;
                }
                if (((I.a) kVar.h(i6)).getItemId() == i) {
                    ((s.k) this.f732v).j(i6);
                    break;
                }
                i6++;
            }
        }
        this.f38719w.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z3, boolean z6) {
        this.f38719w.setGroupCheckable(i, z3, z6);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z3) {
        this.f38719w.setGroupEnabled(i, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z3) {
        this.f38719w.setGroupVisible(i, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f38719w.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f38719w.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f38719w.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f38719w.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i6, int i9, CharSequence charSequence) {
        return this.f38719w.addSubMenu(i, i6, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i6, int i9, CharSequence charSequence) {
        return g(this.f38719w.a(i, i6, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i6, int i9, int i10) {
        return this.f38719w.addSubMenu(i, i6, i9, i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i6, int i9, int i10) {
        return g(this.f38719w.add(i, i6, i9, i10));
    }
}

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
public class MenuC4651B extends B1.b implements Menu {

    /* renamed from: w, reason: collision with root package name */
    public final m f38646w;

    public MenuC4651B(Context context, m mVar) {
        super(8, context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f38646w = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f38646w.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i4, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f38646w.addIntentOptions(i, i4, i6, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = g(menuItemArr2[i10]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f38646w.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        s.k kVar = (s.k) this.f257v;
        if (kVar != null) {
            kVar.clear();
        }
        this.f38646w.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f38646w.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return g(this.f38646w.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return g(this.f38646w.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f38646w.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f38646w.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i4) {
        return this.f38646w.performIdentifierAction(i, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i4) {
        return this.f38646w.performShortcut(i, keyEvent, i4);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((s.k) this.f257v) != null) {
            int i4 = 0;
            while (true) {
                s.k kVar = (s.k) this.f257v;
                if (i4 >= kVar.f40276v) {
                    break;
                }
                if (((I.a) kVar.h(i4)).getGroupId() == i) {
                    ((s.k) this.f257v).j(i4);
                    i4--;
                }
                i4++;
            }
        }
        this.f38646w.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((s.k) this.f257v) != null) {
            int i4 = 0;
            while (true) {
                s.k kVar = (s.k) this.f257v;
                if (i4 >= kVar.f40276v) {
                    break;
                }
                if (((I.a) kVar.h(i4)).getItemId() == i) {
                    ((s.k) this.f257v).j(i4);
                    break;
                }
                i4++;
            }
        }
        this.f38646w.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z6, boolean z9) {
        this.f38646w.setGroupCheckable(i, z6, z9);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z6) {
        this.f38646w.setGroupEnabled(i, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z6) {
        this.f38646w.setGroupVisible(i, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f38646w.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f38646w.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f38646w.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return g(this.f38646w.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i6, CharSequence charSequence) {
        return this.f38646w.addSubMenu(i, i4, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i6, CharSequence charSequence) {
        return g(this.f38646w.a(i, i4, i6, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i4, int i6, int i9) {
        return this.f38646w.addSubMenu(i, i4, i6, i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i4, int i6, int i9) {
        return g(this.f38646w.add(i, i4, i6, i9));
    }
}

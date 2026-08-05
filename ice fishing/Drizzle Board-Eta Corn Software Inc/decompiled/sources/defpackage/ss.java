package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ss extends cD2QLRqg implements Menu {
    public final yr MdtA4re8;

    public ss(Context context, yr yrVar) {
        super(context);
        if (yrVar != null) {
            this.MdtA4re8 = yrVar;
        } else {
            m1.sjUBp5pO("Wrapped Object can not be null.");
            throw null;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return jb9XjC4I(this.MdtA4re8.qoPGr6Ce(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.MdtA4re8.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = jb9XjC4I(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.MdtA4re8.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        p70 p70Var = (p70) this.NCTxEWno;
        if (p70Var != null) {
            p70Var.clear();
        }
        this.MdtA4re8.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.MdtA4re8.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return jb9XjC4I(this.MdtA4re8.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return jb9XjC4I(this.MdtA4re8.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.MdtA4re8.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.MdtA4re8.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.MdtA4re8.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.MdtA4re8.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((p70) this.NCTxEWno) != null) {
            int i2 = 0;
            while (true) {
                p70 p70Var = (p70) this.NCTxEWno;
                if (i2 >= p70Var.wxUZMvaN) {
                    break;
                }
                if (((sa0) p70Var.P7K7Inc8(i2)).getGroupId() == i) {
                    ((p70) this.NCTxEWno).b2ZJblxo(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.MdtA4re8.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((p70) this.NCTxEWno) != null) {
            int i2 = 0;
            while (true) {
                p70 p70Var = (p70) this.NCTxEWno;
                if (i2 >= p70Var.wxUZMvaN) {
                    break;
                }
                if (((sa0) p70Var.P7K7Inc8(i2)).getItemId() == i) {
                    ((p70) this.NCTxEWno).b2ZJblxo(i2);
                    break;
                }
                i2++;
            }
        }
        this.MdtA4re8.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.MdtA4re8.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.MdtA4re8.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.MdtA4re8.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.MdtA4re8.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.MdtA4re8.P7K7Inc8.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.MdtA4re8.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.MdtA4re8.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.MdtA4re8.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return jb9XjC4I(this.MdtA4re8.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return jb9XjC4I(this.MdtA4re8.qoPGr6Ce(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return jb9XjC4I(this.MdtA4re8.add(i, i2, i3, i4));
    }
}

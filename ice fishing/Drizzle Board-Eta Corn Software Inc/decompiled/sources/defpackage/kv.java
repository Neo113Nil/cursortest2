package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kv {
    public final yr qoPGr6Ce;
    public int MdtA4re8 = 0;
    public int wxUZMvaN = 0;
    public int VgvYg0wo = 0;
    public final ArrayList NCTxEWno = new ArrayList();

    public kv(yr yrVar) {
        this.qoPGr6Ce = yrVar;
        NCTxEWno();
    }

    public final void NCTxEWno() {
        ArrayList arrayList = this.NCTxEWno;
        arrayList.clear();
        this.MdtA4re8 = 0;
        this.wxUZMvaN = 0;
        this.VgvYg0wo = 0;
        int i = 0;
        while (true) {
            yr yrVar = this.qoPGr6Ce;
            if (i >= yrVar.P7K7Inc8.size()) {
                break;
            }
            MenuItem item = yrVar.getItem(i);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(arrayList.get(arrayList.size() - 1) instanceof pd) && item.isVisible()) {
                    arrayList.add(new pd());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.MdtA4re8++;
                    if (item2.isVisible()) {
                        this.wxUZMvaN++;
                    }
                }
                arrayList.add(new pd());
            } else {
                arrayList.add(item);
                this.MdtA4re8++;
                if (item.isVisible()) {
                    this.wxUZMvaN++;
                    this.VgvYg0wo++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty() || !(arrayList.get(arrayList.size() - 1) instanceof pd)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public final MenuItem qoPGr6Ce(int i) {
        return (MenuItem) this.NCTxEWno.get(i);
    }
}

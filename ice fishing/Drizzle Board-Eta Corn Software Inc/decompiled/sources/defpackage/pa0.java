package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class pa0 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] wxUZMvaN = {MenuItem.class};
    public Object MdtA4re8;
    public Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce = 0;

    public pa0(gs gsVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.MdtA4re8 = gsVar;
        this.NCTxEWno = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.qoPGr6Ce) {
            case 0:
                Object obj = this.NCTxEWno;
                Method method = (Method) this.MdtA4re8;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.NCTxEWno).onMenuItemClick(((gs) this.MdtA4re8).jb9XjC4I(menuItem));
        }
    }

    public /* synthetic */ pa0() {
    }
}

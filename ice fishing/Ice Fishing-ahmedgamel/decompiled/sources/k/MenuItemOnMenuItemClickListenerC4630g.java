package k;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC4630g implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f38513c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f38514a;

    /* renamed from: b, reason: collision with root package name */
    public Method f38515b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f38515b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f38514a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e9) {
            throw new RuntimeException(e9);
        }
    }
}

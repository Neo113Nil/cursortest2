package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class d0 implements View.OnClickListener {
    public final String MdtA4re8;
    public final View NCTxEWno;
    public Context VgvYg0wo;
    public Method wxUZMvaN;

    public d0(View view, String str) {
        this.NCTxEWno = view;
        this.MdtA4re8 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Method method2 = this.wxUZMvaN;
        if (method2 == null) {
            View view2 = this.NCTxEWno;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.MdtA4re8;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder b2ZJblxo = q70.b2ZJblxo("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    b2ZJblxo.append(view2.getClass());
                    b2ZJblxo.append(str);
                    throw new IllegalStateException(b2ZJblxo.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.wxUZMvaN = method;
                        this.VgvYg0wo = context;
                        method2 = method;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.VgvYg0wo, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}

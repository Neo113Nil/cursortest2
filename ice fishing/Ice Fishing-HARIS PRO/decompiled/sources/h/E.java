package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class E implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3132b;

    /* renamed from: c, reason: collision with root package name */
    public Method f3133c;

    /* renamed from: d, reason: collision with root package name */
    public Context f3134d;

    public E(View view, String str) {
        this.f3131a = view;
        this.f3132b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3133c == null) {
            View view2 = this.f3131a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3132b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3133c = method;
                        this.f3134d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3133c.invoke(this.f3134d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}

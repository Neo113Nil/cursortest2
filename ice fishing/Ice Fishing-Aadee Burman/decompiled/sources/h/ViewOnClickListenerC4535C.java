package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4535C implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f37805n;

    /* renamed from: u, reason: collision with root package name */
    public final String f37806u;

    /* renamed from: v, reason: collision with root package name */
    public Method f37807v;

    /* renamed from: w, reason: collision with root package name */
    public Context f37808w;

    public ViewOnClickListenerC4535C(View view, String str) {
        this.f37805n = view;
        this.f37806u = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f37807v == null) {
            View view2 = this.f37805n;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f37806u;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder j6 = AbstractC4404f.j("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    j6.append(view2.getClass());
                    j6.append(str);
                    throw new IllegalStateException(j6.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f37807v = method;
                        this.f37808w = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f37807v.invoke(this.f37808w, view);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}

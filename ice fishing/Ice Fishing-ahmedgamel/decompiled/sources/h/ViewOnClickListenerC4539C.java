package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.internal.ads.Wv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4539C implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f37830n;

    /* renamed from: u, reason: collision with root package name */
    public final String f37831u;

    /* renamed from: v, reason: collision with root package name */
    public Method f37832v;

    /* renamed from: w, reason: collision with root package name */
    public Context f37833w;

    public ViewOnClickListenerC4539C(View view, String str) {
        this.f37830n = view;
        this.f37831u = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f37832v == null) {
            View view2 = this.f37830n;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f37831u;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder l9 = Wv.l("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    l9.append(view2.getClass());
                    l9.append(str);
                    throw new IllegalStateException(l9.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f37832v = method;
                        this.f37833w = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f37832v.invoke(this.f37833w, view);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}

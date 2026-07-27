package kotlin.text;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXView implements View.OnClickListener {
    public final String CatchingFishDaggerWebsocket;
    public final View CatchingFishReduxKtor;
    public Context CatchingFishViewModelScope;
    public Method CatchingFishWorkManager;

    public CatchingFishAndroidXView(View view, String str) {
        this.CatchingFishReduxKtor = view;
        this.CatchingFishDaggerWebsocket = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.CatchingFishWorkManager == null) {
            View view2 = this.CatchingFishReduxKtor;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.CatchingFishDaggerWebsocket;
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
                        this.CatchingFishWorkManager = method;
                        this.CatchingFishViewModelScope = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.CatchingFishWorkManager.invoke(this.CatchingFishViewModelScope, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}

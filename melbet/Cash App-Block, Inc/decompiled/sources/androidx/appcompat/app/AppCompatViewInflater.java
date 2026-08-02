package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.SimpleArrayMap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {R.attr.onClick};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final SimpleArrayMap sConstructorMap = new SimpleArrayMap(0);

    /* loaded from: classes3.dex */
    public final class DeclaredOnClickListener implements View.OnClickListener {
        public final View mHostView;
        public final String mMethodName;
        public Context mResolvedContext;
        public Method mResolvedMethod;

        public DeclaredOnClickListener(View view, String str) {
            this.mHostView = view;
            this.mMethodName = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.mResolvedMethod == null) {
                View view2 = this.mHostView;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.mMethodName;
                    if (context == null) {
                        int id = view2.getId();
                        if (id == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view "), view2.getClass(), str);
                        return;
                    }
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.mResolvedMethod = method;
                            this.mResolvedContext = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.mResolvedMethod.invoke(this.mResolvedContext, view);
            } catch (IllegalAccessException e) {
                a$$ExternalSyntheticBUOutline0.m("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                a$$ExternalSyntheticBUOutline0.m("Could not execute method for android:onClick", e2);
            }
        }
    }

    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View createViewByPrefix(Context context, String str, String str2) {
        String concat;
        SimpleArrayMap simpleArrayMap = sConstructorMap;
        Constructor constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }
}

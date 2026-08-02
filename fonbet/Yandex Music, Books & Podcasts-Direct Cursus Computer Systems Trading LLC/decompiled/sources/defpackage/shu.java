package defpackage;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class shu extends thu {
    public boolean k;

    @Override // defpackage.thu
    public final boolean d(float f, long j, n7b n7bVar, View view) {
        Method method;
        shu shuVar;
        float b;
        if (view instanceof rei) {
            float b2 = b(f, j, n7bVar, view);
            shuVar = this;
            ((rei) view).setProgress(b2);
        } else {
            if (this.k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.k = true;
                method = null;
            }
            if (method != null) {
                try {
                    b = b(f, j, n7bVar, view);
                    shuVar = this;
                } catch (IllegalAccessException e) {
                    e = e;
                    shuVar = this;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    shuVar = this;
                }
                try {
                    method.invoke(view, Float.valueOf(b));
                } catch (IllegalAccessException e3) {
                    e = e3;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                    return shuVar.h;
                } catch (InvocationTargetException e4) {
                    e = e4;
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                    return shuVar.h;
                }
            } else {
                shuVar = this;
            }
        }
        return shuVar.h;
    }
}

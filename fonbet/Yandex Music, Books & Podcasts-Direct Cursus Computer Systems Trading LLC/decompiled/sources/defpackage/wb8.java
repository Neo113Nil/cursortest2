package defpackage;

import android.graphics.RuntimeShader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.autofill.AutofillValue;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final /* synthetic */ class wb8 implements lu7 {
    public static final wb8 a = new wb8();
    public static final wb8 b = new wb8();
    public static final wb8 c = new wb8();

    public static /* bridge */ /* synthetic */ RuntimeShader d(Object obj) {
        return (RuntimeShader) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue f(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* synthetic */ void g(int i, int i2) {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    public static /* synthetic */ void h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new g0(str + obj);
    }

    public static /* synthetic */ void k(String str, Object obj, Exception exc) {
        throw new q0(str + obj, exc);
    }

    public Drawable a(int i) {
        return new ColorDrawable(i);
    }

    @Override // defpackage.lu7
    public void j(uzm uzmVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        uzmVar.get().getClass();
        throw new ClassCastException();
    }
}

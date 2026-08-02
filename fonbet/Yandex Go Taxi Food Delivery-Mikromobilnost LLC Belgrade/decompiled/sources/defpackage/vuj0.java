package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class vuj0 {
    public final void a(int i) {
        new Handler(Looper.getMainLooper()).post(new n4a0(this, i, 1));
    }

    public abstract void b(int i);

    public abstract void c(Typeface typeface);
}

package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public interface ag5 {
    void b(mqs mqsVar);

    default void c(mqs mqsVar) {
        mqsVar.getClass();
        b(mqsVar);
    }

    void d(mqs mqsVar);

    void e(Context context, mqs mqsVar);
}

package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class UpJpMKXj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ag0 ag0Var = c.iK7aQfvhG;
        synchronized (ag0Var) {
            try {
                int i = Build.VERSION.SDK_INT;
                Object[] objArr = ag0Var.GWasM1elztuh;
                int i2 = ag0Var.Yi7zF1RB1;
                int i3 = 0;
                if (i < 30) {
                    while (i3 < i2) {
                        c cVar = (c) objArr[i3];
                        boolean showLayoutBounds = cVar.getShowLayoutBounds();
                        Class cls = c.R46bVSe7ra;
                        cVar.setShowLayoutBounds(ki1.EXrPz3p7hFb());
                        if (showLayoutBounds != cVar.getShowLayoutBounds()) {
                            cVar.post(new jEYdxQDjs(cVar, 2));
                        }
                        i3++;
                    }
                } else {
                    while (i3 < i2) {
                        c cVar2 = (c) objArr[i3];
                        cVar2.post(new jEYdxQDjs(cVar2, 3));
                        i3++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

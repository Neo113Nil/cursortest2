package com.combinations.level.experts;

import android.app.Application;
import defpackage.E7jCp8Ls;
import defpackage.a50;
import defpackage.b9xEq24R1;
import defpackage.vk;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class XenoloopApplication extends Application {
    public static final /* synthetic */ int OOA6hdeuvCS = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        E7jCp8Ls e7jCp8Ls = new E7jCp8Ls(24, this);
        synchronized (b9xEq24R1.HFYAaqMd6) {
            a50 a50Var = new a50();
            if (b9xEq24R1.rezfBrjOrqK != null) {
                throw new vk("A Koin Application has already been started");
            }
            b9xEq24R1.rezfBrjOrqK = a50Var.GWasM1elztuh;
            e7jCp8Ls.mOu10nynGul(a50Var);
            a50Var.GWasM1elztuh.OOA6hdeuvCS();
        }
    }
}

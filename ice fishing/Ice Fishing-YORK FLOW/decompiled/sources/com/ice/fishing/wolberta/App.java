package com.ice.fishing.wolberta;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class App extends android.app.Application {
    public static final /* synthetic */ int WDYagTQQm9ns = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(4, this);
        synchronized (defpackage.jVUAPb5NnIYW.w6IV1lieBIux) {
            defpackage.ec0 ec0Var = new defpackage.ec0();
            if (defpackage.jVUAPb5NnIYW.zJPqDeoF0Os1 != null) {
                throw new defpackage.to("A Koin Application has already been started");
            }
            defpackage.jVUAPb5NnIYW.zJPqDeoF0Os1 = ec0Var.ZpBGe2uQfcn8;
            fnwyghiyejcr.P05cfTpS5W5L(ec0Var);
            ec0Var.ZpBGe2uQfcn8.oh71FJcDz6S2();
        }
    }
}

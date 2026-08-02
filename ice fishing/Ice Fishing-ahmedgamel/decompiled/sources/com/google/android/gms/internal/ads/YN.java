package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public interface YN {
    void a(XN xn, InterfaceC3780q[] interfaceC3780qArr);

    void b(IO io);

    boolean c(XN xn);

    void d(IO io);

    long e();

    void f(IO io);

    boolean g(XN xn);

    InterfaceC4049v h(IO io);

    default boolean j() {
        AbstractC2991bG.y("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}

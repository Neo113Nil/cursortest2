package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public interface YN {
    void a(XN xn, InterfaceC3757q[] interfaceC3757qArr);

    void b(IO io);

    boolean c(XN xn);

    void d(IO io);

    long e();

    void f(IO io);

    boolean g(XN xn);

    InterfaceC4026v h(IO io);

    default boolean j() {
        AbstractC2968bG.y("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}

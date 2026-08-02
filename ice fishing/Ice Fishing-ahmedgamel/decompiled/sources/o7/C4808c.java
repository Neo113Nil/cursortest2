package o7;

import a7.l;
import i7.InterfaceC4600b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4808c implements g7.b, InterfaceC4600b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4808c f39750a = new C4808c();

    /* renamed from: b, reason: collision with root package name */
    public static final l f39751b = new l(Logger.getLogger(C4808c.class.getName()));

    @Override // i7.InterfaceC4600b
    public final boolean a(k7.b bVar) {
        InterfaceC4600b interfaceC4600b;
        switch (bVar.f38624e.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                interfaceC4600b = C4813h.f39757a;
                break;
            case 2:
                interfaceC4600b = C4810e.f39753b;
                break;
            case 5:
            case 6:
                interfaceC4600b = C4811f.f39755a;
                break;
            default:
                f39751b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bVar, null);
                interfaceC4600b = C4809d.f39752a;
                break;
        }
        return interfaceC4600b.a(bVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}

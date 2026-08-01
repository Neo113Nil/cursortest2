package o7;

import a7.l;
import i7.InterfaceC4591b;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4804c implements g7.b, InterfaceC4591b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4804c f39642a = new C4804c();

    /* renamed from: b, reason: collision with root package name */
    public static final l f39643b = new l(Logger.getLogger(C4804c.class.getName()));

    @Override // i7.InterfaceC4591b
    public final boolean a(k7.b bVar) {
        InterfaceC4591b interfaceC4591b;
        switch (bVar.f38697e.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
                interfaceC4591b = C4809h.f39649a;
                break;
            case 2:
                interfaceC4591b = C4806e.f39645b;
                break;
            case 5:
            case 6:
                interfaceC4591b = C4807f.f39647a;
                break;
            default:
                f39643b.a(Level.WARNING, "Unable to find default aggregation for instrument: " + bVar, null);
                interfaceC4591b = C4805d.f39644a;
                break;
        }
        return interfaceC4591b.a(bVar);
    }

    public final String toString() {
        return "DefaultAggregation";
    }
}

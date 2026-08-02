package defpackage;

import ru.kinopoisk.sdk.easylogin.internal.B9;
import ru.kinopoisk.sdk.easylogin.internal.C1250ua;
import ru.kinopoisk.sdk.easylogin.internal.E3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1274w8;
import ru.kinopoisk.sdk.easylogin.internal.Na;
import ru.kinopoisk.sdk.easylogin.internal.Xa;

/* loaded from: classes5.dex */
public final /* synthetic */ class yh2 implements E3.a {
    public final /* synthetic */ int a;

    @Override // ru.kinopoisk.sdk.easylogin.internal.E3.a
    public final InterfaceC1274w8 a(InterfaceC1274w8 interfaceC1274w8) {
        switch (this.a) {
            case 0:
                return B9.a((mbt) interfaceC1274w8);
            case 1:
                return Na.a((xbt) interfaceC1274w8);
            case 2:
                if (interfaceC1274w8 == null) {
                    return Xa.a((ybt) null);
                }
                l1j.f();
                return null;
            default:
                return C1250ua.a((vbt) interfaceC1274w8);
        }
    }
}

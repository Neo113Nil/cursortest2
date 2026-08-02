package defpackage;

import ru.yandex.taxi.preorder.suggested.destinations.c;

/* loaded from: classes10.dex */
public final class ypo extends zh3 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ ypo(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.zh3
    public final void a(boolean z) {
        String a;
        switch (this.d) {
            case 0:
                c cVar = (c) this.e;
                synchronized (cVar.g) {
                    cVar.f = null;
                }
                return;
            default:
                amf0 amf0Var = (amf0) ((h3y) this.e).get();
                if (!z || (a = amf0Var.b.a()) == null) {
                    return;
                }
                amf0Var.a.r(a);
                return;
        }
    }

    @Override // defpackage.j35
    public final String getName() {
        switch (this.d) {
            case 0:
                return "ExpectedDestinationsCache";
            default:
                return "PromoCodeCache";
        }
    }
}

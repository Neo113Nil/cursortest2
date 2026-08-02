package defpackage;

import ru.yandex.taxi.cashback.sdk.OpenPlusSubscriptionAction;

/* loaded from: classes5.dex */
public final class v2d0 {
    public OpenPlusSubscriptionAction a = OpenPlusSubscriptionAction.NONE;
    public boolean b;
    public String c;
    public String d;
    public String e;

    public final w2d0 a() {
        return new w2d0(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b() {
        this.b = true;
    }

    public final void c(String str) {
        this.d = str;
    }

    public final void d(String str) {
        this.c = str;
    }

    public final void e(OpenPlusSubscriptionAction openPlusSubscriptionAction) {
        this.a = openPlusSubscriptionAction;
    }
}

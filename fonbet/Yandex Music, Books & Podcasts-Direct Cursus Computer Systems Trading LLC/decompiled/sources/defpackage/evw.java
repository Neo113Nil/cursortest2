package defpackage;

import com.yandex.passport.internal.database.d;
import com.yandex.passport.internal.ui.base.e;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.e1;
import com.yandex.plus.core.analytics.h;
import com.yandex.plus.core.benchmark.y;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.kinopoisk.sdk.easylogin.internal.C1005d2;
import ru.kinopoisk.sdk.easylogin.internal.C1022e5;
import ru.kinopoisk.sdk.easylogin.internal.C1090j3;
import ru.kinopoisk.sdk.easylogin.internal.C1103k2;
import ru.kinopoisk.sdk.easylogin.internal.Hc;
import ru.kinopoisk.sdk.easylogin.internal.O3;
import ru.kinopoisk.sdk.easylogin.internal.W1;
import ru.kinopoisk.sdk.easylogin.internal.Z7;

/* loaded from: classes5.dex */
public final /* synthetic */ class evw extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evw(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                C1090j3 c1090j3 = (C1090j3) this.receiver;
                c1090j3.b.trackBackClick();
                Z7.a(c1090j3.a.c);
                c1090j3.a.a();
                return Unit.a;
            case 1:
                O3 o3 = (O3) this.receiver;
                o3.c.trackAcceptClick();
                o3.b.onConnected();
                Z7.a(o3.a.c);
                return Unit.a;
            case 2:
                ((xdr) ((C1022e5) this.receiver).e).l(Boolean.TRUE);
                return Unit.a;
            case 3:
                Hc hc = (Hc) this.receiver;
                hc.c.trackBackClick();
                Z7.a(hc.b.c);
                hc.b.a();
                return Unit.a;
            case 4:
                W1 w1 = (W1) this.receiver;
                w1.c.trackCloseClick();
                Z7.a(w1.b.c);
                return Unit.a;
            case 5:
                C1005d2 c1005d2 = (C1005d2) this.receiver;
                c1005d2.b.trackCloseClick();
                Z7.a(c1005d2.a.c);
                return Unit.a;
            case 6:
                C1103k2 c1103k2 = (C1103k2) this.receiver;
                c1103k2.b.trackBackClick();
                Z7.a(c1103k2.a.c);
                c1103k2.a.a();
                return Unit.a;
            case 7:
                C1090j3 c1090j32 = (C1090j3) this.receiver;
                c1090j32.b.trackCloseClick();
                Z7.a(c1090j32.a.c);
                return Unit.a;
            case 8:
                O3 o32 = (O3) this.receiver;
                o32.c.trackBackClick();
                Z7.a(o32.a.c);
                o32.a.a();
                return Unit.a;
            case 9:
                C1022e5 c1022e5 = (C1022e5) this.receiver;
                if (((Boolean) ((xdr) c1022e5.e).getValue()).booleanValue()) {
                    ((xdr) c1022e5.e).l(Boolean.FALSE);
                } else {
                    Z7.a(c1022e5.a.c);
                    c1022e5.a.a();
                }
                return Unit.a;
            case 10:
                Hc hc2 = (Hc) this.receiver;
                hc2.c.trackCloseClick();
                Z7.a(hc2.b.c);
                return Unit.a;
            case 11:
                return ((d) this.receiver).getReadableDatabase();
            case 12:
                return ((d) this.receiver).getWritableDatabase();
            case 13:
                return ((d) this.receiver).getReadableDatabase();
            case 14:
                return ((d) this.receiver).getWritableDatabase();
            case 15:
                return ((d) this.receiver).getReadableDatabase();
            case 16:
                return ((d) this.receiver).getWritableDatabase();
            case 17:
                return ((d) this.receiver).getReadableDatabase();
            case 18:
                return ((d) this.receiver).getWritableDatabase();
            case 19:
                return ((d) this.receiver).getReadableDatabase();
            case 20:
                return ((d) this.receiver).getWritableDatabase();
            case 21:
                return ((d) this.receiver).getReadableDatabase();
            case 22:
                return ((d) this.receiver).getWritableDatabase();
            case 23:
                ((e) this.receiver).p();
                return Unit.a;
            case 24:
                ((b0) this.receiver).p.a(e1.b);
                return Unit.a;
            case 25:
                ((com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.controllers.success.d) this.receiver).getClass();
                return Unit.a;
            case 26:
                ((y) this.receiver).getClass();
                return Boolean.TRUE;
            case 27:
                return ((h) this.receiver).e();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((y) this.receiver).getClass();
                return Boolean.TRUE;
            default:
                return ((dv7) this.receiver).serializer();
        }
    }
}

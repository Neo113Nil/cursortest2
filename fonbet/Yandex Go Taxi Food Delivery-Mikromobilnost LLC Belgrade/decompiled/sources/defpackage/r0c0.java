package defpackage;

import android.content.Context;
import ru.yandex.taxi.widget.map.PinSlot;

/* loaded from: classes13.dex */
public final class r0c0 {
    public final Context a;
    public final pdc b;

    public r0c0(pdc pdcVar, Context context) {
        this.a = context;
        this.b = pdcVar;
    }

    public static z0c0 e(boolean z, p0c0 p0c0Var) {
        Integer S;
        if (p0c0Var == null || (S = q5z.S(p0c0Var.a)) == null) {
            return null;
        }
        int intValue = S.intValue();
        Integer S2 = q5z.S(p0c0Var.b);
        if (S2 == null) {
            return null;
        }
        int intValue2 = S2.intValue();
        Integer S3 = q5z.S(p0c0Var.d);
        if (S3 != null) {
            return new z0c0(intValue, intValue2, S3.intValue(), z);
        }
        return null;
    }

    public final z0c0 a() {
        int i = xqg0.destination_pin_main_color;
        Context context = this.a;
        return new z0c0(context.getColor(i), context.getColor(xqg0.destination_pin_dark_color), context.getColor(xqg0.pin_text_color), false);
    }

    public final c0c0 b() {
        return new c0c0(tje.y(f1h0.ic_destination_pin_24, this.a));
    }

    public final i1c0 c() {
        PinSlot.Companion.getClass();
        return xzb0.b(this.a);
    }

    public final b0c0 d() {
        int i = f1h0.ic_warning_pin_24;
        Context context = this.a;
        return new b0c0(tje.y(i, context), context.getColor(mqg0.component_orange_normal));
    }

    public final i1c0 f(p0c0 p0c0Var) {
        if (p0c0Var == null) {
            return null;
        }
        String str = p0c0Var.d;
        String str2 = p0c0Var.a;
        ufu ufuVar = (ufu) this.b;
        kdc b = ufuVar.b(str2);
        kdc i = ufuVar.i(str);
        if (b == null || i == null) {
            return null;
        }
        Context context = this.a;
        return new i1c0(s8o.m(i, context), s8o.m(b, context));
    }

    public final z0c0 g() {
        int i = xqg0.source_pin_main_color;
        Context context = this.a;
        return new z0c0(context.getColor(i), context.getColor(xqg0.source_pin_dark_color), context.getColor(xqg0.pin_text_color), true);
    }

    public final c0c0 h() {
        return new c0c0(tje.y(f1h0.ic_source_pin_24, this.a));
    }

    public final i1c0 i() {
        PinSlot.Companion.getClass();
        return xzb0.a(this.a);
    }
}

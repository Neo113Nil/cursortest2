package ru.yandex.taxi.summary.promotions.models;

import defpackage.anv0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.w0v0;
import kotlin.LazyThreadSafetyMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam;

@gsq0
/* loaded from: classes6.dex */
public final class i {
    public static final anv0 Companion = new anv0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(26))};
    public final SummaryPromotionsParam.Type a;

    public /* synthetic */ i(int i, SummaryPromotionsParam.Type type) {
        if (1 == (i & 1)) {
            this.a = type;
        } else {
            qje.Z(i, 1, h.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a == ((i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Mode(type=" + this.a + Extension.C_BRAKE;
    }

    public i(SummaryPromotionsParam.Type type) {
        this.a = type;
    }
}

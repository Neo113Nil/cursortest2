package ru.yandex.taxi.summary.promotions.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/b0;", "Lru/yandex/taxi/summary/promotions/models/d0;", "Companion", "ru/yandex/taxi/summary/promotions/models/z", "ru/yandex/taxi/summary/promotions/models/a0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class b0 extends d0 {
    public static final a0 Companion = new a0();
    public final String a;

    public b0(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && jl40.l(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenModalWindow(modalId=", this.a, Extension.C_BRAKE);
    }

    public b0() {
        this.a = "";
    }
}

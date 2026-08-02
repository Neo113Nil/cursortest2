package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class rpu0 {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final Integer e;
    public final boolean f;

    public rpu0(String str, FormattedText formattedText, FormattedText formattedText2, String str2, Integer num, boolean z) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = str2;
        this.e = num;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !rpu0.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.a, ((rpu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

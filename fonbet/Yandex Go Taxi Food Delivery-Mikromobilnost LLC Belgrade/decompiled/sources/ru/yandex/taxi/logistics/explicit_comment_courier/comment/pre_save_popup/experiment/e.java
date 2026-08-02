package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jgi;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jti;
import defpackage.ksq0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/e;", "Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/h;", "Companion", "iti", "jti", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class e extends h {
    public static final jti Companion = new jti();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(23))};
    public final jsq0 a;

    public e(int i, jsq0 jsq0Var) {
        if ((i & 1) == 0) {
            this.a = ksq0.a;
        } else {
            this.a = jsq0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && jl40.l(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "D2dRule(screens=" + this.a + Extension.C_BRAKE;
    }

    public e() {
        this.a = ksq0.a;
    }
}

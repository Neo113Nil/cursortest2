package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.lti;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/f;", "Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/h;", "Companion", "kti", "lti", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class f extends h {
    public static final lti Companion = new lti();
    public final String a;

    public f(int i, String str) {
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
        return (obj instanceof f) && jl40.l(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RedirectRule(tariffToRedirect=", this.a, Extension.C_BRAKE);
    }

    public f() {
        this.a = "";
    }
}

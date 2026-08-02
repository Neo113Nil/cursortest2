package ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment;

import defpackage.gsq0;
import defpackage.hti;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/d;", "Lru/yandex/taxi/logistics/explicit_comment_courier/comment/pre_save_popup/experiment/h;", "Companion", "gti", "hti", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class d extends h {
    public static final hti Companion = new hti();
    public final boolean a;

    public d(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("D2dRedirectRule(dismissOnNegativeAction=", Extension.C_BRAKE, this.a);
    }

    public d() {
        this.a = false;
    }
}

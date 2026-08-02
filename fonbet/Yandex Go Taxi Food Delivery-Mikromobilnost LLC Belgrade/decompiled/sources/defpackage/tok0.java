package defpackage;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Timeline;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tok0 implements zjk0 {
    public final String a;
    public final String b;
    public final RideCardItemDto$Timeline.TimelineType c;
    public final List d;
    public final int e;
    public final xss0 f;
    public final sok0 g;
    public final akk0 h;

    public tok0(String str, String str2, RideCardItemDto$Timeline.TimelineType timelineType, List list, int i, xss0 xss0Var, sok0 sok0Var) {
        this.a = str;
        this.b = str2;
        this.c = timelineType;
        this.d = list;
        this.e = i;
        this.f = xss0Var;
        this.g = sok0Var;
        this.h = qpa1.e(str2, EmptyList.a, new nqs0[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tok0)) {
            return false;
        }
        tok0 tok0Var = (tok0) obj;
        return jl40.l(this.a, tok0Var.a) && jl40.l(this.b, tok0Var.b) && this.c == tok0Var.c && jl40.l(this.d, tok0Var.d) && this.e == tok0Var.e && jl40.l(this.f, tok0Var.f) && jl40.l(this.g, tok0Var.g);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.h;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = oyr.b(this.e, unr0.c((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31);
        xss0 xss0Var = this.f;
        int hashCode2 = (b + (xss0Var == null ? 0 : xss0Var.hashCode())) * 31;
        sok0 sok0Var = this.g;
        return hashCode2 + (sok0Var != null ? sok0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RideCardTimelineUiState(id=", this.a, ", analyticsId=", this.b, ", type=");
        v.append(this.c);
        v.append(", items=");
        v.append(this.d);
        v.append(", currentItemIndex=");
        v.append(this.e);
        v.append(", bubble=");
        v.append(this.f);
        v.append(", optionsData=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ToolbarNavigationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxwe0;", "", "Companion", "vwe0", "wwe0", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class xwe0 {
    public static final wwe0 Companion = new wwe0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(24))};
    public final Boolean a;
    public final Boolean b;
    public final PresentationOptionsDto$ToolbarNavigationType c;

    public /* synthetic */ xwe0(int i, Boolean bool, Boolean bool2, PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = presentationOptionsDto$ToolbarNavigationType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwe0)) {
            return false;
        }
        xwe0 xwe0Var = (xwe0) obj;
        return jl40.l(this.a, xwe0Var.a) && jl40.l(this.b, xwe0Var.b) && this.c == xwe0Var.c;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PresentationOptionsDto$ToolbarNavigationType presentationOptionsDto$ToolbarNavigationType = this.c;
        return hashCode2 + (presentationOptionsDto$ToolbarNavigationType != null ? presentationOptionsDto$ToolbarNavigationType.hashCode() : 0);
    }

    public final String toString() {
        return "Header(showNavigationBar=" + this.a + ", showDash=" + this.b + ", navigationType=" + this.c + ')';
    }

    public xwe0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}

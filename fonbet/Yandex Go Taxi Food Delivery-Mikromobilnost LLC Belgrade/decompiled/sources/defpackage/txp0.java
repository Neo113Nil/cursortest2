package defpackage;

import android.view.View;
import com.yandex.go.zone.dto.objects.ServiceLevel;

/* loaded from: classes14.dex */
public final class txp0 extends uxp0 {
    public final ServiceLevel.SearchingPulsarDTO.SearchingPulsar a;
    public final View b;
    public final int c;

    public txp0(ServiceLevel.SearchingPulsarDTO.SearchingPulsar searchingPulsar, View view, int i) {
        this.a = searchingPulsar;
        this.b = view;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txp0)) {
            return false;
        }
        txp0 txp0Var = (txp0) obj;
        return this.a == txp0Var.a && jl40.l(this.b, txp0Var.b) && this.c == txp0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        View view = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (view == null ? 0 : view.hashCode())) * 31);
    }
}

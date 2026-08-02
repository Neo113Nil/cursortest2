package defpackage;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class voe {
    public final pho a;

    public voe(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(Integer num, String str) {
        HashMap p = x4e.p("requirement", str);
        if (num != null) {
            p.put("selected_tour_id", num);
        }
        this.a.a("Copters.CityTourCard.Closed", p, 1, new HashMap());
    }
}

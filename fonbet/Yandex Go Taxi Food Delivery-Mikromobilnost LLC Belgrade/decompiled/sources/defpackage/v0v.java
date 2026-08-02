package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes14.dex */
public final class v0v {
    public final cne0 a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();

    public v0v(dne0 dne0Var) {
        this.a = dne0Var.a("hub_onboarding_show_policy_prefs");
    }

    public final void a(String str) {
        LinkedHashSet linkedHashSet = this.c;
        if (linkedHashSet.contains(str)) {
            return;
        }
        cne0 cne0Var = this.a;
        cne0Var.p(cne0Var.i("shown_count_" + str, 0) + 1, "shown_count_" + str);
        linkedHashSet.add(str);
    }
}

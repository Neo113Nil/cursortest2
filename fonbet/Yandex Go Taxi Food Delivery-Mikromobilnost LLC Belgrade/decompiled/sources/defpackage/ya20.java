package defpackage;

import ru.yandex.taxi.preorder.source.pickup.a;

/* loaded from: classes5.dex */
public final class ya20 {
    public final a a;
    public final ah00 b;
    public final ab20 c;

    public ya20(a aVar, ah00 ah00Var, ab20 ab20Var) {
        this.a = aVar;
        this.b = ah00Var;
        this.c = ab20Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final String a() {
        za20 za20Var;
        a aVar = this.a;
        ah00 ah00Var = this.b;
        wpb0 h = aVar.h(ah00Var, ((gh00) ah00Var).e.b(), false);
        ab20 ab20Var = this.c;
        synchronized (ab20Var) {
            za20Var = ab20Var.a;
            if (za20Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (!za20Var.c || h == null) {
            return za20Var.a ? "where_you_are" : za20Var.b ? "clarify.manual" : "manual";
        }
        boolean z = za20Var.b;
        String str = this.a.j;
        if (z) {
            if (str == null) {
                return "clarify.manual";
            }
            switch (str.hashCode()) {
                case -607398952:
                    return !str.equals("label_tap") ? "clarify.manual" : "clarify.pickup_point_tap";
                case 114595:
                    return !str.equals("tap") ? "clarify.manual" : "clarify.pickup_point_tap";
                case 3091764:
                    return str.equals("drag") ? "clarify.pickup_point_drag" : "clarify.manual";
                case 288283803:
                    return !str.equals("action_release_map") ? "clarify.manual" : "clarify.pickup_point_drag";
                default:
                    return "clarify.manual";
            }
        }
        if (str == null) {
            return "manual";
        }
        switch (str.hashCode()) {
            case -607398952:
                return !str.equals("label_tap") ? "manual" : "manual.pickup_point_tap";
            case 114595:
                return !str.equals("tap") ? "manual" : "manual.pickup_point_tap";
            case 3091764:
                return str.equals("drag") ? "manual.pickup_point_drag" : "manual";
            case 288283803:
                return !str.equals("action_release_map") ? "manual" : "manual.pickup_point_drag";
            default:
                return "manual";
        }
    }
}

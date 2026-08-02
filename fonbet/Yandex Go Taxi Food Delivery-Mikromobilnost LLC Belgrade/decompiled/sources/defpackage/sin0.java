package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;

/* loaded from: classes13.dex */
public final class sin0 {
    public final n5o0 a;

    public /* synthetic */ sin0(n5o0 n5o0Var) {
        this.a = n5o0Var;
    }

    public static String a(z970 z970Var) {
        String str = null;
        if (z970Var != null) {
            if (z970Var instanceof m970) {
                str = "active_packages";
            } else if (z970Var instanceof n970) {
                str = "active_super_passes";
            } else if (z970Var.equals(p970.a)) {
                str = "ignition";
            } else if (z970Var.equals(q970.a)) {
                str = "mos_ru_authorization";
            } else if (z970Var instanceof r970) {
                str = "packages";
            } else if (z970Var.equals(s970.a)) {
                str = "payment_methods";
            } else if (z970Var instanceof v970) {
                str = "photocontrol";
            } else if (z970Var instanceof w970) {
                str = "promocodes";
            } else if (z970Var instanceof x970) {
                str = "subscription";
            } else if (z970Var instanceof y970) {
                str = "super_passes";
            } else if (z970Var.equals(t970.a)) {
                str = "personal_data_form";
            } else if (z970Var instanceof o970) {
                str = "driver_license_verification";
            } else {
                if (!z970Var.equals(u970.a)) {
                    w511.b();
                    return null;
                }
                str = "personal_goals";
            }
        }
        StringBuilder sb = new StringBuilder("Perf.ScootersDiscoveryRouter.Launch");
        if (str != null) {
            sb.append(ShimmerDivHandler.NUMBER_SING);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(g6o0 g6o0Var) {
        String str;
        if (g6o0Var instanceof e6o0) {
            str = "detailed_order";
        } else if (g6o0Var instanceof d6o0) {
            str = "arbitrary_destination";
        } else {
            if (!(g6o0Var instanceof f6o0)) {
                w511.b();
                return null;
            }
            str = "finish_order";
        }
        return "Perf.ScootersOrderRouter.Launch#".concat(str);
    }

    public static String c(clo0 clo0Var) {
        String str;
        if (clo0Var instanceof wko0) {
            str = "direct_show_active_super_passes";
        } else if (clo0Var instanceof xko0) {
            str = "direct_show_super_passes";
        } else if (clo0Var instanceof yko0) {
            str = "find_scooter";
        } else if (clo0Var instanceof zko0) {
            str = "show_discovery";
        } else if (clo0Var instanceof alo0) {
            str = "show_offer";
        } else {
            if (!(clo0Var instanceof blo0)) {
                w511.b();
                return null;
            }
            str = "show_qr_scan";
        }
        return "Perf.ScootersPreorderRouter.Launch#".concat(str);
    }
}

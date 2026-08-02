package defpackage;

import android.content.Context;
import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$string;
import java.util.Locale;
import kotlin.collections.builders.ListBuilder;
import yads.nq1;

/* loaded from: classes7.dex */
public final class y781 {
    public final Context a;
    public final qw71 b;
    public final me0 c;

    public y781(Context context, qw71 qw71Var, me0 me0Var) {
        this.a = context;
        this.b = qw71Var;
        this.c = me0Var;
    }

    public final fx81 a(Boolean bool) {
        boolean l = jl40.l(bool, Boolean.TRUE);
        Context context = this.a;
        if (l) {
            return new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_yes));
        }
        if (jl40.l(bool, Boolean.FALSE)) {
            return new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_no));
        }
        if (bool == null) {
            return new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_no_value_set));
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ListBuilder listBuilder, sk81 sk81Var) {
        fx81 fx81Var;
        fx81 fx81Var2;
        nq1 nq1Var;
        int i;
        int i2;
        tb81 tb81Var;
        m881 a;
        m881 a2;
        kh81 kh81Var = sk81Var.g;
        String str = sk81Var.e;
        String str2 = sk81Var.f;
        String str3 = sk81Var.d;
        boolean z = kh81Var instanceof ge81;
        Context context = this.a;
        if (z) {
            fx81Var2 = new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_not_integrated));
        } else {
            if (str2 == null || evu0.J(str2)) {
                fx81Var = new fx81(0, 0, 14, null, context.getString(R$string.debug_panel_sdk_undefined));
                kh81 kh81Var2 = sk81Var.g;
                String str4 = null;
                nq1Var = (!(kh81Var2 instanceof bb81) ? (bb81) kh81Var2 : null) == null ? nq1.b : null;
                StringBuilder sb = new StringBuilder();
                if (str3 != null) {
                    sb.append("Adapter " + str3 + "  ");
                }
                if (str != null) {
                    sb.append("Latest ".concat(str));
                }
                String sb2 = sb.toString();
                if (str3 != null && !evu0.J(str3)) {
                    tb81Var = this.b.a;
                    if (str != null && !evu0.J(str)) {
                        tb81Var.getClass();
                        a = tb81.a(str3);
                        if (a != null && (a2 = tb81.a(str)) != null && a.compareTo(a2) < 0) {
                            i = R$attr.debug_panel_color_orange;
                            String str5 = sk81Var.a;
                            String str6 = sk81Var.b;
                            vl71 vl71Var = new vl71(sb2, i);
                            String str7 = sk81Var.f;
                            i2 = nq1Var != null ? -1 : tz71.a[nq1Var.ordinal()];
                            if (i2 != -1) {
                                if (i2 != 1) {
                                    w511.b();
                                    return;
                                }
                                str4 = this.c.a.getString(R$string.debug_panel_invalid_mediation_adapter_version);
                            }
                            listBuilder.add(new fh61(str5, str6, fx81Var, vl71Var, str4, null, null, null, null, null, str7, 992));
                        }
                    }
                }
                i = R$attr.debug_panel_label_secondary;
                String str52 = sk81Var.a;
                String str62 = sk81Var.b;
                vl71 vl71Var2 = new vl71(sb2, i);
                String str72 = sk81Var.f;
                if (nq1Var != null) {
                }
                if (i2 != -1) {
                }
                listBuilder.add(new fh61(str52, str62, fx81Var, vl71Var2, str4, null, null, null, null, null, str72, 992));
            }
            fx81Var2 = new fx81(0, 0, 14, null, "SDK ".concat(str2.toLowerCase(Locale.ROOT)));
        }
        fx81Var = fx81Var2;
        kh81 kh81Var22 = sk81Var.g;
        String str42 = null;
        if ((!(kh81Var22 instanceof bb81) ? (bb81) kh81Var22 : null) == null) {
        }
        StringBuilder sb3 = new StringBuilder();
        if (str3 != null) {
        }
        if (str != null) {
        }
        String sb22 = sb3.toString();
        if (str3 != null) {
            tb81Var = this.b.a;
            if (str != null) {
                tb81Var.getClass();
                a = tb81.a(str3);
                if (a != null) {
                    i = R$attr.debug_panel_color_orange;
                    String str522 = sk81Var.a;
                    String str622 = sk81Var.b;
                    vl71 vl71Var22 = new vl71(sb22, i);
                    String str722 = sk81Var.f;
                    if (nq1Var != null) {
                    }
                    if (i2 != -1) {
                    }
                    listBuilder.add(new fh61(str522, str622, fx81Var, vl71Var22, str42, null, null, null, null, null, str722, 992));
                }
            }
        }
        i = R$attr.debug_panel_label_secondary;
        String str5222 = sk81Var.a;
        String str6222 = sk81Var.b;
        vl71 vl71Var222 = new vl71(sb22, i);
        String str7222 = sk81Var.f;
        if (nq1Var != null) {
        }
        if (i2 != -1) {
        }
        listBuilder.add(new fh61(str5222, str6222, fx81Var, vl71Var222, str42, null, null, null, null, null, str7222, 992));
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;

/* loaded from: classes8.dex */
public final class xq70 implements vq70 {
    public static final a3y0 c = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderDeeplinkFactory");
    public final pw2 a;
    public final y5w0 b;

    public xq70(pw2 pw2Var, y5w0 y5w0Var) {
        this.a = pw2Var;
        this.b = y5w0Var;
    }

    public static Uri a(l0y0 l0y0Var, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority("taxi_order_details");
        builder.appendQueryParameter("order_id", l0y0Var.a());
        builder.appendQueryParameter("preferred_screen_type", TaxiOrderDeeplink$PreferredScreenType.Companion.serializer().getDescriptor().f(l0y0Var.b().ordinal()));
        builder.appendQueryParameter("open_taxi_main_on_not_found", String.valueOf(l0y0Var.c()));
        if (l0y0Var instanceof d0y0) {
            d0y0 d0y0Var = (d0y0) l0y0Var;
            builder.appendQueryParameter("action", "change_source");
            builder.appendQueryParameter("mode", TaxiOrderDeeplink$ChangeSource$Mode.Companion.serializer().getDescriptor().f(d0y0Var.d().ordinal()));
            builder.appendQueryParameter("source", d0y0Var.f());
            builder.appendQueryParameter("p_type", d0y0Var.e().a());
            c0y0 e = d0y0Var.e();
            if (e instanceof zzx0) {
                zzx0 zzx0Var = (zzx0) e;
                builder.appendQueryParameter("lat", String.valueOf(zzx0Var.b().a));
                builder.appendQueryParameter("lon", String.valueOf(zzx0Var.b().b));
            }
        } else if (l0y0Var instanceof h0y0) {
            builder.appendQueryParameter("action", "feedback");
            builder.appendQueryParameter("value", String.valueOf(((h0y0) l0y0Var).d()));
        } else if (l0y0Var instanceof k0y0) {
            k0y0 k0y0Var = (k0y0) l0y0Var;
            builder.appendQueryParameter("action", "tips");
            String e2 = k0y0Var.e();
            if (e2 != null) {
                builder.appendQueryParameter("tips_value", e2);
            }
            builder.appendQueryParameter("tips_type", k0y0Var.d());
        } else if (l0y0Var instanceof e0y0) {
            builder.appendQueryParameter("action", "chat");
        } else if (l0y0Var instanceof i0y0) {
            String d = ((i0y0) l0y0Var).d();
            builder.appendQueryParameter("action", "messenger");
            builder.appendQueryParameter("chat_id", d);
        } else if (l0y0Var instanceof xzx0) {
            builder.appendQueryParameter("action", "call");
        } else if (l0y0Var instanceof wzx0) {
            builder.appendQueryParameter("action", "alternative_point_a_found");
        }
        return builder.build();
    }

    public final Uri b(String str) {
        g0y0 g0y0Var = new g0y0(str, d(), false);
        ((pux0) this.a).getClass();
        return a(g0y0Var, pux0.c);
    }

    public final Uri c(String str, String str2) {
        Uri.Builder builder = new Uri.Builder();
        ((pux0) this.a).getClass();
        return builder.scheme(pux0.c).authority(str).appendQueryParameter("order_id", str2).build();
    }

    public final TaxiOrderDeeplink$PreferredScreenType d() {
        int i = wq70.a[((a6w0) this.b).c().a().ordinal()];
        if (i == 1) {
            return TaxiOrderDeeplink$PreferredScreenType.ORDER_WITH_FEED;
        }
        if (i == 2) {
            return TaxiOrderDeeplink$PreferredScreenType.DEFAULT;
        }
        w511.b();
        return null;
    }
}

package defpackage;

import android.net.Uri;
import android.util.Base64;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.startup.StartupRequest;
import yads.et0;

/* loaded from: classes7.dex */
public final class v771 {
    public final gn71 a;
    public final h73 b;
    public final h73 c;
    public final i3y d;

    public v771(in61 in61Var) {
        new e671();
        this.a = new gn71();
        MapBuilder mapBuilder = new MapBuilder();
        b(mapBuilder, "ad_unit_id", in61Var.u);
        b(mapBuilder, "width", in61Var.w);
        b(mapBuilder, "height", in61Var.x);
        b(mapBuilder, "ad_size_type", in61Var.y);
        b(mapBuilder, "orientation", in61Var.z);
        b(mapBuilder, "ads_count", in61Var.m);
        b(mapBuilder, CommonUrlParts.SCREEN_WIDTH, in61Var.A);
        b(mapBuilder, CommonUrlParts.SCREEN_HEIGHT, in61Var.B);
        b(mapBuilder, CommonUrlParts.SCALE_FACTOR, in61Var.C);
        b(mapBuilder, "ad_type", in61Var.v);
        b(mapBuilder, "network_type", in61Var.F);
        b(mapBuilder, "carrier", in61Var.G);
        a(mapBuilder, "dnt", in61Var.K);
        a(mapBuilder, "gaid_reset", in61Var.L);
        a(mapBuilder, "huawei_dnt", in61Var.N);
        b(mapBuilder, "image_sizes", in61Var.T);
        b(mapBuilder, "response_ad_format", in61Var.U);
        b(mapBuilder, "session_random", in61Var.V);
        b(mapBuilder, "charset", in61Var.W);
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Charset charset = uza.a;
        b(mapBuilder, new String(decode, charset), in61Var.a0);
        b(mapBuilder, new String(Base64.decode("b3NfbmFtZQ==", 0), charset), in61Var.b0);
        b(mapBuilder, new String(Base64.decode("b3NfdmVyc2lvbg==", 0), charset), in61Var.c0);
        b(mapBuilder, new String(Base64.decode("bWFudWZhY3R1cmVy", 0), charset), in61Var.d0);
        b(mapBuilder, new String(Base64.decode("bW9kZWw=", 0), charset), in61Var.e0);
        a(mapBuilder, new String(Base64.decode("aXNfcm9vdGVk", 0), charset), in61Var.Q);
        b(mapBuilder, "locale", in61Var.f0);
        b(mapBuilder, "content_language", in61Var.g0);
        ListBuilder listBuilder = in61Var.h0;
        b(mapBuilder, "device_languages", listBuilder != null ? a.X(listBuilder, ":", null, null, null, 62) : null);
        b(mapBuilder, CommonUrlParts.APP_ID, in61Var.i0);
        b(mapBuilder, "app_version_code", in61Var.j0);
        b(mapBuilder, CommonUrlParts.APP_VERSION, in61Var.k0);
        b(mapBuilder, "appmetrica_version", in61Var.x0);
        b(mapBuilder, CommonUrlParts.SCREEN_DPI, Integer.valueOf(in61Var.m0));
        b(mapBuilder, "safe_area_inset_left", Float.valueOf(in61Var.n0));
        b(mapBuilder, "safe_area_inset_top", Float.valueOf(in61Var.o0));
        b(mapBuilder, "safe_area_inset_right", Float.valueOf(in61Var.p0));
        b(mapBuilder, "safe_area_inset_bottom", Float.valueOf(in61Var.q0));
        b(mapBuilder, "cutout_safe_area_inset_top", Float.valueOf(in61Var.r0));
        b(mapBuilder, "cutout_safe_area_inset_bottom", Float.valueOf(in61Var.s0));
        b(mapBuilder, "gdpr", in61Var.o);
        b(mapBuilder, "gdpr_consent", in61Var.p);
        b(mapBuilder, "cmp_present", Integer.valueOf(in61Var.n ? 1 : 0));
        b(mapBuilder, "parsed_purpose_consents", in61Var.q);
        b(mapBuilder, "parsed_vendor_consents", in61Var.r);
        b(mapBuilder, "addtl_consent", in61Var.s);
        b(mapBuilder, "bidding_data", in61Var.X);
        b(mapBuilder, "prefetched_mediation_data", in61Var.Y);
        b(mapBuilder, "connected_network_ids", in61Var.Z);
        b(mapBuilder, "sdk_version", in61Var.v0);
        b(mapBuilder, "sdk_version_name", in61Var.w0);
        b(mapBuilder, "sdk_vendor", "yandex");
        b(mapBuilder, "preferred_theme", null);
        b(mapBuilder, "device_theme", in61Var.y0);
        a(mapBuilder, "age_restricted_user", in61Var.j);
        b(mapBuilder, "view_size_info", in61Var.z0);
        a(mapBuilder, "web_view_available", in61Var.A0);
        b(mapBuilder, "startup_version", in61Var.B0);
        b(mapBuilder, "session-data", in61Var.E0);
        b(mapBuilder, "user-agent", in61Var.D0);
        b(mapBuilder, "stub_reason", in61Var.H0);
        a(mapBuilder, "gms_available", in61Var.I0);
        a(mapBuilder, "opt_out", in61Var.J0);
        a(mapBuilder, "vpn_enabled", in61Var.K0);
        for (Map.Entry entry : in61Var.C0.entrySet()) {
            b(mapBuilder, (String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : in61Var.i.entrySet()) {
            b(mapBuilder, (String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!in61Var.g || in61Var.f) {
            b(mapBuilder, "uuid", in61Var.t);
        }
        if (!in61Var.g) {
            b(mapBuilder, "age", in61Var.t0);
            b(mapBuilder, "gender", in61Var.u0);
            b(mapBuilder, "context_query", in61Var.R);
            b(mapBuilder, "context_taglist", in61Var.S);
            b(mapBuilder, "google_aid", in61Var.M);
            b(mapBuilder, CommonUrlParts.APP_SET_ID, in61Var.k);
            b(mapBuilder, "huawei_oaid", in61Var.O);
            b(mapBuilder, "mauid", in61Var.l);
            b(mapBuilder, new String(Base64.decode("ZGV2aWNlLWlk", 0), uza.a), in61Var.l0);
            b(mapBuilder, "mcc", in61Var.D);
            b(mapBuilder, "mnc", in61Var.E);
            b(mapBuilder, StartupRequest.PARAM_CELLID, in61Var.H);
            b(mapBuilder, "lac", in61Var.I);
            b(mapBuilder, StartupRequest.PARAM_WIFI, in61Var.J);
            b(mapBuilder, "battery_charge", in61Var.P);
            b(mapBuilder, "server_side_client_ip", in61Var.F0);
            b(mapBuilder, "ipv6", in61Var.G0);
        }
        this.b = iw00.w(mapBuilder.j());
        MapBuilder mapBuilder2 = new MapBuilder();
        for (Map.Entry entry3 : in61Var.h.entrySet()) {
            b(mapBuilder2, (String) entry3.getKey(), entry3.getValue());
        }
        this.c = iw00.w(mapBuilder2.j());
        this.d = kotlin.a.a(new et0(this));
    }

    public final void a(MapBuilder mapBuilder, String str, Boolean bool) {
        if (bool != null) {
            b(mapBuilder, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public final void b(MapBuilder mapBuilder, String str, Object obj) {
        if (obj != null) {
            mapBuilder.put(Uri.encode(str), !this.a.a.contains(str) ? Uri.encode(obj.toString()) : Uri.encode(obj.toString(), ":"));
        }
    }

    public final String toString() {
        return (String) this.d.getValue();
    }
}

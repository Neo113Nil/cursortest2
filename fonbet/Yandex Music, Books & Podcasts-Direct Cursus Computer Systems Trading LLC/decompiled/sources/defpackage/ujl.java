package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ujl implements spp, lci, aio, hs6 {
    @Override // defpackage.aio
    public bio a(int i) {
        eft eftVar = new eft();
        eft eftVar2 = new eft();
        try {
            eftVar.a.a(v3g.G(0));
            int h = eftVar.h();
            boolean z = h % 2 == 0;
            eftVar2.a.a(v3g.G(z ? h + 1 : h - 1));
            if (z) {
                eftVar.b = eftVar2;
                return eftVar;
            }
            eftVar2.b = eftVar;
            return eftVar2;
        } catch (IOException e) {
            hld.x(eftVar);
            hld.x(eftVar2);
            throw e;
        }
    }

    @Override // defpackage.aio
    public aio b() {
        return new w6t();
    }

    public String c(z77 z77Var) {
        z77Var.getClass();
        return z77Var instanceof ydb ? "https://egw.pull-formats.plet.tst.yandex.net" : "https://egw.pull-formats.plet.yandex.net";
    }

    @Override // defpackage.spp
    public bpp f(ddl ddlVar, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        jsg jsgVar = jSONObject.has("session") ? new jsg(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 13) : new jsg(new JSONObject().optInt("max_custom_exception_events", 8), 13);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new bpp(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), jsgVar, new hx1(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new nkr(kkpVar.n(Uri.class, AssetFileDescriptor.class), 0);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dhn extends hjq {
    public static final dhn b = new dhn(1);

    public final void g(String str) {
        str.getClass();
        y60 e = e();
        arf g = tlm.g(bwf.c);
        ((Map) g.getValue()).put("station_name", str);
        tlm.o(e, "RadioSmartBlock_Playing_Started", g.isInitialized() ? (Map) g.getValue() : null);
    }

    public final void h(boolean z, int i, ArrayList arrayList, int i2, boolean z2) {
        String str = z2 ? "_optimized" : "";
        y60 e = e();
        z70 z70Var = new z70();
        z70Var.a(Boolean.TRUE, "gen2".concat(str));
        z70Var.a(Boolean.valueOf(z), "available".concat(str));
        z70Var.a(Integer.valueOf(i), "fps_average".concat(str));
        z70Var.a(arrayList.toString(), "frame_times".concat(str));
        z70Var.a(Integer.valueOf(i2), "drop_count".concat(str));
        tlm.o(e, "RadioSmartBlock_ShaderAnimation_GetInfo", z70Var.b());
    }
}

package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import yads.h01;
import yads.jk3;
import yads.tl0;
import yads.x3;
import yads.x92;

/* loaded from: classes7.dex */
public final class s971 extends ax81 {
    public final y381 A;
    public final ji41 B;
    public final vi71 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s971(Context context, fe81 fe81Var, ge71 ge71Var, String str, nr41 nr41Var, bs81 bs81Var, i971 i971Var) {
        super(context, fe81Var, 0, str, nr41Var, bs81Var, i971Var, null, ge71Var);
        y381 a = wt71.a(context);
        ji41 ji41Var = new ji41(29, a);
        vi71 vi71Var = new vi71(context, ge71Var, 0);
        this.A = a;
        this.B = ji41Var;
        this.C = vi71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    @Override // defpackage.ax81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final km81 c(gb81 gb81Var, int i) {
        String str;
        j671 j671Var;
        w97 h;
        String b;
        byte[] bArr = gb81Var.b;
        if (200 == i) {
            Map map = gb81Var.c;
            if (bArr != null && bArr.length != 0) {
                Map f = map == null ? b.f() : map;
                ji41 ji41Var = this.B;
                ji41Var.getClass();
                h01 h01Var = h01.D;
                String b2 = ob71.b(f, h01Var);
                if (b2 != null) {
                    String str2 = h01Var.b;
                    ((y381) ji41Var.b).a.a("SessionData", b2);
                }
                vi71 vi71Var = this.C;
                t281 t281Var = (t281) vi71Var.b;
                t281Var.a.getClass();
                Map f2 = map == null ? b.f() : map;
                t281Var.b.getClass();
                if (bArr != null) {
                    String b3 = ob71.b(f2, h01.T);
                    if (b3 == null ? true : Boolean.parseBoolean(b3)) {
                        try {
                            str = new String(Base64.decode(bArr, 0), uza.a);
                        } catch (Exception unused) {
                            str = new String(bArr, uza.a);
                        }
                    } else {
                        str = new String(bArr, uza.a);
                    }
                } else {
                    str = null;
                }
                zy2 zy2Var = new zy2(map == null ? b.f() : map);
                e871 e871Var = (e871) vi71Var.w;
                Map f3 = map == null ? b.f() : map;
                e871Var.getClass();
                String b4 = ob71.b(f3, h01.L);
                Map a = b4 != null ? km71.a(b4) : null;
                ob71.d(f3, h01.m);
                lb81.a(f3);
                if (str != null && str.length() != 0) {
                    try {
                        h = ((rr41) vi71Var.c).h(str, zy2Var);
                    } catch (Exception unused2) {
                    }
                    if (h != null) {
                        if (map != null && (b = ob71.b(map, h01.B)) != null) {
                            Boolean.parseBoolean(b);
                        }
                        j671Var = new j671(h, a);
                        return j671Var == null ? !j671Var.a.b.isEmpty() ? new km81(j671Var, null) : new km81(new tl0()) : new km81(new x92("Can't parse VAST response."));
                    }
                }
                j671Var = null;
                if (j671Var == null) {
                }
            }
        }
        int i2 = x3.a;
        return new km81(new jk3(l8a1.b(null, bka1.c(gb81Var).c).b));
    }

    @Override // defpackage.ax81, com.monetization.ads.network.core.Request
    public final Map getHeaders() {
        MapBuilder mapBuilder = new MapBuilder();
        String c = this.A.a.c("SessionData");
        if (c != null) {
        }
        mapBuilder.putAll(super.getHeaders());
        return mapBuilder.j();
    }
}

package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ovo implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d85 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ wn5 f;

    public /* synthetic */ ovo(String str, d85 d85Var, String str2, wn5 wn5Var, wn5 wn5Var2) {
        this.a = 0;
        this.c = str;
        this.d = d85Var;
        this.e = str2;
        this.b = wn5Var;
        this.f = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                pvo.d(this.c, this.d, this.e, this.b, this.f, null, hq5Var, 0);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                q5g.k(a.d(vci.a, 0.5625f), null, 0L, 0L, null, 0.0f, ild.C(1589852738, new ovo(this.b, this.c, this.d, this.e, this.f, 2), hq5Var2), hq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 62);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                bg3.a(d.c(vci.a, 1.0f), null, false, ild.C(2102804140, new lc(this.b, this.c, this.d, this.e, this.f, 18), hq5Var3), hq5Var3, 3078, 6);
        }
        return Unit.a;
    }

    public /* synthetic */ ovo(wn5 wn5Var, String str, d85 d85Var, String str2, wn5 wn5Var2, int i) {
        this.a = i;
        this.b = wn5Var;
        this.c = str;
        this.d = d85Var;
        this.e = str2;
        this.f = wn5Var2;
    }
}

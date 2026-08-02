package defpackage;

import com.yandex.div.state.db.StateEntry;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class yz50 extends keo {
    public final int c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yz50(int i, String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, int i2, String str6) {
        super("network_retry_detected", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Обнаружена необходимость повторного запроса");
        y.put("attempt", String.valueOf(i));
        y.put("base_url", str);
        if (num != null) {
        }
        if (str2 != null) {
        }
        if (num2 != null) {
        }
        y.put("handler_name", "Frontback403Status1004");
        y.put("http_method", str3);
        y.put(StateEntry.COLUMN_PATH, str4);
        y.put("request_id", str5);
        y.put("response_code", String.valueOf(i2));
        if (str6 != null) {
            y.put("token_source", str6);
        }
        this.c = i;
        this.d = str;
        this.e = num;
        this.f = str2;
        this.g = num2;
        this.h = "Frontback403Status1004";
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = i2;
        this.m = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz50)) {
            return false;
        }
        yz50 yz50Var = (yz50) obj;
        return this.c == yz50Var.c && jl40.l(this.d, yz50Var.d) && jl40.l(this.e, yz50Var.e) && jl40.l(this.f, yz50Var.f) && jl40.l(this.g, yz50Var.g) && jl40.l(this.h, yz50Var.h) && jl40.l(this.i, yz50Var.i) && jl40.l(this.j, yz50Var.j) && jl40.l(this.k, yz50Var.k) && this.l == yz50Var.l && jl40.l(this.m, yz50Var.m);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.c) * 31, 31, this.d);
        Integer num = this.e;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.g;
        int b2 = oyr.b(this.l, unr0.b(unr0.b(unr0.b(unr0.b((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31);
        String str2 = this.m;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.c, "NetworkRetryDetected(attempt=", ", baseUrl=", this.d, ", errorCode=");
        tse0.w(this.e, ", errorMessage=", this.f, ", errorSubcode=", v);
        tse0.w(this.g, ", handlerName=", this.h, ", httpMethod=", v);
        g8e.D(v, this.i, ", path=", this.j, ", requestId=");
        b64.A(this.l, this.k, ", responseCode=", ", tokenSource=", v);
        return oyr.t(v, this.m, Extension.C_BRAKE);
    }
}

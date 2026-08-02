package defpackage;

import com.yandex.div.state.db.StateEntry;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class u1k0 extends keo {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u1k0(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        super("retry_handler_error", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка в обработчике повторных запросов");
        y.put("attempt", String.valueOf(i));
        y.put("base_url", str);
        if (str2 != null) {
        }
        y.put("error_type", str3);
        y.put("handler_name", str4);
        y.put(StateEntry.COLUMN_PATH, str5);
        y.put("request_id", str6);
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1k0)) {
            return false;
        }
        u1k0 u1k0Var = (u1k0) obj;
        return this.c == u1k0Var.c && jl40.l(this.d, u1k0Var.d) && jl40.l(this.e, u1k0Var.e) && jl40.l(this.f, u1k0Var.f) && jl40.l(this.g, u1k0Var.g) && jl40.l(this.h, u1k0Var.h) && jl40.l(this.i, u1k0Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(Integer.hashCode(this.c) * 31, 31, this.d);
        String str = this.e;
        return this.i.hashCode() + unr0.b(unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.c, "RetryHandlerError(attempt=", ", baseUrl=", this.d, ", errorMessage=");
        g8e.D(v, this.e, ", errorType=", this.f, ", handlerName=");
        g8e.D(v, this.g, ", path=", this.h, ", requestId=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }
}

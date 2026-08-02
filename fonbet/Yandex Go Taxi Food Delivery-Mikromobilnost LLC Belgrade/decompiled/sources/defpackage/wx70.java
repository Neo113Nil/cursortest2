package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwx70;", "", "Companion", "ux70", "vx70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class wx70 {
    public static final vx70 Companion = new vx70();
    public static final i3y[] f = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(18))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public /* synthetic */ wx70(String str, int i, String str2, String str3, String str4, Map map) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
    }

    public static final /* synthetic */ void d(wx70 wx70Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(wx70Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, wx70Var.a);
        }
        if (yjdVar.F() || !jl40.l(wx70Var.b, "")) {
            yjdVar.o(serialDescriptor, 1, wx70Var.b);
        }
        if (yjdVar.F() || wx70Var.c != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, wx70Var.c);
        }
        if (yjdVar.F() || wx70Var.d != null) {
            yjdVar.g(serialDescriptor, 3, auu0.a, wx70Var.d);
        }
        if (!yjdVar.F() && wx70Var.e == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 4, (KSerializer) f[4].getValue(), wx70Var.e);
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx70)) {
            return false;
        }
        wx70 wx70Var = (wx70) obj;
        return jl40.l(this.a, wx70Var.a) && jl40.l(this.b, wx70Var.b) && jl40.l(this.c, wx70Var.c) && jl40.l(this.d, wx70Var.d) && jl40.l(this.e, wx70Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.e;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderInfoDto(service=", this.a, ", orderId=", this.b, ", status=");
        g8e.D(v, this.c, ", completionDatetime=", this.d, ", orderMeta=");
        return b64.r(v, this.e, Extension.C_BRAKE);
    }

    public wx70(String str, String str2, String str3, String str4, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public wx70() {
        this("", "", null, null, null);
    }
}

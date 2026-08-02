package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x2i extends y2i {
    public final ChatRequest a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final MapBuilder f;

    public x2i(ChatRequest chatRequest, String str, String str2, String str3, String str4, MapBuilder mapBuilder) {
        this.a = chatRequest;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = mapBuilder;
    }

    @Override // defpackage.y2i
    public final Map a() {
        return this.f;
    }

    @Override // defpackage.y2i
    public final ChatRequest b() {
        return this.a;
    }

    @Override // defpackage.y2i
    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2i)) {
            return false;
        }
        x2i x2iVar = (x2i) obj;
        return jl40.l(this.a, x2iVar.a) && jl40.l(this.b, x2iVar.b) && jl40.l(this.c, x2iVar.c) && jl40.l(this.d, x2iVar.d) && jl40.l(this.e, x2iVar.e) && this.f.equals(x2iVar.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(chatRequest=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", chatIconTag=", this.d, ", supportMetaInfo=");
        sb.append(this.e);
        sb.append(", analyticsAttrs=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}

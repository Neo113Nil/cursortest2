package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class zdo {
    public static final ydo Companion = new ydo();
    public static final i3y[] d;
    public final String a;
    public final png b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new cao(6)), a.b(lazyThreadSafetyMode, new cao(7))};
    }

    public /* synthetic */ zdo(int i, String str, png pngVar, List list) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, xdo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
        this.c = list;
    }

    public static zdo a(zdo zdoVar, png pngVar) {
        String str = zdoVar.a;
        List list = zdoVar.c;
        zdoVar.getClass();
        return new zdo(str, pngVar, list);
    }

    public final String b() {
        return this.a;
    }

    public final png c() {
        return this.b;
    }

    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdo)) {
            return false;
        }
        zdo zdoVar = (zdo) obj;
        return jl40.l(this.a, zdoVar.a) && jl40.l(this.b, zdoVar.b) && jl40.l(this.c, zdoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Payload(id=");
        sb.append(this.a);
        sb.append(", initialState=");
        sb.append(this.b);
        sb.append(", supportedDirectives=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public zdo(String str, png pngVar, List list) {
        this.a = str;
        this.b = pngVar;
        this.c = list;
    }
}

package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ow {
    public final lt a;
    public final ArrayList b;
    public final u51 c;
    public final u9b d;
    public final fxm e;
    public final n4l f;
    public final lxm g;

    public ow(lt ltVar, ArrayList arrayList, u51 u51Var, u9b u9bVar, fxm fxmVar, n4l n4lVar, lxm lxmVar) {
        this.a = ltVar;
        this.b = arrayList;
        this.c = u51Var;
        this.d = u9bVar;
        this.e = fxmVar;
        this.f = n4lVar;
        this.g = lxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow)) {
            return false;
        }
        ow owVar = (ow) obj;
        return this.a.equals(owVar.a) && this.b.equals(owVar.b) && Intrinsics.d(this.c, owVar.c) && this.d.equals(owVar.d) && this.e == owVar.e && this.f.equals(owVar.f) && Intrinsics.d(this.g, owVar.g);
    }

    public final int hashCode() {
        int b = dfi.b(this.b, this.a.hashCode() * 31, 31);
        u51 u51Var = this.c;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((b + (u51Var == null ? 0 : u51Var.hashCode())) * 31)) * 31)) * 31)) * 31;
        lxm lxmVar = this.g;
        return hashCode + (lxmVar != null ? lxmVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumPromo(album=" + this.a + ", artists=" + this.b + ", promoArtist=" + this.c + ", cover=" + this.d + ", coverContentMode=" + this.e + ", playbackReportingPayload=" + this.f + ", promoReportingPayload=" + this.g + ")";
    }
}

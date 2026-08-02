package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sdl implements wdl {
    public final ydl a;
    public final vdl b;
    public final String c;

    public sdl(ydl ydlVar, vdl vdlVar, String str) {
        this.a = ydlVar;
        this.b = vdlVar;
        this.c = str;
    }

    @Override // defpackage.wdl
    public final vdl a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdl)) {
            return false;
        }
        sdl sdlVar = (sdl) obj;
        return this.a.equals(sdlVar.a) && this.b.equals(sdlVar.b) && Intrinsics.d(this.c, sdlVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Common(common=");
        sb.append(this.a);
        sb.append(", reference=");
        sb.append(this.b);
        sb.append(", analyticsSegment=");
        return su4.o(sb, this.c, ")");
    }
}

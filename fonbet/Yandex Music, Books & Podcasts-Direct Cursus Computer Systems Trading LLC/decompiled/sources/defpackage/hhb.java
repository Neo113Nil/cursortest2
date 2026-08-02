package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hhb extends jhb {
    public final ams d;
    public final String e;
    public final c5b f;
    public final c5b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhb(ams amsVar, String str) {
        super(str);
        str.getClass();
        this.d = amsVar;
        this.e = str;
        c5b c5bVar = c5b.a;
        this.f = c5bVar;
        this.g = c5bVar;
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        ams amsVar = this.d;
        if (amsVar instanceof yls) {
            return ((yls) amsVar).a;
        }
        if (amsVar instanceof xls) {
            return Boolean.valueOf(((xls) amsVar).a);
        }
        if (amsVar instanceof zls) {
            return ((zls) amsVar).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.g;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhb)) {
            return false;
        }
        hhb hhbVar = (hhb) obj;
        return Intrinsics.d(this.d, hhbVar.d) && Intrinsics.d(this.e, hhbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        ams amsVar = this.d;
        if (amsVar instanceof zls) {
            return dfi.i(new StringBuilder("'"), ((zls) amsVar).a, '\'');
        }
        if (amsVar instanceof yls) {
            return ((yls) amsVar).a.toString();
        }
        if (amsVar instanceof xls) {
            return String.valueOf(((xls) amsVar).a);
        }
        b6e.s();
        return null;
    }
}

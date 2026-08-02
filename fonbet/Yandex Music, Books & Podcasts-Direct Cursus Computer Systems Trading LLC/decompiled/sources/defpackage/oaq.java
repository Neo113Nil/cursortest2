package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class oaq implements f5q {
    public final paq a = new paq("");
    public final String b = "";
    public final c5b c = c5b.a;

    public oaq() {
        iow iowVar = iow.a;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oaq);
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.b;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "UnknownEntity(id=)";
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.a;
    }
}

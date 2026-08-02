package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class taq implements f5q {
    public final String a;
    public final uaq b;
    public final c5b c;
    public final String d;

    public taq(String str) {
        str.getClass();
        this.a = str;
        this.b = new uaq(str);
        this.c = c5b.a;
        this.d = "";
        iow iowVar = iow.a;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof taq) && Intrinsics.d(this.a, ((taq) obj).a);
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.d;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("SharedYnisonVideoWaveEntity(videoId=", this.a, ")");
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.b;
    }
}

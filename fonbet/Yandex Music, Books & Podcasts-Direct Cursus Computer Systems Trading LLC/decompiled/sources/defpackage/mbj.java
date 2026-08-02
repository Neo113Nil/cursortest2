package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mbj implements pbj {
    public final a0q a;
    public final mqs b;
    public final u3q c;
    public final ArrayList d;

    public mbj(a0q a0qVar, mqs mqsVar, u3q u3qVar, ArrayList arrayList) {
        a0qVar.getClass();
        mqsVar.getClass();
        this.a = a0qVar;
        this.b = mqsVar;
        this.c = u3qVar;
        this.d = arrayList;
    }

    @Override // defpackage.pbj
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbj)) {
            return false;
        }
        mbj mbjVar = (mbj) obj;
        return Intrinsics.d(this.a, mbjVar.a) && Intrinsics.d(this.b, mbjVar.b) && this.c.equals(mbjVar.c) && this.d.equals(mbjVar.d);
    }

    @Override // defpackage.pbj
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "CommonEntity(id=" + this.a + ", track=" + this.b + ", entity=" + this.c + ", queueOrderTracks=" + this.d + ")";
    }
}

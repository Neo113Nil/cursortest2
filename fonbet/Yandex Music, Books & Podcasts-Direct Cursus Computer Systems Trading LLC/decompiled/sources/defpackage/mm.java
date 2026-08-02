package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mm implements nm {
    public final String a;
    public final mqs b;
    public final List c;
    public final gjl d;

    public mm(String str, mqs mqsVar, List list, gjl gjlVar) {
        mqsVar.getClass();
        list.getClass();
        this.a = str;
        this.b = mqsVar;
        this.c = list;
        this.d = gjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return Intrinsics.d(this.a, mmVar.a) && Intrinsics.d(this.b, mmVar.b) && Intrinsics.d(this.c, mmVar.c) && Intrinsics.d(this.d, mmVar.d);
    }

    @Override // defpackage.nm
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int d = k5r.d(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a), 31, this.c);
        gjl gjlVar = this.d;
        return d + (gjlVar != null ? gjlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", track=" + this.b + ", playlistItems=" + this.c + ", blockAnalyticsPayload=" + this.d + ")";
    }
}

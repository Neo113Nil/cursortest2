package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zwr implements z3h {
    public static final zwr d = new zwr(null, c5b.a, 0);
    public final List a;
    public final int b;
    public final String c;

    public zwr(String str, List list, int i) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwr)) {
            return false;
        }
        zwr zwrVar = (zwr) obj;
        return Intrinsics.d(this.a, zwrVar.a) && this.b == zwrVar.b && Intrinsics.d(this.c, zwrVar.c);
    }

    public final int hashCode() {
        int a = f1d.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncLyricsUiData(lyricsList=");
        sb.append(this.a);
        sb.append(", countDownNum=");
        sb.append(this.b);
        sb.append(", trackInfo=");
        return su4.o(sb, this.c, ")");
    }
}

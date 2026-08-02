package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class meg {
    public final Long a;
    public final Long b;
    public final Float c;
    public final Boolean d;

    public meg(Long l, Long l2, Float f, Boolean bool) {
        this.a = l;
        this.b = l2;
        this.c = f;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meg)) {
            return false;
        }
        meg megVar = (meg) obj;
        return this.a.equals(megVar.a) && this.b.equals(megVar.b) && Intrinsics.c(this.c, megVar.c) && this.d.equals(megVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadControlParameters(playbackPositionUs=");
        sb.append(this.a);
        sb.append(", bufferedDurationUs=");
        sb.append(this.b);
        sb.append(", playbackSpeed=");
        sb.append(this.c);
        sb.append(", playWhenReady=null, rebuffering=");
        return k.p(sb, this.d, ')');
    }
}

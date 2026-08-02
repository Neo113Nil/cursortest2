package defpackage;

import com.yandex.delivery.mapper.model.TimelineItemStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sru {
    public final String a;
    public final TimelineItemStatus b;
    public final String c;
    public final String d;

    public sru(String str, TimelineItemStatus timelineItemStatus, String str2, String str3) {
        this.a = str;
        this.b = timelineItemStatus;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sru)) {
            return false;
        }
        sru sruVar = (sru) obj;
        return jl40.l(this.a, sruVar.a) && this.b == sruVar.b && jl40.l(this.c, sruVar.c) && this.d.equals(sruVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalTimelineItemModel(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", imageTag=");
        return g8e.r(sb, this.c, ", imageTagDark=", this.d, Extension.C_BRAKE);
    }
}

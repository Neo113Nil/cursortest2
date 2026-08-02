package defpackage;

import android.net.Uri;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rfk extends xfk {
    public final double a;
    public final DivAlignmentHorizontal b;
    public final DivAlignmentVertical c;
    public final Uri d;
    public final boolean e;
    public final DivImageScale f;
    public final List g;

    public rfk(double d, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical, Uri uri, boolean z, DivImageScale divImageScale, ArrayList arrayList) {
        this.a = d;
        this.b = divAlignmentHorizontal;
        this.c = divAlignmentVertical;
        this.d = uri;
        this.e = z;
        this.f = divImageScale;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfk)) {
            return false;
        }
        rfk rfkVar = (rfk) obj;
        return Double.compare(this.a, rfkVar.a) == 0 && this.b == rfkVar.b && this.c == rfkVar.c && jl40.l(this.d, rfkVar.d) && this.e == rfkVar.e && this.f == rfkVar.f && jl40.l(this.g, rfkVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31;
        List list = this.g;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(alpha=");
        sb.append(this.a);
        sb.append(", contentAlignmentHorizontal=");
        sb.append(this.b);
        sb.append(", contentAlignmentVertical=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", preloadRequired=");
        sb.append(this.e);
        sb.append(", scale=");
        sb.append(this.f);
        sb.append(", filters=");
        return unr0.t(sb, this.g, ')');
    }
}

package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;

/* loaded from: classes13.dex */
public final class rl4 extends xl4 {
    public final String c;

    public rl4(String str) {
        super(BadgeModel$BadgePlace.SINGLE_TOP_RIGHT);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl4) && jl40.l(this.c, ((rl4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() * 31;
    }

    public final String toString() {
        return oyr.p("TopRight(imageTag=", this.c, ", fallbackImageRes=null)");
    }
}

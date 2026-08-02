package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class yay {
    public final String a;
    public final ArrayList b;

    public yay(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yay)) {
            return false;
        }
        yay yayVar = (yay) obj;
        return this.a.equals(yayVar.a) && this.b.equals(yayVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalInfo(text=");
        sb.append(this.a);
        sb.append(", items=");
        return smw0.m(sb, this.b, ')');
    }
}

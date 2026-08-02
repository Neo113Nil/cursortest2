package defpackage;

/* loaded from: classes.dex */
public final class qak extends ebk {
    public final float c;
    public final float d;

    public qak(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qak)) {
            return false;
        }
        qak qakVar = (qak) obj;
        return Float.compare(this.c, qakVar.c) == 0 && Float.compare(this.d, qakVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ouj.p(sb, this.d, ')');
    }
}

package defpackage;

/* loaded from: classes4.dex */
public final class iou {
    public final d6v a;
    public final int b;

    public iou(d6v d6vVar, int i) {
        this.a = d6vVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iou)) {
            return false;
        }
        iou iouVar = (iou) obj;
        return this.a.equals(iouVar.a) && this.b == iouVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveEntityWithKey(source=" + this.a + ", key=" + this.b + ")";
    }
}

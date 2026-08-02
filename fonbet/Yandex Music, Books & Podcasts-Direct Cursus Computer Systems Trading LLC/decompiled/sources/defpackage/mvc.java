package defpackage;

/* loaded from: classes.dex */
public final class mvc extends lvc {
    public long f;
    public long g;

    @Override // defpackage.lvc
    public final boolean equals(Object obj) {
        if (!(obj instanceof mvc) || !super.equals(obj)) {
            return false;
        }
        mvc mvcVar = (mvc) obj;
        return this.f == mvcVar.f && this.g == mvcVar.g;
    }

    @Override // defpackage.lvc
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31) + (super.hashCode() * 31);
    }

    @Override // defpackage.lvc
    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameData(frameStartNanos=");
        sb.append(this.b);
        sb.append(", frameDurationUiNanos=");
        sb.append(this.c);
        sb.append(", frameDurationCpuNanos=");
        sb.append(this.e);
        sb.append(", frameDurationTotalNanos=");
        sb.append(this.f);
        sb.append(", frameOverrunNanos=");
        sb.append(this.g);
        sb.append(", isJank=");
        sb.append(this.d);
        sb.append(", states=");
        return eta.h(sb, this.a, ')');
    }
}

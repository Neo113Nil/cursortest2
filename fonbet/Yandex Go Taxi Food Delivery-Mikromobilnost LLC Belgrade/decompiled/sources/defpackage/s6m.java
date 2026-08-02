package defpackage;

import com.yandex.xplat.xflags.VariableType;

/* loaded from: classes2.dex */
public final class s6m extends b231 {
    public final double b;

    public s6m(double d) {
        super(VariableType.Double);
        this.b = d;
    }

    @Override // defpackage.b231
    public final y3x b() {
        return new s5m(this.b);
    }
}

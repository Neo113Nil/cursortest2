package defpackage;

/* loaded from: classes13.dex */
public interface uy20 {
    default int a() {
        float f;
        float f2;
        float f3;
        if (this instanceof ry20) {
            f3 = uh6.o(((ry20) this).a);
        } else {
            if (this instanceof sy20) {
                f = ofp0.b;
                f2 = ((sy20) this).a;
            } else {
                if (!(this instanceof ty20)) {
                    w511.b();
                    return 0;
                }
                f = ofp0.c;
                f2 = ((ty20) this).a;
            }
            f3 = f2 * f;
        }
        return (int) f3;
    }
}

package defpackage;

/* loaded from: classes10.dex */
public final class x8v implements xi21, icv, lyw {
    public static final x34 A;
    public static final x34 B;
    public static final x34 C;
    public static final x34 D;
    public static final x34 E;
    public static final x34 F;
    public static final x34 b;
    public static final x34 c;
    public static final x34 w;
    public static final x34 x;
    public static final x34 y;
    public static final x34 z;
    public final ug70 a;

    static {
        Class cls = Integer.TYPE;
        b = new x34("camerax.core.imageCapture.captureMode", cls, null);
        c = new x34("camerax.core.imageCapture.flashMode", cls, null);
        w = new x34("camerax.core.imageCapture.captureBundle", p38.class, null);
        x = new x34("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        y = new x34("camerax.core.imageCapture.outputFormat", Integer.class, null);
        z = new x34("camerax.core.imageCapture.imageReaderProxyProvider", qdv.class, null);
        A = new x34("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        B = new x34("camerax.core.imageCapture.flashType", cls, null);
        C = new x34("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        D = new x34("camerax.core.imageCapture.screenFlash", v8v.class, null);
        E = new x34("camerax.core.useCase.postviewResolutionSelector", bsj0.class, null);
        F = new x34("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public x8v(ug70 ug70Var) {
        this.a = ug70Var;
    }

    @Override // defpackage.ybi0
    public final szd getConfig() {
        return this.a;
    }

    @Override // defpackage.eav
    public final int getInputFormat() {
        return ((Integer) f(eav.j2)).intValue();
    }
}

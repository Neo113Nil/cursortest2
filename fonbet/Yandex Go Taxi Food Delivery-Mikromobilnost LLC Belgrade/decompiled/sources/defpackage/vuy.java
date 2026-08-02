package defpackage;

/* loaded from: classes6.dex */
public final class vuy {
    public static final /* synthetic */ int a = 0;

    static {
        new vuy(0.0f, 0.0f, 0.0f, 255.0f, 255.0f, 255.0f);
        new vuy(127.5f, 127.5f, 127.5f, 127.5f, 127.5f, 127.5f);
        new vuy(123.675f, 116.28f, 103.53f, 58.395f, 57.12f, 57.375f);
    }

    public vuy(float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.abs(f) > Float.MAX_VALUE) {
            ny61.g("redMean must be finite");
            throw null;
        }
        if (Math.abs(f2) > Float.MAX_VALUE) {
            ny61.g("greenMean must be finite");
            throw null;
        }
        if (Math.abs(f3) > Float.MAX_VALUE) {
            ny61.g("blueMean must be finite");
            throw null;
        }
        if (Math.abs(f4) > Float.MAX_VALUE) {
            ny61.g("redStd must be finite");
            throw null;
        }
        if (Math.abs(f5) > Float.MAX_VALUE) {
            ny61.g("greenStd must be finite");
            throw null;
        }
        if (Math.abs(f6) > Float.MAX_VALUE) {
            ny61.g("blueStd must be finite");
            throw null;
        }
        if (f4 <= 0.0f) {
            ny61.g("redStd must be greater than 0");
            throw null;
        }
        if (f5 <= 0.0f) {
            ny61.g("greenStd must be greater than 0");
            throw null;
        }
        if (f6 > 0.0f) {
            return;
        }
        ny61.g("blueStd must be greater than 0");
        throw null;
    }
}

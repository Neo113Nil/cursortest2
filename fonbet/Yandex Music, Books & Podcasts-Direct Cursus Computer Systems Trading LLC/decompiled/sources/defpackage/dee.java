package defpackage;

/* loaded from: classes3.dex */
public abstract class dee {
    public static final kpm a;
    public static final kpm b;

    static {
        try {
            a = new kpm(eee.class.getDeclaredField("map"));
            try {
                b = new kpm(eee.class.getDeclaredField("size"));
            } catch (NoSuchFieldException e) {
                xq0.w(e);
            }
        } catch (NoSuchFieldException e2) {
            xq0.w(e2);
        }
    }
}

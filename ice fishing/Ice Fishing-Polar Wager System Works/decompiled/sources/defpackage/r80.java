package defpackage;

/* loaded from: classes.dex */
public abstract class r80 {
    public static final java.lang.Integer IHQe1A4L2xu;

    static {
        java.lang.Integer num;
        java.lang.Object obj;
        java.lang.Integer num2 = null;
        try {
            obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (java.lang.Throwable unused) {
        }
        if (obj instanceof java.lang.Integer) {
            num = (java.lang.Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            IHQe1A4L2xu = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        IHQe1A4L2xu = num2;
    }
}

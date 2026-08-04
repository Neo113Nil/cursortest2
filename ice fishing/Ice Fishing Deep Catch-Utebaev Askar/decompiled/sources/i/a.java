package i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f130a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Integer f131b;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null) {
            if (num.intValue() > 0) {
                num2 = num;
            }
        }
        f131b = num2;
    }
}

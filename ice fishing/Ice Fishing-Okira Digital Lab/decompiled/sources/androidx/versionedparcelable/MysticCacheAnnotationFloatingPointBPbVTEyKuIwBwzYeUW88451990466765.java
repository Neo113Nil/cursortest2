package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class MysticCacheAnnotationFloatingPointBPbVTEyKuIwBwzYeUW88451990466765 {
    public static final Integer ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = num2;
    }
}

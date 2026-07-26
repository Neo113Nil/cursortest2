package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterButtonDeltaThunderOlympian7332 {
    public static final Integer FrostHunterAlphaAnimationNeoCosmos5761;

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
            FrostHunterAlphaAnimationNeoCosmos5761 = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = num2;
    }
}

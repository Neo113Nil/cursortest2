package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterCoroutineScopeHyperAurora8760 {
    public static final String FrostHunterAlphaAnimationNeoCosmos5761;
    public static final String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        String str;
        int i = 1;
        int length = "H".length();
        if (length == 0) {
            str = "";
        } else if (length != 1) {
            StringBuilder sb = new StringBuilder("H".length() * 10);
            while (true) {
                sb.append((CharSequence) "H");
                if (i == 10) {
                    break;
                } else {
                    i++;
                }
            }
            str = sb.toString();
        } else {
            char charAt = "H".charAt(0);
            char[] cArr = new char[10];
            for (int i2 = 0; i2 < 10; i2++) {
                cArr[i2] = charAt;
            }
            str = new String(cArr);
        }
        FrostHunterAlphaAnimationNeoCosmos5761 = str;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = str + '\n' + str;
    }
}

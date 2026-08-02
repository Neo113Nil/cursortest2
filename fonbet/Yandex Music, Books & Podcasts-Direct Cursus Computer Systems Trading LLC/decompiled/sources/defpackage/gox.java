package defpackage;

/* loaded from: classes3.dex */
public final class gox {
    public static gox a() {
        byte b = (byte) (((byte) 1) | 2);
        if (b == 3) {
            return new gox();
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((b & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        xq0.q("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof gox);
    }

    public final int hashCode() {
        return -721381028;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=0, allowAssetPackDeletion=false}";
    }
}

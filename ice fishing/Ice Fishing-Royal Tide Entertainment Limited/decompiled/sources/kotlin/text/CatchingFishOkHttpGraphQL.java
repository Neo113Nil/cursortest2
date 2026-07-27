package kotlin.text;

import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpGraphQL {
    public final CatchingFishFirebaseGlide CatchingFishParcelableFAB;

    static {
        new CatchingFishOkHttpGraphQL("", 0, 0);
    }

    public CatchingFishOkHttpGraphQL(String str, int i, int i2) {
        this.CatchingFishParcelableFAB = new CatchingFishFirebaseGlide(str, i, i2);
    }

    public static CatchingFishOkHttpGraphQL CatchingFishParcelableFAB(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            sb = "M0," + i8 + " A" + i7 + "," + i8 + " 0 1,1 " + i + "," + i8 + " A" + i7 + "," + i8 + " 0 1,1 0," + i8 + " Z";
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i2);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new CatchingFishOkHttpGraphQL(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatchingFishOkHttpGraphQL) {
            return Objects.equals(this.CatchingFishParcelableFAB, ((CatchingFishOkHttpGraphQL) obj).CatchingFishParcelableFAB);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.CatchingFishParcelableFAB);
    }

    public final String toString() {
        return this.CatchingFishParcelableFAB.toString();
    }
}

package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class RoundedPolygon {
    public final long center;
    public final ListBuilder cubics;
    public final ArrayList features;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.graphics.shapes.Cubic[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v28, types: [androidx.graphics.shapes.Cubic[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, kotlin.collections.builders.ListBuilder] */
    public RoundedPolygon(ArrayList arrayList, long j) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        char c;
        char c2;
        char c3;
        char c4;
        ?? r17;
        int i;
        Cubic cubic;
        Cubic cubic2;
        List list;
        int i2;
        this.features = arrayList;
        this.center = j;
        ?? createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        char c5 = 5;
        char c6 = 4;
        char c7 = 3;
        char c8 = 2;
        boolean z = true;
        int i3 = 0;
        if (arrayList.size() <= 0 || ((Feature) arrayList.get(0)).cubics.size() != 3) {
            arrayList2 = null;
            arrayList3 = null;
        } else {
            Cubic cubic3 = (Cubic) ((Feature) arrayList.get(0)).cubics.get(1);
            float[] fArr = cubic3.points;
            long m127constructorimpl = FloatFloatPair.m127constructorimpl((cubic3.getAnchor1X() * 0.125f) + (fArr[4] * 0.375f) + (fArr[2] * 0.375f) + (fArr[0] * 0.125f), (cubic3.getAnchor1Y() * 0.125f) + (fArr[5] * 0.375f) + (fArr[3] * 0.375f) + (fArr[1] * 0.125f));
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2] * 0.5f;
            float f4 = fArr[3] * 0.5f;
            Cubic Cubic = CubicKt.Cubic(f, f2, f3 + (f * 0.5f), f4 + (f2 * 0.5f), (fArr[4] * 0.25f) + (f * 0.25f) + f3, (fArr[5] * 0.25f) + (f2 * 0.25f) + f4, PointKt.m1133getXDnnuFBc(m127constructorimpl), PointKt.m1134getYDnnuFBc(m127constructorimpl));
            Cubic Cubic2 = CubicKt.Cubic(PointKt.m1133getXDnnuFBc(m127constructorimpl), PointKt.m1134getYDnnuFBc(m127constructorimpl), (cubic3.getAnchor1X() * 0.25f) + (fArr[4] * 0.5f) + (fArr[2] * 0.25f), (cubic3.getAnchor1Y() * 0.25f) + (fArr[5] * 0.5f) + (fArr[3] * 0.25f), (cubic3.getAnchor1X() * 0.5f) + (fArr[4] * 0.5f), (cubic3.getAnchor1Y() * 0.5f) + (fArr[5] * 0.5f), cubic3.getAnchor1X(), cubic3.getAnchor1Y());
            arrayList3 = CollectionsKt__CollectionsKt.mutableListOf(new Cubic[]{((Feature) arrayList.get(0)).cubics.get(0), Cubic});
            arrayList2 = CollectionsKt__CollectionsKt.mutableListOf(new Cubic[]{Cubic2, ((Feature) arrayList.get(0)).cubics.get(2)});
        }
        int size = arrayList.size();
        if (size >= 0) {
            int i4 = 0;
            cubic = null;
            cubic2 = null;
            while (true) {
                if (i4 != 0 || arrayList2 == null) {
                    c = c5;
                    if (i4 != this.features.size()) {
                        list = ((Feature) this.features.get(i4)).cubics;
                    } else {
                        if (arrayList3 == null) {
                            c2 = c6;
                            c3 = c7;
                            c4 = c8;
                            r17 = z;
                            i = i3;
                            break;
                        }
                        list = arrayList3;
                    }
                } else {
                    c = c5;
                    list = arrayList2;
                }
                c2 = c6;
                int size2 = list.size();
                c3 = c7;
                int i5 = i3;
                while (i5 < size2) {
                    char c9 = c8;
                    Cubic cubic4 = (Cubic) list.get(i5);
                    boolean z2 = z;
                    float[] fArr2 = cubic4.points;
                    if (Math.abs(fArr2[i3] - cubic4.getAnchor1X()) >= 1.0E-4f || Math.abs(fArr2[z2 ? 1 : 0] - cubic4.getAnchor1Y()) >= 1.0E-4f) {
                        i2 = i3;
                        if (cubic2 != null) {
                            createListBuilder.add(cubic2);
                        }
                        if (cubic == null) {
                            cubic = cubic4;
                            cubic2 = cubic;
                        } else {
                            cubic2 = cubic4;
                        }
                    } else if (cubic2 != null) {
                        float[] fArr3 = cubic2.points;
                        i2 = i3;
                        float[] copyOf = Arrays.copyOf(fArr3, fArr3.length);
                        Cubic cubic5 = new Cubic(copyOf);
                        copyOf[6] = cubic4.getAnchor1X();
                        copyOf[7] = cubic4.getAnchor1Y();
                        cubic2 = cubic5;
                    } else {
                        i2 = i3;
                    }
                    i5++;
                    z = z2 ? 1 : 0;
                    c8 = c9;
                    i3 = i2;
                }
                c4 = c8;
                r17 = z;
                i = i3;
                if (i4 == size) {
                    break;
                }
                i4++;
                c5 = c;
                c6 = c2;
                c7 = c3;
                z = r17 == true ? 1 : 0;
                c8 = c4;
                i3 = i;
            }
        } else {
            c = 5;
            c2 = 4;
            c3 = 3;
            c4 = 2;
            r17 = 1;
            i = 0;
            cubic = null;
            cubic2 = null;
        }
        if (cubic2 == null || cubic == null) {
            createListBuilder.add(CubicKt.Cubic(PointKt.m1133getXDnnuFBc(this.center), PointKt.m1134getYDnnuFBc(this.center), PointKt.m1133getXDnnuFBc(this.center), PointKt.m1134getYDnnuFBc(this.center), PointKt.m1133getXDnnuFBc(this.center), PointKt.m1134getYDnnuFBc(this.center), PointKt.m1133getXDnnuFBc(this.center), PointKt.m1134getYDnnuFBc(this.center)));
        } else {
            float[] fArr4 = cubic2.points;
            float f5 = fArr4[i];
            float f6 = fArr4[r17];
            float f7 = fArr4[c4];
            float f8 = fArr4[c3];
            float f9 = fArr4[c2];
            float f10 = fArr4[c];
            float[] fArr5 = cubic.points;
            createListBuilder.add(CubicKt.Cubic(f5, f6, f7, f8, f9, f10, fArr5[i], fArr5[r17]));
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        this.cubics = build;
        Object obj = build.get(build.getSize() - 1);
        int size3 = build.size();
        int i6 = i;
        while (i6 < size3) {
            Cubic cubic6 = (Cubic) this.cubics.get(i6);
            Cubic cubic7 = (Cubic) obj;
            if (Math.abs(cubic6.points[i] - cubic7.getAnchor1X()) > 1.0E-4f || Math.abs(cubic6.points[r17] - cubic7.getAnchor1Y()) > 1.0E-4f) {
                a$$ExternalSyntheticBUOutline0.m$3("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i6++;
            obj = cubic6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedPolygon)) {
            return false;
        }
        return this.features.equals(((RoundedPolygon) obj).features);
    }

    public final int hashCode() {
        return this.features.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(CollectionsKt.joinToString$default(this.cubics, null, null, null, 0, null, null, 63));
        sb.append(" || Features = ");
        sb.append(CollectionsKt.joinToString$default(this.features, null, null, null, 0, null, null, 63));
        sb.append(" || Center = (");
        long j = this.center;
        sb.append(PointKt.m1133getXDnnuFBc(j));
        sb.append(", ");
        sb.append(PointKt.m1134getYDnnuFBc(j));
        sb.append(")]");
        return sb.toString();
    }
}

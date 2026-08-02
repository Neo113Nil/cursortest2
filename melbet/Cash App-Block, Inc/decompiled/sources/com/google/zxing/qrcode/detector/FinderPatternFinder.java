package com.google.zxing.qrcode.detector;

import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class FinderPatternFinder {
    public static final EstimatedModuleComparator moduleComparator = new EstimatedModuleComparator();
    public boolean hasSkipped;
    public final BitMatrix image;
    public final ArrayList possibleCenters = new ArrayList();
    public final int[] crossCheckStateCount = new int[5];

    public final class EstimatedModuleComparator implements Comparator, Serializable {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((FinderPattern) obj).estimatedModuleSize, ((FinderPattern) obj2).estimatedModuleSize);
        }
    }

    public FinderPatternFinder(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    public static float centerFromEnd(int i, int[] iArr) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean foundPatternCross(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 5) {
                int i3 = iArr[i];
                if (i3 == 0) {
                    break;
                }
                i2 += i3;
                i++;
            } else if (i2 >= 7) {
                float f = i2 / 7.0f;
                float f2 = f / 2.0f;
                if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double squaredDistance(FinderPattern finderPattern, FinderPattern finderPattern2) {
        double d = finderPattern.x - finderPattern2.x;
        double d2 = finderPattern.y - finderPattern2.y;
        return (d2 * d2) + (d * d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handlePossibleCenter(int i, int i2, int[] iArr) {
        char c;
        float centerFromEnd;
        char c2;
        boolean z;
        ArrayList arrayList;
        FinderPattern finderPattern;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        boolean z2 = false;
        char c3 = 2;
        char c4 = 3;
        int i6 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int centerFromEnd2 = (int) centerFromEnd(i2, iArr);
        int i7 = iArr[2];
        BitMatrix bitMatrix = this.image;
        int i8 = bitMatrix.height;
        int i9 = bitMatrix.width;
        int[] iArr2 = this.crossCheckStateCount;
        Arrays.fill(iArr2, 0);
        int i10 = i;
        while (i10 >= 0 && bitMatrix.get(centerFromEnd2, i10)) {
            iArr2[2] = iArr2[2] + 1;
            i10--;
        }
        float f3 = Float.NaN;
        if (i10 < 0) {
            c = 2;
        } else {
            while (i10 >= 0 && !bitMatrix.get(centerFromEnd2, i10)) {
                c = c3;
                int i11 = iArr2[1];
                if (i11 > i7) {
                    break;
                }
                iArr2[1] = i11 + 1;
                i10--;
                c3 = c;
            }
            c = c3;
            if (i10 >= 0 && iArr2[1] <= i7) {
                while (i10 >= 0 && bitMatrix.get(centerFromEnd2, i10)) {
                    int i12 = iArr2[0];
                    if (i12 > i7) {
                        break;
                    }
                    iArr2[0] = i12 + 1;
                    i10--;
                }
                if (iArr2[0] <= i7) {
                    int i13 = i + 1;
                    while (i13 < i8 && bitMatrix.get(centerFromEnd2, i13)) {
                        iArr2[c] = iArr2[c] + 1;
                        i13++;
                    }
                    if (i13 != i8) {
                        while (i13 < i8 && !bitMatrix.get(centerFromEnd2, i13)) {
                            int i14 = iArr2[3];
                            if (i14 >= i7) {
                                break;
                            }
                            iArr2[3] = i14 + 1;
                            i13++;
                        }
                        if (i13 != i8 && iArr2[3] < i7) {
                            while (i13 < i8 && bitMatrix.get(centerFromEnd2, i13)) {
                                int i15 = iArr2[4];
                                if (i15 >= i7) {
                                    break;
                                }
                                iArr2[4] = i15 + 1;
                                i13++;
                            }
                            int i16 = iArr2[4];
                            if (i16 < i7 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[3]) + i16) - i6) * 5 < i6 * 2 && foundPatternCross(iArr2)) {
                                centerFromEnd = centerFromEnd(i13, iArr2);
                                if (!Float.isNaN(centerFromEnd)) {
                                    int i17 = (int) centerFromEnd;
                                    int i18 = iArr[c];
                                    Arrays.fill(iArr2, 0);
                                    int i19 = centerFromEnd2;
                                    while (i19 >= 0 && bitMatrix.get(i19, i17)) {
                                        iArr2[c] = iArr2[c] + 1;
                                        i19--;
                                    }
                                    if (i19 < 0) {
                                        c2 = 3;
                                    } else {
                                        while (i19 >= 0 && !bitMatrix.get(i19, i17)) {
                                            c2 = c4;
                                            int i20 = iArr2[1];
                                            if (i20 > i18) {
                                                break;
                                            }
                                            iArr2[1] = i20 + 1;
                                            i19--;
                                            c4 = c2;
                                        }
                                        c2 = c4;
                                        if (i19 >= 0 && iArr2[1] <= i18) {
                                            while (i19 >= 0 && bitMatrix.get(i19, i17)) {
                                                int i21 = iArr2[0];
                                                if (i21 > i18) {
                                                    break;
                                                }
                                                iArr2[0] = i21 + 1;
                                                i19--;
                                            }
                                            if (iArr2[0] <= i18) {
                                                int i22 = centerFromEnd2 + 1;
                                                while (i22 < i9 && bitMatrix.get(i22, i17)) {
                                                    iArr2[c] = iArr2[c] + 1;
                                                    i22++;
                                                }
                                                if (i22 != i9) {
                                                    while (i22 < i9 && !bitMatrix.get(i22, i17)) {
                                                        int i23 = iArr2[c2];
                                                        if (i23 >= i18) {
                                                            break;
                                                        }
                                                        iArr2[c2] = i23 + 1;
                                                        i22++;
                                                    }
                                                    if (i22 != i9 && iArr2[c2] < i18) {
                                                        while (i22 < i9 && bitMatrix.get(i22, i17)) {
                                                            int i24 = iArr2[4];
                                                            if (i24 >= i18) {
                                                                break;
                                                            }
                                                            iArr2[4] = i24 + 1;
                                                            i22++;
                                                        }
                                                        int i25 = iArr2[4];
                                                        if (i25 < i18 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c]) + iArr2[c2]) + i25) - i6) * 5 < i6 && foundPatternCross(iArr2)) {
                                                            f3 = centerFromEnd(i22, iArr2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!Float.isNaN(f3)) {
                                        int i26 = (int) f3;
                                        Arrays.fill(iArr2, 0);
                                        int i27 = 0;
                                        while (i17 >= i27 && i26 >= i27 && bitMatrix.get(i26 - i27, i17 - i27)) {
                                            iArr2[c] = iArr2[c] + 1;
                                            i27++;
                                        }
                                        if (iArr2[c] != 0) {
                                            while (i17 >= i27 && i26 >= i27 && !bitMatrix.get(i26 - i27, i17 - i27)) {
                                                iArr2[1] = iArr2[1] + 1;
                                                i27++;
                                            }
                                            if (iArr2[1] != 0) {
                                                while (i17 >= i27 && i26 >= i27 && bitMatrix.get(i26 - i27, i17 - i27)) {
                                                    iArr2[0] = iArr2[0] + 1;
                                                    i27++;
                                                }
                                                if (iArr2[0] != 0) {
                                                    int i28 = bitMatrix.height;
                                                    int i29 = 1;
                                                    while (true) {
                                                        int i30 = i17 + i29;
                                                        z = z2;
                                                        if (i30 >= i28 || (i5 = i26 + i29) >= i9 || !bitMatrix.get(i5, i30)) {
                                                            break;
                                                        }
                                                        iArr2[c] = iArr2[c] + 1;
                                                        i29++;
                                                        z2 = z ? 1 : 0;
                                                    }
                                                    while (true) {
                                                        int i31 = i17 + i29;
                                                        if (i31 >= i28 || (i4 = i26 + i29) >= i9 || bitMatrix.get(i4, i31)) {
                                                            break;
                                                        }
                                                        iArr2[c2] = iArr2[c2] + 1;
                                                        i29++;
                                                    }
                                                    if (iArr2[c2] == 0) {
                                                        return z;
                                                    }
                                                    while (true) {
                                                        int i32 = i17 + i29;
                                                        if (i32 >= i28 || (i3 = i26 + i29) >= i9 || !bitMatrix.get(i3, i32)) {
                                                            break;
                                                        }
                                                        iArr2[4] = iArr2[4] + 1;
                                                        i29++;
                                                    }
                                                    if (iArr2[4] == 0) {
                                                        return z;
                                                    }
                                                    int i33 = z ? 1 : 0;
                                                    int i34 = i33;
                                                    while (i33 < 5) {
                                                        int i35 = iArr2[i33];
                                                        if (i35 == 0) {
                                                            return z;
                                                        }
                                                        i34 += i35;
                                                        i33++;
                                                    }
                                                    if (i34 < 7) {
                                                        return z;
                                                    }
                                                    float f4 = i34 / 7.0f;
                                                    float f5 = f4 / 1.333f;
                                                    if (Math.abs(f4 - iArr2[z ? 1 : 0]) >= f5 || Math.abs(f4 - iArr2[1]) >= f5 || Math.abs((f4 * 3.0f) - iArr2[c]) >= 3.0f * f5 || Math.abs(f4 - iArr2[c2]) >= f5 || Math.abs(f4 - iArr2[4]) >= f5) {
                                                        return z;
                                                    }
                                                    float f6 = i6 / 7.0f;
                                                    int i36 = z ? 1 : 0;
                                                    while (true) {
                                                        arrayList = this.possibleCenters;
                                                        if (i36 >= arrayList.size()) {
                                                            arrayList.add(new FinderPattern(f3, centerFromEnd, f6, 1));
                                                            return true;
                                                        }
                                                        finderPattern = (FinderPattern) arrayList.get(i36);
                                                        float f7 = finderPattern.estimatedModuleSize;
                                                        f = finderPattern.x;
                                                        f2 = finderPattern.y;
                                                        if (Math.abs(centerFromEnd - f2) <= f6 && Math.abs(f3 - f) <= f6) {
                                                            float abs = Math.abs(f6 - f7);
                                                            if (abs <= 1.0f || abs <= f7) {
                                                                break;
                                                            }
                                                        }
                                                        i36++;
                                                    }
                                                    int i37 = finderPattern.count;
                                                    int i38 = i37 + 1;
                                                    float f8 = i37;
                                                    float f9 = i38;
                                                    arrayList.set(i36, new FinderPattern(((f * f8) + f3) / f9, ((f2 * f8) + centerFromEnd) / f9, ((f8 * finderPattern.estimatedModuleSize) + f6) / f9, i38));
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        centerFromEnd = Float.NaN;
        if (!Float.isNaN(centerFromEnd)) {
        }
        return false;
    }

    public final boolean haveMultiplyConfirmedCenters() {
        ArrayList arrayList = this.possibleCenters;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f = RecyclerView.DECELERATION_RATE;
        int i = 0;
        float f2 = 0.0f;
        while (it.hasNext()) {
            FinderPattern finderPattern = (FinderPattern) it.next();
            if (finderPattern.count >= 2) {
                i++;
                f2 += finderPattern.estimatedModuleSize;
            }
        }
        if (i >= 3) {
            float f3 = f2 / size;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f += Math.abs(((FinderPattern) it2.next()).estimatedModuleSize - f3);
            }
            if (f <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}

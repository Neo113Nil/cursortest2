package com.miteksystems.misnap.controller.a;

import android.graphics.Rect;
import android.util.Log;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.ExtractedDataCorners;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.MrzData;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public abstract class w {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(b0 b0Var) {
        ExtractedDataCorners extractedDataCorners;
        int[][][] iArr;
        char c;
        Integer num;
        Rect rect;
        boolean z;
        double d;
        Rect rect2;
        Object obj;
        boolean z2;
        EmptyList emptyList;
        int i = 1;
        char c2 = 0;
        b0Var.getClass();
        ArrayList arrayList = new ArrayList();
        if (b0Var instanceof j) {
            j jVar = (j) b0Var;
            int[][] iArr2 = jVar.d;
            DocumentExtraction documentExtraction = jVar.f;
            if (documentExtraction != null && (extractedDataCorners = documentExtraction.c) != null && (iArr = extractedDataCorners.a) != null) {
                if (a(jVar)) {
                    if (iArr.length == 0) {
                        c = 0;
                        emptyList = EmptyList.INSTANCE;
                    } else {
                        try {
                            Result.Companion companion = Result.Companion;
                            ArrayList arrayList2 = new ArrayList(iArr.length);
                            int length = iArr.length;
                            int i2 = 0;
                            while (i2 < length) {
                                int[][] iArr3 = iArr[i2];
                                if (iArr3.length == 0) {
                                    throw new NoSuchElementException();
                                }
                                int i3 = iArr3[c2][c2];
                                IntProgressionIterator it = new IntRange(i, iArr3.length - i, i).iterator();
                                while (it.hasNext) {
                                    int i4 = iArr3[it.nextInt()][c2];
                                    if (i3 > i4) {
                                        i3 = i4;
                                    }
                                }
                                if (iArr3.length == 0) {
                                    throw new NoSuchElementException();
                                }
                                int i5 = iArr3[c2][i];
                                IntProgressionIterator it2 = new IntRange(i, iArr3.length - i, i).iterator();
                                while (it2.hasNext) {
                                    int i6 = iArr3[it2.nextInt()][i];
                                    if (i5 < i6) {
                                        i5 = i6;
                                    }
                                }
                                if (iArr3.length == 0) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = iArr3[c2][c2];
                                c = c2;
                                try {
                                    IntProgressionIterator it3 = new IntRange(i, iArr3.length - i, i).iterator();
                                    while (it3.hasNext) {
                                        int i8 = iArr3[it3.nextInt()][c == true ? 1 : 0];
                                        if (i7 < i8) {
                                            i7 = i8;
                                        }
                                    }
                                    if (iArr3.length == 0) {
                                        throw new NoSuchElementException();
                                    }
                                    int i9 = iArr3[c == true ? 1 : 0][i];
                                    int i10 = i;
                                    IntProgressionIterator it4 = new IntRange(i10, iArr3.length - 1, i10).iterator();
                                    int i11 = i9;
                                    while (it4.hasNext) {
                                        int i12 = iArr3[it4.nextInt()][1];
                                        if (i11 > i12) {
                                            i11 = i12;
                                        }
                                    }
                                    arrayList2.add(new Rect(i3, i5, i7, i11));
                                    i2++;
                                    c2 = c == true ? 1 : 0;
                                    i = 1;
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion2 = Result.Companion;
                                    obj = new Result.Failure(th);
                                    Object obj2 = EmptyList.INSTANCE;
                                    Result.Companion companion3 = Result.Companion;
                                    z2 = obj instanceof Result.Failure;
                                    Object obj3 = obj;
                                    if (z2) {
                                    }
                                    emptyList = (List) obj3;
                                    arrayList.addAll(emptyList);
                                    if (b(jVar)) {
                                    }
                                    if (c(jVar)) {
                                    }
                                    return arrayList;
                                }
                            }
                            c = c2;
                            obj = arrayList2;
                        } catch (Throwable th2) {
                            th = th2;
                            c = c2;
                        }
                        Object obj22 = EmptyList.INSTANCE;
                        Result.Companion companion32 = Result.Companion;
                        z2 = obj instanceof Result.Failure;
                        Object obj32 = obj;
                        if (z2) {
                            obj32 = obj22;
                        }
                        emptyList = (List) obj32;
                    }
                    arrayList.addAll(emptyList);
                } else {
                    c = 0;
                }
                if (b(jVar)) {
                    num = 1;
                } else {
                    try {
                        boolean z3 = Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[1][c] - ((int[][]) ArraysKt___ArraysKt.last(iArr))[1][c]) <= Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[1][1] - ((int[][]) ArraysKt___ArraysKt.last(iArr))[1][1]) ? true : c;
                        Integer[] numArr = !z3 ? new Integer[]{0, 1} : new Integer[]{1, 0};
                        int intValue = numArr[c].intValue();
                        int intValue2 = numArr[1].intValue();
                        int a = a(iArr2[1], (int[][]) ArraysKt___ArraysKt.first(iArr), true, intValue, intValue2);
                        int a2 = a(((int[][]) ArraysKt___ArraysKt.first(iArr))[a], (int[][]) ArraysKt___ArraysKt.first(iArr), c, intValue, intValue2);
                        boolean z4 = ((int[][]) ArraysKt___ArraysKt.first(iArr))[a][intValue2] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a2][intValue2] < 0;
                        boolean z5 = ((int[][]) ArraysKt___ArraysKt.first(iArr))[a][intValue] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a2][intValue] < 0;
                        int abs = Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[a][intValue2] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a2][intValue2]);
                        int i13 = ((int[][]) ArraysKt___ArraysKt.first(iArr))[a][intValue2];
                        int i14 = !z5 ? ((int[][]) ArraysKt___ArraysKt.first(iArr))[a2][intValue] : ((int[][]) ArraysKt___ArraysKt.last(iArr))[a][intValue];
                        int abs2 = Math.abs((!z5 ? ((int[][]) ArraysKt___ArraysKt.last(iArr))[a][intValue] : ((int[][]) ArraysKt___ArraysKt.first(iArr))[a2][intValue]) - i14) * 2;
                        int i15 = abs2 / 30;
                        int i16 = !z5 ? (i14 - (abs2 / 2)) + i15 : (i14 + abs2) - i15;
                        int i17 = i15 * 5;
                        int i18 = !z5 ? i17 + i16 : i16 - i17;
                        if (z4) {
                            z = z3;
                            num = 1;
                            d = i13 - (abs * 2.5d);
                        } else {
                            num = 1;
                            z = z3;
                            d = (abs * 2.5d) + i13;
                        }
                        int i19 = (int) d;
                        int i20 = abs * 5;
                        int i21 = !z4 ? i20 + i19 : i19 - i20;
                        try {
                            rect = !z ? new Rect(i16, i21, i18, i19) : new Rect(i19, i16, i21, i18);
                        } catch (Exception e) {
                            e = e;
                            Log.e("RedactionUtil", "Error getting the BSN QR corners", e);
                            rect = null;
                            if (rect != null) {
                            }
                            if (c(jVar)) {
                            }
                            return arrayList;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        num = 1;
                    }
                    if (rect != null) {
                        arrayList.add(rect);
                    }
                }
                if (c(jVar)) {
                    try {
                        boolean z6 = Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[1][0] - ((int[][]) ArraysKt___ArraysKt.last(iArr))[1][0]) <= Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[1][1] - ((int[][]) ArraysKt___ArraysKt.last(iArr))[1][1]);
                        Integer[] numArr2 = !z6 ? new Integer[]{0, num} : new Integer[]{num, 0};
                        int intValue3 = numArr2[0].intValue();
                        boolean z7 = true;
                        int intValue4 = numArr2[1].intValue();
                        int a3 = a(iArr2[1], (int[][]) ArraysKt___ArraysKt.first(iArr), true, intValue3, intValue4);
                        int a4 = a(((int[][]) ArraysKt___ArraysKt.first(iArr))[a3], (int[][]) ArraysKt___ArraysKt.first(iArr), false, intValue3, intValue4);
                        boolean z8 = ((int[][]) ArraysKt___ArraysKt.first(iArr))[a3][intValue4] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a4][intValue4] < 0;
                        if (((int[][]) ArraysKt___ArraysKt.first(iArr))[a3][intValue3] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a4][intValue3] >= 0) {
                            z7 = false;
                        }
                        int abs3 = Math.abs(((int[][]) ArraysKt___ArraysKt.first(iArr))[a3][intValue4] - ((int[][]) ArraysKt___ArraysKt.first(iArr))[a4][intValue4]);
                        int i22 = ((int[][]) ArraysKt___ArraysKt.first(iArr))[a3][intValue4];
                        int i23 = !z7 ? iArr[7][a4][intValue3] : ((int[][]) ArraysKt___ArraysKt.last(iArr))[a3][intValue3];
                        int i24 = !z7 ? ((int[][]) ArraysKt___ArraysKt.last(iArr))[a3][intValue3] : iArr[7][a4][intValue3];
                        int i25 = abs3 * 8;
                        int i26 = !z8 ? i25 + i22 : i22 - i25;
                        int i27 = abs3 * 5;
                        int i28 = !z8 ? i27 + i26 : i26 - i27;
                        rect2 = !z6 ? new Rect(i23, i28, i24, i26) : new Rect(i26, i23, i28, i24);
                    } catch (Exception e3) {
                        Log.e("RedactionUtil", "Error getting the top-right corner BSN", e3);
                        rect2 = null;
                    }
                    if (rect2 != null) {
                        arrayList.add(rect2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean b(j jVar) {
        Object failure;
        DocumentExtraction documentExtraction = jVar.f;
        boolean z = false;
        if (!b(documentExtraction != null ? documentExtraction.a : null)) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            DocumentExtraction documentExtraction2 = jVar.f;
            Mrz mrz = documentExtraction2 != null ? documentExtraction2.a : null;
            mrz.getClass();
            MrzData mrzData = (MrzData) mrz;
            String str = mrzData.g;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!CharsKt.isWhitespace(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            if (StringsKt__StringsJVMKt.startsWith(mrzData.f, "I", false)) {
                String obj = sb2.subSequence(0, 9).toString();
                Regex regex = ValidationUtil.a;
                obj.getClass();
                if (!ValidationUtil.c.matches(obj)) {
                    z = true;
                }
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object obj2 = Boolean.FALSE;
        Result.Companion companion3 = Result.Companion;
        if (failure instanceof Result.Failure) {
            failure = obj2;
        }
        return ((Boolean) failure).booleanValue();
    }

    public static boolean c(j jVar) {
        Object failure;
        DocumentExtraction documentExtraction = jVar.f;
        if (!b(documentExtraction != null ? documentExtraction.a : null)) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            DocumentExtraction documentExtraction2 = jVar.f;
            Mrz mrz = documentExtraction2 != null ? documentExtraction2.a : null;
            mrz.getClass();
            failure = Boolean.valueOf(StringsKt__StringsJVMKt.startsWith(((MrzData) mrz).f, "I", false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    public static boolean b(Mrz mrz) {
        if (!(mrz instanceof MrzData)) {
            return false;
        }
        MrzData mrzData = (MrzData) mrz;
        return Intrinsics.areEqual(mrzData.e, "NLD") && a(mrzData.f);
    }

    public static int a(int[] iArr, int[][] iArr2, boolean z, int i, int i2) {
        float f = z ? Float.MAX_VALUE : Float.MIN_VALUE;
        int length = iArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr3 = iArr2[i3];
            int i6 = i5 + 1;
            float sqrt = (float) Math.sqrt(((float) Math.pow(Math.abs(iArr[i] - iArr3[i]), 2.0d)) + ((float) Math.pow(Math.abs(iArr[i2] - iArr3[i2]), 2.0d)));
            if ((z && sqrt < f) || (!z && sqrt > f)) {
                i4 = i5;
                f = sqrt;
            }
            i3++;
            i5 = i6;
        }
        return i4;
    }

    public static boolean a(String str) {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"IR", "IT", "IW"});
        List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"P", "I"});
        if (!(listOf instanceof Collection) || !listOf.isEmpty()) {
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsJVMKt.startsWith(str, (String) it.next(), false)) {
                    break;
                }
            }
        }
        if (!(listOf2 instanceof Collection) || !listOf2.isEmpty()) {
            Iterator it2 = listOf2.iterator();
            while (it2.hasNext()) {
                if (StringsKt__StringsJVMKt.startsWith(str, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean a(b0 b0Var, MiSnapSettings miSnapSettings) {
        b0Var.getClass();
        miSnapSettings.getClass();
        if (!(b0Var instanceof j) || !DocumentAnalysisSettings.shouldRedactOptionalData(miSnapSettings.analysis.document)) {
            return false;
        }
        j jVar = (j) b0Var;
        DocumentExtraction documentExtraction = jVar.f;
        if (b(documentExtraction != null ? documentExtraction.a : null)) {
            return a(jVar) || b(jVar) || c(jVar);
        }
        return false;
    }

    public static final boolean a(j jVar) {
        Object failure;
        jVar.getClass();
        DocumentExtraction documentExtraction = jVar.f;
        if (!b(documentExtraction != null ? documentExtraction.a : null)) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            Mrz mrz = documentExtraction != null ? documentExtraction.a : null;
            mrz.getClass();
            String str = ((MrzData) mrz).g;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!CharsKt.isWhitespace(charAt)) {
                    sb.append(charAt);
                }
            }
            String obj = sb.toString().subSequence(0, 9).toString();
            Regex regex = ValidationUtil.a;
            obj.getClass();
            failure = Boolean.valueOf(ValidationUtil.c.matches(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Object obj2 = Boolean.FALSE;
        Result.Companion companion3 = Result.Companion;
        if (failure instanceof Result.Failure) {
            failure = obj2;
        }
        return ((Boolean) failure).booleanValue();
    }
}

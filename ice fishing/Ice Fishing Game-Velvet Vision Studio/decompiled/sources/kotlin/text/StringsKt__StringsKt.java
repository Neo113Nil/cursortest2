package kotlin.text;

import com.gamericefishpro.space.li.l;
import com.gamericefishpro.space.ph.u;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class StringsKt__StringsKt extends d {
    public static final int k(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int l(CharSequence charSequence, String string, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? m(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int m(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.a aVar;
        if (z2) {
            int iK = k(charSequence);
            if (i > iK) {
                i = iK;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            kotlin.ranges.a.v.getClass();
            aVar = new kotlin.ranges.a(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            aVar = new IntRange(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = aVar.i;
        int i4 = aVar.e;
        int i5 = aVar.d;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (o(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (d.h(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int n(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return l(charSequence, str, i, false);
    }

    public static final boolean o(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        char upperCase;
        char upperCase2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= other.length() - i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                char cCharAt = charSequence.charAt(i + i4);
                char cCharAt2 = other.charAt(i2 + i4);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void p(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, boolean z, int i, int i2, Object obj) {
        int length = 0;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        int i3 = 10;
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                p(i);
                int iL = l(charSequence, str, 0, z);
                if (iL == -1 || i == 1) {
                    return w.c(charSequence.toString());
                }
                boolean z2 = i > 0;
                if (z2 && i <= 10) {
                    i3 = i;
                }
                ArrayList arrayList = new ArrayList(i3);
                do {
                    arrayList.add(charSequence.subSequence(length, iL).toString());
                    length = str.length() + iL;
                    if (z2 && arrayList.size() == i - 1) {
                        break;
                    }
                    iL = l(charSequence, str, length, z);
                } while (iL != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        p(i);
        com.gamericefishpro.space.mi.a aVar = new com.gamericefishpro.space.mi.a(charSequence, i, new e(u.b(delimiters), z));
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        l lVar = new l(aVar);
        ArrayList arrayList2 = new ArrayList(y.j(lVar, 10));
        Iterator it = lVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            IntRange range = (IntRange) bVar.next();
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList2.add(charSequence.subSequence(range.d, range.e + 1).toString());
        }
    }
}

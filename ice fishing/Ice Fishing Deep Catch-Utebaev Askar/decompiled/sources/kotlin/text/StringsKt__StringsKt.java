package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public class StringsKt__StringsKt extends o {
    public static final int f(int i2, CharSequence charSequence, String string, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        IntRange intRange = new IntRange(i2, length);
        boolean z2 = charSequence instanceof String;
        int i3 = intRange.f215c;
        int i4 = intRange.f214b;
        if (z2 && (string instanceof String)) {
            if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                while (!o.c(string, 0, (String) charSequence, i2, string.length(), z)) {
                    if (i2 != i4) {
                        i2 += i3;
                    }
                }
                return i2;
            }
        } else if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
            while (!g(string, charSequence, i2, string.length(), z)) {
                if (i2 != i4) {
                    i2 += i3;
                }
            }
            return i2;
        }
        return -1;
    }

    public static final boolean g(CharSequence charSequence, CharSequence other, int i2, int i3, boolean z) {
        char upperCase;
        char upperCase2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || charSequence.length() - i3 < 0 || i2 > other.length() - i3) {
            return false;
        }
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 >= i3) {
                return true;
            }
            char cCharAt = charSequence.charAt(0 + i4);
            char cCharAt2 = other.charAt(i2 + i4);
            if (cCharAt != cCharAt2 && (!z || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i4++;
        }
    }

    public static final void h(int i2) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, boolean z, int i2, int i3, Object obj) {
        int length = 0;
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (!(str.length() == 0)) {
                h(i2);
                int iF = f(0, charSequence, str, z);
                if (iF == -1 || i2 == 1) {
                    return kotlin.collections.n.a(charSequence.toString());
                }
                boolean z2 = i2 > 0;
                int i4 = 10;
                if (z2 && i2 <= 10) {
                    i4 = i2;
                }
                ArrayList arrayList = new ArrayList(i4);
                do {
                    arrayList.add(charSequence.subSequence(length, iF).toString());
                    length = str.length() + iF;
                    if (z2 && arrayList.size() == i2 - 1) {
                        break;
                    }
                    iF = f(length, charSequence, str, z);
                } while (iF != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        h(i2);
        Intrinsics.checkNotNullParameter(delimiters, "<this>");
        List listAsList = Arrays.asList(delimiters);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(this)");
        c cVar = new c(charSequence, 0, i2, new p(listAsList, z));
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        p.e<IntRange> eVar = new p.e(cVar);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.c(eVar));
        for (IntRange range : eVar) {
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList2.add(charSequence.subSequence(Integer.valueOf(range.f213a).intValue(), Integer.valueOf(range.f214b).intValue() + 1).toString());
        }
        return arrayList2;
    }
}

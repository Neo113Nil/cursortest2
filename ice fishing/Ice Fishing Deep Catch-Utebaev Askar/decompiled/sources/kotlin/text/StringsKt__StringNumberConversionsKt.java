package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public class StringsKt__StringNumberConversionsKt extends n {
    public static Integer toIntOrNull(String str) {
        byte b2;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char cCharAt = str.charAt(0);
            int i4 = 1;
            if (cCharAt < '0') {
                b2 = -1;
            } else {
                b2 = cCharAt == '0' ? (byte) 0 : (byte) 1;
            }
            int i5 = -2147483647;
            if (b2 >= 0) {
                z = false;
                i4 = 0;
            } else if (length != 1) {
                if (cCharAt == '-') {
                    i5 = Integer.MIN_VALUE;
                    z = true;
                } else if (cCharAt == '+') {
                    z = false;
                }
            }
            int i6 = -59652323;
            while (i4 < length) {
                int iDigit = Character.digit((int) str.charAt(i4), 10);
                if (iDigit >= 0 && ((i3 >= i6 || (i6 == -59652323 && i3 >= (i6 = i5 / 10))) && (i2 = i3 * 10) >= i5 + iDigit)) {
                    i3 = i2 - iDigit;
                    i4++;
                }
            }
            return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
        }
        return null;
    }
}

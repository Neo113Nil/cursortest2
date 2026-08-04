package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class Charsets {
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charsets f186a = new Charsets();

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
        UTF_8 = charsetForName;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}

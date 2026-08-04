package kotlin.ranges;

import kotlin.Metadata;
import n.b;
import n.d;

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
public final class IntRange extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f183e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntRange f184f = new IntRange(1, 0);

    public IntRange(int i2, int i3) {
        super(i2, i3, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntRange) {
            if (!isEmpty() || !((IntRange) obj).isEmpty()) {
                IntRange intRange = (IntRange) obj;
                if (this.f213a == intRange.f213a) {
                    if (this.f214b == intRange.f214b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f213a * 31) + this.f214b;
    }

    public final boolean isEmpty() {
        return this.f213a > this.f214b;
    }

    public final String toString() {
        return this.f213a + ".." + this.f214b;
    }
}

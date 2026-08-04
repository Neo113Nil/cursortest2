package com.gamericefishpro.space.b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.gamericefishpro.space.h2.w0;
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
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class a0 extends w0 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public a0(Object obj, com.gamericefishpro.space.d9.h hVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        hVar = (i & 2) != 0 ? null : hVar;
        this.a = obj;
        this.b = hVar;
        this.c = pointerInputEventHandler;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new f0(this.a, this.b, this.c);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        f0 f0Var = (f0) lVar;
        Object obj = f0Var.H;
        Object obj2 = this.a;
        boolean z = !Intrinsics.a(obj, obj2);
        f0Var.H = obj2;
        Object obj3 = f0Var.I;
        Object obj4 = this.b;
        if (!Intrinsics.a(obj3, obj4)) {
            z = true;
        }
        f0Var.I = obj4;
        Class<?> cls = f0Var.J.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            f0Var.B0();
        }
        f0Var.J = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.a, a0Var.a) && Intrinsics.a(this.b, a0Var.b) && this.c == a0Var.c;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}

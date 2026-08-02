package com.miteksystems.misnap.document;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;
import net.oneformapp.schema.SchemaFactory;

/* loaded from: classes4.dex */
public abstract class MiSnapDocumentAnalyzer$Result$Failure extends SchemaFactory {

    public final class ImageFormat extends MiSnapDocumentAnalyzer$Result$Failure {
        public static final ImageFormat INSTANCE = new ImageFormat();
        public static final ImageFormat INSTANCE$1 = new ImageFormat();
    }

    public final class License extends MiSnapDocumentAnalyzer$Result$Failure {
        public final String a;

        public License(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof License) && Intrinsics.areEqual(this.a, ((License) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("License(reason="), this.a, ')');
        }
    }
}

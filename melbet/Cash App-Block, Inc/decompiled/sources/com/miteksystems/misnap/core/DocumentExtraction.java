package com.miteksystems.misnap.core;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DocumentExtraction {
    public static final Companion Companion = new Companion();
    public final Mrz a;
    public final DocumentData b;
    public final ExtractedDataCorners c;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/DocumentExtraction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/DocumentExtraction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return DocumentExtraction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DocumentExtraction(int i, Mrz mrz, DocumentData documentData, ExtractedDataCorners extractedDataCorners) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mrz;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = documentData;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = extractedDataCorners;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentExtraction)) {
            return false;
        }
        DocumentExtraction documentExtraction = (DocumentExtraction) obj;
        return Intrinsics.areEqual(this.a, documentExtraction.a) && Intrinsics.areEqual(this.b, documentExtraction.b) && Intrinsics.areEqual(this.c, documentExtraction.c);
    }

    public final int hashCode() {
        Mrz mrz = this.a;
        int hashCode = (mrz == null ? 0 : mrz.hashCode()) * 31;
        DocumentData documentData = this.b;
        int hashCode2 = (hashCode + (documentData == null ? 0 : documentData.hashCode())) * 31;
        ExtractedDataCorners extractedDataCorners = this.c;
        return hashCode2 + (extractedDataCorners != null ? Arrays.hashCode(extractedDataCorners.a) : 0);
    }

    public final String toString() {
        return "DocumentExtraction(mrz=" + this.a + ", extractedData=" + this.b + ", extractedDataCorners=" + this.c + ')';
    }

    public DocumentExtraction(Mrz mrz, DocumentData documentData, ExtractedDataCorners extractedDataCorners) {
        this.a = mrz;
        this.b = documentData;
        this.c = extractedDataCorners;
    }
}

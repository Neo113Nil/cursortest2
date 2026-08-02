package com.miteksystems.misnap.core;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentClassification;", "", "Companion", "$serializer", "Type", "core_release"}, k = 1, mv = {1, 8, 0})
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class DocumentClassification {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final Type a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentClassification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/DocumentClassification;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return DocumentClassification$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type UNKNOWN;
        public static final /* synthetic */ Type[] a;

        static {
            Type type2 = new Type("UNKNOWN", 0);
            UNKNOWN = type2;
            a = new Type[]{type2, new Type("ID_FRONT", 1), new Type("ID_BACK", 2), new Type("DL_FRONT", 3), new Type("DL_BACK", 4), new Type("RP_FRONT", 5), new Type("PASSPORT", 6), new Type("PASSPORT_CARD", 7), new Type("GENERIC_FRONT", 8), new Type("GENERIC_BACK", 9), new Type("EDUCATION_ID", 10), new Type("GIFT_CARD", 11), new Type("HEALTH_INSURANCE", 12), new Type("LIBRARY_CARD", 13)};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) a.clone();
        }
    }

    public /* synthetic */ DocumentClassification(int i, Type type2) {
        if (1 == (i & 1)) {
            this.a = type2;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, DocumentClassification$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocumentClassification) && this.a == ((DocumentClassification) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentClassification(documentType=" + this.a + ')';
    }

    public DocumentClassification(Type type2) {
        this.a = type2;
    }
}

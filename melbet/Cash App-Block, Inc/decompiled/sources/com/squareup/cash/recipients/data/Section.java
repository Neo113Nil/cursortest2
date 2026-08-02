package com.squareup.cash.recipients.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Section {
    public final List recipients;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1192type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type CONTACTS;
        public static final Type RESULTS;
        public static final Type SUGGESTED;

        static {
            Type type2 = new Type("SUGGESTED", 0);
            SUGGESTED = type2;
            Type type3 = new Type("CONTACTS", 1);
            CONTACTS = type3;
            Type type4 = new Type("RESULTS", 2);
            RESULTS = type4;
            $VALUES = new Type[]{type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Section(Type type2, List list) {
        list.getClass();
        this.f1192type = type2;
        this.recipients = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return this.f1192type == section.f1192type && Intrinsics.areEqual(this.recipients, section.recipients);
    }

    public final int hashCode() {
        return this.recipients.hashCode() + (this.f1192type.hashCode() * 31);
    }

    public final String toString() {
        return "Section(type=" + this.f1192type + ", recipients=" + this.recipients + ")";
    }
}

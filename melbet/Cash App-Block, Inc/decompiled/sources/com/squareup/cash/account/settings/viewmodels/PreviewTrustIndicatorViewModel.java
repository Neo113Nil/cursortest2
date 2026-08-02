package com.squareup.cash.account.settings.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PreviewTrustIndicatorViewModel {
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1040type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type IN_CONTACTS;
        public static final Type JOINED;
        public static final Type PAID_BY_PEOPLE_YOU_KNOW;

        static {
            Type type2 = new Type("JOINED", 0);
            JOINED = type2;
            Type type3 = new Type("PAID_BY_PEOPLE_YOU_KNOW", 1);
            PAID_BY_PEOPLE_YOU_KNOW = type3;
            Type type4 = new Type("IN_CONTACTS", 2);
            IN_CONTACTS = type4;
            $VALUES = new Type[]{type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public PreviewTrustIndicatorViewModel(Type type2, String str) {
        str.getClass();
        this.f1040type = type2;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewTrustIndicatorViewModel)) {
            return false;
        }
        PreviewTrustIndicatorViewModel previewTrustIndicatorViewModel = (PreviewTrustIndicatorViewModel) obj;
        return this.f1040type == previewTrustIndicatorViewModel.f1040type && Intrinsics.areEqual(this.title, previewTrustIndicatorViewModel.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.f1040type.hashCode() * 31);
    }

    public final String toString() {
        return "PreviewTrustIndicatorViewModel(type=" + this.f1040type + ", title=" + this.title + ")";
    }
}

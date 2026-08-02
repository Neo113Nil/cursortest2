package com.squareup.cash.recipients.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SectionViewModel {
    public final String description;
    public final String name;
    public final Integer position;
    public final List recipients;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1193type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type CONTACTS;
        public static final Type CONTACTS_OFF_CASH;
        public static final Type RESULTS;
        public static final Type SUGGESTED;

        static {
            Type type2 = new Type("SUGGESTED", 0);
            SUGGESTED = type2;
            Type type3 = new Type("CONTACTS", 1);
            CONTACTS = type3;
            Type type4 = new Type("CONTACTS_ON_CASH", 2);
            Type type5 = new Type("CONTACTS_OFF_CASH", 3);
            CONTACTS_OFF_CASH = type5;
            Type type6 = new Type("RESULTS", 4);
            RESULTS = type6;
            $VALUES = new Type[]{type2, type3, type4, type5, type6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SectionViewModel(String str, Type type2, List list, String str2, Integer num) {
        type2.getClass();
        list.getClass();
        this.name = str;
        this.f1193type = type2;
        this.recipients = list;
        this.description = str2;
        this.position = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionViewModel)) {
            return false;
        }
        SectionViewModel sectionViewModel = (SectionViewModel) obj;
        return Intrinsics.areEqual(this.name, sectionViewModel.name) && this.f1193type == sectionViewModel.f1193type && Intrinsics.areEqual(this.recipients, sectionViewModel.recipients) && Intrinsics.areEqual(this.description, sectionViewModel.description) && Intrinsics.areEqual(this.position, sectionViewModel.position);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.f1193type.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.recipients);
        String str = this.description;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.position;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionViewModel(name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.f1193type);
        sb.append(", recipients=");
        Recorder$$ExternalSyntheticOutline2.m(", description=", this.description, ", position=", sb, this.recipients);
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.position, ")");
    }
}

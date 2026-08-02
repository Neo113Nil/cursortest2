package com.squareup.cash.favorites.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SectionViewModel {
    public final List favorites;
    public final String name;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1131type;

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

    public SectionViewModel(String str, Type type2, List list) {
        str.getClass();
        this.name = str;
        this.f1131type = type2;
        this.favorites = list;
    }

    public static SectionViewModel copy$default(SectionViewModel sectionViewModel, ArrayList arrayList) {
        String str = sectionViewModel.name;
        Type type2 = sectionViewModel.f1131type;
        str.getClass();
        return new SectionViewModel(str, type2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionViewModel)) {
            return false;
        }
        SectionViewModel sectionViewModel = (SectionViewModel) obj;
        return Intrinsics.areEqual(this.name, sectionViewModel.name) && this.f1131type == sectionViewModel.f1131type && this.favorites.equals(sectionViewModel.favorites);
    }

    public final int hashCode() {
        return this.favorites.hashCode() + ((this.f1131type.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionViewModel(name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.f1131type);
        sb.append(", favorites=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.favorites, ")");
    }
}

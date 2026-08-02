package com.squareup.cash.family.requestsponsorship.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactMethod {
    public final SelectContactMethodViewEvent clickEvent;
    public final String subtitle;
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1130type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type Email;
        public static final Type Sms;

        static {
            Type type2 = new Type("Email", 0);
            Email = type2;
            Type type3 = new Type("Sms", 1);
            Sms = type3;
            $VALUES = new Type[]{type2, type3};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ContactMethod(Type type2, String str, String str2, SelectContactMethodViewEvent selectContactMethodViewEvent) {
        str.getClass();
        this.f1130type = type2;
        this.title = str;
        this.subtitle = str2;
        this.clickEvent = selectContactMethodViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactMethod)) {
            return false;
        }
        ContactMethod contactMethod = (ContactMethod) obj;
        return this.f1130type == contactMethod.f1130type && Intrinsics.areEqual(this.title, contactMethod.title) && this.subtitle.equals(contactMethod.subtitle) && this.clickEvent.equals(contactMethod.clickEvent);
    }

    public final int hashCode() {
        return this.clickEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1130type.hashCode() * 31, 31, this.title), 31, this.subtitle);
    }

    public final String toString() {
        return "ContactMethod(type=" + this.f1130type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", clickEvent=" + this.clickEvent + ")";
    }
}

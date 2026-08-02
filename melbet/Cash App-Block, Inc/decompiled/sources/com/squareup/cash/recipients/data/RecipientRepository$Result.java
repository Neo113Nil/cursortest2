package com.squareup.cash.recipients.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecipientRepository$Result {
    public final List sections;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS;

        static {
            Status status = new Status("SUCCESS", 0);
            SUCCESS = status;
            $VALUES = new Status[]{status, new Status("EMPTY_WITH_FILTERED_FAVORITE", 1)};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public RecipientRepository$Result(List list) {
        Status status = Status.SUCCESS;
        list.getClass();
        this.sections = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientRepository$Result) || !Intrinsics.areEqual(this.sections, ((RecipientRepository$Result) obj).sections)) {
            return false;
        }
        Status status = Status.SUCCESS;
        return true;
    }

    public final int hashCode() {
        return Status.SUCCESS.hashCode() + (this.sections.hashCode() * 31);
    }

    public final String toString() {
        return "Result(sections=" + this.sections + ", status=" + Status.SUCCESS + ")";
    }
}

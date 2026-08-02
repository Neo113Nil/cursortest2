package com.squareup.cash.recipients.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SectionHeaderNameAnalytics {
    public static final /* synthetic */ SectionHeaderNameAnalytics[] $VALUES = {new SectionHeaderNameAnalytics("SUGGESTED", 0), new SectionHeaderNameAnalytics("CONTACTS", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SectionHeaderNameAnalytics EF5;

    public static SectionHeaderNameAnalytics valueOf(String str) {
        return (SectionHeaderNameAnalytics) Enum.valueOf(SectionHeaderNameAnalytics.class, str);
    }

    public static SectionHeaderNameAnalytics[] values() {
        return (SectionHeaderNameAnalytics[]) $VALUES.clone();
    }
}

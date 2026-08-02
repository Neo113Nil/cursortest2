package com.squareup.cash.recipients.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Bucket {
    public static final /* synthetic */ Bucket[] $VALUES;
    public static final Bucket CONTACTS;
    public static final Bucket SEARCH;
    public static final Bucket SUGGESTED;

    static {
        Bucket bucket = new Bucket("SUGGESTED", 0);
        SUGGESTED = bucket;
        Bucket bucket2 = new Bucket("CONTACTS", 1);
        CONTACTS = bucket2;
        Bucket bucket3 = new Bucket("SEARCH", 2);
        SEARCH = bucket3;
        $VALUES = new Bucket[]{bucket, bucket2, bucket3};
    }

    public static Bucket valueOf(String str) {
        return (Bucket) Enum.valueOf(Bucket.class, str);
    }

    public static Bucket[] values() {
        return (Bucket[]) $VALUES.clone();
    }
}

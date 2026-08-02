package com.squareup.cash.recipients.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class GenerationStrategy {
    public static final /* synthetic */ GenerationStrategy[] $VALUES;
    public static final GenerationStrategy CONTACT;
    public static final GenerationStrategy FAVORITE;
    public static final GenerationStrategy NEW_CUSTOMER;
    public static final GenerationStrategy RECENT;
    public static final GenerationStrategy REMOTE_EXACT_MATCH;
    public static final GenerationStrategy REMOTE_MATCHES;

    static {
        GenerationStrategy generationStrategy = new GenerationStrategy("RECENT", 0);
        RECENT = generationStrategy;
        GenerationStrategy generationStrategy2 = new GenerationStrategy("REMOTE_SUGGESTION", 1);
        GenerationStrategy generationStrategy3 = new GenerationStrategy("CONTACT", 2);
        CONTACT = generationStrategy3;
        GenerationStrategy generationStrategy4 = new GenerationStrategy("REMOTE_EXACT_MATCH", 3);
        REMOTE_EXACT_MATCH = generationStrategy4;
        GenerationStrategy generationStrategy5 = new GenerationStrategy("NEW_CUSTOMER", 4);
        NEW_CUSTOMER = generationStrategy5;
        GenerationStrategy generationStrategy6 = new GenerationStrategy("REMOTE_MATCHES", 5);
        REMOTE_MATCHES = generationStrategy6;
        GenerationStrategy generationStrategy7 = new GenerationStrategy("BITCOIN_WALLET_ADDRESS", 6);
        GenerationStrategy generationStrategy8 = new GenerationStrategy("FAVORITE", 7);
        FAVORITE = generationStrategy8;
        $VALUES = new GenerationStrategy[]{generationStrategy, generationStrategy2, generationStrategy3, generationStrategy4, generationStrategy5, generationStrategy6, generationStrategy7, generationStrategy8};
    }

    public static GenerationStrategy valueOf(String str) {
        return (GenerationStrategy) Enum.valueOf(GenerationStrategy.class, str);
    }

    public static GenerationStrategy[] values() {
        return (GenerationStrategy[]) $VALUES.clone();
    }
}

package com.squareup.cash.keystore;

import kotlin.Metadata;

/* loaded from: classes.dex */
public interface AttestedKeyService {

    public interface Factory {
        AttestedKeyService create(String str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class GenerationMode {
        public static final /* synthetic */ GenerationMode[] $VALUES;
        public static final GenerationMode RECREATE_AT_STARTUP;

        /* JADX INFO: Fake field, exist only in values array */
        GenerationMode EF0;

        static {
            GenerationMode generationMode = new GenerationMode("LOAD_FROM_KEYSTORE_IF_AVAILABLE", 0);
            GenerationMode generationMode2 = new GenerationMode("RECREATE_AT_STARTUP", 1);
            RECREATE_AT_STARTUP = generationMode2;
            $VALUES = new GenerationMode[]{generationMode, generationMode2};
        }

        public static GenerationMode valueOf(String str) {
            return (GenerationMode) Enum.valueOf(GenerationMode.class, str);
        }

        public static GenerationMode[] values() {
            return (GenerationMode[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/cash/keystore/AttestedKeyService$ServiceNotAvailable", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class ServiceNotAvailable extends RuntimeException {
        public ServiceNotAvailable() {
            super("Attested Key Service is not ready or is not available.");
        }
    }
}

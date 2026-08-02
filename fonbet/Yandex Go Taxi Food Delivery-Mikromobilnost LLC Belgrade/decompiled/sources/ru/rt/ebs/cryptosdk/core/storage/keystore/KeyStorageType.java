package ru.rt.ebs.cryptosdk.core.storage.keystore;

import defpackage.ejx;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/rt/ebs/cryptosdk/core/storage/keystore/KeyStorageType;", "", "Companion", "ejx", "PREFS", "MEMORY", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class KeyStorageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ KeyStorageType[] $VALUES;
    public static final ejx Companion;
    public static final KeyStorageType MEMORY;
    public static final KeyStorageType PREFS;

    static {
        KeyStorageType keyStorageType = new KeyStorageType("PREFS", 0);
        PREFS = keyStorageType;
        KeyStorageType keyStorageType2 = new KeyStorageType("MEMORY", 1);
        MEMORY = keyStorageType2;
        KeyStorageType[] keyStorageTypeArr = {keyStorageType, keyStorageType2};
        $VALUES = keyStorageTypeArr;
        $ENTRIES = a.a(keyStorageTypeArr);
        Companion = new ejx();
    }

    public static KeyStorageType valueOf(String str) {
        return (KeyStorageType) Enum.valueOf(KeyStorageType.class, str);
    }

    public static KeyStorageType[] values() {
        return (KeyStorageType[]) $VALUES.clone();
    }
}

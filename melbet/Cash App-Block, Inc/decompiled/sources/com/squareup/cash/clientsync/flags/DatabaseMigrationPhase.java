package com.squareup.cash.clientsync.flags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DatabaseMigrationPhase {
    public static final /* synthetic */ DatabaseMigrationPhase[] $VALUES;
    public static final DatabaseMigrationPhase MultiplatformOnly;
    public static final DatabaseMigrationPhase MultiplatformShadowed;
    public static final DatabaseMigrationPhase NativeOnly;
    public static final DatabaseMigrationPhase NativeShadowed;

    static {
        DatabaseMigrationPhase databaseMigrationPhase = new DatabaseMigrationPhase("NativeOnly", 0);
        NativeOnly = databaseMigrationPhase;
        DatabaseMigrationPhase databaseMigrationPhase2 = new DatabaseMigrationPhase("NativeShadowed", 1);
        NativeShadowed = databaseMigrationPhase2;
        DatabaseMigrationPhase databaseMigrationPhase3 = new DatabaseMigrationPhase("MultiplatformShadowed", 2);
        MultiplatformShadowed = databaseMigrationPhase3;
        DatabaseMigrationPhase databaseMigrationPhase4 = new DatabaseMigrationPhase("MultiplatformOnly", 3);
        MultiplatformOnly = databaseMigrationPhase4;
        $VALUES = new DatabaseMigrationPhase[]{databaseMigrationPhase, databaseMigrationPhase2, databaseMigrationPhase3, databaseMigrationPhase4};
    }

    public static DatabaseMigrationPhase valueOf(String str) {
        return (DatabaseMigrationPhase) Enum.valueOf(DatabaseMigrationPhase.class, str);
    }

    public static DatabaseMigrationPhase[] values() {
        return (DatabaseMigrationPhase[]) $VALUES.clone();
    }
}

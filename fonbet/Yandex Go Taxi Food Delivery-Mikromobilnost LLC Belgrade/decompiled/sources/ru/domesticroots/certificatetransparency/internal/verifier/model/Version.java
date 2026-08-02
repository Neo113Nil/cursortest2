package ru.domesticroots.certificatetransparency.internal.verifier.model;

import defpackage.k4o;
import defpackage.z931;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/domesticroots/certificatetransparency/internal/verifier/model/Version;", "", "", "number", CA20Status.STATUS_USER_I, "a", "()I", "Companion", "z931", "V1", "UNKNOWN_VERSION", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Version {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Version[] $VALUES;
    public static final z931 Companion;
    public static final Version UNKNOWN_VERSION;
    public static final Version V1;
    private final int number;

    static {
        Version version = new Version("V1", 0, 0);
        V1 = version;
        Version version2 = new Version("UNKNOWN_VERSION", 1, 256);
        UNKNOWN_VERSION = version2;
        Version[] versionArr = {version, version2};
        $VALUES = versionArr;
        $ENTRIES = a.a(versionArr);
        Companion = new z931();
    }

    public Version(String str, int i, int i2) {
        this.number = i2;
    }

    public static Version valueOf(String str) {
        return (Version) Enum.valueOf(Version.class, str);
    }

    public static Version[] values() {
        return (Version[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getNumber() {
        return this.number;
    }
}

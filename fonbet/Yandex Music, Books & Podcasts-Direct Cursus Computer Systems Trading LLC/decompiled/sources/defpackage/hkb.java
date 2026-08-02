package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hkb {
    public static final /* synthetic */ hkb[] a = {new hkb("MusicWeb", 0), new hkb("MusicMobileApp", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    hkb EF5;

    public static hkb valueOf(String str) {
        return (hkb) Enum.valueOf(hkb.class, str);
    }

    public static hkb[] values() {
        return (hkb[]) a.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s4t {
    public static final /* synthetic */ s4t[] a = {new s4t("Like", 0), new s4t("Unlike", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    s4t EF5;

    public static s4t valueOf(String str) {
        return (s4t) Enum.valueOf(s4t.class, str);
    }

    public static s4t[] values() {
        return (s4t[]) a.clone();
    }
}

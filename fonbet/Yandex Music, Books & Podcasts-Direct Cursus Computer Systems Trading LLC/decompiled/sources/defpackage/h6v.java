package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class h6v {
    public static final /* synthetic */ h6v[] a = {new h6v("Concert", 0), new h6v("Donation", 1), new h6v("Audiobook", 2), new h6v("Fact", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    h6v EF5;

    public static h6v valueOf(String str) {
        return (h6v) Enum.valueOf(h6v.class, str);
    }

    public static h6v[] values() {
        return (h6v[]) a.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class xhr {
    public static final /* synthetic */ xhr[] a = {new xhr("PROD_QA", 0), new xhr("TESTING", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    xhr EF5;

    public static xhr valueOf(String str) {
        return (xhr) Enum.valueOf(xhr.class, str);
    }

    public static xhr[] values() {
        return (xhr[]) a.clone();
    }
}

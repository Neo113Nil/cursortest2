package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c4i {
    public static final /* synthetic */ c4i[] a = {new c4i("OFF", 0), new c4i("DEPENDENT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    c4i EF5;

    public static c4i valueOf(String str) {
        return (c4i) Enum.valueOf(c4i.class, str);
    }

    public static c4i[] values() {
        return (c4i[]) a.clone();
    }
}

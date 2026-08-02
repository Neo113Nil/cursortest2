package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class id {
    public static final id a;
    public static final /* synthetic */ id[] b;

    static {
        id idVar = new id("kassa", 0);
        a = idVar;
        b = new id[]{idVar, new id("tinkoff", 1)};
    }

    public static id valueOf(String str) {
        return (id) Enum.valueOf(id.class, str);
    }

    public static id[] values() {
        return (id[]) b.clone();
    }
}

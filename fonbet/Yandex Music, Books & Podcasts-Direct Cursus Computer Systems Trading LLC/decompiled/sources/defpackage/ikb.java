package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ikb {
    public static final /* synthetic */ ikb[] a = {new ikb("Timer", 0), new ikb("Cross", 1), new ikb("Back", 2), new ikb("Swipe", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ikb EF5;

    public static ikb valueOf(String str) {
        return (ikb) Enum.valueOf(ikb.class, str);
    }

    public static ikb[] values() {
        return (ikb[]) a.clone();
    }
}

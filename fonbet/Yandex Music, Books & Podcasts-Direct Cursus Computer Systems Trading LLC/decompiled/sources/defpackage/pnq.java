package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class pnq {
    public static final /* synthetic */ pnq[] a = {new pnq("WIZARD", 0), new pnq("SIMPLE_PLAYLIST", 1), new pnq("SMART_SIMPLE_PLAYLIST", 2), new pnq("SMART_OPEN_PLAYLIST", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    pnq EF5;

    public static pnq valueOf(String str) {
        return (pnq) Enum.valueOf(pnq.class, str);
    }

    public static pnq[] values() {
        return (pnq[]) a.clone();
    }
}

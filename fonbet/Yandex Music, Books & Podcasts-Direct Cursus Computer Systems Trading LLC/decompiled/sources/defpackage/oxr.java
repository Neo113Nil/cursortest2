package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class oxr {
    public static final oxr a;
    public static final oxr b;
    public static final oxr c;
    public static final /* synthetic */ oxr[] d;

    /* JADX INFO: Fake field, exist only in values array */
    oxr EF0;

    static {
        oxr oxrVar = new oxr("IDLE", 0);
        oxr oxrVar2 = new oxr("STARTED", 1);
        a = oxrVar2;
        oxr oxrVar3 = new oxr("IN_PROGRESS", 2);
        oxr oxrVar4 = new oxr("SUCCEEDED", 3);
        b = oxrVar4;
        oxr oxrVar5 = new oxr("FAILED", 4);
        c = oxrVar5;
        d = new oxr[]{oxrVar, oxrVar2, oxrVar3, oxrVar4, oxrVar5};
    }

    public static oxr valueOf(String str) {
        return (oxr) Enum.valueOf(oxr.class, str);
    }

    public static oxr[] values() {
        return (oxr[]) d.clone();
    }
}

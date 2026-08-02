package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i5n {
    public static final i5n a;
    public static final /* synthetic */ i5n[] b;

    static {
        i5n i5nVar = new i5n("DEFAULT", 0);
        a = i5nVar;
        i5n i5nVar2 = new i5n("UNMETERED_ONLY", 1);
        i5n i5nVar3 = new i5n("UNMETERED_OR_DAILY", 2);
        i5n i5nVar4 = new i5n("FAST_IF_RADIO_AWAKE", 3);
        i5n i5nVar5 = new i5n("NEVER", 4);
        i5n i5nVar6 = new i5n("UNRECOGNIZED", 5);
        b = new i5n[]{i5nVar, i5nVar2, i5nVar3, i5nVar4, i5nVar5, i5nVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, i5nVar);
        sparseArray.put(1, i5nVar2);
        sparseArray.put(2, i5nVar3);
        sparseArray.put(3, i5nVar4);
        sparseArray.put(4, i5nVar5);
        sparseArray.put(-1, i5nVar6);
    }

    public static i5n valueOf(String str) {
        return (i5n) Enum.valueOf(i5n.class, str);
    }

    public static i5n[] values() {
        return (i5n[]) b.clone();
    }
}

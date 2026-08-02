package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class tm5 {
    public static final tm5 a;
    public static final /* synthetic */ tm5[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tm5 EF0;

    static {
        tm5 tm5Var = new tm5("NOT_SET", 0);
        tm5 tm5Var2 = new tm5("EVENT_OVERRIDE", 1);
        a = tm5Var2;
        b = new tm5[]{tm5Var, tm5Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, tm5Var);
        sparseArray.put(5, tm5Var2);
    }

    public static tm5 valueOf(String str) {
        return (tm5) Enum.valueOf(tm5.class, str);
    }

    public static tm5[] values() {
        return (tm5[]) b.clone();
    }
}

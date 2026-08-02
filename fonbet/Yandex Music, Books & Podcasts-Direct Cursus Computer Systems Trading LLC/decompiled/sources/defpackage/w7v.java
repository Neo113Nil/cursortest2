package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w7v {
    public static final w7v a;
    public static final w7v b;
    public static final w7v c;
    public static final /* synthetic */ w7v[] d;

    static {
        w7v w7vVar = new w7v("Static", 0);
        a = w7vVar;
        w7v w7vVar2 = new w7v("Sleep", 1);
        b = w7vVar2;
        w7v w7vVar3 = new w7v("Ai", 2);
        c = w7vVar3;
        d = new w7v[]{w7vVar, w7vVar2, w7vVar3};
    }

    public static w7v valueOf(String str) {
        return (w7v) Enum.valueOf(w7v.class, str);
    }

    public static w7v[] values() {
        return (w7v[]) d.clone();
    }
}

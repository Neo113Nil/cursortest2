package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f1v {
    public static final f1v a;
    public static final f1v b;
    public static final f1v c;
    public static final /* synthetic */ f1v[] d;

    static {
        f1v f1vVar = new f1v("DiscolorShader", 0);
        a = f1vVar;
        f1v f1vVar2 = new f1v("DefaultShader", 1);
        b = f1vVar2;
        f1v f1vVar3 = new f1v("Nothing", 2);
        c = f1vVar3;
        d = new f1v[]{f1vVar, f1vVar2, f1vVar3};
    }

    public static f1v valueOf(String str) {
        return (f1v) Enum.valueOf(f1v.class, str);
    }

    public static f1v[] values() {
        return (f1v[]) d.clone();
    }
}

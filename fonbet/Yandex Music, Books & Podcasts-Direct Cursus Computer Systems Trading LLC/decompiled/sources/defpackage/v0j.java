package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class v0j {
    public static final b3i b;
    public static final v0j c;
    public static final v0j d;
    public static final v0j e;
    public static final /* synthetic */ v0j[] f;
    public static final /* synthetic */ rdb g;
    public final int a;

    static {
        v0j v0jVar = new v0j("MOBILE", 0, 0);
        c = v0jVar;
        v0j v0jVar2 = new v0j("WIFI_ONLY", 1, 1);
        d = v0jVar2;
        v0j v0jVar3 = new v0j("OFFLINE", 2, 2);
        e = v0jVar3;
        v0j[] v0jVarArr = {v0jVar, v0jVar2, v0jVar3};
        f = v0jVarArr;
        g = new rdb(v0jVarArr);
        b = new b3i(28);
    }

    public v0j(String str, int i, int i2) {
        this.a = i2;
    }

    public static v0j valueOf(String str) {
        return (v0j) Enum.valueOf(v0j.class, str);
    }

    public static v0j[] values() {
        return (v0j[]) f.clone();
    }
}

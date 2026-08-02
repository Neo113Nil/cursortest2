package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class j2v {
    public static final zfm a;
    public static final j2v b;
    public static final j2v c;
    public static final /* synthetic */ j2v[] d;

    static {
        j2v j2vVar = new j2v("Reshuffle", 0);
        b = j2vVar;
        j2v j2vVar2 = new j2v("Default", 1);
        c = j2vVar2;
        d = new j2v[]{j2vVar, j2vVar2};
        a = new zfm();
    }

    public static j2v valueOf(String str) {
        return (j2v) Enum.valueOf(j2v.class, str);
    }

    public static j2v[] values() {
        return (j2v[]) d.clone();
    }
}

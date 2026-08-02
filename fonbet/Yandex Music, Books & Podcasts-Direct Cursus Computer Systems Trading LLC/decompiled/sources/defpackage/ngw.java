package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ngw {
    public static final ngw a;
    public static final ngw b;
    public static final ngw c;
    public static final /* synthetic */ ngw[] d;

    static {
        ngw ngwVar = new ngw("Retryable", 0);
        a = ngwVar;
        ngw ngwVar2 = new ngw("NoRetry", 1);
        b = ngwVar2;
        ngw ngwVar3 = new ngw("NoYnisonCode", 2);
        c = ngwVar3;
        d = new ngw[]{ngwVar, ngwVar2, ngwVar3};
    }

    public static ngw valueOf(String str) {
        return (ngw) Enum.valueOf(ngw.class, str);
    }

    public static ngw[] values() {
        return (ngw[]) d.clone();
    }
}

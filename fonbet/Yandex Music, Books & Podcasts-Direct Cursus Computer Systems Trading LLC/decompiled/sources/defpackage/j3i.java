package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j3i {
    public static final j3i a;
    public static final j3i b;
    public static final j3i c;
    public static final j3i d;
    public static final /* synthetic */ j3i[] e;

    static {
        j3i j3iVar = new j3i("UNARY", 0);
        a = j3iVar;
        j3i j3iVar2 = new j3i("CLIENT_STREAMING", 1);
        b = j3iVar2;
        j3i j3iVar3 = new j3i("SERVER_STREAMING", 2);
        c = j3iVar3;
        j3i j3iVar4 = new j3i("BIDI_STREAMING", 3);
        d = j3iVar4;
        e = new j3i[]{j3iVar, j3iVar2, j3iVar3, j3iVar4, new j3i("UNKNOWN", 4)};
    }

    public static j3i valueOf(String str) {
        return (j3i) Enum.valueOf(j3i.class, str);
    }

    public static j3i[] values() {
        return (j3i[]) e.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class r1c {
    public static final r1c a;
    public static final r1c b;
    public static final r1c c;
    public static final r1c d;
    public static final r1c e;
    public static final /* synthetic */ r1c[] f;

    static {
        r1c r1cVar = new r1c("internal_sdk", 0);
        a = r1cVar;
        r1c r1cVar2 = new r1c("mobile_backend", 1);
        b = r1cVar2;
        r1c r1cVar3 = new r1c("diehard", 2);
        c = r1cVar3;
        r1c r1cVar4 = new r1c("nspk", 3);
        d = r1cVar4;
        r1c r1cVar5 = new r1c("passport", 4);
        e = r1cVar5;
        f = new r1c[]{r1cVar, r1cVar2, r1cVar3, r1cVar4, r1cVar5};
    }

    public static r1c valueOf(String str) {
        return (r1c) Enum.valueOf(r1c.class, str);
    }

    public static r1c[] values() {
        return (r1c[]) f.clone();
    }
}

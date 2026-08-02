package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class uym {
    public static final uym a;
    public static final uym b;
    public static final /* synthetic */ uym[] c;

    static {
        uym uymVar = new uym("PROTO2", 0);
        a = uymVar;
        uym uymVar2 = new uym("PROTO3", 1);
        b = uymVar2;
        c = new uym[]{uymVar, uymVar2};
    }

    public static uym valueOf(String str) {
        return (uym) Enum.valueOf(uym.class, str);
    }

    public static uym[] values() {
        return (uym[]) c.clone();
    }
}

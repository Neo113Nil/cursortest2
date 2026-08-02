package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class rks {
    public static final rks a;
    public static final rks b;
    public static final /* synthetic */ rks[] c;

    /* JADX INFO: Fake field, exist only in values array */
    rks EF0;

    static {
        rks rksVar = new rks("FAKE", 0);
        rks rksVar2 = new rks("MTLS", 1);
        a = rksVar2;
        rks rksVar3 = new rks("CUSTOM_MANAGERS", 2);
        b = rksVar3;
        c = new rks[]{rksVar, rksVar2, rksVar3};
    }

    public static rks valueOf(String str) {
        return (rks) Enum.valueOf(rks.class, str);
    }

    public static rks[] values() {
        return (rks[]) c.clone();
    }
}

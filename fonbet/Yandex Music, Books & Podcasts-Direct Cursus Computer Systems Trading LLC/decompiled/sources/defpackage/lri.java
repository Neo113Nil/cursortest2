package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lri {
    public static final lri a;
    public static final lri b;
    public static final lri c;
    public static final /* synthetic */ lri[] d;

    static {
        lri lriVar = new lri("NotPlaying", 0);
        a = lriVar;
        lri lriVar2 = new lri("Playing", 1);
        b = lriVar2;
        lri lriVar3 = new lri("Paused", 2);
        c = lriVar3;
        d = new lri[]{lriVar, lriVar2, lriVar3};
    }

    public static lri valueOf(String str) {
        return (lri) Enum.valueOf(lri.class, str);
    }

    public static lri[] values() {
        return (lri[]) d.clone();
    }
}

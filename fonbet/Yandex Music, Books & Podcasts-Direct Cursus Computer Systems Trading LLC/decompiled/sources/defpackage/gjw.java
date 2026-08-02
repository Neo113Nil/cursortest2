package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gjw {
    public static final gjw a;
    public static final /* synthetic */ gjw[] b;

    static {
        gjw gjwVar = new gjw("NO_DEVICES", 0);
        a = gjwVar;
        b = new gjw[]{gjwVar, new gjw("NO_PLAYABLES", 1)};
    }

    public static gjw valueOf(String str) {
        return (gjw) Enum.valueOf(gjw.class, str);
    }

    public static gjw[] values() {
        return (gjw[]) b.clone();
    }
}

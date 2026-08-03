package bd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: g, reason: collision with root package name */
    public static final w f1159g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f1160h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f1161i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w[] f1162j;

    static {
        w wVar = new w("START", 0);
        f1159g = wVar;
        w wVar2 = new w("STOP", 1);
        f1160h = wVar2;
        w wVar3 = new w("STOP_AND_RESET_REPLAY_CACHE", 2);
        f1161i = wVar3;
        f1162j = new w[]{wVar, wVar2, wVar3};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f1162j.clone();
    }
}

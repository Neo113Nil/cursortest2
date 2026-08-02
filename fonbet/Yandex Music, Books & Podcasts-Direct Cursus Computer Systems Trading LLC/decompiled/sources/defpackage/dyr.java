package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class dyr {
    public static final dyr a;
    public static final dyr b;
    public static final dyr c;
    public static final dyr d;
    public static final dyr e;
    public static final /* synthetic */ dyr[] f;

    static {
        dyr dyrVar = new dyr("default_sync", 0);
        a = dyrVar;
        dyr dyrVar2 = new dyr("notification", 1);
        dyr dyrVar3 = new dyr("other", 2);
        dyr dyrVar4 = new dyr("like", 3);
        b = dyrVar4;
        dyr dyrVar5 = new dyr("unlike", 4);
        c = dyrVar5;
        dyr dyrVar6 = new dyr("dislike", 5);
        d = dyrVar6;
        dyr dyrVar7 = new dyr("undislike", 6);
        dyr dyrVar8 = new dyr("modify_playlist", 7);
        e = dyrVar8;
        f = new dyr[]{dyrVar, dyrVar2, dyrVar3, dyrVar4, dyrVar5, dyrVar6, dyrVar7, dyrVar8};
    }

    public static dyr valueOf(String str) {
        return (dyr) Enum.valueOf(dyr.class, str);
    }

    public static dyr[] values() {
        return (dyr[]) f.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class shb {
    public static final shb a;
    public static final shb b;
    public static final shb c;
    public static final /* synthetic */ shb[] d;

    /* JADX INFO: Fake field, exist only in values array */
    shb EF0;

    static {
        shb shbVar = new shb("ALBUMS", 0);
        shb shbVar2 = new shb("PROMO_PLAYLISTS", 1);
        a = shbVar2;
        shb shbVar3 = new shb("PROMO_ALBUMS", 2);
        b = shbVar3;
        shb shbVar4 = new shb("PROMO_ARTISTS", 3);
        c = shbVar4;
        d = new shb[]{shbVar, shbVar2, shbVar3, shbVar4};
    }

    public static shb valueOf(String str) {
        return (shb) Enum.valueOf(shb.class, str);
    }

    public static shb[] values() {
        return (shb[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class zpd {
    public static final zpd d;
    public static final zpd e;
    public static final zpd f;
    public static final zpd g;
    public static final zpd h;
    public static final zpd i;
    public static final zpd j;
    public static final zpd k;
    public static final zpd l;
    public static final zpd m;
    public static final zpd n;
    public static final zpd o;
    public static final zpd p;
    public static final /* synthetic */ zpd[] q;
    public final int a;
    public final int b;
    public final int c;

    static {
        int i2 = 0;
        zpd zpdVar = new zpd("Artist", 0, 0, i2, 7, 0);
        d = zpdVar;
        zpd zpdVar2 = new zpd("Mix", 1, i2, 0, 7, 0);
        e = zpdVar2;
        zpd zpdVar3 = new zpd("Album", 2, 2, 1, 4, 0);
        f = zpdVar3;
        zpd zpdVar4 = new zpd(3, 1, 1, 1, "AlbumWithYear");
        g = zpdVar4;
        int i3 = 2;
        zpd zpdVar5 = new zpd("Autoplaylist", 4, 1, i3, 4, 0);
        h = zpdVar5;
        zpd zpdVar6 = new zpd("Playlist", 5, i3, 1, 4, 0);
        i = zpdVar6;
        zpd zpdVar7 = new zpd("LikedEntity", 6, 2, 1, 4, 0);
        j = zpdVar7;
        zpd zpdVar8 = new zpd("CombinedEntity", 7, 2, 1, 4, 0);
        k = zpdVar8;
        int i4 = 1;
        zpd zpdVar9 = new zpd("WaveAgent", 8, 2, i4, 4, 0);
        l = zpdVar9;
        zpd zpdVar10 = new zpd("WaveAgentCollection", 9, i4, 0, 4, 0);
        m = zpdVar10;
        zpd zpdVar11 = new zpd("WaveAgentLanding", 10, 2, 0, 4, 0);
        n = zpdVar11;
        zpd zpdVar12 = new zpd("BottomSheetSquare", 11, 3, 1, 4, 0);
        o = zpdVar12;
        zpd zpdVar13 = new zpd("BottomSheetCircle", 12, 3, 1, 4, 0);
        p = zpdVar13;
        q = new zpd[]{zpdVar, zpdVar2, zpdVar3, zpdVar4, zpdVar5, zpdVar6, zpdVar7, zpdVar8, zpdVar9, zpdVar10, zpdVar11, zpdVar12, zpdVar13};
    }

    public /* synthetic */ zpd(String str, int i2, int i3, int i4, int i5, int i6) {
        this(i2, (i5 & 1) != 0 ? 0 : i3, (i5 & 2) != 0 ? 0 : i4, 0, str);
    }

    public static zpd valueOf(String str) {
        return (zpd) Enum.valueOf(zpd.class, str);
    }

    public static zpd[] values() {
        return (zpd[]) q.clone();
    }

    public zpd(int i2, int i3, int i4, int i5, String str) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
    }
}

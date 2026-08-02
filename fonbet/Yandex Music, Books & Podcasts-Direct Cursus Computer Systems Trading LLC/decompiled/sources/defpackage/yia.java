package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class yia {
    public static final yia a;
    public static final yia b;
    public static final yia c;
    public static final yia d;
    public static final yia e;
    public static final /* synthetic */ yia[] f;

    static {
        yia yiaVar = new yia("PLAYLISTS", 0);
        a = yiaVar;
        yia yiaVar2 = new yia("ALBUMS", 1);
        b = yiaVar2;
        yia yiaVar3 = new yia("BOOKS", 2);
        c = yiaVar3;
        yia yiaVar4 = new yia("PODCASTS", 3);
        d = yiaVar4;
        yia yiaVar5 = new yia("KIDS", 4);
        e = yiaVar5;
        f = new yia[]{yiaVar, yiaVar2, yiaVar3, yiaVar4, yiaVar5};
    }

    public static yia valueOf(String str) {
        return (yia) Enum.valueOf(yia.class, str);
    }

    public static yia[] values() {
        return (yia[]) f.clone();
    }
}

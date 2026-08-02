package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qxk {
    public static final qxk a;
    public static final qxk b;
    public static final qxk c;
    public static final /* synthetic */ qxk[] d;

    static {
        qxk qxkVar = new qxk("NotAvailable", 0);
        a = qxkVar;
        qxk qxkVar2 = new qxk("AlbumAndArtist", 1);
        b = qxkVar2;
        qxk qxkVar3 = new qxk("OnlyAlbum", 2);
        c = qxkVar3;
        d = new qxk[]{qxkVar, qxkVar2, qxkVar3};
    }

    public static qxk valueOf(String str) {
        return (qxk) Enum.valueOf(qxk.class, str);
    }

    public static qxk[] values() {
        return (qxk[]) d.clone();
    }
}

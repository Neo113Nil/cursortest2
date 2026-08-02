package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class vln {
    public static final vln a;
    public static final vln b;
    public static final vln c;
    public static final /* synthetic */ vln[] d;

    static {
        vln vlnVar = new vln("NO_MUSIC_DETECTED", 0);
        a = vlnVar;
        vln vlnVar2 = new vln("TRACK_NOT_FOUND", 1);
        b = vlnVar2;
        vln vlnVar3 = new vln("NETWORK_ERROR", 2);
        c = vlnVar3;
        d = new vln[]{vlnVar, vlnVar2, vlnVar3, new vln("MICROPHONE_ERROR", 3), new vln("TIMEOUT", 4), new vln("UNKNOWN", 5)};
    }

    public static vln valueOf(String str) {
        return (vln) Enum.valueOf(vln.class, str);
    }

    public static vln[] values() {
        return (vln[]) d.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mhc {
    public static final mhc a;
    public static final mhc b;
    public static final mhc c;
    public static final mhc d;
    public static final mhc e;
    public static final /* synthetic */ mhc[] f;

    static {
        mhc mhcVar = new mhc("OPEN_WEB", 0);
        a = mhcVar;
        mhc mhcVar2 = new mhc("SHOW_NATIVE_SCREEN", 1);
        b = mhcVar2;
        mhc mhcVar3 = new mhc("SEND_EXTERNAL_EVENT", 2);
        c = mhcVar3;
        mhc mhcVar4 = new mhc("SEND_ANALYTICS_EVENT", 3);
        d = mhcVar4;
        mhc mhcVar5 = new mhc("DELAY", 4);
        e = mhcVar5;
        f = new mhc[]{mhcVar, mhcVar2, mhcVar3, mhcVar4, mhcVar5};
    }

    public static mhc valueOf(String str) {
        return (mhc) Enum.valueOf(mhc.class, str);
    }

    public static mhc[] values() {
        return (mhc[]) f.clone();
    }
}

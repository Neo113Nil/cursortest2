package yads;

import defpackage.cx81;
import defpackage.k4o;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a7 {
    public static final cx81 c;
    public static final /* synthetic */ a7[] d;
    public static final /* synthetic */ k4o e;
    public final String b;

    static {
        a7[] a7VarArr = {new a7(0, "APPLOVIN", "applovin"), new a7(1, "APPLOVINMAX", "applovin_max"), new a7(2, "BIGOADS", "bigoads"), new a7(3, "CHARTBOOST", "chartboost"), new a7(4, "DIGITALTURBINE", "digitalturbine"), new a7(5, "GOOGLE", "admanager"), new a7(6, "ADMOB", "admob"), new a7(7, "INMOBI", "inmobi"), new a7(8, "IRONSOURCE", "ironsource"), new a7(9, "MINTEGRAL", "mintegral"), new a7(10, "MYTARGET", "mytarget"), new a7(11, "PANGLE", "pangle"), new a7(12, "TAPJOY", "tapjoy"), new a7(13, "UNITYADS", "unityads"), new a7(14, "VUNGLE", "vungle"), new a7(15, "YANDEX", "yandex")};
        d = a7VarArr;
        e = a.a(a7VarArr);
        c = new cx81();
    }

    public a7(int i, String str, String str2) {
        this.b = str2;
    }

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) d.clone();
    }
}

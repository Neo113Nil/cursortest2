package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class htr {
    public static final quk f;
    public static final htr g;
    public static final htr h;
    public static final htr i;
    public static final htr j;
    public static final /* synthetic */ htr[] k;
    public static final /* synthetic */ rdb l;
    public final String a;
    public final htr b;
    public final Locale c;
    public final jyr d;
    public final jyr e = btf.b(new eyq(18, this));

    static {
        htr htrVar = new htr("ENGLISH", 0, "en", "MMMM d", "MMMM d yyyy", null);
        g = htrVar;
        htr htrVar2 = new htr("RUSSIAN", 1, "ru", "d MMMM", "d MMMM yyyy", null);
        h = htrVar2;
        htr htrVar3 = new htr("UZBEK", 2, "uz", "d MMMM", "d MMMM yyyy", htrVar);
        i = htrVar3;
        htr htrVar4 = new htr("KAZAKH", 3, "kk", "d MMMM", "d MMMM yyyy", htrVar2);
        j = htrVar4;
        htr[] htrVarArr = {htrVar, htrVar2, htrVar3, htrVar4};
        k = htrVarArr;
        l = new rdb(htrVarArr);
        f = new quk();
    }

    public htr(String str, int i2, String str2, String str3, String str4, htr htrVar) {
        this.a = str2;
        this.b = htrVar;
        this.c = new Locale(str2);
        this.d = btf.b(new ftr(0, str3, str4, this));
    }

    public static htr valueOf(String str) {
        return (htr) Enum.valueOf(htr.class, str);
    }

    public static htr[] values() {
        return (htr[]) k.clone();
    }
}

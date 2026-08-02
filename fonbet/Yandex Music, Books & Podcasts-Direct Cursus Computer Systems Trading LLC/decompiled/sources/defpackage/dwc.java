package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dwc {
    public static final dwc a;
    public static final dwc b;
    public static final dwc c;
    public static final dwc d;
    public static final dwc e;
    public static final /* synthetic */ dwc[] f;

    static {
        dwc dwcVar = new dwc("ON_CONFIGURE", 0);
        a = dwcVar;
        dwc dwcVar2 = new dwc("ON_CREATE", 1);
        b = dwcVar2;
        dwc dwcVar3 = new dwc("ON_UPGRADE", 2);
        c = dwcVar3;
        dwc dwcVar4 = new dwc("ON_DOWNGRADE", 3);
        d = dwcVar4;
        dwc dwcVar5 = new dwc("ON_OPEN", 4);
        e = dwcVar5;
        f = new dwc[]{dwcVar, dwcVar2, dwcVar3, dwcVar4, dwcVar5};
    }

    public static dwc valueOf(String str) {
        return (dwc) Enum.valueOf(dwc.class, str);
    }

    public static dwc[] values() {
        return (dwc[]) f.clone();
    }
}

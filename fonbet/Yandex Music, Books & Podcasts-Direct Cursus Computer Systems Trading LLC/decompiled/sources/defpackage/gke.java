package defpackage;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class gke extends ih4 {
    public final String b;
    public final String c;
    public final avo d;
    public final avo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(String str, String str2, String str3, avo avoVar, avo avoVar2) {
        super(str2);
        str.getClass();
        str2.getClass();
        avoVar.getClass();
        avoVar2.getClass();
        this.b = str;
        this.c = str3;
        this.d = avoVar;
        this.e = avoVar2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gke(String str) {
        this(r2, str, "", r5, r5);
        String valueOf = String.valueOf(UUID.randomUUID());
        avo avoVar = avo.c;
    }
}

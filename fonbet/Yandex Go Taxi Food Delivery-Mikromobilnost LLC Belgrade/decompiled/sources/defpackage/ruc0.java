package defpackage;

import kotlinx.serialization.json.c;

@gsq0
/* loaded from: classes9.dex */
public final class ruc0 {
    public static final quc0 Companion = new quc0();
    public final String a;
    public final String b;
    public final String c;
    public final c d;

    public /* synthetic */ ruc0(int i, String str, String str2, String str3, c cVar) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, puc0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public ruc0(String str, String str2, String str3, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }
}

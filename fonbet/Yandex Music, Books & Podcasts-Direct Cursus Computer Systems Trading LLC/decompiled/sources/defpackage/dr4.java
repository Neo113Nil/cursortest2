package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class dr4 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr4(hr4 hr4Var, c80 c80Var, onh onhVar, int i) {
        super(0);
        this.r = 2;
        this.s = hr4Var;
        this.v = c80Var;
        this.u = onhVar;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        int i2 = this.t;
        Object obj = this.u;
        Object obj2 = this.v;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                StringBuilder l = f1d.l(i2, "    ", (String) obj3, " Track:", ", ");
                l.append(dsc.c((dsc) obj));
                l.append(", supported=");
                l.append((String) obj2);
                return l.toString();
            case 1:
                StringBuilder l2 = f1d.l(i2, "    ", (String) obj3, " Track:", ", ");
                l2.append(dsc.c((dsc) obj));
                l2.append(", supported=");
                l2.append((String) obj2);
                return l2.toString();
            default:
                onh onhVar = (onh) obj;
                jyr jyrVar = hr4.e;
                StringBuilder sb = new StringBuilder("mediaItem [");
                sb.append(((hr4) obj3).h((c80) obj2));
                sb.append(", item=");
                if (onhVar != null) {
                    gnh gnhVar = onhVar.b;
                    StringBuilder sb2 = new StringBuilder("MediaItem(uri=");
                    sb2.append(gnhVar != null ? gnhVar.a : null);
                    sb2.append(", mimeType=");
                    r1 = su4.o(sb2, gnhVar != null ? gnhVar.b : null, ")");
                }
                sb.append(r1);
                sb.append(", reason=");
                return su4.o(sb, i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT", "]");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr4(String str, int i, dsc dscVar, String str2, int i2) {
        super(0);
        this.r = i2;
        this.s = str;
        this.t = i;
        this.u = dscVar;
        this.v = str2;
    }
}

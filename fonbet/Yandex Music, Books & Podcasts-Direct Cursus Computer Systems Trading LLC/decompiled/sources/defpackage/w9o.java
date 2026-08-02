package defpackage;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class w9o extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x9o s;
    public final /* synthetic */ l6e t;
    public final /* synthetic */ String u;
    public final /* synthetic */ byte[] v;
    public final /* synthetic */ UUID w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9o(x9o x9oVar, l6e l6eVar, String str, byte[] bArr, UUID uuid, int i) {
        super(0);
        this.r = i;
        this.s = x9oVar;
        this.t = l6eVar;
        this.u = str;
        this.v = bArr;
        this.w = uuid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return this.s.a.a(this.t, this.u, this.v, this.w);
            default:
                return this.s.a.c(this.t, this.u, this.v, this.w);
        }
    }
}

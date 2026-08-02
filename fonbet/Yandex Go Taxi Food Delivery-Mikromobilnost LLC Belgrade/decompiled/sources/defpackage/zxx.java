package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzxx;", "Lw96;", "Companion", "yxx", "xxx", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class zxx extends w96 {
    public static final yxx Companion = new yxx();
    public static final zxx d = new zxx(0);
    public final boolean b;
    public final p8c c;

    public /* synthetic */ zxx(int i, boolean z, p8c p8cVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = p8cVar;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public zxx(int i) {
        this.b = false;
        this.c = null;
    }

    public zxx() {
        this(0);
    }
}

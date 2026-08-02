package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsyi;", "", "Companion", "qyi", "ryi", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class syi {
    public static final ryi Companion = new ryi();
    public final zzs a;
    public final String b;

    public /* synthetic */ syi(int i, zzs zzsVar, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final zzs getA() {
        return this.a;
    }

    public syi(int i, zzs zzsVar) {
        this.a = (i & 1) != 0 ? null : zzsVar;
        this.b = null;
    }

    public syi() {
        this(3, null);
    }
}

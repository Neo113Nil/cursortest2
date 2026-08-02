package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvwj;", "", "Companion", "twj", "uwj", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class vwj {
    public static final uwj Companion = new uwj();
    public final String a;
    public final String b;
    public final zzs c;

    public /* synthetic */ vwj(int i, zzs zzsVar, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = zzs.f;
        } else {
            this.c = zzsVar;
        }
    }

    public vwj() {
        this(0);
    }

    public vwj(int i) {
        zzs zzsVar = zzs.f;
        this.a = "";
        this.b = "";
        this.c = zzsVar;
    }
}

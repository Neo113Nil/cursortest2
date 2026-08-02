package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwco;", "", "Companion", "uco", "vco", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class wco {
    public static final vco Companion = new vco();
    public static final i3y[] h = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(3)), null, null};
    public final String a;
    public final String b;
    public final String c;
    public final nzc d;
    public final List e;
    public final String f;
    public final String g;

    public /* synthetic */ wco(int i, String str, String str2, String str3, nzc nzcVar, List list, String str4, String str5) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = nzcVar;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str5;
        }
    }

    public wco() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = EmptyList.a;
        this.f = "";
        this.g = "";
    }
}

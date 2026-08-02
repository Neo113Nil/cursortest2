package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lsni;", "Lxn11;", "Lc6z;", "Companion", "a", "pni", "oni", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class sni implements xn11, c6z {
    public static final pni Companion = new pni();
    public static final i3y[] f;
    public static final sni g;
    public final boolean b;
    public final Map c;
    public final List d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new dii(8)), kotlin.a.b(lazyThreadSafetyMode, new dii(9)), null};
        g = new sni(0);
    }

    public /* synthetic */ sni(int i, String str, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? b.f() : map;
        this.d = (i & 4) == 0 ? EmptyList.a : list;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sni)) {
            return false;
        }
        sni sniVar = (sni) obj;
        return this.b == sniVar.b && jl40.l(this.c, sniVar.c) && jl40.l(this.d, sniVar.d) && jl40.l(this.e, sniVar.e);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getH() {
        return this.c;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return n.l(", defaultStatus=", this.e, Extension.C_BRAKE, nnm.l("DeliverySafeFlowNotificationsExperiment(enabled=", ", l10n=", ", statusNotifications=", this.c, this.b), this.d);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsni$a;", "", "Companion", "qni", "rni", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a {
        public static final rni Companion = new rni();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ a(int i, String str, String str2, String str3) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return oyr.t(b64.v("StatusNotificationDto(status=", this.a, ", textKey=", this.b, ", imageTag="), this.c, Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    public sni() {
        this(0);
    }

    public sni(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
        this.e = null;
    }
}

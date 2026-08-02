package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lutc;", "", "Companion", "b", "a", "qtc", "auc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class utc {
    public static final auc Companion = new auc();
    public static final i3y[] g;
    public final List a;
    public final pf10 b;
    public final a c;
    public final List d;
    public final List e;
    public final b f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z2c(26)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z2c(27)), kotlin.a.b(lazyThreadSafetyMode, new z2c(28)), null};
    }

    public /* synthetic */ utc(int i, List list, pf10 pf10Var, a aVar, List list2, List list3, b bVar) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        int i3 = 0;
        if ((i & 2) == 0) {
            this.b = new pf10(i3);
        } else {
            this.b = pf10Var;
        }
        if ((i & 4) == 0) {
            this.c = new a(null, null, null, null, null, null, 4095);
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
        this.f = (i & 32) == 0 ? new b(0) : bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utc)) {
            return false;
        }
        utc utcVar = (utc) obj;
        return jl40.l(this.a, utcVar.a) && jl40.l(this.b, utcVar.b) && jl40.l(this.c, utcVar.c) && jl40.l(this.d, utcVar.d) && jl40.l(this.e, utcVar.e) && jl40.l(this.f, utcVar.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        b bVar = this.f;
        return c + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "CommunicationsParam(communicationsOnDevice=" + this.a + ", mediaSizeInfo=" + this.b + ", applicationState=" + this.c + ", supportedActivateConditions=" + this.d + ", supportedActions=" + this.e + ", plusSubscriptionInfo=" + this.f + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lutc$a;", "", "Companion", "a", "c", "b", "rtc", "vtc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final /* data */ class a {
        public static final vtc Companion = new vtc();
        public static final i3y[] m = {null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(29)), null, null, null, null, null};
        public final Integer a;
        public final zzs b;
        public final b c;
        public final String d;
        public final String e;
        public final String f;
        public final List g;
        public final String h;
        public final String i;
        public final c j;
        public final String k;
        public final String l;

        public /* synthetic */ a(int i, Integer num, zzs zzsVar, b bVar, String str, String str2, String str3, List list, String str4, String str5, c cVar, String str6, String str7) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = zzsVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bVar;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str3;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = list;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str4;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str5;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = cVar;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = str6;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = str7;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h) && jl40.l(this.i, aVar.i) && jl40.l(this.j, aVar.j) && jl40.l(this.k, aVar.k) && jl40.l(this.l, aVar.l);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            zzs zzsVar = this.b;
            int hashCode2 = (hashCode + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.d;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List list = this.g;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.i;
            int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            c cVar = this.j;
            int hashCode10 = (hashCode9 + (cVar == null ? 0 : Boolean.hashCode(cVar.a))) * 31;
            String str6 = this.k;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.l;
            return hashCode11 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ApplicationState(accuracy=");
            sb.append(this.a);
            sb.append(", location=");
            sb.append(this.b);
            sb.append(", pointA=");
            sb.append(this.c);
            sb.append(", currentMode=");
            sb.append(this.d);
            sb.append(", userAction=");
            g8e.D(sb, this.e, ", orderId=", this.f, ", fields=");
            oyr.D(", nearestZoneName=", this.h, ", selectedClass=", sb, this.g);
            sb.append(this.i);
            sb.append(", multiclassOptions=");
            sb.append(this.j);
            sb.append(", paymentMethod=");
            return g8e.r(sb, this.k, ", activeScreen=", this.l, Extension.C_BRAKE);
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lutc$a$c;", "", "Companion", "ytc", "ztc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class c {
            public static final ztc Companion = new ztc();
            public final boolean a;

            public /* synthetic */ c(int i, boolean z) {
                if ((i & 1) == 0) {
                    this.a = false;
                } else {
                    this.a = z;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return nzs.b("MulticlassOptions(selected=", Extension.C_BRAKE, this.a);
            }

            public c() {
                this.a = false;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lutc$a$a;", "", "Companion", "stc", "ttc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: utc$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0130a {
            public static final ttc Companion = new ttc();
            public final String a;
            public final zzs b;

            public /* synthetic */ C0130a(int i, zzs zzsVar, String str) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = zzs.f;
                } else {
                    this.b = zzsVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0130a)) {
                    return false;
                }
                C0130a c0130a = (C0130a) obj;
                return jl40.l(this.a, c0130a.a) && jl40.l(this.b, c0130a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "ApplicationStateField(type=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
            }

            public C0130a() {
                zzs zzsVar = zzs.f;
                this.a = "";
                this.b = zzsVar;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lutc$a$b;", "", "Companion", "wtc", "xtc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class b {
            public static final xtc Companion = new xtc();
            public final double a;
            public final double b;

            public /* synthetic */ b(double d, double d2, int i) {
                if ((i & 1) == 0) {
                    this.a = 0.0d;
                } else {
                    this.a = d;
                }
                if ((i & 2) == 0) {
                    this.b = 0.0d;
                } else {
                    this.b = d2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Double.compare(this.a, bVar.a) == 0 && Double.compare(this.b, bVar.b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
            }

            public final String toString() {
                return nzs.c(oyr.u(this.a, "Location(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
            }

            public b(double d, double d2) {
                this.a = d;
                this.b = d2;
            }

            public b() {
                this(0.0d, 0.0d);
            }
        }

        public a() {
            this(null, null, null, null, null, null, 4095);
        }

        public a(Integer num, zzs zzsVar, b bVar, String str, String str2, String str3, int i) {
            num = (i & 1) != 0 ? null : num;
            zzsVar = (i & 2) != 0 ? null : zzsVar;
            bVar = (i & 4) != 0 ? null : bVar;
            str = (i & 128) != 0 ? null : str;
            str2 = (i & 256) != 0 ? null : str2;
            str3 = (i & 2048) != 0 ? null : str3;
            this.a = num;
            this.b = zzsVar;
            this.c = bVar;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = str;
            this.i = str2;
            this.j = null;
            this.k = null;
            this.l = str3;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lutc$b;", "", "Companion", "buc", "cuc", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class b {
        public static final cuc Companion = new cuc();
        public final String a;

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jl40.l(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("PlusSubscriptionInfo(plusSubscriptionId=", this.a, Extension.C_BRAKE);
        }

        public b(int i) {
            this.a = null;
        }

        public b() {
            this(0);
        }
    }

    public utc() {
        this(null, null, null, null, 63);
    }

    public utc(List list, pf10 pf10Var, a aVar, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        list = i2 != 0 ? emptyList : list;
        pf10Var = (i & 2) != 0 ? new pf10(0) : pf10Var;
        a aVar2 = (i & 4) != 0 ? new a(null, null, null, null, null, null, 4095) : aVar;
        List list3 = (i & 8) != 0 ? emptyList : list2;
        b bVar = new b(0);
        this.a = list;
        this.b = pf10Var;
        this.c = aVar2;
        this.d = list3;
        this.e = emptyList;
        this.f = bVar;
    }
}

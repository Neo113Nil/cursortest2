package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lqb40;", "", "Companion", "a", "mb40", "nb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class qb40 {
    public static final nb40 Companion = new nb40();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(8))};
    public final String a;
    public final a b;
    public final db40 c;
    public final Map d;

    public /* synthetic */ qb40(int i, String str, a aVar, db40 db40Var, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        int i2 = 0;
        if ((i & 2) == 0) {
            this.b = new a(i2);
        } else {
            this.b = aVar;
        }
        if ((i & 4) == 0) {
            this.c = new db40(0);
        } else {
            this.c = db40Var;
        }
        if ((i & 8) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb40)) {
            return false;
        }
        qb40 qb40Var = (qb40) obj;
        return jl40.l(this.a, qb40Var.a) && jl40.l(this.b, qb40Var.b) && jl40.l(this.c, qb40Var.c) && jl40.l(this.d, qb40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MtTrainCheckoutRequest(token=" + this.a + ", paymentInfo=" + this.b + ", orderInfo=" + this.c + ", payload=" + this.d + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqb40$a;", "", "Companion", "ob40", "pb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final pb40 Companion = new pb40();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(9))};
        public final String a;
        public final PaymentMethod$Type b;

        public /* synthetic */ a(int i, String str, PaymentMethod$Type paymentMethod$Type) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = paymentMethod$Type;
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
            return jl40.l(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            PaymentMethod$Type paymentMethod$Type = this.b;
            return hashCode + (paymentMethod$Type == null ? 0 : paymentMethod$Type.hashCode());
        }

        public final String toString() {
            return "PaymentInfo(paymentMethodId=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this(0);
        }

        public a(String str, PaymentMethod$Type paymentMethod$Type) {
            this.a = str;
            this.b = paymentMethod$Type;
        }

        public /* synthetic */ a(int i) {
            this("", null);
        }
    }

    public qb40(String str, a aVar, db40 db40Var, Map map) {
        this.a = str;
        this.b = aVar;
        this.c = db40Var;
        this.d = map;
    }

    public qb40() {
        this("", new a(0), new db40(0), b.f());
    }
}

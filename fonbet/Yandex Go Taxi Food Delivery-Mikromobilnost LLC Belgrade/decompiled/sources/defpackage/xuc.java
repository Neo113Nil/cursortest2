package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lxuc;", "Lug2;", "Companion", "a", "tuc", "uuc", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class xuc extends ug2 {
    public static final uuc Companion = new uuc();
    public final String a;
    public final String b;
    public final a c;

    public xuc(int i, String str, String str2, a aVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) != 0) {
            this.c = aVar;
        } else {
            a.Companion.getClass();
            this.c = a.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuc)) {
            return false;
        }
        xuc xucVar = (xuc) obj;
        return jl40.l(this.a, xucVar.a) && jl40.l(this.b, xucVar.b) && jl40.l(this.c, xucVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CompanionLottieAnimation(id=", this.a, ", link=", this.b, ", animationSettings=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxuc$a;", "", "Companion", "wuc", "vuc", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final wuc Companion = new wuc();
        public static final a c = new a(0);
        public final Long a;
        public final Integer b;

        public /* synthetic */ a(int i, Long l, Integer num) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = l;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            Long l = this.a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Integer num = this.b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "LottieAnimationSettings(delay=" + this.a + ", repeatCount=" + this.b + Extension.C_BRAKE;
        }

        public a(int i) {
            this.a = null;
            this.b = null;
        }

        public a() {
            this(0);
        }
    }

    public xuc() {
        a.Companion.getClass();
        this.a = "";
        this.b = null;
        this.c = a.c;
    }
}

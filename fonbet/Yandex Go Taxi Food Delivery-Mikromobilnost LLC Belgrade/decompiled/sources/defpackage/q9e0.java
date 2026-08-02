package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lq9e0;", "", "Companion", "a", "n9e0", "r9e0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class q9e0 {
    public static final r9e0 Companion = new r9e0();
    public final String a;
    public final a b;

    public /* synthetic */ q9e0(int i, String str, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e0)) {
            return false;
        }
        q9e0 q9e0Var = (q9e0) obj;
        return jl40.l(this.a, q9e0Var.a) && jl40.l(this.b, q9e0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "PopupOption(label=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public q9e0() {
        this.a = null;
        this.b = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lq9e0$a;", "", "Companion", "o9e0", "p9e0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final p9e0 Companion = new p9e0();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(14)), null, null};
        public final OptionType a;
        public final String b;
        public final String c;

        public /* synthetic */ a(int i, OptionType optionType, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = optionType;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
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
            return this.a == aVar.a && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            OptionType optionType = this.a;
            int hashCode = (optionType == null ? 0 : optionType.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(type=");
            sb.append(this.a);
            sb.append(", tariffClass=");
            sb.append(this.b);
            sb.append(", requirement=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }
}

package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lri60;", "", "Companion", "a", "ni60", "si60", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ri60 {
    public static final si60 Companion = new si60();
    public final String a;
    public final a b;

    public /* synthetic */ ri60(int i, String str, a aVar) {
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
        if (!(obj instanceof ri60)) {
            return false;
        }
        ri60 ri60Var = (ri60) obj;
        return jl40.l(this.a, ri60Var.a) && jl40.l(this.b, ri60Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.b;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationOption(on=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lri60$a;", "", "Companion", "pi60", "qi60", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final qi60 Companion = new qi60();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(0)), null};
        public final OptionType a;
        public final String b;

        public /* synthetic */ a(int i, OptionType optionType, String str) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            OptionType optionType = this.a;
            int hashCode = (optionType == null ? 0 : optionType.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Action(type=" + this.a + ", tariffClass=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this.a = null;
            this.b = null;
        }
    }

    public ri60() {
        this.a = null;
        this.b = null;
    }
}

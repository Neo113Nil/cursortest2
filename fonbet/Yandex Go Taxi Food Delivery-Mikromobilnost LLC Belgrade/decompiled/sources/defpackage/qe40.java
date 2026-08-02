package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lqe40;", "", "Companion", "a", "re40", "d", "b", "c", "bf40", "oe40", "se40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class qe40 {
    public static final se40 Companion = new se40();
    public final FormattedText a;
    public final String b;
    public final String c;
    public final a d;

    @gsq0(with = re40.class)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lqe40$a;", "", "<init>", "()V", "Companion", "pe40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static class a {
        public static final pe40 Companion = new pe40();
    }

    public /* synthetic */ qe40(int i, FormattedText formattedText, String str, String str2, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe40)) {
            return false;
        }
        qe40 qe40Var = (qe40) obj;
        return jl40.l(this.a, qe40Var.a) && jl40.l(this.b, qe40Var.b) && jl40.l(this.c, qe40Var.c) && jl40.l(this.d, qe40Var.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int b2 = unr0.b(unr0.b((formattedText == null ? 0 : formattedText.a.hashCode()) * 31, 31, this.b), 31, this.c);
        a aVar = this.d;
        return b2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MtTrainDateSelectorDto(title=" + this.a + ", accessibilityText=" + this.b + ", id=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqe40$c;", "Lqe40$a;", "Companion", "xe40", "ye40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c extends a {
        public static final ye40 Companion = new ye40();
        public final String a;

        public /* synthetic */ c(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public c() {
            this.a = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqe40$d;", "Lqe40$a;", "Companion", "ze40", "af40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d extends a {
        public static final af40 Companion = new af40();
        public final b a;

        public /* synthetic */ d(int i, b bVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bVar;
            }
        }

        public d() {
            this.a = null;
        }
    }

    public qe40() {
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lqe40$b;", "", "Companion", "a", "te40", "ue40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class b {
        public static final ue40 Companion = new ue40();
        public final Integer a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final FormattedText e;
        public final FormattedText f;
        public final String g;
        public final a h;

        public /* synthetic */ b(int i, Integer num, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, String str2, a aVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = formattedText3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = formattedText4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = aVar;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqe40$b$a;", "", "Companion", "ve40", "we40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final we40 Companion = new we40();
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public /* synthetic */ a(String str, String str2, String str3, String str4, int i, String str5) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str5;
                }
            }

            public a() {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }
        }

        public b(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }

        public b() {
            this(0);
        }
    }
}

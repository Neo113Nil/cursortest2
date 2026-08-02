package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Luzg;", "Lr73;", "Companion", "lzg", "mzg", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class uzg implements r73 {
    public static final mzg Companion = new mzg();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rsf(28)), null};
    public final String a;
    public final List b;
    public final String c;
    public final i3y d;

    public /* synthetic */ uzg(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: kzg
            public final /* synthetic */ uzg b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                uzg uzgVar = this.b;
                switch (i3) {
                    case 0:
                        mzg mzgVar = uzg.Companion;
                        break;
                    default:
                        mzg mzgVar2 = uzg.Companion;
                        break;
                }
                return new FormattedText(uzgVar.b);
            }
        });
    }

    @Override // defpackage.r73
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzg)) {
            return false;
        }
        uzg uzgVar = (uzg) obj;
        return jl40.l(this.a, uzgVar.a) && jl40.l(this.b, uzgVar.b) && jl40.l(this.c, uzgVar.c);
    }

    @Override // defpackage.r73
    /* renamed from: getItems, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(xvz.r("Deeplink(color=", this.a, ", items=", this.b, ", deeplink="), this.c, Extension.C_BRAKE);
    }

    public uzg() {
        this.a = "";
        this.b = EmptyList.a;
        this.c = "";
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: kzg
            public final /* synthetic */ uzg b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                uzg uzgVar = this.b;
                switch (i3) {
                    case 0:
                        mzg mzgVar = uzg.Companion;
                        break;
                    default:
                        mzg mzgVar2 = uzg.Companion;
                        break;
                }
                return new FormattedText(uzgVar.b);
            }
        });
    }
}

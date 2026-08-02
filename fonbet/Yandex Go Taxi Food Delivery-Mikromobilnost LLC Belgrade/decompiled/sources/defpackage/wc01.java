package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwc01;", "", "Companion", "uc01", "vc01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class wc01 {
    public static final vc01 Companion = new vc01();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(29))};
    public final List a;

    public /* synthetic */ wc01(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc01) && jl40.l(this.a, ((wc01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("TrainStationSuggestsResponseDto(suggests=", Extension.C_BRAKE, this.a);
    }

    public wc01() {
        this.a = EmptyList.a;
    }
}

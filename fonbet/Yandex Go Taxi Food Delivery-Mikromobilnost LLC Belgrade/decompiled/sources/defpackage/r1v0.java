package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.net.response.Status;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lr1v0;", "", "Companion", "p1v0", "q1v0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class r1v0 {
    public static final q1v0 Companion = new q1v0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(2))};
    public final Status a;

    public /* synthetic */ r1v0(int i, Status status) {
        if ((i & 1) == 0) {
            this.a = Status.UNKNOWN;
        } else {
            this.a = status;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Status getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1v0) && this.a == ((r1v0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubscriptionStatusResponse(status=" + this.a + Extension.C_BRAKE;
    }

    public r1v0() {
        this.a = Status.UNKNOWN;
    }
}

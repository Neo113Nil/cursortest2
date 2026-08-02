package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.SeenMarkerEntity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final class s9b implements qb7 {
    public final l7q0 A;
    public final y221 B;
    public final bv21 C;
    public final meb D;
    public final by10 E;
    public final r9b F;
    public final Looper a;
    public final o1b0 b;
    public final k020 c;
    public final nta0 w;
    public final m5b0 x;
    public final x22 y;
    public final vcz0 z;

    public s9b(Looper looper, o1b0 o1b0Var, at2 at2Var, k020 k020Var, nta0 nta0Var, wff0 wff0Var, sb7 sb7Var, w3c w3cVar, m5b0 m5b0Var, x22 x22Var, vcz0 vcz0Var, l7q0 l7q0Var, y221 y221Var) {
        this.a = looper;
        this.b = o1b0Var;
        this.c = k020Var;
        this.w = nta0Var;
        this.x = m5b0Var;
        this.y = x22Var;
        this.z = vcz0Var;
        this.A = l7q0Var;
        this.B = y221Var;
        this.C = at2Var.a();
        this.D = at2Var.Y();
        this.E = at2Var.b();
        this.F = new r9b(this, w3cVar, wff0Var);
        sb7Var.a(this);
    }

    public static final void b(s9b s9bVar, long j) {
        o1b0 o1b0Var = s9bVar.b;
        vcz0 vcz0Var = s9bVar.z;
        LocalMessageRef.Companion.getClass();
        MessageData d = vcz0Var.d(t3z.a(j));
        if (d == null) {
            return;
        }
        String str = o1b0Var.c;
        boolean c = str != null ? s9bVar.C.c(str) : false;
        Pair pair = new Pair("chat", o1b0Var.b);
        Pair pair2 = new Pair("ts", String.valueOf(j));
        Pair pair3 = new Pair("v", String.valueOf(d.lastEditTimestamp));
        Pair pair4 = new Pair(ACSPConstants.STATUS, d.hiddenByModeration ? "18+" : WriteBlocks.OK);
        int i = jpq0.A;
        Pair pair5 = new Pair("kind", p9b1.f(d));
        AddresseeType.INSTANCE.getClass();
        s9bVar.y.reportEvent("message seen", b.h(pair, pair2, pair3, pair4, pair5, new Pair("addressee type", (c ? AddresseeType.CONTACT : AddresseeType.OTHER).getReportName())));
    }

    @Override // defpackage.qb7
    public final void d(long j) {
        q2b e;
        Long l;
        o1b0 o1b0Var = this.b;
        long j2 = o1b0Var.a;
        if (j == j2 && (l = (e = this.D.e(j2)).a) != null && l.longValue() > 0) {
            String str = o1b0Var.b;
            nta0 nta0Var = this.w;
            HashMap hashMap = nta0Var.e;
            p370 p370Var = nta0Var.f;
            v2b0 v2b0Var = (v2b0) p370Var.w;
            String str2 = (String) p370Var.b;
            byte[] c = v2b0Var.c(str2, str);
            SeenMarkerEntity seenMarkerEntity = (SeenMarkerEntity) (c != null ? ((atq0) p370Var.c).a(c) : null);
            if (seenMarkerEntity == null) {
                return;
            }
            long j3 = seenMarkerEntity.a;
            long j4 = seenMarkerEntity.d;
            l7q0 l7q0Var = nta0Var.c;
            l7q0Var.getClass();
            Long l2 = e.a;
            if (l2 != null) {
                long longValue = l2.longValue();
                long j5 = e.b;
                if (l7q0Var.a.a(tz10.G)) {
                    boolean z = false;
                    boolean z2 = j5 > j4;
                    if (j5 == j4 && longValue > j3) {
                        z = true;
                    }
                    if (!z2 && !z) {
                        return;
                    }
                } else if (longValue <= j3) {
                    return;
                }
                ((v2b0) p370Var.w).a(str2, str);
                x08 x08Var = (x08) hashMap.get(str);
                if (x08Var != null) {
                    hashMap.remove(str);
                    x08Var.cancel();
                }
            }
        }
    }
}

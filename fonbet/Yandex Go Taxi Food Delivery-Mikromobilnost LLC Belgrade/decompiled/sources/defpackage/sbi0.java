package defpackage;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.internal.view.timeline.g0;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class sbi0 implements dcz0 {
    public final g0 a;
    public RecyclerView b;
    public final HashSet c = new HashSet();

    public sbi0(g0 g0Var) {
        this.a = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dcz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view) {
        Object iffVar;
        Long l;
        RecyclerView recyclerView = this.b;
        x0 childViewHolder = recyclerView != null ? recyclerView.getChildViewHolder(view) : null;
        e eVar = childViewHolder instanceof e ? (e) childViewHolder : null;
        if (eVar == null) {
            return;
        }
        boolean z = eVar.l0;
        if (z) {
            String str = eVar.a0;
            if (str != null && (l = eVar.Z) != null) {
                iffVar = new hjj(str, l.longValue());
                if (iffVar != null) {
                    return;
                }
                HashSet hashSet = this.c;
                if (hashSet.contains(iffVar)) {
                    return;
                }
                boolean z2 = iffVar instanceof iff;
                g0 g0Var = this.a;
                if (z2) {
                    long j = ((iff) iffVar).a;
                    g0Var.getClass();
                    tje.e();
                    b00 b00Var = g0Var.a;
                    ((Handler) b00Var.a.get()).post(new zz(b00Var, g0Var.b, (String) null, j));
                } else {
                    if (!(iffVar instanceof hjj)) {
                        w511.b();
                        return;
                    }
                    hjj hjjVar = (hjj) iffVar;
                    String str2 = hjjVar.a;
                    long j2 = hjjVar.b;
                    g0Var.getClass();
                    tje.e();
                    b00 b00Var2 = g0Var.a;
                    ((Handler) b00Var2.a.get()).post(new zz(b00Var2, g0Var.b, str2, j2));
                }
                if (z2) {
                    long j3 = ((iff) iffVar).a;
                    g0Var.getClass();
                    tje.e();
                    b00 b00Var3 = g0Var.a;
                    ((Handler) b00Var3.a.get()).post(new nz(b00Var3, g0Var.b, j3));
                } else if (!(iffVar instanceof hjj)) {
                    w511.b();
                    return;
                }
                hashSet.add(iffVar);
                return;
            }
            iffVar = null;
            if (iffVar != null) {
            }
        } else {
            if (z) {
                ny61.g("Failed requirement.");
                return;
            }
            Long l2 = eVar.W;
            if (l2 == null || l2.longValue() >= ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET) {
                l2 = null;
            }
            if (l2 != null) {
                iffVar = new iff(l2.longValue());
                if (iffVar != null) {
                }
            }
            iffVar = null;
            if (iffVar != null) {
            }
        }
    }
}

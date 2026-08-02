package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class of extends c7 {
    public final x7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(q5 q5Var) {
        super(c9.g, q5Var);
        q5Var.getClass();
        this.k = new x7(60000, x7.g, q5Var.a.j.k(), q5Var.a.j.l());
    }

    public static final String b(id idVar, long j) {
        return Recorder$$ExternalSyntheticOutline2.m("Template request will not be retried. Marking as complete. ", idVar.a(j));
    }

    public static final String c(id idVar, long j) {
        return Recorder$$ExternalSyntheticOutline2.m("Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. ", idVar.a(j));
    }

    @Override // bo.app.c7
    public final void a(long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((id) obj).d == jd.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            id idVar = (id) arrayList2.get(i3);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c7$$ExternalSyntheticLambda5(idVar, j, 4), 7, (Object) null);
            idVar.a(j, jd.COMPLETE);
        }
        ArrayList arrayList3 = this.e;
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            if (((id) obj2).d == jd.PENDING_START) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList4.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            id idVar2 = (id) obj3;
            d9 d9Var = idVar2.a;
            pf pfVar = d9Var instanceof pf ? (pf) d9Var : null;
            if ((pfVar != null ? ((gg) pfVar.m).b + pfVar.p : -1L) < idVar2.b) {
                arrayList5.add(obj3);
            }
        }
        int size5 = arrayList5.size();
        while (i < size5) {
            Object obj4 = arrayList5.get(i);
            i++;
            id idVar3 = (id) obj4;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c7$$ExternalSyntheticLambda5(idVar3, j, 5), 7, (Object) null);
            idVar3.a(j, jd.COMPLETE);
        }
    }

    @Override // bo.app.c7
    public final x7 a() {
        return this.k;
    }
}

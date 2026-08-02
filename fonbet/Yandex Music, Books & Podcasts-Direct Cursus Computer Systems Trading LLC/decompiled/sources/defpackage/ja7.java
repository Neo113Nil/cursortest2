package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {o.METRICS_FILTERING_STATUS_FIELD_NUMBER, o.SESSION_HASH_FIELD_NUMBER}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ja7 extends aur implements Function2<Object, Continuation<Object>, Object> {
    public Iterator j;
    public Object k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ List n;
    public final /* synthetic */ ArrayList o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja7(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.n = list;
        this.o = arrayList;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ja7 ja7Var = new ja7(this.n, this.o, continuation);
        ja7Var.m = obj;
        return ja7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ja7) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        nm6 nm6Var = nm6.a;
        int i = this.l;
        if (i == 0) {
            qgg.h0(obj);
            obj = this.m;
            it = this.n.iterator();
            list = this.o;
        } else if (i == 1) {
            Object obj2 = this.k;
            Iterator it2 = this.j;
            List list2 = (List) this.m;
            qgg.h0(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new ia7(1, null));
                this.m = list2;
                this.j = it2;
                this.k = null;
                this.l = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.j;
            list = (List) this.m;
            qgg.h0(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            l1j.f();
            return null;
        }
        this.m = list;
        this.j = it;
        this.k = obj;
        this.l = 1;
        throw null;
    }
}

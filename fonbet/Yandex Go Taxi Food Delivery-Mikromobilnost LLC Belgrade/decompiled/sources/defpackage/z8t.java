package defpackage;

import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.p;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class z8t implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c9t c;
    public final /* synthetic */ TechBaseMessage w;
    public final /* synthetic */ Date x;
    public final /* synthetic */ boolean y;

    public z8t(mth mthVar, String str, c9t c9tVar, TechBaseMessage techBaseMessage, Date date, boolean z) {
        this.a = mthVar;
        this.b = str;
        this.c = c9tVar;
        this.w = techBaseMessage;
        this.x = date;
        this.y = z;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        Object collect = this.a.collect(new p(vprVar, this.b, this.c, this.w, this.x, this.y), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }
}

package defpackage;

import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.databases.main.MainDatabase;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.n1;
import com.yandex.passport.internal.ui.common.web.e;
import com.yandex.passport.internal.ui.common.web.f;
import com.yandex.passport.internal.ui.common.web.g;
import com.yandex.passport.internal.ui.common.web.j;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.c;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes5.dex */
public final class jw extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(ueo ueoVar, Continuation continuation, tdh tdhVar, Integer num) {
        super(1, continuation);
        this.j = 1;
        this.k = ueoVar;
        this.l = tdhVar;
        this.m = num;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new jw((c) this.k, (List) this.l, (a6l) this.m, continuation, 0);
            case 1:
                return new jw((ueo) this.k, continuation, (tdh) this.l, (Integer) this.m);
            case 2:
                return new jw((w9k) this.k, (String) this.l, (Function1) this.m, continuation, 2);
            case 3:
                return new jw((j5v) this.k, (List) this.l, (a6l) this.m, continuation, 3);
            case 4:
                return new jw((n1) this.k, (c7g) this.l, (c7g) this.m, continuation, 4);
            default:
                return new jw((e) this.k, (g) this.l, (j) this.m, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((jw) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.k;
        Object obj3 = this.m;
        Object obj4 = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return l3l.h((c) obj2, (List) obj4, (a6l) obj3).b();
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                MainDatabase mainDatabase = (MainDatabase) ((ueo) obj2);
                tdh tdhVar = (tdh) obj4;
                AtomicReference atomicReference = tdhVar.d;
                Boolean bool = Boolean.TRUE;
                Integer num = (Integer) obj3;
                while (true) {
                    if (atomicReference.compareAndSet(bool, num)) {
                        gis.a.getClass();
                        rdi.a.getClass();
                        long a = rdi.a();
                        tdhVar.b(mainDatabase.j().getWritableDatabase());
                        ssg.a(3, null, k5r.m(nsa.t(fis.b(a)), StringUtil.SPACE, tdhVar.a, ": refreshed"), null);
                    } else if (atomicReference.get() != bool) {
                    }
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                cko D0 = ((w9k) obj2).b.D0((String) obj4);
                try {
                    Object invoke = ((Function1) obj3).invoke(D0);
                    i4w.w(D0, null);
                    return invoke;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        i4w.w(D0, th);
                        throw th2;
                    }
                }
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return y5g.Y((List) obj4, new qdc((ru.yandex.music.common.media.context.e) null, new h(Page.RADIO), 1), null, ((j5v) obj2).b, (a6l) obj3, null, null, null, true, 972);
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                c7g c7gVar = (c7g) obj4;
                n1.R(c7gVar, true);
                c7g c7gVar2 = (c7g) obj3;
                int i2 = 0;
                while (true) {
                    if (!(i2 < c7gVar2.getChildCount())) {
                        return Unit.a;
                    }
                    int i3 = i2 + 1;
                    View childAt = c7gVar2.getChildAt(i2);
                    if (childAt == null) {
                        rj7.m();
                        return null;
                    }
                    if (childAt.getId() != c7gVar.getId()) {
                        n1.R(childAt, !n1.O(c7gVar));
                    }
                    i2 = i3;
                }
            default:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((e) obj2).g = false;
                f fVar = ((g) obj4).n;
                fVar.getClass();
                j jVar = fVar.a;
                jVar.h.setVisibility(8);
                jVar.e.setVisibility(0);
                jVar.g.setVisibility(8);
                ((j) obj3).g.reload();
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jw(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}

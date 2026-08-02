package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes6.dex */
public final class mr6 extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ cvl m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr6(cvl cvlVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.m = cvlVar;
        this.l = context;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mr6(this.m, this.l, continuation);
            default:
                return new mr6(this.l, this.m, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mr6) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (r3.g(r2, r26) == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r2 == r5) goto L21;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        switch (this.j) {
            case 0:
                Context context = this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    e15 e15Var = (e15) nr6.a.getValue();
                    String str2 = ((frt) nr6.b.getValue()).c().a;
                    this.k = 1;
                    d = e15Var.d(str, str2, this);
                    if (d == nm6Var) {
                        break;
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    d = obj;
                }
                cvl cvlVar = (cvl) d;
                if (this.m.g > 0) {
                    if ((cvlVar != null ? new Integer(cvlVar.g) : null) != null && cvlVar.g > 0) {
                        context.startActivity(ixf.E(context, cvlVar, d.w()));
                        break;
                    }
                }
                int i2 = SearchActivity.Z;
                context.startActivity(rvf.E(context, c0p.d));
                break;
            default:
                cvl cvlVar2 = this.m;
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    Context context2 = this.l;
                    Object[] objArr = {cvlVar2.b};
                    this.k = 1;
                    Object V = x97.V(dm6.b(), new av7(context2, R.string.playlist_removed, objArr, (Continuation) null), this);
                    if (V != obj2) {
                        V = Unit.a;
                        break;
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    neg.A(dyr.e, cvlVar2.g().d());
                    qxr.a();
                    break;
                }
                if (!cvlVar2.d()) {
                    cvl a = cvl.a(this.m, null, null, 0, 0, 0L, xxr.b, null, null, null, null, null, null, null, null, null, 134215679);
                    klg klgVar = new klg();
                    this.k = 2;
                    break;
                }
                neg.A(dyr.e, cvlVar2.g().d());
                qxr.a();
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr6(Context context, cvl cvlVar, Continuation continuation) {
        super(2, continuation);
        this.l = context;
        this.m = cvlVar;
    }
}

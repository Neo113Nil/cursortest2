package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.url.schemes.playVibe.EmptyScreenInDeeplinkActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes6.dex */
public final class j5b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ EmptyScreenInDeeplinkActivity l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5b(EmptyScreenInDeeplinkActivity emptyScreenInDeeplinkActivity, ArrayList arrayList, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = emptyScreenInDeeplinkActivity;
        this.m = arrayList;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j5b(this.l, this.m, this.n, continuation, 0);
            default:
                return new j5b(this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((j5b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                EmptyScreenInDeeplinkActivity emptyScreenInDeeplinkActivity = this.l;
                m4l m4lVar = (m4l) emptyScreenInDeeplinkActivity.v.getValue();
                a6l a = emptyScreenInDeeplinkActivity.d().a(this.n);
                this.k = 1;
                Object b = m4l.b(m4lVar, this.m, a, null, this, 56);
                return b == nm6Var ? nm6Var : b;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                EmptyScreenInDeeplinkActivity emptyScreenInDeeplinkActivity2 = this.l;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        j5b j5bVar = new j5b(emptyScreenInDeeplinkActivity2, this.m, this.n, null, 0);
                        mn7 mn7Var = dm6.b;
                        this.k = 1;
                        obj = x97.V(mn7Var, j5bVar, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    v8n v8nVar = (v8n) obj;
                    qvk qvkVar = emptyScreenInDeeplinkActivity2.w;
                    if (qvkVar != null) {
                        qvkVar.i(v8nVar);
                    }
                    emptyScreenInDeeplinkActivity2.finish();
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    int i3 = EmptyScreenInDeeplinkActivity.z;
                    ssg.a(7, "EmptyScreenInDeeplinkActivity", "Exception while trying to start playback", th);
                    emptyScreenInDeeplinkActivity2.startActivity(StubActivity.z(emptyScreenInDeeplinkActivity2, rpt.NOT_FOUND));
                    emptyScreenInDeeplinkActivity2.finish();
                }
                return Unit.a;
        }
    }
}

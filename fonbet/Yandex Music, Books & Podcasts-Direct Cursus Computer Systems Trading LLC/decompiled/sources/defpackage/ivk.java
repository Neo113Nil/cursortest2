package defpackage;

import android.content.Context;
import com.yandex.music.shared.play.audio2.db.PlayAudioDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ivk {
    public final jyr a;
    public final PlayAudioDatabase b;

    public ivk(cvk cvkVar, usr usrVar, z2b z2bVar) {
        this.a = cvkVar.b(hag.I(wuk.class), true);
        bdt I = hag.I(Context.class);
        qdc qdcVar = cvkVar.a;
        qdcVar.getClass();
        seo M = bzf.M(PlayAudioDatabase.class, (Context) qdcVar.C(I), "chunk_norris.db", usrVar, z2bVar, null);
        M.a(new b58(12, 13, new qnk(27)), new c58(13, 14, 11));
        ype it = yhn.m(1, 12).iterator();
        while (it.c) {
            M.a(new b58(it.nextInt(), 12, new qnk(28)));
        }
        this.b = (PlayAudioDatabase) M.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (defpackage.x97.V(r11, r4, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r12 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ruk rukVar, cg6 cg6Var) {
        gvk gvkVar;
        int i;
        if (cg6Var instanceof gvk) {
            gvkVar = (gvk) cg6Var;
            int i2 = gvkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gvkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = gvkVar.k;
                nm6 nm6Var = nm6.a;
                i = gvkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    gvkVar.j = rukVar;
                    gvkVar.m = 1;
                    obj = ((wuk) this.a.getValue()).a(gvkVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rukVar = gvkVar.j;
                    qgg.h0(obj);
                }
                ruk rukVar2 = rukVar;
                mn7 mn7Var = dm6.a;
                n71 n71Var = new n71((Continuation) null, this, rukVar2, (String) obj, 24);
                gvkVar.j = null;
                gvkVar.m = 2;
            }
        }
        gvkVar = new gvk(this, cg6Var);
        Object obj2 = gvkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = gvkVar.m;
        if (i != 0) {
        }
        ruk rukVar22 = rukVar;
        mn7 mn7Var2 = dm6.a;
        n71 n71Var2 = new n71((Continuation) null, this, rukVar22, (String) obj2, 24);
        gvkVar.j = null;
        gvkVar.m = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, cg6 cg6Var) {
        hvk hvkVar;
        int i2;
        if (cg6Var instanceof hvk) {
            hvkVar = (hvk) cg6Var;
            int i3 = hvkVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hvkVar.m = i3 - Integer.MIN_VALUE;
                Object obj = hvkVar.k;
                nm6 nm6Var = nm6.a;
                i2 = hvkVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    hvkVar.j = i;
                    hvkVar.m = 1;
                    obj = ((wuk) this.a.getValue()).a(hvkVar);
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = hvkVar.j;
                    qgg.h0(obj);
                }
                mn7 mn7Var = dm6.a;
                h1j h1jVar = new h1j((Continuation) null, this, (String) obj, i);
                hvkVar.j = i;
                hvkVar.m = 2;
                Object V = x97.V(mn7Var, h1jVar, hvkVar);
                return V != nm6Var ? nm6Var : V;
            }
        }
        hvkVar = new hvk(this, cg6Var);
        Object obj2 = hvkVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = hvkVar.m;
        if (i2 != 0) {
        }
        mn7 mn7Var2 = dm6.a;
        h1j h1jVar2 = new h1j((Continuation) null, this, (String) obj2, i);
        hvkVar.j = i;
        hvkVar.m = 2;
        Object V2 = x97.V(mn7Var2, h1jVar2, hvkVar);
        if (V2 != nm6Var2) {
        }
    }
}

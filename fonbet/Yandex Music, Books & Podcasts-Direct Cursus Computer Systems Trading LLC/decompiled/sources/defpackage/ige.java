package defpackage;

import androidx.fragment.app.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class ige extends bfu {
    public final frt k;
    public final vrt l;
    public final lge m;
    public final yfe n;
    public final x0q o;
    public final dkn p;

    public ige(frt frtVar, vrt vrtVar, lge lgeVar, yfe yfeVar) {
        this.k = frtVar;
        this.l = vrtVar;
        this.m = lgeVar;
        this.n = yfeVar;
        x0q b = y0q.b(0, 0, null, 7);
        this.o = b;
        this.p = new dkn(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r7.emit(defpackage.dge.a, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ige igeVar, cg6 cg6Var) {
        hge hgeVar;
        int i;
        ynt yntVar;
        if (cg6Var instanceof hge) {
            hgeVar = (hge) cg6Var;
            int i2 = hgeVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hgeVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hgeVar.j;
                nm6 nm6Var = nm6.a;
                i = hgeVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    vrt vrtVar = igeVar.l;
                    hgeVar.l = 1;
                    vrtVar.getClass();
                    obj = x97.V(dm6.b, new zts(vrtVar, continuation, 9), hgeVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                aot aotVar = (aot) obj;
                yntVar = !(aotVar instanceof ynt) ? (ynt) aotVar : null;
                if (yntVar == null && yntVar.b) {
                    t tVar = igeVar.n.a;
                    lhs lhsVar = MainScreenActivity.Q0;
                    tVar.startActivity(imp.J(tVar, null, null, null, 14));
                    tVar.finish();
                    return Unit.a;
                }
                x0q x0qVar = igeVar.o;
                hgeVar.l = 2;
            }
        }
        hgeVar = new hge(igeVar, cg6Var);
        Object obj2 = hgeVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hgeVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        aot aotVar2 = (aot) obj2;
        if (!(aotVar2 instanceof ynt)) {
        }
        if (yntVar == null) {
        }
        x0q x0qVar2 = igeVar.o;
        hgeVar.l = 2;
    }
}

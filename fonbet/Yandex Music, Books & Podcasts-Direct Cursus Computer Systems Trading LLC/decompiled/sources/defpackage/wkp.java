package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class wkp {
    public static final long m;
    public final wsh a;
    public final f7l b;
    public final uol c;
    public final k1l d;
    public final zgh e;
    public final ump f = new ump(0);
    public final ump g = new ump(-2);
    public final ump h = new ump(-6);
    public final lu3 i = new lu3(0);
    public final lu3 j = new lu3(0);
    public final lu3 k = new lu3(0);
    public final lu3 l = new lu3(0);

    static {
        msa msaVar = nsa.b;
        m = yd5.M(10, ssa.SECONDS);
    }

    public wkp(wsh wshVar, f7l f7lVar, uol uolVar, k1l k1lVar, zgh zghVar) {
        this.a = wshVar;
        this.b = f7lVar;
        this.c = uolVar;
        this.d = k1lVar;
        this.e = zghVar;
    }

    public static final Object a(wkp wkpVar, NoopCallbackCommand noopCallbackCommand, aur aurVar) {
        Object K = tyf.K(m, new g2l(noopCallbackCommand, null, 29), aurVar);
        return K == nm6.a ? K : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (r0 == r7) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        if (r0 == r7) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(wkp wkpVar, i8l i8lVar, alp alpVar, n7q n7qVar, cg6 cg6Var) {
        skp skpVar;
        Object obj;
        lu3 lu3Var = wkpVar.i;
        zgh zghVar = wkpVar.e;
        ump umpVar = wkpVar.f;
        lu3 lu3Var2 = wkpVar.j;
        ump umpVar2 = wkpVar.g;
        if (cg6Var instanceof skp) {
            skpVar = (skp) cg6Var;
            int i = skpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                skpVar.l = i - Integer.MIN_VALUE;
                Object obj2 = skpVar.j;
                nm6 nm6Var = nm6.a;
                switch (skpVar.l) {
                    case 0:
                        qgg.h0(obj2);
                        Continuation continuation = null;
                        mwk b = n7qVar != null ? n7qVar.b() : null;
                        rre rreVar = gx6.b;
                        String str = alpVar.b;
                        rreVar.getClass();
                        Iterator it = gx6.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((gx6) obj).a.equals(str)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        gx6 gx6Var = (gx6) obj;
                        switch (gx6Var == null ? -1 : rkp.b[gx6Var.ordinal()]) {
                            case -1:
                                return wkpVar.h;
                            case 0:
                            default:
                                b6e.s();
                                return null;
                            case 1:
                                if (b != null) {
                                    tkp tkpVar = new tkp(wkpVar, b, continuation, 0);
                                    skpVar.l = 1;
                                    return lu3Var2.a(tkpVar, skpVar) == nm6Var ? nm6Var : umpVar;
                                }
                                return umpVar2;
                            case 2:
                                if (b != null) {
                                    tkp tkpVar2 = new tkp(wkpVar, b, continuation, 1);
                                    skpVar.l = 2;
                                    if (lu3Var2.a(tkpVar2, skpVar) == nm6Var) {
                                    }
                                }
                                return umpVar2;
                            case 3:
                                if (b != null) {
                                    tkp tkpVar3 = new tkp(wkpVar, b, continuation, 2);
                                    skpVar.l = 3;
                                    if (lu3Var2.a(tkpVar3, skpVar) == nm6Var) {
                                    }
                                }
                                return umpVar2;
                            case 4:
                                if (b != null) {
                                    tkp tkpVar4 = new tkp(wkpVar, b, continuation, 3);
                                    skpVar.l = 4;
                                    if (lu3Var2.a(tkpVar4, skpVar) == nm6Var) {
                                    }
                                }
                                return umpVar2;
                            case 5:
                                lu3 lu3Var3 = wkpVar.l;
                                vx4 vx4Var = new vx4(wkpVar, (Continuation) null, i8lVar, n7qVar, wkpVar);
                                skpVar.l = 5;
                                Object a = lu3Var3.a(vx4Var, skpVar);
                                if (a != nm6Var) {
                                    return a;
                                }
                                break;
                            case 6:
                                lu3 lu3Var4 = wkpVar.k;
                                jbb jbbVar = new jbb(wkpVar, (Continuation) null, i8lVar, wkpVar);
                                skpVar.l = 6;
                                Object a2 = lu3Var4.a(jbbVar, skpVar);
                                if (a2 != nm6Var) {
                                    return a2;
                                }
                                break;
                            case 7:
                                skpVar.l = 7;
                                obj2 = lu3Var.a(new ukp(wkpVar, null, wkpVar, 30000L), skpVar);
                                break;
                            case 8:
                                skpVar.l = 8;
                                obj2 = lu3Var.a(new ukp(wkpVar, null, wkpVar, -15000L), skpVar);
                                break;
                        }
                    case 1:
                        qgg.h0(obj2);
                        return umpVar;
                    case 2:
                        qgg.h0(obj2);
                        return umpVar;
                    case 3:
                        qgg.h0(obj2);
                        return umpVar;
                    case 4:
                        qgg.h0(obj2);
                        return umpVar;
                    case 5:
                        qgg.h0(obj2);
                        return obj2;
                    case 6:
                        qgg.h0(obj2);
                        return obj2;
                    case 7:
                        qgg.h0(obj2);
                        ump umpVar3 = (ump) obj2;
                        zghVar.g();
                        return umpVar3;
                    case 8:
                        qgg.h0(obj2);
                        ump umpVar4 = (ump) obj2;
                        zghVar.g();
                        return umpVar4;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        skpVar = new skp(wkpVar, cg6Var);
        Object obj22 = skpVar.j;
        nm6 nm6Var2 = nm6.a;
        switch (skpVar.l) {
        }
    }
}

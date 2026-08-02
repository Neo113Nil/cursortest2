package defpackage;

import com.yandex.music.shared.player.download2.InternalDownloadException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class zim extends aur implements Function2 {
    public bjm j;
    public zvs k;
    public bjm l;
    public zvs m;
    public be6 n;
    public int o;
    public final /* synthetic */ bjm p;
    public final /* synthetic */ zvs q;
    public final /* synthetic */ uim r;
    public final /* synthetic */ be6 s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zim(bjm bjmVar, zvs zvsVar, uim uimVar, be6 be6Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.p = bjmVar;
        this.q = zvsVar;
        this.r = uimVar;
        this.s = be6Var;
        this.t = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zim(this.p, this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zim) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0068: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:105), block:B:45:0x0067 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0069: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:106), block:B:45:0x0067 */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        zvs zvsVar;
        zvs zvsVar2;
        bjm bjmVar;
        bjm bjmVar2;
        Throwable th2;
        bjm bjmVar3;
        InternalDownloadException internalDownloadException;
        bjm bjmVar4;
        zvs zvsVar3;
        be6 be6Var;
        xim ximVar;
        nm6 nm6Var = nm6.a;
        int i = this.o;
        try {
            if (i == 0) {
                qgg.h0(obj);
                bjmVar2 = this.p;
                zvsVar2 = this.q;
                uim uimVar = this.r;
                be6 be6Var2 = this.s;
                boolean z = this.t;
                try {
                    ((kvs) bjmVar2.e.getValue()).b(zvsVar2);
                    try {
                        bjmVar2.b.w(zvsVar2, uimVar.a);
                        this.j = bjmVar2;
                        this.k = zvsVar2;
                        this.l = bjmVar2;
                        this.m = zvsVar2;
                        this.n = be6Var2;
                        this.o = 1;
                        obj = bjm.a(bjmVar2, zvsVar2, be6Var2, z, uimVar, this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        bjmVar4 = bjmVar2;
                        zvsVar3 = zvsVar2;
                        be6Var = be6Var2;
                        bjmVar3 = bjmVar4;
                    } catch (InternalDownloadException e) {
                        internalDownloadException = e;
                        bjmVar4 = bjmVar2;
                        zvsVar3 = zvsVar2;
                        be6Var = be6Var2;
                        bjmVar3 = bjmVar4;
                        ((uzn) bjmVar3.f.getValue()).b.a(zvsVar2.a, be6Var, internalDownloadException);
                        vim vimVar = new vim(eob.b(internalDownloadException));
                        bjmVar3.b.E(zvsVar2);
                        ximVar = vimVar;
                        ((kvs) bjmVar4.e.getValue()).a(zvsVar3);
                        return ximVar;
                    } catch (Throwable th3) {
                        th2 = th3;
                        bjmVar3 = bjmVar2;
                        bjmVar3.b.E(zvsVar2);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ((kvs) bjmVar2.e.getValue()).a(zvsVar2);
                    throw th;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                be6Var = this.n;
                zvsVar2 = this.m;
                bjmVar3 = this.l;
                zvsVar3 = this.k;
                bjmVar4 = this.j;
                try {
                    try {
                        qgg.h0(obj);
                    } catch (InternalDownloadException e2) {
                        internalDownloadException = e2;
                        ((uzn) bjmVar3.f.getValue()).b.a(zvsVar2.a, be6Var, internalDownloadException);
                        vim vimVar2 = new vim(eob.b(internalDownloadException));
                        bjmVar3.b.E(zvsVar2);
                        ximVar = vimVar2;
                        ((kvs) bjmVar4.e.getValue()).a(zvsVar3);
                        return ximVar;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    bjmVar3.b.E(zvsVar2);
                    throw th2;
                }
            }
            ximVar = (xim) obj;
            bjmVar3.b.E(zvsVar2);
            ((kvs) bjmVar4.e.getValue()).a(zvsVar3);
            return ximVar;
        } catch (Throwable th6) {
            th = th6;
            zvsVar2 = zvsVar;
            bjmVar2 = bjmVar;
        }
    }
}

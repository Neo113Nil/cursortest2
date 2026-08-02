package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ina extends h7o implements Function2 {
    public ffm k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tqn o;
    public final /* synthetic */ xqn p;
    public final /* synthetic */ xqn q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(tqn tqnVar, xqn xqnVar, xqn xqnVar2, Continuation continuation) {
        super(2, continuation);
        this.o = tqnVar;
        this.p = xqnVar;
        this.q = xqnVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        ina inaVar = new ina(this.o, this.p, this.q, continuation);
        inaVar.n = obj;
        return inaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ina) create((hur) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db A[EDGE_INSN: B:70:0x00db->B:13:0x00db BREAK  A[LOOP:0: B:7:0x00c8->B:10:0x00d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b9 -> B:6:0x00bc). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hur hurVar;
        int i;
        Object obj2;
        int i2;
        Object a;
        hur hurVar2;
        ffm ffmVar;
        int size;
        int i3;
        boolean k;
        Object obj3;
        Object obj4;
        nm6 nm6Var = nm6.a;
        int i4 = this.m;
        ffm ffmVar2 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            qgg.h0(obj);
            hurVar = (hur) this.n;
            i = 0;
            if (i == 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.l;
                hurVar = (hur) this.n;
                qgg.h0(obj);
                obj2 = obj;
                ffm ffmVar3 = (ffm) obj2;
                List list = ffmVar3.a;
                int size2 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        i = i6;
                        break;
                    }
                    if (!swf.B((lfm) list.get(i7))) {
                        break;
                    }
                    i7++;
                }
                List list2 = ffmVar3.a;
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    lfm lfmVar = (lfm) list2.get(i8);
                    if (lfmVar.b() || swf.S(lfmVar, hurVar.f.y, hurVar.b())) {
                        break;
                    }
                }
                if (ffmVar3.a() == i5) {
                    i2 = 1;
                    this.o.a = true;
                    i = 1;
                } else {
                    i2 = 1;
                }
                gfm gfmVar = gfm.c;
                this.n = hurVar;
                this.k = ffmVar3;
                this.l = i;
                this.m = i5;
                a = hurVar.a(gfmVar, this);
                if (a != nm6Var) {
                    hurVar2 = hurVar;
                    ffmVar = ffmVar3;
                    List list3 = ((ffm) a).a;
                    size = list3.size();
                    i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                        }
                        i3++;
                    }
                    xqn xqnVar = this.p;
                    k = wna.k(ffmVar, ((lfm) xqnVar.a).a);
                    List list4 = ffmVar.a;
                    xqn xqnVar2 = this.q;
                    if (k) {
                    }
                    hurVar = hurVar2;
                    ffmVar2 = null;
                    i5 = 2;
                    i6 = 1;
                    if (i == 0) {
                    }
                }
                return nm6Var;
            }
            if (i4 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.l;
            ffmVar = this.k;
            hurVar2 = (hur) this.n;
            qgg.h0(obj);
            i2 = 1;
            a = obj;
            List list32 = ((ffm) a).a;
            size = list32.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (((lfm) list32.get(i3)).b()) {
                    i = i2;
                    break;
                }
                i3++;
            }
            xqn xqnVar3 = this.p;
            k = wna.k(ffmVar, ((lfm) xqnVar3.a).a);
            List list42 = ffmVar.a;
            xqn xqnVar22 = this.q;
            if (k) {
                int size4 = list42.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list42.get(i9);
                    if (ywf.u(((lfm) obj3).a, ((lfm) xqnVar3.a).a)) {
                        break;
                    }
                    i9++;
                }
                xqnVar22.a = obj3;
            } else {
                int size5 = list42.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        obj4 = ffmVar2;
                        break;
                    }
                    obj4 = list42.get(i10);
                    if (((lfm) obj4).d) {
                        break;
                    }
                    i10++;
                }
                lfm lfmVar2 = (lfm) obj4;
                if (lfmVar2 != null) {
                    xqnVar3.a = lfmVar2;
                    xqnVar22.a = lfmVar2;
                } else {
                    i = i2;
                    i6 = i;
                    hurVar = hurVar2;
                    if (i == 0) {
                        return Unit.a;
                    }
                    gfm gfmVar2 = gfm.b;
                    this.n = hurVar;
                    this.k = ffmVar2;
                    this.l = i;
                    this.m = i6;
                    obj2 = hurVar.a(gfmVar2, this);
                }
            }
            hurVar = hurVar2;
            ffmVar2 = null;
            i5 = 2;
            i6 = 1;
            if (i == 0) {
            }
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class oqw implements jqw {
    public final jyr a;
    public final jyr b;
    public final AtomicBoolean c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public oqw() {
        bdt I = hag.I(odd.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(dk4.class), true);
        final int i = 0;
        this.c = new AtomicBoolean(false);
        this.d = btf.b(new Function0(this) { // from class: kqw
            public final /* synthetic */ oqw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        oqw oqwVar = this.b;
                        Boolean b = oqw.b(((hxc) ((dk4) oqwVar.b.getValue()).b.getValue()).a);
                        return ydr.a(b != null ? b.booleanValue() : false ? iqw.b : ((odd) oqwVar.a.getValue()).d().a ? iqw.a : null);
                    case 1:
                        return zsd.b0(new bca(((odd) this.b.a.getValue()).m, 28));
                    default:
                        oqw oqwVar2 = this.b;
                        return new clc(new l8v(((dk4) oqwVar2.b.getValue()).a(), oqwVar2, 21), new k5u(2, 5, null));
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: kqw
            public final /* synthetic */ oqw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        oqw oqwVar = this.b;
                        Boolean b = oqw.b(((hxc) ((dk4) oqwVar.b.getValue()).b.getValue()).a);
                        return ydr.a(b != null ? b.booleanValue() : false ? iqw.b : ((odd) oqwVar.a.getValue()).d().a ? iqw.a : null);
                    case 1:
                        return zsd.b0(new bca(((odd) this.b.a.getValue()).m, 28));
                    default:
                        oqw oqwVar2 = this.b;
                        return new clc(new l8v(((dk4) oqwVar2.b.getValue()).a(), oqwVar2, 21), new k5u(2, 5, null));
                }
            }
        });
        final int i3 = 2;
        this.f = btf.b(new Function0(this) { // from class: kqw
            public final /* synthetic */ oqw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        oqw oqwVar = this.b;
                        Boolean b = oqw.b(((hxc) ((dk4) oqwVar.b.getValue()).b.getValue()).a);
                        return ydr.a(b != null ? b.booleanValue() : false ? iqw.b : ((odd) oqwVar.a.getValue()).d().a ? iqw.a : null);
                    case 1:
                        return zsd.b0(new bca(((odd) this.b.a.getValue()).m, 28));
                    default:
                        oqw oqwVar2 = this.b;
                        return new clc(new l8v(((dk4) oqwVar2.b.getValue()).a(), oqwVar2, 21), new k5u(2, 5, null));
                }
            }
        });
    }

    public static Boolean b(s84 s84Var) {
        int ordinal = s84Var.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return Boolean.TRUE;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return null;
        }
        if (ordinal == 5) {
            return Boolean.FALSE;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:14:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ae -> B:15:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ec -> B:14:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iqw[] iqwVarArr, cg6 cg6Var) {
        mqw mqwVar;
        int i;
        iqw[] iqwVarArr2;
        int length;
        mqw mqwVar2;
        int i2;
        int i3;
        if (cg6Var instanceof mqw) {
            mqwVar = (mqw) cg6Var;
            int i4 = mqwVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mqwVar.p = i4 - Integer.MIN_VALUE;
                Object obj = mqwVar.n;
                nm6 nm6Var = nm6.a;
                i = mqwVar.p;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    iqwVarArr2 = iqwVarArr;
                    length = iqwVarArr2.length;
                    mqwVar2 = mqwVar;
                    i2 = 0;
                    i3 = 0;
                    if (i2 >= length) {
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = mqwVar.m;
                    int i5 = mqwVar.l;
                    int i6 = mqwVar.k;
                    iqw[] iqwVarArr3 = mqwVar.j;
                    qgg.h0(obj);
                    mqwVar2 = mqwVar;
                    i2 = i5;
                    i3 = i6;
                    iqwVarArr2 = iqwVarArr3;
                    i2++;
                    if (i2 >= length) {
                        return Unit.a;
                    }
                    int ordinal = iqwVarArr2[i2].ordinal();
                    if (ordinal == 0) {
                        odd oddVar = (odd) this.a.getValue();
                        mqwVar2.getClass();
                        mqwVar2.j = iqwVarArr2;
                        mqwVar2.k = i3;
                        mqwVar2.l = i2;
                        mqwVar2.m = length;
                        mqwVar2.p = 2;
                        int i7 = i3;
                        Object e = oddVar.e(null, false, true, false, true, mqwVar2);
                        if (e != nm6.a) {
                            e = Unit.a;
                        }
                        if (e != nm6Var) {
                            iqwVarArr3 = iqwVarArr2;
                            i5 = i2;
                            mqwVar = mqwVar2;
                            i6 = i7;
                            mqwVar2 = mqwVar;
                            i2 = i5;
                            i3 = i6;
                            iqwVarArr2 = iqwVarArr3;
                        }
                        return nm6Var;
                    }
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    jyr jyrVar = few.e;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(byb.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    Boolean a = ((few) ((byb) qdcVar.C(I)).b(few.class)).a().a("closeChromeCastOnUi");
                    if (a != null ? a.booleanValue() : false) {
                        bsd b = dm6.b();
                        pjt pjtVar = new pjt(this, continuation, 13);
                        mqwVar2.getClass();
                        mqwVar2.j = iqwVarArr2;
                        mqwVar2.k = i3;
                        mqwVar2.l = i2;
                        mqwVar2.m = length;
                        mqwVar2.p = 1;
                        if (x97.V(b, pjtVar, mqwVar2) != nm6Var) {
                            iqwVarArr3 = iqwVarArr2;
                            i6 = i3;
                            i5 = i2;
                            mqwVar = mqwVar2;
                            mqwVar2 = mqwVar;
                            i2 = i5;
                            i3 = i6;
                            iqwVarArr2 = iqwVarArr3;
                        }
                        return nm6Var;
                    }
                    ((dk4) this.b.getValue()).b();
                    i2++;
                    if (i2 >= length) {
                    }
                }
            }
        }
        mqwVar = new mqw(this, cg6Var);
        Object obj2 = mqwVar.n;
        nm6 nm6Var2 = nm6.a;
        i = mqwVar.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    public final bqi c() {
        oqw oqwVar;
        if (this.c.compareAndSet(false, true)) {
            oqwVar = this;
            ox6.B(new u21(10, (pjc) this.f.getValue(), (pjc) this.e.getValue(), new w83(3, oqwVar, oqw.class, "calculateCastSource", "calculateCastSource(ZZ)Lcom/yandex/music/shared/ynison/api/deps/bridge/YnisonRemoteSourcesBridge$Source;", 4, 9)), cmd.a, new nqw(0, this));
        } else {
            oqwVar = this;
        }
        return (bqi) oqwVar.d.getValue();
    }
}

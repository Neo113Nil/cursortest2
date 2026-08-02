package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.preload_manager.m;

/* loaded from: classes3.dex */
public final class wk8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk8(int i, Object obj, int i2) {
        super(1);
        this.r = i2;
        this.s = i;
        this.t = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        isb b;
        switch (this.r) {
            case 0:
                ((List) obj).set(this.s, this.t);
                break;
            case 1:
                ((Boolean) obj).getClass();
                ((ii) this.t).invoke(Integer.valueOf(this.s));
                break;
            case 2:
                xqn xqnVar = (xqn) this.t;
                boolean W0 = ((dpc) obj).W0(this.s);
                xqnVar.a = Boolean.valueOf(W0);
                break;
            case 3:
                cuf cufVar = (cuf) obj;
                e0 e0Var = ((tsf) this.t).a;
                b2r G = wyf.G();
                wyf.b0(G, wyf.Q(G), G != null ? G.e() : null);
                e0Var.getClass();
                for (int i = 0; i < 2; i++) {
                    cufVar.a(this.s + i);
                }
                break;
            case 4:
                cuf cufVar2 = (cuf) obj;
                e0 e0Var2 = ((fvf) this.t).a;
                b2r G2 = wyf.G();
                wyf.b0(G2, wyf.Q(G2), G2 != null ? G2.e() : null);
                e0Var2.getClass();
                for (int i2 = 0; i2 < 2; i2++) {
                    cufVar2.a(this.s + i2);
                }
                break;
            case 5:
                jsk jskVar = (jsk) obj;
                ArrayList arrayList = (ArrayList) this.t;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ksk kskVar = (ksk) arrayList.get(i3);
                    jsk.g(jskVar, kskVar, 0, (this.s - kskVar.b) / 2);
                }
                break;
            case 6:
                break;
            case 7:
                f2t f2tVar = (f2t) obj;
                f2tVar.getClass();
                csc cscVar = null;
                if (f2tVar.a) {
                    paw pawVar = (paw) ((mmo) this.t).b;
                    int i4 = this.s;
                    nqs C = i4 != 0 ? i4 != 1 ? i4 != 2 ? null : pawVar.C() : pawVar.x() : pawVar.f();
                    if (C != null && (b = ((jsb) C).b()) != null) {
                        cscVar = new csc(b.f, b.g, b.h, b.i, b.c, b.d, b.e);
                    }
                }
                f2tVar.b = cscVar;
                break;
            case 8:
                ((jka) obj).getClass();
                ((m) this.t).b.b.getClass();
                break;
            default:
                k1a k1aVar = (k1a) obj;
                lr8 lr8Var = (lr8) this.t;
                ArrayList arrayList2 = lr8Var.f;
                int i5 = 0;
                boolean z = k1aVar == k1a.VISIBLE;
                int i6 = this.s;
                boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
                if (z != booleanValue) {
                    arrayList2.set(i6, Boolean.valueOf(z));
                    lr8Var.g = false;
                    if (booleanValue) {
                        int i7 = 0;
                        while (i5 < i6) {
                            if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                                i7++;
                            }
                            i5++;
                        }
                        lr8Var.w(i7);
                    } else {
                        int i8 = 0;
                        while (i5 < i6) {
                            if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                                i8++;
                            }
                            i5++;
                        }
                        lr8Var.v(i8);
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk8(Object obj, int i, int i2) {
        super(1);
        this.r = i2;
        this.t = obj;
        this.s = i;
    }
}

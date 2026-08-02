package defpackage;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ucs extends uif implements Function2 {
    public static final ucs A;
    public static final ucs s;
    public static final ucs t;
    public static final ucs u;
    public static final ucs v;
    public static final ucs w;
    public static final ucs x;
    public static final ucs y;
    public static final ucs z;
    public final /* synthetic */ int r;

    static {
        int i = 2;
        s = new ucs(i, 0);
        t = new ucs(i, 1);
        u = new ucs(i, 2);
        v = new ucs(i, 3);
        w = new ucs(i, 4);
        x = new ucs(i, 5);
        y = new ucs(i, 6);
        z = new ucs(i, 7);
        A = new ucs(i, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucs(int i) {
        super(2);
        this.r = 11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((m3b) obj).b = (fes) obj2;
                return Unit.a;
            case 1:
                ((m3b) obj).c = ((Number) obj2).intValue();
                return Unit.a;
            case 2:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return Unit.a;
            case 3:
                tkd tkdVar = (tkd) obj2;
                return tkdVar instanceof jg ? tkdVar : obj;
            case 4:
                return obj;
            case 5:
                tkd tkdVar2 = (tkd) obj2;
                return tkdVar2 instanceof yov ? tkdVar2 : obj;
            case 6:
                tkd tkdVar3 = (tkd) obj2;
                return tkdVar3 instanceof bxd ? tkdVar3 : obj;
            case 7:
                return Integer.valueOf(((opv) obj).c((jx7) obj2));
            case 8:
                return Integer.valueOf(((opv) obj).a((jx7) obj2));
            case 9:
                return Integer.valueOf(Math.round((1 + 0.0f) * ((((Number) obj).intValue() + 0) / 2.0f)));
            case 10:
                mhb mhbVar = (mhb) obj;
                mhb mhbVar2 = (mhb) obj2;
                mhbVar.getClass();
                mhbVar2.getClass();
                boolean z2 = true;
                if (mhbVar != mhbVar2 && (mhbVar != mhb.INTEGER || jyc.a[mhbVar2.ordinal()] != 1)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                ((Number) obj2).intValue();
                qld.p(1, (hq5) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ucs(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucs(oyc oycVar) {
        super(2);
        this.r = 10;
    }
}

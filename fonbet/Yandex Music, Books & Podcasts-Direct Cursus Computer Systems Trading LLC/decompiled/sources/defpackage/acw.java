package defpackage;

import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.u0;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class acw extends aur implements Function2 {
    public ccw j;
    public String k;
    public ccw l;
    public d m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ ccw s;
    public final /* synthetic */ String t;
    public final /* synthetic */ d u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acw(ccw ccwVar, String str, d dVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.s = ccwVar;
        this.t = str;
        this.u = dVar;
        this.v = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new acw(this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((acw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e2  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String concat;
        ccw ccwVar;
        int i;
        d dVar;
        String str;
        int i2;
        int i3;
        ccw ccwVar2;
        int i4;
        int i5;
        String str2;
        ccw ccwVar3;
        d0 d0Var;
        x0q x0qVar;
        String str3;
        nm6 nm6Var = nm6.a;
        int i6 = this.r;
        if (i6 == 0) {
            qgg.h0(obj);
            String str4 = this.t;
            concat = "updateVolume".concat(!StringsKt.U(str4) ? hrg.q("(", str4, ")") : "");
            ccwVar = this.s;
            AtomicBoolean atomicBoolean = ccwVar.e;
            xdr xdrVar = ccwVar.i;
            if (!atomicBoolean.get()) {
                ssg.a(6, ccw.l, hrg.q("skip sending ", concat, ", cause Ynison instance was closed"), null);
                return Unit.a;
            }
            boolean booleanValue = ((Boolean) xdrVar.getValue()).booleanValue();
            i = 0;
            dVar = this.u;
            str = this.v;
            if (!booleanValue) {
                ssg.a(3, ccw.l, "--> suspend ".concat(concat), null);
                lf2 lf2Var = new lf2(2, 16, null);
                this.j = ccwVar;
                this.k = concat;
                this.l = ccwVar;
                this.m = dVar;
                this.n = str;
                this.o = 0;
                this.p = 0;
                this.q = 0;
                this.r = 1;
                if (zsd.h0(xdrVar, lf2Var, this) != nm6Var) {
                    i4 = 0;
                    i2 = 0;
                    i5 = 0;
                    str2 = str;
                    ccwVar3 = ccwVar;
                }
                return nm6Var;
            }
            i2 = 0;
            i3 = 0;
            ccwVar2 = ccwVar;
            a5n I = d0.I();
            I.i(String.valueOf(UUID.randomUUID()));
            I.h(ccw.b(ccwVar2).a);
            if (((Boolean) ((dfw) ccwVar.a.g).invoke()).booleanValue()) {
                dVar.getClass();
                if (dVar.j() < 0.0d) {
                    dfi.r("DeviceVolume.isValid() volume value is negative (" + dVar.j() + ")", "YnisonRequestValidator");
                } else if (dVar.j() > 1.0d) {
                    dfi.r("DeviceVolume.isValid() volume value is too big (" + dVar.j() + " > 1.0)", "YnisonRequestValidator");
                }
                k18 l = d.l(dVar);
                l.h(yhn.b(((d) l.b).j(), 0.0d, 1.0d));
                dVar = (d) l.b();
            }
            dVar.getClass();
            str.getClass();
            jot j = u0.j();
            j.d();
            u0.f((u0) j.b, str);
            j.d();
            u0.g((u0) j.b, dVar);
            u0 u0Var = (u0) j.b();
            I.d();
            d0.n((d0) I.b, u0Var);
            d0Var = (d0) I.b();
            if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
                qee.q(d0Var);
            }
            String str5 = ccw.l;
            String p = d0Var.p();
            njs b = ccw.b(ccwVar2);
            StringBuilder m = f1d.m("--> ", concat, " with id=", p, " at timestamp=");
            m.append(b);
            ssg.a(3, str5, m.toString(), null);
            if (i != 0) {
                ccwVar2.h.add(d0Var.p());
            }
            x0qVar = ccwVar2.g;
            this.j = ccwVar2;
            this.k = concat;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = i;
            this.p = i2;
            this.q = i3;
            this.r = 2;
            if (x0qVar.emit(d0Var, this) != nm6Var) {
                str3 = concat;
                String str6 = ccw.l;
                ccwVar2.d().getClass();
                str3.getClass();
                return Unit.a;
            }
            return nm6Var;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = this.k;
            ccwVar2 = this.j;
            qgg.h0(obj);
            String str62 = ccw.l;
            ccwVar2.d().getClass();
            str3.getClass();
            return Unit.a;
        }
        i4 = this.q;
        i2 = this.p;
        i5 = this.o;
        str2 = this.n;
        dVar = this.m;
        ccwVar = this.l;
        concat = this.k;
        ccwVar3 = this.j;
        qgg.h0(obj);
        int i7 = i5;
        i3 = i4;
        ccwVar2 = ccwVar3;
        str = str2;
        i = i7;
        a5n I2 = d0.I();
        I2.i(String.valueOf(UUID.randomUUID()));
        I2.h(ccw.b(ccwVar2).a);
        if (((Boolean) ((dfw) ccwVar.a.g).invoke()).booleanValue()) {
        }
        dVar.getClass();
        str.getClass();
        jot j2 = u0.j();
        j2.d();
        u0.f((u0) j2.b, str);
        j2.d();
        u0.g((u0) j2.b, dVar);
        u0 u0Var2 = (u0) j2.b();
        I2.d();
        d0.n((d0) I2.b, u0Var2);
        d0Var = (d0) I2.b();
        if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
        }
        String str52 = ccw.l;
        String p2 = d0Var.p();
        njs b2 = ccw.b(ccwVar2);
        StringBuilder m2 = f1d.m("--> ", concat, " with id=", p2, " at timestamp=");
        m2.append(b2);
        ssg.a(3, str52, m2.toString(), null);
        if (i != 0) {
        }
        x0qVar = ccwVar2.g;
        this.j = ccwVar2;
        this.k = concat;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = 2;
        if (x0qVar.emit(d0Var, this) != nm6Var) {
        }
        return nm6Var;
    }
}

package defpackage;

import com.yandex.media.ynison.service.d0;
import com.yandex.media.ynison.service.r0;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class zbw extends aur implements Function2 {
    public ccw j;
    public String k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public final /* synthetic */ ccw q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbw(ccw ccwVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = ccwVar;
        this.r = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new zbw(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zbw) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ccw ccwVar;
        int i;
        String str;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        ccw ccwVar2;
        d0 d0Var;
        x0q x0qVar;
        String str2;
        nm6 nm6Var = nm6.a;
        int i5 = this.p;
        int i6 = 2;
        Continuation continuation = null;
        if (i5 == 0) {
            qgg.h0(obj);
            ccwVar = this.q;
            AtomicBoolean atomicBoolean = ccwVar.e;
            xdr xdrVar = ccwVar.i;
            if (!atomicBoolean.get()) {
                ssg.a(6, ccw.l, "skip sending updateSessionParams, cause Ynison instance was closed", null);
                return Unit.a;
            }
            boolean booleanValue = ((Boolean) xdrVar.getValue()).booleanValue();
            i = 0;
            str = "updateSessionParams";
            z = this.r;
            if (!booleanValue) {
                ssg.a(3, ccw.l, "--> suspend updateSessionParams", null);
                lf2 lf2Var = new lf2(i6, 16, continuation);
                this.j = ccwVar;
                this.k = "updateSessionParams";
                this.l = 0;
                this.m = 0;
                this.o = z;
                this.n = 0;
                this.p = 1;
                if (zsd.h0(xdrVar, lf2Var, this) != nm6Var) {
                    i4 = 0;
                    i3 = 0;
                    z2 = z;
                }
                return nm6Var;
            }
            i2 = 0;
            i3 = 0;
            ccwVar2 = ccwVar;
            a5n I = d0.I();
            I.i(String.valueOf(UUID.randomUUID()));
            I.h(ccw.b(ccwVar2).a);
            unt i7 = r0.i();
            i7.d();
            r0.f((r0) i7.b);
            if (z) {
                i7.d();
                r0.g((r0) i7.b);
            }
            r0 r0Var = (r0) i7.b();
            I.d();
            d0.m((d0) I.b, r0Var);
            d0Var = (d0) I.b();
            if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
                qee.q(d0Var);
            }
            String str3 = ccw.l;
            String p = d0Var.p();
            njs b = ccw.b(ccwVar2);
            StringBuilder m = f1d.m("--> ", str, " with id=", p, " at timestamp=");
            m.append(b);
            ssg.a(3, str3, m.toString(), null);
            if (i != 0) {
                ccwVar2.h.add(d0Var.p());
            }
            x0qVar = ccwVar2.g;
            this.j = ccwVar2;
            this.k = str;
            this.l = i;
            this.m = i3;
            this.n = i2;
            this.p = 2;
            if (x0qVar.emit(d0Var, this) != nm6Var) {
                str2 = str;
                String str4 = ccw.l;
                ccwVar2.d().getClass();
                str2.getClass();
                return Unit.a;
            }
            return nm6Var;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.k;
            ccwVar2 = this.j;
            qgg.h0(obj);
            String str42 = ccw.l;
            ccwVar2.d().getClass();
            str2.getClass();
            return Unit.a;
        }
        i4 = this.n;
        z2 = this.o;
        i3 = this.m;
        i = this.l;
        str = this.k;
        ccwVar = this.j;
        qgg.h0(obj);
        z = z2;
        i2 = i4;
        ccwVar2 = ccwVar;
        a5n I2 = d0.I();
        I2.i(String.valueOf(UUID.randomUUID()));
        I2.h(ccw.b(ccwVar2).a);
        unt i72 = r0.i();
        i72.d();
        r0.f((r0) i72.b);
        if (z) {
        }
        r0 r0Var2 = (r0) i72.b();
        I2.d();
        d0.m((d0) I2.b, r0Var2);
        d0Var = (d0) I2.b();
        if (((Boolean) ((dfw) ccwVar2.a.c).invoke()).booleanValue()) {
        }
        String str32 = ccw.l;
        String p2 = d0Var.p();
        njs b2 = ccw.b(ccwVar2);
        StringBuilder m2 = f1d.m("--> ", str, " with id=", p2, " at timestamp=");
        m2.append(b2);
        ssg.a(3, str32, m2.toString(), null);
        if (i != 0) {
        }
        x0qVar = ccwVar2.g;
        this.j = ccwVar2;
        this.k = str;
        this.l = i;
        this.m = i3;
        this.n = i2;
        this.p = 2;
        if (x0qVar.emit(d0Var, this) != nm6Var) {
        }
        return nm6Var;
    }
}

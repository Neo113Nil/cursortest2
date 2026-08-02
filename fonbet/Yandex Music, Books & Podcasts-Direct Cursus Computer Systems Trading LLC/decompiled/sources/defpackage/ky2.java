package defpackage;

import com.yandex.music.shared.bdui.core.api.data.DivException;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ky2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ oy2 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky2(oy2 oy2Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = oy2Var;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ky2(this.l, this.m, continuation, 0);
            default:
                return new ky2(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((ky2) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                String str = this.m;
                oy2 oy2Var = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    r2f r2fVar = (r2f) oy2Var.f.get(str);
                    if (r2fVar != null) {
                        this.k = 1;
                        if (r2fVar.j0(this) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                oy2Var.getClass();
                str.getClass();
                rv8 rv8Var = (rv8) oy2Var.e.get(str);
                if (rv8Var != null) {
                    return new wyo(rv8Var);
                }
                vyo vyoVar = new vyo(null, new DivException("cache result is null"));
                ssg.a(5, "BduiDivRepositoryImpl", String.valueOf((Object) null), null);
                return vyoVar;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                String str2 = this.m;
                oy2 oy2Var2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = oy2.a(oy2Var2, str2, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xyo xyoVar = (xyo) obj;
                if (xyoVar instanceof vyo) {
                    vyo vyoVar2 = (vyo) xyoVar;
                    String str3 = vyoVar2.b;
                    ssg.a(6, null, "error when getting div json from BDU: " + str3, vyoVar2.a);
                    py2 py2Var = oy2Var2.d;
                    py2Var.getClass();
                    py2Var.a.a("DivRepository.LoadingBduFailure", uah.g(new Pair("screenIdOrUrl", str2), new Pair(Constants.KEY_MESSAGE, str3)));
                } else {
                    if (!(xyoVar instanceof wyo)) {
                        b6e.s();
                        return null;
                    }
                    rv8 rv8Var2 = (rv8) ((wyo) xyoVar).a;
                    this.k = 2;
                    if (oy2.b(oy2Var2, rv8Var2, str2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                }
                return Unit.a;
        }
    }
}

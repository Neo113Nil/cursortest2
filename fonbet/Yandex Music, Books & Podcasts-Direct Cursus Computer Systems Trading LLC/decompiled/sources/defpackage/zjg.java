package defpackage;

import android.os.Parcel;
import android.util.Base64;
import com.yandex.media.ynison.service.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zjg extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ fkg l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zjg(fkg fkgVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fkgVar;
        this.m = str;
        this.n = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zjg(this.l, this.m, this.n, continuation, 0);
            case 1:
                return new zjg(this.l, this.m, this.n, continuation, 1);
            case 2:
                return new zjg(this.l, this.m, this.n, continuation, 2);
            default:
                return new zjg(this.l, this.m, this.n, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((zjg) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                Continuation continuation = null;
                if (i == 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.b;
                    yjg yjgVar = new yjg(this.l, this.m, continuation, 0);
                    this.k = 1;
                    obj = x97.V(mn7Var, yjgVar, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                oq oqVar = (oq) obj;
                if (Intrinsics.d(oqVar != null ? oqVar.a : null, this.n)) {
                    return oqVar;
                }
                return null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                Continuation continuation2 = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    mn7 mn7Var2 = dm6.b;
                    yjg yjgVar2 = new yjg(this.l, this.m, continuation2, 1);
                    this.k = 1;
                    obj = x97.V(mn7Var2, yjgVar2, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                c01 c01Var = (c01) obj;
                if (Intrinsics.d(c01Var != null ? c01Var.a : null, this.n)) {
                    return c01Var;
                }
                return null;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    obj = fkg.b(this.l, this.m, this.n, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    byte[] decode = Base64.decode(str, 0);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(decode, 0, decode.length);
                    obtain.setDataPosition(0);
                    return obtain;
                }
                return null;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                try {
                    if (i4 == 0) {
                        qgg.h0(obj);
                        fkg fkgVar = this.l;
                        String str2 = this.m;
                        String str3 = this.n;
                        this.k = 1;
                        obj = fkg.b(fkgVar, str2, str3, this);
                        if (obj == nm6Var4) {
                            return nm6Var4;
                        }
                    } else {
                        if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    String str4 = (String) obj;
                    if (str4 != null) {
                        if (str4.length() <= 0) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            return e0.t(Base64.decode(str4, 0));
                        }
                    }
                } catch (bye unused) {
                }
                return null;
        }
    }
}

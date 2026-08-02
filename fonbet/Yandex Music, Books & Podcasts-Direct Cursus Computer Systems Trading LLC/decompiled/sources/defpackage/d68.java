package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.disclaimer.DisclaimerDto;
import com.yandex.music.shared.network.repositories.retrofit.DisclaimerApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class d68 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e68 l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d68(e68 e68Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = e68Var;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d68(this.l, this.m, continuation, 0);
            case 1:
                return new d68(this.l, this.m, continuation, 1);
            default:
                return new d68(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d68) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<DisclaimerDto>> a = ((DisclaimerApi) this.l.a.getValue()).a(this.m);
                    this.k = 1;
                    obj = swf.N(a, this);
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
                bii biiVar = (bii) obj;
                if (biiVar instanceof aii) {
                    return new qj6(hld.O((DisclaimerDto) ((aii) biiVar).a));
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i2 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i2, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<DisclaimerDto>> c = ((DisclaimerApi) this.l.a.getValue()).c(this.m);
                    this.k = 1;
                    obj = swf.N(c, this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                bii biiVar2 = (bii) obj;
                if (biiVar2 instanceof aii) {
                    return new qj6(hld.O((DisclaimerDto) ((aii) biiVar2).a));
                }
                if (!(biiVar2 instanceof xhi)) {
                    if (biiVar2 instanceof yhi) {
                        yhi yhiVar2 = (yhi) biiVar2;
                        return new lj6(yhiVar2.b, yhiVar2.c, yhiVar2.a);
                    }
                    if (biiVar2 instanceof zhi) {
                        return uwf.J((zhi) biiVar2);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar2 = (xhi) biiVar2;
                MusicBackendInvocationError musicBackendInvocationError2 = xhiVar2.c;
                int i4 = xhiVar2.b;
                String name2 = musicBackendInvocationError2.getName();
                if (name2 == null) {
                    name2 = "";
                }
                String message2 = musicBackendInvocationError2.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                return new kj6(i4, musicBackendInvocationError2.getDetails(), name2, message2, xhiVar2.a);
            default:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    Call<MusicBackendResponse<DisclaimerDto>> b = ((DisclaimerApi) this.l.a.getValue()).b(this.m);
                    this.k = 1;
                    obj = swf.N(b, this);
                    if (obj == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                bii biiVar3 = (bii) obj;
                if (biiVar3 instanceof aii) {
                    return new qj6(hld.O((DisclaimerDto) ((aii) biiVar3).a));
                }
                if (!(biiVar3 instanceof xhi)) {
                    if (biiVar3 instanceof yhi) {
                        yhi yhiVar3 = (yhi) biiVar3;
                        return new lj6(yhiVar3.b, yhiVar3.c, yhiVar3.a);
                    }
                    if (biiVar3 instanceof zhi) {
                        return uwf.J((zhi) biiVar3);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar3 = (xhi) biiVar3;
                MusicBackendInvocationError musicBackendInvocationError3 = xhiVar3.c;
                int i6 = xhiVar3.b;
                String name3 = musicBackendInvocationError3.getName();
                if (name3 == null) {
                    name3 = "";
                }
                String message3 = musicBackendInvocationError3.getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                return new kj6(i6, musicBackendInvocationError3.getDetails(), name3, message3, xhiVar3.a);
        }
    }
}

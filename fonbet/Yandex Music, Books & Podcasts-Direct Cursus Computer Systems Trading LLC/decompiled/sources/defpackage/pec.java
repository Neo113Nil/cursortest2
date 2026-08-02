package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes6.dex */
public final class pec implements spj, os3 {
    public final /* synthetic */ zt3 a;

    public /* synthetic */ pec(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        call.getClass();
        r7o r7oVar = z7o.b;
        this.a.resumeWith(new zhi(call.a().a.i, th));
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        Object obj;
        call.getClass();
        l3o l3oVar = response.a;
        String str = l3oVar.c;
        int i = l3oVar.d;
        boolean b = l3oVar.b();
        zt3 zt3Var = this.a;
        if (b) {
            MusicBackendResponse musicBackendResponse = (MusicBackendResponse) response.b;
            Object result = musicBackendResponse != null ? musicBackendResponse.getResult() : null;
            MusicBackendInvocationError error = musicBackendResponse != null ? musicBackendResponse.getError() : null;
            if (result != null) {
                r7o r7oVar = z7o.b;
                zt3Var.resumeWith(new aii(result, musicBackendResponse.getInvocationInfo()));
                return;
            } else {
                if (error != null) {
                    r7o r7oVar2 = z7o.b;
                    zt3Var.resumeWith(new xhi(i, error, swf.L(call)));
                    return;
                }
                String L = swf.L(call);
                str.getClass();
                yhi yhiVar = new yhi(L, i, str);
                r7o r7oVar3 = z7o.b;
                zt3Var.resumeWith(yhiVar);
                return;
            }
        }
        o3o o3oVar = response.c;
        boolean z = o3oVar instanceof m60;
        r3o r3oVar = r3o.d;
        p3o p3oVar = p3o.d;
        if (z) {
            MusicBackendInvocationError musicBackendInvocationError = ((m60) o3oVar).b;
            obj = musicBackendInvocationError != null ? new q3o(musicBackendInvocationError) : p3oVar;
        } else {
            obj = r3oVar;
        }
        if (obj instanceof q3o) {
            r7o r7oVar4 = z7o.b;
            zt3Var.resumeWith(new xhi(i, ((q3o) obj).d, swf.L(call)));
        } else {
            if (!obj.equals(p3oVar) && !obj.equals(r3oVar)) {
                b6e.s();
                return;
            }
            String L2 = swf.L(call);
            str.getClass();
            yhi yhiVar2 = new yhi(L2, i, str);
            r7o r7oVar5 = z7o.b;
            zt3Var.resumeWith(yhiVar2);
        }
    }

    @Override // defpackage.spj
    public void e() {
        this.a.h(null);
    }
}

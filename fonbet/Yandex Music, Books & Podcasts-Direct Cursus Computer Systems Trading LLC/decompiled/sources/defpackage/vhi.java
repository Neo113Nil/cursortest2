package defpackage;

import com.google.gson.JsonParseException;
import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.network.retrofit.NewBackendFormatError;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class vhi implements Call {
    public final Call a;
    public final vao b;
    public final p9 c;
    public final Annotation[] d;
    public final sfm e;
    public final h2q f;
    public final jyr g;

    public vhi(Call call, vao vaoVar, p9 p9Var, Annotation[] annotationArr, sfm sfmVar, h2q h2qVar) {
        call.getClass();
        annotationArr.getClass();
        sfmVar.getClass();
        this.a = call;
        this.b = vaoVar;
        this.c = p9Var;
        this.d = annotationArr;
        this.e = sfmVar;
        this.f = h2qVar;
        this.g = btf.b(new dmg(19, this));
    }

    @Override // retrofit2.Call
    public final void D(os3 os3Var) {
        this.a.D(new iwe(9, this, os3Var));
    }

    @Override // retrofit2.Call
    public final d0o a() {
        d0o a = this.a.a();
        a.getClass();
        return a;
    }

    public final Response b(Response response) {
        MusicBackendResponse musicBackendResponse;
        MusicBackendResponse musicBackendResponse2;
        Object a;
        response.getClass();
        Annotation[] annotationArr = this.d;
        annotationArr.getClass();
        l3o l3oVar = response.a;
        l3o l3oVar2 = l3oVar.j;
        if (l3oVar2 == null) {
            l3oVar2 = l3oVar;
        }
        pxm f0 = y1g.f0(l3oVar2.a, annotationArr);
        o3o o3oVar = response.c;
        p9 p9Var = this.c;
        vj6 d = this.b.d((Type) p9Var.a, annotationArr);
        int i = l3oVar.d;
        sfm sfmVar = this.e;
        if ((100 <= i && i < 200) || l3oVar.b() || (300 <= i && i < 400)) {
            o3o o3oVar2 = (o3o) response.b;
            if (o3oVar2 == null || (a = d.a(o3oVar2)) == null) {
                musicBackendResponse2 = null;
            } else {
                musicBackendResponse2 = a instanceof MusicBackendResponse ? (MusicBackendResponse) a : new MusicBackendResponse(a, null, null);
                if (musicBackendResponse2.getError() != null) {
                    sfmVar.F(zdg.x(response, f0, musicBackendResponse2));
                }
            }
            return (Boolean.FALSE.booleanValue() && i == 304) ? Response.b(null) : Response.c(musicBackendResponse2, l3oVar);
        }
        try {
        } catch (Exception e) {
            if (!(e instanceof IllegalStateException) && !(e instanceof JsonParseException) && !(e instanceof NumberFormatException) && !(e instanceof IOException)) {
                ssg.a(7, "runWithGsonErrorCatching", "Unexpected exception, converter don't should throw it", e);
                throw e;
            }
        }
        if (p9Var instanceof w3o) {
            o3oVar.getClass();
            Object a2 = d.a(o3oVar);
            if (a2 instanceof MusicBackendResponse) {
                musicBackendResponse = (MusicBackendResponse) a2;
            }
            musicBackendResponse = null;
        } else {
            if (!(p9Var instanceof v3o)) {
                throw new x7j();
            }
            vj6 vj6Var = (vj6) this.g.getValue();
            o3oVar.getClass();
            NewBackendFormatError newBackendFormatError = (NewBackendFormatError) vj6Var.a(o3oVar);
            if (newBackendFormatError != null) {
                musicBackendResponse = c9g.V(newBackendFormatError);
            }
            musicBackendResponse = null;
        }
        if (musicBackendResponse != null) {
            sfmVar.F(zdg.x(response, f0, musicBackendResponse));
        } else {
            sfmVar.F(zdg.y(response, f0));
        }
        MusicBackendInvocationError error = musicBackendResponse != null ? musicBackendResponse.getError() : null;
        o3oVar.getClass();
        return Response.a(new m60(error, o3oVar), l3oVar);
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.a.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new vhi(this.a.clone(), this.b, this.c, this.d, this.e, this.f);
    }

    @Override // retrofit2.Call
    public final boolean o() {
        return this.a.o();
    }
}

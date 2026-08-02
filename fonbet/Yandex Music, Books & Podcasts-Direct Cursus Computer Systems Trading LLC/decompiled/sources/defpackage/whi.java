package defpackage;

import com.google.gson.Gson;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class whi extends fs3 {
    public final sfm a;
    public final Gson b;
    public final h2q c;

    public whi(sfm sfmVar, Gson gson, h2q h2qVar) {
        sfmVar.getClass();
        this.a = sfmVar;
        this.b = gson;
        this.c = h2qVar;
    }

    @Override // defpackage.fs3
    public final gs3 a(Type type, Annotation[] annotationArr, vao vaoVar) {
        type.getClass();
        annotationArr.getClass();
        arf a = btf.a(bwf.c, new dmg(this, type));
        if (Intrinsics.d(jf0.I(type), Call.class)) {
            return Intrinsics.d(jf0.I((Type) a.getValue()), MusicBackendResponse.class) ? new xdh(this, annotationArr, vaoVar, a) : new t1f(11, a, annotationArr, this);
        }
        return null;
    }
}

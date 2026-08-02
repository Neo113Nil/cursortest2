package defpackage;

import android.content.Context;
import com.yandex.go.navigator.user_placemark.UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1;
import com.yandex.go.navigator.user_placemark.c;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import java.io.InputStream;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class yr21 implements wa50 {
    public final Context a;
    public final c b;
    public final r4v c;
    public final tt2 d;
    public final hbp0 e;
    public final r0 f;
    public final r0 g;
    public final i3y h;

    public yr21(Context context, c cVar, r4v r4vVar, tt2 tt2Var) {
        this.a = context;
        this.b = cVar;
        this.c = r4vVar;
        this.d = tt2Var;
        final int i = 0;
        this.e = new hbp0(new sls(this) { // from class: xr21
            public final /* synthetic */ yr21 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                yr21 yr21Var = this.b;
                switch (i2) {
                    case 0:
                        yr21Var.d.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        return yr21Var.c(ImageProvider.fromAsset(yr21Var.a, "user_placemark.png", true));
                }
            }
        }, yr21.class.getSimpleName(), null, 4);
        r0 c = bvf0.c(null);
        this.f = c;
        this.g = c;
        final int i2 = 1;
        this.h = a.a(new sls(this) { // from class: xr21
            public final /* synthetic */ yr21 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                yr21 yr21Var = this.b;
                switch (i22) {
                    case 0:
                        yr21Var.d.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        return yr21Var.c(ImageProvider.fromAsset(yr21Var.a, "user_placemark.png", true));
                }
            }
        });
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void attach() {
        hbp0 hbp0Var = this.e;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new UserPlacemarkIconProvider$attach$$inlined$safeCollectIn$1(e.t(this.b.a()), null, this), 3);
    }

    public final ModelProvider c(ImageProvider imageProvider) {
        InputStream open = this.a.getAssets().open("user_placemark_model.obj");
        try {
            ModelProvider fromByteArray = ModelProvider.fromByteArray(rzo.R(open), imageProvider);
            ooc.g(open, null);
            return fromByteArray;
        } finally {
        }
    }

    @Override // defpackage.wa50, defpackage.sc50
    public final void detach() {
        this.e.b();
    }
}

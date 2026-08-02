package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class n19 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ v19 s;
    public final /* synthetic */ gc8 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n19(v19 v19Var, gc8 gc8Var, int i) {
        super(1);
        this.r = i;
        this.s = v19Var;
        this.t = gc8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (!this.s.o() && !Intrinsics.d(this.s.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                    v19 v19Var = this.s;
                    gc8 gc8Var = this.t;
                    d51 d51Var = d51.l;
                    synchronized (d51Var) {
                    }
                    if (qht.a.a()) {
                        v19Var.setPlaceholder(drawable);
                    } else {
                        g23 d = gc8Var.getViewComponent$div_release().d();
                        try {
                            d51Var.p(new k19(d, d.a(), v19Var, drawable, 1));
                        } finally {
                        }
                    }
                }
                return Unit.a;
            default:
                oce oceVar = (oce) obj;
                if (!this.s.o()) {
                    if (oceVar instanceof lce) {
                        v19 v19Var2 = this.s;
                        gc8 gc8Var2 = this.t;
                        Bitmap bitmap = ((lce) oceVar).a;
                        d51 d51Var2 = d51.l;
                        synchronized (d51Var2) {
                        }
                        if (qht.a.a()) {
                            v19Var2.setPreview(bitmap);
                        } else {
                            g23 d2 = gc8Var2.getViewComponent$div_release().d();
                            try {
                                d51Var2.p(new j19(d2, d2.a(), v19Var2, bitmap, 1));
                            } finally {
                            }
                        }
                        v19Var2.p();
                    } else if (oceVar instanceof nce) {
                        v19 v19Var3 = this.s;
                        gc8 gc8Var3 = this.t;
                        PictureDrawable pictureDrawable = ((nce) oceVar).a;
                        d51 d51Var3 = d51.l;
                        synchronized (d51Var3) {
                        }
                        if (qht.a.a()) {
                            v19Var3.setPreview(pictureDrawable);
                        } else {
                            g23 d3 = gc8Var3.getViewComponent$div_release().d();
                            try {
                                d51Var3.p(new k19(d3, d3.a(), v19Var3, pictureDrawable, 2));
                            } finally {
                            }
                        }
                        v19Var3.p();
                    }
                }
                return Unit.a;
        }
    }
}

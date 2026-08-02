package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class s29 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ i39 s;
    public final /* synthetic */ e23 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s29(i39 i39Var, v29 v29Var, e23 e23Var) {
        super(1);
        this.s = i39Var;
        this.t = e23Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Drawable drawable = (Drawable) obj;
                if (!this.s.o() && !Intrinsics.d(this.s.getTag(R.id.image_loaded_flag), Boolean.FALSE)) {
                    i39 i39Var = this.s;
                    gc8 gc8Var = this.t.a;
                    d51 d51Var = d51.l;
                    synchronized (d51Var) {
                    }
                    if (qht.a.a()) {
                        i39Var.setPlaceholder(drawable);
                    } else {
                        g23 d = gc8Var.getViewComponent$div_release().d();
                        f23 a = d.a();
                        try {
                            d51Var.p(new u29(d, a, i39Var, drawable, 1));
                        } catch (Throwable th) {
                            g23.b(a);
                            throw th;
                        }
                    }
                }
                return Unit.a;
            default:
                v29.O(this.s, this.t.a, (Bitmap) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s29(v29 v29Var, i39 i39Var, e23 e23Var) {
        super(1);
        this.s = i39Var;
        this.t = e23Var;
    }
}

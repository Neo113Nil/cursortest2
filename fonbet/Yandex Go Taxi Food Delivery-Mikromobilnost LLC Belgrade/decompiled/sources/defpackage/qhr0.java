package defpackage;

import com.airbnb.lottie.LottieDrawable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class qhr0 implements ehe {
    public final String a;
    public final List b;
    public final boolean c;

    public qhr0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.ehe
    public final uee a(LottieDrawable lottieDrawable, nsz nszVar, l35 l35Var) {
        return new fge(lottieDrawable, l35Var, this, nszVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}

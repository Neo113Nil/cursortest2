package defpackage;

import android.graphics.Bitmap;
import com.yandex.go.image.domain.requests.a;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;

/* loaded from: classes14.dex */
public final class zg21 extends qxy {
    public final String a;
    public final yg21 b;
    public final a c;
    public volatile boolean d;
    public volatile b2f e;

    public zg21(pav pavVar, String str, float f, float f2, Supplier supplier) {
        this(pavVar.b().b(str).c().e(new rfv(f, f2)), String.format(Locale.US, "remote-bitmap:%s-c:%fx%f", Arrays.copyOf(new Object[]{str, Float.valueOf(f), Float.valueOf(f2)}, 3)), str, supplier);
    }

    @Override // defpackage.qxy
    public final boolean a() {
        a aVar = this.c;
        return aVar.a.f().k0() || aVar.a.b();
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        return this.a;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        return (Bitmap) this.b.get();
    }

    public zg21(pav pavVar, String str, Supplier supplier) {
        this(pavVar.b().b(str).c().g(0, 0), String.format(Locale.US, "remote-bitmap:%s", Arrays.copyOf(new Object[]{str}, 1)), str, supplier);
    }

    public zg21(g16 g16Var, String str, String str2, Supplier supplier) {
        super(true);
        this.a = str;
        this.c = g16Var.h(new wpy0(20, this));
        this.b = new yg21(this, str2, supplier);
    }
}

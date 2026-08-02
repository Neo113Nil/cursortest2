package defpackage;

import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;
import kotlin.a;

/* loaded from: classes14.dex */
public final class u3c0 extends qxy {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final i3y c;
    public final Supplier d;

    public u3c0(ImageProvider imageProvider, ewi ewiVar) {
        super(true);
        this.b = String.format(Locale.US, "transform:%s:%s", Arrays.copyOf(new Object[]{imageProvider.getId(), String.valueOf(ewiVar.a)}, 2));
        this.d = imageProvider instanceof qxy ? new c2f(imageProvider, 1) : new ydf(13);
        this.c = a.a(new zr01(4, ewiVar, imageProvider));
    }

    @Override // defpackage.qxy
    public final boolean a() {
        switch (this.a) {
            case 0:
                return ((qxy) this.d).a();
            default:
                return ((Boolean) this.d.get()).booleanValue();
        }
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public final String getId() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    /* renamed from: getImage */
    public final Bitmap get$image() {
        int i = this.a;
        i3y i3yVar = this.c;
        switch (i) {
            case 0:
                qxy qxyVar = (qxy) this.d;
                if (!qxyVar.a()) {
                    break;
                } else {
                    break;
                }
        }
        return (Bitmap) i3yVar.getValue();
    }

    public u3c0(zuj0 zuj0Var, qxy qxyVar, int i) {
        super(true);
        this.d = qxyVar;
        this.b = String.format(Locale.US, "placeholder-wrapper:%s-%d", Arrays.copyOf(new Object[]{qxyVar.getId(), Integer.valueOf(i)}, 2));
        this.c = a.a(new ys0(zuj0Var, i, 9));
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.go.image.api.domain.models.ImageLoadPriority;
import com.yandex.go.image.domain.requests.a;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.image.BitmapRequest$ForceCacheType;

/* loaded from: classes.dex */
public final class xnq implements g16 {
    public final vit a;
    public g16 b;
    public tbv c;

    public xnq(g16 g16Var, vit vitVar) {
        this.a = vitVar;
        this.b = g16Var;
    }

    @Override // defpackage.g16
    public final Object a(Continuation continuation) {
        return this.b.a(continuation);
    }

    @Override // defpackage.g16
    public final g16 b(String str) {
        this.b = this.b.b(str);
        return this;
    }

    @Override // defpackage.g16
    public final g16 c() {
        this.b = this.b.c();
        return this;
    }

    @Override // defpackage.g16
    public final g16 d(ImageLoadPriority imageLoadPriority) {
        this.b = this.b.d(imageLoadPriority);
        return this;
    }

    @Override // defpackage.g16
    public final g16 e(tfv tfvVar) {
        this.b = this.b.e(tfvVar);
        return this;
    }

    @Override // defpackage.g16
    public final tpr f() {
        return this.b.f();
    }

    @Override // defpackage.g16
    public final g16 g(int i, int i2) {
        this.b = this.b.g(i, i2);
        return this;
    }

    @Override // defpackage.g16
    public final a h(f16 f16Var) {
        String str;
        Uri parse;
        String queryParameter;
        String fragment;
        tbv tbvVar = this.c;
        return (tbvVar == null || !(tbvVar instanceof qbv) || (((queryParameter = (parse = Uri.parse((str = ((qbv) tbvVar).b))).getQueryParameter("isFeedImage")) == null || !queryParameter.equalsIgnoreCase("true")) && ((fragment = parse.getFragment()) == null || !evu0.y(fragment, "isFeedImage=true", true)))) ? this.b.h(f16Var) : this.b.h(new wnq(str, this.a, f16Var));
    }

    @Override // defpackage.g16
    public final g16 i(tbv tbvVar) {
        this.c = tbvVar;
        this.b = this.b.i(tbvVar);
        return this;
    }

    @Override // defpackage.g16
    public final g16 j(BitmapRequest$ForceCacheType bitmapRequest$ForceCacheType) {
        this.b = this.b.j(bitmapRequest$ForceCacheType);
        return this;
    }

    @Override // defpackage.g16
    public final g16 k(int i) {
        this.b = this.b.k(i);
        return this;
    }
}

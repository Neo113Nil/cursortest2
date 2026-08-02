package w2;

import A1.AbstractC0269k;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.C3887s;
import h.C4543G;
import r2.C4906k;

/* loaded from: classes.dex */
public final class u extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final x2.l f41702v;

    /* renamed from: w, reason: collision with root package name */
    public final String f41703w;

    /* renamed from: x, reason: collision with root package name */
    public final C4543G f41704x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, String str2, C4543G c4543g) {
        super(4);
        String E8 = C4906k.f40186C.f40191c.E(context, str);
        this.f41702v = new x2.l(context, E8);
        this.f41703w = str2;
        this.f41704x = c4543g;
    }

    @Override // A1.AbstractC0269k
    public final void k() {
        String str = this.f41703w;
        C4543G c4543g = this.f41704x;
        if (c4543g == null) {
            this.f41702v.a(null, str);
        } else {
            new C3887s((x2.h) c4543g.f37843n, this.f41702v, AbstractC3436jg.f32059e, null, null, 10).a(str);
        }
    }
}

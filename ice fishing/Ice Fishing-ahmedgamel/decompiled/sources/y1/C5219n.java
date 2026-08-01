package y1;

import B1.I;
import android.content.Context;
import android.net.Uri;
import t1.AbstractC5032a;

/* renamed from: y1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5219n implements InterfaceC5223r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41816a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41817b;

    public C5219n(Context context, int i) {
        this.f41816a = i;
        switch (i) {
            case 1:
                this.f41817b = context.getApplicationContext();
                break;
            case 2:
                this.f41817b = context.getApplicationContext();
                break;
            default:
                this.f41817b = context;
                break;
        }
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        switch (this.f41816a) {
            case 0:
                return AbstractC5032a.a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC5032a.a(uri) && !uri.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f8444a);
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC5032a.a(uri2) && uri2.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f8444a);
        }
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        Long l9;
        switch (this.f41816a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C5222q(new M1.d(uri), new C5218m(0, this.f41817b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || i > 512 || i6 > 384) {
                    return null;
                }
                M1.d dVar = new M1.d(uri2);
                Context context = this.f41817b;
                return new C5222q(dVar, t1.c.c(context, uri2, new t1.b(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || i > 512 || i6 > 384 || (l9 = (Long) hVar.c(I.f109d)) == null || l9.longValue() != -1) {
                    return null;
                }
                M1.d dVar2 = new M1.d(uri3);
                Context context2 = this.f41817b;
                return new C5222q(dVar2, t1.c.c(context2, uri3, new t1.b(context2.getContentResolver(), 1)));
        }
    }
}

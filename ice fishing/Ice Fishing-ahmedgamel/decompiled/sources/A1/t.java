package A1;

import android.content.Context;
import android.net.Uri;
import v1.AbstractC5096a;

/* loaded from: classes.dex */
public final class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f87b;

    public t(Context context, int i) {
        this.f86a = i;
        switch (i) {
            case 1:
                this.f87b = context.getApplicationContext();
                break;
            case 2:
                this.f87b = context.getApplicationContext();
                break;
            default:
                this.f87b = context;
                break;
        }
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        switch (this.f86a) {
            case 0:
                return AbstractC5096a.a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC5096a.a(uri) && !uri.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f9230a);
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC5096a.a(uri2) && uri2.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f9230a);
        }
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        Long l9;
        switch (this.f86a) {
            case 0:
                Uri uri = (Uri) obj;
                return new w(new O1.d(uri), new s(0, this.f87b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384) {
                    return null;
                }
                O1.d dVar = new O1.d(uri2);
                Context context = this.f87b;
                return new w(dVar, C0263e.c(context, uri2, new v1.b(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384 || (l9 = (Long) hVar.c(D1.H.f523d)) == null || l9.longValue() != -1) {
                    return null;
                }
                O1.d dVar2 = new O1.d(uri3);
                Context context2 = this.f87b;
                return new w(dVar2, C0263e.c(context2, uri3, new v1.b(context2.getContentResolver(), 1)));
        }
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class qwh implements kci {
    public final /* synthetic */ int a;
    public final Context b;

    public qwh(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        Long l;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return new jci(new vhj(uri), new pwh(0, this.b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                vhj vhjVar = new vhj(uri2);
                Context context = this.b;
                return new jci(vhjVar, cac.c(context, uri2, new ix6(1, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) pwjVar.c(oau.d)) == null || l.longValue() != -1) {
                    return null;
                }
                vhj vhjVar2 = new vhj(uri3);
                Context context2 = this.b;
                return new jci(vhjVar2, cac.c(context2, uri3, new sld(2, context2.getContentResolver())));
        }
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return o5g.J((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return o5g.J(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return o5g.J(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}

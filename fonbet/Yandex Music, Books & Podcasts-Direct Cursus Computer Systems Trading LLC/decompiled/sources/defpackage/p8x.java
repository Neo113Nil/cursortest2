package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class p8x extends AsyncTask {
    public static final msg c = new msg("FetchBitmapTask", null);
    public final vbx a;
    public final n3m b;

    public p8x(Context context, int i, int i2, n3m n3mVar) {
        vbx vbxVar;
        this.b = n3mVar;
        Context applicationContext = context.getApplicationContext();
        p3x p3xVar = new p3x(this);
        msg msgVar = w0x.a;
        try {
            d1x b = w0x.b(applicationContext.getApplicationContext());
            zhj zhjVar = new zhj(applicationContext.getApplicationContext());
            Parcel N0 = b.N0(b.M0(), 8);
            int readInt = N0.readInt();
            N0.recycle();
            vbxVar = readInt >= 233700000 ? b.W0(zhjVar, new zhj(this), p3xVar, i, i2) : b.V0(new zhj(this), p3xVar, i, i2);
        } catch (RemoteException e) {
            e = e;
            w0x.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", d1x.class.getSimpleName());
            vbxVar = null;
            this.a = vbxVar;
        } catch (odi e2) {
            e = e2;
            w0x.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", d1x.class.getSimpleName());
            vbxVar = null;
            this.a = vbxVar;
        }
        this.a = vbxVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        vbx vbxVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (vbxVar = this.a) != null) {
            try {
                p9x p9xVar = (p9x) vbxVar;
                Parcel M0 = p9xVar.M0();
                y4x.c(M0, uri);
                Parcel N0 = p9xVar.N0(M0, 1);
                Bitmap bitmap = (Bitmap) y4x.a(N0, Bitmap.CREATOR);
                N0.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", vbx.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        n3m n3mVar = this.b;
        if (n3mVar != null) {
            a0x a0xVar = (a0x) n3mVar.f;
            if (a0xVar != null) {
                a0xVar.b(bitmap);
            }
            n3mVar.e = null;
        }
    }
}

package defpackage;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* loaded from: classes.dex */
public final class s9c extends AsyncTask {
    public final String a;
    public final File b;
    public final r9c c;

    public s9c(String str, File file, r9c r9cVar) {
        str.getClass();
        this.a = str;
        this.b = file;
        this.c = r9cVar;
    }

    public final Boolean a(String... strArr) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            strArr.getClass();
            try {
                URL url = new URL(this.a);
                URLConnection openConnection = url.openConnection();
                openConnection.getClass();
                int contentLength = openConnection.getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (!set.contains(this) && booleanValue) {
                try {
                    this.c.a(this.b);
                } catch (Throwable th) {
                    bp6.a(this, th);
                }
            }
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }
}

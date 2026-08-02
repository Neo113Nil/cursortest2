package defpackage;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class jbv extends AsyncTask {
    public Exception[] a = new Exception[0];
    public final String b;
    public final Bundle c;
    public final /* synthetic */ lbv d;

    public jbv(lbv lbvVar, String str, Bundle bundle) {
        this.d = lbvVar;
        this.b = str;
        this.c = bundle;
    }

    public final String[] a(Void... voidArr) {
        if (!bp6.a.contains(this)) {
            try {
                voidArr.getClass();
                String[] stringArray = this.c.getStringArray("media");
                if (stringArray != null) {
                    String[] strArr = new String[stringArray.length];
                    this.a = new Exception[stringArray.length];
                    CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = ja.l;
                    ja N = n7w.N();
                    try {
                        int length = stringArray.length;
                        for (int i = 0; i < length; i++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((pod) it.next()).cancel(true);
                                }
                            } else {
                                Uri parse = Uri.parse(stringArray[i]);
                                if (gvt.E(parse)) {
                                    strArr[i] = parse.toString();
                                    countDownLatch.countDown();
                                } else {
                                    concurrentLinkedQueue.add(qwp.d0(N, parse, new ibv(this, strArr, i, countDownLatch)).d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((pod) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.c;
        lbv lbvVar = this.d;
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = lbvVar.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : this.a) {
                if (exc != null) {
                    lbvVar.d(exc);
                    return;
                }
            }
            if (strArr == null) {
                lbvVar.d(new c3c("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            asList.getClass();
            if (asList.contains(null)) {
                lbvVar.d(new c3c("Failed to stage photos for web dialog"));
                return;
            }
            gvt.L(bundle, new JSONArray((Collection) asList));
            Collection collection = qjp.a;
            lbvVar.a = gvt.a(String.format("m.%s", Arrays.copyOf(new Object[]{j3c.p}, 1)), j3c.e() + "/dialog/" + this.b, bundle).toString();
            ImageView imageView = lbvVar.f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Drawable drawable = imageView.getDrawable();
            drawable.getClass();
            lbvVar.e((drawable.getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            b((String[]) obj);
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }
}

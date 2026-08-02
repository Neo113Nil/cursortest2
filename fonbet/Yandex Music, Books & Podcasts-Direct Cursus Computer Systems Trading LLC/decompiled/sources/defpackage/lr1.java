package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lr1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public lr1(URL url, xqn xqnVar, String str, ReentrantLock reentrantLock, Condition condition) {
        this.a = 6;
        this.b = url;
        this.c = xqnVar;
        this.d = str;
        this.e = reentrantLock;
        this.f = condition;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable v6eVar;
        Runnable runnable;
        long j;
        Map O;
        sgr sgrVar;
        switch (this.a) {
            case 0:
                qr1 qr1Var = (qr1) this.b;
                piq piqVar = qr1Var.d;
                if (piqVar != null) {
                    piqVar.c();
                    dt1 dt1Var = qr1Var.e;
                    if (dt1Var != null) {
                        dt1Var.close();
                    }
                }
                ((nsh) this.f).K((or1) this.c, new TimeoutException(), null, (sr1) this.d, (c6e) this.e);
                return;
            case 1:
                qdc qdcVar = (qdc) this.b;
                viq viqVar = (viq) this.c;
                nr1 nr1Var = (nr1) this.d;
                Exception exc = (Exception) this.e;
                Object obj = this.f;
                if (exc != null ? viqVar.k(exc, null) : viqVar.k(null, obj)) {
                    String str = (String) obj;
                    if (exc != null) {
                        runnable = new v6e(qdcVar, exc, 0);
                    } else {
                        try {
                            j = nr1Var.k;
                            O = u2x.O(str);
                        } catch (Exception e) {
                            v6eVar = new v6e(qdcVar, e, 1);
                        }
                        if (j != 200) {
                            v6eVar = new w6e(qdcVar, O, j, nr1Var);
                            runnable = v6eVar;
                        } else {
                            runnable = new pv7(13, qdcVar, O);
                        }
                    }
                    jjo.b(runnable);
                    return;
                }
                return;
            case 2:
                IBinder binder = ((Messenger) ((mka) this.b).a).getBinder();
                awc awcVar = (awc) this.f;
                jhh jhhVar = (jhh) ((nuh) awcVar.a).e.get(binder);
                if (jhhVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + ((String) this.c));
                    return;
                }
                HashMap hashMap = jhhVar.f;
                nuh nuhVar = (nuh) awcVar.a;
                String str2 = (String) this.c;
                IBinder iBinder = (IBinder) this.d;
                Bundle bundle = (Bundle) this.e;
                List<z4k> list = (List) hashMap.get(str2);
                if (list == null) {
                    list = new ArrayList();
                }
                for (z4k z4kVar : list) {
                    if (iBinder == z4kVar.a) {
                        Bundle bundle2 = (Bundle) z4kVar.b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            vq1.B(bundle2);
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                list.add(new z4k(iBinder, bundle));
                hashMap.put(str2, list);
                mr1 mr1Var = new mr1(nuhVar, str2, jhhVar, str2, bundle);
                nuhVar.f = jhhVar;
                if (bundle == null) {
                    mr1Var.c();
                } else {
                    mr1Var.b = 1;
                    mr1Var.c();
                }
                nuhVar.f = null;
                if (mr1Var.a) {
                    nuhVar.f = null;
                    return;
                } else {
                    xq0.q(vz1.s(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), jhhVar.a, " id=", str2));
                    return;
                }
            case 3:
                String str3 = (String) this.c;
                IBinder binder2 = ((Messenger) ((h4b) this.b).a).getBinder();
                n7b n7bVar = (n7b) this.f;
                khh khhVar = (khh) ((bih) n7bVar.a).d.get(binder2);
                if (khhVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str3);
                    return;
                }
                HashMap hashMap2 = khhVar.e;
                bih bihVar = (bih) n7bVar.a;
                IBinder iBinder2 = (IBinder) this.d;
                Bundle bundle3 = (Bundle) this.e;
                List<z4k> list2 = (List) hashMap2.get(str3);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                for (z4k z4kVar2 : list2) {
                    if (iBinder2 == z4kVar2.a) {
                        Bundle bundle4 = (Bundle) z4kVar2.b;
                        if (bundle3 == bundle4) {
                            return;
                        }
                        if (bundle3 == null) {
                            if (bundle4.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle4 == null) {
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == bundle4.getInt("android.media.browse.extra.PAGE", -1) && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                list2.add(new z4k(iBinder2, bundle3));
                hashMap2.put(str3, list2);
                bihVar.e(str3, khhVar, bundle3);
                return;
            case 4:
                Bundle bundle5 = (Bundle) this.d;
                IBinder binder3 = ((Messenger) ((mka) this.b).a).getBinder();
                awc awcVar2 = (awc) this.f;
                jhh jhhVar2 = (jhh) ((nuh) awcVar2.a).e.get(binder3);
                if (jhhVar2 == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) this.c) + ", extras=" + bundle5);
                    return;
                }
                nuh nuhVar2 = (nuh) awcVar2.a;
                i8o i8oVar = (i8o) this.e;
                nuhVar2.f = jhhVar2;
                if (bundle5 == null) {
                    Bundle bundle6 = Bundle.EMPTY;
                }
                i8oVar.b(-1, null);
                nuhVar2.f = null;
                return;
            case 5:
                if (((khh) ((bih) ((n7b) this.f).a).d.get(((Messenger) ((h4b) this.b).a).getBinder())) != null) {
                    ((i8o) this.e).b(-1, null);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + ((String) this.c) + ", extras=" + ((Bundle) this.d));
                return;
            case 6:
                Condition condition = (Condition) this.f;
                ReentrantLock reentrantLock = (ReentrantLock) this.e;
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    URLConnection openConnection = ((URL) this.b).openConnection();
                    if (openConnection == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                    try {
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            inputStream.getClass();
                            String F = t7g.F(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), RemoteCameraConfig.Notification.ID));
                            httpURLConnection.getInputStream().close();
                            ((xqn) this.c).a = new JSONObject(F).optString((String) this.d);
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            try {
                                condition.signal();
                            } finally {
                            }
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            reentrantLock.lock();
                            try {
                                condition.signal();
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Exception e2) {
                        String name = vnj.class.getName();
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Error getting public key";
                        }
                        Log.d(name, message);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                        } finally {
                        }
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th2) {
                    bp6.a(this, th2);
                    return;
                }
            default:
                for (lao laoVar : (Collection) this.b) {
                    if (laoVar != ((lao) this.c)) {
                        laoVar.a.f(x7h.G);
                    }
                }
                Future future = (Future) this.d;
                if (future != null) {
                    future.cancel(false);
                }
                Future future2 = (Future) this.e;
                if (future2 != null) {
                    future2.cancel(false);
                }
                x7h x7hVar = (x7h) this.f;
                g06 g06Var = ((j8h) x7hVar.D.a).E;
                synchronized (g06Var.a) {
                    try {
                        ((HashSet) g06Var.b).remove(x7hVar);
                        if (((HashSet) g06Var.b).isEmpty()) {
                            sgrVar = (sgr) g06Var.c;
                            g06Var.b = new HashSet();
                        } else {
                            sgrVar = null;
                        }
                    } finally {
                    }
                }
                if (sgrVar != null) {
                    ((j8h) g06Var.d).D.b(sgrVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ lr1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.f = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public lr1(nsh nshVar, qdc qdcVar, viq viqVar, nr1 nr1Var, Exception exc, Object obj) {
        this.a = 1;
        this.b = qdcVar;
        this.c = viqVar;
        this.d = nr1Var;
        this.e = exc;
        this.f = obj;
    }
}

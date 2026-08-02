package defpackage;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.internal.identity.zzv;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.tasks.Task;
import java.io.DataInputStream;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.collections.a;
import kotlin.sequences.b;
import org.xmlpull.v1.XmlPullParser;
import yads.lv1;
import yads.xa2;

/* loaded from: classes7.dex */
public final class sl81 implements vj81, wz81, oy81, pui0, muy, wx60, dsa1, vv4, ewb1 {
    public final Object a;

    public sl81(gh61 gh61Var) {
        this.a = new pl61(gh61Var);
    }

    public static hg81 d(int i, DataInputStream dataInputStream) {
        g581 d;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            g871 g871Var = new g871();
            g871Var.a.put("exo_len", Long.valueOf(readLong));
            g871Var.b.remove("exo_len");
            d = g581.c.b(g871Var);
        } else {
            d = vmn0.d(dataInputStream);
        }
        return new hg81(readInt, readUTF, d);
    }

    public LinkedHashMap a(Set set) {
        List J0;
        e971 e971Var = (e971) this.a;
        synchronized (e971Var.a) {
            J0 = a.J0(e971Var.d);
        }
        t5r g = b.g(new h73(1, J0), new xa2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s5r s5rVar = new s5r(g);
        while (s5rVar.hasNext()) {
            y271 y271Var = (y271) s5rVar.next();
            String str = y271Var.a.b;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = qv10.w(str, linkedHashMap);
            }
            ((List) obj).add(y271Var.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.pui0
    public void accept(Object obj, Object obj2) {
        cx91 cx91Var = (cx91) obj;
        zm2 zm2Var = y591.k;
        PendingIntent pendingIntent = (PendingIntent) this.a;
        cx91Var.getClass();
        cvw.l(pendingIntent);
        ((zzv) cx91Var.i()).zzl(pendingIntent);
        ((atx0) obj2).a(null);
    }

    @Override // defpackage.vj81
    public void b(fj71 fj71Var, jq81 jq81Var) {
        ((lv1) this.a).setClickListener(new an81(fj71Var, jq81Var));
    }

    @Override // defpackage.dsa1
    public void c(xxa1 xxa1Var, File file, boolean z) {
        cr71 cr71Var = (cr71) this.a;
        ((HashSet) cr71Var.c).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) cr71Var.w).set(false);
    }

    @Override // defpackage.muy
    public /* synthetic */ void e(Object obj) {
        ((LocationCallback) obj).onLocationAvailability((LocationAvailability) this.a);
    }

    @Override // defpackage.vv4
    public int f() {
        return ((zzyb) this.a).zzb();
    }

    @Override // defpackage.oy81
    public void g(int i) {
        ConnectionResult connectionResult;
        px81 px81Var = (px81) this.a;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            if (!px81Var.E && (connectionResult = px81Var.D) != null && connectionResult.isSuccess()) {
                px81Var.E = true;
                px81Var.x.onConnectionSuspended(i);
                lock.unlock();
            }
            px81Var.E = false;
            px81Var.b.g(i);
            px81Var.D = null;
            px81Var.C = null;
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.vv4
    public int getFormat() {
        return ((zzyb) this.a).zza();
    }

    @Override // defpackage.vv4
    public byte[] h() {
        return ((zzyb) this.a).zzn();
    }

    public void i(ri81 ri81Var, String str) {
        List list = (List) ri81Var.a().get(str);
        if (list != null) {
            ((q191) this.a).a(list, kotlin.collections.b.f());
        }
    }

    @Override // defpackage.wz81
    public boolean isConnected() {
        ty81 ty81Var = ((d) this.a).w;
        return ty81Var != null && ty81Var.g();
    }

    @Override // defpackage.oy81
    public void j(Bundle bundle) {
        px81 px81Var = (px81) this.a;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            Bundle bundle2 = px81Var.B;
            if (bundle2 == null) {
                px81Var.B = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            px81Var.C = ConnectionResult.RESULT_SUCCESS;
            px81.j(px81Var);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.vv4
    public Rect k() {
        Point[] zzo = ((zzyb) this.a).zzo();
        if (zzo == null) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (Point point : zzo) {
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    public t091 l() {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a;
        Set set = yst.a;
        synchronized (set) {
        }
        return new t091(signInHubActivity, set);
    }

    @Override // defpackage.vv4
    public String m() {
        return ((zzyb) this.a).zzm();
    }

    @Override // defpackage.vv4
    public Point[] n() {
        return ((zzyb) this.a).zzo();
    }

    @Override // defpackage.oy81
    public void o(ConnectionResult connectionResult) {
        px81 px81Var = (px81) this.a;
        Lock lock = px81Var.F;
        lock.lock();
        try {
            px81Var.C = connectionResult;
            px81.j(px81Var);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        mk20 mk20Var = (mk20) this.a;
        ga0 ga0Var = hv20.x;
        mk20Var.close();
    }

    public void p(udy udyVar) {
        com.google.android.gms.dynamic.a aVar = (com.google.android.gms.dynamic.a) this.a;
        aVar.a = udyVar;
        Iterator it = aVar.c.iterator();
        while (it.hasNext()) {
            ((uz81) it.next()).zab();
        }
        aVar.c.clear();
        aVar.b = null;
    }

    public Object q() {
        t0 t0Var = (t0) this.a;
        ContentResolver contentResolver = t0Var.a;
        Uri uri = t0Var.b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, t0.j, null, null, null);
                try {
                    if (query == null) {
                        Map map = Collections.EMPTY_MAP;
                        acquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = query.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map w53Var = count <= 256 ? new w53(count) : new HashMap(count, 1.0f);
                    while (query.moveToNext()) {
                        w53Var.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return w53Var;
                    }
                    Map map3 = Collections.EMPTY_MAP;
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException unused) {
                Map map4 = Collections.EMPTY_MAP;
                acquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    @Override // defpackage.ewb1
    public void zza() {
        c491 c491Var = (c491) this.a;
        int i = 0;
        while (true) {
            XmlPullParser xmlPullParser = c491Var.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                c491Var.b("split-install-error", new fvb1(c491Var));
                return;
            }
            if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i))) {
                gr81 gr81Var = c491Var.b;
                String attributeValue = xmlPullParser.getAttributeValue(i);
                Integer num = (Integer) l391.c.get(attributeValue);
                if (num == null) {
                    ny61.g(String.valueOf(attributeValue).concat(" is unknown error."));
                    return;
                }
                gr81Var.b = num;
            }
            i++;
        }
    }

    public /* synthetic */ sl81(Object obj) {
        this.a = obj;
    }

    public sl81(Context context) {
        this.a = new q191(context);
    }

    public sl81(File file) {
        this.a = new rr41(file);
    }
}

package ru.yandex.music.cover.upload;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.f0;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.AssertionsKt;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.a0g;
import defpackage.bfj;
import defpackage.bnt;
import defpackage.c9g;
import defpackage.cg6;
import defpackage.cnt;
import defpackage.dm6;
import defpackage.dnt;
import defpackage.hag;
import defpackage.hft;
import defpackage.iz7;
import defpackage.jyr;
import defpackage.l18;
import defpackage.l1b;
import defpackage.lpg;
import defpackage.lxc;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.pot;
import defpackage.qgg;
import defpackage.qot;
import defpackage.rjq;
import defpackage.ssg;
import defpackage.tnt;
import defpackage.um6;
import defpackage.v0r;
import defpackage.v7g;
import defpackage.wfs;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y7g;
import defpackage.z66;
import defpackage.z7o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class UploadCoverService extends Service {
    public static final /* synthetic */ int f = 0;
    public final jyr a = l18.b.b(hag.I(tnt.class), true);
    public final rjq b;
    public final um6 c;
    public final ArrayList d;
    public final HashMap e;

    public UploadCoverService() {
        rjq rjqVar = new rjq(false);
        this.b = rjqVar;
        mn7 mn7Var = dm6.b;
        mn7Var.getClass();
        this.c = new um6(rjqVar, mn7Var);
        this.d = new ArrayList();
        this.e = new HashMap();
        rjqVar.b(new wfs(12, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(UploadCoverService uploadCoverService, pot potVar, cg6 cg6Var) {
        qot qotVar;
        int i;
        a0g dntVar;
        if (cg6Var instanceof qot) {
            qotVar = (qot) cg6Var;
            int i2 = qotVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qotVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qotVar.j;
                nm6 nm6Var = nm6.a;
                i = qotVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return ((z7o) obj).a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                File file = potVar.d;
                if (file != null) {
                    dntVar = new bnt(file);
                } else {
                    Uri uri = potVar.c;
                    dntVar = uri != null ? new dnt(uri) : cnt.a;
                }
                tnt tntVar = (tnt) uploadCoverService.a.getValue();
                String str = potVar.a;
                String str2 = potVar.b;
                qotVar.l = 1;
                Object b = tntVar.b(str, str2, dntVar, qotVar);
                return b == nm6Var ? nm6Var : b;
            }
        }
        qotVar = new qot(uploadCoverService, cg6Var);
        Object obj2 = qotVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qotVar.l;
        if (i == 0) {
        }
    }

    public final Notification b() {
        ArrayList arrayList = this.d;
        Integer valueOf = Integer.valueOf(arrayList.size());
        Long l = 1350L;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l = Long.valueOf(l.longValue() + ((pot) it.next()).e);
        }
        int intValue = valueOf.intValue();
        long longValue = l.longValue();
        bfj bfjVar = bfj.d;
        f0 f0Var = new f0(this, "ru.yandex.music.notifications.cache");
        f0Var.K.icon = 2131232117;
        f0Var.p = 1;
        int i = 0;
        f0Var.q = 0;
        f0Var.r = true;
        f0Var.e = f0.c(getResources().getQuantityString(R.plurals.playlist_upload_cover_notification_title, intValue, Integer.valueOf(intValue)));
        f0Var.g(2, true);
        if (longValue > 0) {
            String[] strArr = {"byte", "KB", "MB", "GB"};
            float f2 = longValue;
            while (f2 > 1024.0f && i < 3) {
                f2 /= 1024.0f;
                i++;
            }
            f0Var.d(String.format(Locale.getDefault(), "%.2f %s", Float.valueOf(f2), strArr[i]));
        }
        return v7g.o(f0Var);
    }

    public final void c() {
        boolean z;
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                z = false;
                while (it.hasNext()) {
                    pot potVar = (pot) it.next();
                    if (!z) {
                        Collection collection = (Collection) this.e.get(new Pair(potVar.a, potVar.b));
                        if (collection != null && !collection.isEmpty()) {
                            break;
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    startForeground(5, b());
                    return;
                }
                NotificationManager g = l1b.g(this);
                if (g != null) {
                    y7g.K(g, 5, b());
                    return;
                }
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
            return;
        }
        NotificationManager g2 = l1b.g(this);
        if (g2 != null) {
            try {
                g2.cancel(5);
            } catch (Throwable th) {
                if (!c9g.J(th)) {
                    throw th;
                }
                ssg.a(6, null, "Dead system raise", th);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new lpg(this);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b.g();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.V();
        super.onDestroy();
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        intent.getClass();
        super.onStartCommand(intent, i, i2);
        pot potVar = (pot) intent.getParcelableExtra("extra.upload.job");
        ArrayList arrayList = this.d;
        Continuation continuation = null;
        if (potVar == null) {
            Assertions.throwOrSkip("UploadCoverService", new FailedAssertionException("Invalid upload cover start intent"));
            if (arrayList.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    stopForeground(true);
                } else {
                    NotificationManager g = l1b.g(this);
                    if (g != null) {
                        try {
                            g.cancel(5);
                        } catch (Throwable th) {
                            if (!c9g.J(th)) {
                                throw th;
                            }
                            ssg.a(6, null, "Dead system raise", th);
                        }
                    }
                }
                stopSelf();
            }
            return 2;
        }
        Uri uri = potVar.c;
        File file = potVar.d;
        long j = 0;
        if (uri != null) {
            try {
                Cursor query = getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
                if (query != null) {
                    try {
                        int columnIndex = query.getColumnIndex("_size");
                        if (query.getCount() >= 1 && columnIndex != -1) {
                            query.moveToFirst();
                            long j2 = query.getLong(columnIndex);
                            query.close();
                            j = j2;
                        }
                        query.close();
                    } catch (Throwable th2) {
                        query.close();
                        throw th2;
                    }
                }
            } catch (IllegalArgumentException e) {
                AssertionsKt.fail(e, new hft(12));
            } catch (SecurityException e2) {
                AssertionsKt.fail(e2, new hft(11));
            }
        } else if (file != null) {
            j = file.length();
        }
        potVar.e = j;
        arrayList.add(potVar);
        c();
        Set set = (Set) this.e.get(new Pair(potVar.a, potVar.b));
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                iz7 iz7Var = ((lxc) it.next()).a;
                iz7Var.q(true, ((z66) ((jyr) iz7Var.f).getValue()).g());
            }
        }
        x97.y(this.c, null, null, new v0r(this, potVar, continuation, 29), 3);
        return 2;
    }
}

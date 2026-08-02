package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Parcel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Pattern;
import kotlinx.coroutines.a;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes4.dex */
public final class z6u implements ipr, OnCompleteListener, pun, u0x {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;

    public z6u(ArrayList arrayList) {
        this.a = 2;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            ugv ugvVar = (ugv) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = ugvVar.b;
            jArr[i2 + 1] = ugvVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    public void a(Object obj, String str) {
        yks yksVar = new yks(17);
        ((yks) this.d).d = yksVar;
        this.d = yksVar;
        yksVar.c = obj;
        yksVar.b = str;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                h4x h4xVar = (h4x) this.b;
                String str = (String) this.c;
                mnf mnfVar = (mnf) this.d;
                jox joxVar = (jox) obj;
                i8s i8sVar = (i8s) obj2;
                y1g.I("Not connected to device", h4xVar.F == 3);
                y0x y0xVar = (y0x) joxVar.s();
                Parcel M0 = y0xVar.M0();
                M0.writeString(str);
                y4x.c(M0, mnfVar);
                y0xVar.P0(M0, 13);
                synchronized (h4xVar.r) {
                    try {
                        if (h4xVar.o != null) {
                            h4xVar.h(2477);
                        }
                        h4xVar.o = i8sVar;
                    } finally {
                    }
                }
                return;
            case 9:
            default:
                h4x h4xVar2 = (h4x) this.b;
                String str2 = (String) this.c;
                xun xunVar = (xun) this.d;
                jox joxVar2 = (jox) obj;
                i8s i8sVar2 = (i8s) obj2;
                y1g.I("Not active connection", h4xVar2.F != 1);
                y0x y0xVar2 = (y0x) joxVar2.s();
                Parcel M02 = y0xVar2.M0();
                M02.writeString(str2);
                y0xVar2.P0(M02, 12);
                if (xunVar != null) {
                    y0x y0xVar3 = (y0x) joxVar2.s();
                    Parcel M03 = y0xVar3.M0();
                    M03.writeString(str2);
                    y0xVar3.P0(M03, 11);
                }
                i8sVar2.b(null);
                return;
            case 10:
                h4x h4xVar3 = (h4x) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                jox joxVar3 = (jox) obj;
                i8s i8sVar3 = (i8s) obj2;
                y1g.I("Not connected to device", h4xVar3.F == 3);
                y0x y0xVar4 = (y0x) joxVar3.s();
                Parcel M04 = y0xVar4.M0();
                M04.writeString(str3);
                M04.writeString(str4);
                int i = y4x.a;
                M04.writeInt(0);
                y0xVar4.P0(M04, 14);
                synchronized (h4xVar3.r) {
                    try {
                        if (h4xVar3.o != null) {
                            h4xVar3.h(2477);
                        }
                        h4xVar3.o = i8sVar3;
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // defpackage.u0x
    public Object d() {
        return new tax((ikx) ((u0x) this.b).d(), (e5x) ((u0x) this.c).d(), ((k81) ((c5p) this.d).b).a);
    }

    @Override // defpackage.ipr
    public int e(long j) {
        long[] jArr = (long[]) this.d;
        int a = dvt.a(jArr, j, false);
        if (a < jArr.length) {
            return a;
        }
        return -1;
    }

    @Override // defpackage.ipr
    public List g(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                ugv ugvVar = (ugv) list.get(i);
                rv6 rv6Var = ugvVar.a;
                if (rv6Var.e == -3.4028235E38f) {
                    arrayList2.add(ugvVar);
                } else {
                    arrayList.add(rv6Var);
                }
            }
        }
        Collections.sort(arrayList2, new wwq(6));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            qv6 a = ((ugv) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.ipr
    public long o(int i) {
        long[] jArr = (long[]) this.d;
        vq1.v(i >= 0);
        vq1.v(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        rho rhoVar = (rho) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (rhoVar.a) {
            rhoVar.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.ipr
    public int q() {
        return ((long[]) this.d).length;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                apo apoVar = (apo) ((apo) this.c).c;
                String str = "";
                while (apoVar != null) {
                    Object obj = apoVar.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    apoVar = (apo) apoVar.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 12:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                yks yksVar = (yks) ((yks) this.c).d;
                String str2 = "";
                while (yksVar != null) {
                    Object obj2 = yksVar.c;
                    sb2.append(str2);
                    String str3 = (String) yksVar.b;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
                    }
                    yksVar = (yks) yksVar.d;
                    str2 = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public z6u(String str, int i) {
        this.a = i;
        switch (i) {
            case 12:
                yks yksVar = new yks(17);
                this.c = yksVar;
                this.d = yksVar;
                this.b = str;
                break;
            default:
                apo apoVar = new apo(20);
                this.c = apoVar;
                this.d = apoVar;
                this.b = str;
                break;
        }
    }

    public z6u() {
        this.a = 1;
        this.b = Pattern.compile("([0-9]{1,10})x([0-9]{1,10})@([0-9]{1,10}):([^,]+)");
        this.c = Pattern.compile("DATA-ID=\"com.yandex.video.labels.quality\",VALUE=\"([^\"]+)\"");
        this.d = new ConcurrentHashMap();
    }

    public z6u(ConnectivityManager connectivityManager, awc awcVar) {
        this.a = 3;
        this.b = connectivityManager;
        this.c = awcVar;
        xd0 xd0Var = new xd0(8, this);
        this.d = xd0Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), xd0Var);
    }

    public z6u(kxi kxiVar) {
        this.a = 4;
        this.b = kxiVar;
        bdt I = hag.I(e.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        this.d = l18Var.b(hag.I(z5l.class), true);
    }

    public z6u(bhn bhnVar, a aVar, i0j i0jVar) {
        this.a = 0;
        aVar.getClass();
        this.b = aVar;
        this.c = i0jVar;
        this.d = new y8p(this, bhnVar, false, 10);
    }

    public /* synthetic */ z6u(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public z6u(Context context, ugk ugkVar, g0c g0cVar) {
        this.a = 5;
        ugkVar.getClass();
        g0cVar.getClass();
        this.b = context;
        this.c = ugkVar;
        this.d = g0cVar;
        sk3.i = new wvo(29);
    }
}

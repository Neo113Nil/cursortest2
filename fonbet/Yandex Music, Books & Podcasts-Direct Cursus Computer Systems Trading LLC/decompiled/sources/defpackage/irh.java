package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class irh {
    public final hrh a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public dqh u;
    public xy0 w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public irh(hrh hrhVar, String str, String str2, boolean z) {
        this.a = hrhVar;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static yqh a() {
        krh.b();
        zqh zqhVar = krh.c().e;
        if (zqhVar instanceof yqh) {
            return (yqh) zqhVar;
        }
        return null;
    }

    public final g8c b(irh irhVar) {
        if (irhVar == null) {
            jj4.j("route must not be null");
            return null;
        }
        String str = irhVar.c;
        xy0 xy0Var = this.w;
        if (xy0Var == null || !xy0Var.containsKey(str)) {
            return null;
        }
        return new g8c((xqh) this.w.get(str));
    }

    public final arh c() {
        hrh hrhVar = this.a;
        hrhVar.getClass();
        krh.b();
        return hrhVar.a;
    }

    public final boolean d() {
        krh.b();
        irh irhVar = krh.c().v;
        if (irhVar != null) {
            return irhVar == this || this.n == 3 || (TextUtils.equals(((ComponentName) c().b.b).getPackageName(), ConstantDeviceInfo.APP_PLATFORM) && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO"));
        }
        xq0.q("There is no default route.  The media router has not yet been fully initialized.");
        return false;
    }

    public final boolean e() {
        return Collections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.u != null && this.g;
    }

    public final boolean g() {
        krh.b();
        return krh.c().e() == this;
    }

    public final boolean h(crh crhVar) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return false;
        }
        krh.b();
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            return false;
        }
        crhVar.a();
        if (crhVar.b.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = crhVar.b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        if (r3.hasNext() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(dqh dqhVar) {
        int i;
        irh irhVar;
        int countActions;
        if (this.u != dqhVar) {
            this.u = dqhVar;
            if (dqhVar != null) {
                Bundle bundle = dqhVar.a;
                if (Objects.equals(this.d, bundle.getString("name"))) {
                    i = 0;
                } else {
                    this.d = bundle.getString("name");
                    i = 1;
                }
                if (!Objects.equals(this.e, bundle.getString("status"))) {
                    this.e = bundle.getString("status");
                    i = 1;
                }
                Uri uri = this.f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f = string2 == null ? null : Uri.parse(string2);
                    i = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i = 1;
                }
                if (this.i != bundle.getInt("connectionState", 0)) {
                    this.i = bundle.getInt("connectionState", 0);
                    i = 1;
                }
                ArrayList b = dqhVar.b();
                ArrayList arrayList = this.k;
                if (arrayList != b) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = b.listIterator();
                        loop0: while (listIterator.hasNext() && listIterator2.hasNext()) {
                            IntentFilter intentFilter = (IntentFilter) listIterator.next();
                            IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                            if (intentFilter != intentFilter2) {
                                if (intentFilter == null || intentFilter2 == null || (countActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                                    break;
                                }
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= countActions) {
                                        int countCategories = intentFilter.countCategories();
                                        if (countCategories != intentFilter2.countCategories()) {
                                            break;
                                        }
                                        for (int i3 = 0; i3 < countCategories; i3++) {
                                            if (!intentFilter.getCategory(i3).equals(intentFilter2.getCategory(i3))) {
                                                break loop0;
                                            }
                                        }
                                    } else {
                                        if (!intentFilter.getAction(i2).equals(intentFilter2.getAction(i2))) {
                                            break loop0;
                                        }
                                        i2++;
                                    }
                                }
                            }
                        }
                        if (!listIterator.hasNext()) {
                        }
                    }
                    arrayList.clear();
                    arrayList.addAll(dqhVar.b());
                    i = 1;
                }
                if (this.l != bundle.getInt("playbackType", 1)) {
                    this.l = bundle.getInt("playbackType", 1);
                    i = 1;
                }
                if (this.m != bundle.getInt("playbackStream", -1)) {
                    this.m = bundle.getInt("playbackStream", -1);
                    i = 1;
                }
                if (this.n != bundle.getInt(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE)) {
                    this.n = bundle.getInt(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE);
                    i = 1;
                }
                int i4 = 3;
                if (this.o != bundle.getInt("volumeHandling", 0)) {
                    this.o = bundle.getInt("volumeHandling", 0);
                    i = 3;
                }
                if (this.p != bundle.getInt("volume")) {
                    this.p = bundle.getInt("volume");
                    i = 3;
                }
                if (this.q != bundle.getInt("volumeMax")) {
                    this.q = bundle.getInt("volumeMax");
                } else {
                    i4 = i;
                }
                if (this.r != bundle.getInt("presentationDisplayId", -1)) {
                    this.r = bundle.getInt("presentationDisplayId", -1);
                    i4 |= 5;
                }
                if (!Objects.equals(this.s, bundle.getBundle("extras"))) {
                    this.s = bundle.getBundle("extras");
                    i4 |= 1;
                }
                if (!Objects.equals(this.t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.t = (IntentSender) bundle.getParcelable("settingsIntent");
                    i4 |= 1;
                }
                if (this.j != bundle.getBoolean("canDisconnect", false)) {
                    this.j = bundle.getBoolean("canDisconnect", false);
                    i4 |= 5;
                }
                ArrayList c = dqhVar.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z = c.size() != this.v.size();
                if (!c.isEmpty()) {
                    yld c2 = krh.c();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        c2.getClass();
                        String str2 = (String) c2.k.get(new z4k(((ComponentName) this.a.d.b).flattenToShortString(), str));
                        Iterator it2 = c2.j.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                irhVar = null;
                                break;
                            }
                            irhVar = (irh) it2.next();
                            if (irhVar.c.equals(str2)) {
                                break;
                            }
                        }
                        if (irhVar != null) {
                            arrayList2.add(irhVar);
                            if (!z && !this.v.contains(irhVar)) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    return i4;
                }
                this.v = arrayList2;
                return i4 | 1;
            }
        }
        return 0;
    }

    public final void j(int i) {
        zqh zqhVar;
        zqh zqhVar2;
        krh.b();
        yld c = krh.c();
        int min = Math.min(this.q, Math.max(0, i));
        HashMap hashMap = c.b;
        if (this == c.d && (zqhVar2 = c.e) != null) {
            zqhVar2.f(min);
        } else {
            if (hashMap.isEmpty() || (zqhVar = (zqh) hashMap.get(this.c)) == null) {
                return;
            }
            zqhVar.f(min);
        }
    }

    public final void k(int i) {
        zqh zqhVar;
        zqh zqhVar2;
        krh.b();
        if (i != 0) {
            yld c = krh.c();
            HashMap hashMap = c.b;
            if (this == c.d && (zqhVar2 = c.e) != null) {
                zqhVar2.i(i);
            } else {
                if (hashMap.isEmpty() || (zqhVar = (zqh) hashMap.get(this.c)) == null) {
                    return;
                }
                zqhVar.i(i);
            }
        }
    }

    public final void l() {
        krh.b();
        krh.c().i(this, 3);
    }

    public final boolean m(String str) {
        krh.b();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        irh irhVar;
        this.v.clear();
        if (this.w == null) {
            this.w = new xy0(0);
        }
        this.w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            xqh xqhVar = (xqh) it.next();
            String d = xqhVar.a.d();
            Iterator it2 = this.a.b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    irhVar = null;
                    break;
                } else {
                    irhVar = (irh) it2.next();
                    if (irhVar.b.equals(d)) {
                        break;
                    }
                }
            }
            if (irhVar != null) {
                this.w.put(irhVar.c, xqhVar);
                int i = xqhVar.b;
                if (i == 2 || i == 3) {
                    this.v.add(irhVar);
                }
            }
        }
        krh.c().a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((irh) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}

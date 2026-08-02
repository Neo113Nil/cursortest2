package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vld extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ yld c;

    public vld(yld yldVar) {
        this.c = yldVar;
    }

    public static void a(frh frhVar, int i, Object obj, int i2) {
        krh krhVar = frhVar.a;
        erh erhVar = frhVar.b;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                if (i3 == 768 && i == 769) {
                    erhVar.onRouterParamsChanged(krhVar, (mrh) obj);
                }
                return;
            }
            hrh hrhVar = (hrh) obj;
            switch (i) {
                case 513:
                    erhVar.onProviderAdded(krhVar, hrhVar);
                    break;
                case 514:
                    erhVar.onProviderRemoved(krhVar, hrhVar);
                    break;
                case 515:
                    erhVar.onProviderChanged(krhVar, hrhVar);
                    break;
            }
        }
        irh irhVar = (i == 264 || i == 262) ? (irh) ((z4k) obj).b : (irh) obj;
        irh irhVar2 = (i == 264 || i == 262) ? (irh) ((z4k) obj).a : null;
        if (irhVar != null) {
            boolean z = true;
            if ((frhVar.d & 2) == 0 && !irhVar.h(frhVar.c)) {
                mrh mrhVar = krh.c().u;
                z = ((mrhVar == null ? false : mrhVar.c) && irhVar.d() && i == 262 && i2 == 3 && irhVar2 != null) ? true ^ irhVar2.d() : false;
            }
            if (z) {
                switch (i) {
                    case 257:
                        erhVar.onRouteAdded(krhVar, irhVar);
                        break;
                    case 258:
                        erhVar.onRouteRemoved(krhVar, irhVar);
                        break;
                    case 259:
                        erhVar.onRouteChanged(krhVar, irhVar);
                        break;
                    case 260:
                        erhVar.onRouteVolumeChanged(krhVar, irhVar);
                        break;
                    case 261:
                        erhVar.onRoutePresentationDisplayChanged(krhVar, irhVar);
                        break;
                    case 262:
                        erhVar.onRouteSelected(krhVar, irhVar, i2, irhVar);
                        break;
                    case 263:
                        erhVar.onRouteUnselected(krhVar, irhVar, i2);
                        break;
                    case 264:
                        erhVar.onRouteSelected(krhVar, irhVar, i2, irhVar2);
                        break;
                }
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int l;
        ArrayList arrayList = this.a;
        yld yldVar = this.c;
        ArrayList arrayList2 = yldVar.i;
        xtk xtkVar = yldVar.s;
        int i = message.what;
        Object obj = message.obj;
        int i2 = message.arg1;
        if (i == 259 && yldVar.e().c.equals(((irh) obj).c)) {
            yldVar.o(true);
        }
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            irh irhVar = (irh) ((z4k) obj).b;
            xtkVar.s(irhVar);
            if (yldVar.v != null && irhVar.d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    xtkVar.r((irh) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    xtkVar.q((irh) obj);
                    break;
                case 258:
                    xtkVar.r((irh) obj);
                    break;
                case 259:
                    irh irhVar2 = (irh) obj;
                    xtkVar.getClass();
                    if (irhVar2.c() != xtkVar && (l = xtkVar.l(irhVar2)) >= 0) {
                        xtkVar.x((auk) xtkVar.r.get(l));
                        break;
                    }
                    break;
            }
        } else {
            irh irhVar3 = (irh) ((z4k) obj).b;
            arrayList3.add(irhVar3);
            xtkVar.q(irhVar3);
            xtkVar.s(irhVar3);
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        a((frh) it2.next(), i, obj, i2);
                    }
                    arrayList.clear();
                    return;
                }
                krh krhVar = (krh) ((WeakReference) arrayList2.get(size)).get();
                if (krhVar == null) {
                    arrayList2.remove(size);
                } else {
                    arrayList.addAll(krhVar.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}

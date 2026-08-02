package defpackage;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.provider.communication.HostCommunicationService;
import com.yandex.passport.internal.provider.communication.c;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class tt1 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt1(CoroutineContext coroutineContext) {
        super(Looper.getMainLooper());
        this.a = 16;
        coroutineContext.getClass();
        this.b = coroutineContext;
    }

    private final void a(Message message) {
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            ql7 ql7Var = (ql7) this.b;
            pt0 pt0Var = ql7Var.c;
            if (obj == ql7Var.y) {
                if (ql7Var.p == 2 || ql7Var.b()) {
                    ql7Var.y = null;
                    if (obj2 instanceof Exception) {
                        pt0Var.B(false, (Exception) obj2);
                        return;
                    }
                    try {
                        ql7Var.b.f((byte[]) obj2);
                        pt0Var.b = null;
                        HashSet hashSet = (HashSet) pt0Var.a;
                        yde v = yde.v(hashSet);
                        hashSet.clear();
                        ude listIterator = v.listIterator(0);
                        while (listIterator.hasNext()) {
                            ql7 ql7Var2 = (ql7) listIterator.next();
                            if (ql7Var2.e()) {
                                ql7Var2.a(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        pt0Var.B(true, e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ql7 ql7Var3 = (ql7) this.b;
        if (obj == ql7Var3.x && ql7Var3.b()) {
            ql7Var3.x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                ql7Var3.d((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                int i2 = ql7Var3.e;
                oqb oqbVar = ql7Var3.b;
                if (i2 == 3) {
                    byte[] bArr2 = ql7Var3.w;
                    int i3 = dvt.a;
                    oqbVar.l(bArr2, bArr);
                    cl6 cl6Var = ql7Var3.i;
                    synchronized (cl6Var.a) {
                        set2 = cl6Var.c;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((cra) it.next()).b();
                    }
                    return;
                }
                byte[] l = oqbVar.l(ql7Var3.v, bArr);
                int i4 = ql7Var3.e;
                if ((i4 == 2 || (i4 == 0 && ql7Var3.w != null)) && l != null && l.length != 0) {
                    ql7Var3.w = l;
                }
                ql7Var3.p = 4;
                cl6 cl6Var2 = ql7Var3.i;
                synchronized (cl6Var2.a) {
                    set = cl6Var2.c;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((cra) it2.next()).a();
                }
            } catch (Exception e2) {
                e = e2;
                ql7Var3.d(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                ql7Var3.d(e, true);
            }
        }
    }

    private final void b(Message message) {
        int size;
        iwe[] iweVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        phg phgVar = (phg) this.b;
        while (true) {
            synchronized (phgVar.b) {
                try {
                    size = phgVar.d.size();
                    if (size <= 0) {
                        return;
                    }
                    iweVarArr = new iwe[size];
                    phgVar.d.toArray(iweVarArr);
                    phgVar.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                iwe iweVar = iweVarArr[i];
                int size2 = ((ArrayList) iweVar.c).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ohg ohgVar = (ohg) ((ArrayList) iweVar.c).get(i2);
                    if (!ohgVar.d) {
                        ohgVar.b.onReceive(phgVar.a, (Intent) iweVar.b);
                    }
                }
            }
        }
    }

    private final void c(Message message) {
        esh eshVar;
        bsh bshVar;
        tt1 tt1Var;
        bsh bshVar2;
        if (message.what == 1) {
            synchronized (((bsh) this.b).b) {
                eshVar = (esh) ((WeakReference) ((bsh) this.b).d).get();
                bshVar = (bsh) this.b;
                tt1Var = (tt1) bshVar.f;
            }
            if (eshVar != null) {
                synchronized (eshVar.d) {
                    bshVar2 = eshVar.h;
                }
                if (bshVar != bshVar2 || tt1Var == null) {
                    return;
                }
                eshVar.d((yth) message.obj);
                ((bsh) this.b).n(eshVar, tt1Var);
                eshVar.d(null);
            }
        }
    }

    private final void d(Message message) {
        dsh dshVar;
        bsh bshVar;
        tt1 tt1Var;
        bsh bshVar2;
        if (message.what == 1) {
            synchronized (((bsh) this.b).b) {
                dshVar = (dsh) ((WeakReference) ((bsh) this.b).d).get();
                bshVar = (bsh) this.b;
                tt1Var = (tt1) bshVar.f;
            }
            if (dshVar != null) {
                synchronized (dshVar.d) {
                    bshVar2 = dshVar.l;
                }
                if (bshVar != bshVar2 || tt1Var == null) {
                    return;
                }
                dshVar.d((xth) message.obj);
                ((bsh) this.b).m(dshVar, tt1Var);
                dshVar.d(null);
            }
        }
    }

    public void e(Runnable runnable) {
        switch (this.a) {
            case 5:
                if (Thread.currentThread() != getLooper().getThread()) {
                    post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                if (Thread.currentThread() != getLooper().getThread()) {
                    post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x074f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ut1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ut1] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        ?? r3;
        String[] packagesForUid;
        String str;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        r8 = null;
        aq2 aq2Var = null;
        continuation = null;
        continuation = null;
        continuation = null;
        continuation = null;
        continuation = null;
        switch (this.a) {
            case 0:
                vt1 vt1Var = (vt1) this.b;
                int i4 = message.what;
                if (i4 == 1) {
                    r3 = (ut1) message.obj;
                    try {
                        vt1Var.a.queueInputBuffer(r3.a, 0, r3.b, r3.d, r3.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = vt1Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            vt1Var.e.h();
                        } else if (i4 != 4) {
                            AtomicReference atomicReference2 = vt1Var.d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i4));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            try {
                                vt1Var.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e2) {
                                AtomicReference atomicReference3 = vt1Var.d;
                                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                                }
                            }
                        }
                        if (continuation == null) {
                            ArrayDeque arrayDeque = vt1.g;
                            synchronized (arrayDeque) {
                                arrayDeque.add(continuation);
                            }
                            return;
                        }
                        return;
                    }
                    r3 = (ut1) message.obj;
                    int i5 = r3.a;
                    MediaCodec.CryptoInfo cryptoInfo = r3.c;
                    long j = r3.d;
                    int i6 = r3.e;
                    try {
                        synchronized (vt1.h) {
                            vt1Var.a.queueSecureInputBuffer(i5, 0, cryptoInfo, j, i6);
                        }
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = vt1Var.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                continuation = r3;
                if (continuation == null) {
                }
            case 1:
                bq2 bq2Var = (bq2) this.b;
                int i7 = message.what;
                if (i7 == 1) {
                    aq2 aq2Var2 = (aq2) message.obj;
                    try {
                        bq2Var.a.c(aq2Var2.a, aq2Var2.b, aq2Var2.d, aq2Var2.e);
                    } catch (RuntimeException e4) {
                        AtomicReference atomicReference5 = bq2Var.d;
                        while (!atomicReference5.compareAndSet(null, e4) && atomicReference5.get() == null) {
                        }
                    }
                    aq2Var = aq2Var2;
                } else if (i7 == 2) {
                    aq2 aq2Var3 = (aq2) message.obj;
                    int i8 = aq2Var3.a;
                    MediaCodec.CryptoInfo cryptoInfo2 = aq2Var3.c;
                    long j2 = aq2Var3.d;
                    int i9 = aq2Var3.e;
                    try {
                        synchronized (bq2.h) {
                            bq2Var.a.p(i8, cryptoInfo2, j2, i9);
                        }
                    } catch (RuntimeException e5) {
                        AtomicReference atomicReference6 = bq2Var.d;
                        while (!atomicReference6.compareAndSet(null, e5) && atomicReference6.get() == null) {
                        }
                    }
                    aq2Var = aq2Var3;
                } else if (i7 == 3) {
                    bq2Var.e.h();
                } else if (i7 != 4) {
                    AtomicReference atomicReference7 = bq2Var.d;
                    IllegalStateException illegalStateException2 = new IllegalStateException(String.valueOf(i7));
                    while (!atomicReference7.compareAndSet(null, illegalStateException2) && atomicReference7.get() == null) {
                    }
                } else {
                    try {
                        bq2Var.a.b((Bundle) message.obj);
                    } catch (RuntimeException e6) {
                        AtomicReference atomicReference8 = bq2Var.d;
                        while (!atomicReference8.compareAndSet(null, e6) && atomicReference8.get() == null) {
                        }
                    }
                }
                if (aq2Var != null) {
                    ArrayDeque arrayDeque2 = bq2.g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(aq2Var);
                    }
                    return;
                }
                return;
            case 2:
                a(message);
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                Iterator it = ((tl7) this.b).m.iterator();
                while (it.hasNext()) {
                    ql7 ql7Var = (ql7) it.next();
                    ql7Var.h();
                    if (Arrays.equals(ql7Var.v, bArr)) {
                        if (message.what == 2 && ql7Var.e == 0 && ql7Var.p == 4) {
                            int i10 = dvt.a;
                            ql7Var.a(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                b(message);
                return;
            case 5:
                nuh nuhVar = (nuh) this.b;
                if (nuhVar == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                awc awcVar = nuhVar.b;
                Bundle data = message.getData();
                switch (message.what) {
                    case 1:
                        Bundle bundle = data.getBundle("data_root_hints");
                        nsh.g(bundle);
                        String string = data.getString("data_package_name");
                        int i11 = data.getInt("data_calling_pid");
                        int i12 = data.getInt("data_calling_uid");
                        mka mkaVar = new mka(message.replyTo);
                        nuh nuhVar2 = (nuh) awcVar.a;
                        if (string != null && (packagesForUid = nuhVar2.getPackageManager().getPackagesForUid(i12)) != null) {
                            int length = packagesForUid.length;
                            while (i2 < length) {
                                if (packagesForUid[i2].equals(string)) {
                                    nuhVar2.g.e(new vhh(awcVar, mkaVar, string, i11, i12, bundle));
                                    return;
                                }
                                i2++;
                            }
                        }
                        xq0.x(hrg.p("Package/uid mismatch: uid=", i12, " package=", string));
                        return;
                    case 2:
                        ((nuh) awcVar.a).g.e(new xhh(awcVar, new mka(message.replyTo), i2));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle("data_options");
                        nsh.g(bundle2);
                        ((nuh) awcVar.a).g.e(new lr1(awcVar, new mka(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle2, 2));
                        return;
                    case 4:
                        ((nuh) awcVar.a).g.e(new t5(awcVar, new mka(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), 5));
                        return;
                    case 5:
                        String string2 = data.getString("data_media_item_id");
                        i8o i8oVar = (i8o) data.getParcelable("data_result_receiver");
                        mka mkaVar2 = new mka(message.replyTo);
                        awcVar.getClass();
                        if (TextUtils.isEmpty(string2) || i8oVar == null) {
                            return;
                        }
                        ((nuh) awcVar.a).g.e(new zhh(awcVar, mkaVar2, string2, i8oVar));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle("data_root_hints");
                        nsh.g(bundle3);
                        ((nuh) awcVar.a).g.e(new whh(awcVar, new mka(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), bundle3, 2));
                        return;
                    case 7:
                        ((nuh) awcVar.a).g.e(new xhh(awcVar, new mka(message.replyTo), i3));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle("data_search_extras");
                        nsh.g(bundle4);
                        String string3 = data.getString("data_search_query");
                        i8o i8oVar2 = (i8o) data.getParcelable("data_result_receiver");
                        mka mkaVar3 = new mka(message.replyTo);
                        awcVar.getClass();
                        if (TextUtils.isEmpty(string3) || i8oVar2 == null) {
                            return;
                        }
                        ((nuh) awcVar.a).g.e(new zhh(awcVar, mkaVar3, string3, bundle4, i8oVar2));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle("data_custom_action_extras");
                        nsh.g(bundle5);
                        String string4 = data.getString("data_custom_action");
                        i8o i8oVar3 = (i8o) data.getParcelable("data_result_receiver");
                        mka mkaVar4 = new mka(message.replyTo);
                        awcVar.getClass();
                        if (TextUtils.isEmpty(string4) || i8oVar3 == null) {
                            return;
                        }
                        ((nuh) awcVar.a).g.e(new lr1(awcVar, mkaVar4, string4, bundle5, i8oVar3, 4));
                        return;
                    default:
                        Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 6:
                bih bihVar = (bih) this.b;
                if (bihVar == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                n7b n7bVar = bihVar.b;
                Bundle data2 = message.getData();
                switch (message.what) {
                    case 1:
                        Bundle bundle6 = data2.getBundle("data_root_hints");
                        osh.C(bundle6);
                        String string5 = data2.getString("data_package_name");
                        int i13 = data2.getInt("data_calling_pid");
                        int i14 = data2.getInt("data_calling_uid");
                        h4b h4bVar = new h4b(message.replyTo);
                        bih bihVar2 = (bih) n7bVar.a;
                        if (string5 != null) {
                            String[] packagesForUid2 = bihVar2.getPackageManager().getPackagesForUid(i14);
                            int length2 = packagesForUid2.length;
                            while (i2 < length2) {
                                if (packagesForUid2[i2].equals(string5)) {
                                    bihVar2.e.e(new whh(n7bVar, h4bVar, string5, i13, i14, bundle6));
                                    return;
                                }
                                i2++;
                            }
                        }
                        xq0.x(hrg.p("Package/uid mismatch: uid=", i14, " package=", string5));
                        return;
                    case 2:
                        ((bih) n7bVar.a).e.e(new yhh(n7bVar, new h4b(message.replyTo), i2));
                        return;
                    case 3:
                        Bundle bundle7 = data2.getBundle("data_options");
                        osh.C(bundle7);
                        ((bih) n7bVar.a).e.e(new lr1(n7bVar, new h4b(message.replyTo), data2.getString("data_media_item_id"), data2.getBinder("data_callback_token"), bundle7, 3));
                        return;
                    case 4:
                        ((bih) n7bVar.a).e.e(new t5(n7bVar, new h4b(message.replyTo), data2.getString("data_media_item_id"), data2.getBinder("data_callback_token"), 6));
                        return;
                    case 5:
                        String string6 = data2.getString("data_media_item_id");
                        i8o i8oVar4 = (i8o) data2.getParcelable("data_result_receiver");
                        h4b h4bVar2 = new h4b(message.replyTo);
                        n7bVar.getClass();
                        if (TextUtils.isEmpty(string6) || i8oVar4 == null) {
                            return;
                        }
                        ((bih) n7bVar.a).e.e(new aih(n7bVar, h4bVar2, string6, i8oVar4));
                        return;
                    case 6:
                        Bundle bundle8 = data2.getBundle("data_root_hints");
                        osh.C(bundle8);
                        ((bih) n7bVar.a).e.e(new whh(n7bVar, new h4b(message.replyTo), data2.getInt("data_calling_uid"), data2.getString("data_package_name"), data2.getInt("data_calling_pid"), bundle8, 1));
                        return;
                    case 7:
                        ((bih) n7bVar.a).e.e(new yhh(n7bVar, new h4b(message.replyTo), i3));
                        return;
                    case 8:
                        Bundle bundle9 = data2.getBundle("data_search_extras");
                        osh.C(bundle9);
                        String string7 = data2.getString("data_search_query");
                        i8o i8oVar5 = (i8o) data2.getParcelable("data_result_receiver");
                        h4b h4bVar3 = new h4b(message.replyTo);
                        n7bVar.getClass();
                        if (TextUtils.isEmpty(string7) || i8oVar5 == null) {
                            return;
                        }
                        ((bih) n7bVar.a).e.e(new aih(n7bVar, h4bVar3, string7, bundle9, i8oVar5));
                        return;
                    case 9:
                        Bundle bundle10 = data2.getBundle("data_custom_action_extras");
                        osh.C(bundle10);
                        String string8 = data2.getString("data_custom_action");
                        i8o i8oVar6 = (i8o) data2.getParcelable("data_result_receiver");
                        h4b h4bVar4 = new h4b(message.replyTo);
                        n7bVar.getClass();
                        if (TextUtils.isEmpty(string8) || i8oVar6 == null) {
                            return;
                        }
                        ((bih) n7bVar.a).e.e(new lr1(n7bVar, h4bVar4, string8, bundle10, i8oVar6, 5));
                        return;
                    default:
                        Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                        return;
                }
            case 7:
                int i15 = message.what;
                int i16 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((gph) this.b).j;
                gsn gsnVar = (gsn) sparseArray.get(i16);
                if (gsnVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                sparseArray.remove(i16);
                if (i15 == 3) {
                    gsnVar.b((Bundle) obj);
                    return;
                } else {
                    if (i15 != 4) {
                        return;
                    }
                    gsn.a((Bundle) obj, peekData != null ? peekData.getString("error") : null);
                    return;
                }
            case 8:
                oph ophVar = (oph) this.b;
                tt1 tt1Var = ophVar.w;
                int i17 = message.what;
                if (i17 == 1) {
                    ophVar.e((List) message.obj);
                    return;
                }
                if (i17 == 2) {
                    if (ophVar.i.isEmpty()) {
                        ophVar.h(2);
                        tt1Var.removeMessages(2);
                        tt1Var.removeMessages(3);
                        tt1Var.sendMessageDelayed(tt1Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i17 == 3 && ophVar.i.isEmpty()) {
                    ophVar.h(3);
                    tt1Var.removeMessages(2);
                    tt1Var.removeMessages(3);
                    tt1Var.removeMessages(1);
                    ophVar.f.i(ophVar.g);
                    return;
                }
                return;
            case 9:
                if (message.what != 1) {
                    return;
                }
                lqh lqhVar = (lqh) this.b;
                List list = (List) message.obj;
                lqhVar.p = SystemClock.uptimeMillis();
                lqhVar.j.clear();
                lqhVar.j.addAll(list);
                lqhVar.k.u();
                return;
            case 10:
                wqh wqhVar = (wqh) this.b;
                int i18 = message.what;
                if (i18 == 1) {
                    wqhVar.l();
                    return;
                } else {
                    if (i18 == 2 && wqhVar.w != null) {
                        wqhVar.w = null;
                        wqhVar.m();
                        return;
                    }
                    return;
                }
            case 11:
                arh arhVar = (arh) this.b;
                int i19 = message.what;
                if (i19 != 1) {
                    if (i19 != 2) {
                        return;
                    }
                    arhVar.f = false;
                    arhVar.f(arhVar.e);
                    return;
                }
                arhVar.h = false;
                n7b n7bVar2 = arhVar.d;
                if (n7bVar2 != null) {
                    bz2 bz2Var = arhVar.g;
                    yld yldVar = (yld) n7bVar2.a;
                    hrh d = yldVar.d(arhVar);
                    if (d != null) {
                        yldVar.m(d, bz2Var);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                d(message);
                return;
            case 13:
                c(message);
                return;
            case 14:
                wrh wrhVar = (wrh) message.obj;
                g06 g06Var = (g06) this.b;
                if (g06Var.I(wrhVar)) {
                    try {
                        vrh vrhVar = wrhVar.d;
                        vq1.B(vrhVar);
                        vrhVar.d();
                    } catch (RemoteException unused) {
                    }
                    g06Var.U(wrhVar);
                    return;
                }
                return;
            case 15:
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    message.getClass();
                    ccd ccdVar = (ccd) this.b;
                    if (message.what == ccdVar.g) {
                        Bundle data3 = message.getData();
                        if (data3.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            ccdVar.a(null);
                        } else {
                            ccdVar.a(data3);
                        }
                        try {
                            ccdVar.a.unbindService(ccdVar);
                            return;
                        } catch (IllegalArgumentException unused2) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    bp6.a(this, th);
                    return;
                }
            case 16:
                message.getClass();
                if (message.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + message);
                    super.handleMessage(message);
                    return;
                }
                Bundle data4 = message.getData();
                if (data4 == null || (str = data4.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                Log.d("SessionLifecycleClient", "Session update received.");
                x97.y(gld.e((CoroutineContext) this.b), null, null, new p9k(str, continuation, i), 3);
                return;
            case 17:
                message.getClass();
                x97.y(wyf.F(((HostCommunicationService) this.b).getLifecycle()), null, null, new c(message, message.replyTo, continuation, i2), 3);
                return;
            default:
                message.getClass();
                Object obj2 = message.obj;
                Bundle bundle11 = obj2 instanceof Bundle ? (Bundle) obj2 : null;
                String string9 = bundle11 != null ? bundle11.getString("ID_COMMAND") : null;
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "Get message from UserMenuActivity: " + string9, 8);
                }
                x97.y(wyf.F(((UserIdCommunicationService) this.b).getLifecycle()), null, null, new we(string9, message.replyTo, continuation, 12), 3);
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 5:
                Bundle data = message.getData();
                ClassLoader classLoader = fhh.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
            case 6:
                Bundle data2 = message.getData();
                data2.setClassLoader(ghh.class.getClassLoader());
                data2.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid2 = Binder.getCallingPid();
                if (callingPid2 > 0) {
                    data2.putInt("data_calling_pid", callingPid2);
                } else if (!data2.containsKey("data_calling_pid")) {
                    data2.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    public /* synthetic */ tt1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt1(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ tt1(int i) {
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt1(gph gphVar) {
        super(Looper.getMainLooper());
        this.a = 7;
        this.b = gphVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt1(Looper looper, g06 g06Var) {
        super(looper);
        this.a = 14;
        this.b = g06Var;
    }
}

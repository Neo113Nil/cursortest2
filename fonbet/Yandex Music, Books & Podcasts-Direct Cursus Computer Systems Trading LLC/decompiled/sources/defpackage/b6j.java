package defpackage;

import android.app.Activity;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.fragment.app.o;
import com.connectsdk.service.DeviceService;
import java.io.Closeable;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class b6j implements yn7 {
    public final x5j a;
    public final xdr b;
    public final x0q c;
    public Activity d;
    public boolean e;
    public NfcAdapter f;
    public qyf g;
    public iv1 h;
    public final xdr i;
    public final x0q j;
    public final y5j k;

    /* JADX WARN: Type inference failed for: r4v3, types: [y5j] */
    public b6j(x5j x5jVar) {
        x5jVar.getClass();
        this.a = x5jVar;
        xdr a = ydr.a(f6j.c);
        this.b = a;
        x0q a2 = y0q.a(0, 1, oi3.b);
        this.c = a2;
        this.i = a;
        this.j = a2;
        this.k = new NfcAdapter.ReaderCallback() { // from class: y5j
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                b6j b6jVar = b6j.this;
                qyf qyfVar = b6jVar.g;
                if (qyfVar != null) {
                    dq7 dq7Var = ca8.a;
                    x97.y(qyfVar, mn7.d, null, new h1j(b6jVar, tag, (Continuation) null, 2), 2);
                }
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(7:19|20|21|22|(2:24|(1:26))|14|15))(9:27|28|29|(1:31)|21|22|(0)|14|15))(2:32|33))(4:40|41|42|(1:45)(1:44))|34|(2:36|(2:38|39))|29|(0)|21|22|(0)|14|15))|58|6|7|(0)(0)|34|(0)|29|(0)|21|22|(0)|14|15|(2:(0)|(1:54))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0060, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:20:0x0040, B:28:0x0050, B:29:0x00bb, B:34:0x0085, B:36:0x009a), top: B:7:0x0023, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v0, types: [b6j, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [b6j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b6j b6jVar, Tag tag, cg6 cg6Var) {
        a6j a6jVar;
        nm6 nm6Var;
        int i;
        Object t7oVar;
        ?? r14;
        Throwable a;
        b6j b6jVar2;
        IsoDep isoDep;
        bw3 f;
        b6j b6jVar3;
        IsoDep isoDep2;
        Unit b;
        b6j b6jVar4;
        IsoDep isoDep3;
        try {
            if (cg6Var instanceof a6j) {
                a6jVar = (a6j) cg6Var;
                int i2 = a6jVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    a6jVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = a6jVar.l;
                    nm6Var = nm6.a;
                    i = a6jVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            r7o r7oVar = z7o.b;
                            IsoDep isoDep4 = IsoDep.get(tag);
                            xdr xdrVar = b6jVar.b;
                            f6j f6jVar = f6j.d;
                            a6jVar.j = b6jVar;
                            a6jVar.k = isoDep4;
                            a6jVar.n = 1;
                            xdrVar.getClass();
                            xdrVar.m(null, f6jVar);
                            if (Unit.a == nm6Var) {
                                return nm6Var;
                            }
                            b6jVar2 = b6jVar;
                            isoDep = isoDep4;
                        } catch (Throwable th) {
                            tag = b6jVar;
                            th = th;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                            r14 = tag;
                            a = z7o.a(t7oVar);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Closeable closeable = a6jVar.k;
                                b6j b6jVar5 = (b6j) a6jVar.j;
                                qgg.h0(obj);
                                isoDep2 = closeable;
                                b6jVar3 = b6jVar5;
                                a6jVar.j = b6jVar3;
                                a6jVar.k = isoDep2;
                                a6jVar.n = 3;
                                b = b6jVar3.b();
                                isoDep3 = isoDep2;
                                b6jVar4 = b6jVar3;
                                if (b == nm6Var) {
                                    return nm6Var;
                                }
                                yd5.q(isoDep3, null);
                                t7oVar = Unit.a;
                                r7o r7oVar3 = z7o.b;
                                r14 = b6jVar4;
                                a = z7o.a(t7oVar);
                                if (a != null) {
                                }
                                return Unit.a;
                            }
                            if (i != 3) {
                                if (i == 4) {
                                    qgg.h0(obj);
                                    return Unit.a;
                                }
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Closeable closeable2 = a6jVar.k;
                            b6j b6jVar6 = (b6j) a6jVar.j;
                            qgg.h0(obj);
                            isoDep3 = closeable2;
                            b6jVar4 = b6jVar6;
                            yd5.q(isoDep3, null);
                            t7oVar = Unit.a;
                            r7o r7oVar32 = z7o.b;
                            r14 = b6jVar4;
                            a = z7o.a(t7oVar);
                            if (a != null) {
                                a.printStackTrace();
                                a6jVar.j = t7oVar;
                                a6jVar.k = null;
                                a6jVar.n = 4;
                                if (r14.b() == nm6Var) {
                                    return nm6Var;
                                }
                            }
                            return Unit.a;
                        }
                        IsoDep isoDep5 = (IsoDep) a6jVar.k;
                        b6j b6jVar7 = (b6j) a6jVar.j;
                        qgg.h0(obj);
                        isoDep = isoDep5;
                        b6jVar2 = b6jVar7;
                    }
                    isoDep.connect();
                    f = new d6j(new awc(isoDep), b6jVar2.a).f();
                    isoDep2 = isoDep;
                    b6jVar3 = b6jVar2;
                    if (f != null) {
                        x0q x0qVar = b6jVar2.c;
                        e6j e6jVar = new e6j(f.a, c.r(f.b, "/", "", false));
                        a6jVar.j = b6jVar2;
                        a6jVar.k = isoDep;
                        a6jVar.n = 2;
                        isoDep2 = isoDep;
                        b6jVar3 = b6jVar2;
                        if (x0qVar.emit(e6jVar, a6jVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    a6jVar.j = b6jVar3;
                    a6jVar.k = isoDep2;
                    a6jVar.n = 3;
                    b = b6jVar3.b();
                    isoDep3 = isoDep2;
                    b6jVar4 = b6jVar3;
                    if (b == nm6Var) {
                    }
                    yd5.q(isoDep3, null);
                    t7oVar = Unit.a;
                    r7o r7oVar322 = z7o.b;
                    r14 = b6jVar4;
                    a = z7o.a(t7oVar);
                    if (a != null) {
                    }
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            isoDep.connect();
            f = new d6j(new awc(isoDep), b6jVar2.a).f();
            isoDep2 = isoDep;
            b6jVar3 = b6jVar2;
            if (f != null) {
            }
            a6jVar.j = b6jVar3;
            a6jVar.k = isoDep2;
            a6jVar.n = 3;
            b = b6jVar3.b();
            isoDep3 = isoDep2;
            b6jVar4 = b6jVar3;
            if (b == nm6Var) {
            }
            yd5.q(isoDep3, null);
            t7oVar = Unit.a;
            r7o r7oVar3222 = z7o.b;
            r14 = b6jVar4;
            a = z7o.a(t7oVar);
            if (a != null) {
            }
            return Unit.a;
        } finally {
        }
        a6jVar = new a6j(b6jVar, cg6Var);
        Object obj2 = a6jVar.l;
        nm6Var = nm6.a;
        i = a6jVar.n;
    }

    public final Unit b() {
        NfcAdapter nfcAdapter = this.f;
        f6j f6jVar = (nfcAdapter == null || !nfcAdapter.isEnabled()) ? f6j.a : f6j.b;
        xdr xdrVar = this.b;
        xdrVar.getClass();
        xdrVar.m(null, f6jVar);
        Unit unit = Unit.a;
        nm6 nm6Var = nm6.a;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        Activity requireActivity;
        dzfVar.getClass();
        this.g = wyf.F(dzfVar.getLifecycle());
        if (dzfVar instanceof Activity) {
            requireActivity = (Activity) dzfVar;
        } else {
            if (!(dzfVar instanceof o)) {
                throw new Exception("Unsupported LifecycleOwner");
            }
            requireActivity = ((o) dzfVar).requireActivity();
            requireActivity.getClass();
        }
        this.d = requireActivity;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(requireActivity);
        this.f = defaultAdapter;
        x5j x5jVar = this.a;
        if (defaultAdapter != null) {
            g0c eventReporter = x5jVar.getEventReporter();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            vtm k = su4.k("NFC доступен", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = up6.z(1) + ci0Var.a;
            k.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(k, "event_name", "nfc_available", "nfc_available", k);
            x60 x60Var = (x60) eventReporter;
            x60Var.getClass();
            x60Var.a(j);
        } else {
            g0c eventReporter2 = x5jVar.getEventReporter();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            r1f r1fVar2 = r1f.a;
            vtm k2 = su4.k("NFC недоступен", linkedHashMap2, DeviceService.KEY_DESC, linkedHashMap2);
            ci0 ci0Var2 = qjb.a;
            ci0Var2.a = up6.z(1) + ci0Var2.a;
            k2.u(qee.n() + ci0Var2.a, "eventus_id");
            qne j2 = su4.j(k2, "event_name", "nfc_unavailable", "nfc_unavailable", k2);
            x60 x60Var2 = (x60) eventReporter2;
            x60Var2.getClass();
            x60Var2.a(j2);
        }
        NfcAdapter nfcAdapter = this.f;
        iv1 iv1Var = new iv1(nfcAdapter != null && nfcAdapter.isEnabled());
        this.h = iv1Var;
        iv1Var.d = wyf.F(dzfVar.getLifecycle());
        Activity activity = this.d;
        Continuation continuation = null;
        if (activity != null) {
            iv1 iv1Var2 = this.h;
            if (iv1Var2 == null) {
                Intrinsics.j("nfcEnableReceiver");
                throw null;
            }
            activity.registerReceiver(iv1Var2, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"));
        }
        qyf qyfVar = this.g;
        if (qyfVar != null) {
            x97.y(qyfVar, null, null, new m1i(this, continuation, 13), 3);
        }
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        iv1 iv1Var = this.h;
        if (iv1Var == null) {
            Intrinsics.j("nfcEnableReceiver");
            throw null;
        }
        iv1Var.d = null;
        Activity activity = this.d;
        if (activity != null) {
            activity.unregisterReceiver(iv1Var);
        }
        this.f = null;
        this.d = null;
        this.g = null;
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        NfcAdapter nfcAdapter;
        dzfVar.getClass();
        if (!this.e || (nfcAdapter = this.f) == null) {
            return;
        }
        nfcAdapter.enableReaderMode(this.d, this.k, 131, cxb.J());
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        NfcAdapter nfcAdapter = this.f;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.d);
        }
    }
}

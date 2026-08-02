package S0;

import D.y;
import a7.InterfaceC0446e;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.animation.Animation;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.internal.ads.AP;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.B4;
import com.google.android.gms.internal.ads.BinderC2466Ad;
import com.google.android.gms.internal.ads.BinderC3838ra;
import com.google.android.gms.internal.ads.C2491Bl;
import com.google.android.gms.internal.ads.C2530Dq;
import com.google.android.gms.internal.ads.C2991bm;
import com.google.android.gms.internal.ads.C3254gh;
import com.google.android.gms.internal.ads.C3257gk;
import com.google.android.gms.internal.ads.C3309hi;
import com.google.android.gms.internal.ads.C3414jh;
import com.google.android.gms.internal.ads.C3481ku;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3514lQ;
import com.google.android.gms.internal.ads.C3534lt;
import com.google.android.gms.internal.ads.C3565mN;
import com.google.android.gms.internal.ads.C3664oE;
import com.google.android.gms.internal.ads.C3731pa;
import com.google.android.gms.internal.ads.C3892sa;
import com.google.android.gms.internal.ads.C3918t;
import com.google.android.gms.internal.ads.C3935tG;
import com.google.android.gms.internal.ads.C3959tn;
import com.google.android.gms.internal.ads.C4;
import com.google.android.gms.internal.ads.C4159xO;
import com.google.android.gms.internal.ads.C4233yr;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.Dt;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.Hu;
import com.google.android.gms.internal.ads.InterfaceC2992bn;
import com.google.android.gms.internal.ads.InterfaceC3101dq;
import com.google.android.gms.internal.ads.InterfaceC3249gc;
import com.google.android.gms.internal.ads.InterfaceC3511lN;
import com.google.android.gms.internal.ads.InterfaceC3613nH;
import com.google.android.gms.internal.ads.InterfaceC3837rQ;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import com.google.android.gms.internal.ads.InterfaceC3989uG;
import com.google.android.gms.internal.ads.InterfaceC4043vG;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.Lu;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.S0;
import com.google.android.gms.internal.ads.T8;
import com.google.android.gms.internal.ads.VF;
import com.google.android.gms.internal.ads.VG;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.Yv;
import com.icefishingapp.icefishing.GzopSportsRacinggamesActivity;
import d1.C4445c;
import e4.C4463a;
import f6.C4512a;
import g7.u;
import j3.InterfaceC4604a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import k2.C4631a;
import l7.C4666a;
import o4.InterfaceC4799l;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C4853a;
import q7.C4938g;
import q7.C4939h;
import r6.C4960a;
import u.AbstractC5049e;
import u0.C5059i;
import u2.z;
import u7.v;
import v2.C5110a;
import x2.InterfaceC5189c;

/* loaded from: classes.dex */
public class s implements F5.b, InterfaceC4604a, B4, InterfaceC5189c, VG, KD, InterfaceC3101dq, Hu, InterfaceC3989uG, InterfaceC2992bn, InterfaceC4799l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2839n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2840u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2841v;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f2839n = i;
        this.f2840u = obj;
        this.f2841v = obj2;
    }

    public void A(String str) {
        try {
            ((InterfaceC4061vh) this.f2840u).e("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f17526b, str));
        } catch (JSONException e9) {
            int i = z.f41322b;
            v2.i.d("Error occurred while dispatching state change.", e9);
        }
    }

    public void B(int i, int i6, int i9, int i10, float f3, int i11) {
        try {
            ((InterfaceC4061vh) this.f2840u).e("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i6).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f3).put("rotation", i11));
        } catch (JSONException e9) {
            int i12 = z.f41322b;
            v2.i.d("Error occurred while obtaining screen information.", e9);
        }
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        ((GzopSportsRacinggamesActivity) this.f2841v).startActivity((Intent) this.f2840u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2992bn
    /* renamed from: a */
    public /* synthetic */ void mo10a(Object obj) {
        ((InterfaceC3837rQ) obj).a(0, ((AP) this.f2840u).f23675a, (C3514lQ) this.f2841v);
    }

    @Override // com.google.android.gms.internal.ads.VG
    /* renamed from: c */
    public /* synthetic */ InterfaceC3613nH mo14c() {
        AtomicInteger atomicInteger = C3414jh.f31276N;
        InterfaceC3613nH mo14c = ((VG) this.f2840u).mo14c();
        byte[] bArr = (byte[]) this.f2841v;
        return new C3254gh(new VF(bArr), bArr.length, mo14c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3989uG
    public Object d(C3664oE c3664oE) {
        return ((C3935tG) this.f2840u).a(c3664oE.f32878a, ((InterfaceC4043vG) this.f2841v).f());
    }

    public void f(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f2840u).add(y.s(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void g(Cr cr) {
        if (cr.K() != 0 || (cr.K() & 128) == 0) {
            return;
        }
        cr.G(6);
        int B9 = cr.B() / 4;
        int i = 0;
        while (true) {
            D4 d42 = (D4) this.f2841v;
            if (i >= B9) {
                d42.f24333f.remove(0);
                return;
            }
            C4233yr c4233yr = (C4233yr) this.f2840u;
            cr.H(c4233yr.f35232a, 0, 4);
            c4233yr.d(0);
            int h9 = c4233yr.h(16);
            c4233yr.f(3);
            if (h9 == 0) {
                c4233yr.f(13);
            } else {
                int h10 = c4233yr.h(13);
                if (d42.f24333f.get(h10) == null) {
                    d42.f24333f.put(h10, new C4(new C3918t(d42, h10)));
                }
            }
            i++;
        }
    }

    @Override // j3.InterfaceC4604a
    public Object h(j3.m mVar) {
        L2.b bVar = (L2.b) this.f2840u;
        bVar.getClass();
        if (!mVar.i()) {
            return mVar;
        }
        Bundle bundle = (Bundle) mVar.g();
        return (bundle == null || !bundle.containsKey("google.messenger")) ? mVar : bVar.a((Bundle) this.f2841v).j(L2.h.f1638v, L2.d.f1633w);
    }

    public X6.d i() {
        Logger logger = C4938g.f40265w;
        C4939h c4939h = new C4939h();
        C4938g c4938g = new C4938g(c4939h.f40271b, c4939h.f40272c, c4939h.f40273d, c4939h.f40274e, c4939h.f40275f, c4939h.f40270a, c4939h.f40276g.a());
        Logger logger2 = u.f37695A;
        C4853a c4853a = C4853a.f39800c;
        u uVar = new u(new ArrayList(), new IdentityHashMap(), new ArrayList(), c4853a, C4666a.f38933a, new I1.b(1).a());
        b7.o oVar = (b7.o) this.f2841v;
        if (oVar == null) {
            Logger logger3 = b7.o.f5458x;
            ArrayList arrayList = new ArrayList();
            C4853a c4853a2 = C4853a.f39800c;
            H5.a aVar = new H5.a(12);
            ArrayList arrayList2 = new ArrayList();
            InterfaceC0446e.n();
            oVar = new b7.o(c4853a2, aVar, arrayList, new a7.h(arrayList2));
        }
        return new X6.d(c4938g, uVar, oVar, (C4960a) this.f2840u);
    }

    public File j() {
        if (((File) this.f2840u) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2840u) == null) {
                        O3.g gVar = (O3.g) this.f2841v;
                        gVar.a();
                        this.f2840u = new File(gVar.f2345a.getFilesDir(), "PersistedInstallation." + ((O3.g) this.f2841v).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f2840u;
    }

    public ArrayList k(String str) {
        C5059i a9 = C5059i.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2840u;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            a9.j();
        }
    }

    public void l(C4463a c4463a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c4463a.f37195a);
            jSONObject.put("Status", AbstractC5049e.d(c4463a.f37196b));
            jSONObject.put("AuthToken", c4463a.f37197c);
            jSONObject.put("RefreshToken", c4463a.f37198d);
            jSONObject.put("TokenCreationEpochInSecs", c4463a.f37200f);
            jSONObject.put("ExpiresInSecs", c4463a.f37199e);
            jSONObject.put("FisError", c4463a.f37201g);
            O3.g gVar = (O3.g) this.f2841v;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f2345a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(j())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public C4463a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = AbstractC5049e.e(5)[optInt];
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C4463a(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        switch (this.f2839n) {
            case 15:
                ((InterfaceC4061vh) obj).a1((String) this.f2840u, (InterfaceC3249gc) this.f2841v);
                break;
            default:
                ((Lu) ((T8) this.f2841v).f27700y).f26191c.M1(new C3534lt(3, (Iu) this.f2840u));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(Thread thread, Throwable th, B7.c cVar) {
        I5.d dVar;
        A7.a aVar;
        int i;
        s sVar;
        C4512a d2;
        Object obj;
        s sVar2;
        Instant now;
        Object obj2;
        F5.c cVar2 = (F5.c) this.f2841v;
        if (cVar instanceof I5.d) {
            dVar = (I5.d) cVar;
            int i6 = dVar.f1306x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.f1306x = i6 - Integer.MIN_VALUE;
                Object obj3 = dVar.f1304v;
                aVar = A7.a.f58n;
                i = dVar.f1306x;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj3);
                    try {
                        cVar2.info("OtelCrashReporter: Starting to save crash report for ".concat(th.getClass().getSimpleName()));
                        try {
                            C4445c c4445c = new C4445c();
                            String message = th.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            c4445c.e("exception.message", message);
                            c4445c.e("exception.stacktrace", X2.e.P(th));
                            c4445c.e("exception.type", th.getClass().getName());
                            c4445c.e("ossdk.exception.thread.name", thread.getName());
                            d2 = c4445c.d();
                            cVar2.debug("OtelCrashReporter: Creating log record with attributes...");
                            try {
                                obj = (F5.d) this.f2840u;
                                dVar.f1302n = this;
                                dVar.f1303u = d2;
                                dVar.f1306x = 1;
                            } catch (IOException e9) {
                                e = e9;
                            } catch (RuntimeException e10) {
                                e = e10;
                            }
                            try {
                                obj3 = F5.j.b((F5.j) obj, dVar);
                                if (obj3 != aVar) {
                                    sVar2 = this;
                                }
                                return aVar;
                            } catch (IOException e11) {
                                e = e11;
                                e = e;
                                sVar = this;
                                ((F5.c) sVar.f2841v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                                throw e;
                            } catch (RuntimeException e12) {
                                e = e12;
                                e = e;
                                sVar = this;
                                ((F5.c) sVar.f2841v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                                throw e;
                            }
                        } catch (IOException e13) {
                            e = e13;
                        } catch (RuntimeException e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                    } catch (RuntimeException e16) {
                        e = e16;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = dVar.f1302n;
                        try {
                            com.bumptech.glide.d.k(obj3);
                            ((F5.c) sVar.f2841v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                            return v.f41353a;
                        } catch (IOException e17) {
                            e = e17;
                            ((F5.c) sVar.f2841v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                            throw e;
                        } catch (RuntimeException e18) {
                            e = e18;
                            ((F5.c) sVar.f2841v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                            throw e;
                        }
                    }
                    d2 = dVar.f1303u;
                    sVar2 = dVar.f1302n;
                    try {
                        com.bumptech.glide.d.k(obj3);
                    } catch (IOException e19) {
                        s sVar3 = sVar2;
                        e = e19;
                        sVar = sVar3;
                        ((F5.c) sVar.f2841v).error("OtelCrashReporter: IO error saving crash report: " + e.getMessage());
                        throw e;
                    } catch (RuntimeException e20) {
                        s sVar4 = sVar2;
                        e = e20;
                        sVar = sVar4;
                        ((F5.c) sVar.f2841v).error("OtelCrashReporter: Failed to save crash report: " + e.getMessage() + " - " + e.getClass().getSimpleName());
                        throw e;
                    }
                }
                l6.e e21 = ((l6.e) obj3).f(d2).e(l6.i.FATAL);
                now = Instant.now();
                e21.d(now).b();
                ((F5.c) sVar2.f2841v).debug("OtelCrashReporter: Flushing crash report to disk...");
                obj2 = (F5.d) sVar2.f2840u;
                dVar.f1302n = sVar2;
                dVar.f1303u = null;
                dVar.f1306x = 2;
                if (F5.j.a((F5.j) obj2, dVar) != aVar) {
                    sVar = sVar2;
                    ((F5.c) sVar.f2841v).info("OtelCrashReporter: ✅ Crash report saved and flushed successfully to disk");
                    return v.f41353a;
                }
                return aVar;
            }
        }
        dVar = new I5.d(this, cVar);
        Object obj32 = dVar.f1304v;
        aVar = A7.a.f58n;
        i = dVar.f1306x;
        if (i != 0) {
        }
        l6.e e212 = ((l6.e) obj32).f(d2).e(l6.i.FATAL);
        now = Instant.now();
        e212.d(now).b();
        ((F5.c) sVar2.f2841v).debug("OtelCrashReporter: Flushing crash report to disk...");
        obj2 = (F5.d) sVar2.f2840u;
        dVar.f1302n = sVar2;
        dVar.f1303u = null;
        dVar.f1306x = 2;
        if (F5.j.a((F5.j) obj2, dVar) != aVar) {
        }
        return aVar;
    }

    public void p(InterfaceC3511lN interfaceC3511lN) {
        ((List) this.f2840u).add(interfaceC3511lN);
    }

    public void r(InterfaceC3511lN interfaceC3511lN) {
        ((List) this.f2841v).add(interfaceC3511lN);
    }

    public boolean s(int i) {
        return ((XO) this.f2840u).f28523a.get(i);
    }

    public C3565mN t() {
        return new C3565mN((List) this.f2840u, (List) this.f2841v);
    }

    public String toString() {
        switch (this.f2839n) {
            case 4:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f2841v.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f2840u;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Set u(C3257gk c3257gk) {
        return Collections.singleton(new C2491Bl(c3257gk, AbstractC3413jg.f31275h));
    }

    public Set v(C3257gk c3257gk) {
        return Collections.singleton(new C2491Bl(c3257gk, AbstractC3413jg.f31275h));
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2839n) {
            case 15:
                break;
            default:
                ((Lu) ((T8) this.f2841v).f27700y).f26191c.M1(new C2991bm(20, (Iu) this.f2840u, th));
                break;
        }
    }

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        try {
            String canonicalName = ((BinderC2466Ad) this.f2841v).f23682n.getClass().getCanonicalName();
            int i = c4631a.f38568a;
            String str = c4631a.f38569b;
            String str2 = c4631a.f38570c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            v2.i.a(sb.toString());
            InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) this.f2840u;
            interfaceC3841rd.n3(c4631a.a());
            interfaceC3841rd.O3(i, str);
            interfaceC3841rd.j0(i);
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    public void y(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put(NativeAdvancedJsUtils.f17906p, (String) this.f2841v);
            InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f2840u;
            if (interfaceC4061vh != null) {
                interfaceC4061vh.e("onError", put);
            }
        } catch (JSONException e9) {
            int i = z.f41322b;
            v2.i.d("Error occurred while dispatching error event.", e9);
        }
    }

    public void z(int i, int i6, int i9, int i10) {
        try {
            ((InterfaceC4061vh) this.f2840u).e("onSizeChanged", new JSONObject().put("x", i).put("y", i6).put("width", i9).put("height", i10));
        } catch (JSONException e9) {
            int i11 = z.f41322b;
            v2.i.d("Error occurred while dispatching size change.", e9);
        }
    }

    public s(C3309hi c3309hi, Context context, RD rd) {
        this.f2839n = 16;
        this.f2840u = c3309hi;
        this.f2841v = context;
    }

    public s(D4 d42) {
        this.f2839n = 9;
        Objects.requireNonNull(d42);
        this.f2841v = d42;
        this.f2840u = new C4233yr(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101dq
    /* renamed from: c, reason: collision with other method in class */
    public Object mo3c() {
        C5110a c5110a = (C5110a) this.f2840u;
        int i = c5110a.f41392u;
        int length = String.valueOf(i).length();
        int i6 = c5110a.f41393v;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i6).length());
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12378z);
        sb.append(i6);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(sb2)) {
                return new Yv(new C3731pa("Google", sb2), (WebView) this.f2841v);
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    public s(T8 t82, Iu iu) {
        this.f2839n = 19;
        this.f2840u = iu;
        Objects.requireNonNull(t82);
        this.f2841v = t82;
    }

    public s(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd) {
        this.f2839n = 10;
        this.f2840u = interfaceC3841rd;
        Objects.requireNonNull(binderC2466Ad);
        this.f2841v = binderC2466Ad;
    }

    public s(C3959tn c3959tn, String str, InterfaceC3249gc interfaceC3249gc) {
        this.f2839n = 15;
        this.f2840u = str;
        this.f2841v = interfaceC3249gc;
        Objects.requireNonNull(c3959tn);
    }

    public s(C3500lC c3500lC, int[] iArr) {
        this.f2839n = 20;
        this.f2840u = RB.n(c3500lC);
        this.f2841v = iArr;
    }

    public s(XO xo, SparseArray sparseArray) {
        this.f2839n = 24;
        this.f2840u = xo;
        SparseBooleanArray sparseBooleanArray = xo.f28523a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            AbstractC2772Sd.K(i, sparseBooleanArray.size());
            int keyAt = sparseBooleanArray.keyAt(i);
            C4159xO c4159xO = (C4159xO) sparseArray.get(keyAt);
            c4159xO.getClass();
            sparseArray2.append(keyAt, c4159xO);
        }
        this.f2841v = sparseArray2;
    }

    @Override // com.google.android.gms.internal.ads.Hu
    /* renamed from: c, reason: collision with other method in class */
    public void mo4c() {
        C3892sa c3892sa = (C3892sa) ((C2530Dq) this.f2840u).f24469d;
        BinderC3838ra binderC3838ra = (BinderC3838ra) this.f2841v;
        Parcel H02 = c3892sa.H0();
        AbstractC3388j8.e(H02, binderC3838ra);
        c3892sa.f1(H02, 1);
    }

    public /* synthetic */ s(Object obj) {
        this.f2839n = 4;
        this.f2841v = obj;
        this.f2840u = new ArrayList();
    }

    public s(int i) {
        this.f2839n = i;
        switch (i) {
            case 21:
                s sVar = MA.f26256H;
                this.f2840u = new C3481ku((C3481ku) sVar.f2840u);
                this.f2841v = Arrays.copyOf((long[]) sVar.f2841v, 10);
                break;
        }
    }

    public s(Context context) {
        this.f2839n = 25;
        this.f2840u = context == null ? null : context.getApplicationContext();
    }

    public s(E3.e eVar) {
        this.f2839n = 7;
        this.f2840u = new HashMap();
        this.f2841v = eVar;
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f2839n = 0;
        this.f2840u = workDatabase_Impl;
        this.f2841v = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    public s(O3.g gVar) {
        this.f2839n = 28;
        this.f2841v = gVar;
    }

    private final void q(Throwable th) {
    }

    public s(Animation animation) {
        this.f2839n = 6;
        this.f2840u = animation;
        this.f2841v = null;
    }

    public s(Animator animator) {
        this.f2839n = 6;
        this.f2840u = null;
        this.f2841v = animator;
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.f2839n = 1;
        int size = arrayList.size();
        this.f2840u = new int[size];
        this.f2841v = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f2840u)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2841v)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public s(int i, int i6, int i9, byte b9) {
        List arrayList;
        Object arrayList2;
        this.f2839n = i9;
        switch (i9) {
            case 23:
                if (i == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList(i);
                }
                this.f2840u = arrayList;
                if (i6 == 0) {
                    arrayList2 = Collections.EMPTY_LIST;
                } else {
                    arrayList2 = new ArrayList(i6);
                }
                this.f2841v = arrayList2;
                break;
            default:
                this.f2840u = new int[]{i, i6};
                this.f2841v = new float[]{0.0f, 1.0f};
                break;
        }
    }

    public s(int i, int i6, int i9) {
        this.f2839n = 1;
        this.f2840u = new int[]{i, i6, i9};
        this.f2841v = new float[]{0.0f, 0.5f, 1.0f};
    }

    public s(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, Intent intent) {
        this.f2839n = 27;
        this.f2841v = gzopSportsRacinggamesActivity;
        this.f2840u = intent;
    }

    @Override // com.google.android.gms.internal.ads.B4
    public void b(Dt dt, S0 s02, F4 f42) {
    }
}

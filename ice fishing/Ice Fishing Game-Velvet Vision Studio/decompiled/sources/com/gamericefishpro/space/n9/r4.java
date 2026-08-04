package com.gamericefishpro.space.n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r4 extends z1 {
    public static final String[] B = {"firebase_", "google_", "ga_"};
    public static final String[] C = {"_err"};
    public Integer A;
    public SecureRandom i;
    public final AtomicLong v;
    public int w;
    public com.gamericefishpro.space.n5.b y;
    public Boolean z;

    public r4(r1 r1Var) {
        super(r1Var);
        this.A = null;
        this.v = new AtomicLong(0L);
    }

    public static void H(q4 q4Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        k0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        q4Var.a(str, "_err", bundle);
    }

    public static MessageDigest I() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long J(byte[] bArr) {
        com.gamericefishpro.space.v8.c0.g(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean K(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean N(String str) {
        String str2 = (String) e0.r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean P(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean Q(String str, String[] strArr) {
        com.gamericefishpro.space.v8.c0.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] V(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList g0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.d);
            bundle.putString("origin", eVar.e);
            bundle.putLong("creation_timestamp", eVar.v);
            bundle.putString("name", eVar.i.e);
            Object objB = eVar.i.b();
            com.gamericefishpro.space.v8.c0.g(objB);
            f2.c(bundle, objB);
            bundle.putBoolean("active", eVar.w);
            String str = eVar.y;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.z;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.d);
                t tVar = uVar.e;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.f());
                }
            }
            bundle.putLong("trigger_timeout", eVar.A);
            u uVar2 = eVar.B;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.d);
                t tVar2 = uVar2.e;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.i.i);
            bundle.putLong("time_to_live", eVar.C);
            u uVar3 = eVar.D;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.d);
                t tVar3 = uVar3.e;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean h0(Context context) {
        ActivityInfo receiverInfo;
        com.gamericefishpro.space.v8.c0.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void i0(b3 b3Var, Bundle bundle, boolean z) {
        if (bundle != null && b3Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = b3Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = b3Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", b3Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && b3Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean k0(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean p0(String str) {
        com.gamericefishpro.space.v8.c0.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String w(String str, boolean z, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    public static boolean z0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final void A(w0 w0Var, int i) {
        Bundle bundle = (Bundle) w0Var.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (p0(str) && (i2 = i2 + 1) > i) {
                r1 r1Var = (r1) this.d;
                g gVar = r1Var.v;
                p0 p0Var = r1Var.C;
                if (!gVar.B(null, e0.e1) || !z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.A.c(string, p0Var.a((String) w0Var.c), p0Var.e(bundle));
                    k0(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final boolean A0(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.D.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final void B(Parcelable[] parcelableArr, int i) {
        com.gamericefishpro.space.v8.c0.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (p0(str) && !Q(str, f2.h) && (i2 = i2 + 1) > i) {
                    r1 r1Var = (r1) this.d;
                    g gVar = r1Var.v;
                    p0 p0Var = r1Var.C;
                    if (!gVar.B(null, e0.e1) || !z) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        t0 t0Var = v0Var.A;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        t0Var.c(sb.toString(), p0Var.b(str), p0Var.e(bundle));
                    }
                    k0(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void B0(String str, String str2, Bundle bundle, List list, boolean z) {
        int iX0;
        int iX;
        list = list;
        if (bundle == null) {
            return;
        }
        r1 r1Var = (r1) this.d;
        g gVar = r1Var.v;
        v0 v0Var = r1Var.y;
        p0 p0Var = r1Var.C;
        r4 r4Var = ((r1) gVar.d).B;
        r1.j(r4Var);
        int i = true != r4Var.W(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iX0 = !z ? x0(str3) : 0;
                if (iX0 == 0) {
                    iX0 = y0(str3);
                }
            } else {
                iX0 = 0;
            }
            if (iX0 != 0) {
                D(bundle, iX0, str3, iX0 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (z0(bundle.get(str3))) {
                    r1.l(v0Var);
                    v0Var.D.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iX = 22;
                } else {
                    iX = x(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iX != 0 && !"_ev".equals(str3)) {
                    D(bundle, iX, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (p0(str3) && !Q(str3, f2.h)) {
                    int i3 = i2 + 1;
                    if (!W(231100000)) {
                        r1.l(v0Var);
                        v0Var.A.c("Item array not supported on client's version of Google Play Services (Android Only)", p0Var.a(str), p0Var.e(bundle));
                        k0(bundle, 23);
                        bundle.remove(str3);
                    } else if (i3 > i) {
                        if (!r1Var.v.B(null, e0.e1) || !z2) {
                            r1.l(v0Var);
                            t0 t0Var = v0Var.A;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            t0Var.c(sb.toString(), p0Var.a(str), p0Var.e(bundle));
                        }
                        k0(bundle, 28);
                        bundle.remove(str3);
                        list = list;
                        i2 = i3;
                        z2 = true;
                    }
                    i2 = i3;
                }
            }
        }
    }

    public final void C(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                r4 r4Var = ((r1) this.d).B;
                r1.j(r4Var);
                r4Var.G(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void D(Bundle bundle, int i, String str, Object obj) {
        if (k0(bundle, i)) {
            ((r1) this.d).getClass();
            bundle.putString("_ev", w(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int E(Object obj, String str) {
        return "_ldl".equals(str) ? A0("user property referrer", str, m0(str), obj) : A0("user property", str, m0(str), obj) ? 0 : 7;
    }

    public final Object F(Object obj, String str) {
        return "_ldl".equals(str) ? l0(m0(str), obj, true, false) : l0(m0(str), obj, false, false);
    }

    public final void G(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            r1 r1Var = (r1) this.d;
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.D.c("Not putting event parameter. Invalid value type. name, type", r1Var.C.b(str), simpleName);
        }
    }

    public final com.gamericefishpro.space.n5.b L() {
        com.gamericefishpro.space.o5.c bVar;
        Object objInvoke;
        if (this.y == null) {
            Context context = ((r1) this.d).d;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            int i = Build.VERSION.SDK_INT;
            com.gamericefishpro.space.l5.b bVar2 = com.gamericefishpro.space.l5.b.a;
            if (i >= 33) {
                bVar2.a();
            }
            if ((i >= 33 ? bVar2.a() : 0) >= 5) {
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService((Class<Object>) com.appsflyer.internal.m.j());
                Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
                bVar = new com.gamericefishpro.space.o5.b(com.appsflyer.internal.m.e(systemService));
            } else {
                com.gamericefishpro.space.l5.a aVar = com.gamericefishpro.space.l5.a.a;
                if (((i == 31 || i == 32) ? aVar.a() : 0) >= 9) {
                    com.gamericefishpro.space.b2.d0 manager = new com.gamericefishpro.space.b2.d0(23, context);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("MeasurementManager", "tag");
                    Intrinsics.checkNotNullParameter(manager, "manager");
                    try {
                        objInvoke = manager.invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 == 31 || i2 == 32) {
                            aVar.a();
                        }
                        objInvoke = null;
                    }
                    bVar = (com.gamericefishpro.space.o5.c) objInvoke;
                } else {
                    bVar = null;
                }
            }
            this.y = bVar != null ? new com.gamericefishpro.space.n5.b(bVar) : null;
        }
        return this.y;
    }

    public final long M() {
        long j;
        Object e;
        Integer num;
        r();
        r1 r1Var = (r1) this.d;
        m0 m0VarQ = r1Var.q();
        v0 v0Var = r1Var.y;
        if (!N(m0VarQ.x())) {
            return 0L;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        Integer num2 = null;
        if (i < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) e0.l0.a(null)).intValue() ? 16L : 0L;
        }
        if (!O("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.z != null) {
                zBooleanValue = this.z.booleanValue();
            } else {
                com.gamericefishpro.space.n5.b bVarL = L();
                if (bVarL != null) {
                    try {
                        num = (Integer) bVarL.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                num2 = num;
                                r1.l(v0Var);
                                v0Var.B.b(e, "Measurement manager api exception");
                                this.z = Boolean.FALSE;
                                num = num2;
                            } catch (CancellationException e3) {
                                e = e3;
                                num2 = num;
                                r1.l(v0Var);
                                v0Var.B.b(e, "Measurement manager api exception");
                                this.z = Boolean.FALSE;
                                num = num2;
                            } catch (ExecutionException e4) {
                                e = e4;
                                num2 = num;
                                r1.l(v0Var);
                                v0Var.B.b(e, "Measurement manager api exception");
                                this.z = Boolean.FALSE;
                                num = num2;
                            } catch (TimeoutException e5) {
                                e = e5;
                                num2 = num;
                                r1.l(v0Var);
                                v0Var.B.b(e, "Measurement manager api exception");
                                this.z = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.z = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                    }
                    r1.l(v0Var);
                    v0Var.G.b(num, "Measurement manager api status result");
                    zBooleanValue = this.z.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final boolean O(String str) {
        r();
        r1 r1Var = (r1) this.d;
        if (com.gamericefishpro.space.b9.c.a(r1Var.d).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.F.b(str, "Permission not granted");
        return false;
    }

    public final boolean R(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((r1) this.d).v.v("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle S(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objY = y(bundle.get(str), str);
                if (objY == null) {
                    r1 r1Var = (r1) this.d;
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.D.b(r1Var.C.b(str), "Param value can't be null");
                } else {
                    G(bundle2, str, objY);
                }
            }
        }
        return bundle2;
    }

    public final u T(String str, Bundle bundle, String str2, long j, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (v0(str) != 0) {
            r1 r1Var = (r1) this.d;
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(r1Var.C.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleZ = z(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleZ = S(bundleZ);
        }
        com.gamericefishpro.space.v8.c0.g(bundleZ);
        return new u(str, new t(bundleZ), str2, j);
    }

    public final boolean U(Context context, String str) {
        Signature[] signatureArr;
        r1 r1Var = (r1) this.d;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = com.gamericefishpro.space.b9.c.a(context).e(64, str);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean W(int i) {
        Boolean bool = ((r1) this.d).o().w;
        if (X() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int X() {
        if (this.A == null) {
            r1 r1Var = (r1) this.d;
            com.gamericefishpro.space.s8.f fVar = com.gamericefishpro.space.s8.f.b;
            Context context = r1Var.d;
            fVar.getClass();
            AtomicBoolean atomicBoolean = com.gamericefishpro.space.s8.h.a;
            int i = 0;
            try {
                i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.A = Integer.valueOf(i / 1000);
        }
        return this.A.intValue();
    }

    public final void Y(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void Z(String str, com.gamericefishpro.space.i9.l0 l0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning string value to wrapper");
        }
    }

    public final void a0(com.gamericefishpro.space.i9.l0 l0Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning long value to wrapper");
        }
    }

    public final void b0(com.gamericefishpro.space.i9.l0 l0Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning int value to wrapper");
        }
    }

    public final void c0(com.gamericefishpro.space.i9.l0 l0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void d0(com.gamericefishpro.space.i9.l0 l0Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void e0(com.gamericefishpro.space.i9.l0 l0Var, Bundle bundle) {
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void f0(com.gamericefishpro.space.i9.l0 l0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String j0() {
        byte[] bArr = new byte[16];
        o0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object l0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return w(obj.toString(), z, i);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleS = S((Bundle) parcelable);
                if (!bundleS.isEmpty()) {
                    arrayList.add(bundleS);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int m0(String str) {
        r1 r1Var = (r1) this.d;
        if ("_ldl".equals(str)) {
            r1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            r1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            r1Var.getClass();
            return 100;
        }
        r1Var.getClass();
        return 36;
    }

    public final long n0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.v;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.v;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((r1) this.d).D.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.w + 1;
            this.w = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    public final SecureRandom o0() {
        r();
        if (this.i == null) {
            this.i = new SecureRandom();
        }
        return this.i;
    }

    public final Bundle q0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("sfmc_id", queryParameter9);
            }
            for (String str : uri.getQueryParameterNames()) {
                if (str.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.B.b(e, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean r0(String str, String str2) {
        r1 r1Var = (r1) this.d;
        if (str2 == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.A.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.A.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.A.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = r1Var.y;
                r1.l(v0Var4);
                v0Var4.A.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.gamericefishpro.space.n9.z1
    public final boolean s() {
        return true;
    }

    public final boolean s0(String str, String str2) {
        r1 r1Var = (r1) this.d;
        if (str2 == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.A.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.A.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                v0 v0Var3 = r1Var.y;
                r1.l(v0Var3);
                v0Var3.A.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                v0 v0Var4 = r1Var.y;
                r1.l(v0Var4);
                v0Var4.A.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean t0(String str, String[] strArr, String[] strArr2, String str2) {
        r1 r1Var = (r1) this.d;
        if (str2 == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.A.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(B[i])) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.A.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !Q(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && Q(str2, strArr2)) {
            return true;
        }
        v0 v0Var3 = r1Var.y;
        r1.l(v0Var3);
        v0Var3.A.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean u0(int i, String str, String str2) {
        r1 r1Var = (r1) this.d;
        if (str2 == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.A.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        v0 v0Var2 = r1Var.y;
        r1.l(v0Var2);
        v0Var2.A.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean v(String str) {
        r1 r1Var = (r1) this.d;
        if (TextUtils.isEmpty(str)) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.A.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.gamericefishpro.space.v8.c0.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        v0 v0Var2 = r1Var.y;
        r1.l(v0Var2);
        v0Var2.A.b(v0.z(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int v0(String str) {
        if (!s0("event", str)) {
            return 2;
        }
        if (!t0("event", f2.a, f2.b, str)) {
            return 13;
        }
        ((r1) this.d).getClass();
        return !u0(40, "event", str) ? 2 : 0;
    }

    public final int w0(String str) {
        if (!s0("user property", str)) {
            return 6;
        }
        if (!t0("user property", f2.i, null, str)) {
            return 15;
        }
        ((r1) this.d).getClass();
        return !u0(24, "user property", str) ? 6 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final int x(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        r1 r1Var = (r1) this.d;
        r();
        int i2 = 0;
        if (!z0(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!Q(str2, f2.g)) {
                return 20;
            }
            o3 o3VarO = r1Var.o();
            o3VarO.r();
            o3VarO.s();
            if (o3VarO.y()) {
                r4 r4Var = ((r1) o3VarO.d).B;
                r1.j(r4Var);
                if (r4Var.X() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.D.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        boolean zP = P(str);
        int iMax = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        if (zP || P(str2)) {
            r1Var.v.getClass();
            iMax = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
        } else {
            r1Var.v.getClass();
        }
        if (!A0("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                B0(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.D.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    B0(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        v0 v0Var3 = r1Var.y;
                        r1.l(v0Var3);
                        v0Var3.D.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    B0(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    public final int x0(String str) {
        if (!r0("event param", str)) {
            return 3;
        }
        if (!t0("event param", null, null, str)) {
            return 14;
        }
        ((r1) this.d).getClass();
        return !u0(40, "event param", str) ? 3 : 0;
    }

    public final Object y(Object obj, String str) {
        r1 r1Var = (r1) this.d;
        boolean zEquals = "_ev".equals(str);
        int iMax = PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        if (zEquals) {
            r1Var.v.getClass();
            return l0(Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256), obj, true, true);
        }
        if (P(str)) {
            r1Var.v.getClass();
            iMax = Math.max(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, 256);
        } else {
            r1Var.v.getClass();
        }
        return l0(iMax, obj, false, true);
    }

    public final int y0(String str) {
        if (!s0("event param", str)) {
            return 3;
        }
        if (!t0("event param", null, null, str)) {
            return 14;
        }
        ((r1) this.d).getClass();
        return !u0(40, "event param", str) ? 3 : 0;
    }

    public final Bundle z(String str, Bundle bundle, List list, boolean z) {
        int iX0;
        list = list;
        boolean zQ = Q(str, f2.d);
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        r1 r1Var = (r1) this.d;
        g gVar = r1Var.v;
        p0 p0Var = r1Var.C;
        r4 r4Var = ((r1) gVar.d).B;
        r1.j(r4Var);
        int i = r4Var.W(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iX0 = !z ? x0(str3) : 0;
                if (iX0 == 0) {
                    iX0 = y0(str3);
                }
            } else {
                iX0 = 0;
            }
            if (iX0 != 0) {
                D(bundle2, iX0, str3, iX0 == 3 ? str3 : str2);
                bundle2.remove(str3);
            } else {
                int iX = x(str, str3, bundle.get(str3), bundle2, list, z, zQ);
                if (iX == 17) {
                    D(bundle2, 17, str3, Boolean.FALSE);
                } else if (iX != 0 && !"_ev".equals(str3)) {
                    D(bundle2, iX, iX == 21 ? str : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (p0(str3)) {
                    i2++;
                    if (i2 > i) {
                        if (!r1Var.v.B(str2, e0.e1) || !z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            v0 v0Var = r1Var.y;
                            r1.l(v0Var);
                            v0Var.A.c(string, p0Var.a(str), p0Var.e(bundle));
                        }
                        k0(bundle2, 5);
                        bundle2.remove(str3);
                        z2 = true;
                        str2 = str2;
                    }
                }
            }
            str2 = str2;
            str2 = str2;
        }
        return bundle2;
    }
}

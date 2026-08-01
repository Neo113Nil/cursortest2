package g1;

import B3.e;
import C2.BinderC0278k;
import D.y;
import I0.j;
import I0.o;
import L3.InterfaceC0315a;
import O.C0331f;
import O.InterfaceC0325c;
import P.u;
import V7.l;
import a.AbstractC0422a;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import androidx.fragment.app.K;
import androidx.fragment.app.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.bumptech.glide.d;
import com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AD;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.gms.internal.ads.InterfaceC4055vb;
import com.google.android.gms.internal.ads.Nw;
import com.google.android.gms.internal.ads.QC;
import com.icefishing.icefishingbigwin.AgeSelection;
import com.icefishing.icefishingbigwin.C5275R;
import com.icefishing.icefishingbigwin.GameCategoriesActivity;
import com.icefishing.icefishingbigwin.MainActivity;
import com.icefishing.icefishingbigwin.SplashActivity;
import com.icefishing.icefishingbigwin.ViewOnClickListenerC4399a;
import com.icefishing.icefishingbigwin.ViewOnClickListenerC4402d;
import com.icefishing.icefishingbigwin.r;
import e.C4455a;
import e.InterfaceC4456b;
import h.AbstractC4541a;
import h.C4539G;
import h.InterfaceC4542b;
import h.LayoutInflaterFactory2C4533A;
import h.w;
import i8.C4594a;
import i8.n;
import j4.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import kotlin.jvm.internal.h;
import l.k;
import m.InterfaceC4701n;
import m.U0;
import m8.x;
import o4.InterfaceC4799l;
import o4.m;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import p2.RunnableC4830e;
import q2.N0;
import r2.g;
import s1.f;
import t0.AbstractC5003S;
import t0.C4991F;
import t0.C5006a;
import u7.C5089g;
import v2.i;
import v7.C5127h;
import v7.t;
import z7.InterfaceC5267d;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4522b implements f, AD, o, InterfaceC0325c, l, V7.b, u, InterfaceC4456b, InterfaceC4799l, InterfaceC4542b, k, x, Nw, InterfaceC0315a {

    /* renamed from: v, reason: collision with root package name */
    public static SharedPreferences.Editor f37623v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37624n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f37625u;

    public /* synthetic */ C4522b(int i, Object obj) {
        this.f37624n = i;
        this.f37625u = obj;
    }

    public static String A(String str, EnumC4521a enumC4521a, boolean z3) {
        String str2 = enumC4521a.f37622n;
        if (z3) {
            str2 = ".temp".concat(str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b9 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b9)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return y.o("lottie_cache_", replaceAll, str2);
    }

    public static boolean K(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String U(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public P.k B(int i) {
        return null;
    }

    public AbstractC5003S C(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f37625u;
        int n9 = recyclerView.f5270x.n();
        int i6 = 0;
        AbstractC5003S abstractC5003S = null;
        while (true) {
            if (i6 >= n9) {
                break;
            }
            AbstractC5003S I8 = RecyclerView.I(recyclerView.f5270x.m(i6));
            if (I8 != null && !I8.h() && I8.f40595c == i) {
                if (!((ArrayList) recyclerView.f5270x.f38406w).contains(I8.f40593a)) {
                    abstractC5003S = I8;
                    break;
                }
                abstractC5003S = I8;
            }
            i6++;
        }
        if (abstractC5003S == null || ((ArrayList) recyclerView.f5270x.f38406w).contains(abstractC5003S.f40593a)) {
            return null;
        }
        return abstractC5003S;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(B7.c cVar) {
        G5.a aVar;
        int i;
        C5089g[] c5089gArr;
        String str;
        C5089g[] c5089gArr2;
        C4522b c4522b;
        if (cVar instanceof G5.a) {
            aVar = (G5.a) cVar;
            int i6 = aVar.f1079z;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.f1079z = i6 - Integer.MIN_VALUE;
                Object obj = aVar.f1077x;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.f1079z;
                if (i != 0) {
                    d.k(obj);
                    c5089gArr = new C5089g[10];
                    aVar.f1073n = this;
                    aVar.f1074u = c5089gArr;
                    aVar.f1075v = c5089gArr;
                    aVar.f1076w = "ossdk.install_id";
                    aVar.f1079z = 1;
                    Object installId = ((F5.f) this.f37625u).getInstallId(aVar);
                    if (installId == aVar2) {
                        return aVar2;
                    }
                    str = "ossdk.install_id";
                    obj = installId;
                    c5089gArr2 = c5089gArr;
                    c4522b = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = aVar.f1076w;
                    c5089gArr = aVar.f1075v;
                    c5089gArr2 = aVar.f1074u;
                    c4522b = aVar.f1073n;
                    d.k(obj);
                }
                c5089gArr[0] = new C5089g(str, obj);
                c5089gArr2[1] = new C5089g("ossdk.sdk_base", ((F5.f) c4522b.f37625u).getSdkBase());
                F5.f fVar = (F5.f) c4522b.f37625u;
                c5089gArr2[2] = new C5089g("ossdk.sdk_base_version", fVar.getSdkBaseVersion());
                c5089gArr2[3] = new C5089g("ossdk.app_package_id", fVar.getAppPackageId());
                c5089gArr2[4] = new C5089g("ossdk.app_version", fVar.getAppVersion());
                c5089gArr2[5] = new C5089g("device.manufacturer", fVar.getDeviceManufacturer());
                c5089gArr2[6] = new C5089g("device.model.identifier", fVar.getDeviceModel());
                c5089gArr2[7] = new C5089g("os.name", fVar.getOsName());
                c5089gArr2[8] = new C5089g("os.version", fVar.getOsVersion());
                c5089gArr2[9] = new C5089g("os.build_id", fVar.getOsBuildId());
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.P(c5089gArr2.length));
                t.R(linkedHashMap, c5089gArr2);
                AbstractC0422a.t(linkedHashMap, "ossdk.sdk_wrapper", fVar.getSdkWrapper());
                AbstractC0422a.t(linkedHashMap, "ossdk.sdk_wrapper_version", fVar.getSdkWrapperVersion());
                Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
                h.d(unmodifiableMap, "unmodifiableMap(...)");
                return unmodifiableMap;
            }
        }
        aVar = new G5.a(this, cVar);
        Object obj2 = aVar.f1077x;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.f1079z;
        if (i != 0) {
        }
        c5089gArr[0] = new C5089g(str, obj2);
        c5089gArr2[1] = new C5089g("ossdk.sdk_base", ((F5.f) c4522b.f37625u).getSdkBase());
        F5.f fVar2 = (F5.f) c4522b.f37625u;
        c5089gArr2[2] = new C5089g("ossdk.sdk_base_version", fVar2.getSdkBaseVersion());
        c5089gArr2[3] = new C5089g("ossdk.app_package_id", fVar2.getAppPackageId());
        c5089gArr2[4] = new C5089g("ossdk.app_version", fVar2.getAppVersion());
        c5089gArr2[5] = new C5089g("device.manufacturer", fVar2.getDeviceManufacturer());
        c5089gArr2[6] = new C5089g("device.model.identifier", fVar2.getDeviceModel());
        c5089gArr2[7] = new C5089g("os.name", fVar2.getOsName());
        c5089gArr2[8] = new C5089g("os.version", fVar2.getOsVersion());
        c5089gArr2[9] = new C5089g("os.build_id", fVar2.getOsBuildId());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.P(c5089gArr2.length));
        t.R(linkedHashMap2, c5089gArr2);
        AbstractC0422a.t(linkedHashMap2, "ossdk.sdk_wrapper", fVar2.getSdkWrapper());
        AbstractC0422a.t(linkedHashMap2, "ossdk.sdk_wrapper_version", fVar2.getSdkWrapperVersion());
        Map unmodifiableMap2 = Collections.unmodifiableMap(linkedHashMap2);
        h.d(unmodifiableMap2, "unmodifiableMap(...)");
        return unmodifiableMap2;
    }

    public boolean E(String str) {
        String J = J(str);
        return "1".equals(J) || Boolean.parseBoolean(J);
    }

    public File F(String str) {
        File file = new File(S(), A(str, EnumC4521a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(S(), A(str, EnumC4521a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(S(), A(str, EnumC4521a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public Integer G(String str) {
        String J = J(str);
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(J));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + U(str) + "(" + J + ") into an int");
            return null;
        }
    }

    public JSONArray H(String str) {
        String J = J(str);
        if (TextUtils.isEmpty(J)) {
            return null;
        }
        try {
            return new JSONArray(J);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + U(str) + ": " + J + ", falling back to default");
            return null;
        }
    }

    public String I(Resources resources, String str, String str2) {
        String[] strArr;
        String J = J(str2);
        if (!TextUtils.isEmpty(J)) {
            return J;
        }
        String J2 = J(str2.concat("_loc_key"));
        if (!TextUtils.isEmpty(J2)) {
            int identifier = resources.getIdentifier(J2, com.anythink.expressad.foundation.h.k.f19636g, str);
            if (identifier == 0) {
                Log.w("NotificationParams", U(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            JSONArray H8 = H(str2.concat("_loc_args"));
            if (H8 == null) {
                strArr = null;
            } else {
                int length = H8.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = H8.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e9) {
                Log.w("NotificationParams", "Missing format argument for " + U(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e9);
            }
        }
        return null;
    }

    public String J(String str) {
        Bundle bundle = (Bundle) this.f37625u;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // L3.InterfaceC0315a
    public void L(Bundle bundle) {
        g gVar = (g) this.f37625u;
        if (gVar != null) {
            try {
                gVar.L(bundle);
            } catch (RemoteException e9) {
                i.d("RemoteException in onError", e9);
            }
        }
    }

    public void M(int i, int i6) {
        int i9;
        int i10;
        RecyclerView recyclerView = (RecyclerView) this.f37625u;
        int n9 = recyclerView.f5270x.n();
        int i11 = i6 + i;
        for (int i12 = 0; i12 < n9; i12++) {
            View m4 = recyclerView.f5270x.m(i12);
            AbstractC5003S I8 = RecyclerView.I(m4);
            if (I8 != null && !I8.o() && (i10 = I8.f40595c) >= i && i10 < i11) {
                I8.a(2);
                I8.a(1024);
                ((C4991F) m4.getLayoutParams()).f40556c = true;
            }
        }
        C3675oP c3675oP = recyclerView.f5264u;
        ArrayList arrayList = (ArrayList) c3675oP.f32901e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(size);
            if (abstractC5003S != null && (i9 = abstractC5003S.f40595c) >= i && i9 < i11) {
                abstractC5003S.a(2);
                c3675oP.e(size);
            }
        }
        recyclerView.f5234M0 = true;
    }

    public void N(int i, int i6) {
        RecyclerView recyclerView = (RecyclerView) this.f37625u;
        int n9 = recyclerView.f5270x.n();
        for (int i9 = 0; i9 < n9; i9++) {
            AbstractC5003S I8 = RecyclerView.I(recyclerView.f5270x.m(i9));
            if (I8 != null && !I8.o() && I8.f40595c >= i) {
                I8.l(i6, false);
                recyclerView.f5227I0.f40577f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f5264u.f32901e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(i10);
            if (abstractC5003S != null && abstractC5003S.f40595c >= i) {
                abstractC5003S.l(i6, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5232L0 = true;
    }

    @Override // L3.InterfaceC0315a
    public void O(Bundle bundle) {
        g gVar = (g) this.f37625u;
        if (gVar != null) {
            try {
                gVar.O(bundle);
            } catch (RemoteException e9) {
                i.d("RemoteException in onShown", e9);
            }
        }
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        switch (this.f37624n) {
            case 14:
                ViewOnClickListenerC4399a viewOnClickListenerC4399a = (ViewOnClickListenerC4399a) this.f37625u;
                viewOnClickListenerC4399a.f36900u.startActivity(new Intent(viewOnClickListenerC4399a.f36900u, (Class<?>) GameCategoriesActivity.class));
                break;
            case 15:
                ViewOnClickListenerC4402d viewOnClickListenerC4402d = (ViewOnClickListenerC4402d) this.f37625u;
                viewOnClickListenerC4402d.f36908u.startActivity(new Intent(viewOnClickListenerC4402d.f36908u, (Class<?>) AgeSelection.class));
                break;
            case 16:
                r rVar = (r) this.f37625u;
                rVar.f36934v.f36808v.stopLoading();
                rVar.f36934v.f36808v.destroy();
                rVar.f36934v.f36808v.removeAllViews();
                rVar.f36933u.dismiss();
                rVar.f36934v.finish();
                break;
            default:
                MainActivity mainActivity = ((com.icefishing.icefishingbigwin.x) this.f37625u).f36946u.f36949c;
                mainActivity.startActivity(mainActivity.f36844S);
                break;
        }
    }

    public void P(int i, int i6) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = (RecyclerView) this.f37625u;
        int n9 = recyclerView.f5270x.n();
        int i16 = -1;
        if (i < i6) {
            i10 = i;
            i9 = i6;
            i11 = -1;
        } else {
            i9 = i;
            i10 = i6;
            i11 = 1;
        }
        for (int i17 = 0; i17 < n9; i17++) {
            AbstractC5003S I8 = RecyclerView.I(recyclerView.f5270x.m(i17));
            if (I8 != null && (i15 = I8.f40595c) >= i10 && i15 <= i9) {
                if (i15 == i) {
                    I8.l(i6 - i, false);
                } else {
                    I8.l(i11, false);
                }
                recyclerView.f5227I0.f40577f = true;
            }
        }
        C3675oP c3675oP = recyclerView.f5264u;
        c3675oP.getClass();
        if (i < i6) {
            i13 = i;
            i12 = i6;
        } else {
            i12 = i;
            i13 = i6;
            i16 = 1;
        }
        ArrayList arrayList = (ArrayList) c3675oP.f32901e;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            AbstractC5003S abstractC5003S = (AbstractC5003S) arrayList.get(i18);
            if (abstractC5003S != null && (i14 = abstractC5003S.f40595c) >= i13 && i14 <= i12) {
                if (i14 == i) {
                    abstractC5003S.l(i6 - i, false);
                } else {
                    abstractC5003S.l(i16, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5232L0 = true;
    }

    public void Q() {
        NetworkInfo activeNetworkInfo;
        boolean z3 = m.f39612d.getBoolean("app_AppOpenAdStatus", false);
        String string = m.f39612d.getString("AppOpenID", "");
        q qVar = (q) this.f37625u;
        if (!z3 || string.isEmpty() || (activeNetworkInfo = ((ConnectivityManager) ((SplashActivity) qVar.f38436w).getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            ((F1.a) qVar.f38433n).r();
            return;
        }
        Log.d("Workingdone", "5");
        if (z3) {
            Log.d("Workingdone", "6");
        } else {
            Log.d("Workingdone", "7");
            ((F1.a) qVar.f38435v).r();
        }
    }

    public Bundle R() {
        Bundle bundle = (Bundle) this.f37625u;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public File S() {
        K0.l lVar = (K0.l) this.f37625u;
        lVar.getClass();
        File file = new File(lVar.f1525a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public boolean T(int i, int i6, Bundle bundle) {
        return false;
    }

    public File V(String str, InputStream inputStream, EnumC4521a enumC4521a) {
        File file = new File(S(), A(str, enumC4521a, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // L3.InterfaceC0315a
    public void W(Bundle bundle) {
        g gVar = (g) this.f37625u;
        if (gVar != null) {
            try {
                gVar.W(bundle);
            } catch (RemoteException e9) {
                i.d("RemoteException in onDismissed", e9);
            }
        }
    }

    public void X(k2.o oVar) {
        InterfaceC4055vb interfaceC4055vb = ((NativeAdView) this.f37625u).f23596u;
        if (interfaceC4055vb == null) {
            return;
        }
        try {
            if (oVar instanceof N0) {
                interfaceC4055vb.K2(((N0) oVar).f40068a);
            } else if (oVar == null) {
                interfaceC4055vb.K2(null);
            } else {
                i.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e9) {
            i.d("Unable to call setMediaContent on delegate", e9);
        }
    }

    @Override // P.u
    public boolean a(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f37625u;
        if (!DrawerLayout.n(view) || drawerLayout.i(view) == 2) {
            return false;
        }
        drawerLayout.b(view);
        return true;
    }

    @Override // O.InterfaceC0325c
    public void b(Bundle bundle) {
        ((ContentInfo.Builder) this.f37625u).setExtras(bundle);
    }

    @Override // O.InterfaceC0325c
    public C0331f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f37625u).build();
        return new C0331f(new C4523c(build));
    }

    @Override // com.google.android.gms.internal.ads.AD
    public N3.a c() {
        BinderC0278k binderC0278k = (BinderC0278k) this.f37625u;
        binderC0278k.getClass();
        try {
            return (N3.a) binderC0278k.Z3(binderC0278k.f373v, null, "BANNER", null, null, new Bundle()).f34352W.f();
        } catch (NullPointerException e9) {
            return QC.k(e9);
        }
    }

    @Override // I0.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) A8.b.d(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f37625u).createWebView(webView));
    }

    @Override // h.InterfaceC4542b
    public boolean d() {
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) this.f37625u;
        layoutInflaterFactory2C4533A.C();
        AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
        return (abstractC4541a == null || (abstractC4541a.d() & 4) == 0) ? false : true;
    }

    @Override // m8.x
    public boolean e(n url) {
        h.e(url, "url");
        return ((m8.t) this.f37625u).e(url);
    }

    @Override // O.InterfaceC0325c
    public void f(Uri uri) {
        ((ContentInfo.Builder) this.f37625u).setLinkUri(uri);
    }

    @Override // e.InterfaceC4456b
    public void g(Object obj) {
        C4455a c4455a = (C4455a) obj;
        N n9 = (N) this.f37625u;
        K k9 = (K) n9.f4840C.pollFirst();
        if (k9 == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        S0.n nVar = n9.f4852c;
        String str = k9.f4834n;
        AbstractComponentCallbacksC0475s i = nVar.i(str);
        if (i != null) {
            i.m(k9.f4835u, c4455a.f37078n, c4455a.f37079u);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // I0.o
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) A8.b.d(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f37625u).getProfileStore());
    }

    @Override // I0.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) A8.b.d(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f37625u).getStatics());
    }

    @Override // s1.f
    public void h(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l9 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f37625u)) {
            ((ByteBuffer) this.f37625u).position(0);
            messageDigest.update(((ByteBuffer) this.f37625u).putLong(l9.longValue()).array());
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void i(int i, long j6, String str) {
        ((RunnableC4830e) this.f37625u).f39701A.e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // h.InterfaceC4542b
    public Context j() {
        return ((LayoutInflaterFactory2C4533A) this.f37625u).z();
    }

    @Override // l.k
    public void k(l.m mVar) {
        switch (this.f37624n) {
            case 20:
                C4539G c4539g = (C4539G) this.f37625u;
                boolean p9 = c4539g.f37818a.f39081a.p();
                w wVar = c4539g.f37819b;
                if (!p9) {
                    if (wVar.onPreparePanel(0, null, mVar)) {
                        wVar.onMenuOpened(108, mVar);
                        break;
                    }
                } else {
                    wVar.onPanelClosed(108, mVar);
                    break;
                }
                break;
            default:
                k kVar = ((ActionMenuView) this.f37625u).f4564O;
                if (kVar != null) {
                    kVar.k(mVar);
                    break;
                }
                break;
        }
    }

    @Override // m8.x
    public C4594a l() {
        return ((m8.t) this.f37625u).f39418B;
    }

    @Override // m8.x
    public boolean m() {
        return ((m8.t) this.f37625u).f39420D.k();
    }

    @Override // O.InterfaceC0325c
    public void n(int i) {
        ((ContentInfo.Builder) this.f37625u).setFlags(i);
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void o(int i, long j6) {
        ((RunnableC4830e) this.f37625u).f39701A.b(i, System.currentTimeMillis() - j6);
    }

    @Override // V7.b
    public Object p(V7.c cVar, InterfaceC5267d interfaceC5267d) {
        ((V7.n) ((V7.k) this.f37625u)).p(cVar, interfaceC5267d);
        return A7.a.f58n;
    }

    @Override // l.k
    public boolean q(l.m mVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        switch (this.f37624n) {
            case 20:
                return false;
            default:
                InterfaceC4701n interfaceC4701n = ((ActionMenuView) this.f37625u).f4569T;
                if (interfaceC4701n == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((F1.a) interfaceC4701n).f903u;
                if (toolbar.f4612p0.a()) {
                    onMenuItemSelected = true;
                } else {
                    U0 u02 = toolbar.f4614r0;
                    onMenuItemSelected = u02 != null ? ((C4539G) ((j) u02).f1264u).f37819b.f37917n.onMenuItemSelected(0, menuItem) : false;
                }
                return onMenuItemSelected;
        }
    }

    @Override // I0.o
    public String[] r() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f37625u).getSupportedFeatures();
    }

    @Override // m8.x
    public boolean s(m8.r rVar) {
        return ((m8.t) this.f37625u).s(rVar);
    }

    @Override // h.InterfaceC4542b
    public Drawable t() {
        j4.g r9 = j4.g.r(((LayoutInflaterFactory2C4533A) this.f37625u).z(), null, new int[]{C5275R.attr.homeAsUpIndicator});
        Drawable i = r9.i(0);
        r9.t();
        return i;
    }

    @Override // h.InterfaceC4542b
    public void u(int i) {
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) this.f37625u;
        layoutInflaterFactory2C4533A.C();
        AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
        if (abstractC4541a != null) {
            abstractC4541a.n(i);
        }
    }

    @Override // m8.x
    public C5127h v() {
        return ((m8.t) this.f37625u).f39424H;
    }

    @Override // m8.x
    public m8.w w() {
        return ((m8.t) this.f37625u).a();
    }

    @Override // h.InterfaceC4542b
    public void x(j.a aVar, int i) {
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) this.f37625u;
        layoutInflaterFactory2C4533A.C();
        AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
        if (abstractC4541a != null) {
            abstractC4541a.o(aVar);
            abstractC4541a.n(i);
        }
    }

    public P.k y(int i) {
        return null;
    }

    public void z(C5006a c5006a) {
        int i = c5006a.f40641a;
        RecyclerView recyclerView = (RecyclerView) this.f37625u;
        if (i == 1) {
            recyclerView.f5218E.W(c5006a.f40642b, c5006a.f40643c);
            return;
        }
        if (i == 2) {
            recyclerView.f5218E.Z(c5006a.f40642b, c5006a.f40643c);
        } else if (i == 4) {
            recyclerView.f5218E.a0(c5006a.f40642b, c5006a.f40643c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f5218E.Y(c5006a.f40642b, c5006a.f40643c);
        }
    }

    public C4522b(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, g gVar) {
        this.f37624n = 28;
        this.f37625u = gVar;
    }

    public C4522b(RunnableC4830e runnableC4830e) {
        this.f37624n = 27;
        Objects.requireNonNull(runnableC4830e);
        this.f37625u = runnableC4830e;
    }

    public C4522b(SplashActivity splashActivity) {
        this.f37624n = 18;
        SharedPreferences sharedPreferences = splashActivity.getSharedPreferences("HeartRate", 0);
        this.f37625u = sharedPreferences;
        f37623v = sharedPreferences.edit();
    }

    public C4522b(j jVar) {
        this.f37624n = 13;
        this.f37625u = Collections.unmodifiableMap(new HashMap((HashMap) jVar.f1264u));
    }

    public C4522b(WorkDatabase workDatabase) {
        this.f37624n = 8;
        h.e(workDatabase, "workDatabase");
        this.f37625u = workDatabase;
    }

    public C4522b(Bundle bundle) {
        this.f37624n = 22;
        this.f37625u = new Bundle(bundle);
    }

    public C4522b(int i) {
        this.f37624n = i;
        switch (i) {
            case 7:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f37625u = new P.m(this);
                    break;
                } else {
                    this.f37625u = new P.l(this);
                    break;
                }
            default:
                this.f37625u = ByteBuffer.allocate(8);
                break;
        }
    }

    public C4522b(TextView textView) {
        this.f37624n = 12;
        this.f37625u = new c0.g(textView);
    }

    public C4522b(ClipData clipData, int i) {
        this.f37624n = 6;
        this.f37625u = e.o(clipData, i);
    }
}

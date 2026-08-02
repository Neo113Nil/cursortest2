package S0;

import O.A0;
import O.InterfaceC0350u;
import O.X;
import O.y0;
import R2.w;
import a7.InterfaceC0450e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.GzopSportsRacinggamesActivity;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC2577Fj;
import com.google.android.gms.internal.ads.AbstractC2991bG;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.At;
import com.google.android.gms.internal.ads.BC;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.BinderC2486Ad;
import com.google.android.gms.internal.ads.BinderC2600Gp;
import com.google.android.gms.internal.ads.C2679Lj;
import com.google.android.gms.internal.ads.C2730Oj;
import com.google.android.gms.internal.ads.C2759Qe;
import com.google.android.gms.internal.ads.C2771Qq;
import com.google.android.gms.internal.ads.C2858Wc;
import com.google.android.gms.internal.ads.C2940aJ;
import com.google.android.gms.internal.ads.C2972ay;
import com.google.android.gms.internal.ads.C3047cJ;
import com.google.android.gms.internal.ads.C3069co;
import com.google.android.gms.internal.ads.C3219fd;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3557lt;
import com.google.android.gms.internal.ads.C3887s;
import com.google.android.gms.internal.ads.C4042ut;
import com.google.android.gms.internal.ads.C4074vO;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.EC;
import com.google.android.gms.internal.ads.InterfaceC2708Ne;
import com.google.android.gms.internal.ads.InterfaceC2728Oh;
import com.google.android.gms.internal.ads.InterfaceC3431jb;
import com.google.android.gms.internal.ads.InterfaceC3544lg;
import com.google.android.gms.internal.ads.InterfaceC3656nk;
import com.google.android.gms.internal.ads.InterfaceC3678o5;
import com.google.android.gms.internal.ads.InterfaceC3864rd;
import com.google.android.gms.internal.ads.InterfaceC3983to;
import com.google.android.gms.internal.ads.InterfaceC4236yO;
import com.google.android.gms.internal.ads.InterfaceC4312zt;
import com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2750Pm;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.LF;
import com.google.android.gms.internal.ads.MF;
import com.google.android.gms.internal.ads.Q;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RunnableC3493kj;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2529Cm;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.YI;
import com.google.android.gms.internal.ads.Yq;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g7.u;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import l7.C4678a;
import m2.C4741a;
import org.json.JSONObject;
import p7.C4853a;
import q7.C4887g;
import q7.C4888h;
import r2.C4906k;
import r6.C4910a;
import s2.C4969z0;
import u0.C5060i;
import w2.z;
import z2.InterfaceC5226c;

/* loaded from: classes.dex */
public final class c implements InterfaceC0350u, Y0.o, InterfaceC3678o5, InterfaceC3544lg, InterfaceC5226c, KD, InterfaceC3431jb, InterfaceC2728Oh, At, t.i, InterfaceC3983to {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2901n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2902u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2903v;

    public /* synthetic */ c(int i, Object obj) {
        this.f2901n = i;
        this.f2902u = obj;
        this.f2903v = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public void C(String str, int i, String str2, boolean z6) {
        C3490kg c3490kg = (C3490kg) this.f2903v;
        if (z6) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32852M2)).booleanValue()) {
                C4906k.f40186C.f40198k.getClass();
                ((C3069co) this.f2902u).c("rendering-webview-load-html-end", System.currentTimeMillis());
            }
            c3490kg.b(null);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Ad Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        c3490kg.c(new Exception(Wv.i(sb, ", Failing URL: ", str2)));
    }

    @Override // Y0.o
    public void OnCall() {
        ((GzopSportsRacinggamesActivity) this.f2903v).startActivity((Intent) this.f2902u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3983to
    public /* synthetic */ void a(Object obj, XO xo) {
        ((InterfaceC4236yO) obj).g((C4074vO) this.f2903v, new s(xo, ((BO) this.f2902u).f24670e));
    }

    @Override // t.i
    public Object b(t.h hVar) {
        String str;
        String str2;
        Context context = (Context) this.f2902u;
        C2972ay c2972ay = (C2972ay) this.f2903v;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            String[] strArr = {c2972ay.b0(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i = 0;
            int i4 = 0;
            while (true) {
                if (i4 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i4];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i4++;
            }
            BC bc = EC.f25318f;
            byte[] h3 = bc.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h3)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {c2972ay.c0(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
                while (true) {
                    if (i >= 2) {
                        str2 = "";
                        break;
                    }
                    str2 = strArr2[i];
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bc.f().h(str2))));
            }
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new V6(2, hVar));
            return "";
        } catch (PackageManager.NameNotFoundException | NoClassDefFoundError | CertificateException unused) {
            hVar.a("");
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3678o5
    public File c() {
        if (((File) this.f2902u) == null) {
            this.f2902u = new File(((Context) this.f2903v).getCacheDir(), "volley");
        }
        return (File) this.f2902u;
    }

    public X6.d d() {
        Logger logger = C4887g.f40076w;
        C4888h c4888h = new C4888h();
        C4887g c4887g = new C4887g(c4888h.f40082b, c4888h.f40083c, c4888h.f40084d, c4888h.f40085e, c4888h.f40086f, c4888h.f40081a, c4888h.f40087g.b());
        Logger logger2 = u.f37720A;
        C4853a c4853a = C4853a.f39847c;
        u uVar = new u(new ArrayList(), new IdentityHashMap(), new ArrayList(), c4853a, C4678a.f39001a, new K1.b(1).b());
        b7.n nVar = (b7.n) this.f2903v;
        if (nVar == null) {
            Logger logger3 = b7.n.f5606x;
            ArrayList arrayList = new ArrayList();
            C4853a c4853a2 = C4853a.f39847c;
            H5.a aVar = new H5.a(12);
            ArrayList arrayList2 = new ArrayList();
            InterfaceC0450e.m();
            nVar = new b7.n(c4853a2, aVar, arrayList, new a7.h(arrayList2));
        }
        return new X6.d(c4887g, uVar, nVar, (C4910a) this.f2902u);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb
    public void e(MotionEvent motionEvent) {
        ((AbstractBinderC3359i8) this.f2902u).onTouch(null, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory f(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f2903v) == null) {
            Context context = (Context) this.f2902u;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f2903v = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f2903v = map;
        }
        String str4 = (String) ((Map) this.f2903v).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e9) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e9);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f13164z, e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f13164z, e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    public ArrayList g(String str) {
        C5060i a9 = C5060i.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2902u;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m9.getCount());
            while (m9.moveToNext()) {
                arrayList.add(m9.isNull(0) ? null : m9.getString(0));
            }
            return arrayList;
        } finally {
            m9.close();
            a9.j();
        }
    }

    @Override // z2.InterfaceC5226c
    public void h(C4741a c4741a) {
        try {
            String canonicalName = ((BinderC2486Ad) this.f2903v).f24464n.getClass().getCanonicalName();
            int i = c4741a.f39357a;
            String str = c4741a.f39358b;
            String str2 = c4741a.f39359c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            x2.i.a(sb.toString());
            InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) this.f2902u;
            interfaceC3864rd.r0(c4741a.a());
            interfaceC3864rd.N3(i, str);
            interfaceC3864rd.j0(i);
        } catch (RemoteException e9) {
            x2.i.d("", e9);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb
    public JSONObject i() {
        return ((AbstractBinderC3359i8) this.f2902u).p();
    }

    public String j(String str) {
        String str2 = (String) this.f2903v;
        Resources resources = (Resources) this.f2902u;
        int identifier = resources.getIdentifier(str, com.anythink.expressad.foundation.h.k.f20423g, str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public synchronized P3.a k(e eVar, InterfaceC4312zt interfaceC4312zt, InterfaceC3656nk interfaceC3656nk) {
        C2759Qe c2759Qe;
        this.f2903v = interfaceC3656nk;
        if (interfaceC3656nk == null || (c2759Qe = (C2759Qe) eVar.f2908u) == null) {
            return ((C4042ut) this.f2902u).c(eVar, interfaceC4312zt, interfaceC3656nk);
        }
        C2730Oj c9 = interfaceC3656nk.c();
        return c9.c(c9.a(QC.c(c2759Qe)));
    }

    public void l(boolean z6, boolean z9) {
        synchronized (this) {
            boolean z10 = false;
            if (z6) {
                if (((PowerManager.WakeLock) this.f2903v) == null) {
                    Context context = (Context) this.f2902u;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC2991bG.y("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        AbstractC2991bG.y("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f2903v = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f2903v;
            if (wakeLock == null) {
                return;
            }
            if (z6 && z9) {
                z10 = true;
            }
            if (z10) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public C2940aJ m() {
        ECPoint eCPoint;
        C3047cJ c3047cJ = (C3047cJ) this.f2902u;
        if (c3047cJ == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        C3557lt c3557lt = (C3557lt) this.f2903v;
        if (c3557lt == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        YI yi = c3047cJ.f30224b.f29647b;
        BigInteger order = yi.f29445b.getOrder();
        BigInteger bigInteger = (BigInteger) c3557lt.f32643u;
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = MF.f27065a;
        ECParameterSpec eCParameterSpec2 = yi.f29445b;
        if (!MF.b(eCParameterSpec2, eCParameterSpec) && !MF.b(eCParameterSpec2, MF.f27066b) && !MF.b(eCParameterSpec2, MF.f27067c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec2.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec2.getCurve();
        ECPoint generator = eCParameterSpec2.getGenerator();
        MF.a(generator, curve);
        BigInteger a9 = eCParameterSpec2.getCurve().getA();
        BigInteger c9 = MF.c(curve);
        LF d9 = MF.d(ECPoint.POINT_INFINITY, c9);
        LF d10 = MF.d(generator, c9);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                d9 = MF.f(d9, d10, a9, c9);
                d10 = MF.e(d10, a9, c9);
            } else {
                d10 = MF.f(d9, d10, a9, c9);
                d9 = MF.e(d9, a9, c9);
            }
        }
        if (d9.f26886c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger modInverse = d9.f26886c.modInverse(c9);
            BigInteger mod = modInverse.multiply(modInverse).mod(c9);
            eCPoint = new ECPoint(d9.f26884a.multiply(mod).mod(c9), d9.f26885b.multiply(mod).mod(c9).multiply(modInverse).mod(c9));
        }
        MF.a(eCPoint, curve);
        if (eCPoint.equals(c3047cJ.f30225c)) {
            return new C2940aJ((C3047cJ) this.f2902u, (C3557lt) this.f2903v);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        Bundle bundle;
        switch (this.f2901n) {
            case 17:
                C2679Lj c2679Lj = (C2679Lj) this.f2903v;
                c2679Lj.getClass();
                AbstractC3436jg.f32060f.execute(new RunnableC3493kj(1, c2679Lj));
                ((C3887s) this.f2902u).mo10n((AbstractC2577Fj) obj);
                return;
            case 20:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    C3324ha c3324ha = AbstractC3592ma.f32828J2;
                    s2.r rVar = s2.r.f40506e;
                    boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
                    InterfaceC2708Ne interfaceC2708Ne = (InterfaceC2708Ne) this.f2903v;
                    if (!booleanValue) {
                        interfaceC2708Ne.E2(parcelFileDescriptor);
                        return;
                    }
                    boolean booleanValue2 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.f32837K2)).booleanValue();
                    C2759Qe c2759Qe = (C2759Qe) this.f2902u;
                    if (booleanValue2 && (bundle = c2759Qe.f27825F) != null) {
                        C4906k.f40186C.f40198k.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    interfaceC2708Ne.A1(parcelFileDescriptor, c2759Qe);
                    return;
                } catch (RemoteException e9) {
                    z.l("Service can't call client", e9);
                    return;
                }
            default:
                q qVar = (q) this.f2903v;
                Yq yq = (Yq) obj;
                synchronized (qVar) {
                    ((C2771Qq) qVar.f2964j).b(yq, (St) this.f2902u);
                    St a9 = ((C2771Qq) qVar.f2964j).a();
                    if (a9 != null) {
                        qVar.q(a9);
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3656nk interfaceC3656nk;
        synchronized (this) {
            interfaceC3656nk = (InterfaceC3656nk) this.f2903v;
        }
        return interfaceC3656nk;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    @Override // O.InterfaceC0350u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A0 p(View view, A0 a02) {
        boolean z6;
        boolean z9;
        switch (this.f2901n) {
            case 1:
                A3.r rVar = (A3.r) this.f2903v;
                int i = rVar.f184a;
                M.h hVar = (M.h) this.f2902u;
                y0 y0Var = a02.f2115a;
                G.e f2 = y0Var.f(7);
                G.e f9 = y0Var.f(32);
                int i4 = f2.f1032b;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f1807u;
                bottomSheetBehavior.f36647w = i4;
                boolean e9 = A3.n.e(view);
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                boolean z10 = bottomSheetBehavior.f36639o;
                if (z10) {
                    int a9 = a02.a();
                    bottomSheetBehavior.f36646v = a9;
                    paddingBottom = a9 + rVar.f186c;
                }
                int i6 = rVar.f185b;
                boolean z11 = bottomSheetBehavior.f36640p;
                int i9 = f2.f1031a;
                if (z11) {
                    paddingLeft = (e9 ? i6 : i) + i9;
                }
                boolean z12 = bottomSheetBehavior.f36641q;
                int i10 = f2.f1033c;
                if (z12) {
                    if (!e9) {
                        i = i6;
                    }
                    paddingRight = i + i10;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                boolean z13 = true;
                if (!bottomSheetBehavior.f36643s || marginLayoutParams.leftMargin == i9) {
                    z6 = false;
                } else {
                    marginLayoutParams.leftMargin = i9;
                    z6 = true;
                }
                if (bottomSheetBehavior.f36644t && marginLayoutParams.rightMargin != i10) {
                    marginLayoutParams.rightMargin = i10;
                    z6 = true;
                }
                if (bottomSheetBehavior.f36645u) {
                    int i11 = marginLayoutParams.topMargin;
                    int i12 = f2.f1032b;
                    if (i11 != i12) {
                        marginLayoutParams.topMargin = i12;
                        if (z13) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        z9 = hVar.f1806n;
                        if (z9) {
                            bottomSheetBehavior.f36637m = f9.f1034d;
                        }
                        if (!z10 || z9) {
                            bottomSheetBehavior.I();
                        }
                        return a02;
                    }
                }
                z13 = z6;
                if (z13) {
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z9 = hVar.f1806n;
                if (z9) {
                }
                if (!z10) {
                }
                bottomSheetBehavior.I();
                return a02;
            default:
                A0 j6 = X.j(view, a02);
                if (j6.f2115a.m()) {
                    return j6;
                }
                int b9 = j6.b();
                Rect rect = (Rect) this.f2902u;
                rect.left = b9;
                rect.top = j6.d();
                rect.right = j6.c();
                rect.bottom = j6.a();
                ViewPager viewPager = (ViewPager) this.f2903v;
                int childCount = viewPager.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    A0 b10 = X.b(viewPager.getChildAt(i13), j6);
                    rect.left = Math.min(b10.b(), rect.left);
                    rect.top = Math.min(b10.d(), rect.top);
                    rect.right = Math.min(b10.c(), rect.right);
                    rect.bottom = Math.min(b10.a(), rect.bottom);
                }
                return j6.f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public String toString() {
        switch (this.f2901n) {
            case 4:
                return "Bounds{lower=" + ((G.e) this.f2902u) + " upper=" + ((G.e) this.f2903v) + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2901n) {
            case 17:
                C2679Lj c2679Lj = (C2679Lj) this.f2903v;
                c2679Lj.getClass();
                AbstractC3436jg.f32060f.execute(new RunnableC3493kj(1, c2679Lj));
                ((C3887s) this.f2902u).w(th);
                return;
            case 20:
                try {
                    InterfaceC2708Ne interfaceC2708Ne = (InterfaceC2708Ne) this.f2903v;
                    C4969z0 k9 = SK.k(th);
                    interfaceC2708Ne.h2(new w2.m(SK.n(th.getMessage()) ? k9.f40513u : th.getMessage(), k9.f40512n));
                    return;
                } catch (RemoteException e9) {
                    z.l("Service can't call client", e9);
                    return;
                }
            default:
                q qVar = (q) this.f2903v;
                synchronized (qVar) {
                    try {
                        C2771Qq c2771Qq = (C2771Qq) qVar.f2964j;
                        St st = (St) this.f2902u;
                        c2771Qq.c(st);
                        St a9 = ((C2771Qq) qVar.f2964j).a();
                        if (st.f28430v0) {
                            while (a9 != null) {
                                qVar.q(a9);
                                a9 = ((C2771Qq) qVar.f2964j).a();
                            }
                        } else if (a9 != null) {
                            qVar.q(a9);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ P3.a y(e eVar, InterfaceC4312zt interfaceC4312zt) {
        return k(eVar, interfaceC4312zt, null);
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2901n = i;
        this.f2902u = obj;
        this.f2903v = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3544lg, com.google.android.gms.internal.ads.InterfaceC3431jb
    /* renamed from: c, reason: collision with other method in class */
    public void mo0c() {
        switch (this.f2901n) {
            case 13:
                z.k("callJs > getEngine: Promise rejected");
                ((C3490kg) this.f2902u).c(new N2.n("Unable to obtain a JavascriptEngine."));
                ((C2858Wc) this.f2903v).s();
                break;
            default:
                C3523lC c3523lC = ViewTreeObserverOnGlobalLayoutListenerC2529Cm.f24950I;
                ?? r1 = (AbstractBinderC3359i8) this.f2902u;
                Map n9 = r1.n();
                if (n9 != null) {
                    int i = c3523lC.f32527w;
                    int i4 = 0;
                    while (i4 < i) {
                        Object obj = n9.get((String) c3523lC.get(i4));
                        i4++;
                        if (obj != null) {
                            r1.onClick((ViewGroup) this.f2903v);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Pm, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3431jb, com.google.android.gms.internal.ads.At
    public JSONObject o() {
        return ((AbstractBinderC3359i8) this.f2902u).s();
    }

    public /* synthetic */ c(int i, Object obj, boolean z6) {
        this.f2901n = i;
        this.f2902u = null;
        this.f2903v = obj;
    }

    public /* synthetic */ c(int i, boolean z6) {
        this.f2901n = i;
    }

    public c(C4297ze c4297ze) {
        this.f2901n = 24;
        this.f2903v = c4297ze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(InterfaceViewOnClickListenerC2750Pm interfaceViewOnClickListenerC2750Pm, ViewGroup viewGroup) {
        this.f2901n = 18;
        this.f2902u = (AbstractBinderC3359i8) interfaceViewOnClickListenerC2750Pm;
        this.f2903v = viewGroup;
    }

    public /* synthetic */ c(Object obj, int i, byte b9) {
        this.f2901n = i;
        this.f2902u = obj;
    }

    public c(q qVar, St st) {
        this.f2901n = 21;
        this.f2902u = st;
        Objects.requireNonNull(qVar);
        this.f2903v = qVar;
    }

    public c(Context context) {
        this.f2901n = 5;
        w.h(context);
        Resources resources = context.getResources();
        this.f2902u = resources;
        this.f2903v = resources.getResourcePackageName(C5248R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f2901n = 28;
        this.f2902u = cryptoInfo;
        this.f2903v = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public /* synthetic */ c(Q q8) {
        this.f2901n = 10;
        Objects.requireNonNull(q8);
        this.f2903v = q8;
    }

    public c(C2858Wc c2858Wc, C3219fd c3219fd, C3490kg c3490kg) {
        this.f2901n = 13;
        this.f2902u = c3490kg;
        this.f2903v = c2858Wc;
        Objects.requireNonNull(c3219fd);
    }

    public c(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd) {
        this.f2901n = 14;
        this.f2902u = interfaceC3864rd;
        Objects.requireNonNull(binderC2486Ad);
        this.f2903v = binderC2486Ad;
    }

    public c(C2679Lj c2679Lj, C3887s c3887s) {
        this.f2901n = 17;
        this.f2902u = c3887s;
        Objects.requireNonNull(c2679Lj);
        this.f2903v = c2679Lj;
    }

    public c(BinderC2600Gp binderC2600Gp, C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        this.f2901n = 20;
        this.f2902u = c2759Qe;
        this.f2903v = interfaceC2708Ne;
        Objects.requireNonNull(binderC2600Gp);
    }

    public c(int i) {
        this.f2901n = i;
        switch (i) {
            case 27:
                this.f2902u = null;
                this.f2903v = null;
                break;
            default:
                this.f2902u = new AtomicReference();
                this.f2903v = new s.b();
                break;
        }
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f2901n = 0;
        this.f2902u = workDatabase_Impl;
        this.f2903v = new b(workDatabase_Impl, 0);
    }

    public c(ViewPager viewPager) {
        this.f2901n = 2;
        this.f2903v = viewPager;
        this.f2902u = new Rect();
    }

    public c(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, Intent intent) {
        this.f2901n = 9;
        this.f2903v = gzopSportsRacinggamesActivity;
        this.f2902u = intent;
    }
}

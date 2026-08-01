package S0;

import B1.C0260b;
import B1.C0262d;
import O.A0;
import O.InterfaceC0345u;
import O.X;
import O2.C0361k;
import P2.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC2557Fj;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.At;
import com.google.android.gms.internal.ads.BC;
import com.google.android.gms.internal.ads.BO;
import com.google.android.gms.internal.ads.BinderC2466Ad;
import com.google.android.gms.internal.ads.BinderC2580Gp;
import com.google.android.gms.internal.ads.C2659Lj;
import com.google.android.gms.internal.ads.C2710Oj;
import com.google.android.gms.internal.ads.C2739Qe;
import com.google.android.gms.internal.ads.C2751Qq;
import com.google.android.gms.internal.ads.C2835Wc;
import com.google.android.gms.internal.ads.C2917aJ;
import com.google.android.gms.internal.ads.C2949ay;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.C3024cJ;
import com.google.android.gms.internal.ads.C3196fd;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3534lt;
import com.google.android.gms.internal.ads.C3864s;
import com.google.android.gms.internal.ads.C4019ut;
import com.google.android.gms.internal.ads.C4051vO;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.EC;
import com.google.android.gms.internal.ads.GD;
import com.google.android.gms.internal.ads.InterfaceC2688Ne;
import com.google.android.gms.internal.ads.InterfaceC2708Oh;
import com.google.android.gms.internal.ads.InterfaceC3408jb;
import com.google.android.gms.internal.ads.InterfaceC3521lg;
import com.google.android.gms.internal.ads.InterfaceC3633nk;
import com.google.android.gms.internal.ads.InterfaceC3655o5;
import com.google.android.gms.internal.ads.InterfaceC3841rd;
import com.google.android.gms.internal.ads.InterfaceC3906so;
import com.google.android.gms.internal.ads.InterfaceC4213yO;
import com.google.android.gms.internal.ads.InterfaceC4289zt;
import com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC2713Om;
import com.google.android.gms.internal.ads.KD;
import com.google.android.gms.internal.ads.KP;
import com.google.android.gms.internal.ads.LF;
import com.google.android.gms.internal.ads.MF;
import com.google.android.gms.internal.ads.Q;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RunnableC3470kj;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2492Bm;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.YI;
import com.google.android.gms.internal.ads.Yq;
import com.icefishing.icefishingbigwin.GzopActiongamesActivity;
import com.icefishing.icefishingbigwin.MainActivity;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k2.C4631a;
import o4.InterfaceC4799l;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4920z0;
import u0.C5059i;
import u1.x;
import u2.z;
import v1.InterfaceC5104a;
import v7.AbstractC5129j;
import x2.InterfaceC5189c;

/* loaded from: classes.dex */
public final class c implements s1.k, InterfaceC0345u, j3.c, InterfaceC3655o5, InterfaceC3521lg, InterfaceC5189c, KD, InterfaceC3408jb, InterfaceC2708Oh, At, t.i, InterfaceC3906so, InterfaceC4799l {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2774n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2775u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2776v;

    public /* synthetic */ c(int i, Object obj) {
        this.f2774n = i;
        this.f2775u = obj;
    }

    public void A(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f2775u).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f2776v) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // o4.InterfaceC4799l
    public void OnCall() {
        switch (this.f2774n) {
            case 28:
                ((GzopActiongamesActivity) this.f2776v).startActivity((Intent) this.f2775u);
                break;
            default:
                ((MainActivity) this.f2776v).startActivity((Intent) this.f2775u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3906so
    public /* synthetic */ void a(Object obj, XO xo) {
        ((InterfaceC4213yO) obj).g((C4051vO) this.f2776v, new s(xo, ((BO) this.f2775u).f23899e));
    }

    public boolean b(j jVar) {
        boolean containsKey;
        synchronized (this.f2775u) {
            containsKey = ((LinkedHashMap) this.f2776v).containsKey(jVar);
        }
        return containsKey;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3655o5
    public File c() {
        if (((File) this.f2775u) == null) {
            this.f2775u = new File(((Context) this.f2776v).getCacheDir(), "volley");
        }
        return (File) this.f2775u;
    }

    @Override // s1.InterfaceC4967b
    public boolean d(Object obj, File file, s1.h hVar) {
        return ((C0260b) this.f2776v).d(new C0262d(((BitmapDrawable) ((x) obj).get()).getBitmap(), (InterfaceC5104a) this.f2775u), file, hVar);
    }

    @Override // t.i
    public Object e(t.h hVar) {
        String str;
        String str2;
        Context context = (Context) this.f2775u;
        C2949ay c2949ay = (C2949ay) this.f2776v;
        if (Build.VERSION.SDK_INT < 31) {
            hVar.a("");
            return "";
        }
        try {
            String packageName = context.getPackageName();
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            String[] strArr = {c2949ay.b0(), "308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a"};
            int i = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= 2) {
                    str = "";
                    break;
                }
                str = strArr[i6];
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
                i6++;
            }
            BC bc = EC.f24557f;
            byte[] h9 = bc.f().h(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h9)));
            if (!Build.TYPE.equals("user")) {
                String[] strArr2 = {c2949ay.c0(), "308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"};
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

    @Override // j3.c
    public void f(j3.m mVar) {
        ((C0361k) this.f2776v).f2256b.remove((j3.h) this.f2775u);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory g(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f2776v) == null) {
            Context context = (Context) this.f2775u;
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
                    this.f2776v = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f2776v = map;
        }
        String str4 = (String) ((Map) this.f2776v).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e9) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e9);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f12378z, e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + com.anythink.core.common.d.j.f12378z, e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb
    public void h(MotionEvent motionEvent) {
        ((AbstractBinderC3336i8) this.f2775u).onTouch(null, motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb
    public JSONObject i() {
        return ((AbstractBinderC3336i8) this.f2775u).p();
    }

    public ArrayList j(String str) {
        C5059i a9 = C5059i.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2775u;
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

    public K0.j k(j jVar) {
        K0.j jVar2;
        synchronized (this.f2775u) {
            jVar2 = (K0.j) ((LinkedHashMap) this.f2776v).remove(jVar);
        }
        return jVar2;
    }

    public List l(String workSpecId) {
        List L6;
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        synchronized (this.f2775u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2776v;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (kotlin.jvm.internal.h.a(((j) entry.getKey()).f2792a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f2776v).remove((j) it.next());
                }
                L6 = AbstractC5129j.L(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return L6;
    }

    public K0.j m(j jVar) {
        K0.j jVar2;
        synchronized (this.f2775u) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2776v;
                Object obj = linkedHashMap.get(jVar);
                if (obj == null) {
                    obj = new K0.j(jVar);
                    linkedHashMap.put(jVar, obj);
                }
                jVar2 = (K0.j) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar2;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        Bundle bundle;
        switch (this.f2774n) {
            case 14:
                C2659Lj c2659Lj = (C2659Lj) this.f2776v;
                c2659Lj.getClass();
                AbstractC3413jg.f31273f.execute(new RunnableC3470kj(1, c2659Lj));
                ((C3864s) this.f2775u).mo11n((AbstractC2557Fj) obj);
                return;
            case 17:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    C3301ha c3301ha = AbstractC3569ma.J2;
                    q2.r rVar = q2.r.f40207e;
                    boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
                    InterfaceC2688Ne interfaceC2688Ne = (InterfaceC2688Ne) this.f2776v;
                    if (!booleanValue) {
                        interfaceC2688Ne.H2(parcelFileDescriptor);
                        return;
                    }
                    boolean booleanValue2 = ((Boolean) rVar.f40210c.a(AbstractC3569ma.f32057K2)).booleanValue();
                    C2739Qe c2739Qe = (C2739Qe) this.f2775u;
                    if (booleanValue2 && (bundle = c2739Qe.f27040F) != null) {
                        C4835j.f39733C.f39745k.getClass();
                        bundle.putLong("binder-call-start", System.currentTimeMillis());
                    }
                    interfaceC2688Ne.G1(parcelFileDescriptor, c2739Qe);
                    return;
                } catch (RemoteException e9) {
                    z.l("Service can't call client", e9);
                    return;
                }
            default:
                q qVar = (q) this.f2776v;
                Yq yq = (Yq) obj;
                synchronized (qVar) {
                    ((C2751Qq) qVar.f2835j).b(yq, (St) this.f2775u);
                    St a9 = ((C2751Qq) qVar.f2835j).a();
                    if (a9 != null) {
                        qVar.q(a9);
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public Object o() {
        InterfaceC3633nk interfaceC3633nk;
        synchronized (this) {
            interfaceC3633nk = (InterfaceC3633nk) this.f2776v;
        }
        return interfaceC3633nk;
    }

    @Override // s1.k
    public int p(s1.h hVar) {
        return 2;
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        A0 j6 = X.j(view, a02);
        if (j6.f2027a.m()) {
            return j6;
        }
        int b9 = j6.b();
        Rect rect = (Rect) this.f2775u;
        rect.left = b9;
        rect.top = j6.d();
        rect.right = j6.c();
        rect.bottom = j6.a();
        ViewPager viewPager = (ViewPager) this.f2776v;
        int childCount = viewPager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            A0 b10 = X.b(viewPager.getChildAt(i), j6);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return j6.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int r(Context context, N2.c cVar) {
        w.h(context);
        w.h(cVar);
        int j6 = cVar.j();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2775u;
        int i = sparseIntArray.get(j6, -1);
        if (i != -1) {
            return i;
        }
        int i6 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= sparseIntArray.size()) {
                i6 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i9);
            if (keyAt > j6 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i9++;
        }
        if (i6 == -1) {
            i6 = ((M2.f) this.f2776v).c(context, j6);
        }
        sparseIntArray.put(j6, i6);
        return i6;
    }

    public void s(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f2776v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f2776v = null;
        }
        create = LoudnessCodecController.create(i, GD.f24952n, new KP());
        this.f2776v = create;
        Iterator it = ((HashSet) this.f2775u).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public synchronized N3.a t(e eVar, InterfaceC4289zt interfaceC4289zt, InterfaceC3633nk interfaceC3633nk) {
        C2739Qe c2739Qe;
        this.f2776v = interfaceC3633nk;
        if (interfaceC3633nk == null || (c2739Qe = (C2739Qe) eVar.f2781u) == null) {
            return ((C4019ut) this.f2775u).c(eVar, interfaceC4289zt, interfaceC3633nk);
        }
        C2710Oj c9 = interfaceC3633nk.c();
        return c9.c(c9.a(QC.c(c2739Qe)));
    }

    public void u(boolean z3, boolean z6) {
        synchronized (this) {
            boolean z9 = false;
            if (z3) {
                if (((PowerManager.WakeLock) this.f2776v) == null) {
                    Context context = (Context) this.f2775u;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        AbstractC2968bG.y("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        AbstractC2968bG.y("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f2776v = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f2776v;
            if (wakeLock == null) {
                return;
            }
            if (z3 && z6) {
                z9 = true;
            }
            if (z9) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public C2917aJ v() {
        ECPoint eCPoint;
        C3024cJ c3024cJ = (C3024cJ) this.f2775u;
        if (c3024cJ == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        C3534lt c3534lt = (C3534lt) this.f2776v;
        if (c3534lt == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        YI yi = c3024cJ.f29441b.f28867b;
        BigInteger order = yi.f28668b.getOrder();
        BigInteger bigInteger = (BigInteger) c3534lt.f31863u;
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = MF.f26274a;
        ECParameterSpec eCParameterSpec2 = yi.f28668b;
        if (!MF.b(eCParameterSpec2, eCParameterSpec) && !MF.b(eCParameterSpec2, MF.f26275b) && !MF.b(eCParameterSpec2, MF.f26276c)) {
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
        LF d2 = MF.d(ECPoint.POINT_INFINITY, c9);
        LF d9 = MF.d(generator, c9);
        for (int bitLength = bigInteger.bitLength(); bitLength >= 0; bitLength--) {
            if (bigInteger.testBit(bitLength)) {
                d2 = MF.f(d2, d9, a9, c9);
                d9 = MF.e(d9, a9, c9);
            } else {
                d9 = MF.f(d2, d9, a9, c9);
                d2 = MF.e(d2, a9, c9);
            }
        }
        if (d2.f26086c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger modInverse = d2.f26086c.modInverse(c9);
            BigInteger mod = modInverse.multiply(modInverse).mod(c9);
            eCPoint = new ECPoint(d2.f26084a.multiply(mod).mod(c9), d2.f26085b.multiply(mod).mod(c9).multiply(modInverse).mod(c9));
        }
        MF.a(eCPoint, curve);
        if (eCPoint.equals(c3024cJ.f29442c)) {
            return new C2917aJ((C3024cJ) this.f2775u, (C3534lt) this.f2776v);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        switch (this.f2774n) {
            case 14:
                C2659Lj c2659Lj = (C2659Lj) this.f2776v;
                c2659Lj.getClass();
                AbstractC3413jg.f31273f.execute(new RunnableC3470kj(1, c2659Lj));
                ((C3864s) this.f2775u).w(th);
                return;
            case 17:
                try {
                    InterfaceC2688Ne interfaceC2688Ne = (InterfaceC2688Ne) this.f2776v;
                    C4920z0 k9 = SK.k(th);
                    interfaceC2688Ne.P0(new u2.m(SK.n(th.getMessage()) ? k9.f40214u : th.getMessage(), k9.f40213n));
                    return;
                } catch (RemoteException e9) {
                    z.l("Service can't call client", e9);
                    return;
                }
            default:
                q qVar = (q) this.f2776v;
                synchronized (qVar) {
                    try {
                        C2751Qq c2751Qq = (C2751Qq) qVar.f2835j;
                        St st = (St) this.f2775u;
                        c2751Qq.c(st);
                        St a9 = ((C2751Qq) qVar.f2835j).a();
                        if (st.f27647v0) {
                            while (a9 != null) {
                                qVar.q(a9);
                                a9 = ((C2751Qq) qVar.f2835j).a();
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

    @Override // x2.InterfaceC5189c
    public void x(C4631a c4631a) {
        try {
            String canonicalName = ((BinderC2466Ad) this.f2776v).f23682n.getClass().getCanonicalName();
            int i = c4631a.f38568a;
            String str = c4631a.f38569b;
            String str2 = c4631a.f38570c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            v2.i.a(sb.toString());
            InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) this.f2775u;
            interfaceC3841rd.n3(c4631a.a());
            interfaceC3841rd.O3(i, str);
            interfaceC3841rd.j0(i);
        } catch (RemoteException e9) {
            v2.i.d("", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* bridge */ /* synthetic */ N3.a y(e eVar, InterfaceC4289zt interfaceC4289zt) {
        return t(eVar, interfaceC4289zt, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public void z(String str, int i, String str2, boolean z3) {
        C3467kg c3467kg = (C3467kg) this.f2776v;
        if (z3) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32073M2)).booleanValue()) {
                C4835j.f39733C.f39745k.getClass();
                ((C2993bo) this.f2775u).c("rendering-webview-load-html-end", System.currentTimeMillis());
            }
            c3467kg.b(null);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Ad Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        c3467kg.c(new Exception(u1.h.g(sb, ", Failing URL: ", str2)));
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2774n = i;
        this.f2775u = obj;
        this.f2776v = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3521lg, com.google.android.gms.internal.ads.InterfaceC3408jb
    /* renamed from: c, reason: collision with other method in class */
    public void mo0c() {
        switch (this.f2774n) {
            case 10:
                z.k("callJs > getEngine: Promise rejected");
                ((C3467kg) this.f2775u).c(new L2.m("Unable to obtain a JavascriptEngine."));
                ((C2835Wc) this.f2776v).s();
                break;
            default:
                C3500lC c3500lC = ViewTreeObserverOnGlobalLayoutListenerC2492Bm.f23937I;
                ?? r12 = (AbstractBinderC3336i8) this.f2775u;
                Map n9 = r12.n();
                if (n9 != null) {
                    int i = c3500lC.f31747w;
                    int i6 = 0;
                    while (i6 < i) {
                        Object obj = n9.get((String) c3500lC.get(i6));
                        i6++;
                        if (obj != null) {
                            r12.onClick((ViewGroup) this.f2776v);
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.Om, com.google.android.gms.internal.ads.i8] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3408jb, com.google.android.gms.internal.ads.At
    public JSONObject o() {
        return ((AbstractBinderC3336i8) this.f2775u).s();
    }

    public /* synthetic */ c(int i, boolean z3) {
        this.f2774n = i;
    }

    public c(C4274ze c4274ze) {
        this.f2774n = 21;
        this.f2776v = c4274ze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(InterfaceViewOnClickListenerC2713Om interfaceViewOnClickListenerC2713Om, ViewGroup viewGroup) {
        this.f2774n = 15;
        this.f2775u = (AbstractBinderC3336i8) interfaceViewOnClickListenerC2713Om;
        this.f2776v = viewGroup;
    }

    public /* synthetic */ c(Object obj, Object obj2, int i, boolean z3) {
        this.f2774n = i;
        this.f2776v = obj;
        this.f2775u = obj2;
    }

    public c(q qVar, St st) {
        this.f2774n = 18;
        this.f2775u = st;
        Objects.requireNonNull(qVar);
        this.f2776v = qVar;
    }

    public /* synthetic */ c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f2774n = 25;
        this.f2775u = cryptoInfo;
        this.f2776v = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public /* synthetic */ c(Q q8) {
        this.f2774n = 7;
        Objects.requireNonNull(q8);
        this.f2776v = q8;
    }

    public c(C2835Wc c2835Wc, C3196fd c3196fd, C3467kg c3467kg) {
        this.f2774n = 10;
        this.f2775u = c3467kg;
        this.f2776v = c2835Wc;
        Objects.requireNonNull(c3196fd);
    }

    public c(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd) {
        this.f2774n = 11;
        this.f2775u = interfaceC3841rd;
        Objects.requireNonNull(binderC2466Ad);
        this.f2776v = binderC2466Ad;
    }

    public c(C2659Lj c2659Lj, C3864s c3864s) {
        this.f2774n = 14;
        this.f2775u = c3864s;
        Objects.requireNonNull(c2659Lj);
        this.f2776v = c2659Lj;
    }

    public c(BinderC2580Gp binderC2580Gp, C2739Qe c2739Qe, InterfaceC2688Ne interfaceC2688Ne) {
        this.f2774n = 17;
        this.f2775u = c2739Qe;
        this.f2776v = interfaceC2688Ne;
        Objects.requireNonNull(binderC2580Gp);
    }

    public c(M2.f fVar) {
        this.f2774n = 5;
        this.f2775u = new SparseIntArray();
        w.h(fVar);
        this.f2776v = fVar;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f2774n = 0;
        this.f2775u = workDatabase_Impl;
        this.f2776v = new b(workDatabase_Impl, 0);
    }

    public c(int i) {
        this.f2774n = i;
        switch (i) {
            case 24:
                this.f2775u = null;
                this.f2776v = null;
                break;
            case 27:
                this.f2775u = new HashSet();
                break;
            default:
                this.f2775u = new Object();
                this.f2776v = new LinkedHashMap();
                break;
        }
    }

    public c(Context context, int i) {
        this.f2774n = i;
        switch (i) {
            case 9:
                this.f2776v = context;
                this.f2775u = null;
                break;
            default:
                this.f2776v = null;
                this.f2775u = context;
                break;
        }
    }

    public c(ViewPager viewPager) {
        this.f2774n = 2;
        this.f2776v = viewPager;
        this.f2775u = new Rect();
    }
}

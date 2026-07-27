package C2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.AbstractC2565Ga;
import com.google.android.gms.internal.ads.AbstractC3043cl;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.AbstractC3907sp;
import com.google.android.gms.internal.ads.BC;
import com.google.android.gms.internal.ads.BK;
import com.google.android.gms.internal.ads.C2494Bo;
import com.google.android.gms.internal.ads.C2529Dp;
import com.google.android.gms.internal.ads.C2546Ep;
import com.google.android.gms.internal.ads.C2570Gf;
import com.google.android.gms.internal.ads.C2597Hp;
import com.google.android.gms.internal.ads.C2614Ip;
import com.google.android.gms.internal.ads.C2621Jf;
import com.google.android.gms.internal.ads.C2739Qe;
import com.google.android.gms.internal.ads.C2773Se;
import com.google.android.gms.internal.ads.C2789Te;
import com.google.android.gms.internal.ads.C2805Ue;
import com.google.android.gms.internal.ads.C3110dz;
import com.google.android.gms.internal.ads.C3164ez;
import com.google.android.gms.internal.ads.C3218fz;
import com.google.android.gms.internal.ads.C3272gz;
import com.google.android.gms.internal.ads.C3295hL;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3638np;
import com.google.android.gms.internal.ads.C3692op;
import com.google.android.gms.internal.ads.C3694or;
import com.google.android.gms.internal.ads.C3764q6;
import com.google.android.gms.internal.ads.C3864s;
import com.google.android.gms.internal.ads.C3979u6;
import com.google.android.gms.internal.ads.C3983uA;
import com.google.android.gms.internal.ads.C4196y7;
import com.google.android.gms.internal.ads.C4237yv;
import com.google.android.gms.internal.ads.C4240yy;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.C4285zp;
import com.google.android.gms.internal.ads.EC;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Lz;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.PK;
import com.google.android.gms.internal.ads.Pz;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.Qx;
import com.google.android.gms.internal.ads.RunnableC3470kj;
import com.google.android.gms.internal.ads.RunnableC3865s0;
import com.google.android.gms.internal.ads.RunnableFutureC2966bE;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.TM;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.XD;
import com.google.android.gms.internal.ads.Xw;
import com.google.android.gms.internal.ads.Zq;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p2.C4835j;
import p2.RunnableC4830e;
import u2.HandlerC5068A;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f422b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f423c;

    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.f421a = i;
        this.f422b = obj;
        this.f423c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0443 A[Catch: InterruptedException | ExecutionException -> 0x04b1, TRY_ENTER, TRY_LEAVE, TryCatch #7 {InterruptedException | ExecutionException -> 0x04b1, blocks: (B:188:0x0443, B:189:0x04a4, B:189:0x04a4, B:199:0x04a0, B:199:0x04a0), top: B:186:0x0441 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0448 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String str;
        boolean equals;
        int i;
        Future c9;
        String str2;
        RunnableFutureC2966bE runnableFutureC2966bE;
        H6 h62;
        C2789Te a9;
        C3467kg c3467kg;
        SharedPreferences sharedPreferences;
        int i6 = 12;
        int i9 = 10;
        int i10 = 0;
        switch (this.f421a) {
            case 0:
                return ((C0268a) this.f422b).getClickSignals((String) this.f423c);
            case 1:
                C4274ze c4274ze = (C4274ze) this.f422b;
                C3764q6 c3764q6 = (C3764q6) c4274ze.f35362w;
                C3694or c3694or = (C3694or) c4274ze.f35361v;
                if (!c3764q6.C() && (runnableFutureC2966bE = (RunnableFutureC2966bE) c3694or.f32954u) != null && (Build.VERSION.SDK_INT < 31 || runnableFutureC2966bE.isDone())) {
                    try {
                        h62 = (H6) runnableFutureC2966bE.get(c3764q6.B(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    if (h62 != null && h62.a0()) {
                        str = h62.v0();
                        equals = str.equals("E");
                        Context context = (Context) this.f423c;
                        if (equals && (i = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                if (i >= 31) {
                                    c9 = QC.c("");
                                } else {
                                    try {
                                        String packageName = context.getPackageName();
                                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                        BC bc = EC.f24557f;
                                        byte[] h9 = bc.f().h("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h9)));
                                        if (!Build.TYPE.equals("user")) {
                                            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bc.f().h("308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"))));
                                        }
                                        V6 v62 = new V6();
                                        context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, v62);
                                        c9 = (XD) v62.f28095b;
                                    } catch (Throwable unused2) {
                                        c9 = QC.c("");
                                    }
                                }
                                str2 = (String) c9.get();
                                if (true != SK.n(str2)) {
                                    str = str2;
                                }
                            } catch (InterruptedException | ExecutionException unused3) {
                            }
                        }
                        if (!str.equals("E") && !c3764q6.A()) {
                            try {
                                return C4274ze.A(context);
                            } catch (ClassCastException unused4) {
                                return str;
                            }
                        }
                    }
                }
                str = "E";
                equals = str.equals("E");
                Context context2 = (Context) this.f423c;
                if (equals) {
                    if (i >= 31) {
                    }
                    str2 = (String) c9.get();
                    if (true != SK.n(str2)) {
                    }
                }
                return !str.equals("E") ? str : str;
            case 2:
                C4196y7 c4196y7 = (C4196y7) this.f422b;
                C3694or c3694or2 = c4196y7.f35103j;
                if ((c3694or2 != null ? (RunnableFutureC2966bE) c3694or2.f32954u : c4196y7.i) != null) {
                    (c3694or2 != null ? (RunnableFutureC2966bE) c3694or2.f32954u : c4196y7.i).get();
                }
                H6 b9 = c4196y7.b();
                if (b9 != null) {
                    try {
                        C3979u6 c3979u6 = (C3979u6) this.f423c;
                        synchronized (c3979u6) {
                            byte[] b10 = b9.b();
                            PK pk = PK.f26757a;
                            int i11 = BK.f23877a;
                            c3979u6.a(b10, PK.f26758b);
                        }
                    } catch (C3295hL | NullPointerException unused5) {
                    }
                }
                return null;
            case 3:
                Qx qx = (Qx) this.f423c;
                WeakHashMap weakHashMap = (WeakHashMap) qx.f27139u;
                Context context3 = (Context) this.f422b;
                C2805Ue c2805Ue = (C2805Ue) weakHashMap.get(context3);
                if (c2805Ue != null) {
                    long longValue = c2805Ue.f27944a + ((Long) AbstractC2565Ga.f24980d.r()).longValue();
                    C4835j.f39730C.f39742k.getClass();
                    if (longValue >= System.currentTimeMillis()) {
                        a9 = new C2773Se(context3, c2805Ue.f27945b).a();
                        ((WeakHashMap) qx.f27139u).put(context3, new C2805Ue(qx, a9));
                        return a9;
                    }
                }
                a9 = new C2773Se(context3).a();
                ((WeakHashMap) qx.f27139u).put(context3, new C2805Ue(qx, a9));
                return a9;
            case 4:
                return (String) ((C2621Jf) this.f422b).k((Context) this.f423c, "getAppInstanceId");
            case 5:
                C2494Bo c2494Bo = (C2494Bo) this.f422b;
                c2494Bo.f23957e.b(Boolean.TRUE);
                Su su = (Su) this.f423c;
                su.a(true);
                c2494Bo.f23967p.b(su.q());
                return null;
            case 6:
                C2570Gf c2570Gf = (C2570Gf) this.f422b;
                C2739Qe c2739Qe = (C2739Qe) this.f423c;
                C3692op c3692op = (C3692op) c2570Gf.f25044w;
                synchronized (c3692op.f34147u) {
                    try {
                        if (c3692op.f34148v) {
                            c3467kg = c3692op.f34146n;
                        } else {
                            c3692op.f34148v = true;
                            c3692op.f34150x = c2739Qe;
                            c3692op.f34151y.o();
                            C3467kg c3467kg2 = c3692op.f34146n;
                            c3467kg2.f31479n.a(new RunnableC3470kj(i6, c3692op), AbstractC3413jg.f31275h);
                            AbstractC3907sp.b(c3692op.f32946A, c3467kg2, c3692op.f32947B);
                            c3467kg = c3467kg2;
                        }
                    } finally {
                    }
                }
                return (C4285zp) c3467kg.f31479n.get(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31975A6)).intValue(), TimeUnit.SECONDS);
            case 7:
                return (C4285zp) ((C3467kg) ((C3692op) ((C3864s) this.f422b).f33789x).c((C2739Qe) this.f423c)).f31479n.get(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31975A6)).intValue(), TimeUnit.SECONDS);
            case 8:
                C2597Hp c2597Hp = (C2597Hp) this.f423c;
                C3638np c3638np = (C3638np) this.f422b;
                c3638np.b(35);
                int i12 = -1;
                while (true) {
                    try {
                        C3301ha c3301ha = AbstractC3569ma.f32230d8;
                        q2.r rVar = q2.r.f40204e;
                        if (i10 >= ((Integer) rVar.f40207c.a(c3301ha)).intValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 40);
                            sb.append("Received HTTP error code from ad server:");
                            sb.append(i12);
                            throw new Zq(1, sb.toString());
                        }
                        Context context4 = c3638np.f32772b;
                        String str3 = c3638np.f32773c.f41388n;
                        Binder.getCallingUid();
                        C2614Ip m4 = new C4274ze(i6, context4, str3, r3).m(c2597Hp);
                        int i13 = m4.f25592a;
                        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32240e8)).booleanValue()) {
                            c3638np.i.b(com.anythink.expressad.video.dynview.a.a.f21100W, String.valueOf(i10));
                        }
                        if (i13 == 200) {
                            c3638np.b(36);
                            return m4.f25594c;
                        }
                        i10++;
                        i12 = i13;
                    } catch (Exception e9) {
                        throw new Zq(e9.getMessage() == null ? "Fetch failed." : e9.getMessage(), e9);
                    }
                }
            case 9:
                C2614Ip c2614Ip = (C2614Ip) ((Iu) this.f422b).f25615v.get();
                Object obj = ((ND) this.f423c).f26475n;
                return new C2546Ep(c2614Ip, ((C2529Dp) obj).f24463b, ((C2529Dp) obj).f24462a);
            case 10:
                C4237yv c4237yv = (C4237yv) this.f422b;
                c4237yv.getClass();
                C3301ha c3301ha2 = AbstractC3569ma.da;
                q2.r rVar2 = q2.r.f40204e;
                boolean booleanValue = ((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue();
                String str4 = (String) this.f423c;
                v2.l lVar = c4237yv.f35243d;
                if (booleanValue) {
                    C4835j c4835j = C4835j.f39730C;
                    if (c4835j.f39735c.F(str4) || c4835j.f39735c.G(str4)) {
                        TM tm = c4237yv.f35246g.f28224c;
                        r3 = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
                        HashMap hashMap = new HashMap();
                        if (r3 != null) {
                            hashMap.put((String) rVar2.f40207c.a(AbstractC3569ma.ea), r3);
                        }
                        return lVar.a(hashMap, str4);
                    }
                }
                return lVar.a(null, str4);
            case 11:
                C4240yy c4240yy = (C4240yy) this.f422b;
                Object obj2 = this.f423c;
                synchronized (c4240yy) {
                    File file = c4240yy.f35253a;
                    AbstractC3043cl.u(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb2.append(name);
                    sb2.append(".temp");
                    File file2 = new File(parent, sb2.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            c4240yy.f35255c.f(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(c4240yy.f35253a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e10) {
                        file2.delete();
                        throw e10;
                    }
                }
                return null;
            case 12:
                C3218fz c3218fz = (C3218fz) this.f422b;
                DexClassLoader dexClassLoader = c3218fz.f30481l;
                C3164ez c3164ez = c3218fz.f30474d;
                byte[] bArr = c3218fz.f30480k;
                C3272gz c3272gz = (C3272gz) this.f423c;
                String str5 = c3272gz.f30687a;
                String str6 = c3272gz.f30688b;
                Class<?>[] clsArr = c3272gz.f30689c;
                try {
                    c3164ez.getClass();
                    byte[] a10 = C3164ez.a(str5, bArr);
                    Charset charset = C3164ez.f30005a;
                    return dexClassLoader.loadClass(new String(a10, charset)).getMethod(new String(C3164ez.a(str6, bArr), charset), clsArr);
                } catch (C3110dz | ClassNotFoundException | NoSuchMethodException | NullPointerException e11) {
                    throw new IllegalStateException(e11);
                }
            case 13:
                Lz lz = (Lz) this.f422b;
                Xw b11 = lz.f26197a.b();
                C3983uA c3983uA = lz.f26200d;
                if (b11 == null) {
                    c3983uA.b(15004);
                    return "";
                }
                String c10 = b11.c((Context) this.f423c);
                if (c10 != null) {
                    return c10;
                }
                c3983uA.b(15006);
                return "";
            case 14:
                Pz pz = (Pz) this.f422b;
                pz.getClass();
                HashMap hashMap2 = new HashMap();
                pz.f26901f.f(20106, new RunnableC3865s0(i9, pz, hashMap2, (Context) this.f423c));
                String j6 = pz.j(hashMap2);
                hashMap2.clear();
                return j6;
            case 15:
                return ((RunnableC4830e) this.f422b).k((Context) this.f423c);
            case 16:
                Context context5 = (Context) this.f422b;
                Context context6 = (Context) this.f423c;
                if (context5 != null) {
                    u2.z.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context5.getSharedPreferences("admob_user_agent", 0);
                } else {
                    u2.z.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context6.getSharedPreferences("admob_user_agent", 0);
                    i10 = 1;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    u2.z.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context6);
                    if (i10 != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        u2.z.k("Persisting user agent.");
                    }
                }
                return string;
            default:
                HandlerC5068A handlerC5068A = u2.D.f41234l;
                String absolutePath = ((Context) this.f423c).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.f422b;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32362s1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public x(Context context, Qx qx) {
        this.f421a = 3;
        this.f422b = context;
        Objects.requireNonNull(qx);
        this.f423c = qx;
    }
}

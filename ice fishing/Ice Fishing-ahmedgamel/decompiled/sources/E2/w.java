package E2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.AbstractC2585Ga;
import com.google.android.gms.internal.ads.AbstractC3066cl;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.AbstractC3930sp;
import com.google.android.gms.internal.ads.BC;
import com.google.android.gms.internal.ads.BK;
import com.google.android.gms.internal.ads.C2531Co;
import com.google.android.gms.internal.ads.C2549Dp;
import com.google.android.gms.internal.ads.C2566Ep;
import com.google.android.gms.internal.ads.C2590Gf;
import com.google.android.gms.internal.ads.C2617Hp;
import com.google.android.gms.internal.ads.C2634Ip;
import com.google.android.gms.internal.ads.C2641Jf;
import com.google.android.gms.internal.ads.C2759Qe;
import com.google.android.gms.internal.ads.C2793Se;
import com.google.android.gms.internal.ads.C2810Te;
import com.google.android.gms.internal.ads.C2827Ue;
import com.google.android.gms.internal.ads.C3133dz;
import com.google.android.gms.internal.ads.C3187ez;
import com.google.android.gms.internal.ads.C3241fz;
import com.google.android.gms.internal.ads.C3295gz;
import com.google.android.gms.internal.ads.C3318hL;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3661np;
import com.google.android.gms.internal.ads.C3715op;
import com.google.android.gms.internal.ads.C3717or;
import com.google.android.gms.internal.ads.C3787q6;
import com.google.android.gms.internal.ads.C3887s;
import com.google.android.gms.internal.ads.C4002u6;
import com.google.android.gms.internal.ads.C4006uA;
import com.google.android.gms.internal.ads.C4219y7;
import com.google.android.gms.internal.ads.C4260yv;
import com.google.android.gms.internal.ads.C4263yy;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.C4308zp;
import com.google.android.gms.internal.ads.EC;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Lz;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.PK;
import com.google.android.gms.internal.ads.Pz;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.Qx;
import com.google.android.gms.internal.ads.RunnableC3493kj;
import com.google.android.gms.internal.ads.RunnableC3888s0;
import com.google.android.gms.internal.ads.RunnableFutureC2989bE;
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
import r2.C4906k;
import r2.RunnableC4901f;
import w2.HandlerC5139A;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f880a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f881b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f882c;

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.f880a = i;
        this.f881b = obj;
        this.f882c = obj2;
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
        RunnableFutureC2989bE runnableFutureC2989bE;
        H6 h62;
        C2810Te a9;
        C3490kg c3490kg;
        SharedPreferences sharedPreferences;
        int i4 = 12;
        int i6 = 10;
        int i9 = 0;
        switch (this.f880a) {
            case 0:
                return ((C0304a) this.f881b).getClickSignals((String) this.f882c);
            case 1:
                C4297ze c4297ze = (C4297ze) this.f881b;
                C3787q6 c3787q6 = (C3787q6) c4297ze.f36135w;
                C3717or c3717or = (C3717or) c4297ze.f36134v;
                if (!c3787q6.C() && (runnableFutureC2989bE = (RunnableFutureC2989bE) c3717or.f33740u) != null && (Build.VERSION.SDK_INT < 31 || runnableFutureC2989bE.isDone())) {
                    try {
                        h62 = (H6) runnableFutureC2989bE.get(c3787q6.B(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    if (h62 != null && h62.a0()) {
                        str = h62.v0();
                        equals = str.equals("E");
                        Context context = (Context) this.f882c;
                        if (equals && (i = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                if (i >= 31) {
                                    c9 = QC.c("");
                                } else {
                                    try {
                                        String packageName = context.getPackageName();
                                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                        BC bc = EC.f25318f;
                                        byte[] h3 = bc.f().h("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h3)));
                                        if (!Build.TYPE.equals("user")) {
                                            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bc.f().h("308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"))));
                                        }
                                        V6 v62 = new V6();
                                        context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, v62);
                                        c9 = (XD) v62.f28892b;
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
                        if (!str.equals("E") && !c3787q6.A()) {
                            try {
                                return C4297ze.z(context);
                            } catch (ClassCastException unused4) {
                                return str;
                            }
                        }
                    }
                }
                str = "E";
                equals = str.equals("E");
                Context context2 = (Context) this.f882c;
                if (equals) {
                    if (i >= 31) {
                    }
                    str2 = (String) c9.get();
                    if (true != SK.n(str2)) {
                    }
                }
                return !str.equals("E") ? str : str;
            case 2:
                C4219y7 c4219y7 = (C4219y7) this.f881b;
                C3717or c3717or2 = c4219y7.f35889j;
                if ((c3717or2 != null ? (RunnableFutureC2989bE) c3717or2.f33740u : c4219y7.i) != null) {
                    (c3717or2 != null ? (RunnableFutureC2989bE) c3717or2.f33740u : c4219y7.i).get();
                }
                H6 b9 = c4219y7.b();
                if (b9 != null) {
                    try {
                        C4002u6 c4002u6 = (C4002u6) this.f882c;
                        synchronized (c4002u6) {
                            byte[] b10 = b9.b();
                            PK pk = PK.f27540a;
                            int i10 = BK.f24648a;
                            c4002u6.a(b10, PK.f27541b);
                        }
                    } catch (C3318hL | NullPointerException unused5) {
                    }
                }
                return null;
            case 3:
                Qx qx = (Qx) this.f882c;
                WeakHashMap weakHashMap = (WeakHashMap) qx.f27895u;
                Context context3 = (Context) this.f881b;
                C2827Ue c2827Ue = (C2827Ue) weakHashMap.get(context3);
                if (c2827Ue != null) {
                    long longValue = c2827Ue.f28742a + ((Long) AbstractC2585Ga.f25769d.r()).longValue();
                    C4906k.f40186C.f40198k.getClass();
                    if (longValue >= System.currentTimeMillis()) {
                        a9 = new C2793Se(context3, c2827Ue.f28743b).a();
                        ((WeakHashMap) qx.f27895u).put(context3, new C2827Ue(qx, a9));
                        return a9;
                    }
                }
                a9 = new C2793Se(context3).a();
                ((WeakHashMap) qx.f27895u).put(context3, new C2827Ue(qx, a9));
                return a9;
            case 4:
                return (String) ((C2641Jf) this.f881b).k((Context) this.f882c, "getAppInstanceId");
            case 5:
                C2531Co c2531Co = (C2531Co) this.f881b;
                c2531Co.f24970e.b(Boolean.TRUE);
                Su su = (Su) this.f882c;
                su.a(true);
                c2531Co.f24980p.b(su.q());
                return null;
            case 6:
                C2590Gf c2590Gf = (C2590Gf) this.f881b;
                C2759Qe c2759Qe = (C2759Qe) this.f882c;
                C3715op c3715op = (C3715op) c2590Gf.f25832w;
                synchronized (c3715op.f34933u) {
                    try {
                        if (c3715op.f34934v) {
                            c3490kg = c3715op.f34932n;
                        } else {
                            c3715op.f34934v = true;
                            c3715op.f34936x = c2759Qe;
                            c3715op.f34937y.o();
                            C3490kg c3490kg2 = c3715op.f34932n;
                            c3490kg2.f32256n.a(new RunnableC3493kj(i4, c3715op), AbstractC3436jg.f32062h);
                            AbstractC3930sp.b(c3715op.f33732A, c3490kg2, c3715op.f33733B);
                            c3490kg = c3490kg2;
                        }
                    } finally {
                    }
                }
                return (C4308zp) c3490kg.f32256n.get(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32756A6)).intValue(), TimeUnit.SECONDS);
            case 7:
                return (C4308zp) ((C3490kg) ((C3715op) ((C3887s) this.f881b).f34557x).c((C2759Qe) this.f882c)).f32256n.get(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32756A6)).intValue(), TimeUnit.SECONDS);
            case 8:
                C2617Hp c2617Hp = (C2617Hp) this.f882c;
                C3661np c3661np = (C3661np) this.f881b;
                c3661np.b(35);
                int i11 = -1;
                while (true) {
                    try {
                        C3324ha c3324ha = AbstractC3592ma.f33010d8;
                        s2.r rVar = s2.r.f40506e;
                        if (i9 >= ((Integer) rVar.f40509c.a(c3324ha)).intValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 40);
                            sb.append("Received HTTP error code from ad server:");
                            sb.append(i11);
                            throw new Zq(1, sb.toString());
                        }
                        Context context4 = c3661np.f33559b;
                        String str3 = c3661np.f33560c.f41845n;
                        Binder.getCallingUid();
                        C2634Ip m9 = new C4297ze(i4, context4, str3, r3).m(c2617Hp);
                        int i12 = m9.f26345a;
                        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33020e8)).booleanValue()) {
                            c3661np.i.b(com.anythink.expressad.video.dynview.a.a.f21887W, String.valueOf(i9));
                        }
                        if (i12 == 200) {
                            c3661np.b(36);
                            return m9.f26347c;
                        }
                        i9++;
                        i11 = i12;
                    } catch (Exception e9) {
                        throw new Zq(e9.getMessage() == null ? "Fetch failed." : e9.getMessage(), e9);
                    }
                }
            case 9:
                C2634Ip c2634Ip = (C2634Ip) ((Iu) this.f881b).f26368v.get();
                Object obj = ((ND) this.f882c).f27259n;
                return new C2566Ep(c2634Ip, ((C2549Dp) obj).f25224b, ((C2549Dp) obj).f25223a);
            case 10:
                C4260yv c4260yv = (C4260yv) this.f881b;
                c4260yv.getClass();
                C3324ha c3324ha2 = AbstractC3592ma.da;
                s2.r rVar2 = s2.r.f40506e;
                boolean booleanValue = ((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue();
                String str4 = (String) this.f882c;
                x2.l lVar = c4260yv.f36027d;
                if (booleanValue) {
                    C4906k c4906k = C4906k.f40186C;
                    if (c4906k.f40191c.F(str4) || c4906k.f40191c.G(str4)) {
                        TM tm = c4260yv.f36030g.f29021c;
                        r3 = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
                        HashMap hashMap = new HashMap();
                        if (r3 != null) {
                            hashMap.put((String) rVar2.f40509c.a(AbstractC3592ma.ea), r3);
                        }
                        return lVar.a(hashMap, str4);
                    }
                }
                return lVar.a(null, str4);
            case 11:
                C4263yy c4263yy = (C4263yy) this.f881b;
                Object obj2 = this.f882c;
                synchronized (c4263yy) {
                    File file = c4263yy.f36037a;
                    AbstractC3066cl.u(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb2.append(name);
                    sb2.append(".temp");
                    File file2 = new File(parent, sb2.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            c4263yy.f36039c.f(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(c4263yy.f36037a)) {
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
                C3241fz c3241fz = (C3241fz) this.f881b;
                DexClassLoader dexClassLoader = c3241fz.f31247l;
                C3187ez c3187ez = c3241fz.f31240d;
                byte[] bArr = c3241fz.f31246k;
                C3295gz c3295gz = (C3295gz) this.f882c;
                String str5 = c3295gz.f31453a;
                String str6 = c3295gz.f31454b;
                Class<?>[] clsArr = c3295gz.f31455c;
                try {
                    c3187ez.getClass();
                    byte[] a10 = C3187ez.a(str5, bArr);
                    Charset charset = C3187ez.f30792a;
                    return dexClassLoader.loadClass(new String(a10, charset)).getMethod(new String(C3187ez.a(str6, bArr), charset), clsArr);
                } catch (C3133dz | ClassNotFoundException | NoSuchMethodException | NullPointerException e11) {
                    throw new IllegalStateException(e11);
                }
            case 13:
                Lz lz = (Lz) this.f881b;
                Xw b11 = lz.f26988a.b();
                C4006uA c4006uA = lz.f26991d;
                if (b11 == null) {
                    c4006uA.b(15004);
                    return "";
                }
                String d9 = b11.d((Context) this.f882c);
                if (d9 != null) {
                    return d9;
                }
                c4006uA.b(15006);
                return "";
            case 14:
                Pz pz = (Pz) this.f881b;
                pz.getClass();
                HashMap hashMap2 = new HashMap();
                pz.f27688f.f(20106, new RunnableC3888s0(i6, pz, hashMap2, (Context) this.f882c));
                String j6 = pz.j(hashMap2);
                hashMap2.clear();
                return j6;
            case 15:
                return ((RunnableC4901f) this.f881b).k((Context) this.f882c);
            case 16:
                Context context5 = (Context) this.f881b;
                Context context6 = (Context) this.f882c;
                if (context5 != null) {
                    w2.z.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context5.getSharedPreferences("admob_user_agent", 0);
                } else {
                    w2.z.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context6.getSharedPreferences("admob_user_agent", 0);
                    i9 = 1;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    w2.z.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context6);
                    if (i9 != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        w2.z.k("Persisting user agent.");
                    }
                }
                return string;
            default:
                HandlerC5139A handlerC5139A = w2.D.f41627l;
                String absolutePath = ((Context) this.f882c).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.f881b;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33141s1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public w(Context context, Qx qx) {
        this.f880a = 3;
        this.f881b = context;
        Objects.requireNonNull(qx);
        this.f882c = qx;
    }
}

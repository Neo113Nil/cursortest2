package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.util.Base64;
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

/* loaded from: classes2.dex */
public final /* synthetic */ class T6 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27717a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27718b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27719c;

    public /* synthetic */ T6(int i, Object obj, Object obj2) {
        this.f27717a = i;
        this.f27718b = obj;
        this.f27719c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x03a9 A[Catch: InterruptedException | ExecutionException -> 0x0417, TRY_ENTER, TRY_LEAVE, TryCatch #15 {InterruptedException | ExecutionException -> 0x0417, blocks: (B:171:0x03a9, B:172:0x040a, B:172:0x040a, B:182:0x0406, B:182:0x0406), top: B:169:0x03a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        String str;
        boolean equals;
        int i;
        Future c4;
        String str2;
        RunnableFutureC3083dE runnableFutureC3083dE;
        D6 d62;
        C2738Qe a9;
        C3320hg c3320hg;
        int i4 = 12;
        int i9 = 10;
        switch (this.f27717a) {
            case 0:
                C4017ue c4017ue = (C4017ue) this.f27718b;
                C3615n6 c3615n6 = (C3615n6) c4017ue.f34632w;
                C3761pr c3761pr = (C3761pr) c4017ue.f34631v;
                if (!c3615n6.C() && (runnableFutureC3083dE = (RunnableFutureC3083dE) c3761pr.f33523u) != null && (Build.VERSION.SDK_INT < 31 || runnableFutureC3083dE.isDone())) {
                    try {
                        d62 = (D6) runnableFutureC3083dE.get(c3615n6.B(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    }
                    if (d62 != null && d62.a0()) {
                        str = d62.v0();
                        equals = str.equals("E");
                        Context context = (Context) this.f27719c;
                        if (equals && (i = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                if (i >= 31) {
                                    c4 = C3686oN.c("");
                                } else {
                                    try {
                                        String packageName = context.getPackageName();
                                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                                        EC ec = HC.f25322f;
                                        byte[] h9 = ec.f().h("308204433082032ba003020102020900c2e08746644a308d300d06092a864886f70d01010405003074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964301e170d3038303832313233313333345a170d3336303130373233313333345a3074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f696430820120300d06092a864886f70d01010105000382010d00308201080282010100ab562e00d83ba208ae0a966f124e29da11f2ab56d08f58e2cca91303e9b754d372f640a71b1dcb130967624e4656a7776a92193db2e5bfb724a91e77188b0e6a47a43b33d9609b77183145ccdf7b2e586674c9e1565b1f4c6a5955bff251a63dabf9c55c27222252e875e4f8154a645f897168c0b1bfc612eabf785769bb34aa7984dc7e2ea2764cae8307d8c17154d7ee5f64a51a44a602c249054157dc02cd5f5c0e55fbef8519fbe327f0b1511692c5a06f19d18385f5c4dbc2d6b93f68cc2979c70e18ab93866b3bd5db8999552a0e3b4c99df58fb918bedc182ba35e003c1b4b10dd244a8ee24fffd333872ab5221985edab0fc0d0b145b6aa192858e79020103a381d93081d6301d0603551d0e04160414c77d8cc2211756259a7fd382df6be398e4d786a53081a60603551d2304819e30819b8014c77d8cc2211756259a7fd382df6be398e4d786a5a178a4763074310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e205669657731143012060355040a130b476f6f676c6520496e632e3110300e060355040b1307416e64726f69643110300e06035504031307416e64726f6964820900c2e08746644a308d300c0603551d13040530030101ff300d06092a864886f70d010104050003820101006dd252ceef85302c360aaace939bcff2cca904bb5d7a1661f8ae46b2994204d0ff4a68c7ed1a531ec4595a623ce60763b167297a7ae35712c407f208f0cb109429124d7b106219c084ca3eb3f9ad5fb871ef92269a8be28bf16d44c8d9a08e6cb2f005bb3fe2cb96447e868e731076ad45b33f6009ea19c161e62641aa99271dfd5228c5c587875ddb7f452758d661f6cc0cccb7352e424cc4365c523532f7325137593c4ae341f4db41edda0d0b1071a7c440f0fe9ea01cb627ca674369d084bd2fd911ff06cdbf2cfa10dc0f893ae35762919048c7efc64c7144178342f70581c9de573af55b390dd7fdb9418631895d5f759f30112687ff621410c069308a");
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(h9)));
                                        if (!Build.TYPE.equals("user")) {
                                            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(ec.f().h("308204a830820390a003020102020900d585b86c7dd34ef5300d06092a864886f70d0101040500308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d301e170d3038303431353233333635365a170d3335303930313233333635365a308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d30820120300d06092a864886f70d01010105000382010d00308201080282010100d6ce2e080abfe2314dd18db3cfd3185cb43d33fa0c74e1bdb6d1db8913f62c5c39df56f846813d65bec0f3ca426b07c5a8ed5a3990c167e76bc999b927894b8f0b22001994a92915e572c56d2a301ba36fc5fc113ad6cb9e7435a16d23ab7dfaeee165e4df1f0a8dbda70a869d516c4e9d051196ca7c0c557f175bc375f948c56aae86089ba44f8aa6a4dd9a7dbf2c0a352282ad06b8cc185eb15579eef86d080b1d6189c0f9af98b1c2ebd107ea45abdb68a3c7838a5e5488c76c53d40b121de7bbd30e620c188ae1aa61dbbc87dd3c645f2f55f3d4c375ec4070a93f7151d83670c16a971abe5ef2d11890e1b8aef3298cf066bf9e6ce144ac9ae86d1c1b0f020103a381fc3081f9301d0603551d0e041604148d1cc5be954c433c61863a15b04cbc03f24fe0b23081c90603551d230481c13081be80148d1cc5be954c433c61863a15b04cbc03f24fe0b2a1819aa48197308194310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d4d6f756e7461696e20566965773110300e060355040a1307416e64726f69643110300e060355040b1307416e64726f69643110300e06035504031307416e64726f69643122302006092a864886f70d0109011613616e64726f696440616e64726f69642e636f6d820900d585b86c7dd34ef5300c0603551d13040530030101ff300d06092a864886f70d0101040500038201010019d30cf105fb78923f4c0d7dd223233d40967acfce00081d5bd7c6e9d6ed206b0e11209506416ca244939913d26b4aa0e0f524cad2bb5c6e4ca1016a15916ea1ec5dc95a5e3a010036f49248d5109bbf2e1e618186673a3be56daf0b77b1c229e3c255e3e84c905d2387efba09cbf13b202b4e5a22c93263484a23d2fc29fa9f1939759733afd8aa160f4296c2d0163e8182859c6643e9c1962fa0c18333335bc090ff9a6b22ded1ad444229a539a94eefadabd065ced24b3e51e5dd7b66787bef12fe97fba484c423fb4ff8cc494c02f0f5051612ff6529393e8e46eac5bb21f277c151aa5f2aa627d1e89da70ab6033569de3b9897bfff7ca9da3e1243f60b"))));
                                        }
                                        S6 s6 = new S6();
                                        context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, s6);
                                        c4 = (ZD) s6.f27509b;
                                    } catch (Throwable unused2) {
                                        c4 = C3686oN.c("");
                                    }
                                }
                                str2 = (String) c4.get();
                                if (true != AbstractC3217fl.q(str2)) {
                                    str = str2;
                                }
                            } catch (InterruptedException | ExecutionException unused3) {
                            }
                        }
                        if (!str.equals("E") && !c3615n6.A()) {
                            try {
                                return C4017ue.A(context);
                            } catch (ClassCastException unused4) {
                                return str;
                            }
                        }
                    }
                }
                str = "E";
                equals = str.equals("E");
                Context context2 = (Context) this.f27719c;
                if (equals) {
                    if (i >= 31) {
                    }
                    str2 = (String) c4.get();
                    if (true != AbstractC3217fl.q(str2)) {
                    }
                }
                return !str.equals("E") ? str : str;
            case 1:
                C4101w7 c4101w7 = (C4101w7) this.f27718b;
                C3761pr c3761pr2 = c4101w7.f34937j;
                if ((c3761pr2 != null ? (RunnableFutureC3083dE) c3761pr2.f33523u : c4101w7.i) != null) {
                    (c3761pr2 != null ? (RunnableFutureC3083dE) c3761pr2.f33523u : c4101w7.i).get();
                }
                D6 b9 = c4101w7.b();
                if (b9 != null) {
                    try {
                        C3830r6 c3830r6 = (C3830r6) this.f27719c;
                        synchronized (c3830r6) {
                            byte[] b10 = b9.b();
                            YK yk = YK.f28820a;
                            int i10 = KK.f25952a;
                            c3830r6.a(b10, YK.f28821b);
                        }
                    } catch (C3845rL | NullPointerException unused5) {
                    }
                }
                return null;
            case 2:
                Rx rx = (Rx) this.f27718b;
                WeakHashMap weakHashMap = (WeakHashMap) rx.f27448u;
                Context context3 = (Context) this.f27719c;
                C2755Re c2755Re = (C2755Re) weakHashMap.get(context3);
                if (c2755Re != null) {
                    long longValue = c2755Re.f27389a + ((Long) AbstractC2496Ca.f24177d.r()).longValue();
                    p2.j.f39798C.f39810k.getClass();
                    if (longValue >= System.currentTimeMillis()) {
                        a9 = new C2721Pe(context3, c2755Re.f27390b).a();
                        ((WeakHashMap) rx.f27448u).put(context3, new C2755Re(rx, a9));
                        return a9;
                    }
                }
                a9 = new C2721Pe(context3).a();
                ((WeakHashMap) rx.f27448u).put(context3, new C2755Re(rx, a9));
                return a9;
            case 3:
                return (String) ((C2569Gf) this.f27718b).k((Context) this.f27719c, "getAppInstanceId");
            case 4:
                C2527Do c2527Do = (C2527Do) this.f27718b;
                c2527Do.f24559e.a(Boolean.TRUE);
                Vu vu = (Vu) this.f27719c;
                vu.b(true);
                c2527Do.f24569p.b(vu.m());
                return null;
            case 5:
                C2518Df c2518Df = (C2518Df) this.f27718b;
                C2687Ne c2687Ne = (C2687Ne) this.f27719c;
                C3866rp c3866rp = (C3866rp) c2518Df.f24455w;
                synchronized (c3866rp.f34865u) {
                    try {
                        if (c3866rp.f34866v) {
                            c3320hg = c3866rp.f34864n;
                        } else {
                            c3866rp.f34866v = true;
                            c3866rp.f34868x = c2687Ne;
                            c3866rp.f34869y.o();
                            C3320hg c3320hg2 = c3866rp.f34864n;
                            c3320hg2.f31242n.c(new RunnableC3376ij(i4, c3866rp), AbstractC3212fg.f30745h);
                            AbstractC4082vp.b(c3866rp.f34110A, c3320hg2, c3866rp.f34111B);
                            c3320hg = c3320hg2;
                        }
                    } finally {
                    }
                }
                return (C2511Cp) c3320hg.f31242n.get(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31398A6)).intValue(), TimeUnit.SECONDS);
            case 6:
                return (C2511Cp) ((C3320hg) ((C3866rp) ((r) this.f27718b).f33922x).c((C2687Ne) this.f27719c)).f31242n.get(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31398A6)).intValue(), TimeUnit.SECONDS);
            case 7:
                C2647Kp c2647Kp = (C2647Kp) this.f27719c;
                C3813qp c3813qp = (C3813qp) this.f27718b;
                c3813qp.b(35);
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    try {
                        C3151ea c3151ea = AbstractC3368ia.f31649d8;
                        q2.r rVar = q2.r.f40116e;
                        if (i11 >= ((Integer) rVar.f40119c.a(c3151ea)).intValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 40);
                            sb.append("Received HTTP error code from ad server:");
                            sb.append(i12);
                            throw new C3059cr(1, sb.toString());
                        }
                        Context context4 = c3813qp.f33882b;
                        String str3 = c3813qp.f33883c.f41217n;
                        Binder.getCallingUid();
                        C2664Lp n9 = new C4017ue(context4, str3, r3, i4).n(c2647Kp);
                        int i13 = n9.f26222a;
                        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31658e8)).booleanValue()) {
                            c3813qp.i.b(com.anythink.expressad.video.dynview.a.a.f21258W, String.valueOf(i11));
                        }
                        if (i13 == 200) {
                            c3813qp.b(36);
                            return n9.f26224c;
                        }
                        i11++;
                        i12 = i13;
                    } catch (Exception e6) {
                        throw new C3059cr(e6.getMessage() == null ? "Fetch failed." : e6.getMessage(), e6);
                    }
                }
            case 8:
                C2664Lp c2664Lp = (C2664Lp) ((Ku) this.f27718b).f26063v.get();
                Object obj = ((OD) this.f27719c).f26667n;
                return new C2596Hp(c2664Lp, ((C2579Gp) obj).f25218b, ((C2579Gp) obj).f25217a);
            case 9:
                Av av = (Av) this.f27718b;
                av.getClass();
                C3151ea c3151ea2 = AbstractC3368ia.da;
                q2.r rVar2 = q2.r.f40116e;
                boolean booleanValue = ((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue();
                String str4 = (String) this.f27719c;
                u2.l lVar = av.f23924d;
                if (booleanValue) {
                    p2.j jVar = p2.j.f39798C;
                    if (jVar.f39803c.F(str4) || jVar.f39803c.G(str4)) {
                        C3256gN c3256gN = av.f23927g.f27588c;
                        r3 = c3256gN != null ? Base64.encodeToString(c3256gN.b(), 10) : null;
                        HashMap hashMap = new HashMap();
                        if (r3 != null) {
                            hashMap.put((String) rVar2.f40119c.a(AbstractC3368ia.ea), r3);
                        }
                        return lVar.a(hashMap, str4);
                    }
                }
                return lVar.a(null, str4);
            case 10:
                C4307zy c4307zy = (C4307zy) this.f27718b;
                Object obj2 = this.f27719c;
                synchronized (c4307zy) {
                    File file = c4307zy.f35643a;
                    AbstractC3035cL.u(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb2.append(name);
                    sb2.append(".temp");
                    File file2 = new File(parent, sb2.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            c4307zy.f35645c.f(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(c4307zy.f35643a)) {
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
                    } catch (IOException e9) {
                        file2.delete();
                        throw e9;
                    }
                }
                return null;
            case 11:
                C3391iz c3391iz = (C3391iz) this.f27718b;
                DexClassLoader dexClassLoader = c3391iz.f32051l;
                C3339hz c3339hz = c3391iz.f32044d;
                byte[] bArr = c3391iz.f32050k;
                C3445jz c3445jz = (C3445jz) this.f27719c;
                String str5 = c3445jz.f32223a;
                String str6 = c3445jz.f32224b;
                Class<?>[] clsArr = c3445jz.f32225c;
                try {
                    c3339hz.getClass();
                    byte[] a10 = C3339hz.a(str5, bArr);
                    Charset charset = C3339hz.f31280a;
                    return dexClassLoader.loadClass(new String(a10, charset)).getMethod(new String(C3339hz.a(str6, bArr), charset), clsArr);
                } catch (C3285gz | ClassNotFoundException | NoSuchMethodException | NullPointerException e10) {
                    throw new IllegalStateException(e10);
                }
            case 12:
                Nz nz = (Nz) this.f27718b;
                Zw b11 = nz.f26628a.b();
                C4158xA c4158xA = nz.f26631d;
                if (b11 == null) {
                    c4158xA.b(15004);
                    return "";
                }
                String d2 = b11.d((Context) this.f27719c);
                if (d2 != null) {
                    return d2;
                }
                c4158xA.b(15006);
                return "";
            default:
                Sz sz = (Sz) this.f27718b;
                sz.getClass();
                HashMap hashMap2 = new HashMap();
                sz.f27668f.f(20106, new RunnableC3771q0(sz, hashMap2, (Context) this.f27719c, i9));
                String j9 = sz.j(hashMap2);
                hashMap2.clear();
                return j9;
        }
    }

    public T6(Context context, Rx rx) {
        this.f27717a = 2;
        this.f27719c = context;
        Objects.requireNonNull(rx);
        this.f27718b = rx;
    }
}

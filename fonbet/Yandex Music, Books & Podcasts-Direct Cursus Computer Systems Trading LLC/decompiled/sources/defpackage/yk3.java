package defpackage;

import android.media.AudioRecord;
import android.util.SparseArray;
import androidx.compose.ui.platform.AndroidComposeView;
import io.grpc.okhttp.a;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class yk3 implements tvc, tq3, f2j {
    public static final ci0 f = new ci0();
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public yk3(int i) {
        switch (i) {
            case 11:
                this.b = new Object();
                this.d = new l1j(21);
                this.e = new l1j(22);
                break;
            default:
                bv1 bv1Var = new bv1();
                this.c = bv1Var;
                this.d = bv1Var.f;
                this.e = btf.b(new u5i(7));
                break;
        }
    }

    public static final kp0 i(yk3 yk3Var, kp0 kp0Var, UUID uuid, h7e h7eVar) {
        jp0 a = kp0Var.a();
        uuid.getClass();
        a.c = uuid;
        int i = awt.a;
        System.currentTimeMillis();
        a.e = ((pob) a.e).b(new x6e(h7eVar.b, h7eVar.a));
        return a.c();
    }

    public static int t(sq3 sq3Var, int i) {
        int hashCode = sq3Var.b.hashCode() + (sq3Var.a * 31);
        tk7 tk7Var = sq3Var.e;
        if (i < 2) {
            long a = qc6.a(tk7Var);
            return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
        }
        return tk7Var.hashCode() + (hashCode * 31);
    }

    public static sq3 v(int i, DataInputStream dataInputStream) {
        tk7 e;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            rc6 rc6Var = new rc6(0);
            rc6Var.a(Long.valueOf(readLong), "exo_len");
            e = tk7.c.c(rc6Var);
        } else {
            e = rdk.e(dataInputStream);
        }
        return new sq3(readInt, readUTF, e);
    }

    public static qlb x(cvl cvlVar, frt frtVar) {
        return cvlVar.d() ? qlb.Liked : cvlVar.B != 0 ? qlb.Smart : "414787002:1076".equals(cvlVar.e()) ? qlb.Chart : Intrinsics.d(frtVar.c().a, cvlVar.c.a) ? qlb.User : qlb.Editor;
    }

    @Override // defpackage.f2j
    public void a() {
        Iterator it = ((ArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((b7e) it.next()).getClass();
        }
    }

    @Override // defpackage.tq3
    public void b(sq3 sq3Var) {
        this.a = true;
    }

    public void c() {
        synchronized (((to3) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            cvt.d((jmq) this.c);
            try {
                ((z0j) this.b).l();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.tvc
    public void close() {
        this.a = true;
        o2g.U("Lack of request message. GET request is only supported for unary requests", ((byte[]) this.d) != null);
        ((a) ((u5) this.e)).m.b0((s2i) this.b, (byte[]) this.d);
        this.d = null;
        this.b = null;
    }

    @Override // defpackage.tq3
    public boolean d() {
        nnk nnkVar = (nnk) this.d;
        return ((File) nnkVar.a).exists() || ((File) nnkVar.b).exists();
    }

    @Override // defpackage.tq3
    public void delete() {
        nnk nnkVar = (nnk) this.d;
        ((File) nnkVar.a).delete();
        ((File) nnkVar.b).delete();
    }

    @Override // defpackage.tq3
    public void e(HashMap hashMap) {
        if (this.a) {
            g(hashMap);
        }
    }

    @Override // defpackage.tq3
    public void g(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        nnk nnkVar = (nnk) this.d;
        DataOutputStream dataOutputStream2 = null;
        try {
            cu1 K = nnkVar.K();
            yco ycoVar = (yco) this.e;
            if (ycoVar == null) {
                this.e = new yco(K);
            } else {
                ycoVar.a(K);
            }
            dataOutputStream = new DataOutputStream((yco) this.e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (sq3 sq3Var : hashMap.values()) {
                dataOutputStream.writeInt(sq3Var.a);
                dataOutputStream.writeUTF(sq3Var.b);
                rdk.g(sq3Var.e, dataOutputStream);
                i += t(sq3Var, 2);
            }
            dataOutputStream.writeInt(i);
            dataOutputStream.close();
            ((File) nnkVar.b).delete();
            int i2 = dvt.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            dvt.g(dataOutputStream2);
            throw th;
        }
    }

    @Override // defpackage.tq3
    public void h(sq3 sq3Var, boolean z) {
        this.a = true;
    }

    @Override // defpackage.tvc
    public boolean isClosed() {
        return this.a;
    }

    @Override // defpackage.tq3
    public void j(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        vq1.A(!this.a);
        Cipher cipher = (Cipher) this.b;
        nnk nnkVar = (nnk) this.d;
        File file = (File) nnkVar.a;
        File file2 = (File) nnkVar.a;
        File file3 = (File) nnkVar.b;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (cipher != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                                int i = dvt.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i2 = 0;
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        sq3 v = v(readInt, dataInputStream);
                        String str = v.b;
                        hashMap.put(str, v);
                        sparseArray.put(v.a, str);
                        i2 += t(v, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i2 && z) {
                        dvt.g(dataInputStream);
                        return;
                    }
                }
                dvt.g(dataInputStream);
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dvt.g(dataInputStream2);
                }
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    dvt.g(dataInputStream2);
                }
                throw th;
            }
            hashMap.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    public void k(kd kdVar) {
        m(new l1j(21), kdVar);
    }

    public void m(jd jdVar, kd kdVar) {
        Throwable th;
        boolean z;
        synchronized (this.b) {
            this.d = jdVar;
            this.e = kdVar;
            th = (Throwable) this.c;
            z = this.a;
        }
        if (th != null) {
            kdVar.mo33b(th);
        } else if (z) {
            jdVar.call();
        }
    }

    public k3i n() {
        return new k3i((j3i) this.d, (String) this.e, (sym) this.b, (sym) this.c, this.a);
    }

    public void o(opf opfVar, float f2, long j) {
        ou3 ou3Var = opfVar.a;
        float floatValue = ((Number) ((fk0) this.c).e()).floatValue();
        if (floatValue > 0.0f) {
            long b = d85.b(j, floatValue, 0.0f, 0.0f, 0.0f, 14);
            if (!this.a) {
                jpa.D0(opfVar, b, f2, 0L, 0.0f, null, 0, 124);
                return;
            }
            float d = nmq.d(ou3Var.e());
            float b2 = nmq.b(ou3Var.e());
            nsh nshVar = ou3Var.b;
            long B = nshVar.B();
            nshVar.s().r();
            try {
                ((xzi) nshVar.b).W(0.0f, 0.0f, d, b2, 1);
                jpa.D0(opfVar, b, f2, 0L, 0.0f, null, 0, 124);
            } finally {
                vz1.A(nshVar, B);
            }
        }
    }

    public pjc p(kkp kkpVar) {
        anx anxVar;
        pob pobVar = (pob) kkpVar.d;
        qee qeeVar = fx6.c;
        nob d = pobVar.d(qeeVar);
        d.getClass();
        fx6 fx6Var = (fx6) d;
        String str = (String) ((rp7) this.b).a;
        nuj nujVar = (nuj) kkpVar.b;
        fx6 fx6Var2 = (fx6) pobVar.d(qeeVar);
        if (fx6Var2 == null) {
            fx6Var2 = fx6.d;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new t6e("X-APOLLO-OPERATION-ID", nujVar.b()));
        arrayList.add(new t6e("X-APOLLO-OPERATION-NAME", nujVar.name()));
        arrayList.add(new t6e("Accept", "multipart/mixed; deferSpec=20220824, application/json"));
        List list = (List) kkpVar.e;
        if (list != null) {
            arrayList.addAll(list);
        }
        int i = 2;
        int D = ouj.D(2);
        boolean z = false;
        int i2 = 1;
        if (D == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operationName", nujVar.name());
            hi3 hi3Var = new hi3();
            xac xacVar = new xac(new hj3(hi3Var));
            xacVar.j();
            nujVar.d(xacVar, fx6Var2);
            xacVar.p();
            if (!xacVar.b.isEmpty()) {
                xq0.q("FileUpload and Http GET are not supported at the same time");
                return null;
            }
            linkedHashMap.put("variables", hi3Var.G0());
            linkedHashMap.put("query", nujVar.c());
            str.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            boolean M = StringsKt.M(str, "?", false);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (M) {
                    sb.append('&');
                } else {
                    sb.append('?');
                    M = true;
                }
                sb.append(u1g.W((String) entry.getKey()));
                sb.append('=');
                sb.append(u1g.W((String) entry.getValue()));
            }
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            anxVar = new anx(i2, sb2, arrayList2, (Object) null);
        } else {
            if (D != 1) {
                b6e.s();
                return null;
            }
            String c = nujVar.c();
            str.getClass();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            fx6Var2.getClass();
            en7 en7Var = new en7(z, nujVar.b(), 0);
            hi3 hi3Var2 = new hi3();
            hj3 hj3Var = new hj3(hi3Var2);
            hj3Var.j();
            hj3Var.Z("operationName");
            hj3Var.m0(nujVar.name());
            hj3Var.Z("variables");
            xac xacVar2 = new xac(hj3Var);
            xacVar2.j();
            nujVar.d(xacVar2, fx6Var2);
            xacVar2.p();
            hj3Var.Z("query");
            hj3Var.m0(c);
            en7Var.invoke(hj3Var);
            hj3Var.p();
            pn3 g0 = hi3Var2.g0(hi3Var2.b);
            LinkedHashMap linkedHashMap2 = xacVar2.b;
            anxVar = new anx(i, str, arrayList3, linkedHashMap2.isEmpty() ? new au1(g0) : new yot(linkedHashMap2, g0));
        }
        return new eno(new d7e(this, anxVar, kkpVar, fx6Var, null));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function0, uif] */
    public void q(tre treVar, mm6 mm6Var) {
        yk3 yk3Var;
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = treVar instanceof k4e;
        if (z) {
            arrayList.add(treVar);
        } else if (treVar instanceof l4e) {
            arrayList.remove(((l4e) treVar).a);
        } else if (treVar instanceof poc) {
            arrayList.add(treVar);
        } else if (treVar instanceof qoc) {
            arrayList.remove(((qoc) treVar).a);
        } else if (treVar instanceof joa) {
            arrayList.add(treVar);
        } else {
            if (!(treVar instanceof koa)) {
                if (treVar instanceof ioa) {
                    arrayList.remove(((ioa) treVar).a);
                }
            }
            arrayList.remove(((koa) treVar).a);
        }
        tre treVar2 = (tre) CollectionsKt.Z(arrayList);
        if (!Intrinsics.d((tre) this.e, treVar2)) {
            Continuation continuation = null;
            if (treVar2 != null) {
                udo udoVar = (udo) ((uif) this.b).invoke();
                float f2 = z ? udoVar.c : treVar instanceof poc ? udoVar.b : treVar instanceof joa ? udoVar.a : 0.0f;
                act actVar = ceo.a;
                if (!(treVar2 instanceof k4e)) {
                    if (treVar2 instanceof poc) {
                        actVar = new act(45, nya.d, 2);
                    } else if (treVar2 instanceof joa) {
                        actVar = new act(45, nya.d, 2);
                    }
                }
                yk3Var = this;
                x97.y(mm6Var, null, null, new zp5(yk3Var, f2, actVar, continuation, 2), 3);
            } else {
                yk3Var = this;
                tre treVar3 = (tre) yk3Var.e;
                act actVar2 = ceo.a;
                if (!(treVar3 instanceof k4e) && !(treVar3 instanceof poc) && (treVar3 instanceof joa)) {
                    actVar2 = new act(150, nya.d, 2);
                }
                x97.y(mm6Var, null, null, new v0r(this, actVar2, continuation, 8), 3);
            }
            yk3Var.e = treVar2;
        }
    }

    @Override // defpackage.tvc
    public void s(rym rymVar) {
        qgr qgrVar = (qgr) this.c;
        o2g.U("writePayload should not be called multiple times", ((byte[]) this.d) == null);
        try {
            this.d = zm3.b(rymVar);
            qgrVar.c(0);
            qgr qgrVar2 = (qgr) this.c;
            byte[] bArr = (byte[]) this.d;
            qgrVar2.d(0, bArr.length, bArr.length);
            qgrVar.e(((byte[]) this.d).length);
            qgrVar.f(((byte[]) this.d).length);
        } catch (IOException e) {
            b6e.q(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int u(aqd aqdVar, AndroidComposeView androidComposeView, boolean z) {
        Object[] objArr;
        int i;
        dzd dzdVar = (dzd) this.c;
        gzd gzdVar = (gzd) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            fmq y = ((oxa) this.d).y(aqdVar, androidComposeView);
            ovg ovgVar = (ovg) y.c;
            int h = ovgVar.h();
            for (int i2 = 0; i2 < h; i2++) {
                lfm lfmVar = (lfm) ovgVar.i(i2);
                if (!lfmVar.d && !lfmVar.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int h2 = ovgVar.h();
            for (int i3 = 0; i3 < h2; i3++) {
                lfm lfmVar2 = (lfm) ovgVar.i(i3);
                if (objArr != false || swf.z(lfmVar2)) {
                    ((mpf) this.b).z(lfmVar2.c, (gzd) this.e, lfmVar2.i, true);
                    if (!gzdVar.a.g()) {
                        dzdVar.a(swf.z(lfmVar2), lfmVar2.a, gzdVar);
                        gzdVar.clear();
                    }
                }
            }
            boolean d = dzdVar.d(y, z);
            if (!y.b) {
                int h3 = ovgVar.h();
                for (int i4 = 0; i4 < h3; i4++) {
                    lfm lfmVar3 = (lfm) ovgVar.i(i4);
                    if (!enj.c(swf.f0(lfmVar3, true), 0L) && lfmVar3.b()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int i5 = (d ? 1 : 0) | (i << 1);
            this.a = false;
            return i5;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    public void w() {
        if (this.a) {
            try {
                try {
                    AudioRecord audioRecord = (AudioRecord) this.b;
                    if (audioRecord != null) {
                        audioRecord.stop();
                    }
                    AudioRecord audioRecord2 = (AudioRecord) this.b;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    ((bv1) this.c).a();
                    this.b = null;
                    this.a = false;
                    ssg.a(3, "MusicMatchAudioRecorder", "stopped recording", null);
                } catch (Exception e) {
                    ssg.a(6, "MusicMatchAudioRecorder", "error stopping recording", e);
                    this.b = null;
                    this.a = false;
                    ssg.a(3, "MusicMatchAudioRecorder", "stopped recording", null);
                }
            } catch (Throwable th) {
                this.b = null;
                this.a = false;
                ssg.a(3, "MusicMatchAudioRecorder", "stopped recording", null);
                throw th;
            }
        }
    }

    @Override // defpackage.tvc
    public void flush() {
    }

    @Override // defpackage.tq3
    public void f(long j) {
    }

    @Override // defpackage.tvc
    public void l(int i) {
    }

    @Override // defpackage.tvc
    public tvc r(nq4 nq4Var) {
        return this;
    }

    public yk3(r2c r2cVar, dsc dscVar, ojs ojsVar, spr sprVar, boolean z) {
        this.b = r2cVar;
        this.c = dscVar;
        this.d = ojsVar;
        this.e = sprVar;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yk3(zzp zzpVar, Function1 function1, StationId stationId, boolean z, gxc gxcVar) {
        zzpVar.getClass();
        stationId.getClass();
        gxcVar.getClass();
        this.b = zzpVar;
        this.c = (aur) function1;
        this.d = stationId;
        this.a = z;
        this.e = gxcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yk3(Function0 function0, boolean z) {
        this.a = z;
        this.b = (uif) function0;
        this.c = vq2.a(0.0f);
        this.d = new ArrayList();
    }
}

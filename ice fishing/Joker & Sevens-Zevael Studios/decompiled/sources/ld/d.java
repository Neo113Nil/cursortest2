package ld;

import ac.l;
import ac.m;
import ac.o;
import ad.i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.util.Base64;
import bc.n;
import bd.f;
import com.onesignal.inAppMessages.internal.display.impl.a;
import hc.j;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import pc.k;
import s.h0;
import w0.g;
import xc.h;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4261g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f4262h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4263i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4264j;

    /* renamed from: k, reason: collision with root package name */
    public Object f4265k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4266l;

    /* renamed from: m, reason: collision with root package name */
    public Object f4267m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4268n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a5.c cVar, fc.d dVar) {
        super(2, dVar);
        this.f4269o = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oc.a, pc.k] */
    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f4261g) {
            case 0:
                return new d((a5.c) this.f4269o, dVar);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d dVar2 = new d((oc.a) this.f4269o, dVar);
                dVar2.f4268n = obj;
                return dVar2;
            default:
                d dVar3 = new d((ContentResolver) this.f4265k, (Uri) this.f4266l, (m3.a) this.f4267m, (ad.e) this.f4268n, (Context) this.f4269o, dVar);
                dVar3.f4264j = obj;
                return dVar3;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4261g) {
            case 0:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((d) create((f) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
                return gc.a.f2559g;
            default:
                return ((d) create((f) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0490 A[Catch: all -> 0x0495, TryCatch #8 {all -> 0x0495, blocks: (B:150:0x0415, B:153:0x0485, B:155:0x0490, B:165:0x049d, B:172:0x04c8, B:180:0x04d2, B:181:0x04d5, B:157:0x04d6, B:183:0x0497, B:191:0x04e0, B:192:0x04e3, B:152:0x047f, B:188:0x04de), top: B:149:0x0415, inners: #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x049d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0497 A[Catch: all -> 0x0495, TRY_LEAVE, TryCatch #8 {all -> 0x0495, blocks: (B:150:0x0415, B:153:0x0485, B:155:0x0490, B:165:0x049d, B:172:0x04c8, B:180:0x04d2, B:181:0x04d5, B:157:0x04d6, B:183:0x0497, B:191:0x04e0, B:192:0x04e3, B:152:0x047f, B:188:0x04de), top: B:149:0x0415, inners: #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:9:0x0028, B:11:0x005d, B:16:0x006a, B:18:0x0072, B:27:0x003f, B:30:0x0054), top: B:4:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018e A[Catch: all -> 0x00c8, TryCatch #1 {all -> 0x00c8, blocks: (B:41:0x00c3, B:43:0x0173, B:47:0x0189, B:49:0x018e, B:52:0x0197, B:54:0x01ae, B:56:0x01ba, B:58:0x01c4, B:63:0x01d5, B:71:0x01e1, B:74:0x01ec, B:77:0x01f6, B:82:0x01fd, B:88:0x0217, B:90:0x0220, B:99:0x0245, B:100:0x0248, B:106:0x00e9, B:109:0x0106, B:116:0x0142, B:122:0x0159, B:131:0x0257, B:132:0x025a, B:118:0x014e, B:121:0x0156, B:128:0x0253, B:129:0x0256, B:84:0x020c, B:87:0x0214, B:95:0x0241, B:96:0x0244), top: B:35:0x00a5, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0249 A[LOOP:0: B:48:0x018c->B:79:0x0249, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v7, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r3v19, types: [oc.a, pc.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0094 -> B:11:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01fb -> B:40:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x021e -> B:40:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0236 -> B:40:0x0237). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object A;
        e eVar;
        Object A2;
        String str2;
        String str3;
        Object A3;
        e eVar2;
        String str4;
        String str5;
        Charset charset;
        Object s10;
        Throwable a6;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        c6.f fVar;
        f fVar2;
        h0 h0Var;
        oc.c eVar3;
        i a8;
        g u10;
        g j3;
        Object obj2;
        Object obj3;
        Set set;
        boolean z10;
        Object p8;
        int i10;
        f fVar3;
        ad.b bVar;
        Object obj4;
        int i11 = 2;
        boolean z11 = false;
        switch (this.f4261g) {
            case 0:
                a5.c cVar = (a5.c) this.f4269o;
                gc.a aVar = gc.a.f2559g;
                int i12 = this.f4262h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    str = (String) kd.b.f3642a.getValue();
                    b bVar2 = (b) cVar.f262h;
                    this.f4263i = str;
                    this.f4262h = 1;
                    A = a0.A(i0.f8859a, new a(bVar2, null, 1), this);
                    if (A == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            e eVar4 = (e) this.f4267m;
                            String str6 = (String) this.f4263i;
                            v6.a.W(obj);
                            eVar = eVar4;
                            str = str6;
                            A2 = obj;
                            str2 = (String) A2;
                            m mVar = kd.c.f3643a;
                            pc.j.e(str2, "referrerSnippet");
                            String str7 = (String) kd.c.f3643a.getValue();
                            if (!h.t(str2) && !str2.equals("null") && !h.n(str2, str7, true) && eVar.f4271b) {
                                str3 = eVar.f4270a;
                                b bVar3 = (b) cVar.f261g;
                                this.f4263i = str;
                                this.f4267m = eVar;
                                this.f4264j = str2;
                                this.f4268n = cVar;
                                this.f4265k = str;
                                this.f4266l = str3;
                                this.f4262h = 3;
                                A3 = a0.A(i0.f8861c, new a(bVar3, null, 0), this);
                                if (A3 != aVar) {
                                    return aVar;
                                }
                                eVar2 = eVar;
                                str4 = str2;
                                str5 = str;
                                String str8 = (String) A3;
                                cVar.getClass();
                                kd.a aVar2 = (kd.a) kd.a.f3637e.getValue();
                                String str9 = (String) kd.d.f3645b.getValue();
                                pc.j.e(str4, "value");
                                pc.j.e(str9, "charset");
                                String encode = URLEncoder.encode(str4, str9);
                                pc.j.d(encode, "encode(...)");
                                pc.j.e(aVar2, "schema");
                                pc.j.e(str3, "installTag");
                                pc.j.e(str8, "advertisingTag");
                                String W = bc.m.W(n.L(new ac.i(aVar2.f3639b, str3), new ac.i(aVar2.f3640c, str8), new ac.i(aVar2.f3641d, encode)), "&", null, null, new h2.m(26), 30);
                                charset = xc.a.f8399a;
                                byte[] bytes = W.getBytes(charset);
                                pc.j.d(bytes, "getBytes(...)");
                                byte[] bArr = ce.a.f1400a;
                                pc.j.e(bArr, "key");
                                byte[] bArr2 = new byte[16];
                                new SecureRandom().nextBytes(bArr2);
                                Cipher cipher = Cipher.getInstance(x4.f.L());
                                cipher.init(1, new SecretKeySpec(bArr, x4.f.J()), new IvParameterSpec(bArr2));
                                byte[] doFinal = cipher.doFinal(bytes);
                                pc.j.b(doFinal);
                                int length = doFinal.length;
                                byte[] copyOf = Arrays.copyOf(bArr2, 16 + length);
                                System.arraycopy(doFinal, 0, copyOf, 16, length);
                                pc.j.b(copyOf);
                                String encodeToString = Base64.encodeToString(copyOf, 10);
                                pc.j.d(encodeToString, "encodeToString(...)");
                                pc.j.e(str5, "endpoint");
                                URL url = new URL(str5);
                                URLConnection openConnection = url.openConnection();
                                pc.j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                                httpURLConnection = (HttpURLConnection) openConnection;
                                httpURLConnection.setRequestMethod((String) kd.d.f3644a.getValue());
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                ac.i iVar = (ac.i) kd.d.f3646c.getValue();
                                httpURLConnection.setRequestProperty((String) iVar.f270g, (String) iVar.f271h);
                                httpURLConnection.setRequestProperty((String) kd.d.f3647d.getValue(), url.getHost());
                                byte[] bytes2 = (aVar2.f3638a + "=" + encodeToString).getBytes(charset);
                                pc.j.d(bytes2, "getBytes(...)");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                outputStream.write(bytes2);
                                outputStream.flush();
                                outputStream.close();
                                if (httpURLConnection.getResponseCode() != 200) {
                                }
                                if (inputStream != null) {
                                }
                                httpURLConnection.disconnect();
                                s10 = o.f277a;
                                a6 = l.a(s10);
                                if (a6 != null) {
                                }
                                eVar = eVar2;
                            }
                            return a4.d.i(str, eVar.f4270a);
                        }
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str10 = (String) this.f4266l;
                        str5 = (String) this.f4265k;
                        a5.c cVar2 = (a5.c) this.f4268n;
                        str4 = (String) this.f4264j;
                        eVar2 = (e) this.f4267m;
                        String str11 = (String) this.f4263i;
                        v6.a.W(obj);
                        str3 = str10;
                        cVar = cVar2;
                        str = str11;
                        A3 = obj;
                        String str82 = (String) A3;
                        cVar.getClass();
                        kd.a aVar22 = (kd.a) kd.a.f3637e.getValue();
                        String str92 = (String) kd.d.f3645b.getValue();
                        pc.j.e(str4, "value");
                        pc.j.e(str92, "charset");
                        String encode2 = URLEncoder.encode(str4, str92);
                        pc.j.d(encode2, "encode(...)");
                        pc.j.e(aVar22, "schema");
                        pc.j.e(str3, "installTag");
                        pc.j.e(str82, "advertisingTag");
                        String W2 = bc.m.W(n.L(new ac.i(aVar22.f3639b, str3), new ac.i(aVar22.f3640c, str82), new ac.i(aVar22.f3641d, encode2)), "&", null, null, new h2.m(26), 30);
                        charset = xc.a.f8399a;
                        byte[] bytes3 = W2.getBytes(charset);
                        pc.j.d(bytes3, "getBytes(...)");
                        byte[] bArr3 = ce.a.f1400a;
                        pc.j.e(bArr3, "key");
                        byte[] bArr22 = new byte[16];
                        new SecureRandom().nextBytes(bArr22);
                        Cipher cipher2 = Cipher.getInstance(x4.f.L());
                        cipher2.init(1, new SecretKeySpec(bArr3, x4.f.J()), new IvParameterSpec(bArr22));
                        byte[] doFinal2 = cipher2.doFinal(bytes3);
                        pc.j.b(doFinal2);
                        int length2 = doFinal2.length;
                        byte[] copyOf2 = Arrays.copyOf(bArr22, 16 + length2);
                        System.arraycopy(doFinal2, 0, copyOf2, 16, length2);
                        pc.j.b(copyOf2);
                        String encodeToString2 = Base64.encodeToString(copyOf2, 10);
                        pc.j.d(encodeToString2, "encodeToString(...)");
                        pc.j.e(str5, "endpoint");
                        try {
                            URL url2 = new URL(str5);
                            URLConnection openConnection2 = url2.openConnection();
                            pc.j.c(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            httpURLConnection = (HttpURLConnection) openConnection2;
                            httpURLConnection.setRequestMethod((String) kd.d.f3644a.getValue());
                            httpURLConnection.setConnectTimeout(30000);
                            httpURLConnection.setReadTimeout(30000);
                            httpURLConnection.setDoOutput(true);
                            ac.i iVar2 = (ac.i) kd.d.f3646c.getValue();
                            httpURLConnection.setRequestProperty((String) iVar2.f270g, (String) iVar2.f271h);
                            httpURLConnection.setRequestProperty((String) kd.d.f3647d.getValue(), url2.getHost());
                            byte[] bytes22 = (aVar22.f3638a + "=" + encodeToString2).getBytes(charset);
                            pc.j.d(bytes22, "getBytes(...)");
                            OutputStream outputStream2 = httpURLConnection.getOutputStream();
                            try {
                                outputStream2.write(bytes22);
                                outputStream2.flush();
                                outputStream2.close();
                                inputStream = httpURLConnection.getResponseCode() != 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                                if (inputStream != null) {
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset), 8192);
                                        try {
                                            StringWriter stringWriter = new StringWriter();
                                            char[] cArr = new char[8192];
                                            for (int read = bufferedReader.read(cArr); read >= 0; read = bufferedReader.read(cArr)) {
                                                stringWriter.write(cArr, 0, read);
                                            }
                                            pc.j.d(stringWriter.toString(), "toString(...)");
                                            bufferedReader.close();
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                bc.a0.f(bufferedReader, th);
                                                throw th2;
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                httpURLConnection.disconnect();
                                s10 = o.f277a;
                            } finally {
                            }
                        } catch (Throwable th3) {
                            s10 = v6.a.s(th3);
                        }
                        a6 = l.a(s10);
                        if (a6 != null) {
                            a6.printStackTrace();
                        }
                        eVar = eVar2;
                        return a4.d.i(str, eVar.f4270a);
                    }
                    str = (String) this.f4263i;
                    v6.a.W(obj);
                    A = obj;
                }
                eVar = (e) A;
                b bVar4 = (b) cVar.f263i;
                this.f4263i = str;
                this.f4267m = eVar;
                this.f4262h = 2;
                A2 = a0.A(i0.f8861c, new c(bVar4, null, 0), this);
                if (A2 == aVar) {
                    return aVar;
                }
                str2 = (String) A2;
                m mVar2 = kd.c.f3643a;
                pc.j.e(str2, "referrerSnippet");
                String str72 = (String) kd.c.f3643a.getValue();
                if (!h.t(str2)) {
                    str3 = eVar.f4270a;
                    b bVar32 = (b) cVar.f261g;
                    this.f4263i = str;
                    this.f4267m = eVar;
                    this.f4264j = str2;
                    this.f4268n = cVar;
                    this.f4265k = str;
                    this.f4266l = str3;
                    this.f4262h = 3;
                    A3 = a0.A(i0.f8861c, new a(bVar32, null, 0), this);
                    if (A3 != aVar) {
                    }
                }
                return a4.d.i(str, eVar.f4270a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                gc.a aVar3 = gc.a.f2559g;
                int i13 = this.f4262h;
                try {
                    if (i13 == 0) {
                        v6.a.W(obj);
                        fVar2 = (f) this.f4268n;
                        h0Var = new h0();
                        eVar3 = new k2.e(3, h0Var);
                        a8 = a.a.a(Integer.MAX_VALUE, 6, null);
                        ae.b bVar5 = new ae.b(4, a8);
                        w0.m.f(w0.m.f7578a);
                        synchronized (w0.m.f7580c) {
                            w0.m.f7585h = bc.m.Z(w0.m.f7585h, bVar5);
                        }
                        fVar = new c6.f(13, bVar5);
                        u10 = w0.m.k().u(eVar3);
                        ?? r13 = (k) this.f4269o;
                        try {
                            j3 = u10.j();
                            try {
                                Object invoke = r13.invoke();
                                u10.c();
                                this.f4268n = fVar2;
                                this.f4263i = h0Var;
                                this.f4264j = eVar3;
                                this.f4265k = a8;
                                this.f4266l = fVar;
                                this.f4267m = invoke;
                                this.f4262h = 1;
                                if (fVar2.a(invoke, this) == aVar3) {
                                    return aVar3;
                                }
                                obj2 = invoke;
                            } finally {
                                g.q(j3);
                            }
                        } finally {
                        }
                    } else if (i13 == 1) {
                        obj2 = this.f4267m;
                        fVar = (c6.f) this.f4266l;
                        a8 = (i) this.f4265k;
                        eVar3 = (oc.c) this.f4264j;
                        h0Var = (h0) this.f4263i;
                        fVar2 = (f) this.f4268n;
                        v6.a.W(obj);
                    } else if (i13 == 2) {
                        obj2 = this.f4267m;
                        fVar = (c6.f) this.f4266l;
                        a8 = (i) this.f4265k;
                        eVar3 = (oc.c) this.f4264j;
                        h0Var = (h0) this.f4263i;
                        fVar2 = (f) this.f4268n;
                        v6.a.W(obj);
                        obj3 = obj;
                        set = (Set) obj3;
                        z10 = z11;
                        while (true) {
                            if (!z10) {
                                Object[] objArr = h0Var.f6275b;
                                long[] jArr = h0Var.f6274a;
                                int length3 = jArr.length - i11;
                                if (length3 >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j6 = jArr[i14];
                                        Object[] objArr2 = objArr;
                                        long[] jArr2 = jArr;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length3)) >>> 31);
                                            int i17 = 0;
                                            while (i17 < i16) {
                                                if ((j6 & 255) < 128) {
                                                    i10 = i15;
                                                    if (set.contains(objArr2[(i14 << 3) + i17])) {
                                                    }
                                                } else {
                                                    i10 = i15;
                                                }
                                                j6 >>= i10;
                                                i17++;
                                                i15 = i10;
                                            }
                                            if (i16 != i15) {
                                            }
                                        }
                                        if (i14 != length3) {
                                            i14++;
                                            objArr = objArr2;
                                            jArr = jArr2;
                                        }
                                    }
                                }
                                z10 = false;
                                p8 = a8.p();
                                if (p8 instanceof ad.k) {
                                    p8 = null;
                                }
                                set = (Set) p8;
                                if (set != null) {
                                    i11 = 2;
                                } else {
                                    if (z10) {
                                        h0Var.b();
                                        u10 = w0.m.k().u(eVar3);
                                        ?? r32 = (k) this.f4269o;
                                        try {
                                            try {
                                                Object invoke2 = r32.invoke();
                                                u10.c();
                                                if (!pc.j.a(invoke2, obj2)) {
                                                    this.f4268n = fVar2;
                                                    this.f4263i = h0Var;
                                                    this.f4264j = eVar3;
                                                    this.f4265k = a8;
                                                    this.f4266l = fVar;
                                                    this.f4267m = invoke2;
                                                    this.f4262h = 3;
                                                    if (fVar2.a(invoke2, this) != aVar3) {
                                                        obj2 = invoke2;
                                                    }
                                                    return aVar3;
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            j3 = u10.j();
                                        } finally {
                                        }
                                    }
                                    i11 = 2;
                                    z11 = false;
                                }
                            }
                            z10 = true;
                            p8 = a8.p();
                            if (p8 instanceof ad.k) {
                            }
                            set = (Set) p8;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f4267m;
                        fVar = (c6.f) this.f4266l;
                        a8 = (i) this.f4265k;
                        eVar3 = (oc.c) this.f4264j;
                        h0Var = (h0) this.f4263i;
                        fVar2 = (f) this.f4268n;
                        v6.a.W(obj);
                        i11 = 2;
                        z11 = false;
                    }
                    this.f4268n = fVar2;
                    this.f4263i = h0Var;
                    this.f4264j = eVar3;
                    this.f4265k = a8;
                    this.f4266l = fVar;
                    this.f4267m = obj2;
                    this.f4262h = i11;
                    obj3 = a8.h(this);
                    if (obj3 == aVar3) {
                        return aVar3;
                    }
                    set = (Set) obj3;
                    z10 = z11;
                    while (true) {
                        if (!z10) {
                        }
                        z10 = true;
                        p8 = a8.p();
                        if (p8 instanceof ad.k) {
                        }
                        set = (Set) p8;
                        if (set != null) {
                        }
                        i11 = 2;
                    }
                } catch (Throwable th5) {
                    fVar.f();
                    throw th5;
                }
            default:
                m3.a aVar4 = (m3.a) this.f4267m;
                ContentResolver contentResolver = (ContentResolver) this.f4265k;
                gc.a aVar5 = gc.a.f2559g;
                int i18 = this.f4262h;
                try {
                    if (i18 == 0) {
                        v6.a.W(obj);
                        fVar3 = (f) this.f4264j;
                        contentResolver.registerContentObserver((Uri) this.f4266l, false, aVar4);
                        bVar = new ad.b((ad.e) this.f4268n);
                    } else if (i18 == 1) {
                        ad.b bVar6 = (ad.b) this.f4263i;
                        fVar3 = (f) this.f4264j;
                        v6.a.W(obj);
                        bVar = bVar6;
                        obj4 = obj;
                        if (((Boolean) obj4).booleanValue()) {
                            contentResolver.unregisterContentObserver(aVar4);
                            return o.f277a;
                        }
                        bVar.c();
                        Float f10 = new Float(Settings.Global.getFloat(((Context) this.f4269o).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.f4264j = fVar3;
                        this.f4263i = bVar;
                        this.f4262h = 2;
                        if (fVar3.a(f10, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ad.b bVar7 = (ad.b) this.f4263i;
                        fVar3 = (f) this.f4264j;
                        v6.a.W(obj);
                        bVar = bVar7;
                    }
                    this.f4264j = fVar3;
                    this.f4263i = bVar;
                    this.f4262h = 1;
                    obj4 = bVar.b(this);
                    if (obj4 == aVar5) {
                        return aVar5;
                    }
                    if (((Boolean) obj4).booleanValue()) {
                    }
                } catch (Throwable th6) {
                    contentResolver.unregisterContentObserver(aVar4);
                    throw th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ContentResolver contentResolver, Uri uri, m3.a aVar, ad.e eVar, Context context, fc.d dVar) {
        super(2, dVar);
        this.f4265k = contentResolver;
        this.f4266l = uri;
        this.f4267m = aVar;
        this.f4268n = eVar;
        this.f4269o = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(oc.a aVar, fc.d dVar) {
        super(2, dVar);
        this.f4269o = (k) aVar;
    }
}

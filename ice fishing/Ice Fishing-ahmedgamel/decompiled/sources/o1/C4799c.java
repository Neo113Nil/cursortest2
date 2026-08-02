package o1;

import com.google.android.gms.internal.ads.C3624n5;
import com.google.android.gms.internal.ads.C3732p5;
import com.google.android.gms.internal.ads.W4;
import com.google.android.gms.internal.ads.Wv;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import n1.j;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4799c {

    /* renamed from: a, reason: collision with root package name */
    public long f39722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39723b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39724c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39725d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39726e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39727f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39728g;

    /* renamed from: h, reason: collision with root package name */
    public final List f39729h;

    public C4799c(String str, String str2, long j6, long j9, long j10, long j11, List list) {
        this.f39723b = str;
        this.f39724c = "".equals(str2) ? null : str2;
        this.f39725d = j6;
        this.f39726e = j9;
        this.f39727f = j10;
        this.f39728g = j11;
        this.f39729h = list;
    }

    public static C4799c a(C3624n5 c3624n5) {
        if (C3732p5.i(c3624n5) != 538247942) {
            throw new IOException();
        }
        String k9 = C3732p5.k(c3624n5);
        String k10 = C3732p5.k(c3624n5);
        long j6 = C3732p5.j(c3624n5);
        long j9 = C3732p5.j(c3624n5);
        long j10 = C3732p5.j(c3624n5);
        long j11 = C3732p5.j(c3624n5);
        int i = C3732p5.i(c3624n5);
        if (i < 0) {
            throw new IOException(Wv.f(i, "readHeaderList size="));
        }
        List arrayList = i == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(new n1.d(C3732p5.k(c3624n5).intern(), C3732p5.k(c3624n5).intern()));
        }
        return new C4799c(k9, k10, j6, j9, j10, j11, arrayList);
    }

    public final W4 b(byte[] bArr) {
        W4 w42 = new W4(1);
        w42.f29111a = bArr;
        w42.f29112b = this.f39724c;
        w42.f29113c = this.f39725d;
        w42.f29114d = this.f39726e;
        w42.f29115e = this.f39727f;
        w42.f29116f = this.f39728g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<n1.d> list = this.f39729h;
        for (n1.d dVar : list) {
            treeMap.put(dVar.f39626a, dVar.f39627b);
        }
        w42.f29117g = treeMap;
        w42.f29118h = Collections.unmodifiableList(list);
        return w42;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            C3732p5.m(bufferedOutputStream, 538247942);
            C3732p5.o(bufferedOutputStream, this.f39723b);
            String str = this.f39724c;
            if (str == null) {
                str = "";
            }
            C3732p5.o(bufferedOutputStream, str);
            C3732p5.n(bufferedOutputStream, this.f39725d);
            C3732p5.n(bufferedOutputStream, this.f39726e);
            C3732p5.n(bufferedOutputStream, this.f39727f);
            C3732p5.n(bufferedOutputStream, this.f39728g);
            List<n1.d> list = this.f39729h;
            if (list != null) {
                C3732p5.m(bufferedOutputStream, list.size());
                for (n1.d dVar : list) {
                    C3732p5.o(bufferedOutputStream, dVar.f39626a);
                    C3732p5.o(bufferedOutputStream, dVar.f39627b);
                }
            } else {
                C3732p5.m(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e9) {
            j.b("%s", e9.toString());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4799c(String str, W4 w42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = w42.f29112b;
        long j6 = w42.f29113c;
        long j9 = w42.f29114d;
        long j10 = w42.f29115e;
        long j11 = w42.f29116f;
        List list = w42.f29118h;
        if (list == 0) {
            Map map = w42.f29117g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new n1.d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}

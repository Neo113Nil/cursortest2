package m1;

import com.google.android.gms.internal.ads.C3506l5;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.T4;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l1.d;
import l1.j;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4775b {

    /* renamed from: a, reason: collision with root package name */
    public long f39547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39549c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39550d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39551e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39552f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39553g;

    /* renamed from: h, reason: collision with root package name */
    public final List f39554h;

    public C4775b(String str, String str2, long j9, long j10, long j11, long j12, List list) {
        this.f39548b = str;
        this.f39549c = "".equals(str2) ? null : str2;
        this.f39550d = j9;
        this.f39551e = j10;
        this.f39552f = j11;
        this.f39553g = j12;
        this.f39554h = list;
    }

    public static C4775b a(C3506l5 c3506l5) {
        if (C3614n5.i(c3506l5) != 538247942) {
            throw new IOException();
        }
        String k6 = C3614n5.k(c3506l5);
        String k9 = C3614n5.k(c3506l5);
        long j9 = C3614n5.j(c3506l5);
        long j10 = C3614n5.j(c3506l5);
        long j11 = C3614n5.j(c3506l5);
        long j12 = C3614n5.j(c3506l5);
        int i = C3614n5.i(c3506l5);
        if (i < 0) {
            throw new IOException(CL.i(i, "readHeaderList size="));
        }
        List arrayList = i == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i4 = 0; i4 < i; i4++) {
            arrayList.add(new d(C3614n5.k(c3506l5).intern(), C3614n5.k(c3506l5).intern()));
        }
        return new C4775b(k6, k9, j9, j10, j11, j12, arrayList);
    }

    public final T4 b(byte[] bArr) {
        T4 t42 = new T4(1);
        t42.f27709a = bArr;
        t42.f27710b = this.f39549c;
        t42.f27711c = this.f39550d;
        t42.f27712d = this.f39551e;
        t42.f27713e = this.f39552f;
        t42.f27714f = this.f39553g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<d> list = this.f39554h;
        for (d dVar : list) {
            treeMap.put(dVar.f39030a, dVar.f39031b);
        }
        t42.f27715g = treeMap;
        t42.f27716h = Collections.unmodifiableList(list);
        return t42;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            C3614n5.m(bufferedOutputStream, 538247942);
            C3614n5.o(bufferedOutputStream, this.f39548b);
            String str = this.f39549c;
            if (str == null) {
                str = "";
            }
            C3614n5.o(bufferedOutputStream, str);
            C3614n5.n(bufferedOutputStream, this.f39550d);
            C3614n5.n(bufferedOutputStream, this.f39551e);
            C3614n5.n(bufferedOutputStream, this.f39552f);
            C3614n5.n(bufferedOutputStream, this.f39553g);
            List<d> list = this.f39554h;
            if (list != null) {
                C3614n5.m(bufferedOutputStream, list.size());
                for (d dVar : list) {
                    C3614n5.o(bufferedOutputStream, dVar.f39030a);
                    C3614n5.o(bufferedOutputStream, dVar.f39031b);
                }
            } else {
                C3614n5.m(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e6) {
            j.b("%s", e6.toString());
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
    public C4775b(String str, T4 t42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = t42.f27710b;
        long j9 = t42.f27711c;
        long j10 = t42.f27712d;
        long j11 = t42.f27713e;
        long j12 = t42.f27714f;
        List list = t42.f27716h;
        if (list == 0) {
            Map map = t42.f27715g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}

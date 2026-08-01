package m1;

import com.google.android.gms.internal.ads.C3601n5;
import com.google.android.gms.internal.ads.C3709p5;
import com.google.android.gms.internal.ads.W4;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import l1.j;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4728c {

    /* renamed from: a, reason: collision with root package name */
    public long f39279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39281c;

    /* renamed from: d, reason: collision with root package name */
    public final long f39282d;

    /* renamed from: e, reason: collision with root package name */
    public final long f39283e;

    /* renamed from: f, reason: collision with root package name */
    public final long f39284f;

    /* renamed from: g, reason: collision with root package name */
    public final long f39285g;

    /* renamed from: h, reason: collision with root package name */
    public final List f39286h;

    public C4728c(String str, String str2, long j6, long j9, long j10, long j11, List list) {
        this.f39280b = str;
        this.f39281c = "".equals(str2) ? null : str2;
        this.f39282d = j6;
        this.f39283e = j9;
        this.f39284f = j10;
        this.f39285g = j11;
        this.f39286h = list;
    }

    public static C4728c a(C3601n5 c3601n5) {
        if (C3709p5.i(c3601n5) != 538247942) {
            throw new IOException();
        }
        String k9 = C3709p5.k(c3601n5);
        String k10 = C3709p5.k(c3601n5);
        long j6 = C3709p5.j(c3601n5);
        long j9 = C3709p5.j(c3601n5);
        long j10 = C3709p5.j(c3601n5);
        long j11 = C3709p5.j(c3601n5);
        int i = C3709p5.i(c3601n5);
        if (i < 0) {
            throw new IOException(AbstractC4404f.e(i, "readHeaderList size="));
        }
        List arrayList = i == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i6 = 0; i6 < i; i6++) {
            arrayList.add(new l1.d(C3709p5.k(c3601n5).intern(), C3709p5.k(c3601n5).intern()));
        }
        return new C4728c(k9, k10, j6, j9, j10, j11, arrayList);
    }

    public final W4 b(byte[] bArr) {
        W4 w42 = new W4(1);
        w42.f28313a = bArr;
        w42.f28314b = this.f39281c;
        w42.f28315c = this.f39282d;
        w42.f28316d = this.f39283e;
        w42.f28317e = this.f39284f;
        w42.f28318f = this.f39285g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<l1.d> list = this.f39286h;
        for (l1.d dVar : list) {
            treeMap.put(dVar.f38888a, dVar.f38889b);
        }
        w42.f28319g = treeMap;
        w42.f28320h = Collections.unmodifiableList(list);
        return w42;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            C3709p5.m(bufferedOutputStream, 538247942);
            C3709p5.o(bufferedOutputStream, this.f39280b);
            String str = this.f39281c;
            if (str == null) {
                str = "";
            }
            C3709p5.o(bufferedOutputStream, str);
            C3709p5.n(bufferedOutputStream, this.f39282d);
            C3709p5.n(bufferedOutputStream, this.f39283e);
            C3709p5.n(bufferedOutputStream, this.f39284f);
            C3709p5.n(bufferedOutputStream, this.f39285g);
            List<l1.d> list = this.f39286h;
            if (list != null) {
                C3709p5.m(bufferedOutputStream, list.size());
                for (l1.d dVar : list) {
                    C3709p5.o(bufferedOutputStream, dVar.f38888a);
                    C3709p5.o(bufferedOutputStream, dVar.f38889b);
                }
            } else {
                C3709p5.m(bufferedOutputStream, 0);
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
    public C4728c(String str, W4 w42) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = w42.f28314b;
        long j6 = w42.f28315c;
        long j9 = w42.f28316d;
        long j10 = w42.f28317e;
        long j11 = w42.f28318f;
        List list = w42.f28320h;
        if (list == 0) {
            Map map = w42.f28319g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new l1.d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }
}

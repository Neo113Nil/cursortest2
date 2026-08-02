package k1;

import android.util.SparseIntArray;
import java.io.IOException;
import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import s6.C4976a;
import x1.C5186d;
import x1.i;
import y8.e;
import y8.h;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4639a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38563a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38564b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f38565c;

    public /* synthetic */ C4639a(Serializable serializable, Object obj, int i) {
        this.f38563a = i;
        this.f38564b = serializable;
        this.f38565c = obj;
    }

    public static int b(int i, int i4) {
        int i6 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i6++;
            if (i6 == i4) {
                i9++;
                i6 = 0;
            } else if (i6 > i4) {
                i9++;
                i6 = 1;
            }
        }
        return i6 + 1 > i4 ? i9 + 1 : i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[Catch: IOException -> 0x006c, TryCatch #0 {IOException -> 0x006c, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x0042, B:15:0x003a, B:16:0x003d, B:27:0x0047, B:29:0x004a, B:32:0x005b), top: B:1:0x0000 }] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Serializable, java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4639a d(String... strArr) {
        String str;
        try {
            h[] hVarArr = new h[strArr.length];
            e eVar = new e();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = AbstractC4640b.f38566x;
                eVar.X(34);
                int length = str2.length();
                int i4 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = str2.charAt(i6);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                        if (i4 < i6) {
                            eVar.c0(i4, i6, str2);
                        }
                        eVar.d0(str);
                        i4 = i6 + 1;
                    } else {
                        if (charAt == 8232) {
                            str = "\\u2028";
                        } else if (charAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i4 < i6) {
                        }
                        eVar.d0(str);
                        i4 = i6 + 1;
                    }
                }
                if (i4 < length) {
                    eVar.c0(i4, length, str2);
                }
                eVar.X(34);
                eVar.z();
                hVarArr[i] = eVar.B(eVar.f41924u);
            }
            return new C4639a((String[]) strArr.clone(), y8.b.e(hVarArr), 0);
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    public Object a(i iVar) {
        HashMap hashMap = (HashMap) this.f38565c;
        C5186d c5186d = (C5186d) hashMap.get(iVar);
        if (c5186d == null) {
            c5186d = new C5186d(iVar);
            hashMap.put(iVar, c5186d);
        } else {
            iVar.a();
        }
        C5186d c5186d2 = c5186d.f41818d;
        c5186d2.f41817c = c5186d.f41817c;
        c5186d.f41817c.f41818d = c5186d2;
        C5186d c5186d3 = (C5186d) this.f38564b;
        c5186d.f41818d = c5186d3;
        C5186d c5186d4 = c5186d3.f41817c;
        c5186d.f41817c = c5186d4;
        c5186d4.f41818d = c5186d;
        c5186d.f41818d.f41817c = c5186d;
        ArrayList arrayList = c5186d.f41816b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c5186d.f41816b.remove(size - 1);
        }
        return null;
    }

    public void c() {
        ((SparseIntArray) this.f38564b).clear();
    }

    public void e(i iVar, Object obj) {
        HashMap hashMap = (HashMap) this.f38565c;
        C5186d c5186d = (C5186d) hashMap.get(iVar);
        if (c5186d == null) {
            c5186d = new C5186d(iVar);
            c5186d.f41818d = c5186d;
            C5186d c5186d2 = (C5186d) this.f38564b;
            c5186d.f41818d = c5186d2.f41818d;
            c5186d.f41817c = c5186d2;
            c5186d2.f41818d = c5186d;
            c5186d.f41818d.f41817c = c5186d;
            hashMap.put(iVar, c5186d);
        } else {
            iVar.a();
        }
        if (c5186d.f41816b == null) {
            c5186d.f41816b = new ArrayList();
        }
        c5186d.f41816b.add(obj);
    }

    public Object f() {
        C5186d c5186d = (C5186d) this.f38564b;
        C5186d c5186d2 = c5186d.f41818d;
        while (true) {
            if (c5186d2.equals(c5186d)) {
                return null;
            }
            ArrayList arrayList = c5186d2.f41816b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object remove = size > 0 ? c5186d2.f41816b.remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            C5186d c5186d3 = c5186d2.f41818d;
            c5186d3.f41817c = c5186d2.f41817c;
            c5186d2.f41817c.f41818d = c5186d3;
            HashMap hashMap = (HashMap) this.f38565c;
            i iVar = c5186d2.f41815a;
            hashMap.remove(iVar);
            iVar.a();
            c5186d2 = c5186d2.f41818d;
        }
    }

    public String toString() {
        switch (this.f38563a) {
            case 4:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C5186d c5186d = (C5186d) this.f38564b;
                C5186d c5186d2 = c5186d.f41817c;
                boolean z6 = false;
                while (!c5186d2.equals(c5186d)) {
                    sb.append('{');
                    sb.append(c5186d2.f41815a);
                    sb.append(':');
                    ArrayList arrayList = c5186d2.f41816b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c5186d2 = c5186d2.f41817c;
                    z6 = true;
                }
                if (z6) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C4639a(E6.b bVar, Duration duration) {
        this.f38563a = 3;
        Duration duration2 = C4976a.f40543u;
        this.f38564b = bVar;
        this.f38565c = duration;
    }

    public C4639a(int i) {
        this.f38563a = i;
        switch (i) {
            case 4:
                this.f38564b = new C5186d(null);
                this.f38565c = new HashMap();
                break;
            default:
                this.f38564b = new SparseIntArray();
                this.f38565c = new SparseIntArray();
                break;
        }
    }
}

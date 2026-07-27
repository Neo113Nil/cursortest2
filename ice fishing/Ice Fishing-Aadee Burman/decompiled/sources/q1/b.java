package q1;

import com.bumptech.glide.manager.o;
import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f39980a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f39981b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f39982c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f39983d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39984e;

    /* renamed from: f, reason: collision with root package name */
    public o f39985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f39986g;

    public b(c cVar, String str) {
        this.f39986g = cVar;
        this.f39980a = str;
        int i = cVar.f40000z;
        this.f39981b = new long[i];
        this.f39982c = new File[i];
        this.f39983d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i6 = 0; i6 < cVar.f40000z; i6++) {
            sb.append(i6);
            File[] fileArr = this.f39982c;
            String sb2 = sb.toString();
            File file = cVar.f39994n;
            fileArr[i6] = new File(file, sb2);
            sb.append(".tmp");
            this.f39983d[i6] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j6 : this.f39981b) {
            sb.append(' ');
            sb.append(j6);
        }
        return sb.toString();
    }
}

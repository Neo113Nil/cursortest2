package q1;

import com.bumptech.glide.manager.o;
import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f39983a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f39984b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f39985c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f39986d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39987e;

    /* renamed from: f, reason: collision with root package name */
    public o f39988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f39989g;

    public b(c cVar, String str) {
        this.f39989g = cVar;
        this.f39983a = str;
        int i = cVar.f40003z;
        this.f39984b = new long[i];
        this.f39985c = new File[i];
        this.f39986d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i6 = 0; i6 < cVar.f40003z; i6++) {
            sb.append(i6);
            File[] fileArr = this.f39985c;
            String sb2 = sb.toString();
            File file = cVar.f39997n;
            fileArr[i6] = new File(file, sb2);
            sb.append(".tmp");
            this.f39986d[i6] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j6 : this.f39984b) {
            sb.append(' ');
            sb.append(j6);
        }
        return sb.toString();
    }
}

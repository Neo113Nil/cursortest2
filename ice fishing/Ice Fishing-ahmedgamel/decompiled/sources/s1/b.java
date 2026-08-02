package s1;

import com.bumptech.glide.manager.n;
import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f40282a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f40283b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f40284c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f40285d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40286e;

    /* renamed from: f, reason: collision with root package name */
    public n f40287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f40288g;

    public b(c cVar, String str) {
        this.f40288g = cVar;
        this.f40282a = str;
        int i = cVar.f40302z;
        this.f40283b = new long[i];
        this.f40284c = new File[i];
        this.f40285d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i4 = 0; i4 < cVar.f40302z; i4++) {
            sb.append(i4);
            File[] fileArr = this.f40284c;
            String sb2 = sb.toString();
            File file = cVar.f40296n;
            fileArr[i4] = new File(file, sb2);
            sb.append(".tmp");
            this.f40285d[i4] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j6 : this.f40283b) {
            sb.append(' ');
            sb.append(j6);
        }
        return sb.toString();
    }
}

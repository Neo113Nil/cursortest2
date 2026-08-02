package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d78 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public z0j g;
    public int h;
    public long i;
    public final /* synthetic */ k78 j;

    public d78(k78 k78Var, String str) {
        str.getClass();
        this.j = k78Var;
        this.a = str;
        k78Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(new File(this.j.a, sb.toString()));
            sb.append(".tmp");
            this.d.add(new File(this.j.a, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [b78] */
    public final f78 a() {
        byte[] bArr = cvt.a;
        if (!this.e) {
            return null;
        }
        k78 k78Var = this.j;
        if (!k78Var.k && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                File file = (File) this.c.get(i);
                file.getClass();
                lt1 S = fxf.S(file);
                if (!k78Var.k) {
                    this.h++;
                    S = new b78(S, k78Var, this);
                }
                arrayList.add(S);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cvt.d((n3r) it.next());
                }
                try {
                    k78Var.R(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new f78(this.j, this.a, this.i, arrayList, jArr);
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.music.shared.player.download2.exo.ChunkedRangesDataSource$ContentRangeHeaderException;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class bl4 implements db7 {
    public static final jyr i = btf.b(new uf3(29));
    public final db7 a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long f;
    public nb7 g;
    public boolean h;

    public bl4(db7 db7Var) {
        db7Var.getClass();
        this.a = db7Var;
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        this.g = nb7Var;
        d(0L);
        long j = nb7Var.g;
        if (j == -1) {
            j = this.f;
        }
        this.b = j;
        return j;
    }

    @Override // defpackage.db7
    public final Map b() {
        Map b = this.a.b();
        b.getClass();
        return b;
    }

    public final void c() {
        int i2 = this.d;
        int i3 = this.e;
        long j = this.b;
        long j2 = this.c;
        nb7 nb7Var = this.g;
        StringBuilder l = dfi.l("currentChunkBytesToRead = ", i2, i3, ", currentChunkBytesRead = ", ", bytesToRead = ");
        l.append(j);
        ouj.C(l, ", bytesRead = ", j2, ", originalDataSpec = ");
        l.append(nb7Var);
        ssg.a(7, null, l.toString(), null);
    }

    @Override // defpackage.db7
    public final void close() {
        this.a.close();
        this.h = false;
        this.d = 0;
        this.b = 0L;
        this.c = 0L;
        this.e = 0;
        this.f = 0L;
        this.g = null;
    }

    public final void d(long j) {
        nb7 nb7Var = this.g;
        if (nb7Var == null) {
            c();
            xq0.x("originalDataSpec was null");
            return;
        }
        boolean z = this.h;
        db7 db7Var = this.a;
        if (z) {
            db7Var.close();
            this.h = false;
        }
        mb7 a = nb7Var.a();
        a.f = nb7Var.f + j;
        long j2 = nb7Var.g;
        if (((int) j2) == -1) {
            j2 = Long.MAX_VALUE;
        }
        if (10485760 <= j2) {
            j2 = 10485760;
        }
        a.g = j2;
        nb7 a2 = a.a();
        this.e = 0;
        int a3 = (int) db7Var.a(a2);
        this.d = a3;
        if (a3 == -1) {
            c();
            xq0.x("Length was set by DataSpec, but upstream returned LENGTH_UNSET");
            return;
        }
        if (a3 <= 0) {
            c();
            xq0.x("Opened next data source, but its returned length was 0");
            return;
        }
        this.h = true;
        List list = (List) db7Var.b().get("content-range");
        String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
        if (str == null) {
            ssg.a(7, null, "Missing Content-Range header", null);
            c();
            throw new ChunkedRangesDataSource$ContentRangeHeaderException("Missing Content-Range header");
        }
        Regex regex = (Regex) i.getValue();
        irn irnVar = Regex.b;
        jch b = regex.b(str);
        if (b == null) {
            ssg.a(7, null, "Unknown format of Content-Range header: ".concat(str), null);
            c();
            throw new ChunkedRangesDataSource$ContentRangeHeaderException("Unknown format of Content-Range header: ".concat(str));
        }
        String str2 = (String) ((fb9) b.a()).get(1);
        this.f = Long.parseLong((String) ((fb9) b.a()).get(3)) - Long.parseLong(str2);
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        this.a.q(t6tVar);
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.d - this.e;
        if (i4 == 0) {
            long j = this.c;
            if (j == this.b || this.f == 0) {
                return -1;
            }
            d(j);
            i4 = this.d - this.e;
        }
        int read = this.a.read(bArr, i2, Math.min(i3, i4));
        if (read == -1) {
            return -1;
        }
        this.e += read;
        long j2 = read;
        this.c += j2;
        this.f -= j2;
        return read;
    }
}

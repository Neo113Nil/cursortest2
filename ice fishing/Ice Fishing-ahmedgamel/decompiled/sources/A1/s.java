package A1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s implements com.bumptech.glide.load.data.d {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f82w = {"_data"};

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f83n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f84u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f85v;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f83n = i;
        this.f84u = obj;
        this.f85v = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f83n) {
            case 0:
                return File.class;
            default:
                return ((H) this.f85v).d();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f83n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f83n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f83n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        Object wrap;
        switch (this.f83n) {
            case 0:
                Cursor query = ((Context) this.f84u).getContentResolver().query((Uri) this.f85v, f82w, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    cVar.f(new File(r0));
                    return;
                }
                cVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f85v)));
                return;
            default:
                H h3 = (H) this.f85v;
                byte[] bArr = (byte[]) this.f84u;
                switch (h3.f34n) {
                    case 1:
                        wrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        wrap = new ByteArrayInputStream(bArr);
                        break;
                }
                cVar.f(wrap);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}

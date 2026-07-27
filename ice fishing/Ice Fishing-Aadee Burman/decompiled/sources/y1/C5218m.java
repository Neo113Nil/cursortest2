package y1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* renamed from: y1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5218m implements com.bumptech.glide.load.data.d {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f41809w = {"_data"};

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41810n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f41811u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f41812v;

    public /* synthetic */ C5218m(int i, Object obj, Object obj2) {
        this.f41810n = i;
        this.f41811u = obj;
        this.f41812v = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f41810n) {
            case 0:
                return File.class;
            default:
                return ((z) this.f41812v).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i = this.f41810n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i = this.f41810n;
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        switch (this.f41810n) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, com.bumptech.glide.load.data.c cVar) {
        Object wrap;
        switch (this.f41810n) {
            case 0:
                Cursor query = ((Context) this.f41811u).getContentResolver().query((Uri) this.f41812v, f41809w, null, null, null);
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
                cVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f41812v)));
                return;
            default:
                z zVar = (z) this.f41812v;
                byte[] bArr = (byte[]) this.f41811u;
                switch (zVar.f41842n) {
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

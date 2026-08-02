package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24226n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f24227u;

    /* renamed from: v, reason: collision with root package name */
    public final ContentResolver f24228v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24229w;

    public l(ContentResolver contentResolver, Uri uri, boolean z6) {
        this.f24228v = contentResolver;
        this.f24227u = uri;
        this.f24226n = z6;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f24229w;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        try {
            Object f2 = f(this.f24228v, this.f24227u);
            this.f24229w = f2;
            cVar.f(f2);
        } catch (FileNotFoundException e9) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e9);
            }
            cVar.c(e9);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}

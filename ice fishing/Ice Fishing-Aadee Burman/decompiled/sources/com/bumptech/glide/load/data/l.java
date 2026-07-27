package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f23439n;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f23440u;

    /* renamed from: v, reason: collision with root package name */
    public final ContentResolver f23441v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23442w;

    public l(ContentResolver contentResolver, Uri uri, boolean z3) {
        this.f23441v = contentResolver;
        this.f23440u = uri;
        this.f23439n = z3;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f23442w;
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
            Object f3 = f(this.f23441v, this.f23440u);
            this.f23442w = f3;
            cVar.f(f3);
        } catch (FileNotFoundException e9) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e9);
            }
            cVar.c(e9);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}

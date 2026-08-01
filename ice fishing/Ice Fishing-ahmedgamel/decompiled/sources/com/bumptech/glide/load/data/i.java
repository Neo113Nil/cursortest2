package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: n, reason: collision with root package name */
    public final String f23429n;

    /* renamed from: u, reason: collision with root package name */
    public final AssetManager f23430u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23431v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f23432w;

    public i(AssetManager assetManager, String str, int i) {
        this.f23432w = i;
        this.f23430u = assetManager;
        this.f23429n = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f23432w) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f23431v;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f23432w) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        Object openFd;
        try {
            AssetManager assetManager = this.f23430u;
            String str = this.f23429n;
            switch (this.f23432w) {
                case 0:
                    openFd = assetManager.openFd(str);
                    break;
                default:
                    openFd = assetManager.open(str);
                    break;
            }
            this.f23431v = openFd;
            cVar.f(openFd);
        } catch (IOException e9) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e9);
            }
            cVar.c(e9);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}

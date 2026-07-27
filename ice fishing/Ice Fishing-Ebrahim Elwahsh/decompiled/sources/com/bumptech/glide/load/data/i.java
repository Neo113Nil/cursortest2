package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: n, reason: collision with root package name */
    public final String f23585n;

    /* renamed from: u, reason: collision with root package name */
    public final AssetManager f23586u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23587v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f23588w;

    public i(AssetManager assetManager, String str, int i) {
        this.f23588w = i;
        this.f23586u = assetManager;
        this.f23585n = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f23588w) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f23587v;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f23588w) {
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
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.j jVar, c cVar) {
        Object openFd;
        try {
            AssetManager assetManager = this.f23586u;
            String str = this.f23585n;
            switch (this.f23588w) {
                case 0:
                    openFd = assetManager.openFd(str);
                    break;
                default:
                    openFd = assetManager.open(str);
                    break;
            }
            this.f23587v = openFd;
            cVar.g(openFd);
        } catch (IOException e6) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
            }
            cVar.d(e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}

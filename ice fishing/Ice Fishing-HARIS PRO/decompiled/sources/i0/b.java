package i0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3273a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3275c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3276d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3277f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f3278g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f3279h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        byte[] bArr;
        this.f3273a = executor;
        this.f3274b = eVar;
        this.e = str;
        this.f3276d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = f.f3292g;
                    break;
                case 27:
                    bArr = f.f3291f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = f.f3290d;
        }
        this.f3275c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3274b.q();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f3273a.execute(new Runnable() { // from class: i0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f3274b.l(i, serializable);
            }
        });
    }
}

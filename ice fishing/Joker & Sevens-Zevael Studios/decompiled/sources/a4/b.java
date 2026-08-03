package a4;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f218a;

    /* renamed from: b, reason: collision with root package name */
    public final f f219b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f220c;

    /* renamed from: d, reason: collision with root package name */
    public final File f221d;

    /* renamed from: e, reason: collision with root package name */
    public final String f222e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f224g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f225h;

    public b(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        byte[] bArr;
        this.f218a = executor;
        this.f219b = fVar;
        this.f222e = str;
        this.f221d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            switch (i10) {
                case 26:
                    bArr = g.f242g;
                    break;
                case 27:
                    bArr = g.f241f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f240e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = g.f239d;
        }
        this.f220c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f219b.h();
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f218a.execute(new a(i10, 0, this, serializable));
    }
}

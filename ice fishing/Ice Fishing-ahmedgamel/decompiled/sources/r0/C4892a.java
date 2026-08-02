package r0;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4892a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f40107a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4894c f40108b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f40109c;

    /* renamed from: d, reason: collision with root package name */
    public final File f40110d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40111e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40112f = false;

    /* renamed from: g, reason: collision with root package name */
    public C4893b[] f40113g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40114h;

    public C4892a(AssetManager assetManager, Executor executor, InterfaceC4894c interfaceC4894c, String str, File file) {
        byte[] bArr;
        this.f40107a = executor;
        this.f40108b = interfaceC4894c;
        this.f40111e = str;
        this.f40110d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC4895d.f40130h;
                    break;
                case 26:
                    bArr = AbstractC4895d.f40129g;
                    break;
                case 27:
                    bArr = AbstractC4895d.f40128f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4895d.f40127e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC4895d.f40126d;
        }
        this.f40109c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f40108b.g();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f40107a.execute(new m(i, 2, this, serializable));
    }
}

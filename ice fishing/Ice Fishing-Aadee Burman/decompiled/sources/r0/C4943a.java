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
public final class C4943a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f40293a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4945c f40294b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f40295c;

    /* renamed from: d, reason: collision with root package name */
    public final File f40296d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40297e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40298f = false;

    /* renamed from: g, reason: collision with root package name */
    public C4944b[] f40299g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40300h;

    public C4943a(AssetManager assetManager, Executor executor, InterfaceC4945c interfaceC4945c, String str, File file) {
        byte[] bArr;
        this.f40293a = executor;
        this.f40294b = interfaceC4945c;
        this.f40297e = str;
        this.f40296d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC4946d.f40316h;
                    break;
                case 26:
                    bArr = AbstractC4946d.f40315g;
                    break;
                case 27:
                    bArr = AbstractC4946d.f40314f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4946d.f40313e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC4946d.f40312d;
        }
        this.f40295c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f40294b.j();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f40293a.execute(new m(i, 2, this, serializable));
    }
}

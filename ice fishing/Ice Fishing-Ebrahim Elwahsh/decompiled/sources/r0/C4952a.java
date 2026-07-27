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
public final class C4952a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f40198a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4954c f40199b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f40200c;

    /* renamed from: d, reason: collision with root package name */
    public final File f40201d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40202e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40203f = false;

    /* renamed from: g, reason: collision with root package name */
    public C4953b[] f40204g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40205h;

    public C4952a(AssetManager assetManager, Executor executor, InterfaceC4954c interfaceC4954c, String str, File file) {
        byte[] bArr;
        this.f40198a = executor;
        this.f40199b = interfaceC4954c;
        this.f40202e = str;
        this.f40201d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC4955d.f40221h;
                    break;
                case 26:
                    bArr = AbstractC4955d.f40220g;
                    break;
                case 27:
                    bArr = AbstractC4955d.f40219f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4955d.f40218e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC4955d.f40217d;
        }
        this.f40200c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f40199b.o();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f40198a.execute(new m(i, 2, this, serializable));
    }
}

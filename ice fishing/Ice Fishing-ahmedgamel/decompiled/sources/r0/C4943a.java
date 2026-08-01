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
    public final Executor f40296a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4945c f40297b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f40298c;

    /* renamed from: d, reason: collision with root package name */
    public final File f40299d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40301f = false;

    /* renamed from: g, reason: collision with root package name */
    public C4944b[] f40302g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f40303h;

    public C4943a(AssetManager assetManager, Executor executor, InterfaceC4945c interfaceC4945c, String str, File file) {
        byte[] bArr;
        this.f40296a = executor;
        this.f40297b = interfaceC4945c;
        this.f40300e = str;
        this.f40299d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = AbstractC4946d.f40319h;
                    break;
                case 26:
                    bArr = AbstractC4946d.f40318g;
                    break;
                case 27:
                    bArr = AbstractC4946d.f40317f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC4946d.f40316e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC4946d.f40315d;
        }
        this.f40298c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e9) {
            String message = e9.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f40297b.j();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f40296a.execute(new m(i, 2, this, serializable));
    }
}

package com.anythink.core.common.res.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.res.d;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    e f16929a;

    /* renamed from: b, reason: collision with root package name */
    a f16930b;

    /* renamed from: c, reason: collision with root package name */
    String f16931c;

    public interface a {
        void a(e eVar);

        void a(e eVar, String str);
    }

    public b(e eVar) {
        super(eVar.f17022h);
        this.f16929a = eVar;
        this.f16931c = d.a(t.b().g()).c(eVar.f17021g, o.a(eVar.f17022h));
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        a aVar = this.f16930b;
        if (aVar != null) {
            aVar.a(this.f16929a);
        }
    }

    private void a(a aVar) {
        this.f16930b = aVar;
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        if (TextUtils.isEmpty(this.f16931c)) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String a9 = d.a(t.b().g()).a(this.f16929a.f17021g);
            if (TextUtils.isEmpty(a9)) {
                return false;
            }
            File file = new File(a9);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.f16931c);
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                try {
                    th.printStackTrace();
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th4) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.v.b.d dVar) {
        com.anythink.core.common.v.b.b.a().a(dVar, 4);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        a aVar = this.f16930b;
        if (aVar != null) {
            aVar.a(this.f16929a, str2);
        }
    }
}

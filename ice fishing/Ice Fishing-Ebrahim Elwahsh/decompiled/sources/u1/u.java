package u1;

import a.AbstractC0415a;
import android.content.res.AssetManager;
import java.io.FileOutputStream;
import java.util.HashMap;
import y1.C5227b;
import y1.InterfaceC5226a;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;

/* loaded from: classes.dex */
public final class u implements InterfaceC5245t, InterfaceC5226a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f41190n;

    public /* synthetic */ u(Object obj) {
        this.f41190n = obj;
    }

    @Override // y1.InterfaceC5226a
    public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 1);
    }

    public void b(FileOutputStream stream) {
        M6.c cVar = (M6.c) this.f41190n;
        int i = cVar.f1912c;
        Y5.c cVar2 = Y5.i.f3996g;
        Integer valueOf = Integer.valueOf(i);
        cVar2.getClass();
        kotlin.jvm.internal.h.e(stream, "stream");
        u8.n nVar = new u8.n(stream, new u8.z());
        u8.e eVar = new u8.e();
        Y5.m writer = new Y5.m();
        cVar2.getClass();
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.h.e(writer, "writer");
        if (intValue >= 0) {
            int i4 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i4);
            int i9 = writer.f4021e - i4;
            writer.f4021e = i9;
            while ((intValue & (-128)) != 0) {
                writer.f4020d[i9] = (byte) ((intValue & com.anythink.expressad.video.module.a.a.f21886R) | 128);
                intValue >>>= 7;
                i9++;
            }
            writer.f4020d[i9] = (byte) intValue;
        } else {
            long j9 = intValue;
            int G7 = AbstractC0415a.G(j9);
            writer.b(G7);
            int i10 = writer.f4021e - G7;
            writer.f4021e = i10;
            while (((-128) & j9) != 0) {
                writer.f4020d[i10] = (byte) ((127 & j9) | 128);
                j9 >>>= 7;
                i10++;
            }
            writer.f4020d[i10] = (byte) j9;
        }
        writer.a();
        u8.e eVar2 = writer.f4017a;
        while (eVar2.f(8192L, eVar) != -1) {
            long j10 = eVar.f41277u;
            if (j10 == 0) {
                j10 = 0;
            } else {
                u8.s sVar = eVar.f41276n;
                kotlin.jvm.internal.h.b(sVar);
                u8.s sVar2 = sVar.f41317g;
                kotlin.jvm.internal.h.b(sVar2);
                if (sVar2.f41313c < 8192 && sVar2.f41315e) {
                    j10 -= r9 - sVar2.f41312b;
                }
            }
            if (j10 > 0) {
                nVar.N(j10, eVar);
            }
        }
        long j11 = eVar.f41277u;
        if (j11 > 0) {
            nVar.N(j11, eVar);
        }
        cVar.b(stream);
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y1.y yVar) {
        return new C5227b(0, (AssetManager) this.f41190n, this);
    }

    public u(int i) {
        switch (i) {
            case 1:
                this.f41190n = new M6.c();
                break;
            default:
                this.f41190n = new HashMap();
                new HashMap();
                break;
        }
    }
}

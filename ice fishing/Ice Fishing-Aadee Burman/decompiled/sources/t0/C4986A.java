package t0;

import android.content.res.AssetManager;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.ads.C3279h5;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.InterfaceC3225g5;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import v0.AbstractC5103a;
import y1.C5207b;
import y1.InterfaceC5206a;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;

/* renamed from: t0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4986A implements InterfaceC3225g5, v2.e, InterfaceC5224s, InterfaceC5206a {

    /* renamed from: n, reason: collision with root package name */
    public Object f40530n;

    public /* synthetic */ C4986A(Object obj) {
        this.f40530n = obj;
    }

    @Override // y1.InterfaceC5206a
    public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 0);
    }

    public void b(AbstractC5103a... migrations) {
        kotlin.jvm.internal.h.e(migrations, "migrations");
        for (AbstractC5103a abstractC5103a : migrations) {
            int i = abstractC5103a.f41355a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f40530n;
            Integer valueOf = Integer.valueOf(i);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i6 = abstractC5103a.f41356b;
            if (treeMap.containsKey(Integer.valueOf(i6))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i6)) + " with " + abstractC5103a);
            }
            treeMap.put(Integer.valueOf(i6), abstractC5103a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3225g5
    public void c(C3279h5 c3279h5) {
        ((C3467kg) this.f40530n).c(c3279h5);
    }

    @Override // v2.e
    public void d(JsonWriter jsonWriter) {
        Object obj = v2.f.f41402b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f40530n;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String d2 = v2.d.d(encodeToString, "MD5");
            if (d2 != null) {
                jsonWriter.name("bodydigest").value(d2);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    public void e(FileOutputStream stream) {
        Q6.c cVar = (Q6.c) this.f40530n;
        int i = cVar.f2660c;
        c6.c cVar2 = c6.i.f5591g;
        Integer valueOf = Integer.valueOf(i);
        cVar2.getClass();
        kotlin.jvm.internal.h.e(stream, "stream");
        y8.n nVar = new y8.n(stream, new y8.z());
        y8.e eVar = new y8.e();
        c6.m writer = new c6.m();
        cVar2.getClass();
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.h.e(writer, "writer");
        if (intValue >= 0) {
            int i6 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i6);
            int i9 = writer.f5616e - i6;
            writer.f5616e = i9;
            while ((intValue & (-128)) != 0) {
                writer.f5615d[i9] = (byte) ((intValue & com.anythink.expressad.video.module.a.a.f21728R) | 128);
                intValue >>>= 7;
                i9++;
            }
            writer.f5615d[i9] = (byte) intValue;
        } else {
            long j6 = intValue;
            int p9 = com.bumptech.glide.h.p(j6);
            writer.b(p9);
            int i10 = writer.f5616e - p9;
            writer.f5616e = i10;
            while (((-128) & j6) != 0) {
                writer.f5615d[i10] = (byte) ((127 & j6) | 128);
                j6 >>>= 7;
                i10++;
            }
            writer.f5615d[i10] = (byte) j6;
        }
        writer.a();
        y8.e eVar2 = writer.f5612a;
        while (eVar2.d(8192L, eVar) != -1) {
            long j9 = eVar.f41950u;
            if (j9 == 0) {
                j9 = 0;
            } else {
                y8.s sVar = eVar.f41949n;
                kotlin.jvm.internal.h.b(sVar);
                y8.s sVar2 = sVar.f41990g;
                kotlin.jvm.internal.h.b(sVar2);
                if (sVar2.f41986c < 8192 && sVar2.f41988e) {
                    j9 -= r9 - sVar2.f41985b;
                }
            }
            if (j9 > 0) {
                nVar.T(j9, eVar);
            }
        }
        long j10 = eVar.f41950u;
        if (j10 > 0) {
            nVar.T(j10, eVar);
        }
        cVar.b(stream);
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        return new C5207b(0, (AssetManager) this.f40530n, this);
    }

    public C4986A(int i) {
        switch (i) {
            case 5:
                this.f40530n = new HashMap();
                break;
            case 6:
                this.f40530n = null;
                break;
            case 7:
                this.f40530n = new Q6.c();
                break;
            default:
                this.f40530n = new LinkedHashMap();
                break;
        }
    }
}

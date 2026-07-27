package com.anythink.core.common.m.d.a;

import com.anythink.core.common.m.d.d;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f14733b = "b";

    /* renamed from: c, reason: collision with root package name */
    private static final int f14734c = 2;

    @Override // com.anythink.core.common.m.d.a.c
    public final synchronized void a(d dVar, d.a aVar) {
        InputStream inputStream = this.f14737a.getInputStream();
        if (a(inputStream) != 2) {
            if (aVar != null) {
                aVar.a((Object) null);
            }
            return;
        }
        inputStream.read(new byte[1], 0, 1);
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 4);
        int i = ByteBuffer.wrap(bArr).getInt();
        if (i <= 0) {
            if (aVar != null) {
                aVar.a((Object) null);
            }
            return;
        }
        byte[] bArr2 = new byte[i];
        inputStream.read(bArr2, 0, i);
        String str = new String(bArr2);
        if (aVar != null) {
            aVar.a(str);
        }
    }
}

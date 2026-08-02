package io.appmetrica.analytics.impl;

import defpackage.u75;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0602rb implements Va {
    public final R9 a = new R9();

    @NotNull
    public final C0399ka[] a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return new C0399ka[0];
        }
        Map<String, byte[]> model = this.a.toModel(bArr);
        C0399ka[] c0399kaArr = new C0399ka[model.size()];
        for (Object obj : model.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0399ka c0399ka = new C0399ka();
            c0399ka.a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c0399ka.b = (byte[]) entry.getValue();
            c0399kaArr[i] = c0399ka;
            i = i2;
        }
        return c0399kaArr;
    }
}

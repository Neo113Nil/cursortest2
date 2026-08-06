package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Nf implements InterfaceC0779to {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0028 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:7:0x0009, B:9:0x0011, B:12:0x0015, B:13:0x001c, B:15:0x0025, B:16:0x002c, B:21:0x0043, B:24:0x0028), top: B:6:0x0009 }] */
    @Override // io.appmetrica.analytics.impl.InterfaceC0779to
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(N8 n8, C0539kh c0539kh) {
        C0616ng c0616ng;
        int ordinal;
        if (!TextUtils.isEmpty(n8.f4803b)) {
            try {
                byte[] decode = Base64.decode(n8.f4803b, 0);
                if (decode != null && decode.length != 0) {
                    c0616ng = new C0616ng(decode);
                    Vf vf = new Vf();
                    String str = c0616ng.f6624a;
                    vf.f5258a = str != null ? new byte[0] : str.getBytes();
                    vf.f5260c = c0616ng.f6625b;
                    vf.f5259b = c0616ng.f6626c;
                    ordinal = c0616ng.f6627d.ordinal();
                    int i2 = 1;
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 0;
                        }
                    }
                    vf.f5261d = i2;
                    return MessageNano.toByteArray(vf);
                }
                c0616ng = null;
                Vf vf2 = new Vf();
                String str2 = c0616ng.f6624a;
                vf2.f5258a = str2 != null ? new byte[0] : str2.getBytes();
                vf2.f5260c = c0616ng.f6625b;
                vf2.f5259b = c0616ng.f6626c;
                ordinal = c0616ng.f6627d.ordinal();
                int i22 = 1;
                if (ordinal != 1) {
                }
                vf2.f5261d = i22;
                return MessageNano.toByteArray(vf2);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}

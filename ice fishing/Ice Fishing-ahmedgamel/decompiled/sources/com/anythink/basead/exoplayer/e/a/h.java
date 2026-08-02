package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7890a = "PsshAtomUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f7891a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7892b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7893c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f7891a = uuid;
            this.f7892b = i;
            this.f7893c = bArr;
        }
    }

    private h() {
    }

    private static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z6 = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z6) {
            i += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f7704Z);
        allocate.putInt(z6 ? com.anythink.basead.exoplayer.b.bc : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z6) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static int b(byte[] bArr) {
        a c9 = c(bArr);
        if (c9 == null) {
            return -1;
        }
        return c9.f7892b;
    }

    private static a c(byte[] bArr) {
        s sVar = new s(bArr);
        if (sVar.b() < 32) {
            return null;
        }
        sVar.c(0);
        if (sVar.i() != sVar.a() + 4 || sVar.i() != com.anythink.basead.exoplayer.e.a.a.f7704Z) {
            return null;
        }
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        if (a9 > 1) {
            Log.w(f7890a, "Unsupported pssh version: ".concat(String.valueOf(a9)));
            return null;
        }
        UUID uuid = new UUID(sVar.j(), sVar.j());
        if (a9 == 1) {
            sVar.d(sVar.m() * 16);
        }
        int m9 = sVar.m();
        if (m9 != sVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[m9];
        sVar.a(bArr2, 0, m9);
        return new a(uuid, a9, bArr2);
    }

    public static UUID a(byte[] bArr) {
        a c9 = c(bArr);
        if (c9 == null) {
            return null;
        }
        return c9.f7891a;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a c9 = c(bArr);
        if (c9 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c9.f7891a)) {
            return c9.f7893c;
        }
        Log.w(f7890a, "UUID mismatch. Expected: " + uuid + ", got: " + c9.f7891a + com.anythink.core.common.d.j.f13164z);
        return null;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f7704Z);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }
}

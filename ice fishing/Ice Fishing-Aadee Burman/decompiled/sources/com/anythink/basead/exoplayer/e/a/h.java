package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.k.s;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7104a = "PsshAtomUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final UUID f7105a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7106b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f7107c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f7105a = uuid;
            this.f7106b = i;
            this.f7107c = bArr;
        }
    }

    private h() {
    }

    private static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        boolean z3 = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z3) {
            i += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f6918Z);
        allocate.putInt(z3 ? com.anythink.basead.exoplayer.b.bc : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z3) {
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
        return c9.f7106b;
    }

    private static a c(byte[] bArr) {
        s sVar = new s(bArr);
        if (sVar.b() < 32) {
            return null;
        }
        sVar.c(0);
        if (sVar.i() != sVar.a() + 4 || sVar.i() != com.anythink.basead.exoplayer.e.a.a.f6918Z) {
            return null;
        }
        int a9 = com.anythink.basead.exoplayer.e.a.a.a(sVar.i());
        if (a9 > 1) {
            Log.w(f7104a, "Unsupported pssh version: ".concat(String.valueOf(a9)));
            return null;
        }
        UUID uuid = new UUID(sVar.j(), sVar.j());
        if (a9 == 1) {
            sVar.d(sVar.m() * 16);
        }
        int m4 = sVar.m();
        if (m4 != sVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[m4];
        sVar.a(bArr2, 0, m4);
        return new a(uuid, a9, bArr2);
    }

    public static UUID a(byte[] bArr) {
        a c9 = c(bArr);
        if (c9 == null) {
            return null;
        }
        return c9.f7105a;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a c9 = c(bArr);
        if (c9 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(c9.f7105a)) {
            return c9.f7107c;
        }
        Log.w(f7104a, "UUID mismatch. Expected: " + uuid + ", got: " + c9.f7105a + com.anythink.core.common.d.j.f12378z);
        return null;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(com.anythink.basead.exoplayer.e.a.a.f6918Z);
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

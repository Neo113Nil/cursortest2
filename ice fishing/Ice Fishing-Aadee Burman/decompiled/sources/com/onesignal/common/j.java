package com.onesignal.common;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j {
    private static final int SHA256_HEX_LENGTH = 64;
    public static final j INSTANCE = new j();
    private static final Q7.i SHA256_HEX_REGEX = new Q7.i("^[a-f0-9]{64}$");

    public static final class a extends kotlin.jvm.internal.i implements I7.l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        public final CharSequence invoke(byte b9) {
            return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b9)}, 1));
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    private j() {
    }

    public final String hash(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = value.getBytes(Q7.a.f2664a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        kotlin.jvm.internal.h.b(digest);
        a aVar = a.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b9 : digest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            if (aVar != null) {
                sb.append((CharSequence) aVar.invoke(Byte.valueOf(b9)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b9));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public final boolean isHashed(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        Q7.i iVar = SHA256_HEX_REGEX;
        iVar.getClass();
        return iVar.f2685n.matcher(value).matches();
    }
}

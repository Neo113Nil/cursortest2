package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0087\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig;", "", "<init>", "()V", "CONFIG", "", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$ID;", "", "INTEGER_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$INTEGER_ID;", "", "LONG_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$LONG_ID;", "", "get", "upgradeIdentifier", "set", "", "value", "getInteger", "setInteger", "getLong", "setLong", "ID", "INTEGER_ID", "LONG_ID", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 1, 0}, xi = j.f5973W)
/* renamed from: com.facebook.ads.redexgen.X.ja, reason: from Kotlin metadata */
/* loaded from: assets/audience_network/classes2.dex */
public final class MetaExoPlayerUpgradeConfig {
    public static byte[] A00;
    public static final MetaExoPlayerUpgradeConfig A01;
    public static final Map<EnumC1999jX, Boolean> A02;
    public static final Map<EnumC2000jY, Integer> A03;
    public static final Map<EnumC2001jZ, Long> A04;

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{126, 73, 93, 89, 69, 94, 73, 72, 12, 90, 77, c.f16475b, 89, 73, 12, 91, 77, 95, 12, 66, 89, c.f16475b, c.f16475b, 2, 39, 34, 53, 32, 51, 54, 55, 27, 54, 55, 60, 38, 59, 52, 59, 55, 32};
    }

    static {
        A02();
        A01 = new MetaExoPlayerUpgradeConfig();
        A02 = new EnumMap(EnumC1999jX.class);
        A03 = new EnumMap(EnumC2000jY.class);
        A04 = new EnumMap(EnumC2001jZ.class);
        for (EnumC1999jX enumC1999jX : EnumC1999jX.valuesCustom()) {
            A02.put(enumC1999jX, false);
        }
        for (EnumC2000jY enumC2000jY : EnumC2000jY.valuesCustom()) {
            A03.put(enumC2000jY, -1);
        }
        for (EnumC2001jZ id : EnumC2001jZ.values()) {
            A04.put(id, -1L);
        }
        A02.put(EnumC1999jX.A0W, true);
        A02.put(EnumC1999jX.A0Q, true);
        A02.put(EnumC1999jX.A1j, true);
        A03.put(EnumC2000jY.A05, 100);
    }

    @JvmStatic
    public static final int A00(EnumC2000jY enumC2000jY) {
        C2413qY.A09(enumC2000jY, A01(24, 17, 40));
        Integer num = A03.get(enumC2000jY);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(A01(0, 24, 86).toString());
    }

    @JvmStatic
    public static final boolean A03(EnumC1999jX enumC1999jX) {
        C2413qY.A09(enumC1999jX, A01(24, 17, 40));
        return C2413qY.A0C(true, A02.get(enumC1999jX));
    }
}

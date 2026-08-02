package defpackage;

import android.graphics.Color;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes7.dex */
public final class sb71 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public sb71(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static boolean a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            nba1.b("Failed to parse boolean value: '" + str + "'", e);
            nba1.e();
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (parseLong > _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(aka1.e(((parseLong >> 24) & 255) ^ 255), aka1.e(parseLong & 255), aka1.e((parseLong >> 8) & 255), aka1.e((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            nba1.b("Failed to parse color expression: '" + str + "'", e);
            nba1.e();
            return null;
        }
    }
}

package com.google.android.gms.internal.measurement;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public enum zzyz {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);

    public static final zzyz[] zzk = new zzyz[26];
    public final char zzl;
    public final int zzm;
    public final int zzn;
    public final String zzo;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    static {
        /*
            com.google.android.gms.internal.measurement.zzyz r0 = new com.google.android.gms.internal.measurement.zzyz
            r3 = 115(0x73, float:1.61E-43)
            r6 = 1
            java.lang.String r1 = "STRING"
            r2 = 0
            r4 = 1
            java.lang.String r5 = "-#"
            r0.<init>(r3, r4, r5, r6)
            com.google.android.gms.internal.measurement.zzyz r1 = new com.google.android.gms.internal.measurement.zzyz
            r4 = 98
            r7 = 1
            java.lang.String r2 = "BOOLEAN"
            r3 = 1
            r5 = 2
            java.lang.String r6 = "-"
            r1.<init>(r4, r5, r6, r7)
            com.google.android.gms.internal.measurement.zzyz r2 = new com.google.android.gms.internal.measurement.zzyz
            r5 = 99
            r8 = 1
            java.lang.String r3 = "CHAR"
            r4 = 2
            r6 = 3
            java.lang.String r7 = "-"
            r2.<init>(r5, r6, r7, r8)
            com.google.android.gms.internal.measurement.zzyz r3 = new com.google.android.gms.internal.measurement.zzyz
            r6 = 100
            r9 = 0
            java.lang.String r4 = "DECIMAL"
            r5 = 3
            r14 = 4
            java.lang.String r8 = "-0+ ,("
            r7 = r14
            r3.<init>(r6, r7, r8, r9)
            com.google.android.gms.internal.measurement.zzyz r4 = new com.google.android.gms.internal.measurement.zzyz
            r13 = 111(0x6f, float:1.56E-43)
            r16 = 0
            java.lang.String r11 = "OCTAL"
            r12 = 4
            java.lang.String r15 = "-#0("
            r10 = r4
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.zzyz r5 = new com.google.android.gms.internal.measurement.zzyz
            r13 = 120(0x78, float:1.68E-43)
            r16 = 1
            java.lang.String r11 = "HEX"
            r12 = 5
            java.lang.String r15 = "-#0("
            r10 = r5
            r10.<init>(r13, r14, r15, r16)
            com.google.android.gms.internal.measurement.zzyz.HEX = r5
            com.google.android.gms.internal.measurement.zzyz r6 = new com.google.android.gms.internal.measurement.zzyz
            r9 = 102(0x66, float:1.43E-43)
            r12 = 0
            java.lang.String r7 = "FLOAT"
            r8 = 6
            r17 = 5
            java.lang.String r11 = "-#0+ ,("
            r10 = r17
            r6.<init>(r9, r10, r11, r12)
            com.google.android.gms.internal.measurement.zzyz r7 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 101(0x65, float:1.42E-43)
            r19 = 1
            java.lang.String r14 = "EXPONENT"
            r15 = 7
            java.lang.String r18 = "-#0+ ("
            r13 = r7
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz r8 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 103(0x67, float:1.44E-43)
            java.lang.String r14 = "GENERAL"
            r15 = 8
            java.lang.String r18 = "-0+ ,("
            r13 = r8
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz r9 = new com.google.android.gms.internal.measurement.zzyz
            r16 = 97
            java.lang.String r14 = "EXPONENT_HEX"
            r15 = 9
            java.lang.String r18 = "-#0+ "
            r13 = r9
            r13.<init>(r16, r17, r18, r19)
            com.google.android.gms.internal.measurement.zzyz[] r0 = new com.google.android.gms.internal.measurement.zzyz[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            com.google.android.gms.internal.measurement.zzyz.zzp = r0
            r0 = 26
            com.google.android.gms.internal.measurement.zzyz[] r0 = new com.google.android.gms.internal.measurement.zzyz[r0]
            com.google.android.gms.internal.measurement.zzyz.zzk = r0
            com.google.android.gms.internal.measurement.zzyz[] r0 = values()
            int r1 = r0.length
            r2 = 0
        La7:
            if (r2 >= r1) goto Lb8
            r3 = r0[r2]
            char r4 = r3.zzl
            r4 = r4 | 32
            int r4 = r4 + (-97)
            com.google.android.gms.internal.measurement.zzyz[] r5 = com.google.android.gms.internal.measurement.zzyz.zzk
            r5[r4] = r3
            int r2 = r2 + 1
            goto La7
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzyz.<clinit>():void");
    }

    zzyz(char c, int i, String str, boolean z) {
        this.zzl = c;
        this.zzm = i;
        zzza zzzaVar = zzza.zzb;
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int charAt = ((int) ((zzza.zza >>> ((str.charAt(i3) - ' ') * 3)) & 7)) - 1;
            if (charAt < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("invalid flags: ".concat(str));
                throw null;
            }
            i2 |= 1 << charAt;
        }
        this.zzn = i2;
        this.zzo = CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder(String.valueOf(c).length() + 1), "%", c);
    }
}

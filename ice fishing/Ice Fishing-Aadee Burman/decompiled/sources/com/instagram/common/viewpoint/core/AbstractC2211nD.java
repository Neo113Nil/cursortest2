package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2211nD extends AbstractC0889Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0881Eo A00;

    public abstract Pair<C07227s[], InterfaceC2212nE[]> A0d(C0881Eo c0881Eo, int[][][] iArr, int[] iArr2, C2248no c2248no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC07197p[] interfaceC07197pArr, C2363pg c2363pg, int[] iArr, boolean z3) throws AD {
        int length = interfaceC07197pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i6 = 0; i6 < bestRendererIndex; i6++) {
            InterfaceC07197p interfaceC07197p = interfaceC07197pArr[i6];
            int i9 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC07197p.AKM(c2363pg.A08(bestFormatSupportLevel));
                i9 = Math.max(i9, AbstractC07127i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i6];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i9 > formatSupportLevel || (i9 == formatSupportLevel && z3 && i == 0 && bestRendererIndex3 != 0)) {
                length = i6;
                formatSupportLevel = i9;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC07197p interfaceC07197p, C2363pg c2363pg) throws AD {
        int[] iArr = new int[c2363pg.A01];
        for (int i = 0; i < c2363pg.A01; i++) {
            iArr[i] = interfaceC07197p.AKM(c2363pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC07197p[] interfaceC07197pArr) throws AD {
        int[] iArr = new int[interfaceC07197pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC07197pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i6 = str.charAt(23);
            if (i6 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Ew
    public final C0890Ex A0b(InterfaceC07197p[] interfaceC07197pArr, C2230nW c2230nW, C2248no c2248no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC07197pArr.length + 1];
        C2363pg[][] c2363pgArr = new C2363pg[interfaceC07197pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC07197pArr.length + 1][][];
        for (int i = 0; i < c2363pgArr.length; i++) {
            c2363pgArr[i] = new C2363pg[c2230nW.A01];
            iArr2[i] = new int[c2230nW.A01][];
        }
        int[] A0a = A0a(interfaceC07197pArr);
        for (int i6 = 0; i6 < c2230nW.A01; i6++) {
            C2363pg A05 = c2230nW.A05(i6);
            int groupIndex = A0Y(interfaceC07197pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC07197pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC07197pArr[groupIndex], A05);
            }
            int i9 = iArr[groupIndex];
            c2363pgArr[groupIndex][i9] = A05;
            iArr2[groupIndex][i9] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2230nW[] c2230nWArr = new C2230nW[interfaceC07197pArr.length];
        String[] strArr = new String[interfaceC07197pArr.length];
        int[] iArr3 = new int[interfaceC07197pArr.length];
        int i10 = 0;
        while (true) {
            int length = interfaceC07197pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i10 < length) {
                int i11 = iArr[i10];
                c2230nWArr[i10] = new C2230nW((C2363pg[]) C5C.A1I(c2363pgArr[i10], i11));
                iArr2[i10] = (int[][]) C5C.A1I(iArr2[i10], i11);
                strArr[i10] = interfaceC07197pArr[i10].getName();
                iArr3[i10] = interfaceC07197pArr[i10].A9N();
                i10++;
            } else {
                C0881Eo c0881Eo = new C0881Eo(strArr, iArr3, c2230nWArr, A0a, iArr2, new C2230nW((C2363pg[]) C5C.A1I(c2363pgArr[interfaceC07197pArr.length], iArr[interfaceC07197pArr.length])));
                Pair<C07227s[], InterfaceC2212nE[]> A0d = A0d(c0881Eo, iArr2, A0a, c2248no, timeline);
                return new C0890Ex((C07227s[]) A0d.first, (InterfaceC2212nE[]) A0d.second, AbstractC0886Et.A00(c0881Eo, (InterfaceC0883Eq[]) A0d.second), c0881Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0889Ew
    public final void A0c(Object obj) {
        this.A00 = (C0881Eo) obj;
    }
}

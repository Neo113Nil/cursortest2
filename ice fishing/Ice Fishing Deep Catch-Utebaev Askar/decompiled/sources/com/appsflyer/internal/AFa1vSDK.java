package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFa1vSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFInAppEventParameterName;
    private static Object AFLogger;
    private static long afInfoLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static byte[] f61d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f62e;
    private static long force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte f63i;
    public static final Map registerClient;
    private static Object unregisterClient;
    private static long w;

    /* JADX WARN: Code duplicated, block: B:18:0x0120  */
    /* JADX WARN: Code duplicated, block: B:20:0x0126  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0126 -> B:21:0x012e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    private static java.lang.String $$c(short r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.$$c(short, int, int):java.lang.String");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], boolean], vars: [r14v5 boolean[], r14v125 ??, r14v111 ??, r28v15 ??, r28v20 ??, r28v17 ??, r28v32 ??, r28v39 ??, r28v40 ??, r28v41 ??, r28v42 ??, r28v43 ??, r28v33 ??, r28v36 ??, r28v31 ??, r28v30 ??, r28v46 ??, r28v47 ??, r28v37 ??, r28v16 boolean[], r28v44 ??, r28v18 ??, r28v45 ??, r28v38 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:676)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    static {
        /*
            Method dump skipped, instruction units count: 8994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static int getMediationNetwork(int i2) throws Throwable {
        int i3 = $10;
        int i4 = i3 + 87;
        $11 = i4 % 128;
        if ((i4 % 2 == 0 ? '<' : '*') != '*') {
            throw null;
        }
        Object obj = unregisterClient;
        int i5 = (i3 & 103) + (i3 | 103);
        $11 = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            byte b2 = bArr[26];
            byte b3 = bArr[146];
            int iIntValue = ((Integer) Class.forName($$c(b2, b3, (short) ((b3 ^ 592) | (b3 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[182], bArr[5]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i7 = $10;
            int i8 = (i7 ^ 57) + ((i7 & 57) << 1);
            $11 = i8 % 128;
            if (!(i8 % 2 == 0)) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getMonetizationNetwork(Object obj) throws Throwable {
        int i2 = $10 + 9;
        int i3 = i2 % 128;
        $11 = i3;
        int i4 = i2 % 2;
        Object obj2 = unregisterClient;
        int i5 = (i3 & 23) + (i3 | 23);
        $10 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = ((i3 | 43) << 1) - (i3 ^ 43);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            byte[] bArr = $$a;
            byte b2 = bArr[26];
            byte b3 = bArr[146];
            return ((Integer) Class.forName($$c(b2, b3, (short) ((b3 ^ 592) | (b3 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[8], bArr[940]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getRevenue(int i2, int i3, char c2) throws Throwable {
        int i4 = ($10 + 24) - 1;
        int i5 = i4 % 128;
        $11 = i5;
        if (!(i4 % 2 != 0)) {
            throw null;
        }
        Object obj = unregisterClient;
        int i6 = i5 + 71;
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        int i9 = (i7 + 4) - 1;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c2)};
            byte[] bArr = $$a;
            byte b2 = bArr[26];
            byte b3 = bArr[146];
            Class<?> cls = Class.forName($$c(b2, b3, (short) (b3 | 592)), true, (ClassLoader) AFLogger);
            String str$$c = $$c(bArr[50], bArr[4], bArr[105]);
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i11 = $11;
            int i12 = (i11 ^ 53) + ((i11 & 53) << 1);
            $10 = i12 % 128;
            if ((i12 % 2 != 0 ? '^' : (char) 17) != '^') {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2 = $11 + 119;
        $10 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[1140];
        System.arraycopy("\u0019N¹&\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒKÛó\t\n\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001\u0000\u0011Ô%\u0005û\u0010Ó'\u000b\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\u0000\u0011Ñ \u0004\u0007ÿá'\u000b7ÿ\u0015ïÐ7ÿ\u0015ïÐù\u0017íÏ=\bÁ\u001a%\u0005ûù\u0017íÏ=\bÁHû\u0005ö\u0007\u000bù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿ\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ó\t\u0016ì\u0007\b\u0000\u000fë\u001dù\róí\bì\nù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u000b\u0005\u0006ôí\u0005ï\n4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ4Î\u0000\u0011à\u0015\u0010þ\bÿó\u0004ù\u0017íÏBù\u0011¼)ÿü\u0000\u0011Þ\u0013\u0015öù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000eõþ\u0005ä1ù\u0002\u000fù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0013\u0002ñ\u001aì\u000e\u0003\u000b\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007'ÈEáó\t\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001dÒKÛó\t\n\u0002\u0000\u0011Ñ4ÿ\u0002õ\u000b÷\u0018Ò,þÇ\u0000\u0001\b\u000e.÷\u0003ú\u0000\tõþ\u0005ô\u0011à\u0015þ\u0005í!\u0000\u000fí\u0006î\nýù\ró\u0000\u0011Ô\u0000ù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005\b÷÷ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u0005ô\u0005â#\u0015\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u0003\tû\u0011ó\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\tÛ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ü\u0019\u0015þÓ+\b\u0000\tù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\t×+\b\u0000\t\u0000\u0011á\u0018\u0013íù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000eýÕ9ýóÞ3\u0002ñ\u001aù\u0017íÏ=\bÁ\u0017+\u0005\u0006ôþ\u0003\fûÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000fù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000fýñ\u0011ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fó\u0015öæ\u001f\f\u0003õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u0000\u0011Ñ.\u0000\u0005\u0001\u0001ù\u000b\bâ'ù÷í\nê\n\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒGßó\tÛQ4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ5Íí\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·\u0000\u0011Û$\u0001ù\u0011÷\u0013é\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011Û\u001a\u0001\u0007ú\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011à\u0015\u0013ñ\u000b\tò".getBytes("ISO-8859-1"), 0, bArr, 0, 1140);
        $$a = bArr;
        $$b = 166;
        int i4 = $11;
        int i5 = (i4 & 31) + (i4 | 31);
        $10 = i5 % 128;
        int i6 = i5 % 2;
    }
}

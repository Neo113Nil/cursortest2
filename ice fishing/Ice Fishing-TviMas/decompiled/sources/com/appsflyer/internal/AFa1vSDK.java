package com.appsflyer.internal;

import android.graphics.Color;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes4.dex */
public class AFa1vSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Map AFInAppEventParameterName;
    private static Object AFLogger;
    private static long afInfoLog;
    private static byte[] d;
    private static byte[] e;
    private static long force;
    private static byte i;
    public static final Map registerClient;
    private static Object unregisterClient;
    private static long w;

    private static String $$c(short s, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $11 + 119;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        int i8 = -s;
        int i9 = (i8 * 881) + 104839;
        int i10 = ~i8;
        int i11 = ~(i10 | (-120));
        int i12 = ~(i10 | i2);
        int i13 = (i12 & i11) | (i11 ^ i12);
        int i14 = ~(((-120) & i2) | ((-120) ^ i2));
        int i15 = -(-(((i13 & i14) | (i13 ^ i14)) * (-880)));
        int i16 = (i9 ^ i15) + ((i9 & i15) << 1);
        int i17 = ~i8;
        int i18 = ~i2;
        int i19 = ~(i17 | i18);
        int i20 = ~((i8 & i2) | (i8 ^ i2));
        int i21 = i16 + (((i19 & 119) | (i19 ^ 119) | i20) * (-880));
        int i22 = i20 * 880;
        int i23 = (i21 & i22) + (i22 | i21);
        int i24 = -i3;
        int i25 = i24 * 399;
        int i26 = (i25 ^ 450870) + ((i25 & 450870) << 1);
        int i27 = ~i24;
        int i28 = (~((i27 & 1130) | (i27 ^ 1130))) | (~(((-1131) ^ i24) | ((-1131) & i24)));
        int i29 = ~(((-1131) ^ i2) | ((-1131) & i2));
        int i30 = (((i26 - (~(((i28 & i29) | (i28 ^ i29)) * 398))) - 1) - (~((i24 | 1130) * (-1194)))) - 1;
        int i31 = ~((-1131) | i18);
        int i32 = ~i24;
        int i33 = i31 | (~((i32 & 1130) | (i32 ^ 1130)));
        int i34 = ~((i24 & (-1131)) | ((-1131) ^ i24));
        int i35 = -(-(((i34 & i33) | (i33 ^ i34)) * 398));
        int i36 = (i30 & i35) + (i35 | i30);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[36 - i2];
        int i37 = 35 - i2;
        int i38 = -1;
        if (bArr == null) {
            int i39 = ((i6 | 83) << 1) - (i6 ^ 83);
            $11 = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 22 / 0;
            }
            int i41 = ((i6 | 123) << 1) - (i6 ^ 123);
            $11 = i41 % 128;
            int i42 = i41 % 2;
            int i43 = i37 * 71;
            int i44 = i36 * (-69);
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            int i46 = ~i37;
            int i47 = (i46 & i36) | (i46 ^ i36);
            int i48 = ~i47;
            int i49 = ~(i36 | i2);
            int i50 = -(-(((i48 & i49) | (i48 ^ i49)) * (-140)));
            int i51 = (i45 & i50) + (i50 | i45);
            int i52 = i37 | i36;
            int i53 = i51 + ((~((i52 & i2) | (i52 ^ i2))) * 70);
            int i54 = ((~(i37 | i2)) | (~((~i36) | i37)) | (~i47)) * 70;
            i23 = ((i53 ^ i54) + ((i54 & i53) << 1)) - 2;
            int i55 = $11 + 77;
            $10 = i55 % 128;
            int i56 = i55 % 2;
            i36 = i36;
        }
        while (true) {
            int i57 = ((i38 | (-8)) << 1) - (i38 ^ (-8));
            i38 = (i57 ^ 9) + ((i57 & 9) << 1);
            bArr2[i38] = (byte) i23;
            int i58 = (i36 & 1) + (i36 | 1);
            if (i38 == i37) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i58];
            int i59 = b * 71;
            int i60 = i23 * (-69);
            int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
            int i62 = ~b;
            int i63 = (i62 & i23) | (i62 ^ i23);
            int i64 = ~i63;
            int i65 = ~(i23 | i2);
            int i66 = -(-(((i64 & i65) | (i64 ^ i65)) * (-140)));
            int i67 = (i61 & i66) + (i66 | i61);
            int i68 = b | i23;
            int i69 = i67 + ((~((i68 & i2) | (i68 ^ i2))) * 70);
            int i70 = ((~(b | i2)) | (~((~i23) | b)) | (~i63)) * 70;
            i23 = ((i69 ^ i70) + ((i70 & i69) << 1)) - 2;
            int i71 = $11 + 77;
            $10 = i71 % 128;
            int i72 = i71 % 2;
            i36 = i58;
        }
    }

    static void init$0() {
        int i2 = 2 % 2;
        int i3 = $11 + 119;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = new byte[1140];
        System.arraycopy("\u0019N¹&\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒKÛó\t\n\u0002\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f\u000fø\u0010ÿüýÌ5\u0011\u0002À\u0015$\u0013÷\u000fõ\r\u0007Ý\u0016\fõþ\u0005\u0014ÿ\u0002õ\u000b\bÏ1\u0002þÿü\u0000\u0015÷\b\u0001\u000fø\u0010ÿüýÌ5\u0011\u0002À\u00151\u0002Ù'\u0005õ\u0001\r\t\u0000\u0011×'ý\r÷ú\r×1\u0002þÿü\u0000\u0015÷\b\u0001\u0000\u0011Ô%\u0005û\u0010Ó'\u000b\u0000\u0011Ñ.÷\u0003à \u0004\u0007ÿá'\u000b\u0000\u0011Ñ \u0004\u0007ÿá'\u000b7ÿ\u0015ïÐ7ÿ\u0015ïÐù\u0017íÏ=\bÁ\u001a%\u0005ûù\u0017íÏ=\bÁHû\u0005ö\u0007\u000bù\u0017íÏ@÷\u000fûÉ'(ü\u0003ó\n\u0000\u0011Þ$ÿ\u0003÷\u000f\u0004\u0007\u000e÷\u0003ü\u0006\u0000\u0004\u0007ÿ\u000fø\u0010ÿüýÌC\u0006½\u00165ö\u0005úÂ4ñ\u000f\u0003ø\b\u0001ó\t\u0016ì\u0007\b\u0000\u000fë\u001dù\róí\bì\nù\u0017íÏ=\bÁ\u001d\bø5í\u0004\r\u0006÷\b\u0001\u0014ÿ\u0002õ\u000b\bâ\u0017\u0006úê\u001e\u0005\u0002ÿ\fù\u0017íÏ=\bÁ\u001a%\u0005ûì(\u0001þ\u0007\u0001á#\u0000õþ\u000e\u000b\u0005\u0006ôí\u0005ï\n4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ4Î\u0000\u0011à\u0015\u0010þ\bÿó\u0004ù\u0017íÏBù\u0011¼)ÿü\u0000\u0011Þ\u0013\u0015öù\u0017íÏ=\bÁ\u00165ó\u0002\u0001\u000fõ\u0001ç'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u001d'\u0004\u0007\u0001á#\u0000õþ\u000eù\u0017íÏ=\bÁ\u0018\u001f\u0015ïê'\u0004\u0007\u0001á#\u0000õþ\u000eõþ\u0005ä1ù\u0002\u000fù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aÒ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0013\u0002ñ\u001aì\u000e\u0003\u000b\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007'ÈEáó\t\u000e\u0000Ã5\u0011\u0002\u0005õ\b\u000fî\u000f¾=\u0007\bó\u000fþõ\rÄ\u0015\u0007\u001dÒKÛó\t\n\u0002\u0000\u0011Ñ4ÿ\u0002õ\u000b÷\u0018Ò,þÇ\u0000\u0001\b\u000e.÷\u0003ú\u0000\tõþ\u0005ô\u0011à\u0015þ\u0005í!\u0000\u000fí\u0006î\nýù\ró\u0000\u0011Ô\u0000ù\u0017íÏ=\bÁ\u001a%\u0005ûá#\u0010ò\u0011ù\t\u0006ý\u0005\b÷÷ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0018#\u0015Ð%\u0005û\u0005ô\u0005â#\u0015\u0000\u0011Ï#\u0013þÿ\u000b\u0001óí\u0013\u0015ö\u0003\tû\u0011ó\u0000\u0011Ñ+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\tÛ'\u0004\u0007\u0001á#\u0000õþ\u000e\u0000\u0011Ü\u0019\u0015þÓ+\b\u0000\tù\u0017íÏI\u0001÷\u0005ÄNñ\tÀ.\u0011\t×+\b\u0000\t\u0000\u0011á\u0018\u0013íù\u0017íÏ=\bÁ\u00169ýóÞ3\u0002ñ\u001aØ(\u0001þ\u0007\u0001á#\u0000õþ\u000eýÕ9ýóÞ3\u0002ñ\u001aù\u0017íÏ=\bÁ\u0017+\u0005\u0006ôþ\u0003\fûÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u001d'á\u001a\n\u0004\u0005\tÍ#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fù\u0017íÏBý\bÁ\u00169ýóß5ó\u0002\u0001\u000fù\u0017íÏ@÷\u000fûÉ\u0017+÷\u0014\u0002Û%ô\u0005\u0003\u000fýñ\u0011ÿ\r\fõ\u0004ÅG\bü\u0003ó\nÃ\u0016!\u0014ôá#\u0015Í+÷\u0014\u0002Û%ô\u0005\u0003\u000fó\u0015öæ\u001f\f\u0003õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÍ'\u000bõ\u0000\u0013ý\u0005ùþ\u0010õ\u0015÷\u000fñé\u001fû\u0012ñ\u0013\tÙ\u0013\u0015öß)û\nú\u000b\b\u0001\u0000\u0011Ñ.\u0000\u0005\u0001\u0001ù\u000b\bâ'ù÷í\nê\n\u0005ô\u0005á+÷\u0014\u0002\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ\u0014\u0007\u001dÒGßó\tÛQ4\u0014\u0002ô\u0011\u0001¾6\u000e\u0000Ä4\u0011\u0002\u0005õ\b\u000fî\u000f¿<\u0007\bó\u000fþõ\rÅ5Íí\të\nH\u0003³Hý\r\u0002ø\u0001\u0004\n\n¯Nû\u0003\u0010·\u0000\u0011Û$\u0001ù\u0011÷\u0013é\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011Û\u001a\u0001\u0007ú\u0015÷\b\u0001â\u0019\u0011\u0005ú\u0005û\u0000\u0011à\u0015\u0013ñ\u000b\tò".getBytes("ISO-8859-1"), 0, bArr, 0, 1140);
        $$a = bArr;
        $$b = 166;
        int i5 = $11;
        int i6 = (i5 & 31) + (i5 | 31);
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:976|977|(32:972|973|(0)|17|18|(0)|967|25|(0)|46|(0)(0)|(0)|73|74|75|76|77|(0)(0)|80|(0)|943|85|86|(0)(0)|89|(0)(0)|92|93|94|(0)|937|938)|15|(0)|17|18|(0)|967|25|(0)|46|(0)(0)|(0)|73|74|75|76|77|(0)(0)|80|(0)|943|85|86|(0)(0)|89|(0)(0)|92|93|94|(0)|937|938) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04f3, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r14, r10, (short) ((r10 ^ 932) | (r10 & 932)))).getMethod($$c(r12[26], (byte) (-r12[466(0x1d2, float:6.53E-43)]), (short) 869), null).invoke(r15, null)).booleanValue() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01a8, code lost:
    
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x1a51, code lost:
    
        r2 = r42.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r2.setAccessible(true);
        com.appsflyer.internal.AFa1vSDK.unregisterClient = r2.newInstance(r3, java.lang.Boolean.valueOf(!r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x1a7b, code lost:
    
        r39.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x1a7e, code lost:
    
        r3 = 24;
        r6 = 2;
        r9 = false;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x1a8b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x1a8c, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x0484, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x1d5b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0497 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x18ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1a51 A[EDGE_INSN: B:391:0x1a51->B:392:0x1a51 BREAK  A[LOOP:1: B:165:0x0bd1->B:346:0x1a08], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x1c51  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x1bc1 A[Catch: all -> 0x1bf6, TryCatch #82 {all -> 0x1bf6, blocks: (B:272:0x1ac7, B:281:0x1b26, B:283:0x1b2c, B:284:0x1b2d, B:479:0x1b31, B:481:0x1b3e, B:482:0x1b3f, B:485:0x1b41, B:487:0x1b4e, B:488:0x1b4f, B:506:0x1b5f, B:508:0x1b6c, B:509:0x1b6d, B:672:0x1b82, B:674:0x1b89, B:675:0x1b8a, B:709:0x1b93, B:711:0x1ba2, B:712:0x1ba3, B:717:0x1bba, B:719:0x1bc1, B:720:0x1bc2, B:729:0x1bc4, B:731:0x1bd2, B:732:0x1bd3, B:735:0x1bd5, B:737:0x1be3, B:738:0x1be4, B:741:0x1be6, B:743:0x1bf4, B:744:0x1bf5, B:275:0x1af2, B:276:0x1b23, B:247:0x1658, B:243:0x15ec, B:211:0x1452, B:190:0x0cb6, B:152:0x0b6d, B:150:0x0b34, B:148:0x0afb), top: B:246:0x1658, inners: #2, #9, #16, #27, #49, #70, #73, #76 }] */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1bc2 A[Catch: all -> 0x1bf6, TryCatch #82 {all -> 0x1bf6, blocks: (B:272:0x1ac7, B:281:0x1b26, B:283:0x1b2c, B:284:0x1b2d, B:479:0x1b31, B:481:0x1b3e, B:482:0x1b3f, B:485:0x1b41, B:487:0x1b4e, B:488:0x1b4f, B:506:0x1b5f, B:508:0x1b6c, B:509:0x1b6d, B:672:0x1b82, B:674:0x1b89, B:675:0x1b8a, B:709:0x1b93, B:711:0x1ba2, B:712:0x1ba3, B:717:0x1bba, B:719:0x1bc1, B:720:0x1bc2, B:729:0x1bc4, B:731:0x1bd2, B:732:0x1bd3, B:735:0x1bd5, B:737:0x1be3, B:738:0x1be4, B:741:0x1be6, B:743:0x1bf4, B:744:0x1bf5, B:275:0x1af2, B:276:0x1b23, B:247:0x1658, B:243:0x15ec, B:211:0x1452, B:190:0x0cb6, B:152:0x0b6d, B:150:0x0b34, B:148:0x0afb), top: B:246:0x1658, inners: #2, #9, #16, #27, #49, #70, #73, #76 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:940:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:941:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:944:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x02de A[Catch: Exception -> 0x1db5, TRY_ENTER, TRY_LEAVE, TryCatch #32 {Exception -> 0x1db5, blocks: (B:7:0x0142, B:9:0x015d, B:32:0x028d, B:37:0x0291, B:42:0x1dac, B:44:0x1db3, B:45:0x1db4, B:54:0x0363, B:61:0x03bb, B:63:0x03c1, B:64:0x03c2, B:67:0x03c4, B:68:0x03c7, B:73:0x03cb, B:76:0x041f, B:86:0x0468, B:89:0x0475, B:92:0x047e, B:99:0x0493, B:404:0x1cdc, B:409:0x1cf4, B:104:0x1d77, B:411:0x1cfe, B:413:0x1d01, B:419:0x1d05, B:427:0x1d53, B:429:0x1d59, B:430:0x1d5a, B:947:0x02de, B:954:0x1d98, B:956:0x1d9f, B:957:0x1da0, B:960:0x1da2, B:962:0x1da9, B:963:0x1daa, B:422:0x1d1c, B:423:0x1d50, B:951:0x0321, B:949:0x02ef, B:39:0x02b3, B:57:0x0378), top: B:6:0x0142, inners: #22, #51, #55, #64, #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:968:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v127, types: [int, short] */
    /* JADX WARN: Type inference failed for: r14v129 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v143 */
    /* JADX WARN: Type inference failed for: r14v152, types: [int] */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v164 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v190 */
    /* JADX WARN: Type inference failed for: r14v191 */
    /* JADX WARN: Type inference failed for: r14v195 */
    /* JADX WARN: Type inference failed for: r14v196 */
    /* JADX WARN: Type inference failed for: r14v198 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v47, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r7v134, types: [java.lang.Class] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        String $$c;
        String $$c2;
        boolean z;
        Object obj;
        Object invoke;
        Object invoke2;
        Object obj2;
        char c;
        char c2;
        Object[] objArr;
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        int i2;
        boolean z2;
        int i3;
        boolean[] zArr4;
        String str;
        boolean[] zArr5;
        boolean z3;
        Object[] objArr2;
        int i4;
        int i5;
        boolean[] zArr6;
        Object obj3;
        int i6;
        char c3;
        int i7;
        boolean z4;
        boolean z5;
        Object obj4;
        boolean z6;
        Random random;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i8;
        String sb;
        int i9;
        int i10;
        byte[] bArr;
        String $$c3;
        short s;
        ZipFile zipFile;
        ZipFile zipFile2;
        Throwable th;
        ZipFile zipFile3;
        Throwable cause;
        Object newInstance;
        char c4;
        ZipFile zipFile4;
        int i11;
        Object obj13;
        Object obj14;
        Exception exc;
        Throwable th2;
        int i12;
        String str2;
        Object invoke3;
        short s2;
        short s3;
        Object obj15;
        ZipFile zipFile5;
        boolean z7;
        byte[] bArr2;
        Class<?> cls;
        Method declaredMethod;
        int i13;
        byte[] bArr3;
        byte[] bArr4;
        Object invoke4;
        short s4;
        Constructor<?> declaredConstructor;
        ZipFile zipFile6;
        Exception exc2;
        int i14;
        int i15;
        boolean z8;
        boolean z9;
        char c5;
        Method method;
        init$0();
        int green = Color.green(102);
        int i16 = ~(((-900596877) & green) | ((-900596877) ^ green));
        int i17 = (i16 & 539493384) | (539493384 ^ i16);
        int i18 = ~((1434960549 ^ green) | (1434960549 & green));
        int i19 = (i17 & i18) | (i17 ^ i18);
        int i20 = i19 * (-754);
        int currentTimeMillis = (int) System.currentTimeMillis();
        int i21 = (i19 * (-339300)) + 825574848;
        int i22 = ~i20;
        int i23 = ~((i22 & (-1142693489)) | (i22 ^ (-1142693489)));
        int i24 = 1142693488 | i20;
        int i25 = ~((i24 & currentTimeMillis) | (i24 ^ currentTimeMillis));
        int i26 = -(-(((i25 & i23) | (i23 ^ i25)) * 449));
        int i27 = (((i21 ^ i26) + ((i21 & i26) << 1)) - (~(-(-(i23 * (-1347)))))) - 1;
        int i28 = ~i20;
        int i29 = ~((i28 & (-1142693489)) | (i28 ^ (-1142693489)));
        int i30 = (~currentTimeMillis) | 1142693488;
        int i31 = ~((i20 & i30) | (i30 ^ i20));
        int i32 = i27 + (((i29 & i31) | (i29 ^ i31)) * 449);
        int i33 = ~(((-539493385) & green) | ((-539493385) ^ green));
        int i34 = ~green;
        int i35 = ~(1434960549 | (900596876 & i34) | (i34 ^ 900596876));
        int i36 = (i33 & i35) | (i33 ^ i35);
        int i37 = i36 * (-754);
        System.currentTimeMillis();
        int i38 = i36 * (-475020);
        int i39 = i32 * (-628);
        int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
        int i41 = ~i32;
        int i42 = -(-(i41 * (-629)));
        int i43 = (i40 & i42) + (i42 | i40);
        int i44 = ~i37;
        int i45 = (~((i41 & i44) | (i44 ^ i41))) * (-629);
        int i46 = (((i43 ^ i45) + ((i45 & i43) << 1)) - (~(((i32 ^ i44) | (i44 & i32)) * 629))) - 1;
        int i47 = (i34 & (-900596877)) | ((-900596877) ^ i34);
        int i48 = i47 * 754;
        int currentTimeMillis2 = (int) System.currentTimeMillis();
        int i49 = i47 * (-613002);
        int i50 = -(-(i46 * 408));
        int i51 = (i49 ^ i50) + ((i49 & i50) << 1);
        int i52 = ~i46;
        int i53 = ~((i52 ^ i48) | (i52 & i48));
        int i54 = (i48 ^ currentTimeMillis2) | (i48 & currentTimeMillis2);
        int i55 = ~i54;
        int i56 = (i51 - (~(-(-(((i53 & i55) | (i53 ^ i55)) * (-814)))))) - 1;
        int i57 = ~currentTimeMillis2;
        int i58 = ~((i52 & i57) | (i52 ^ i57));
        int i59 = ~i48;
        int i60 = ~((i59 & i46) | (i59 ^ i46));
        int i61 = (i58 & i60) | (i58 ^ i60);
        int i62 = ~i54;
        int i63 = -(-(((i61 & i62) | (i61 ^ i62)) * 407));
        int i64 = ((i56 | i63) << 1) - (i63 ^ i56);
        int i65 = ~i48;
        int i66 = ~(i65 | i46);
        int i67 = ~((i65 & currentTimeMillis2) | (i65 ^ currentTimeMillis2));
        int i68 = (i67 & i66) | (i66 ^ i67);
        int i69 = ~((i46 ^ currentTimeMillis2) | (currentTimeMillis2 & i46));
        int i70 = ((i68 & i69) | (i68 ^ i69)) * 407;
        if ((i64 & i70) + (i70 | i64) == 0) {
            return;
        }
        afInfoLog = -1290715683059883267L;
        i = (byte) -94;
        AFInAppEventParameterName = new HashMap();
        registerClient = new HashMap();
        try {
            byte[] bArr5 = $$a;
            byte b = bArr5[26];
            byte b2 = bArr5[146];
            $$c = $$c(b, b2, (short) ((b2 ^ 1124) | (b2 & 1124)));
            $$c2 = unregisterClient == null ? $$c(bArr5[26], bArr5[176], (short) 1095) : null;
            z = false;
            try {
                byte b3 = bArr5[68];
                byte b4 = bArr5[34];
                Method method2 = Class.forName($$c(b3, b4, (short) ((b4 & 1073) | (b4 ^ 1073)))).getMethod($$c(bArr5[26], bArr5[940], (short) 1058), new Class[0]);
                obj = method2.invoke(null, null);
            } catch (Exception unused) {
                obj = null;
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        try {
            byte[] bArr6 = $$a;
            obj = Class.forName($$c(bArr6[68], bArr6[4], (short) 1041)).getMethod($$c(bArr6[50], bArr6[13], (short) PointerIconCompat.TYPE_GRAB), new Class[0]).invoke(null, null);
        } catch (Exception unused2) {
        }
        if (obj != null) {
            try {
                Class<?> cls2 = obj.getClass();
                byte[] bArr7 = $$a;
                Method method3 = cls2.getMethod($$c(bArr7[50], bArr7[0], (short) 1000), null);
                invoke = method3.invoke(obj, null);
            } catch (Exception unused3) {
                invoke = null;
                if (obj != null) {
                    try {
                        Class<?> cls3 = obj.getClass();
                        byte[] bArr8 = $$a;
                        Method method4 = cls3.getMethod($$c(bArr8[50], bArr8[59], (short) 990), null);
                        invoke2 = method4.invoke(obj, null);
                    } catch (Exception unused4) {
                        invoke2 = null;
                        int i71 = 2;
                        if (obj != null) {
                        }
                        obj2 = null;
                        c = 448;
                        c2 = 24;
                        if (invoke == null) {
                        }
                        if (obj2 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr9 = $$a;
                        byte b5 = bArr9[24];
                        byte b6 = bArr9[448];
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(b5, b6, (short) (b6 | 932))), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = obj2;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = obj2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        Class<?> cls4 = Class.forName($$c(bArr9[68], bArr9[69], (short) 898));
                        i15 = cls4.getDeclaredField($$c(bArr9[60], bArr9[28], (short) 875)).getInt(cls4);
                        if (i15 < 34) {
                        }
                        if (i15 != 29) {
                        }
                        z8 = false;
                        zArr3[0] = z8;
                        if (i15 >= 21) {
                        }
                        zArr3[c5] = z9;
                        zArr3[4] = i15 >= 21;
                        int i72 = 2 % 2;
                        z2 = false;
                        i3 = 0;
                        while (!z2) {
                        }
                    }
                    int i712 = 2;
                    if (obj != null) {
                        int i73 = $10 + 117;
                        $11 = i73 % 128;
                        try {
                            if (i73 % 2 == 0) {
                                Class<?> cls5 = obj.getClass();
                                byte[] bArr10 = $$a;
                                method = cls5.getMethod($$c(bArr10[122], bArr10[1], (short) 3492), null);
                            } else {
                                Class<?> cls6 = obj.getClass();
                                byte[] bArr11 = $$a;
                                method = cls6.getMethod($$c(bArr11[50], bArr11[0], (short) 976), null);
                            }
                            obj2 = method.invoke(obj, null);
                        } catch (Exception unused5) {
                            obj2 = null;
                            c = 448;
                            c2 = 24;
                            if (invoke == null) {
                            }
                            if (obj2 == null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr92 = $$a;
                            byte b52 = bArr92[24];
                            byte b62 = bArr92[448];
                            objArr = (Object[]) Array.newInstance(Class.forName($$c(b52, b62, (short) (b62 | 932))), 7);
                            objArr[0] = null;
                            objArr[1] = invoke2;
                            objArr[2] = invoke;
                            objArr[3] = obj2;
                            objArr[4] = invoke2;
                            objArr[5] = invoke;
                            objArr[6] = obj2;
                            zArr = new boolean[]{false, true, true, true, true, true, true};
                            zArr2 = new boolean[]{false, false, false, false, true, true, true};
                            zArr3 = new boolean[]{false, false, true, true, false, true, true};
                            Class<?> cls42 = Class.forName($$c(bArr92[68], bArr92[69], (short) 898));
                            i15 = cls42.getDeclaredField($$c(bArr92[60], bArr92[28], (short) 875)).getInt(cls42);
                            if (i15 < 34) {
                            }
                            if (i15 != 29) {
                            }
                            z8 = false;
                            zArr3[0] = z8;
                            if (i15 >= 21) {
                            }
                            zArr3[c5] = z9;
                            zArr3[4] = i15 >= 21;
                            int i722 = 2 % 2;
                            z2 = false;
                            i3 = 0;
                            while (!z2) {
                            }
                        }
                        c = 448;
                        c2 = 24;
                        if (invoke == null) {
                            if ($$c2 == null) {
                                int i74 = $11;
                                int i75 = (i74 & 13) + (i74 | 13);
                                $10 = i75 % 128;
                                if (i75 % 2 != 0) {
                                    throw null;
                                }
                                invoke = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                byte[] bArr12 = $$a;
                                try {
                                    Object[] objArr3 = {sb2.append($$c(bArr12[193], bArr12[0], (short) 966)).append($$c2).toString()};
                                    byte b7 = bArr12[24];
                                    byte b8 = bArr12[448];
                                    invoke = Class.forName($$c(b7, b8, (short) (b8 | 932))).getDeclaredConstructor(String.class).newInstance(objArr3);
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 == null) {
                                        throw th3;
                                    }
                                    throw cause2;
                                }
                            }
                        }
                        if (obj2 == null) {
                            int i76 = 2 % 2;
                        } else {
                            byte[] bArr13 = $$a;
                            try {
                                try {
                                    Object[] objArr4 = {Class.forName($$c(bArr13[24], bArr13[26], (short) 932)).getMethod($$c(bArr13[50], bArr13[0], (short) 917), String.class).invoke(null, $$c(bArr13[24], bArr13[68], (short) 945))};
                                    byte b9 = bArr13[24];
                                    byte b10 = bArr13[448];
                                    obj2 = Class.forName($$c(b9, b10, (short) ((b10 ^ 932) | (b10 & 932)))).getDeclaredConstructor(String.class).newInstance(objArr4);
                                } catch (Throwable th4) {
                                    Throwable cause3 = th4.getCause();
                                    if (cause3 == null) {
                                        throw th4;
                                    }
                                    throw cause3;
                                }
                            } catch (Throwable th5) {
                                Throwable cause4 = th5.getCause();
                                if (cause4 == null) {
                                    throw th5;
                                }
                                throw cause4;
                            }
                        }
                        if (invoke2 == null) {
                            int i77 = $11;
                            int i78 = ((i77 | 99) << 1) - (i77 ^ 99);
                            $10 = i78 % 128;
                            if (i78 % 2 != 0) {
                                Object obj16 = null;
                                obj16.hashCode();
                                throw null;
                            }
                            if (invoke != null) {
                                int i79 = i77 + 27;
                                $10 = i79 % 128;
                                int i80 = i79 % 2;
                                byte[] bArr14 = $$a;
                                int i81 = 2 % 2;
                                try {
                                    Object[] objArr5 = {invoke, $$c(bArr14[26], bArr14[182], (short) 907)};
                                    byte b11 = bArr14[24];
                                    byte b12 = bArr14[448];
                                    Class<?> cls7 = Class.forName($$c(b11, b12, (short) ((b12 ^ 932) | (b12 & 932))));
                                    byte b13 = bArr14[24];
                                    byte b14 = bArr14[448];
                                    invoke2 = cls7.getDeclaredConstructor(Class.forName($$c(b13, b14, (short) ((b14 & 932) | (b14 ^ 932)))), String.class).newInstance(objArr5);
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 == null) {
                                        throw th6;
                                    }
                                    throw cause5;
                                }
                            }
                        }
                        byte[] bArr922 = $$a;
                        byte b522 = bArr922[24];
                        byte b622 = bArr922[448];
                        objArr = (Object[]) Array.newInstance(Class.forName($$c(b522, b622, (short) (b622 | 932))), 7);
                        objArr[0] = null;
                        objArr[1] = invoke2;
                        objArr[2] = invoke;
                        objArr[3] = obj2;
                        objArr[4] = invoke2;
                        objArr[5] = invoke;
                        objArr[6] = obj2;
                        zArr = new boolean[]{false, true, true, true, true, true, true};
                        zArr2 = new boolean[]{false, false, false, false, true, true, true};
                        zArr3 = new boolean[]{false, false, true, true, false, true, true};
                        Class<?> cls422 = Class.forName($$c(bArr922[68], bArr922[69], (short) 898));
                        i15 = cls422.getDeclaredField($$c(bArr922[60], bArr922[28], (short) 875)).getInt(cls422);
                        i2 = i15 < 34 ? 1 : 0;
                        if (i15 != 29 && i15 >= 26) {
                            int i82 = $11;
                            int i83 = (i82 & 57) + (i82 | 57);
                            $10 = i83 % 128;
                            int i84 = i83 % 2;
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zArr3[0] = z8;
                        if (i15 >= 21) {
                            c5 = 1;
                            z9 = true;
                        } else {
                            z9 = false;
                            c5 = 1;
                        }
                        zArr3[c5] = z9;
                        zArr3[4] = i15 >= 21;
                        int i7222 = 2 % 2;
                        z2 = false;
                        i3 = 0;
                        while (!z2 && i3 < 9) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            if (zArr3[i3]) {
                                zArr4 = zArr;
                                str = $$c;
                                zArr5 = zArr2;
                                z3 = z2;
                                objArr2 = objArr;
                                i4 = i2;
                                i5 = i3;
                                i7 = i712;
                                c3 = c2;
                                zArr6 = zArr3;
                                z4 = z;
                            } else {
                                try {
                                    z5 = zArr[i3];
                                    obj4 = objArr[i3];
                                    z6 = zArr2[i3];
                                    if (z5) {
                                        int i85 = $10;
                                        int i86 = ((i85 | 61) << 1) - (i85 ^ 61);
                                        $11 = i86 % 128;
                                        int i87 = i86 % i712;
                                        if (obj4 != null) {
                                            int i88 = (i85 & 5) + (i85 | 5);
                                            $11 = i88 % 128;
                                            int i89 = i88 % i712;
                                            try {
                                                byte[] bArr15 = $$a;
                                                byte b15 = bArr15[c2];
                                                byte b16 = bArr15[c];
                                            } catch (Throwable th7) {
                                                Throwable cause6 = th7.getCause();
                                                if (cause6 == null) {
                                                    throw th7;
                                                }
                                                throw cause6;
                                            }
                                        }
                                        short s5 = (short) 858;
                                        try {
                                            throw ((Throwable) Class.forName($$c(r10[24], r10[8], s5)).getDeclaredConstructor(String.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[369]), r10[449], (short) 862)).append(obj4).append($$c(r10[1], r10[325], s5)).toString()));
                                        } catch (Throwable th8) {
                                            Throwable cause7 = th8.getCause();
                                            if (cause7 == null) {
                                                throw th8;
                                            }
                                            throw cause7;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    zArr4 = zArr;
                                    str = $$c;
                                    zArr5 = zArr2;
                                    z3 = z2;
                                    objArr2 = objArr;
                                    i4 = i2;
                                    i5 = i3;
                                    zArr6 = zArr3;
                                }
                                if (z5) {
                                    try {
                                        random = new Random();
                                    } catch (Throwable th10) {
                                        th = th10;
                                        zArr4 = zArr;
                                    }
                                    try {
                                        byte[] bArr16 = $$a;
                                        zArr4 = zArr;
                                        try {
                                            try {
                                                random.setSeed(((Long) Class.forName($$c(bArr16[24], bArr16[26], (short) 932)).getMethod($$c(bArr16[26], bArr16[61], (short) 840), null).invoke(null, null)).longValue() ^ (-1617135332));
                                                obj5 = null;
                                                obj6 = null;
                                                obj7 = null;
                                                obj8 = null;
                                            } catch (Throwable th11) {
                                                th = th11;
                                                str = $$c;
                                                zArr5 = zArr2;
                                                z3 = z2;
                                                objArr2 = objArr;
                                                i5 = i3;
                                                zArr6 = zArr3;
                                                obj3 = th;
                                                i4 = i2;
                                                while (i6 < 7) {
                                                }
                                                try {
                                                    throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                } catch (Throwable th12) {
                                                    Throwable cause8 = th12.getCause();
                                                    if (cause8 == null) {
                                                        throw th12;
                                                    }
                                                    throw cause8;
                                                }
                                            }
                                            while (obj5 == null) {
                                                if (obj6 == null) {
                                                    i8 = 6;
                                                    obj12 = obj5;
                                                } else if (obj7 == null) {
                                                    int i90 = $11 + 31;
                                                    obj12 = obj5;
                                                    $10 = i90 % 128;
                                                    int i91 = i90 % 2;
                                                    i8 = 5;
                                                } else {
                                                    obj12 = obj5;
                                                    i8 = obj8 == null ? 4 : 3;
                                                }
                                                str = $$c;
                                                zArr5 = zArr2;
                                                try {
                                                    int currentTimeMillis3 = (int) System.currentTimeMillis();
                                                    int i92 = i8 * (-667);
                                                    int i93 = ((-1335) & i92) + ((-1335) | i92);
                                                    int i94 = ~i8;
                                                    z3 = z2;
                                                    int i95 = (currentTimeMillis3 ^ 1) | (currentTimeMillis3 & 1);
                                                    objArr2 = objArr;
                                                    int i96 = ~i95;
                                                    int i97 = ((i94 ^ i96) | (i96 & i94)) * (-668);
                                                    int i98 = ((i93 | i97) << 1) - (i93 ^ i97);
                                                    int i99 = ~i8;
                                                    int i100 = ~((i99 ^ currentTimeMillis3) | (currentTimeMillis3 & i99));
                                                    try {
                                                        StringBuilder sb3 = new StringBuilder(i98 + (((i100 & 1) | (i100 ^ 1)) * 1336) + ((i95 | i94) * 668));
                                                        sb3.append('.');
                                                        int i101 = 0;
                                                        while (i101 < i8) {
                                                            if (z6) {
                                                                int nextInt = random.nextInt(26);
                                                                if (random.nextBoolean()) {
                                                                    System.currentTimeMillis();
                                                                    System.currentTimeMillis();
                                                                    boolean[] zArr7 = zArr3;
                                                                    int i102 = i8;
                                                                    try {
                                                                        int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                                        int i103 = nextInt * (-432);
                                                                        i9 = i102;
                                                                        int i104 = (i103 & 28210) + (i103 | 28210);
                                                                        int i105 = ~nextInt;
                                                                        zArr6 = zArr7;
                                                                        int i106 = ~currentTimeMillis4;
                                                                        int i107 = (~((i105 ^ i106) | (i106 & i105) | 65)) * 433;
                                                                        int i108 = (i104 ^ i107) + ((i107 & i104) << 1);
                                                                        int i109 = ((~(((-66) ^ currentTimeMillis4) | ((-66) & currentTimeMillis4))) | i105) * (-433);
                                                                        int i110 = ((i108 | i109) << 1) - (i108 ^ i109);
                                                                        int i111 = ~((i105 ^ currentTimeMillis4) | (i105 & currentTimeMillis4));
                                                                        int i112 = ~(nextInt | 65);
                                                                        int i113 = -(-(((i111 & i112) | (i111 ^ i112)) * 433));
                                                                        i10 = ((i110 | i113) << 1) - (i110 ^ i113);
                                                                        i5 = i3;
                                                                    } catch (Throwable th13) {
                                                                        zArr6 = zArr7;
                                                                        obj3 = th13;
                                                                        i4 = i2;
                                                                        i5 = i3;
                                                                        while (i6 < 7) {
                                                                        }
                                                                        throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                                    }
                                                                } else {
                                                                    zArr6 = zArr3;
                                                                    i9 = i8;
                                                                    try {
                                                                        int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                        int i114 = (nextInt * 1773) - 84960;
                                                                        int i115 = ~nextInt;
                                                                        int i116 = (~((i115 & (-97)) | (i115 ^ (-97)))) | (~((-97) | currentTimeMillis5));
                                                                        int i117 = ~currentTimeMillis5;
                                                                        i5 = i3;
                                                                        int i118 = ~(i117 | nextInt | 96);
                                                                        int i119 = -(-(((i116 ^ i118) | (i118 & i116)) * 886));
                                                                        int i120 = (i114 & i119) + (i114 | i119);
                                                                        int i121 = ~((i117 ^ 96) | (i117 & 96));
                                                                        int i122 = ((i121 & nextInt) | (nextInt ^ i121)) * (-1772);
                                                                        int i123 = (i120 & i122) + (i122 | i120);
                                                                        int i124 = ~currentTimeMillis5;
                                                                        int i125 = -(-((~((i124 & nextInt) | (i124 ^ nextInt))) * 886));
                                                                        i10 = (i123 & i125) + (i125 | i123);
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        i5 = i3;
                                                                        obj3 = th;
                                                                        i4 = i2;
                                                                        while (i6 < 7) {
                                                                        }
                                                                        throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                                    }
                                                                }
                                                                try {
                                                                    sb3.append((char) i10);
                                                                } catch (Throwable th15) {
                                                                    th = th15;
                                                                    obj3 = th;
                                                                    i4 = i2;
                                                                    while (i6 < 7) {
                                                                    }
                                                                    throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                                }
                                                            } else {
                                                                i5 = i3;
                                                                zArr6 = zArr3;
                                                                i9 = i8;
                                                                int nextInt2 = random.nextInt(12);
                                                                int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                int i126 = nextInt2 * (-1975);
                                                                int i127 = (i126 & 8101888) + (i126 | 8101888);
                                                                int i128 = ~nextInt2;
                                                                int i129 = ~((i128 ^ 8192) | (i128 & 8192));
                                                                int i130 = -(-(((i129 & currentTimeMillis6) | (currentTimeMillis6 ^ i129)) * 988));
                                                                int i131 = ((i127 | i130) << 1) - (i130 ^ i127);
                                                                int i132 = ~((-8193) | nextInt2);
                                                                int i133 = ~currentTimeMillis6;
                                                                int i134 = ~((i133 ^ nextInt2) | (nextInt2 & i133));
                                                                int i135 = ((i132 ^ i134) | (i134 & i132)) * (-1976);
                                                                int i136 = (i131 ^ i135) + ((i135 & i131) << 1);
                                                                int i137 = ~(i128 | 8192);
                                                                int i138 = ~((currentTimeMillis6 & (-8193)) | ((-8193) ^ currentTimeMillis6));
                                                                sb3.append((char) (i136 + (((i137 & i138) | (i137 ^ i138) | (~((i133 ^ 8192) | (i133 & 8192)))) * 988)));
                                                            }
                                                            i101++;
                                                            i8 = i9;
                                                            zArr3 = zArr6;
                                                            i3 = i5;
                                                        }
                                                        i5 = i3;
                                                        zArr6 = zArr3;
                                                        sb = sb3.toString();
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        i5 = i3;
                                                        zArr6 = zArr3;
                                                        obj3 = th;
                                                        i4 = i2;
                                                        while (i6 < 7) {
                                                        }
                                                        throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                    }
                                                } catch (Throwable th17) {
                                                    th = th17;
                                                    z3 = z2;
                                                    objArr2 = objArr;
                                                    i5 = i3;
                                                    zArr6 = zArr3;
                                                    obj3 = th;
                                                    i4 = i2;
                                                    while (i6 < 7) {
                                                    }
                                                    throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                }
                                                if (obj6 == null) {
                                                    try {
                                                        Object[] objArr6 = {obj4, sb};
                                                        byte[] bArr17 = $$a;
                                                        byte b17 = bArr17[24];
                                                        byte b18 = bArr17[448];
                                                        Class<?> cls8 = Class.forName($$c(b17, b18, (short) ((b18 ^ 932) | (b18 & 932))));
                                                        byte b19 = bArr17[24];
                                                        byte b20 = bArr17[448];
                                                        obj6 = cls8.getDeclaredConstructor(Class.forName($$c(b19, b20, (short) ((b20 ^ 932) | (b20 & 932)))), String.class).newInstance(objArr6);
                                                    } catch (Throwable th18) {
                                                        Throwable cause9 = th18.getCause();
                                                        if (cause9 == null) {
                                                            throw th18;
                                                        }
                                                        throw cause9;
                                                    }
                                                } else {
                                                    if (obj7 != null) {
                                                        if (obj8 == null) {
                                                            int i139 = $11;
                                                            int i140 = (i139 ^ 63) + ((i139 & 63) << 1);
                                                            $10 = i140 % 128;
                                                            int i141 = i140 % 2;
                                                            try {
                                                                Object[] objArr7 = {obj4, sb};
                                                                byte[] bArr18 = $$a;
                                                                byte b21 = bArr18[24];
                                                                byte b22 = bArr18[448];
                                                                Class<?> cls9 = Class.forName($$c(b21, b22, (short) ((b22 ^ 932) | (b22 & 932))));
                                                                byte b23 = bArr18[24];
                                                                byte b24 = bArr18[448];
                                                                obj8 = cls9.getDeclaredConstructor(Class.forName($$c(b23, b24, (short) (b24 | 932))), String.class).newInstance(objArr7);
                                                            } catch (Throwable th19) {
                                                                Throwable cause10 = th19.getCause();
                                                                if (cause10 == null) {
                                                                    throw th19;
                                                                }
                                                                throw cause10;
                                                            }
                                                        } else {
                                                            try {
                                                                try {
                                                                    Object[] objArr8 = {obj4, sb};
                                                                    byte[] bArr19 = $$a;
                                                                    byte b25 = bArr19[24];
                                                                    byte b26 = bArr19[448];
                                                                    Class<?> cls10 = Class.forName($$c(b25, b26, (short) ((b26 ^ 932) | (b26 & 932))));
                                                                    byte b27 = bArr19[24];
                                                                    byte b28 = bArr19[448];
                                                                    Object newInstance2 = cls10.getDeclaredConstructor(Class.forName($$c(b27, b28, (short) ((b28 ^ 932) | (b28 & 932)))), String.class).newInstance(objArr8);
                                                                    try {
                                                                        short s6 = (short) 824;
                                                                        Class<?> cls11 = Class.forName($$c(bArr19[24], bArr19[69], s6));
                                                                        byte b29 = bArr19[24];
                                                                        Object obj17 = obj6;
                                                                        byte b30 = bArr19[448];
                                                                        try {
                                                                            Class.forName($$c(bArr19[24], bArr19[69], s6)).getMethod($$c(bArr19[26], bArr19[449], (short) 801), null).invoke(cls11.getDeclaredConstructor(Class.forName($$c(b29, b30, (short) (b30 | 932)))).newInstance(newInstance2), null);
                                                                            obj5 = newInstance2;
                                                                            obj6 = obj17;
                                                                            $$c = str;
                                                                            zArr2 = zArr5;
                                                                            objArr = objArr2;
                                                                            zArr3 = zArr6;
                                                                            z2 = z3;
                                                                            i3 = i5;
                                                                        } catch (Throwable th20) {
                                                                            Throwable cause11 = th20.getCause();
                                                                            if (cause11 == null) {
                                                                                throw th20;
                                                                            }
                                                                            throw cause11;
                                                                        }
                                                                    } catch (Throwable th21) {
                                                                        Throwable cause12 = th21.getCause();
                                                                        if (cause12 == null) {
                                                                            throw th21;
                                                                        }
                                                                        throw cause12;
                                                                    }
                                                                } catch (Exception e3) {
                                                                    short s7 = (short) 858;
                                                                    try {
                                                                        throw ((Throwable) Class.forName($$c(r5[24], r5[8], s7)).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[369]), r5[449], (short) 797)).append((Object) 2).append($$c(r5[1], r5[325], s7)).toString(), e3));
                                                                    } catch (Throwable th22) {
                                                                        Throwable cause13 = th22.getCause();
                                                                        if (cause13 == null) {
                                                                            throw th22;
                                                                        }
                                                                        throw cause13;
                                                                    }
                                                                }
                                                            } catch (Throwable th23) {
                                                                Throwable cause14 = th23.getCause();
                                                                if (cause14 == null) {
                                                                    throw th23;
                                                                }
                                                                throw cause14;
                                                            }
                                                        }
                                                        th = th15;
                                                        obj3 = th;
                                                        i4 = i2;
                                                        while (i6 < 7) {
                                                        }
                                                        throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                                    }
                                                    try {
                                                        Object[] objArr9 = {obj4, sb};
                                                        byte[] bArr20 = $$a;
                                                        byte b31 = bArr20[24];
                                                        byte b32 = bArr20[448];
                                                        Class<?> cls12 = Class.forName($$c(b31, b32, (short) ((b32 ^ 932) | (b32 & 932))));
                                                        byte b33 = bArr20[24];
                                                        byte b34 = bArr20[448];
                                                        obj7 = cls12.getDeclaredConstructor(Class.forName($$c(b33, b34, (short) ((b34 ^ 932) | (b34 & 932)))), String.class).newInstance(objArr9);
                                                    } catch (Throwable th24) {
                                                        Throwable cause15 = th24.getCause();
                                                        if (cause15 == null) {
                                                            throw th24;
                                                        }
                                                        throw cause15;
                                                    }
                                                }
                                                obj5 = obj12;
                                                $$c = str;
                                                zArr2 = zArr5;
                                                objArr = objArr2;
                                                zArr3 = zArr6;
                                                z2 = z3;
                                                i3 = i5;
                                            }
                                            obj9 = obj5;
                                            str = $$c;
                                            zArr5 = zArr2;
                                            z3 = z2;
                                            objArr2 = objArr;
                                            i5 = i3;
                                            zArr6 = zArr3;
                                            obj10 = obj8;
                                            obj11 = obj6;
                                        } catch (Throwable th25) {
                                            th = th25;
                                            Throwable th26 = th;
                                            Throwable cause16 = th26.getCause();
                                            if (cause16 == null) {
                                                throw th26;
                                            }
                                            throw cause16;
                                        }
                                    } catch (Throwable th27) {
                                        th = th27;
                                    }
                                } else {
                                    zArr4 = zArr;
                                    str = $$c;
                                    zArr5 = zArr2;
                                    z3 = z2;
                                    objArr2 = objArr;
                                    i5 = i3;
                                    zArr6 = zArr3;
                                    obj10 = null;
                                    obj7 = null;
                                    obj11 = null;
                                    obj9 = null;
                                }
                                try {
                                    bArr = $$a;
                                    $$c3 = $$c(bArr[193], bArr[146], (short) 793);
                                } catch (Throwable th28) {
                                    th = th28;
                                    i4 = i2;
                                    obj3 = th;
                                    while (i6 < 7) {
                                    }
                                    throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                }
                                try {
                                    byte b35 = bArr[50];
                                    byte b36 = bArr[0];
                                    ?? r14 = 0;
                                    Object invoke5 = Class.class.getMethod($$c(b35, b36, (short) (b36 | 736)), String.class).invoke(AFa1vSDK.class, $$c3);
                                    try {
                                        try {
                                            byte b37 = bArr[24];
                                            byte b38 = bArr[448];
                                            int i142 = $$b;
                                            String str3 = (String) Class.forName($$c(b37, b38, (short) ((i142 & 585) | (i142 ^ 585)))).getMethod($$c(bArr[50], bArr[28], (short) 740), null).invoke(invoke5, null);
                                            s = (short) 734;
                                            zipFile = new ZipFile(str3.substring(5, str3.lastIndexOf($$c((byte) 86, bArr[325], s) + $$c3)));
                                        } catch (Throwable th29) {
                                            th = th29;
                                            obj3 = th;
                                            for (i6 = ((i5 | 1) << 1) - (i5 ^ 1); i6 < 7; i6 = (i6 & (-27)) + (i6 | (-27)) + 28) {
                                                int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                int i143 = -(-(((1416061574 ^ currentTimeMillis7) | (1416061574 & currentTimeMillis7)) * (-859)));
                                                int i144 = ((1407270924 | i143) << 1) - (i143 ^ 1407270924);
                                                int i145 = ~currentTimeMillis7;
                                                int i146 = ~((1416061574 & i145) | (i145 ^ 1416061574));
                                                int i147 = ~((-337797639) | currentTimeMillis7);
                                                int i148 = ((i146 & i147) | (i146 ^ i147)) * 859;
                                                int i149 = ~currentTimeMillis7;
                                                int i150 = ~((i149 & 1230340345) | (1230340345 ^ i149));
                                                int i151 = (((i144 | i148) << 1) - (i148 ^ i144)) + (((i150 & (-1568137984)) | (i150 ^ (-1568137984))) * 859);
                                                int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                int i152 = ~currentTimeMillis8;
                                                int i153 = ~((1301904292 & i152) | (1301904292 ^ i152));
                                                int i154 = (i153 & (-1572831167)) | (i153 ^ (-1572831167));
                                                int i155 = ~((i152 & 1362050842) | (i152 ^ 1362050842));
                                                int i156 = (-968087230) + (((i155 & i154) | (i154 ^ i155)) * (-397));
                                                int i157 = ((i156 | 1643715379) << 1) - (1643715379 ^ i156);
                                                int i158 = currentTimeMillis8 | (-1572831167);
                                                int i159 = -(-(((i158 & 1091123968) | (i158 ^ 1091123968)) * 397));
                                                if (i151 <= (i157 ^ i159) + ((i159 & i157) << 1)) {
                                                    boolean z10 = zArr6[i6];
                                                    throw null;
                                                }
                                                if (zArr6[i6]) {
                                                    int i160 = $10 + 57;
                                                    $11 = i160 % 128;
                                                    int i161 = i160 % 2;
                                                    unregisterClient = null;
                                                    AFLogger = null;
                                                    c3 = 24;
                                                    i7 = 2;
                                                    z4 = false;
                                                    boolean z11 = z3;
                                                    c2 = c3;
                                                    i712 = i7;
                                                    z = z4;
                                                    z2 = z11;
                                                    zArr = zArr4;
                                                    $$c = str;
                                                    objArr = objArr2;
                                                    zArr3 = zArr6;
                                                    i2 = i4;
                                                    c = 448;
                                                    i3 = ((i5 & 13) + (i5 | 13)) - 12;
                                                    zArr2 = zArr5;
                                                }
                                            }
                                            throw ((Throwable) Class.forName($$c(r1[24], r1[8], (short) 858)).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c((byte) (-$$a[369]), r1[24], r1[179]), obj3));
                                        }
                                        try {
                                            byte[] bArr21 = new byte[8336];
                                            try {
                                                short s8 = (short) 708;
                                                r14 = 0;
                                                r14 = 0;
                                                try {
                                                    Object[] objArr10 = {Class.forName($$c(bArr[24], bArr[33], s)).getDeclaredConstructor(Class.forName($$c(bArr[24], bArr[8], s8))).newInstance(zipFile.getInputStream(zipFile.getEntry($$c3.substring(1))))};
                                                    byte b39 = bArr[24];
                                                    short s9 = (short) 690;
                                                    ?? cls13 = Class.forName($$c(b39, b39, s9));
                                                    Object obj18 = obj10;
                                                    Object obj19 = obj7;
                                                    r14 = new Class[]{Class.forName($$c(bArr[24], bArr[8], s8))};
                                                    Object newInstance3 = cls13.getDeclaredConstructor(r14).newInstance(objArr10);
                                                    try {
                                                        byte b40 = bArr[24];
                                                        Class<?> cls14 = Class.forName($$c(b40, b40, s9));
                                                        byte b41 = bArr[10];
                                                        byte b42 = bArr[182];
                                                        r14 = 0;
                                                        r14 = 0;
                                                        cls14.getMethod($$c(b41, (byte) (((b42 | 1) << 1) - (b42 ^ 1)), (short) 668), byte[].class).invoke(newInstance3, bArr21);
                                                        try {
                                                            byte b43 = bArr[24];
                                                            try {
                                                                try {
                                                                    Class.forName($$c(b43, b43, s9)).getMethod($$c(bArr[26], bArr[449], (short) 801), null).invoke(newInstance3, null);
                                                                    int i162 = 8285;
                                                                    String str4 = str;
                                                                    Class cls15 = null;
                                                                    int i163 = 16;
                                                                    int i164 = 1;
                                                                    while (true) {
                                                                        long j = i164;
                                                                        int i165 = 0;
                                                                        while (i165 < bArr21.length) {
                                                                            try {
                                                                                j = ((bArr21[i165] + (j << 6)) + (j << 16)) - j;
                                                                                int i166 = i165 + 52;
                                                                                i165 = (i166 & (-51)) + (i166 | (-51));
                                                                                i162 = i162;
                                                                            } catch (Throwable th30) {
                                                                                th = th30;
                                                                                zipFile4 = zipFile;
                                                                                i4 = i2;
                                                                                zipFile3 = zipFile4;
                                                                                try {
                                                                                    zipFile3.close();
                                                                                    throw th;
                                                                                } catch (Throwable th31) {
                                                                                    th.addSuppressed(th31);
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        }
                                                                        i4 = i162;
                                                                        int i167 = i163 + 87;
                                                                        byte b44 = bArr21[i163 + 8319];
                                                                        Object obj20 = obj11;
                                                                        int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                        int i168 = 11569 + (b44 * 503);
                                                                        int i169 = (b44 ^ 23) | (b44 & 23);
                                                                        int i170 = i169 * (-502);
                                                                        int i171 = (i168 ^ i170) + ((i168 & i170) << 1);
                                                                        int i172 = ~b44;
                                                                        int i173 = ~(((-24) ^ i172) | ((-24) & i172));
                                                                        Class cls16 = cls15;
                                                                        int i174 = ~((-24) | (~currentTimeMillis9));
                                                                        int i175 = (i173 ^ i174) | (i174 & i173);
                                                                        int i176 = ~((i169 & currentTimeMillis9) | (i169 ^ currentTimeMillis9));
                                                                        int i177 = ((i175 & i176) | (i175 ^ i176)) * (-502);
                                                                        int i178 = (i171 & i177) + (i171 | i177);
                                                                        int i179 = ~currentTimeMillis9;
                                                                        int i180 = ((-24) ^ i179) | (i179 & (-24));
                                                                        int i181 = ~((b44 & i180) | (i180 ^ b44));
                                                                        bArr21[i167] = (byte) (i178 + (((i181 & i176) | (i181 ^ i176)) * 502));
                                                                        int length = bArr21.length;
                                                                        int i182 = -i163;
                                                                        int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                        int i183 = ((i182 * 450) - (~(-(-(length * (-448)))))) - 1;
                                                                        int i184 = ~i182;
                                                                        int i185 = ~((i184 & length) | (i184 ^ length));
                                                                        int i186 = ~length;
                                                                        int i187 = (i186 ^ i182) | (i186 & i182);
                                                                        int i188 = ~((i187 ^ currentTimeMillis10) | (i187 & currentTimeMillis10));
                                                                        ZipFile zipFile7 = zipFile;
                                                                        int i189 = -(-(((i185 ^ i188) | (i188 & i185)) * 449));
                                                                        int i190 = (i183 & i189) + (i189 | i183);
                                                                        int i191 = -(-(i185 * (-1347)));
                                                                        int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
                                                                        int i193 = ~currentTimeMillis10;
                                                                        int i194 = (i186 & i193) | (i186 ^ i193);
                                                                        int i195 = ~((i194 & i182) | (i194 ^ i182));
                                                                        try {
                                                                            Object[] objArr11 = {bArr21, Integer.valueOf(i163), Integer.valueOf(i192 + (((i195 & i185) | (i185 ^ i195)) * 449))};
                                                                            byte[] bArr22 = $$a;
                                                                            Object newInstance4 = Class.forName($$c(bArr22[24], bArr22[12], (short) 660)).getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE).newInstance(objArr11);
                                                                            try {
                                                                                Object obj21 = unregisterClient;
                                                                                if (obj21 == null) {
                                                                                    try {
                                                                                        force = j;
                                                                                        int elapsedRealtimeNanos = (int) (((SystemClock.elapsedRealtimeNanos() >> 60) - 5553287078438194450L) ^ j);
                                                                                        int elapsedRealtime = (int) (force ^ ((-5553287077507126261L) - (SystemClock.elapsedRealtime() >> 48)));
                                                                                        byte[] bArr23 = new byte[16];
                                                                                        try {
                                                                                            Object[] objArr12 = {new byte[]{-70, -90, 52, -28, 54, 85, 5, -56, -49, 75, -95, 67, -75, -127, 111, 4}, Integer.valueOf((int) (force ^ ((SystemClock.currentThreadTimeMillis() >> 48) - 5553287078438194454L))), bArr23, Integer.valueOf((int) (force ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) - 5553287078438194454L))), 16};
                                                                                            Class<?> cls17 = Class.forName($$c(bArr22[24], bArr22[26], (short) 932));
                                                                                            byte b45 = bArr22[68];
                                                                                            cls17.getMethod($$c(b45, (byte) (b45 + 5), (short) 633), Object.class, Integer.TYPE, Object.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                                                                                            AFk1zSDK.AFAdRevenueData(bArr23, i, afInfoLog);
                                                                                            try {
                                                                                                newInstance = Class.forName($$c(bArr22[26], bArr22[10], (short) 625)).getDeclaredConstructor(Class.forName($$c(bArr22[24], bArr22[8], (short) 708)), Integer.TYPE, byte[].class, byte[][].class).newInstance(newInstance4, Integer.valueOf(elapsedRealtimeNanos), bArr23, AFk1uSDK.getMonetizationNetwork(elapsedRealtime));
                                                                                                c4 = 24;
                                                                                            } catch (Throwable th32) {
                                                                                                Throwable cause17 = th32.getCause();
                                                                                                if (cause17 == null) {
                                                                                                    throw th32;
                                                                                                }
                                                                                                throw cause17;
                                                                                            }
                                                                                        } catch (Throwable th33) {
                                                                                            Throwable cause18 = th33.getCause();
                                                                                            if (cause18 == null) {
                                                                                                throw th33;
                                                                                            }
                                                                                            throw cause18;
                                                                                        }
                                                                                    } catch (Throwable th34) {
                                                                                        th = th34;
                                                                                        i4 = i2;
                                                                                        zipFile4 = zipFile7;
                                                                                        zipFile3 = zipFile4;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    w = j;
                                                                                    try {
                                                                                        Object[] objArr13 = {newInstance4, Integer.valueOf((int) (j ^ (7657556349164021564L - (SystemClock.elapsedRealtime() >> 48)))), Short.valueOf((short) (w ^ ((SystemClock.currentThreadTimeMillis() >> 48) - 7657556349854625976L)))};
                                                                                        try {
                                                                                            byte b46 = bArr22[26];
                                                                                            byte b47 = bArr22[146];
                                                                                            newInstance = Class.forName($$c(b46, b47, (short) ((b47 ^ 592) | (b47 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr22[50], bArr22[4], (short) 563), Class.forName($$c(bArr22[24], bArr22[8], (short) 708)), Integer.TYPE, Short.TYPE).invoke(obj21, objArr13);
                                                                                            c4 = 24;
                                                                                        } catch (Throwable th35) {
                                                                                            th = th35;
                                                                                            Throwable th36 = th;
                                                                                            Throwable cause19 = th36.getCause();
                                                                                            if (cause19 == null) {
                                                                                                throw th36;
                                                                                            }
                                                                                            throw cause19;
                                                                                        }
                                                                                    } catch (Throwable th37) {
                                                                                        th = th37;
                                                                                    }
                                                                                }
                                                                                short s10 = (short) 708;
                                                                                r14 = 0;
                                                                                Class.forName($$c(bArr22[c4], bArr22[8], s10)).getMethod($$c(bArr22[149], bArr22[148], (short) 542), Long.TYPE).invoke(newInstance, 20);
                                                                                if (z5) {
                                                                                    try {
                                                                                        Object obj22 = unregisterClient;
                                                                                        if (obj22 == null) {
                                                                                            int i196 = $10 + 69;
                                                                                            int i197 = i196 % 128;
                                                                                            $11 = i197;
                                                                                            if (i196 % 2 == 0) {
                                                                                                int i198 = 88 / 0;
                                                                                            }
                                                                                            int i199 = ((i197 | 125) << 1) - (i197 ^ 125);
                                                                                            $10 = i199 % 128;
                                                                                            i11 = 2;
                                                                                            if (i199 % 2 == 0) {
                                                                                                int i200 = 2 % 2;
                                                                                            }
                                                                                            obj13 = obj20;
                                                                                        } else {
                                                                                            i11 = 2;
                                                                                            obj13 = obj19;
                                                                                        }
                                                                                        if (obj22 == null) {
                                                                                            int i201 = i11 % i11;
                                                                                            obj14 = obj18;
                                                                                        } else {
                                                                                            obj14 = obj9;
                                                                                        }
                                                                                        Method method5 = Class.forName($$c(bArr22[24], bArr22[8], s10)).getMethod($$c(bArr22[10], bArr22[148], (short) 539), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                        Class<?> cls18 = Class.forName($$c(bArr22[24], bArr22[69], (short) 824));
                                                                                        try {
                                                                                            try {
                                                                                                byte b48 = bArr22[24];
                                                                                                i12 = i163;
                                                                                                byte b49 = bArr22[448];
                                                                                                str2 = str4;
                                                                                                Object newInstance5 = cls18.getConstructor(Class.forName($$c(b48, b49, (short) ((b49 & 932) | (b49 ^ 932))))).newInstance(obj13);
                                                                                                if ((i2 ^ 1) != 1) {
                                                                                                    try {
                                                                                                        byte b50 = bArr22[24];
                                                                                                        byte b51 = bArr22[448];
                                                                                                        ((Boolean) Class.forName($$c(b50, b51, (short) ((b51 ^ 932) | (b51 & 932)))).getMethod($$c(bArr22[149], bArr22[0], (short) 536), null).invoke(obj13, null)).booleanValue();
                                                                                                        int i202 = 2 % 2;
                                                                                                    } catch (Throwable th38) {
                                                                                                        try {
                                                                                                            Throwable cause20 = th38.getCause();
                                                                                                            if (cause20 == null) {
                                                                                                                throw th38;
                                                                                                            }
                                                                                                            throw cause20;
                                                                                                        } catch (Exception e4) {
                                                                                                            exc = e4;
                                                                                                            i4 = i2;
                                                                                                            short s11 = (short) 858;
                                                                                                            try {
                                                                                                                throw ((Throwable) Class.forName($$c(r5[24], r5[8], s11)).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[369]), r5[449], (short) 526)).append(obj13).append($$c(r5[1], r5[325], s11)).toString(), exc));
                                                                                                            } catch (Throwable th39) {
                                                                                                                Throwable cause21 = th39.getCause();
                                                                                                                if (cause21 == null) {
                                                                                                                    throw th39;
                                                                                                                }
                                                                                                                throw cause21;
                                                                                                            }
                                                                                                        } catch (Throwable th40) {
                                                                                                            th2 = th40;
                                                                                                            i4 = i2;
                                                                                                            try {
                                                                                                                byte[] bArr24 = $$a;
                                                                                                                byte b53 = bArr24[24];
                                                                                                                byte b54 = bArr24[448];
                                                                                                                short s12 = (short) 450;
                                                                                                                ((Boolean) Class.forName($$c(b53, b54, (short) ((b54 ^ 932) | (b54 & 932)))).getMethod($$c(bArr24[61], bArr24[302], s12), null).invoke(obj13, null)).booleanValue();
                                                                                                                try {
                                                                                                                    byte b55 = bArr24[24];
                                                                                                                    byte b56 = bArr24[448];
                                                                                                                    ((Boolean) Class.forName($$c(b55, b56, (short) ((b56 ^ 932) | (b56 & 932)))).getMethod($$c(bArr24[61], bArr24[302], s12), null).invoke(obj14, null)).booleanValue();
                                                                                                                    throw th2;
                                                                                                                } catch (Throwable th41) {
                                                                                                                    Throwable cause22 = th41.getCause();
                                                                                                                    if (cause22 == null) {
                                                                                                                        throw th41;
                                                                                                                    }
                                                                                                                    throw cause22;
                                                                                                                }
                                                                                                            } catch (Throwable th42) {
                                                                                                                Throwable cause23 = th42.getCause();
                                                                                                                if (cause23 == null) {
                                                                                                                    throw th42;
                                                                                                                }
                                                                                                                throw cause23;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                int i203 = 1024;
                                                                                                byte[] bArr25 = new byte[1024];
                                                                                                Method method6 = cls18.getMethod($$c(bArr22[5], bArr22[449], (short) 522), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                                int i204 = i4;
                                                                                                while (true) {
                                                                                                    if (i204 <= 0) {
                                                                                                        i4 = i2;
                                                                                                        break;
                                                                                                    }
                                                                                                    i4 = i2;
                                                                                                    try {
                                                                                                        int intValue = ((Integer) method5.invoke(newInstance, bArr25, 0, Integer.valueOf(Math.min(i203, i204)))).intValue();
                                                                                                        if (intValue == -1) {
                                                                                                            break;
                                                                                                        }
                                                                                                        int i205 = $10;
                                                                                                        int i206 = ((i205 | 97) << 1) - (i205 ^ 97);
                                                                                                        $11 = i206 % 128;
                                                                                                        if (i206 % 2 == 0) {
                                                                                                            method6.invoke(newInstance5, 1, bArr25, Integer.valueOf(intValue));
                                                                                                            i204 >>>= intValue;
                                                                                                        } else {
                                                                                                            method6.invoke(newInstance5, bArr25, 0, Integer.valueOf(intValue));
                                                                                                            i204 -= intValue;
                                                                                                        }
                                                                                                        i2 = i4;
                                                                                                        i203 = 1024;
                                                                                                    } catch (Throwable th43) {
                                                                                                        th = th43;
                                                                                                        th2 = th;
                                                                                                        byte[] bArr242 = $$a;
                                                                                                        byte b532 = bArr242[24];
                                                                                                        byte b542 = bArr242[448];
                                                                                                        short s122 = (short) 450;
                                                                                                        ((Boolean) Class.forName($$c(b532, b542, (short) ((b542 ^ 932) | (b542 & 932)))).getMethod($$c(bArr242[61], bArr242[302], s122), null).invoke(obj13, null)).booleanValue();
                                                                                                        byte b552 = bArr242[24];
                                                                                                        byte b562 = bArr242[448];
                                                                                                        ((Boolean) Class.forName($$c(b552, b562, (short) ((b562 ^ 932) | (b562 & 932)))).getMethod($$c(bArr242[61], bArr242[302], s122), null).invoke(obj14, null)).booleanValue();
                                                                                                        throw th2;
                                                                                                    }
                                                                                                }
                                                                                                byte[] bArr26 = $$a;
                                                                                                Object invoke6 = cls18.getMethod($$c(bArr26[50], bArr26[449], (short) 518), new Class[0]).invoke(newInstance5, new Object[0]);
                                                                                                Class<?> cls19 = Class.forName($$c(bArr26[24], bArr26[4], (short) 514));
                                                                                                byte b57 = bArr26[149];
                                                                                                byte b58 = bArr26[148];
                                                                                                cls19.getMethod($$c(b57, b58, (short) ((b58 ^ 461) | (b58 & 461))), new Class[0]).invoke(invoke6, new Object[0]);
                                                                                                cls18.getMethod($$c(bArr26[26], bArr26[449], (short) 801), new Class[0]).invoke(newInstance5, new Object[0]);
                                                                                                Method declaredMethod2 = Class.forName($$c(bArr26[61], bArr26[13], (short) 490)).getDeclaredMethod($$c(bArr26[77], bArr26[28], (short) 470), String.class, String.class, Integer.TYPE);
                                                                                                try {
                                                                                                    byte b59 = bArr26[24];
                                                                                                    byte b60 = bArr26[448];
                                                                                                    short s13 = (short) 464;
                                                                                                    Object invoke7 = Class.forName($$c(b59, b60, (short) ((b60 ^ 932) | (b60 & 932)))).getMethod($$c(bArr26[50], bArr26[59], s13), null).invoke(obj13, null);
                                                                                                    try {
                                                                                                        byte b61 = bArr26[24];
                                                                                                        byte b63 = bArr26[448];
                                                                                                        invoke3 = declaredMethod2.invoke(null, invoke7, Class.forName($$c(b61, b63, (short) ((b63 ^ 932) | (b63 & 932)))).getMethod($$c(bArr26[50], bArr26[59], s13), null).invoke(obj14, null), 0);
                                                                                                        try {
                                                                                                            byte b64 = bArr26[24];
                                                                                                            byte b65 = bArr26[448];
                                                                                                            short s14 = (short) 450;
                                                                                                            ((Boolean) Class.forName($$c(b64, b65, (short) (b65 | 932))).getMethod($$c(bArr26[61], bArr26[302], s14), null).invoke(obj13, null)).booleanValue();
                                                                                                            int i207 = $10 + 105;
                                                                                                            $11 = i207 % 128;
                                                                                                            int i208 = i207 % 2;
                                                                                                            try {
                                                                                                                byte b66 = bArr26[24];
                                                                                                                byte b67 = bArr26[448];
                                                                                                                ((Boolean) Class.forName($$c(b66, b67, (short) ((b67 ^ 932) | (b67 & 932)))).getMethod($$c(bArr26[61], bArr26[302], s14), null).invoke(obj14, null)).booleanValue();
                                                                                                                if (AFLogger == null) {
                                                                                                                    System.currentTimeMillis();
                                                                                                                    System.currentTimeMillis();
                                                                                                                    try {
                                                                                                                        AFLogger = Class.class.getMethod($$c(bArr26[50], bArr26[68], (short) 445), null).invoke(AFa1vSDK.class, null);
                                                                                                                    } catch (Throwable th44) {
                                                                                                                        Throwable cause24 = th44.getCause();
                                                                                                                        if (cause24 == null) {
                                                                                                                            throw th44;
                                                                                                                        }
                                                                                                                        throw cause24;
                                                                                                                    }
                                                                                                                }
                                                                                                                int i209 = 2 % 2;
                                                                                                                s2 = s;
                                                                                                                s3 = s10;
                                                                                                            } catch (Throwable th45) {
                                                                                                                Throwable cause25 = th45.getCause();
                                                                                                                if (cause25 == null) {
                                                                                                                    throw th45;
                                                                                                                }
                                                                                                                throw cause25;
                                                                                                            }
                                                                                                        } catch (Throwable th46) {
                                                                                                            Throwable cause26 = th46.getCause();
                                                                                                            if (cause26 == null) {
                                                                                                                throw th46;
                                                                                                            }
                                                                                                            throw cause26;
                                                                                                        }
                                                                                                    } catch (Throwable th47) {
                                                                                                        Throwable cause27 = th47.getCause();
                                                                                                        if (cause27 == null) {
                                                                                                            throw th47;
                                                                                                        }
                                                                                                        throw cause27;
                                                                                                    }
                                                                                                } catch (Throwable th48) {
                                                                                                    Throwable cause28 = th48.getCause();
                                                                                                    if (cause28 == null) {
                                                                                                        throw th48;
                                                                                                    }
                                                                                                    throw cause28;
                                                                                                }
                                                                                            } catch (Exception e5) {
                                                                                                i4 = i2;
                                                                                                exc = e5;
                                                                                            }
                                                                                        } catch (Throwable th49) {
                                                                                            th = th49;
                                                                                            i4 = i2;
                                                                                            th2 = th;
                                                                                            byte[] bArr2422 = $$a;
                                                                                            byte b5322 = bArr2422[24];
                                                                                            byte b5422 = bArr2422[448];
                                                                                            short s1222 = (short) 450;
                                                                                            ((Boolean) Class.forName($$c(b5322, b5422, (short) ((b5422 ^ 932) | (b5422 & 932)))).getMethod($$c(bArr2422[61], bArr2422[302], s1222), null).invoke(obj13, null)).booleanValue();
                                                                                            byte b5522 = bArr2422[24];
                                                                                            byte b5622 = bArr2422[448];
                                                                                            ((Boolean) Class.forName($$c(b5522, b5622, (short) ((b5622 ^ 932) | (b5622 & 932)))).getMethod($$c(bArr2422[61], bArr2422[302], s1222), null).invoke(obj14, null)).booleanValue();
                                                                                            throw th2;
                                                                                        }
                                                                                    } catch (Throwable th50) {
                                                                                        th = th50;
                                                                                        i4 = i2;
                                                                                        th = th;
                                                                                        zipFile4 = zipFile7;
                                                                                        zipFile3 = zipFile4;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    i12 = i163;
                                                                                    i4 = i2;
                                                                                    str2 = str4;
                                                                                    try {
                                                                                        Class<?> cls20 = Class.forName($$c(bArr22[24], bArr22[12], (short) 432));
                                                                                        Class<?> cls21 = Class.forName($$c(bArr22[24], bArr22[8], s10));
                                                                                        Object newInstance6 = cls20.getConstructor(cls21).newInstance(newInstance);
                                                                                        Object invoke8 = cls20.getMethod($$c(bArr22[50], bArr22[448], (short) 405), new Class[0]).invoke(newInstance6, new Object[0]);
                                                                                        Method method7 = Class.forName($$c(bArr22[24], bArr22[4], (short) 394)).getMethod($$c(bArr22[50], bArr22[28], (short) 373), new Class[0]);
                                                                                        Method method8 = cls21.getMethod($$c(bArr22[10], bArr22[148], (short) 539), byte[].class);
                                                                                        try {
                                                                                            r14 = 0;
                                                                                            Object newInstance7 = Class.forName($$c(bArr22[24], bArr22[33], s)).getDeclaredConstructor(Class.forName($$c(bArr22[24], bArr22[8], s10))).newInstance(newInstance6);
                                                                                            byte b68 = bArr22[24];
                                                                                            byte b69 = bArr22[18];
                                                                                            Class<?> cls22 = Class.forName($$c(b68, b69, (short) ((b69 ^ 360) | (b69 & 360))));
                                                                                            Object newInstance8 = cls22.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                            try {
                                                                                                Method method9 = cls22.getMethod($$c(bArr22[5], bArr22[449], (short) 522), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                                Method method10 = cls22.getMethod($$c(bArr22[146], bArr22[0], (short) 339), new Class[0]);
                                                                                                try {
                                                                                                    Method method11 = Class.forName($$c(bArr22[24], bArr22[61], (short) 329)).getMethod($$c(bArr22[26], bArr22[449], (short) 801), new Class[0]);
                                                                                                    byte[] bArr27 = new byte[1024];
                                                                                                    int i210 = 0;
                                                                                                    while (true) {
                                                                                                        r14 = ((Integer) method8.invoke(newInstance7, bArr27)).intValue();
                                                                                                        if (r14 <= 0) {
                                                                                                            s2 = s;
                                                                                                            s3 = s10;
                                                                                                            break;
                                                                                                        }
                                                                                                        int i211 = $11 + 105;
                                                                                                        Method method12 = method8;
                                                                                                        $10 = i211 % 128;
                                                                                                        if (i211 % 2 == 0) {
                                                                                                            s2 = s;
                                                                                                            s3 = s10;
                                                                                                            i14 = 0;
                                                                                                            if (i210 >= ((Long) method7.invoke(invoke8, new Object[0])).longValue()) {
                                                                                                                i13 = 0;
                                                                                                                break;
                                                                                                            }
                                                                                                        } else {
                                                                                                            s2 = s;
                                                                                                            s3 = s10;
                                                                                                            if (i210 >= ((Long) method7.invoke(invoke8, new Object[1])).longValue()) {
                                                                                                                break;
                                                                                                            } else {
                                                                                                                i14 = 0;
                                                                                                            }
                                                                                                        }
                                                                                                        method9.invoke(newInstance8, bArr27, Integer.valueOf(i14), Integer.valueOf((int) r14));
                                                                                                        int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                                        int i212 = (((r14 * 141) + (i210 * (-279))) - (~(-(-(((i210 ^ currentTimeMillis11) | (i210 & currentTimeMillis11)) * 140))))) - 1;
                                                                                                        int i213 = ~r14;
                                                                                                        int i214 = (i213 & i210) | (i213 ^ i210);
                                                                                                        int i215 = ~i214;
                                                                                                        Object obj23 = invoke8;
                                                                                                        int i216 = ~currentTimeMillis11;
                                                                                                        Method method13 = method7;
                                                                                                        int i217 = ~(i216 | i210);
                                                                                                        int i218 = i212 + (((i215 ^ i217) | (i217 & i215)) * (-280));
                                                                                                        int i219 = ~i210;
                                                                                                        int i220 = ~((i219 & r14) | (i219 ^ r14));
                                                                                                        int i221 = ~((i216 & r14) | (i216 ^ r14));
                                                                                                        int i222 = (i221 & i220) | (i220 ^ i221);
                                                                                                        int i223 = ~((currentTimeMillis11 & i214) | (i214 ^ currentTimeMillis11));
                                                                                                        i210 = (i218 - (~(((i222 & i223) | (i222 ^ i223)) * 140))) - 1;
                                                                                                        method8 = method12;
                                                                                                        s10 = s3;
                                                                                                        s = s2;
                                                                                                        invoke8 = obj23;
                                                                                                        method7 = method13;
                                                                                                    }
                                                                                                    i13 = 0;
                                                                                                    bArr3 = (byte[]) method10.invoke(newInstance8, new Object[i13]);
                                                                                                    try {
                                                                                                        method11.invoke(newInstance7, new Object[i13]);
                                                                                                        method11.invoke(newInstance8, new Object[i13]);
                                                                                                    } catch (Exception unused6) {
                                                                                                    }
                                                                                                    try {
                                                                                                        bArr4 = $$a;
                                                                                                        invoke4 = Class.class.getMethod($$c(bArr4[50], bArr4[68], (short) 445), null).invoke(AFa1vSDK.class, null);
                                                                                                        byte b70 = bArr4[61];
                                                                                                        byte b71 = bArr4[5];
                                                                                                        s4 = (short) 278;
                                                                                                        declaredConstructor = Class.forName($$c(b70, b71, (short) ((b71 ^ 313) | (b71 & 313)))).getDeclaredConstructor(Class.forName($$c(bArr4[24], bArr4[8], s4)), Class.forName($$c(bArr4[24], bArr4[13], (short) 260)));
                                                                                                    } catch (Throwable th51) {
                                                                                                        Throwable cause29 = th51.getCause();
                                                                                                        if (cause29 == null) {
                                                                                                            throw th51;
                                                                                                        }
                                                                                                        throw cause29;
                                                                                                    }
                                                                                                } catch (Throwable th52) {
                                                                                                    th = th52;
                                                                                                    r14 = zipFile7;
                                                                                                }
                                                                                            } catch (Throwable th53) {
                                                                                                th = th53;
                                                                                                r14 = zipFile7;
                                                                                                th = th;
                                                                                                zipFile3 = r14;
                                                                                                zipFile3.close();
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (Throwable th54) {
                                                                                            Throwable cause30 = th54.getCause();
                                                                                            if (cause30 == null) {
                                                                                                throw th54;
                                                                                            }
                                                                                            throw cause30;
                                                                                        }
                                                                                    } catch (Throwable th55) {
                                                                                        th = th55;
                                                                                        zipFile2 = zipFile7;
                                                                                        r14 = zipFile2;
                                                                                        th = th;
                                                                                        zipFile3 = r14;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            Class<?> cls23 = Class.forName($$c(bArr4[24], bArr4[8], s4));
                                                                                            byte b72 = bArr4[5];
                                                                                            byte b73 = bArr4[148];
                                                                                            invoke3 = declaredConstructor.newInstance(cls23.getMethod($$c(b72, b73, (short) ((b73 ^ 208) | (b73 & 208))), byte[].class).invoke(null, bArr3), invoke4);
                                                                                            try {
                                                                                                byte b74 = bArr4[61];
                                                                                                byte b75 = bArr4[149];
                                                                                                Field declaredField = Class.forName($$c(b74, b75, (short) ((b75 ^ 233) | (b75 & 233)))).getDeclaredField($$c(bArr4[18], (byte) (-bArr4[466]), (short) ComposerKt.referenceKey));
                                                                                                declaredField.setAccessible(true);
                                                                                                Object obj24 = declaredField.get(invoke4);
                                                                                                Class<?> cls24 = obj24.getClass();
                                                                                                Field declaredField2 = cls24.getDeclaredField($$c(bArr4[33], bArr4[69], (short) 199));
                                                                                                declaredField2.setAccessible(true);
                                                                                                Field declaredField3 = cls24.getDeclaredField($$c(bArr4[33], bArr4[77], (short) 176));
                                                                                                declaredField3.setAccessible(true);
                                                                                                Object obj25 = declaredField2.get(obj24);
                                                                                                Object obj26 = declaredField3.get(obj24);
                                                                                                Object obj27 = declaredField.get(invoke3);
                                                                                                ArrayList arrayList = new ArrayList((List) obj25);
                                                                                                try {
                                                                                                    try {
                                                                                                        Class cls25 = (Class) Class.class.getMethod($$c(bArr4[50], bArr4[26], (short) 152), null).invoke(obj26.getClass(), null);
                                                                                                        int length2 = Array.getLength(obj26);
                                                                                                        Object newInstance9 = Array.newInstance((Class<?>) cls25, length2);
                                                                                                        for (int i224 = 0; i224 < length2; i224++) {
                                                                                                            try {
                                                                                                                Array.set(newInstance9, i224, Array.get(obj26, i224));
                                                                                                            } catch (Exception e6) {
                                                                                                                exc2 = e6;
                                                                                                                r14 = zipFile7;
                                                                                                                try {
                                                                                                                    short s15 = (short) 858;
                                                                                                                    try {
                                                                                                                        throw ((Throwable) Class.forName($$c(r5[24], r5[8], s15)).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[369]), r5[449], (short) 137)).append(invoke4).append($$c(r5[1], r5[325], s15)).toString(), exc2));
                                                                                                                    } catch (Throwable th56) {
                                                                                                                        Throwable cause31 = th56.getCause();
                                                                                                                        if (cause31 == null) {
                                                                                                                            throw th56;
                                                                                                                        }
                                                                                                                        throw cause31;
                                                                                                                    }
                                                                                                                } catch (Throwable th57) {
                                                                                                                    th = th57;
                                                                                                                    r14 = r14;
                                                                                                                    th = th;
                                                                                                                    zipFile3 = r14;
                                                                                                                    zipFile3.close();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        declaredField2.set(obj27, arrayList);
                                                                                                        declaredField3.set(obj27, newInstance9);
                                                                                                        int i225 = $10 + 11;
                                                                                                        $11 = i225 % 128;
                                                                                                        int i226 = i225 % 2;
                                                                                                        if (AFLogger == null) {
                                                                                                            AFLogger = invoke3;
                                                                                                        }
                                                                                                    } catch (Throwable th58) {
                                                                                                        th = th58;
                                                                                                        zipFile6 = zipFile7;
                                                                                                        Throwable th59 = th;
                                                                                                        try {
                                                                                                            Throwable cause32 = th59.getCause();
                                                                                                            if (cause32 == null) {
                                                                                                                throw th59;
                                                                                                            }
                                                                                                            throw cause32;
                                                                                                        } catch (Exception e7) {
                                                                                                            e = e7;
                                                                                                            exc2 = e;
                                                                                                            r14 = zipFile6;
                                                                                                            short s152 = (short) 858;
                                                                                                            throw ((Throwable) Class.forName($$c(r5[24], r5[8], s152)).getDeclaredConstructor(String.class, Throwable.class).newInstance(new StringBuilder().append($$c((byte) (-$$a[369]), r5[449], (short) 137)).append(invoke4).append($$c(r5[1], r5[325], s152)).toString(), exc2));
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th60) {
                                                                                                    th = th60;
                                                                                                    zipFile6 = zipFile7;
                                                                                                }
                                                                                            } catch (Exception e8) {
                                                                                                e = e8;
                                                                                                zipFile6 = zipFile7;
                                                                                            }
                                                                                        } catch (Throwable th61) {
                                                                                            Throwable cause33 = th61.getCause();
                                                                                            if (cause33 == null) {
                                                                                                throw th61;
                                                                                            }
                                                                                            throw cause33;
                                                                                        }
                                                                                    } catch (Throwable th62) {
                                                                                        th = th62;
                                                                                        th = th;
                                                                                        zipFile3 = r14;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                if (z5) {
                                                                                    int i227 = $11 + 9;
                                                                                    $10 = i227 % 128;
                                                                                    int i228 = i227 % 2;
                                                                                    try {
                                                                                        bArr2 = $$a;
                                                                                        cls = Class.forName($$c(bArr2[61], bArr2[13], (short) 490));
                                                                                        byte b76 = bArr2[77];
                                                                                        declaredMethod = cls.getDeclaredMethod($$c(b76, (byte) ((b76 ^ 16) | (b76 & 16)), (short) 133), String.class, Class.forName($$c(bArr2[24], bArr2[13], (short) 260)));
                                                                                        declaredMethod.setAccessible(true);
                                                                                        int i229 = 2 % 2;
                                                                                        try {
                                                                                            try {
                                                                                            } catch (Throwable th63) {
                                                                                                th = th63;
                                                                                                Throwable th64 = th;
                                                                                                Throwable cause34 = th64.getCause();
                                                                                                if (cause34 == null) {
                                                                                                    throw th64;
                                                                                                }
                                                                                                throw cause34;
                                                                                            }
                                                                                        } catch (Throwable th65) {
                                                                                            th = th65;
                                                                                        }
                                                                                    } catch (Throwable th66) {
                                                                                        th = th66;
                                                                                        th = th;
                                                                                        zipFile4 = zipFile7;
                                                                                        zipFile3 = zipFile4;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                    try {
                                                                                        Object invoke9 = declaredMethod.invoke(invoke3, str2, Class.class.getMethod($$c(bArr2[50], bArr2[68], (short) 445), null).invoke(AFa1vSDK.class, null));
                                                                                        if (invoke9 != null) {
                                                                                            int i230 = $10 + 33;
                                                                                            $11 = i230 % 128;
                                                                                            if (i230 % 2 == 0) {
                                                                                                cls.getDeclaredMethod($$c(bArr2[85], bArr2[23317], (short) 8179), new Class[0]).invoke(invoke3, new Object[0]);
                                                                                            } else {
                                                                                                cls.getDeclaredMethod($$c(bArr2[26], bArr2[449], (short) 801), new Class[0]).invoke(invoke3, new Object[0]);
                                                                                            }
                                                                                        }
                                                                                        obj15 = invoke9;
                                                                                    } catch (Throwable th67) {
                                                                                        th = th67;
                                                                                        th = th;
                                                                                        zipFile4 = zipFile7;
                                                                                        zipFile3 = zipFile4;
                                                                                        zipFile3.close();
                                                                                        throw th;
                                                                                    }
                                                                                } else {
                                                                                    String str5 = str2;
                                                                                    byte[] bArr28 = $$a;
                                                                                    Class<?> cls26 = Class.forName($$c(bArr28[24], bArr28[13], (short) 260));
                                                                                    byte b77 = bArr28[77];
                                                                                    Method declaredMethod3 = cls26.getDeclaredMethod($$c(b77, (byte) ((b77 ^ 16) | (b77 & 16)), (short) 133), String.class);
                                                                                    try {
                                                                                        declaredMethod3.setAccessible(true);
                                                                                        obj15 = declaredMethod3.invoke(invoke3, str5);
                                                                                    } catch (InvocationTargetException e9) {
                                                                                        try {
                                                                                            throw ((Exception) e9.getCause());
                                                                                        } catch (ClassNotFoundException unused7) {
                                                                                            obj15 = null;
                                                                                            if (obj15 != null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (obj15 != null) {
                                                                                    break;
                                                                                }
                                                                                try {
                                                                                    Class cls27 = (Class) obj15;
                                                                                    byte[] bArr29 = $$a;
                                                                                    try {
                                                                                        str4 = $$c(bArr29[26], bArr29[146], (short) 125);
                                                                                        Constructor declaredConstructor2 = cls27.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                        declaredConstructor2.setAccessible(true);
                                                                                        if (z5) {
                                                                                            int i231 = $11;
                                                                                            int i232 = ((i231 | 31) << 1) - (i231 ^ 31);
                                                                                            $10 = i232 % 128;
                                                                                            if (i232 % 2 == 0) {
                                                                                                int i233 = 2 % 2;
                                                                                            }
                                                                                            z7 = false;
                                                                                        } else {
                                                                                            int i234 = $10;
                                                                                            int i235 = ((i234 | 9) << 1) - (i234 ^ 9);
                                                                                            $11 = i235 % 128;
                                                                                            int i236 = i235 % 2;
                                                                                            z7 = true;
                                                                                        }
                                                                                        unregisterClient = declaredConstructor2.newInstance(invoke3, Boolean.valueOf(z7));
                                                                                        byte[] bArr30 = new byte[12904];
                                                                                        zipFile5 = zipFile7;
                                                                                        try {
                                                                                            try {
                                                                                                short s16 = s2;
                                                                                                short s17 = s3;
                                                                                                try {
                                                                                                    Object[] objArr14 = {Class.forName($$c(bArr29[24], bArr29[33], s16)).getDeclaredConstructor(Class.forName($$c(bArr29[24], bArr29[8], s17))).newInstance(zipFile5.getInputStream(zipFile5.getEntry($$c(bArr29[193], bArr29[146], (short) 93).substring(1))))};
                                                                                                    byte b78 = bArr29[24];
                                                                                                    short s18 = (short) 690;
                                                                                                    Object newInstance10 = Class.forName($$c(b78, b78, s18)).getDeclaredConstructor(Class.forName($$c(bArr29[24], bArr29[8], s17))).newInstance(objArr14);
                                                                                                    try {
                                                                                                        byte b79 = bArr29[24];
                                                                                                        Class.forName($$c(b79, b79, s18)).getMethod($$c(bArr29[10], (byte) (bArr29[182] + 1), (short) 668), byte[].class).invoke(newInstance10, bArr30);
                                                                                                        int i237 = $11;
                                                                                                        int i238 = (i237 & 7) + (i237 | 7);
                                                                                                        $10 = i238 % 128;
                                                                                                        int i239 = i238 % 2;
                                                                                                        try {
                                                                                                            byte b80 = bArr29[24];
                                                                                                            try {
                                                                                                                Class.forName($$c(b80, b80, s18)).getMethod($$c(bArr29[26], bArr29[449], (short) 801), null).invoke(newInstance10, null);
                                                                                                                try {
                                                                                                                    i163 = Math.abs(i12);
                                                                                                                    int i240 = 2 % 2;
                                                                                                                    bArr21 = bArr30;
                                                                                                                    i162 = 12867;
                                                                                                                    s = s16;
                                                                                                                    zipFile = zipFile5;
                                                                                                                    i2 = i4;
                                                                                                                    obj11 = obj20;
                                                                                                                    i164 = 1;
                                                                                                                    cls15 = cls27;
                                                                                                                    r14 = zipFile5;
                                                                                                                } catch (Throwable th68) {
                                                                                                                    th = th68;
                                                                                                                    th = th;
                                                                                                                    zipFile3 = zipFile5;
                                                                                                                    zipFile3.close();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th69) {
                                                                                                                th = th69;
                                                                                                                Throwable th70 = th;
                                                                                                                Throwable cause35 = th70.getCause();
                                                                                                                if (cause35 == null) {
                                                                                                                    throw th70;
                                                                                                                }
                                                                                                                throw cause35;
                                                                                                            }
                                                                                                        } catch (Throwable th71) {
                                                                                                            th = th71;
                                                                                                        }
                                                                                                    } catch (Throwable th72) {
                                                                                                        Throwable cause36 = th72.getCause();
                                                                                                        if (cause36 == null) {
                                                                                                            throw th72;
                                                                                                        }
                                                                                                        throw cause36;
                                                                                                    }
                                                                                                } catch (Throwable th73) {
                                                                                                    Throwable cause37 = th73.getCause();
                                                                                                    if (cause37 == null) {
                                                                                                        throw th73;
                                                                                                    }
                                                                                                    throw cause37;
                                                                                                }
                                                                                            } catch (Throwable th74) {
                                                                                                Throwable cause38 = th74.getCause();
                                                                                                if (cause38 == null) {
                                                                                                    throw th74;
                                                                                                }
                                                                                                throw cause38;
                                                                                            }
                                                                                        } catch (Throwable th75) {
                                                                                            th = th75;
                                                                                            zipFile5 = zipFile5;
                                                                                            th = th;
                                                                                            zipFile3 = zipFile5;
                                                                                            zipFile3.close();
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th76) {
                                                                                        th = th76;
                                                                                        zipFile5 = zipFile7;
                                                                                    }
                                                                                } catch (Throwable th77) {
                                                                                    th = th77;
                                                                                    zipFile5 = zipFile7;
                                                                                }
                                                                            } catch (Throwable th78) {
                                                                                th = th78;
                                                                                i4 = i2;
                                                                            }
                                                                        } catch (Throwable th79) {
                                                                            Throwable cause39 = th79.getCause();
                                                                            if (cause39 == null) {
                                                                                throw th79;
                                                                            }
                                                                            throw cause39;
                                                                        }
                                                                    }
                                                                    c2 = c3;
                                                                    i712 = i7;
                                                                    z = z4;
                                                                    z2 = z11;
                                                                    zArr = zArr4;
                                                                    $$c = str;
                                                                    objArr = objArr2;
                                                                    zArr3 = zArr6;
                                                                    i2 = i4;
                                                                    c = 448;
                                                                    i3 = ((i5 & 13) + (i5 | 13)) - 12;
                                                                    zArr2 = zArr5;
                                                                } catch (Throwable th80) {
                                                                    th = th80;
                                                                    Throwable th81 = th;
                                                                    cause = th81.getCause();
                                                                    if (cause != null) {
                                                                        throw th81;
                                                                    }
                                                                    throw cause;
                                                                }
                                                            } catch (Throwable th82) {
                                                                th = th82;
                                                                Throwable th812 = th;
                                                                cause = th812.getCause();
                                                                if (cause != null) {
                                                                }
                                                            }
                                                        } catch (Throwable th83) {
                                                            th = th83;
                                                        }
                                                    } catch (Throwable th84) {
                                                        Throwable cause40 = th84.getCause();
                                                        if (cause40 == null) {
                                                            throw th84;
                                                        }
                                                        throw cause40;
                                                    }
                                                } catch (Throwable th85) {
                                                    Throwable cause41 = th85.getCause();
                                                    if (cause41 == null) {
                                                        throw th85;
                                                    }
                                                    throw cause41;
                                                }
                                            } catch (Throwable th86) {
                                                Throwable cause42 = th86.getCause();
                                                if (cause42 == null) {
                                                    throw th86;
                                                }
                                                throw cause42;
                                            }
                                        } catch (Throwable th87) {
                                            th = th87;
                                            zipFile2 = zipFile;
                                            i4 = i2;
                                        }
                                    } catch (Throwable th88) {
                                        Throwable cause43 = th88.getCause();
                                        if (cause43 == null) {
                                            throw th88;
                                        }
                                        throw cause43;
                                    }
                                } catch (Throwable th89) {
                                    Throwable cause44 = th89.getCause();
                                    if (cause44 == null) {
                                        throw th89;
                                    }
                                    throw cause44;
                                }
                            }
                            boolean z112 = z3;
                            c2 = c3;
                            i712 = i7;
                            z = z4;
                            z2 = z112;
                            zArr = zArr4;
                            $$c = str;
                            objArr = objArr2;
                            zArr3 = zArr6;
                            i2 = i4;
                            c = 448;
                            i3 = ((i5 & 13) + (i5 | 13)) - 12;
                            zArr2 = zArr5;
                        }
                        return;
                    }
                    obj2 = null;
                    c = 448;
                    c2 = 24;
                    if (invoke == null) {
                    }
                    if (obj2 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr9222 = $$a;
                    byte b5222 = bArr9222[24];
                    byte b6222 = bArr9222[448];
                    objArr = (Object[]) Array.newInstance(Class.forName($$c(b5222, b6222, (short) (b6222 | 932))), 7);
                    objArr[0] = null;
                    objArr[1] = invoke2;
                    objArr[2] = invoke;
                    objArr[3] = obj2;
                    objArr[4] = invoke2;
                    objArr[5] = invoke;
                    objArr[6] = obj2;
                    zArr = new boolean[]{false, true, true, true, true, true, true};
                    zArr2 = new boolean[]{false, false, false, false, true, true, true};
                    zArr3 = new boolean[]{false, false, true, true, false, true, true};
                    Class<?> cls4222 = Class.forName($$c(bArr9222[68], bArr9222[69], (short) 898));
                    i15 = cls4222.getDeclaredField($$c(bArr9222[60], bArr9222[28], (short) 875)).getInt(cls4222);
                    if (i15 < 34) {
                    }
                    if (i15 != 29) {
                        int i822 = $11;
                        int i832 = (i822 & 57) + (i822 | 57);
                        $10 = i832 % 128;
                        int i842 = i832 % 2;
                        z8 = true;
                        zArr3[0] = z8;
                        if (i15 >= 21) {
                        }
                        zArr3[c5] = z9;
                        zArr3[4] = i15 >= 21;
                        int i72222 = 2 % 2;
                        z2 = false;
                        i3 = 0;
                        while (!z2) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            if (zArr3[i3]) {
                            }
                            boolean z1122 = z3;
                            c2 = c3;
                            i712 = i7;
                            z = z4;
                            z2 = z1122;
                            zArr = zArr4;
                            $$c = str;
                            objArr = objArr2;
                            zArr3 = zArr6;
                            i2 = i4;
                            c = 448;
                            i3 = ((i5 & 13) + (i5 | 13)) - 12;
                            zArr2 = zArr5;
                        }
                    }
                    z8 = false;
                    zArr3[0] = z8;
                    if (i15 >= 21) {
                    }
                    zArr3[c5] = z9;
                    zArr3[4] = i15 >= 21;
                    int i722222 = 2 % 2;
                    z2 = false;
                    i3 = 0;
                    while (!z2) {
                    }
                }
                invoke2 = null;
                int i7122 = 2;
                if (obj != null) {
                }
                obj2 = null;
                c = 448;
                c2 = 24;
                if (invoke == null) {
                }
                if (obj2 == null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr92222 = $$a;
                byte b52222 = bArr92222[24];
                byte b62222 = bArr92222[448];
                objArr = (Object[]) Array.newInstance(Class.forName($$c(b52222, b62222, (short) (b62222 | 932))), 7);
                objArr[0] = null;
                objArr[1] = invoke2;
                objArr[2] = invoke;
                objArr[3] = obj2;
                objArr[4] = invoke2;
                objArr[5] = invoke;
                objArr[6] = obj2;
                zArr = new boolean[]{false, true, true, true, true, true, true};
                zArr2 = new boolean[]{false, false, false, false, true, true, true};
                zArr3 = new boolean[]{false, false, true, true, false, true, true};
                Class<?> cls42222 = Class.forName($$c(bArr92222[68], bArr92222[69], (short) 898));
                i15 = cls42222.getDeclaredField($$c(bArr92222[60], bArr92222[28], (short) 875)).getInt(cls42222);
                if (i15 < 34) {
                }
                if (i15 != 29) {
                }
                z8 = false;
                zArr3[0] = z8;
                if (i15 >= 21) {
                }
                zArr3[c5] = z9;
                zArr3[4] = i15 >= 21;
                int i7222222 = 2 % 2;
                z2 = false;
                i3 = 0;
                while (!z2) {
                }
            }
            if (obj != null) {
            }
            invoke2 = null;
            int i71222 = 2;
            if (obj != null) {
            }
            obj2 = null;
            c = 448;
            c2 = 24;
            if (invoke == null) {
            }
            if (obj2 == null) {
            }
            if (invoke2 == null) {
            }
            byte[] bArr922222 = $$a;
            byte b522222 = bArr922222[24];
            byte b622222 = bArr922222[448];
            objArr = (Object[]) Array.newInstance(Class.forName($$c(b522222, b622222, (short) (b622222 | 932))), 7);
            objArr[0] = null;
            objArr[1] = invoke2;
            objArr[2] = invoke;
            objArr[3] = obj2;
            objArr[4] = invoke2;
            objArr[5] = invoke;
            objArr[6] = obj2;
            zArr = new boolean[]{false, true, true, true, true, true, true};
            zArr2 = new boolean[]{false, false, false, false, true, true, true};
            zArr3 = new boolean[]{false, false, true, true, false, true, true};
            Class<?> cls422222 = Class.forName($$c(bArr922222[68], bArr922222[69], (short) 898));
            i15 = cls422222.getDeclaredField($$c(bArr922222[60], bArr922222[28], (short) 875)).getInt(cls422222);
            if (i15 < 34) {
            }
            if (i15 != 29) {
            }
            z8 = false;
            zArr3[0] = z8;
            if (i15 >= 21) {
            }
            zArr3[c5] = z9;
            zArr3[4] = i15 >= 21;
            int i72222222 = 2 % 2;
            z2 = false;
            i3 = 0;
            while (!z2) {
            }
        }
        invoke = null;
        if (obj != null) {
        }
        invoke2 = null;
        int i712222 = 2;
        if (obj != null) {
        }
        obj2 = null;
        c = 448;
        c2 = 24;
        if (invoke == null) {
        }
        if (obj2 == null) {
        }
        if (invoke2 == null) {
        }
        byte[] bArr9222222 = $$a;
        byte b5222222 = bArr9222222[24];
        byte b6222222 = bArr9222222[448];
        objArr = (Object[]) Array.newInstance(Class.forName($$c(b5222222, b6222222, (short) (b6222222 | 932))), 7);
        objArr[0] = null;
        objArr[1] = invoke2;
        objArr[2] = invoke;
        objArr[3] = obj2;
        objArr[4] = invoke2;
        objArr[5] = invoke;
        objArr[6] = obj2;
        zArr = new boolean[]{false, true, true, true, true, true, true};
        zArr2 = new boolean[]{false, false, false, false, true, true, true};
        zArr3 = new boolean[]{false, false, true, true, false, true, true};
        Class<?> cls4222222 = Class.forName($$c(bArr9222222[68], bArr9222222[69], (short) 898));
        i15 = cls4222222.getDeclaredField($$c(bArr9222222[60], bArr9222222[28], (short) 875)).getInt(cls4222222);
        if (i15 < 34) {
        }
        if (i15 != 29) {
        }
        z8 = false;
        zArr3[0] = z8;
        if (i15 >= 21) {
        }
        zArr3[c5] = z9;
        zArr3[4] = i15 >= 21;
        int i722222222 = 2 % 2;
        z2 = false;
        i3 = 0;
        while (!z2) {
        }
        if (obj != null) {
        }
        invoke = null;
        if (obj != null) {
        }
        invoke2 = null;
        int i7122222 = 2;
        if (obj != null) {
        }
        obj2 = null;
        c = 448;
        c2 = 24;
        if (invoke == null) {
        }
        if (obj2 == null) {
        }
        if (invoke2 == null) {
        }
        byte[] bArr92222222 = $$a;
        byte b52222222 = bArr92222222[24];
        byte b62222222 = bArr92222222[448];
        objArr = (Object[]) Array.newInstance(Class.forName($$c(b52222222, b62222222, (short) (b62222222 | 932))), 7);
        objArr[0] = null;
        objArr[1] = invoke2;
        objArr[2] = invoke;
        objArr[3] = obj2;
        objArr[4] = invoke2;
        objArr[5] = invoke;
        objArr[6] = obj2;
        zArr = new boolean[]{false, true, true, true, true, true, true};
        zArr2 = new boolean[]{false, false, false, false, true, true, true};
        zArr3 = new boolean[]{false, false, true, true, false, true, true};
        Class<?> cls42222222 = Class.forName($$c(bArr92222222[68], bArr92222222[69], (short) 898));
        i15 = cls42222222.getDeclaredField($$c(bArr92222222[60], bArr92222222[28], (short) 875)).getInt(cls42222222);
        if (i15 < 34) {
        }
        if (i15 != 29) {
        }
        z8 = false;
        zArr3[0] = z8;
        if (i15 >= 21) {
        }
        zArr3[c5] = z9;
        zArr3[4] = i15 >= 21;
        int i7222222222 = 2 % 2;
        z2 = false;
        i3 = 0;
        while (!z2) {
        }
    }

    public static int getMediationNetwork(int i2) {
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = i4 + 87;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj = unregisterClient;
        int i6 = (i4 & 103) + (i4 | 103);
        $11 = i6 % 128;
        int i7 = i6 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            byte b = bArr[26];
            byte b2 = bArr[146];
            int intValue = ((Integer) Class.forName($$c(b, b2, (short) ((b2 ^ 592) | (b2 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[182], bArr[5]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i8 = $10;
            int i9 = (i8 ^ 57) + ((i8 & 57) << 1);
            $11 = i9 % 128;
            if (i9 % 2 != 0) {
                return intValue;
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

    public static int getMonetizationNetwork(Object obj) {
        int i2 = 2 % 2;
        int i3 = $10 + 9;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        Object obj2 = unregisterClient;
        int i6 = (i4 & 23) + (i4 | 23);
        $10 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = ((i4 | 43) << 1) - (i4 ^ 43);
        $10 = i8 % 128;
        int i9 = i8 % 2;
        try {
            byte[] bArr = $$a;
            byte b = bArr[26];
            byte b2 = bArr[146];
            return ((Integer) Class.forName($$c(b, b2, (short) ((b2 ^ 592) | (b2 & 592))), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[8], bArr[940]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getRevenue(int i2, int i3, char c) {
        int i4 = 2 % 2;
        int i5 = $10 + 23;
        int i6 = i5 % 128;
        $11 = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = unregisterClient;
        int i7 = i6 + 71;
        int i8 = i7 % 128;
        $10 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 3;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte[] bArr = $$a;
            byte b = bArr[26];
            byte b2 = bArr[146];
            Object invoke = Class.forName($$c(b, b2, (short) (b2 | 592)), true, (ClassLoader) AFLogger).getMethod($$c(bArr[50], bArr[4], bArr[105]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj2, objArr);
            int i12 = $11;
            int i13 = (i12 ^ 53) + ((i12 & 53) << 1);
            $10 = i13 % 128;
            if (i13 % 2 == 0) {
                return invoke;
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

    private AFa1vSDK() {
    }
}

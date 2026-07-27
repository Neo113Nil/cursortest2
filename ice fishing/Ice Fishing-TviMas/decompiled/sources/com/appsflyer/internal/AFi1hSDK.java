package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.PointerIconCompat;
import com.google.zxing.pdf417.PDF417Common;
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
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public class AFi1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger;
    private static long afInfoLog;
    private static byte[] afRDLog;
    private static byte[] d;
    private static byte[] e;
    private static long force;
    private static int i;
    public static final Map registerClient;
    private static Object unregisterClient;
    private static long v;
    public static final Map valueOf;
    private static int w;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r6 = (r1 ^ 3) + ((r1 & 3) << 1);
        com.appsflyer.internal.AFi1hSDK.$11 = r6 % 128;
        r6 = r6 % 2;
        r1 = 0;
        r6 = r5;
        r5 = r4;
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r2 = r2 + r5;
        r5 = r2 * (-864);
        r8 = ((-2598) ^ r5) + ((r5 & (-2598)) << 1);
        r5 = ~r2;
        r7 = ~r14;
        r8 = r8 + ((r5 | (~((2 ^ r7) | (2 & r7)))) * (-865));
        r5 = (~(r14 | (-3))) * 865;
        r2 = ~r2;
        r2 = (((~((r2 & r7) | (r2 ^ r7))) | (~((r7 ^ (-3)) | (r7 & (-3))))) * 865) + (((r8 | r5) << 1) - (r5 ^ r8));
        r5 = com.appsflyer.internal.AFi1hSDK.$10 + 83;
        com.appsflyer.internal.AFi1hSDK.$11 = r5 % 128;
        r5 = r5 % 2;
        r5 = r6;
        r4 = r2;
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r15 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r15 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr;
        byte[] bArr2;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = $10;
        int i10 = i9 + 39;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            i4 = i2 + 37;
            int i11 = i3 + 156;
            i5 = (i11 ^ (-50)) + ((i11 & (-50)) << 1);
            bArr = $$a;
            bArr2 = new byte[i4];
            i6 = s;
            i6 = s;
        } else {
            i4 = ((i2 | 1) << 1) - (i2 ^ 1);
            i5 = ((i3 ^ 35) + ((i3 & 35) << 1)) - 2;
            int i12 = s + 4;
            bArr = $$a;
            bArr2 = new byte[i4];
            i6 = i12;
            i6 = i12;
        }
        while (true) {
            int i13 = ((i7 | 1) << 1) - (i7 ^ 1);
            bArr2[i7] = (byte) i5;
            int i14 = (i6 ^ 1) + ((i6 & 1) << 1);
            if (i13 == i4) {
                break;
            }
            int i15 = bArr[i14];
            int i16 = $10;
            int i17 = ((i16 | 35) << 1) - (i16 ^ 35);
            $11 = i17 % 128;
            int i18 = i17 % 2;
            byte[] bArr3 = bArr2;
            i6 = i14;
            i7 = i13;
            int i19 = i5;
            int i20 = i4;
            int i21 = i19 + i15;
            int i22 = i21 * (-864);
            int i23 = ((-2598) ^ i22) + ((i22 & (-2598)) << 1);
            int i24 = ~i21;
            int i25 = ~i2;
            int i26 = i23 + ((i24 | (~((2 ^ i25) | (2 & i25)))) * (-865));
            int i27 = (~(i2 | (-3))) * 865;
            int i28 = ~i21;
            int i29 = (((~((i28 & i25) | (i28 ^ i25))) | (~((i25 ^ (-3)) | (i25 & (-3))))) * 865) + (((i26 | i27) << 1) - (i27 ^ i26));
            int i30 = $10 + 83;
            $11 = i30 % 128;
            int i31 = i30 % 2;
            bArr2 = bArr3;
            i5 = i29;
            i4 = i20;
        }
        String str = new String(bArr2, 0);
        int i32 = $11;
        int i33 = (i32 ^ 111) + ((i32 & 111) << 1);
        $10 = i33 % 128;
        if (i33 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 & 49) + (i4 | 49);
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            byte[] bArr = new byte[1136];
            System.arraycopy("BÉ|h\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë3õô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7Í\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉHàô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b&Ë3õô\n\u000b\u0003\u0001\u0012á\u0016\u0014ò\f\nóû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë:îô\nÜ@5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8Ìî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006ü".getBytes("ISO-8859-1"), 0, bArr, 0, 1136);
            $$a = bArr;
            i2 = 52;
        } else {
            byte[] bArr2 = new byte[1136];
            System.arraycopy("BÉ|h\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\b\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë3õô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ7Í\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉHàô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b&Ë3õô\n\u000b\u0003\u0001\u0012á\u0016\u0014ò\f\nóû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë:îô\nÜ@5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ8Ìî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006ü".getBytes("ISO-8859-1"), 0, bArr2, 0, 1136);
            $$a = bArr2;
            i2 = 90;
        }
        $$b = i2;
        int i6 = $10 + 39;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:8|9|10|(1:12)(1:984)|13|(2:14|15)|(36:17|(3:19|20|21)|27|(3:29|30|31)(1:976)|32|33|(30:970|971|(27:966|967|38|(1:40)(1:(1:956)(3:957|958|959))|(1:42)(6:937|938|939|940|941|942)|(4:45|(2:47|48)(2:58|59)|49|50)|60|61|62|63|64|(1:66)(1:934)|67|(1:71)(1:933)|72|73|74|(2:76|(8:78|79|80|(1:82)(1:928)|83|84|(5:88|(46:90|91|92|93|(11:(3:96|97|98)|151|152|153|154|155|156|157|158|159|161)|173|(14:766|767|768|769|770|771|772|773|774|775|776|(16:(1:779)(1:(1:895)(2:896|(1:898)(1:899)))|780|781|782|783|784|785|786|787|(3:789|(8:791|792|793|(1:795)(1:801)|796|797|798|799)(2:802|803)|800)|804|805|(4:807|808|809|810)(1:(4:822|823|824|825)(13:(4:834|835|836|837)(11:845|846|847|848|849|850|851|852|853|854|813)|889|890|111|112|(2:114|(5:116|117|118|119|(3:121|122|123)(2:127|128))(2:133|(3:135|122|123)(2:136|128)))|137|138|139|140|141|142|143))|811|812|813)|900|901)(1:175)|176|177|178|179|180|181|182|183|184|185|186|187|188|189|190|191|192|193|194|195|196|197|198|199|200|201|202|203|204|205|206|207|208|209|210|211|212|213|(20:214|215|216|217|(4:219|220|221|222)|236|237|238|239|240|241|242|243|(13:660|661|662|663|664|665|666|667|668|669|670|671|672)(5:245|246|247|248|249)|250|251|252|(36:498|499|(3:501|(2:503|504)|505)(1:648)|(1:507)(1:647)|508|509|510|511|512|513|514|515|516|517|(3:519|520|521)(1:602)|522|523|(2:525|(1:527)(1:528))|594|529|530|531|532|533|534|535|536|537|538|539|540|541|542|543|544|(3:546|(4:548|549|550|551)|558)(6:559|560|561|562|563|565))(42:254|255|256|257|258|259|260|261|262|263|264|265|266|267|268|269|(2:270|(3:272|273|(2:275|276)(2:277|278))(2:483|484))|279|280|281|282|283|284|285|286|287|288|289|290|291|292|293|295|296|297|298|(3:300|301|302)|327|328|329|(2:331|(1:333)(7:334|335|336|337|338|339|341))|345)|(13:347|348|349|350|351|352|353|354|355|356|357|(1:359)|360)(4:444|445|446|447)|(21:362|363|364|365|366|367|368|369|370|371|372|373|374|375|376|377|378|379|380|381|382)(1:420)))(1:922)|124|125|126)|924))|930|79|80|(0)(0)|83|84|(6:86|88|(0)(0)|124|125|126)|925|926)|37|38|(0)(0)|(0)(0)|(4:45|(0)(0)|49|50)|60|61|62|63|64|(0)(0)|67|(15:69|71|72|73|74|(0)|930|79|80|(0)(0)|83|84|(0)|925|926)|933|72|73|74|(0)|930|79|80|(0)(0)|83|84|(0)|925|926)|35|(0)|37|38|(0)(0)|(0)(0)|(0)|60|61|62|63|64|(0)(0)|67|(0)|933|72|73|74|(0)|930|79|80|(0)(0)|83|84|(0)|925|926)|977|978|979|27|(0)(0)|32|33|(0)|35|(0)|37|38|(0)(0)|(0)(0)|(0)|60|61|62|63|64|(0)(0)|67|(0)|933|72|73|74|(0)|930|79|80|(0)(0)|83|84|(0)|925|926) */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x1a35, code lost:
    
        r9 = r43;
        r14 = r54;
        r3 = r46.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r3.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x1a4f, code lost:
    
        if (r28 != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x1a51, code lost:
    
        r4 = com.appsflyer.internal.AFi1hSDK.$11;
        r6 = (r4 ^ 41) + ((r4 & 41) << 1);
        com.appsflyer.internal.AFi1hSDK.$10 = r6 % 128;
        r6 = r6 % 2;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x1a62, code lost:
    
        com.appsflyer.internal.AFi1hSDK.AFLogger = r3.newInstance(r2, java.lang.Boolean.valueOf(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x1a70, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x1a73, code lost:
    
        r4 = r39;
        r10 = true;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x1a82, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x1a83, code lost:
    
        r2 = r0;
        r14 = r14;
        r39 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x1a61, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:932:0x056f, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x0572, code lost:
    
        r25 = r11;
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05d1, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r7, r5[80], r5[239(0xef, float:3.35E-43)])).getMethod($$c((short) 303, r5[274(0x112, float:3.84E-43)], r5[0]), null).invoke(r15, null)).booleanValue() != false) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x1cdd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dd A[Catch: Exception -> 0x1dae, TRY_LEAVE, TryCatch #26 {Exception -> 0x1dae, blocks: (B:10:0x018c, B:12:0x01a0, B:48:0x03cb, B:54:0x042c, B:56:0x0432, B:57:0x0433, B:58:0x03dd, B:60:0x0434, B:63:0x048d, B:73:0x04d2, B:80:0x0562, B:83:0x056b, B:88:0x057d, B:111:0x1c79, B:116:0x1ce9, B:119:0x1cee, B:122:0x1cf9, B:126:0x1d7a, B:133:0x1cf5, B:139:0x1d0f, B:147:0x1d55, B:149:0x1d5b, B:150:0x1d5c, B:938:0x0346, B:945:0x1d91, B:947:0x1d98, B:948:0x1d99, B:951:0x1d9b, B:953:0x1da2, B:954:0x1da3, B:957:0x02f9, B:962:0x1da5, B:964:0x1dac, B:965:0x1dad, B:50:0x03f0, B:142:0x1d20, B:143:0x1d52, B:942:0x0390, B:940:0x0354, B:959:0x0319), top: B:9:0x018c, inners: #3, #21, #47, #51, #59 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x1d5d  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:934:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:955:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:966:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:970:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:976:0x029c  */
    /* JADX WARN: Type inference failed for: r10v146, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v129, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v108 */
    /* JADX WARN: Type inference failed for: r14v109 */
    /* JADX WARN: Type inference failed for: r14v110 */
    /* JADX WARN: Type inference failed for: r14v117 */
    /* JADX WARN: Type inference failed for: r14v120, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r14v123, types: [int] */
    /* JADX WARN: Type inference failed for: r14v124 */
    /* JADX WARN: Type inference failed for: r14v128 */
    /* JADX WARN: Type inference failed for: r14v129 */
    /* JADX WARN: Type inference failed for: r14v130 */
    /* JADX WARN: Type inference failed for: r14v138 */
    /* JADX WARN: Type inference failed for: r14v141 */
    /* JADX WARN: Type inference failed for: r14v147 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v193 */
    /* JADX WARN: Type inference failed for: r14v197 */
    /* JADX WARN: Type inference failed for: r14v198 */
    /* JADX WARN: Type inference failed for: r14v199 */
    /* JADX WARN: Type inference failed for: r14v200 */
    /* JADX WARN: Type inference failed for: r14v201 */
    /* JADX WARN: Type inference failed for: r14v203 */
    /* JADX WARN: Type inference failed for: r14v204 */
    /* JADX WARN: Type inference failed for: r14v206 */
    /* JADX WARN: Type inference failed for: r14v207 */
    /* JADX WARN: Type inference failed for: r14v208 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v85, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v97 */
    /* JADX WARN: Type inference failed for: r14v99, types: [int] */
    /* JADX WARN: Type inference failed for: r39v10 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v12 */
    /* JADX WARN: Type inference failed for: r39v13 */
    /* JADX WARN: Type inference failed for: r39v14 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r3v305, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v326, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v85, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v109, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v116, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r9v119 */
    /* JADX WARN: Type inference failed for: r9v152, types: [int] */
    /* JADX WARN: Type inference failed for: r9v156 */
    /* JADX WARN: Type inference failed for: r9v176 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v226, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v237 */
    /* JADX WARN: Type inference failed for: r9v238, types: [int] */
    /* JADX WARN: Type inference failed for: r9v248, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v256 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v269 */
    /* JADX WARN: Type inference failed for: r9v273, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v281, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v299 */
    /* JADX WARN: Type inference failed for: r9v300 */
    /* JADX WARN: Type inference failed for: r9v301 */
    /* JADX WARN: Type inference failed for: r9v304 */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        Object obj;
        Object obj2;
        Object invoke;
        Object invoke2;
        Object newInstance;
        int i2;
        boolean z;
        boolean[] zArr;
        String str;
        boolean[] zArr2;
        boolean z2;
        short s;
        int i3;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        byte b;
        int i4;
        int i5;
        ?? r14;
        Object obj3;
        int i6;
        byte b2;
        int i7;
        boolean z5;
        Object obj4;
        boolean z6;
        Random random;
        short s2;
        byte[] bArr;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i9;
        Object obj13;
        String sb;
        ?? r39;
        Object obj14;
        Object obj15;
        int i10;
        ?? r9;
        Throwable th;
        ZipFile zipFile;
        byte b3;
        byte b4;
        Object newInstance2;
        ZipFile zipFile2;
        byte b5;
        Object obj16;
        int i11;
        short s3;
        Object invoke3;
        int i12;
        short s4;
        ?? r142;
        Object obj17;
        ZipFile zipFile3;
        byte[] bArr2;
        Class<?> cls;
        Method declaredMethod;
        byte b6;
        ZipFile zipFile4;
        int i13;
        int i14;
        byte[] bArr3;
        ZipFile zipFile5;
        byte b7;
        Exception exc;
        int i15;
        int i16;
        char c;
        boolean z7;
        boolean z8;
        int i17;
        char c2;
        String $$c;
        int i18;
        init$0();
        System.currentTimeMillis();
        System.currentTimeMillis();
        try {
            boolean z9 = true;
            byte[] bArr4 = $$a;
            byte b8 = (byte) 81;
            int intValue = ((Integer) Class.forName($$c(bArr4[39], bArr4[194], bArr4[1063])).getMethod($$c(bArr4[495], bArr4[26], b8), Integer.TYPE, Integer.TYPE).invoke(null, 22, 3)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i19 = ~(((-105285765) & currentTimeMillis) | ((-105285765) ^ currentTimeMillis));
            int i20 = ((i19 & 153166336) | (153166336 ^ i19)) * 501;
            int i21 = ((177012528 | i20) << 1) - (i20 ^ 177012528);
            int i22 = ((i21 | (-13985856)) << 1) - ((-13985856) ^ i21);
            int i23 = ~currentTimeMillis;
            int i24 = (i23 & 1772168987) | (1772168987 ^ i23);
            int i25 = -(-((~((i24 & (-1724288416)) | (i24 ^ (-1724288416)))) * 501));
            int i26 = ((i22 | i25) << 1) - (i25 ^ i22);
            int i27 = ~((~intValue) | 1054756937);
            int i28 = (i27 & (-2145320906)) | (i27 ^ (-2145320906));
            int i29 = i28 * (-245);
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i30 = i28 * (-12250);
            int i31 = -(-(i26 * (-97)));
            int i32 = (i30 & i31) + (i30 | i31);
            int i33 = ~i26;
            int i34 = ~currentTimeMillis2;
            int i35 = ~((i33 ^ i34) | (i33 & i34));
            int i36 = ~i26;
            int i37 = ~((i36 ^ i29) | (i36 & i29));
            int i38 = (i32 - (~(-(-(((i35 ^ i37) | (i37 & i35)) * 98))))) - 1;
            int i39 = ~i29;
            int i40 = ~((i39 & i34) | (i39 ^ i34));
            int i41 = (i40 & i36) | (i36 ^ i40);
            int i42 = ~((i29 ^ currentTimeMillis2) | (i29 & currentTimeMillis2));
            int i43 = i38 + (((i41 & i42) | (i41 ^ i42)) * (-49));
            int i44 = ~((i36 ^ currentTimeMillis2) | (i36 & currentTimeMillis2));
            int i45 = ~(i29 | i26);
            int i46 = ((i44 & i45) | (i44 ^ i45)) * 49;
            int i47 = (i43 ^ i46) + ((i43 & i46) << 1);
            int i48 = -(-((~((1054756937 & intValue) | (1054756937 ^ intValue))) * (-245)));
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            int i50 = (~((intValue & 1054756937) | (1054756937 ^ intValue))) | 1943322504;
            int i51 = i50 * 245;
            int currentTimeMillis3 = (int) System.currentTimeMillis();
            int i52 = i50 * (-73500);
            int i53 = i49 * 302;
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            int i55 = (i51 ^ i49) | (i51 & i49);
            int i56 = (~((i55 & currentTimeMillis3) | (i55 ^ currentTimeMillis3))) * (-301);
            int i57 = (i54 ^ i56) + ((i56 & i54) << 1);
            int i58 = ~((~i49) | currentTimeMillis3);
            int i59 = ~((~currentTimeMillis3) | i51);
            int i60 = -(-(((i58 & i59) | (i58 ^ i59)) * (-301)));
            int i61 = ((i57 | i60) << 1) - (i60 ^ i57);
            int i62 = ~i49;
            int i63 = ~i51;
            int i64 = ~((i63 & currentTimeMillis3) | (i63 ^ currentTimeMillis3));
            if ((i61 - (~(-(-(((i62 & i64) | (i62 ^ i64)) * 301))))) - 1 == 0) {
                return;
            }
            force = 1695072490147805200L;
            w = 0;
            i = 2;
            valueOf = new HashMap();
            registerClient = new HashMap();
            try {
                String $$c2 = $$c((short) (-bArr4[533]), bArr4[495], bArr4[0]);
                String $$c3 = AFLogger == null ? $$c((short) 77, bArr4[123], bArr4[0]) : null;
                try {
                    int i65 = $$b;
                    int currentTimeMillis4 = (int) System.currentTimeMillis();
                    int i66 = i65 * 367;
                    int i67 = ((((-367) & i66) + (i66 | (-367))) - (~(-(-((((-1) ^ i65) | i65) * (-366)))))) - 1;
                    int i68 = ~i65;
                    int i69 = ~((i68 ^ currentTimeMillis4) | (i68 & currentTimeMillis4));
                    int i70 = i67 + ((i69 | ((-1) ^ i69)) * (-366));
                    int i71 = ~i65;
                    int i72 = (i68 ^ (-1)) | i68;
                    int i73 = ~((i72 & currentTimeMillis4) | (i72 ^ currentTimeMillis4));
                    int i74 = ((i71 & i73) | (i71 ^ i73)) * 366;
                    obj = Class.forName($$c((short) ((i70 & i74) + (i70 | i74)), bArr4[23], bArr4[1063])).getMethod($$c((short) 114, bArr4[6], bArr4[0]), new Class[0]).invoke(null, null);
                } catch (Exception unused) {
                    obj = null;
                }
                if (obj != null) {
                    int i75 = $10 + 67;
                    $11 = i75 % 128;
                    if (i75 % 2 == 0) {
                        try {
                            int i76 = 7 / 0;
                        } catch (Exception unused2) {
                        }
                    }
                    if (obj == null) {
                        int i77 = $10;
                        int i78 = (i77 ^ 107) + ((i77 & 107) << 1);
                        $11 = i78 % 128;
                        int i79 = i78 % 2;
                        try {
                            obj2 = obj.getClass().getMethod($$c((short) 172, $$a[79], (byte) 70), null).invoke(obj, null);
                        } catch (Exception unused3) {
                            obj2 = null;
                        }
                    } else {
                        obj2 = null;
                    }
                    int i80 = 2 % 2;
                    if (obj != null) {
                        try {
                            invoke = obj.getClass().getMethod($$c((short) 182, $$a[12], (byte) 70), null).invoke(obj, null);
                        } catch (Exception unused4) {
                        }
                        if (obj != null) {
                            try {
                                invoke2 = obj.getClass().getMethod($$c((short) 196, $$a[79], (byte) 70), null).invoke(obj, null);
                            } catch (Exception unused5) {
                            }
                            if (obj2 == null) {
                                newInstance = obj2;
                            } else if ($$c3 == null) {
                                newInstance = null;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                short s5 = (short) ComposerKt.referenceKey;
                                byte[] bArr5 = $$a;
                                try {
                                    newInstance = Class.forName($$c((short) 216, bArr5[80], bArr5[239])).getDeclaredConstructor(String.class).newInstance(sb2.append($$c(s5, bArr5[79], bArr5[12])).append($$c3).toString());
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause == null) {
                                        throw th2;
                                    }
                                    throw cause;
                                }
                            }
                            if (invoke2 == null) {
                                int i81 = 2 % 2;
                            } else {
                                short s6 = (short) 227;
                                byte[] bArr6 = $$a;
                                try {
                                    Object[] objArr = {$$c(s6, bArr6[26], bArr6[239])};
                                    Class<?> cls2 = Class.forName($$c((short) 240, bArr6[50], bArr6[239]));
                                    int i82 = $$b;
                                    try {
                                        invoke2 = Class.forName($$c((short) 216, bArr6[80], bArr6[239])).getDeclaredConstructor(String.class).newInstance(cls2.getMethod($$c((short) ((i82 & 165) | (i82 ^ 165)), bArr6[79], (byte) 70), String.class).invoke(null, objArr));
                                    } catch (Throwable th3) {
                                        Throwable cause2 = th3.getCause();
                                        if (cause2 == null) {
                                            throw th3;
                                        }
                                        throw cause2;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause3 = th4.getCause();
                                    if (cause3 == null) {
                                        throw th4;
                                    }
                                    throw cause3;
                                }
                            }
                            if (invoke == null && newInstance != null) {
                                int i83 = $10;
                                i17 = ((i83 | 61) << 1) - (i83 ^ 61);
                                $11 = i17 % 128;
                                if (i17 % 2 != 0) {
                                    short s7 = (short) 2841;
                                    byte[] bArr7 = $$a;
                                    $$c = $$c(s7, bArr7[107], bArr7[0]);
                                    i18 = 2;
                                    c2 = 0;
                                } else {
                                    byte[] bArr8 = $$a;
                                    c2 = 0;
                                    $$c = $$c((short) 265, bArr8[47], bArr8[0]);
                                    i18 = 2;
                                }
                                try {
                                    Object[] objArr2 = new Object[i18];
                                    objArr2[1] = $$c;
                                    objArr2[c2] = newInstance;
                                    short s8 = (short) 216;
                                    byte[] bArr9 = $$a;
                                    invoke = Class.forName($$c(s8, bArr9[80], bArr9[239])).getDeclaredConstructor(Class.forName($$c(s8, bArr9[80], bArr9[239])), String.class).newInstance(objArr2);
                                } catch (Throwable th5) {
                                    Throwable cause4 = th5.getCause();
                                    if (cause4 == null) {
                                        throw th5;
                                    }
                                    throw cause4;
                                }
                            }
                            short s9 = (short) 216;
                            byte[] bArr10 = $$a;
                            Object[] objArr3 = (Object[]) Array.newInstance(Class.forName($$c(s9, bArr10[80], bArr10[239])), 7);
                            objArr3[0] = null;
                            objArr3[1] = invoke;
                            objArr3[2] = newInstance;
                            objArr3[3] = invoke2;
                            objArr3[4] = invoke;
                            objArr3[5] = newInstance;
                            objArr3[6] = invoke2;
                            boolean[] zArr4 = {false, true, true, true, true, true, true};
                            boolean[] zArr5 = {false, false, false, false, true, true, true};
                            boolean[] zArr6 = new boolean[7];
                            zArr6[0] = false;
                            zArr6[1] = false;
                            zArr6[2] = true;
                            zArr6[3] = true;
                            zArr6[4] = false;
                            zArr6[5] = true;
                            zArr6[6] = true;
                            Class<?> cls3 = Class.forName($$c((short) 274, bArr10[114], bArr10[1063]));
                            i16 = cls3.getDeclaredField($$c((short) 297, bArr10[56], bArr10[126])).getInt(cls3);
                            boolean z10 = !(i16 >= 34);
                            if (i16 != 29 && i16 >= 26) {
                                z7 = true;
                                c = 0;
                            } else {
                                c = 0;
                                z7 = false;
                            }
                            zArr6[c] = z7;
                            Object[] objArr4 = objArr3;
                            if (i16 >= 21) {
                                int currentTimeMillis5 = (int) System.currentTimeMillis();
                                int i84 = ~(((-1342474293) & currentTimeMillis5) | ((-1342474293) ^ currentTimeMillis5));
                                int i85 = ~currentTimeMillis5;
                                int i86 = ((-1552206397) ^ i85) | ((-1552206397) & i85);
                                int i87 = 426427380 + (((~((i86 ^ (-233862860)) | (i86 & (-233862860)))) | i84) * 497);
                                int i88 = ~((233862859 ^ i85) | (233862859 & i85));
                                int i89 = (i88 ^ (-1576337152)) | (i88 & (-1576337152));
                                int i90 = ~(currentTimeMillis5 | (-209732105));
                                int i91 = (i87 - (~(-(-(((i89 & i90) | (i89 ^ i90)) * 497))))) - 1;
                                int currentTimeMillis6 = (int) System.currentTimeMillis();
                                int i92 = ~currentTimeMillis6;
                                int i93 = -(-(((~((i92 ^ (-1666617935)) | (i92 & (-1666617935)))) | 1648361484) * 529));
                                int i94 = ((722249322 | i93) << 1) - (722249322 ^ i93);
                                int i95 = ~((currentTimeMillis6 & (-1666617935)) | ((-1666617935) ^ currentTimeMillis6));
                                int i96 = -(-(((i95 & 2051623084) | (2051623084 ^ i95)) * 529));
                                if (i91 > ((i94 | i96) << 1) - (i94 ^ i96)) {
                                    z8 = true;
                                    zArr6[1] = z8;
                                    zArr6[4] = i16 < 21;
                                    i2 = 0;
                                    z = false;
                                    while (!z && i2 < 9) {
                                        if (zArr6[i2]) {
                                            zArr = zArr4;
                                            str = $$c2;
                                            zArr2 = zArr5;
                                            z2 = z9;
                                            s = s9;
                                            i3 = i2;
                                            zArr3 = zArr6;
                                            z3 = z10;
                                            z4 = z;
                                            b = b8;
                                            i4 = i4;
                                        } else {
                                            try {
                                                z5 = zArr4[i2];
                                                obj4 = objArr4[i2];
                                                z6 = zArr5[i2];
                                                if (z5) {
                                                    if (obj4 != null) {
                                                        int i97 = $11;
                                                        int i98 = (i97 & 119) + (i97 | 119);
                                                        $10 = i98 % 128;
                                                        int i99 = i98 % 2;
                                                        try {
                                                            byte[] bArr11 = $$a;
                                                        } catch (Throwable th6) {
                                                            try {
                                                                Throwable cause5 = th6.getCause();
                                                                if (cause5 == null) {
                                                                    throw th6;
                                                                }
                                                                throw cause5;
                                                            } catch (Throwable th7) {
                                                                zArr = zArr4;
                                                                str = $$c2;
                                                                zArr2 = zArr5;
                                                                s = s9;
                                                                i15 = i2;
                                                                zArr3 = zArr6;
                                                                z3 = z10;
                                                                z4 = z;
                                                                obj3 = th7;
                                                                b2 = b8;
                                                                i6 = i15;
                                                                int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                i3 = i6;
                                                                int i100 = -(-(i3 * (-613)));
                                                                int i101 = (615 & i100) + (i100 | 615);
                                                                int i102 = ~(((-2) ^ i3) | ((-2) & i3));
                                                                int i103 = (currentTimeMillis7 ^ i102) | (currentTimeMillis7 & i102);
                                                                int i104 = ~i3;
                                                                int i105 = ~(i104 | 1);
                                                                int i106 = (i101 - (~(((i103 & i105) | (i103 ^ i105)) * 614))) - 1;
                                                                int i107 = ~currentTimeMillis7;
                                                                int i108 = i102 | (~(((-2) ^ i107) | ((-2) & i107)));
                                                                int i109 = ~((i107 ^ i3) | (i107 & i3));
                                                                int i110 = ((i108 & i109) | (i108 ^ i109)) * (-1228);
                                                                int i111 = (i106 ^ i110) + ((i110 & i106) << 1);
                                                                int i112 = ((-2) & i104) | ((-2) ^ i104);
                                                                int i113 = ~((i112 & i107) | (i112 ^ i107));
                                                                int i114 = (~currentTimeMillis7) | 1;
                                                                int i115 = ((~((i114 & i3) | (i114 ^ i3))) | i113) * 614;
                                                                i7 = (i111 ^ i115) + ((i115 & i111) << 1);
                                                                while (i7 < 7) {
                                                                }
                                                                short s10 = (short) 1091;
                                                                byte[] bArr12 = $$a;
                                                                try {
                                                                    throw ((Throwable) Class.forName($$c((short) 314, bArr12[14], bArr12[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s10, bArr12[105], bArr12[44]), obj3));
                                                                } catch (Throwable th8) {
                                                                    Throwable cause6 = th8.getCause();
                                                                    if (cause6 == null) {
                                                                        throw th8;
                                                                    }
                                                                    throw cause6;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        short s11 = (short) 310;
                                                        byte[] bArr13 = $$a;
                                                        zArr = zArr4;
                                                        try {
                                                            StringBuilder append = sb3.append($$c(s11, bArr13[16], bArr13[44])).append(obj4);
                                                            short s12 = (short) 314;
                                                            int i116 = 2 % 2;
                                                            try {
                                                                throw ((Throwable) Class.forName($$c(s12, bArr13[14], bArr13[239])).getDeclaredConstructor(String.class).newInstance(append.append($$c(s12, bArr13[7], bArr13[49])).toString()));
                                                            } catch (Throwable th9) {
                                                                Throwable cause7 = th9.getCause();
                                                                if (cause7 == null) {
                                                                    throw th9;
                                                                }
                                                                throw cause7;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            obj3 = th;
                                                            str = $$c2;
                                                            zArr2 = zArr5;
                                                            s = s9;
                                                            i15 = i2;
                                                            zArr3 = zArr6;
                                                            z3 = z10;
                                                            z4 = z;
                                                            b2 = b8;
                                                            i6 = i15;
                                                            int currentTimeMillis72 = (int) System.currentTimeMillis();
                                                            i3 = i6;
                                                            int i1002 = -(-(i3 * (-613)));
                                                            int i1012 = (615 & i1002) + (i1002 | 615);
                                                            int i1022 = ~(((-2) ^ i3) | ((-2) & i3));
                                                            int i1032 = (currentTimeMillis72 ^ i1022) | (currentTimeMillis72 & i1022);
                                                            int i1042 = ~i3;
                                                            int i1052 = ~(i1042 | 1);
                                                            int i1062 = (i1012 - (~(((i1032 & i1052) | (i1032 ^ i1052)) * 614))) - 1;
                                                            int i1072 = ~currentTimeMillis72;
                                                            int i1082 = i1022 | (~(((-2) ^ i1072) | ((-2) & i1072)));
                                                            int i1092 = ~((i1072 ^ i3) | (i1072 & i3));
                                                            int i1102 = ((i1082 & i1092) | (i1082 ^ i1092)) * (-1228);
                                                            int i1112 = (i1062 ^ i1102) + ((i1102 & i1062) << 1);
                                                            int i1122 = ((-2) & i1042) | ((-2) ^ i1042);
                                                            int i1132 = ~((i1122 & i1072) | (i1122 ^ i1072));
                                                            int i1142 = (~currentTimeMillis72) | 1;
                                                            int i1152 = ((~((i1142 & i3) | (i1142 ^ i3))) | i1132) * 614;
                                                            i7 = (i1112 ^ i1152) + ((i1152 & i1112) << 1);
                                                            while (i7 < 7) {
                                                            }
                                                            short s102 = (short) 1091;
                                                            byte[] bArr122 = $$a;
                                                            throw ((Throwable) Class.forName($$c((short) 314, bArr122[14], bArr122[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s102, bArr122[105], bArr122[44]), obj3));
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        zArr = zArr4;
                                                    }
                                                }
                                                zArr = zArr4;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                zArr = zArr4;
                                                str = $$c2;
                                                zArr2 = zArr5;
                                                s = s9;
                                                i5 = i2;
                                                zArr3 = zArr6;
                                                z3 = z10;
                                                z4 = z;
                                                r14 = b8;
                                            }
                                            if (z5) {
                                                try {
                                                    random = new Random();
                                                    s2 = (short) 240;
                                                    try {
                                                        bArr = $$a;
                                                        str = $$c2;
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                    str = $$c2;
                                                }
                                                try {
                                                    try {
                                                        random.setSeed(((Long) Class.forName($$c(s2, bArr[50], bArr[239])).getMethod($$c((short) 332, bArr[4], bArr[0]), null).invoke(null, null)).longValue() ^ (-1388519198));
                                                        obj5 = null;
                                                        obj6 = null;
                                                        obj7 = null;
                                                        obj8 = null;
                                                        i8 = i4;
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                        zArr2 = zArr5;
                                                        zArr3 = zArr6;
                                                        z4 = z;
                                                        obj3 = th;
                                                        s = s9;
                                                        i6 = i2;
                                                        b2 = b8;
                                                        z3 = z10;
                                                        int currentTimeMillis722 = (int) System.currentTimeMillis();
                                                        i3 = i6;
                                                        int i10022 = -(-(i3 * (-613)));
                                                        int i10122 = (615 & i10022) + (i10022 | 615);
                                                        int i10222 = ~(((-2) ^ i3) | ((-2) & i3));
                                                        int i10322 = (currentTimeMillis722 ^ i10222) | (currentTimeMillis722 & i10222);
                                                        int i10422 = ~i3;
                                                        int i10522 = ~(i10422 | 1);
                                                        int i10622 = (i10122 - (~(((i10322 & i10522) | (i10322 ^ i10522)) * 614))) - 1;
                                                        int i10722 = ~currentTimeMillis722;
                                                        int i10822 = i10222 | (~(((-2) ^ i10722) | ((-2) & i10722)));
                                                        int i10922 = ~((i10722 ^ i3) | (i10722 & i3));
                                                        int i11022 = ((i10822 & i10922) | (i10822 ^ i10922)) * (-1228);
                                                        int i11122 = (i10622 ^ i11022) + ((i11022 & i10622) << 1);
                                                        int i11222 = ((-2) & i10422) | ((-2) ^ i10422);
                                                        int i11322 = ~((i11222 & i10722) | (i11222 ^ i10722));
                                                        int i11422 = (~currentTimeMillis722) | 1;
                                                        int i11522 = ((~((i11422 & i3) | (i11422 ^ i3))) | i11322) * 614;
                                                        i7 = (i11122 ^ i11522) + ((i11522 & i11122) << 1);
                                                        while (i7 < 7) {
                                                        }
                                                        short s1022 = (short) 1091;
                                                        byte[] bArr1222 = $$a;
                                                        throw ((Throwable) Class.forName($$c((short) 314, bArr1222[14], bArr1222[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s1022, bArr1222[105], bArr1222[44]), obj3));
                                                    }
                                                    while (obj5 == null) {
                                                        if (obj6 == null) {
                                                            obj12 = obj5;
                                                            i9 = 6;
                                                        } else if (obj7 == null) {
                                                            obj12 = obj5;
                                                            i9 = 5;
                                                        } else {
                                                            obj12 = obj5;
                                                            i9 = obj8 == null ? 4 : 3;
                                                        }
                                                        z4 = z;
                                                        Object obj18 = obj4;
                                                        try {
                                                            int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                            int i117 = (-130) - (~(-(-(i9 * 131))));
                                                            zArr2 = zArr5;
                                                            int i118 = ~i9;
                                                            zArr3 = zArr6;
                                                            int i119 = ~currentTimeMillis8;
                                                            int i120 = (i118 ^ i119) | (i119 & i118);
                                                            int i121 = ((i117 + ((~((i120 ^ 1) | (i120 & 1))) * 130)) - (~((~((~i9) | 1)) * (-260)))) - 1;
                                                            int i122 = i118 | 1;
                                                            int i123 = ((~((i122 ^ currentTimeMillis8) | (i122 & currentTimeMillis8))) | (~(((-2) ^ i9) | ((-2) & i9)))) * 130;
                                                            try {
                                                                StringBuilder sb4 = new StringBuilder((i121 ^ i123) + ((i123 & i121) << 1));
                                                                sb4.append('.');
                                                                int i124 = 0;
                                                                while (i124 < i9) {
                                                                    System.currentTimeMillis();
                                                                    System.currentTimeMillis();
                                                                    if (z6) {
                                                                        obj15 = obj18;
                                                                        int i125 = -(-random.nextInt(26));
                                                                        if (random.nextBoolean()) {
                                                                            i10 = ((i125 | 65) << 1) - (i125 ^ 65);
                                                                        } else {
                                                                            i10 = 95 - (~i125);
                                                                            System.currentTimeMillis();
                                                                            System.currentTimeMillis();
                                                                            int i126 = 2 % 2;
                                                                        }
                                                                        sb4.append((char) i10);
                                                                    } else {
                                                                        obj15 = obj18;
                                                                        int i127 = -(-random.nextInt(12));
                                                                        sb4.append((char) (((i127 | 8192) << 1) - (i127 ^ 8192)));
                                                                    }
                                                                    int i128 = (i124 ^ 79) + ((i124 & 79) << 1);
                                                                    i124 = ((i128 | (-78)) << 1) - (i128 ^ (-78));
                                                                    obj18 = obj15;
                                                                }
                                                                obj13 = obj18;
                                                                sb = sb4.toString();
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            zArr2 = zArr5;
                                                            zArr3 = zArr6;
                                                        }
                                                        if (obj6 == null) {
                                                            int i129 = $10;
                                                            int i130 = (i129 ^ 49) + ((i129 & 49) << 1);
                                                            $11 = i130 % 128;
                                                            int i131 = i130 % 2;
                                                            try {
                                                                Object[] objArr5 = {obj13, sb};
                                                                byte[] bArr14 = $$a;
                                                                r39 = random;
                                                                obj6 = Class.forName($$c(s9, bArr14[80], bArr14[239])).getDeclaredConstructor(Class.forName($$c(s9, bArr14[80], bArr14[239])), String.class).newInstance(objArr5);
                                                            } catch (Throwable th18) {
                                                                Throwable cause8 = th18.getCause();
                                                                if (cause8 == null) {
                                                                    throw th18;
                                                                }
                                                                throw cause8;
                                                            }
                                                        } else {
                                                            if (obj7 != null) {
                                                                if (obj8 == null) {
                                                                    System.currentTimeMillis();
                                                                    System.currentTimeMillis();
                                                                    try {
                                                                        Object[] objArr6 = {obj13, sb};
                                                                        byte[] bArr15 = $$a;
                                                                        r39 = random;
                                                                        obj8 = Class.forName($$c(s9, bArr15[80], bArr15[239])).getDeclaredConstructor(Class.forName($$c(s9, bArr15[80], bArr15[239])), String.class).newInstance(objArr6);
                                                                    } catch (Throwable th19) {
                                                                        Throwable cause9 = th19.getCause();
                                                                        if (cause9 == null) {
                                                                            throw th19;
                                                                        }
                                                                        throw cause9;
                                                                    }
                                                                } else {
                                                                    try {
                                                                        try {
                                                                            Object[] objArr7 = {obj13, sb};
                                                                            byte[] bArr16 = $$a;
                                                                            r39 = random;
                                                                            Object obj19 = obj6;
                                                                            Object newInstance3 = Class.forName($$c(s9, bArr16[80], bArr16[239])).getDeclaredConstructor(Class.forName($$c(s9, bArr16[80], bArr16[239])), String.class).newInstance(objArr7);
                                                                            try {
                                                                                short s13 = (short) 348;
                                                                                obj14 = obj13;
                                                                                Object obj20 = obj7;
                                                                                Object newInstance4 = Class.forName($$c(s13, bArr16[114], bArr16[239])).getDeclaredConstructor(Class.forName($$c(s9, bArr16[80], bArr16[239]))).newInstance(newInstance3);
                                                                                int i132 = $11;
                                                                                int i133 = ((i132 | 19) << 1) - (i132 ^ 19);
                                                                                $10 = i133 % 128;
                                                                                int i134 = i133 % 2;
                                                                                try {
                                                                                    Class.forName($$c(s13, bArr16[114], bArr16[239])).getMethod($$c((short) 371, bArr16[16], bArr16[0]), null).invoke(newInstance4, null);
                                                                                    obj5 = newInstance3;
                                                                                    obj6 = obj19;
                                                                                    obj7 = obj20;
                                                                                    z = z4;
                                                                                    random = r39;
                                                                                    zArr5 = zArr2;
                                                                                    zArr6 = zArr3;
                                                                                    obj4 = obj14;
                                                                                    i8 = r39;
                                                                                } catch (Throwable th20) {
                                                                                    Throwable cause10 = th20.getCause();
                                                                                    if (cause10 == null) {
                                                                                        throw th20;
                                                                                    }
                                                                                    throw cause10;
                                                                                }
                                                                            } catch (Throwable th21) {
                                                                                Throwable cause11 = th21.getCause();
                                                                                if (cause11 == null) {
                                                                                    throw th21;
                                                                                }
                                                                                throw cause11;
                                                                            }
                                                                        } catch (Exception e2) {
                                                                            StringBuilder sb5 = new StringBuilder();
                                                                            byte[] bArr17 = $$a;
                                                                            StringBuilder append2 = sb5.append($$c((short) 375, bArr17[16], bArr17[44])).append(random);
                                                                            short s14 = (short) 314;
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c(s14, bArr17[14], bArr17[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append2.append($$c(s14, bArr17[7], bArr17[49])).toString(), e2));
                                                                            } catch (Throwable th22) {
                                                                                Throwable cause12 = th22.getCause();
                                                                                if (cause12 == null) {
                                                                                    throw th22;
                                                                                }
                                                                                throw cause12;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th23) {
                                                                        Throwable cause13 = th23.getCause();
                                                                        if (cause13 == null) {
                                                                            throw th23;
                                                                        }
                                                                        throw cause13;
                                                                    }
                                                                }
                                                                th = th16;
                                                                obj3 = th;
                                                                s = s9;
                                                                i6 = i2;
                                                                b2 = b8;
                                                                z3 = z10;
                                                                int currentTimeMillis7222 = (int) System.currentTimeMillis();
                                                                i3 = i6;
                                                                int i100222 = -(-(i3 * (-613)));
                                                                int i101222 = (615 & i100222) + (i100222 | 615);
                                                                int i102222 = ~(((-2) ^ i3) | ((-2) & i3));
                                                                int i103222 = (currentTimeMillis7222 ^ i102222) | (currentTimeMillis7222 & i102222);
                                                                int i104222 = ~i3;
                                                                int i105222 = ~(i104222 | 1);
                                                                int i106222 = (i101222 - (~(((i103222 & i105222) | (i103222 ^ i105222)) * 614))) - 1;
                                                                int i107222 = ~currentTimeMillis7222;
                                                                int i108222 = i102222 | (~(((-2) ^ i107222) | ((-2) & i107222)));
                                                                int i109222 = ~((i107222 ^ i3) | (i107222 & i3));
                                                                int i110222 = ((i108222 & i109222) | (i108222 ^ i109222)) * (-1228);
                                                                int i111222 = (i106222 ^ i110222) + ((i110222 & i106222) << 1);
                                                                int i112222 = ((-2) & i104222) | ((-2) ^ i104222);
                                                                int i113222 = ~((i112222 & i107222) | (i112222 ^ i107222));
                                                                int i114222 = (~currentTimeMillis7222) | 1;
                                                                int i115222 = ((~((i114222 & i3) | (i114222 ^ i3))) | i113222) * 614;
                                                                i7 = (i111222 ^ i115222) + ((i115222 & i111222) << 1);
                                                                while (i7 < 7) {
                                                                    int i135 = $10 + 73;
                                                                    $11 = i135 % 128;
                                                                    if (i135 % 2 == 0) {
                                                                        int i136 = 76 / 0;
                                                                        if (zArr3[i7]) {
                                                                            AFLogger = null;
                                                                            unregisterClient = null;
                                                                            z2 = true;
                                                                            b = b2;
                                                                            i4 = i6;
                                                                        } else {
                                                                            i7++;
                                                                            int i137 = 2 % 2;
                                                                        }
                                                                    } else if (zArr3[i7]) {
                                                                        AFLogger = null;
                                                                        unregisterClient = null;
                                                                        z2 = true;
                                                                        b = b2;
                                                                        i4 = i6;
                                                                    } else {
                                                                        i7++;
                                                                        int i1372 = 2 % 2;
                                                                    }
                                                                }
                                                                short s10222 = (short) 1091;
                                                                byte[] bArr12222 = $$a;
                                                                throw ((Throwable) Class.forName($$c((short) 314, bArr12222[14], bArr12222[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s10222, bArr12222[105], bArr12222[44]), obj3));
                                                            }
                                                            try {
                                                                Object[] objArr8 = {obj13, sb};
                                                                byte[] bArr18 = $$a;
                                                                r39 = random;
                                                                obj7 = Class.forName($$c(s9, bArr18[80], bArr18[239])).getDeclaredConstructor(Class.forName($$c(s9, bArr18[80], bArr18[239])), String.class).newInstance(objArr8);
                                                            } catch (Throwable th24) {
                                                                Throwable cause14 = th24.getCause();
                                                                if (cause14 == null) {
                                                                    throw th24;
                                                                }
                                                                throw cause14;
                                                            }
                                                        }
                                                        obj14 = obj13;
                                                        obj5 = obj12;
                                                        z = z4;
                                                        random = r39;
                                                        zArr5 = zArr2;
                                                        zArr6 = zArr3;
                                                        obj4 = obj14;
                                                        i8 = r39;
                                                    }
                                                    obj9 = obj5;
                                                    zArr2 = zArr5;
                                                    obj10 = obj6;
                                                    zArr3 = zArr6;
                                                    obj11 = obj7;
                                                    z4 = z;
                                                    i5 = i8;
                                                } catch (Throwable th25) {
                                                    th = th25;
                                                    Throwable th26 = th;
                                                    Throwable cause15 = th26.getCause();
                                                    if (cause15 == null) {
                                                        throw th26;
                                                    }
                                                    throw cause15;
                                                }
                                            } else {
                                                str = $$c2;
                                                zArr2 = zArr5;
                                                zArr3 = zArr6;
                                                z4 = z;
                                                obj8 = null;
                                                obj9 = null;
                                                obj10 = null;
                                                obj11 = null;
                                                i5 = i4;
                                            }
                                            try {
                                                int i138 = $$b;
                                                byte[] bArr19 = $$a;
                                                String $$c4 = $$c((short) ((i138 & 289) | (i138 ^ 289)), bArr19[495], bArr19[12]);
                                                try {
                                                    try {
                                                        r14 = (byte) 70;
                                                        Object invoke4 = Class.class.getMethod($$c((short) 411, bArr19[79], r14), String.class).invoke(AFi1hSDK.class, $$c4);
                                                        try {
                                                            try {
                                                                Class<?> cls4 = Class.forName($$c((short) StatusLine.HTTP_MISDIRECTED_REQUEST, bArr19[80], bArr19[239]));
                                                                byte b9 = bArr19[56];
                                                                String str2 = (String) cls4.getMethod($$c((short) 432, b9, (byte) ((b9 ^ 64) | (b9 & 64))), null).invoke(invoke4, null);
                                                                StringBuilder sb6 = new StringBuilder();
                                                                short s15 = (short) 438;
                                                                byte b10 = bArr19[7];
                                                                ZipFile zipFile6 = new ZipFile(str2.substring(5, str2.lastIndexOf(sb6.append($$c(s15, b10, b10)).append($$c4).toString())));
                                                                try {
                                                                    byte[] bArr20 = new byte[6796];
                                                                    try {
                                                                        Object[] objArr9 = {zipFile6.getInputStream(zipFile6.getEntry($$c4.substring(1)))};
                                                                        Class<?> cls5 = Class.forName($$c(s15, bArr19[755], bArr19[239]));
                                                                        Class<?>[] clsArr = new Class[1];
                                                                        short s16 = (short) 464;
                                                                        Object obj21 = obj8;
                                                                        i4 = i2;
                                                                        try {
                                                                            clsArr[0] = Class.forName($$c(s16, bArr19[14], bArr19[239]));
                                                                            Object newInstance5 = cls5.getDeclaredConstructor(clsArr).newInstance(objArr9);
                                                                            int i139 = $11;
                                                                            int i140 = (i139 ^ 59) + ((i139 & 59) << 1);
                                                                            $10 = i140 % 128;
                                                                            int i141 = i140 % 2;
                                                                            try {
                                                                                Object[] objArr10 = {newInstance5};
                                                                                short s17 = (short) 482;
                                                                                Class<?> cls6 = Class.forName($$c(s17, bArr19[105], bArr19[239]));
                                                                                Class<?>[] clsArr2 = new Class[1];
                                                                                ZipFile zipFile7 = zipFile6;
                                                                                try {
                                                                                    clsArr2[0] = Class.forName($$c(s16, bArr19[14], bArr19[239]));
                                                                                    Object newInstance6 = cls6.getDeclaredConstructor(clsArr2).newInstance(objArr10);
                                                                                    try {
                                                                                        Object[] objArr11 = {bArr20};
                                                                                        try {
                                                                                            r9 = Class.forName($$c(s17, bArr19[105], bArr19[239])).getMethod($$c((short) 504, bArr19[49], b8), byte[].class);
                                                                                            r9.invoke(newInstance6, objArr11);
                                                                                            try {
                                                                                                Class<?> cls7 = Class.forName($$c(s17, bArr19[105], bArr19[239]));
                                                                                                r9 = bArr19[16];
                                                                                                cls7.getMethod($$c((short) 371, r9, bArr19[0]), null).invoke(newInstance6, null);
                                                                                                int i142 = 20;
                                                                                                int i143 = 6754;
                                                                                                String str3 = str;
                                                                                                int i144 = 1;
                                                                                                Class cls8 = null;
                                                                                                r14 = r14;
                                                                                                while (true) {
                                                                                                    long j = i144;
                                                                                                    try {
                                                                                                        int i145 = 0;
                                                                                                        while (i145 < bArr20.length) {
                                                                                                            try {
                                                                                                                j = ((bArr20[i145] + (j << 6)) + (j << 16)) - j;
                                                                                                                i145 = (i145 & 1) + (i145 | 1);
                                                                                                                i143 = i143;
                                                                                                                cls8 = cls8;
                                                                                                                str3 = str3;
                                                                                                            } catch (Throwable th27) {
                                                                                                                th = th27;
                                                                                                                s = s9;
                                                                                                                b5 = b8;
                                                                                                                z3 = z10;
                                                                                                                zipFile2 = zipFile7;
                                                                                                                zipFile = zipFile2;
                                                                                                                r14 = b5;
                                                                                                                i5 = i4;
                                                                                                                try {
                                                                                                                    zipFile.close();
                                                                                                                    throw th;
                                                                                                                } catch (Throwable th28) {
                                                                                                                    th.addSuppressed(th28);
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        int i146 = i143;
                                                                                                        Class cls9 = cls8;
                                                                                                        String str4 = str3;
                                                                                                        int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                        int i147 = 10709 - (~(-(-(i142 * 85))));
                                                                                                        int i148 = ~i142;
                                                                                                        int i149 = ~(((-127) & i148) | ((-127) ^ i148));
                                                                                                        int i150 = ~currentTimeMillis9;
                                                                                                        short s18 = s15;
                                                                                                        int i151 = (~(((-127) ^ i150) | ((-127) & i150))) | i149;
                                                                                                        int i152 = ~((~i142) | i150);
                                                                                                        int i153 = (i151 & i152) | (i151 ^ i152);
                                                                                                        int i154 = (i142 ^ WebSocketProtocol.PAYLOAD_SHORT) | (i142 & WebSocketProtocol.PAYLOAD_SHORT);
                                                                                                        int i155 = ~((i154 ^ currentTimeMillis9) | (i154 & currentTimeMillis9));
                                                                                                        int i156 = ((i153 ^ i155) | (i153 & i155)) * (-84);
                                                                                                        int i157 = ((i147 | i156) << 1) - (i147 ^ i156);
                                                                                                        int i158 = ~((i148 ^ currentTimeMillis9) | (i148 & currentTimeMillis9));
                                                                                                        int i159 = (i158 & WebSocketProtocol.PAYLOAD_SHORT) | (i158 ^ WebSocketProtocol.PAYLOAD_SHORT);
                                                                                                        int i160 = ~currentTimeMillis9;
                                                                                                        int i161 = ~((i160 & i142) | (i160 ^ i142));
                                                                                                        int i162 = (i157 - (~((i159 | i161) * (-84)))) - 1;
                                                                                                        int i163 = ~i154;
                                                                                                        int i164 = -(-(((i161 & i163) | (i161 ^ i163)) * 84));
                                                                                                        int i165 = (i162 ^ i164) + ((i164 & i162) << 1);
                                                                                                        byte b11 = bArr20[((i142 | 3303) << 1) - (i142 ^ 3303)];
                                                                                                        System.currentTimeMillis();
                                                                                                        int i166 = -(-(b11 * (-628)));
                                                                                                        int i167 = (8820 & i166) + (i166 | 8820);
                                                                                                        int i168 = ~b11;
                                                                                                        int i169 = i167 + (i168 * (-629));
                                                                                                        int i170 = -(-((~((i168 & (-15)) | ((-15) ^ i168))) * (-629)));
                                                                                                        int i171 = ((i169 | i170) << 1) - (i170 ^ i169);
                                                                                                        int i172 = ((b11 & (-15)) | (b11 ^ (-15))) * 629;
                                                                                                        bArr20[i165] = (byte) ((i171 ^ i172) + ((i172 & i171) << 1));
                                                                                                        int length = bArr20.length;
                                                                                                        int i173 = -i142;
                                                                                                        int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                                                        int i174 = i173 * 989;
                                                                                                        int i175 = length * (-987);
                                                                                                        int i176 = (i174 & i175) + (i174 | i175);
                                                                                                        int i177 = ~length;
                                                                                                        int i178 = (~currentTimeMillis10) | i177;
                                                                                                        int i179 = ~((i178 ^ i173) | (i178 & i173));
                                                                                                        int i180 = (i173 ^ length) | (i173 & length);
                                                                                                        z3 = z10;
                                                                                                        int i181 = ~((i180 ^ currentTimeMillis10) | (i180 & currentTimeMillis10));
                                                                                                        int i182 = ((i179 ^ i181) | (i179 & i181)) * 988;
                                                                                                        int i183 = ((((i176 | i182) << 1) - (i182 ^ i176)) - (~(-(-((i173 | i177) * (-988)))))) - 1;
                                                                                                        int i184 = ~i173;
                                                                                                        int i185 = ~((i177 & i184) | (i184 ^ i177));
                                                                                                        int i186 = ~length;
                                                                                                        r9 = ~((i186 & currentTimeMillis10) | (i186 ^ currentTimeMillis10));
                                                                                                        int i187 = (i185 & r9) | (i185 ^ r9);
                                                                                                        int i188 = i173 | (~currentTimeMillis10);
                                                                                                        int i189 = ~((length & i188) | (i188 ^ length));
                                                                                                        try {
                                                                                                            Object[] objArr12 = {bArr20, Integer.valueOf(i142), Integer.valueOf((i183 - (~(((i189 & i187) | (i187 ^ i189)) * 988))) - 1)};
                                                                                                            byte[] bArr21 = $$a;
                                                                                                            r9 = 2;
                                                                                                            Object newInstance7 = Class.forName($$c((short) 512, bArr21[228], bArr21[239])).getDeclaredConstructor(byte[].class, Integer.TYPE, Integer.TYPE).newInstance(objArr12);
                                                                                                            try {
                                                                                                                Object obj22 = AFLogger;
                                                                                                                if (obj22 == null) {
                                                                                                                    try {
                                                                                                                        v = j;
                                                                                                                        int elapsedCpuTime = (int) (((Process.getElapsedCpuTime() >> 48) - 5094555416906009232L) ^ j);
                                                                                                                        int zoomControlsTimeout = (int) (v ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) + 5094555416582751538L));
                                                                                                                        int[] iArr = new int[(int) (v ^ ((SystemClock.currentThreadTimeMillis() >> 48) + 5094555416582751541L))];
                                                                                                                        int uptimeMillis = (int) (v ^ (5094555416582751543L - (SystemClock.uptimeMillis() >> 48)));
                                                                                                                        b4 = b8;
                                                                                                                        int zoomControlsTimeout2 = (int) (force >>> ((byte) (v ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) + 5094555416582751511L))));
                                                                                                                        try {
                                                                                                                            iArr[uptimeMillis] = ((~zoomControlsTimeout2) & elapsedCpuTime) | ((~elapsedCpuTime) & zoomControlsTimeout2);
                                                                                                                            int currentThreadTimeMillis = (int) (v ^ ((SystemClock.currentThreadTimeMillis() >> 48) + 5094555416582751542L));
                                                                                                                            int i190 = (int) force;
                                                                                                                            iArr[currentThreadTimeMillis] = (elapsedCpuTime | i190) & (~(i190 & elapsedCpuTime));
                                                                                                                            int i191 = w;
                                                                                                                            byte[] bArr22 = afRDLog;
                                                                                                                            int i192 = i;
                                                                                                                            int i193 = 2 % 2;
                                                                                                                            int i194 = $10;
                                                                                                                            int i195 = (i194 & 47) + (i194 | 47);
                                                                                                                            $11 = i195 % 128;
                                                                                                                            int i196 = i195 % 2;
                                                                                                                            try {
                                                                                                                                Object[] objArr13 = new Object[6];
                                                                                                                                try {
                                                                                                                                    objArr13[5] = Integer.valueOf(i192);
                                                                                                                                    objArr13[4] = Integer.valueOf(zoomControlsTimeout);
                                                                                                                                    objArr13[3] = bArr22;
                                                                                                                                    objArr13[2] = Integer.valueOf(i191);
                                                                                                                                    objArr13[1] = iArr;
                                                                                                                                    objArr13[0] = newInstance7;
                                                                                                                                    try {
                                                                                                                                        newInstance2 = Class.forName($$c((short) 539, bArr21[311], bArr21[0])).getDeclaredConstructor(Class.forName($$c((short) 464, bArr21[14], bArr21[239])), int[].class, Integer.TYPE, byte[].class, Integer.TYPE, Integer.TYPE).newInstance(objArr13);
                                                                                                                                    } catch (Throwable th29) {
                                                                                                                                        th = th29;
                                                                                                                                        Throwable th30 = th;
                                                                                                                                        Throwable cause16 = th30.getCause();
                                                                                                                                        if (cause16 == null) {
                                                                                                                                            throw th30;
                                                                                                                                        }
                                                                                                                                        throw cause16;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th31) {
                                                                                                                                    th = th31;
                                                                                                                                }
                                                                                                                            } catch (Throwable th32) {
                                                                                                                                th = th32;
                                                                                                                            }
                                                                                                                        } catch (Throwable th33) {
                                                                                                                            th = th33;
                                                                                                                            th = th;
                                                                                                                            s = s9;
                                                                                                                            zipFile2 = zipFile7;
                                                                                                                            b5 = b4;
                                                                                                                            zipFile = zipFile2;
                                                                                                                            r14 = b5;
                                                                                                                            i5 = i4;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Throwable th34) {
                                                                                                                        th = th34;
                                                                                                                        b4 = b8;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    b4 = b8;
                                                                                                                    afInfoLog = j;
                                                                                                                    r9 = new byte[]{40, 59, -14, 48, 83, -23, 74, 50};
                                                                                                                    try {
                                                                                                                        ?? r12 = {newInstance7, r9, Integer.valueOf((int) (j ^ ((-4808413526679698919L) - (SystemClock.elapsedRealtimeNanos() >> 60)))), Integer.valueOf((int) (afInfoLog ^ ((ViewConfiguration.getZoomControlsTimeout() >> 32) - 4808413526001711408L)))};
                                                                                                                        Class<?> cls10 = Class.forName($$c((short) 569, bArr21[495], bArr21[0]), true, (ClassLoader) unregisterClient);
                                                                                                                        r9 = $$c((short) 601, bArr21[47], r14);
                                                                                                                        newInstance2 = cls10.getMethod(r9, Class.forName($$c((short) 464, bArr21[14], bArr21[239])), byte[].class, Integer.TYPE, Integer.TYPE).invoke(obj22, r12);
                                                                                                                    } catch (Throwable th35) {
                                                                                                                        Throwable cause17 = th35.getCause();
                                                                                                                        if (cause17 == null) {
                                                                                                                            throw th35;
                                                                                                                        }
                                                                                                                        throw cause17;
                                                                                                                    }
                                                                                                                }
                                                                                                                short s19 = (short) 464;
                                                                                                                try {
                                                                                                                    Class<?> cls11 = Class.forName($$c(s19, bArr21[14], bArr21[239]));
                                                                                                                    byte b12 = bArr21[55];
                                                                                                                    int i197 = $$b;
                                                                                                                    cls11.getMethod($$c((short) 610, b12, (byte) (i197 & 503)), Long.TYPE).invoke(newInstance2, 20);
                                                                                                                    if (z5) {
                                                                                                                        try {
                                                                                                                            Object obj23 = AFLogger;
                                                                                                                            if (obj23 == null) {
                                                                                                                                int i198 = $10 + 47;
                                                                                                                                $11 = i198 % 128;
                                                                                                                                if (i198 % 2 == 0) {
                                                                                                                                    int i199 = 76 / 0;
                                                                                                                                }
                                                                                                                                obj16 = obj10;
                                                                                                                            } else {
                                                                                                                                obj16 = obj11;
                                                                                                                            }
                                                                                                                            Object obj24 = obj23 == null ? obj21 : obj9;
                                                                                                                            byte b13 = b4;
                                                                                                                            try {
                                                                                                                                Method method = Class.forName($$c(s19, bArr21[14], bArr21[239])).getMethod($$c((short) 613, bArr21[55], b13), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                                                                i11 = i142;
                                                                                                                                Class<?> cls12 = Class.forName($$c((short) 348, bArr21[114], bArr21[239]));
                                                                                                                                try {
                                                                                                                                    Class<?>[] clsArr3 = new Class[1];
                                                                                                                                    b4 = b13;
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            clsArr3[0] = Class.forName($$c(s9, bArr21[80], bArr21[239]));
                                                                                                                                            Object newInstance8 = cls12.getConstructor(clsArr3).newInstance(obj16);
                                                                                                                                            if (z3) {
                                                                                                                                                try {
                                                                                                                                                    s3 = s19;
                                                                                                                                                    ((Boolean) Class.forName($$c(s9, bArr21[80], bArr21[239])).getMethod($$c((short) 616, bArr21[79], (byte) (i197 & 503)), null).invoke(obj16, null)).booleanValue();
                                                                                                                                                } catch (Throwable th36) {
                                                                                                                                                    Throwable cause18 = th36.getCause();
                                                                                                                                                    if (cause18 == null) {
                                                                                                                                                        throw th36;
                                                                                                                                                    }
                                                                                                                                                    throw cause18;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                s3 = s19;
                                                                                                                                            }
                                                                                                                                            System.currentTimeMillis();
                                                                                                                                            System.currentTimeMillis();
                                                                                                                                            int i200 = 1024;
                                                                                                                                            byte[] bArr23 = new byte[1024];
                                                                                                                                            byte b14 = bArr21[16];
                                                                                                                                            Method method2 = cls12.getMethod($$c((short) 630, b14, (byte) ((b14 ^ 82) | (b14 & 82))), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                                                                            int i201 = i146;
                                                                                                                                            while (i201 > 0) {
                                                                                                                                                int intValue2 = ((Integer) method.invoke(newInstance2, bArr23, 0, Integer.valueOf(Math.min(i200, i201)))).intValue();
                                                                                                                                                if (intValue2 == -1) {
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                method2.invoke(newInstance8, bArr23, 0, Integer.valueOf(intValue2));
                                                                                                                                                int i202 = -intValue2;
                                                                                                                                                i201 = (i201 ^ i202) + ((i202 & i201) << 1);
                                                                                                                                                i200 = 1024;
                                                                                                                                            }
                                                                                                                                            int i203 = $$b;
                                                                                                                                            byte[] bArr24 = $$a;
                                                                                                                                            byte b15 = bArr24[16];
                                                                                                                                            Class.forName($$c((short) (i203 | 548), bArr24[72], bArr24[239])).getMethod($$c((short) 659, bArr24[55], (byte) (i203 & 503)), new Class[0]).invoke(cls12.getMethod($$c((short) ((i203 ^ 544) | (i203 & 544)), b15, (byte) ((b15 ^ 66) | (b15 & 66))), new Class[0]).invoke(newInstance8, new Object[0]), new Object[0]);
                                                                                                                                            cls12.getMethod($$c((short) 371, bArr24[16], bArr24[0]), new Class[0]).invoke(newInstance8, new Object[0]);
                                                                                                                                            Class<?> cls13 = Class.forName($$c((short) 662, bArr24[107], bArr24[430]));
                                                                                                                                            byte b16 = bArr24[56];
                                                                                                                                            byte b17 = bArr24[729];
                                                                                                                                            int currentTimeMillis11 = (int) System.currentTimeMillis();
                                                                                                                                            int i204 = -(-(b17 * (-929)));
                                                                                                                                            int i205 = ((-464) & i204) + (i204 | (-464));
                                                                                                                                            int i206 = ~((b17 ^ currentTimeMillis11) | (b17 & currentTimeMillis11));
                                                                                                                                            int i207 = (i205 - (~(((i206 & (-2)) | ((-2) ^ i206)) * (-465)))) - 1;
                                                                                                                                            int i208 = ((~(((-2) ^ currentTimeMillis11) | ((-2) & currentTimeMillis11))) | b17) * 930;
                                                                                                                                            int i209 = ((i207 | i208) << 1) - (i207 ^ i208);
                                                                                                                                            int i210 = (b17 | currentTimeMillis11 | (-2)) * 465;
                                                                                                                                            Method declaredMethod2 = cls13.getDeclaredMethod($$c((short) 682, b16, (byte) ((i209 & i210) + (i210 | i209))), String.class, String.class, Integer.TYPE);
                                                                                                                                            int i211 = 2 % 2;
                                                                                                                                            try {
                                                                                                                                                short s20 = (short) 688;
                                                                                                                                                try {
                                                                                                                                                    invoke3 = declaredMethod2.invoke(null, Class.forName($$c(s9, bArr24[80], bArr24[239])).getMethod($$c(s20, bArr24[12], r14), null).invoke(obj16, null), Class.forName($$c(s9, bArr24[80], bArr24[239])).getMethod($$c(s20, bArr24[12], r14), null).invoke(obj24, null), 0);
                                                                                                                                                    try {
                                                                                                                                                        short s21 = (short) 702;
                                                                                                                                                        ((Boolean) Class.forName($$c(s9, bArr24[80], bArr24[239])).getMethod($$c(s21, bArr24[46], bArr24[430]), null).invoke(obj16, null)).booleanValue();
                                                                                                                                                        int i212 = $10;
                                                                                                                                                        int i213 = (i212 & 123) + (i212 | 123);
                                                                                                                                                        $11 = i213 % 128;
                                                                                                                                                        int i214 = i213 % 2;
                                                                                                                                                        try {
                                                                                                                                                            ((Boolean) Class.forName($$c(s9, bArr24[80], bArr24[239])).getMethod($$c(s21, bArr24[46], bArr24[430]), null).invoke(obj24, null)).booleanValue();
                                                                                                                                                            int i215 = $10;
                                                                                                                                                            int i216 = (i215 ^ 15) + ((i215 & 15) << 1);
                                                                                                                                                            $11 = i216 % 128;
                                                                                                                                                            if (i216 % 2 == 0) {
                                                                                                                                                                Object obj25 = null;
                                                                                                                                                                try {
                                                                                                                                                                    obj25.hashCode();
                                                                                                                                                                    throw null;
                                                                                                                                                                } catch (Throwable th37) {
                                                                                                                                                                    th = th37;
                                                                                                                                                                    th = th;
                                                                                                                                                                    s = s9;
                                                                                                                                                                    zipFile2 = zipFile7;
                                                                                                                                                                    b5 = b4;
                                                                                                                                                                    zipFile = zipFile2;
                                                                                                                                                                    r14 = b5;
                                                                                                                                                                    i5 = i4;
                                                                                                                                                                    zipFile.close();
                                                                                                                                                                    throw th;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            if (unregisterClient == null) {
                                                                                                                                                                try {
                                                                                                                                                                    unregisterClient = Class.class.getMethod($$c((short) 707, bArr24[26], r14), null).invoke(AFi1hSDK.class, null);
                                                                                                                                                                } catch (Throwable th38) {
                                                                                                                                                                    Throwable cause19 = th38.getCause();
                                                                                                                                                                    if (cause19 == null) {
                                                                                                                                                                        throw th38;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause19;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            s = s9;
                                                                                                                                                            i12 = r14;
                                                                                                                                                            s4 = s18;
                                                                                                                                                            r142 = r14;
                                                                                                                                                        } catch (Throwable th39) {
                                                                                                                                                            Throwable cause20 = th39.getCause();
                                                                                                                                                            if (cause20 == null) {
                                                                                                                                                                throw th39;
                                                                                                                                                            }
                                                                                                                                                            throw cause20;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th40) {
                                                                                                                                                        Throwable cause21 = th40.getCause();
                                                                                                                                                        if (cause21 == null) {
                                                                                                                                                            throw th40;
                                                                                                                                                        }
                                                                                                                                                        throw cause21;
                                                                                                                                                    }
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
                                                                                                                                        } catch (Throwable th43) {
                                                                                                                                            th = th43;
                                                                                                                                            Throwable th44 = th;
                                                                                                                                            try {
                                                                                                                                                byte[] bArr25 = $$a;
                                                                                                                                                short s22 = (short) 702;
                                                                                                                                                ((Boolean) Class.forName($$c(s9, bArr25[80], bArr25[239])).getMethod($$c(s22, bArr25[46], bArr25[430]), null).invoke(obj16, null)).booleanValue();
                                                                                                                                                try {
                                                                                                                                                    ((Boolean) Class.forName($$c(s9, bArr25[80], bArr25[239])).getMethod($$c(s22, bArr25[46], bArr25[430]), null).invoke(obj24, null)).booleanValue();
                                                                                                                                                    throw th44;
                                                                                                                                                } catch (Throwable th45) {
                                                                                                                                                    Throwable cause24 = th45.getCause();
                                                                                                                                                    if (cause24 == null) {
                                                                                                                                                        throw th45;
                                                                                                                                                    }
                                                                                                                                                    throw cause24;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th46) {
                                                                                                                                                Throwable cause25 = th46.getCause();
                                                                                                                                                if (cause25 == null) {
                                                                                                                                                    throw th46;
                                                                                                                                                }
                                                                                                                                                throw cause25;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (Exception e3) {
                                                                                                                                        e = e3;
                                                                                                                                        Exception exc2 = e;
                                                                                                                                        StringBuilder sb7 = new StringBuilder();
                                                                                                                                        byte[] bArr26 = $$a;
                                                                                                                                        short s23 = (short) 314;
                                                                                                                                        try {
                                                                                                                                            throw ((Throwable) Class.forName($$c(s23, bArr26[14], bArr26[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance(sb7.append($$c((short) 626, bArr26[16], bArr26[44])).append(obj16).append($$c(s23, bArr26[7], bArr26[49])).toString(), exc2));
                                                                                                                                        } catch (Throwable th47) {
                                                                                                                                            Throwable cause26 = th47.getCause();
                                                                                                                                            if (cause26 == null) {
                                                                                                                                                throw th47;
                                                                                                                                            }
                                                                                                                                            throw cause26;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } catch (Exception e4) {
                                                                                                                                    e = e4;
                                                                                                                                    b4 = b13;
                                                                                                                                } catch (Throwable th48) {
                                                                                                                                    th = th48;
                                                                                                                                    b4 = b13;
                                                                                                                                    Throwable th442 = th;
                                                                                                                                    byte[] bArr252 = $$a;
                                                                                                                                    short s222 = (short) 702;
                                                                                                                                    ((Boolean) Class.forName($$c(s9, bArr252[80], bArr252[239])).getMethod($$c(s222, bArr252[46], bArr252[430]), null).invoke(obj16, null)).booleanValue();
                                                                                                                                    ((Boolean) Class.forName($$c(s9, bArr252[80], bArr252[239])).getMethod($$c(s222, bArr252[46], bArr252[430]), null).invoke(obj24, null)).booleanValue();
                                                                                                                                    throw th442;
                                                                                                                                }
                                                                                                                            } catch (Throwable th49) {
                                                                                                                                th = th49;
                                                                                                                                b4 = b13;
                                                                                                                            }
                                                                                                                        } catch (Throwable th50) {
                                                                                                                            th = th50;
                                                                                                                            th = th;
                                                                                                                            s = s9;
                                                                                                                            zipFile2 = zipFile7;
                                                                                                                            b5 = b4;
                                                                                                                            zipFile = zipFile2;
                                                                                                                            r14 = b5;
                                                                                                                            i5 = i4;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i11 = i142;
                                                                                                                        Class<?> cls14 = Class.forName($$c((short) 720, bArr21[228], bArr21[239]));
                                                                                                                        Class<?> cls15 = Class.forName($$c(s19, bArr21[14], bArr21[239]));
                                                                                                                        Object newInstance9 = cls14.getConstructor(cls15).newInstance(newInstance2);
                                                                                                                        r9 = 80;
                                                                                                                        Object invoke5 = cls14.getMethod($$c((short) 747, bArr21[80], r14), new Class[0]).invoke(newInstance9, new Object[0]);
                                                                                                                        Class<?> cls16 = Class.forName($$c((short) 758, bArr21[72], bArr21[239]));
                                                                                                                        byte b18 = bArr21[56];
                                                                                                                        Method method3 = cls16.getMethod($$c((short) 779, b18, (byte) ((b18 ^ 64) | (b18 & 64))), new Class[0]);
                                                                                                                        byte b19 = b4;
                                                                                                                        Method method4 = cls15.getMethod($$c((short) 613, bArr21[55], b19), byte[].class);
                                                                                                                        try {
                                                                                                                            short s24 = s18;
                                                                                                                            r9 = Class.forName($$c(s24, bArr21[755], bArr21[239])).getDeclaredConstructor(Class.forName($$c(s19, bArr21[14], bArr21[239])));
                                                                                                                            Object newInstance10 = r9.newInstance(newInstance9);
                                                                                                                            short s25 = (short) 785;
                                                                                                                            byte b20 = bArr21[228];
                                                                                                                            b4 = b19;
                                                                                                                            int currentTimeMillis12 = (int) System.currentTimeMillis();
                                                                                                                            int i217 = 784 + (b20 * (-782)) + ((~b20) * (-783));
                                                                                                                            int i218 = ~currentTimeMillis12;
                                                                                                                            int i219 = (-2) | i218;
                                                                                                                            int i220 = (i217 - (~((~((i219 ^ b20) | (i219 & b20))) * (-783)))) - 1;
                                                                                                                            int i221 = ((~((i218 ^ b20) | (b20 & i218))) | (-2)) * 783;
                                                                                                                            Class<?> cls17 = Class.forName($$c(s25, (byte) ((i220 ^ i221) + ((i221 & i220) << 1)), bArr21[239]));
                                                                                                                            Object newInstance11 = cls17.getConstructor(new Class[0]).newInstance(new Object[0]);
                                                                                                                            byte b21 = bArr21[16];
                                                                                                                            Method method5 = cls17.getMethod($$c((short) 630, b21, (byte) ((b21 ^ 82) | (b21 & 82))), byte[].class, Integer.TYPE, Integer.TYPE);
                                                                                                                            try {
                                                                                                                                s = s9;
                                                                                                                                try {
                                                                                                                                    Method method6 = cls17.getMethod($$c((short) 813, bArr21[79], (byte) 83), new Class[0]);
                                                                                                                                    s3 = s19;
                                                                                                                                    Method method7 = Class.forName($$c((short) 823, bArr21[4], bArr21[239])).getMethod($$c((short) 371, bArr21[16], bArr21[0]), new Class[0]);
                                                                                                                                    byte[] bArr27 = new byte[1024];
                                                                                                                                    r9 = 0;
                                                                                                                                    r14 = r14;
                                                                                                                                    while (true) {
                                                                                                                                        int intValue3 = ((Integer) method4.invoke(newInstance10, bArr27)).intValue();
                                                                                                                                        if (intValue3 <= 0) {
                                                                                                                                            s4 = s24;
                                                                                                                                            i13 = r14;
                                                                                                                                            i14 = 0;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        s4 = s24;
                                                                                                                                        i13 = r14;
                                                                                                                                        Method method8 = method4;
                                                                                                                                        if (((long) r9) >= ((Long) method3.invoke(invoke5, new Object[0])).longValue()) {
                                                                                                                                            i14 = 0;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        method5.invoke(newInstance11, bArr27, 0, Integer.valueOf(intValue3));
                                                                                                                                        r14 = i13;
                                                                                                                                        s24 = s4;
                                                                                                                                        method4 = method8;
                                                                                                                                        r9 = (r9 | intValue3) + (r9 & intValue3);
                                                                                                                                    }
                                                                                                                                    bArr3 = (byte[]) method6.invoke(newInstance11, new Object[i14]);
                                                                                                                                    try {
                                                                                                                                        method7.invoke(newInstance10, new Object[i14]);
                                                                                                                                        method7.invoke(newInstance11, new Object[i14]);
                                                                                                                                    } catch (Exception unused6) {
                                                                                                                                    }
                                                                                                                                    int i222 = $11 + 17;
                                                                                                                                    $10 = i222 % 128;
                                                                                                                                    int i223 = i222 % 2;
                                                                                                                                } catch (Throwable th51) {
                                                                                                                                    th = th51;
                                                                                                                                    r9 = zipFile7;
                                                                                                                                    r14 = b4;
                                                                                                                                    th = th;
                                                                                                                                    zipFile = r9;
                                                                                                                                    r14 = r14;
                                                                                                                                    i5 = i4;
                                                                                                                                    zipFile.close();
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th52) {
                                                                                                                                th = th52;
                                                                                                                                s = s9;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    byte[] bArr28 = $$a;
                                                                                                                                    i12 = i13;
                                                                                                                                    Object invoke6 = Class.class.getMethod($$c((short) 707, bArr28[26], i12), null).invoke(AFi1hSDK.class, null);
                                                                                                                                    ?? cls18 = Class.forName($$c((short) 839, (byte) (-bArr28[754]), bArr28[430]));
                                                                                                                                    short s26 = (short) 874;
                                                                                                                                    r9 = Class.forName($$c((short) 892, bArr28[107], bArr28[239]));
                                                                                                                                    Constructor declaredConstructor = cls18.getDeclaredConstructor(new Class[]{Class.forName($$c(s26, bArr28[14], bArr28[239])), r9});
                                                                                                                                    try {
                                                                                                                                        Class<?> cls19 = Class.forName($$c(s26, bArr28[14], bArr28[239]));
                                                                                                                                        byte b22 = bArr28[55];
                                                                                                                                        int i224 = $$b;
                                                                                                                                        int currentTimeMillis13 = (int) System.currentTimeMillis();
                                                                                                                                        int i225 = i224 * 319;
                                                                                                                                        int i226 = ((1268 | i225) << 1) - (i225 ^ 1268);
                                                                                                                                        int i227 = ~i224;
                                                                                                                                        int i228 = (3 ^ i227) | (i227 & 3);
                                                                                                                                        int i229 = ~((i228 & currentTimeMillis13) | (i228 ^ currentTimeMillis13));
                                                                                                                                        int i230 = ~currentTimeMillis13;
                                                                                                                                        int i231 = ~((i230 ^ (-4)) | (i230 & (-4)) | i224);
                                                                                                                                        int i232 = (i226 - (~(((i229 ^ i231) | (i229 & i231)) * (-318)))) - 1;
                                                                                                                                        int i233 = ~i224;
                                                                                                                                        int i234 = ~((i233 ^ (-4)) | (i233 & (-4)));
                                                                                                                                        int i235 = ~(((-4) ^ currentTimeMillis13) | ((-4) & currentTimeMillis13));
                                                                                                                                        int i236 = -(-(((i234 ^ i235) | (i234 & i235)) * (-318)));
                                                                                                                                        int i237 = (i232 & i236) + (i236 | i232);
                                                                                                                                        r14 = 3 ^ currentTimeMillis13;
                                                                                                                                        int i238 = -(-((i233 | (~((currentTimeMillis13 & 3) | r14))) * 318));
                                                                                                                                        String $$c5 = $$c((short) 912, b22, (byte) ((i237 & i238) + (i238 | i237)));
                                                                                                                                        r9 = 0;
                                                                                                                                        Object newInstance12 = declaredConstructor.newInstance(cls19.getMethod($$c5, byte[].class).invoke(null, bArr3), invoke6);
                                                                                                                                        try {
                                                                                                                                            Field declaredField = Class.forName($$c((short) 915, bArr28[348], bArr28[430])).getDeclaredField($$c((short) 946, bArr28[274], bArr28[734]));
                                                                                                                                            declaredField.setAccessible(true);
                                                                                                                                            Object obj26 = declaredField.get(invoke6);
                                                                                                                                            Class<?> cls20 = obj26.getClass();
                                                                                                                                            byte b23 = (byte) 77;
                                                                                                                                            Field declaredField2 = cls20.getDeclaredField($$c((short) 953, bArr28[114], b23));
                                                                                                                                            declaredField2.setAccessible(true);
                                                                                                                                            Field declaredField3 = cls20.getDeclaredField($$c((short) 976, bArr28[222], b23));
                                                                                                                                            declaredField3.setAccessible(true);
                                                                                                                                            Object obj27 = declaredField2.get(obj26);
                                                                                                                                            Object obj28 = declaredField3.get(obj26);
                                                                                                                                            Object obj29 = declaredField.get(newInstance12);
                                                                                                                                            ArrayList arrayList = new ArrayList((List) obj27);
                                                                                                                                            try {
                                                                                                                                                int i239 = 0;
                                                                                                                                                Class cls21 = (Class) Class.class.getMethod($$c((short) 1000, bArr28[50], i12), null).invoke(obj28.getClass(), null);
                                                                                                                                                int length2 = Array.getLength(obj28);
                                                                                                                                                Object newInstance13 = Array.newInstance((Class<?>) cls21, length2);
                                                                                                                                                int i240 = 0;
                                                                                                                                                while (i240 < length2) {
                                                                                                                                                    try {
                                                                                                                                                        Array.set(newInstance13, i240, Array.get(obj28, i240));
                                                                                                                                                        int i241 = (i240 | 1) << 1;
                                                                                                                                                        i240 = i241 - (i240 ^ 1);
                                                                                                                                                        i239 = i241;
                                                                                                                                                    } catch (Exception e5) {
                                                                                                                                                        exc = e5;
                                                                                                                                                        r9 = zipFile7;
                                                                                                                                                        r14 = b4;
                                                                                                                                                        try {
                                                                                                                                                            StringBuilder sb8 = new StringBuilder();
                                                                                                                                                            short s27 = (short) PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                                                                                                                                                            byte[] bArr29 = $$a;
                                                                                                                                                            StringBuilder append3 = sb8.append($$c(s27, bArr29[16], bArr29[44])).append(invoke6);
                                                                                                                                                            short s28 = (short) 314;
                                                                                                                                                            try {
                                                                                                                                                                throw ((Throwable) Class.forName($$c(s28, bArr29[14], bArr29[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append3.append($$c(s28, bArr29[7], bArr29[49])).toString(), exc));
                                                                                                                                                            } catch (Throwable th53) {
                                                                                                                                                                Throwable cause27 = th53.getCause();
                                                                                                                                                                if (cause27 == null) {
                                                                                                                                                                    throw th53;
                                                                                                                                                                }
                                                                                                                                                                throw cause27;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th54) {
                                                                                                                                                            th = th54;
                                                                                                                                                            r9 = r9;
                                                                                                                                                            r14 = r14;
                                                                                                                                                            th = th;
                                                                                                                                                            zipFile = r9;
                                                                                                                                                            r14 = r14;
                                                                                                                                                            i5 = i4;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                declaredField2.set(obj29, arrayList);
                                                                                                                                                declaredField3.set(obj29, newInstance13);
                                                                                                                                                if (unregisterClient == null) {
                                                                                                                                                    int i242 = $11;
                                                                                                                                                    int i243 = ((i242 | 119) << 1) - (i242 ^ 119);
                                                                                                                                                    $10 = i243 % 128;
                                                                                                                                                    if (i243 % 2 != 0) {
                                                                                                                                                        unregisterClient = newInstance12;
                                                                                                                                                        Object obj30 = null;
                                                                                                                                                        try {
                                                                                                                                                            obj30.hashCode();
                                                                                                                                                            throw null;
                                                                                                                                                        } catch (Throwable th55) {
                                                                                                                                                            th = th55;
                                                                                                                                                            th = th;
                                                                                                                                                            zipFile4 = zipFile7;
                                                                                                                                                            b6 = b4;
                                                                                                                                                            zipFile = zipFile4;
                                                                                                                                                            r14 = b6;
                                                                                                                                                            i5 = i4;
                                                                                                                                                            zipFile.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    unregisterClient = newInstance12;
                                                                                                                                                }
                                                                                                                                                invoke3 = newInstance12;
                                                                                                                                                r142 = i239;
                                                                                                                                            } catch (Throwable th56) {
                                                                                                                                                zipFile5 = zipFile7;
                                                                                                                                                b7 = b4;
                                                                                                                                                try {
                                                                                                                                                    Throwable cause28 = th56.getCause();
                                                                                                                                                    if (cause28 == null) {
                                                                                                                                                        throw th56;
                                                                                                                                                    }
                                                                                                                                                    throw cause28;
                                                                                                                                                } catch (Exception e6) {
                                                                                                                                                    e = e6;
                                                                                                                                                    exc = e;
                                                                                                                                                    r9 = zipFile5;
                                                                                                                                                    r14 = b7;
                                                                                                                                                    StringBuilder sb82 = new StringBuilder();
                                                                                                                                                    short s272 = (short) PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW;
                                                                                                                                                    byte[] bArr292 = $$a;
                                                                                                                                                    StringBuilder append32 = sb82.append($$c(s272, bArr292[16], bArr292[44])).append(invoke6);
                                                                                                                                                    short s282 = (short) 314;
                                                                                                                                                    throw ((Throwable) Class.forName($$c(s282, bArr292[14], bArr292[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance(append32.append($$c(s282, bArr292[7], bArr292[49])).toString(), exc));
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (Exception e7) {
                                                                                                                                            e = e7;
                                                                                                                                            zipFile5 = zipFile7;
                                                                                                                                            b7 = b4;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th57) {
                                                                                                                                        Throwable cause29 = th57.getCause();
                                                                                                                                        if (cause29 == null) {
                                                                                                                                            throw th57;
                                                                                                                                        }
                                                                                                                                        throw cause29;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th58) {
                                                                                                                                    Throwable cause30 = th58.getCause();
                                                                                                                                    if (cause30 == null) {
                                                                                                                                        throw th58;
                                                                                                                                    }
                                                                                                                                    throw cause30;
                                                                                                                                }
                                                                                                                            } catch (Throwable th59) {
                                                                                                                                th = th59;
                                                                                                                                th = th;
                                                                                                                                zipFile = r9;
                                                                                                                                r14 = r14;
                                                                                                                                i5 = i4;
                                                                                                                                zipFile.close();
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th60) {
                                                                                                                            Throwable cause31 = th60.getCause();
                                                                                                                            if (cause31 == null) {
                                                                                                                                throw th60;
                                                                                                                            }
                                                                                                                            throw cause31;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (z5) {
                                                                                                                        short s29 = (short) 662;
                                                                                                                        try {
                                                                                                                            bArr2 = $$a;
                                                                                                                            cls = Class.forName($$c(s29, bArr2[107], bArr2[430]));
                                                                                                                            int i244 = $$b;
                                                                                                                            short s30 = (short) ((i244 & PDF417Common.NUMBER_OF_CODEWORDS) | (i244 ^ PDF417Common.NUMBER_OF_CODEWORDS));
                                                                                                                            byte b24 = bArr2[49];
                                                                                                                            declaredMethod = cls.getDeclaredMethod($$c(s30, b24, (byte) (b24 | 67)), String.class, Class.forName($$c((short) 892, bArr2[107], bArr2[239])));
                                                                                                                            declaredMethod.setAccessible(true);
                                                                                                                            int i245 = 2 % 2;
                                                                                                                            System.currentTimeMillis();
                                                                                                                            System.currentTimeMillis();
                                                                                                                            try {
                                                                                                                            } catch (Throwable th61) {
                                                                                                                                Throwable cause32 = th61.getCause();
                                                                                                                                if (cause32 == null) {
                                                                                                                                    throw th61;
                                                                                                                                }
                                                                                                                                throw cause32;
                                                                                                                            }
                                                                                                                        } catch (Throwable th62) {
                                                                                                                            th = th62;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            Object invoke7 = declaredMethod.invoke(invoke3, str4, Class.class.getMethod($$c((short) 707, bArr2[26], i12), null).invoke(AFi1hSDK.class, null));
                                                                                                                            if (invoke7 != null) {
                                                                                                                                cls.getDeclaredMethod($$c((short) 371, bArr2[16], bArr2[0]), new Class[0]).invoke(invoke3, new Object[0]);
                                                                                                                            }
                                                                                                                            obj17 = invoke7;
                                                                                                                        } catch (Throwable th63) {
                                                                                                                            th = th63;
                                                                                                                            th = th;
                                                                                                                            zipFile4 = zipFile7;
                                                                                                                            b6 = b4;
                                                                                                                            zipFile = zipFile4;
                                                                                                                            r14 = b6;
                                                                                                                            i5 = i4;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        short s31 = (short) 892;
                                                                                                                        byte[] bArr30 = $$a;
                                                                                                                        Class<?> cls22 = Class.forName($$c(s31, bArr30[107], bArr30[239]));
                                                                                                                        int i246 = $$b;
                                                                                                                        short s32 = (short) ((i246 & PDF417Common.NUMBER_OF_CODEWORDS) | (i246 ^ PDF417Common.NUMBER_OF_CODEWORDS));
                                                                                                                        byte b25 = bArr30[49];
                                                                                                                        Method declaredMethod3 = cls22.getDeclaredMethod($$c(s32, b25, (byte) (b25 | 67)), String.class);
                                                                                                                        try {
                                                                                                                            declaredMethod3.setAccessible(true);
                                                                                                                            obj17 = declaredMethod3.invoke(invoke3, str4);
                                                                                                                        } catch (InvocationTargetException e8) {
                                                                                                                            try {
                                                                                                                                throw ((Exception) e8.getCause());
                                                                                                                            } catch (ClassNotFoundException unused7) {
                                                                                                                                obj17 = null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (obj17 == null) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        Class cls23 = (Class) obj17;
                                                                                                                        byte[] bArr31 = $$a;
                                                                                                                        String $$c6 = $$c((short) 1027, bArr31[495], bArr31[0]);
                                                                                                                        Constructor declaredConstructor2 = cls23.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                        declaredConstructor2.setAccessible(true);
                                                                                                                        AFLogger = declaredConstructor2.newInstance(invoke3, Boolean.valueOf(!z5));
                                                                                                                        byte[] bArr32 = new byte[3324];
                                                                                                                        zipFile3 = zipFile7;
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                short s33 = s4;
                                                                                                                                short s34 = s3;
                                                                                                                                r142 = 0;
                                                                                                                                r142 = 0;
                                                                                                                                Object newInstance14 = Class.forName($$c(s33, bArr31[755], bArr31[239])).getDeclaredConstructor(Class.forName($$c(s34, bArr31[14], bArr31[239]))).newInstance(zipFile3.getInputStream(zipFile3.getEntry($$c((short) 1059, bArr31[495], bArr31[12]).substring(1))));
                                                                                                                                int i247 = $10;
                                                                                                                                int i248 = ((i247 | 93) << 1) - (i247 ^ 93);
                                                                                                                                $11 = i248 % 128;
                                                                                                                                int i249 = i248 % 2;
                                                                                                                                try {
                                                                                                                                    short s35 = (short) 482;
                                                                                                                                    ?? cls24 = Class.forName($$c(s35, bArr31[105], bArr31[239]));
                                                                                                                                    r142 = new Class[]{Class.forName($$c(s34, bArr31[14], bArr31[239]))};
                                                                                                                                    Object newInstance15 = cls24.getDeclaredConstructor(r142).newInstance(newInstance14);
                                                                                                                                    try {
                                                                                                                                        r142 = b4;
                                                                                                                                        try {
                                                                                                                                            Class.forName($$c(s35, bArr31[105], bArr31[239])).getMethod($$c((short) 504, bArr31[49], r142), byte[].class).invoke(newInstance15, bArr32);
                                                                                                                                            int i250 = $10 + 67;
                                                                                                                                            $11 = i250 % 128;
                                                                                                                                            int i251 = i250 % 2;
                                                                                                                                            try {
                                                                                                                                                Class.forName($$c(s35, bArr31[105], bArr31[239])).getMethod($$c((short) 371, bArr31[16], bArr31[0]), null).invoke(newInstance15, null);
                                                                                                                                                int i252 = 2 % 2;
                                                                                                                                                try {
                                                                                                                                                    i142 = Math.abs(i11);
                                                                                                                                                    zipFile7 = zipFile3;
                                                                                                                                                    b8 = r142;
                                                                                                                                                    s15 = s33;
                                                                                                                                                    s9 = s;
                                                                                                                                                    z10 = z3;
                                                                                                                                                    str3 = $$c6;
                                                                                                                                                    r14 = i12;
                                                                                                                                                    bArr20 = bArr32;
                                                                                                                                                    cls8 = cls23;
                                                                                                                                                    i143 = 3276;
                                                                                                                                                    i144 = 1;
                                                                                                                                                } catch (Throwable th64) {
                                                                                                                                                    th = th64;
                                                                                                                                                    th = th;
                                                                                                                                                    zipFile4 = zipFile3;
                                                                                                                                                    b6 = r142;
                                                                                                                                                    zipFile = zipFile4;
                                                                                                                                                    r14 = b6;
                                                                                                                                                    i5 = i4;
                                                                                                                                                    zipFile.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th65) {
                                                                                                                                                Throwable cause33 = th65.getCause();
                                                                                                                                                if (cause33 == null) {
                                                                                                                                                    throw th65;
                                                                                                                                                }
                                                                                                                                                throw cause33;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th66) {
                                                                                                                                            th = th66;
                                                                                                                                            Throwable th67 = th;
                                                                                                                                            Throwable cause34 = th67.getCause();
                                                                                                                                            if (cause34 == null) {
                                                                                                                                                throw th67;
                                                                                                                                            }
                                                                                                                                            throw cause34;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th68) {
                                                                                                                                        th = th68;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th69) {
                                                                                                                                    Throwable cause35 = th69.getCause();
                                                                                                                                    if (cause35 == null) {
                                                                                                                                        throw th69;
                                                                                                                                    }
                                                                                                                                    throw cause35;
                                                                                                                                }
                                                                                                                            } catch (Throwable th70) {
                                                                                                                                Throwable cause36 = th70.getCause();
                                                                                                                                if (cause36 == null) {
                                                                                                                                    throw th70;
                                                                                                                                }
                                                                                                                                throw cause36;
                                                                                                                            }
                                                                                                                        } catch (Throwable th71) {
                                                                                                                            th = th71;
                                                                                                                            zipFile3 = zipFile3;
                                                                                                                            r142 = b4;
                                                                                                                            th = th;
                                                                                                                            zipFile4 = zipFile3;
                                                                                                                            b6 = r142;
                                                                                                                            zipFile = zipFile4;
                                                                                                                            r14 = b6;
                                                                                                                            i5 = i4;
                                                                                                                            zipFile.close();
                                                                                                                            throw th;
                                                                                                                        }
                                                                                                                    } catch (Throwable th72) {
                                                                                                                        th = th72;
                                                                                                                        zipFile3 = zipFile7;
                                                                                                                    }
                                                                                                                } catch (Throwable th73) {
                                                                                                                    th = th73;
                                                                                                                    s = s9;
                                                                                                                    r9 = zipFile7;
                                                                                                                    r14 = b4;
                                                                                                                    i4 = i4;
                                                                                                                    th = th;
                                                                                                                    zipFile = r9;
                                                                                                                    r14 = r14;
                                                                                                                    i5 = i4;
                                                                                                                    zipFile.close();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th74) {
                                                                                                                th = th74;
                                                                                                                s = s9;
                                                                                                                b3 = b8;
                                                                                                                r9 = zipFile7;
                                                                                                                r14 = b3;
                                                                                                                i4 = i4;
                                                                                                                th = th;
                                                                                                                zipFile = r9;
                                                                                                                r14 = r14;
                                                                                                                i5 = i4;
                                                                                                                zipFile.close();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (Throwable th75) {
                                                                                                            Throwable cause37 = th75.getCause();
                                                                                                            if (cause37 == null) {
                                                                                                                throw th75;
                                                                                                            }
                                                                                                            throw cause37;
                                                                                                        }
                                                                                                    } catch (Throwable th76) {
                                                                                                        th = th76;
                                                                                                        s = s9;
                                                                                                        b3 = b8;
                                                                                                        z3 = z10;
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th77) {
                                                                                                Throwable cause38 = th77.getCause();
                                                                                                if (cause38 == null) {
                                                                                                    throw th77;
                                                                                                }
                                                                                                throw cause38;
                                                                                            }
                                                                                        } catch (Throwable th78) {
                                                                                            th = th78;
                                                                                            Throwable th79 = th;
                                                                                            Throwable cause39 = th79.getCause();
                                                                                            if (cause39 == null) {
                                                                                                throw th79;
                                                                                            }
                                                                                            throw cause39;
                                                                                        }
                                                                                    } catch (Throwable th80) {
                                                                                        th = th80;
                                                                                    }
                                                                                } catch (Throwable th81) {
                                                                                    th = th81;
                                                                                    Throwable th82 = th;
                                                                                    Throwable cause40 = th82.getCause();
                                                                                    if (cause40 == null) {
                                                                                        throw th82;
                                                                                    }
                                                                                    throw cause40;
                                                                                }
                                                                            } catch (Throwable th83) {
                                                                                th = th83;
                                                                            }
                                                                        } catch (Throwable th84) {
                                                                            th = th84;
                                                                            Throwable th85 = th;
                                                                            Throwable cause41 = th85.getCause();
                                                                            if (cause41 == null) {
                                                                                throw th85;
                                                                            }
                                                                            throw cause41;
                                                                        }
                                                                    } catch (Throwable th86) {
                                                                        th = th86;
                                                                    }
                                                                } catch (Throwable th87) {
                                                                    th = th87;
                                                                    s = s9;
                                                                    i4 = i2;
                                                                    r14 = b8;
                                                                    z3 = z10;
                                                                    r9 = zipFile6;
                                                                }
                                                            } catch (Throwable th88) {
                                                                th = th88;
                                                                obj3 = th;
                                                                b2 = r14;
                                                                i6 = i5;
                                                                int currentTimeMillis72222 = (int) System.currentTimeMillis();
                                                                i3 = i6;
                                                                int i1002222 = -(-(i3 * (-613)));
                                                                int i1012222 = (615 & i1002222) + (i1002222 | 615);
                                                                int i1022222 = ~(((-2) ^ i3) | ((-2) & i3));
                                                                int i1032222 = (currentTimeMillis72222 ^ i1022222) | (currentTimeMillis72222 & i1022222);
                                                                int i1042222 = ~i3;
                                                                int i1052222 = ~(i1042222 | 1);
                                                                int i1062222 = (i1012222 - (~(((i1032222 & i1052222) | (i1032222 ^ i1052222)) * 614))) - 1;
                                                                int i1072222 = ~currentTimeMillis72222;
                                                                int i1082222 = i1022222 | (~(((-2) ^ i1072222) | ((-2) & i1072222)));
                                                                int i1092222 = ~((i1072222 ^ i3) | (i1072222 & i3));
                                                                int i1102222 = ((i1082222 & i1092222) | (i1082222 ^ i1092222)) * (-1228);
                                                                int i1112222 = (i1062222 ^ i1102222) + ((i1102222 & i1062222) << 1);
                                                                int i1122222 = ((-2) & i1042222) | ((-2) ^ i1042222);
                                                                int i1132222 = ~((i1122222 & i1072222) | (i1122222 ^ i1072222));
                                                                int i1142222 = (~currentTimeMillis72222) | 1;
                                                                int i1152222 = ((~((i1142222 & i3) | (i1142222 ^ i3))) | i1132222) * 614;
                                                                i7 = (i1112222 ^ i1152222) + ((i1152222 & i1112222) << 1);
                                                                while (i7 < 7) {
                                                                }
                                                                short s102222 = (short) 1091;
                                                                byte[] bArr122222 = $$a;
                                                                throw ((Throwable) Class.forName($$c((short) 314, bArr122222[14], bArr122222[239])).getDeclaredConstructor(String.class, Throwable.class).newInstance($$c(s102222, bArr122222[105], bArr122222[44]), obj3));
                                                            }
                                                        } catch (Throwable th89) {
                                                            Throwable cause42 = th89.getCause();
                                                            if (cause42 == null) {
                                                                throw th89;
                                                            }
                                                            throw cause42;
                                                        }
                                                    } catch (Throwable th90) {
                                                        th = th90;
                                                        Throwable th91 = th;
                                                        Throwable cause43 = th91.getCause();
                                                        if (cause43 == null) {
                                                            throw th91;
                                                        }
                                                        throw cause43;
                                                    }
                                                } catch (Throwable th92) {
                                                    th = th92;
                                                }
                                            } catch (Throwable th93) {
                                                th = th93;
                                                s = s9;
                                                i5 = i2;
                                                r14 = b8;
                                                z3 = z10;
                                            }
                                        }
                                        boolean z11 = z4;
                                        i2 = i3 + 1;
                                        z9 = z2;
                                        b8 = b;
                                        s9 = s;
                                        z = z11;
                                        zArr4 = zArr;
                                        $$c2 = str;
                                        zArr5 = zArr2;
                                        zArr6 = zArr3;
                                        z10 = z3;
                                    }
                                    return;
                                }
                            }
                            z8 = false;
                            zArr6[1] = z8;
                            zArr6[4] = i16 < 21;
                            i2 = 0;
                            z = false;
                            while (!z) {
                                if (zArr6[i2]) {
                                }
                                boolean z112 = z4;
                                i2 = i3 + 1;
                                z9 = z2;
                                b8 = b;
                                s9 = s;
                                z = z112;
                                zArr4 = zArr;
                                $$c2 = str;
                                zArr5 = zArr2;
                                zArr6 = zArr3;
                                z10 = z3;
                            }
                        }
                        invoke2 = null;
                        if (obj2 == null) {
                        }
                        if (invoke2 == null) {
                        }
                        if (invoke == null) {
                            int i832 = $10;
                            i17 = ((i832 | 61) << 1) - (i832 ^ 61);
                            $11 = i17 % 128;
                            if (i17 % 2 != 0) {
                            }
                            Object[] objArr22 = new Object[i18];
                            objArr22[1] = $$c;
                            objArr22[c2] = newInstance;
                            short s82 = (short) 216;
                            byte[] bArr92 = $$a;
                            invoke = Class.forName($$c(s82, bArr92[80], bArr92[239])).getDeclaredConstructor(Class.forName($$c(s82, bArr92[80], bArr92[239])), String.class).newInstance(objArr22);
                        }
                        short s92 = (short) 216;
                        byte[] bArr102 = $$a;
                        Object[] objArr32 = (Object[]) Array.newInstance(Class.forName($$c(s92, bArr102[80], bArr102[239])), 7);
                        objArr32[0] = null;
                        objArr32[1] = invoke;
                        objArr32[2] = newInstance;
                        objArr32[3] = invoke2;
                        objArr32[4] = invoke;
                        objArr32[5] = newInstance;
                        objArr32[6] = invoke2;
                        boolean[] zArr42 = {false, true, true, true, true, true, true};
                        boolean[] zArr52 = {false, false, false, false, true, true, true};
                        boolean[] zArr62 = new boolean[7];
                        zArr62[0] = false;
                        zArr62[1] = false;
                        zArr62[2] = true;
                        zArr62[3] = true;
                        zArr62[4] = false;
                        zArr62[5] = true;
                        zArr62[6] = true;
                        Class<?> cls32 = Class.forName($$c((short) 274, bArr102[114], bArr102[1063]));
                        i16 = cls32.getDeclaredField($$c((short) 297, bArr102[56], bArr102[126])).getInt(cls32);
                        boolean z102 = !(i16 >= 34);
                        if (i16 != 29) {
                            z7 = true;
                            c = 0;
                            zArr62[c] = z7;
                            Object[] objArr42 = objArr32;
                            if (i16 >= 21) {
                            }
                            z8 = false;
                            zArr62[1] = z8;
                            zArr62[4] = i16 < 21;
                            i2 = 0;
                            z = false;
                            while (!z) {
                            }
                        }
                        c = 0;
                        z7 = false;
                        zArr62[c] = z7;
                        Object[] objArr422 = objArr32;
                        if (i16 >= 21) {
                        }
                        z8 = false;
                        zArr62[1] = z8;
                        zArr62[4] = i16 < 21;
                        i2 = 0;
                        z = false;
                        while (!z) {
                        }
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    invoke2 = null;
                    if (obj2 == null) {
                    }
                    if (invoke2 == null) {
                    }
                    if (invoke == null) {
                    }
                    short s922 = (short) 216;
                    byte[] bArr1022 = $$a;
                    Object[] objArr322 = (Object[]) Array.newInstance(Class.forName($$c(s922, bArr1022[80], bArr1022[239])), 7);
                    objArr322[0] = null;
                    objArr322[1] = invoke;
                    objArr322[2] = newInstance;
                    objArr322[3] = invoke2;
                    objArr322[4] = invoke;
                    objArr322[5] = newInstance;
                    objArr322[6] = invoke2;
                    boolean[] zArr422 = {false, true, true, true, true, true, true};
                    boolean[] zArr522 = {false, false, false, false, true, true, true};
                    boolean[] zArr622 = new boolean[7];
                    zArr622[0] = false;
                    zArr622[1] = false;
                    zArr622[2] = true;
                    zArr622[3] = true;
                    zArr622[4] = false;
                    zArr622[5] = true;
                    zArr622[6] = true;
                    Class<?> cls322 = Class.forName($$c((short) 274, bArr1022[114], bArr1022[1063]));
                    i16 = cls322.getDeclaredField($$c((short) 297, bArr1022[56], bArr1022[126])).getInt(cls322);
                    boolean z1022 = !(i16 >= 34);
                    if (i16 != 29) {
                    }
                    c = 0;
                    z7 = false;
                    zArr622[c] = z7;
                    Object[] objArr4222 = objArr322;
                    if (i16 >= 21) {
                    }
                    z8 = false;
                    zArr622[1] = z8;
                    zArr622[4] = i16 < 21;
                    i2 = 0;
                    z = false;
                    while (!z) {
                    }
                }
                short s36 = (short) 131;
                byte[] bArr33 = $$a;
                obj = Class.forName($$c(s36, bArr33[72], bArr33[1063])).getMethod($$c((short) 152, bArr33[107], (byte) 70), new Class[0]).invoke(null, null);
                if (obj == null) {
                }
                int i802 = 2 % 2;
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                invoke2 = null;
                if (obj2 == null) {
                }
                if (invoke2 == null) {
                }
                if (invoke == null) {
                }
                short s9222 = (short) 216;
                byte[] bArr10222 = $$a;
                Object[] objArr3222 = (Object[]) Array.newInstance(Class.forName($$c(s9222, bArr10222[80], bArr10222[239])), 7);
                objArr3222[0] = null;
                objArr3222[1] = invoke;
                objArr3222[2] = newInstance;
                objArr3222[3] = invoke2;
                objArr3222[4] = invoke;
                objArr3222[5] = newInstance;
                objArr3222[6] = invoke2;
                boolean[] zArr4222 = {false, true, true, true, true, true, true};
                boolean[] zArr5222 = {false, false, false, false, true, true, true};
                boolean[] zArr6222 = new boolean[7];
                zArr6222[0] = false;
                zArr6222[1] = false;
                zArr6222[2] = true;
                zArr6222[3] = true;
                zArr6222[4] = false;
                zArr6222[5] = true;
                zArr6222[6] = true;
                Class<?> cls3222 = Class.forName($$c((short) 274, bArr10222[114], bArr10222[1063]));
                i16 = cls3222.getDeclaredField($$c((short) 297, bArr10222[56], bArr10222[126])).getInt(cls3222);
                boolean z10222 = !(i16 >= 34);
                if (i16 != 29) {
                }
                c = 0;
                z7 = false;
                zArr6222[c] = z7;
                Object[] objArr42222 = objArr3222;
                if (i16 >= 21) {
                }
                z8 = false;
                zArr6222[1] = z8;
                zArr6222[4] = i16 < 21;
                i2 = 0;
                z = false;
                while (!z) {
                }
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        } catch (Throwable th94) {
            Throwable cause44 = th94.getCause();
            if (cause44 == null) {
                throw th94;
            }
            throw cause44;
        }
    }

    public static int getMediationNetwork(int i2) {
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = (i4 & 71) + (i4 | 71);
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object obj = AFLogger;
        int i8 = i6 + 105;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = (i6 ^ 73) + ((i6 & 73) << 1);
        $10 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c((short) 569, bArr[495], bArr[0]), true, (ClassLoader) unregisterClient).getMethod($$c((short) 1113, bArr[14], (byte) 70), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i12 = $10 + 41;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) {
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 ^ 3) + ((i3 & 3) << 1);
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object obj2 = AFLogger;
        int i6 = ((i3 | 121) << 1) - (i3 ^ 121);
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        int i9 = (i7 ^ 111) + ((i7 & 111) << 1);
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c((short) 569, bArr[495], bArr[0]), true, (ClassLoader) unregisterClient).getMethod($$c((short) 1113, bArr[14], (byte) 70), Object.class).invoke(obj2, obj)).intValue();
            int i11 = $11;
            int i12 = (i11 ^ 35) + ((i11 & 35) << 1);
            $10 = i12 % 128;
            if (i12 % 2 == 0) {
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

    public static Object getMonetizationNetwork(int i2, int i3, char c) {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = (i5 & 41) + (i5 | 41);
        $11 = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Object obj2 = AFLogger;
        int i7 = (i5 ^ 53) + ((i5 & 53) << 1);
        $11 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte[] bArr = $$a;
            Object invoke = Class.forName($$c((short) 569, bArr[495], bArr[0]), true, (ClassLoader) unregisterClient).getMethod($$c((short) 1113, bArr[14], (byte) 70), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj2, objArr);
            int i9 = $10;
            int i10 = (i9 & 19) + (i9 | 19);
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
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

    private AFi1hSDK() {
    }
}

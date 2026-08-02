package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import java.util.Map;

/* loaded from: classes5.dex */
public class removeParam {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static Object SchemeConfiguration;
    private static Object build;
    private static long cbConfiguration;
    private static long dinersSchemeConfiguration;
    private static long eftposConfiguration;
    private static int jcbConfiguration;
    public static final Map restrictedParameters;
    public static final Map visaSchemeConfiguration;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, int i2) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 67 - i;
        int i6 = s + 4;
        int i7 = i2 + 33;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = ($12 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            $13 = i8;
            $12 = (i8 + 23) % 128;
            int i9 = i5;
            i4 = 0;
            i6++;
            i7 = (i7 + i9) - 3;
            $12 = ($13 + 53) % 128;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i6];
            i6++;
            i7 = (i7 + i9) - 3;
            $12 = ($13 + 53) % 128;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        /*
            Method dump skipped, instructions count: 8030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.removeParam.<clinit>():void");
    }

    public static int ThreeDS2Service(Object obj) {
        int i = $11;
        int i2 = ((i ^ 49) + ((i & 49) << 1)) % 128;
        $10 = i2;
        Object obj2 = SchemeConfiguration;
        $11 = ((i2 & 95) + (i2 | 95)) % 128;
        try {
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[139], (short) 640, bArr[31]), true, (ClassLoader) build).getMethod($$c((byte) ($$b & 496), (short) 1286, bArr[1180]), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int get(int i) {
        int i2 = $11;
        int i3 = ((i2 | 1) << 1) - (i2 ^ 1);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = SchemeConfiguration;
        $11 = ((i4 & 91) + (i4 | 91)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            return ((Integer) Class.forName($$c(bArr[139], (short) 640, bArr[31]), true, (ClassLoader) build).getMethod($$c(bArr[578], (short) 1288, bArr[450]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i = $10;
        $11 = ((i & 91) + (i | 91)) % 128;
        byte[] bArr = new byte[1306];
        System.arraycopy("\u0000°\u00078\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\r\fó\u000f\u0001ÅBú\u0012ò\u0005\u0012ô\u0010òÑH÷\rö\u0003\u0002\u0012¿Gô\nÇ=\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÍ7\u000f\u0002û\u0006\u0001\u0011\u0000öñ\u0013\b\u0000\u000bûñ\u0003\u000f\u0001ÄCú\u0012ò\u0005\u0012ô\u0010òÐI÷\rö\u0003\u0002\u0012¾Hô\n\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001ÅBú\u0012ò\u0005\u0012ô\u0010òÑH÷\rö\u0003\u0002\u0012¿Gô\nÇ=\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÍ8\u0005Ð3\u0002Ù\u0004\u0002\u0000þ\u0004\b.Ûý\u0005/Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001ÄCú\u0012ò\u0005\u0012ô\u0010òÐI÷\rö\u0003\u0002\u0012¾Hô\nÆ>\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÌ<\u0001\u0012æ\r\u0014ÿþ\bü\u000f\u000f\u0001ÄCú\u0012ò\u0005\u0012ô\u0010òÐI÷\rö\u0003\u0002\u0012¾Hô\nÆ>\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÌ8\u000f\u0002û\u0006\u0001\u0011\u0000öñ\u0013\b\u0000\u000bûñ\u0003\u0017\rö\u0003â\u0012â$\u0015\u0010\u0007öý\u0005ç(\b\u0004ð\u0010ø\u0005û\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001ÅBú\u0012ò\u0005\u0012ô\u0010òÑH÷\rö\u0003\u0002\u0012¿Gô\nÇ=\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÍFö\u000b\u0005\nòî\u0014\u0014ò\u000fºC5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001ÅBú\u0012ò\u0005\u0012ô\u0010òÑH÷\rö\u0003\u0002\u0012¿Gô\nÇ=\bû\u000fò\u0015\u0004\u0001\u0006ñ\u0014\u0004\u0000öÍ8×ý\u0001\fü5\u0005Ñ\u0000\bþ\u0003\u0003\u0003\u00061Îî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\bþ\u000eøû\u000e\u0000\u0014î\u0001\u0012\u0017\rö\u0003â\u0012â$\u0015\u0010\u0007öý\u0005".getBytes("ISO-8859-1"), 0, bArr, 0, 1306);
        $$a = bArr;
        $$b = 78;
        int i2 = $10;
        int i3 = (i2 & 103) + (i2 | 103);
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static Object initialize(int i, char c, int i2) {
        int i3 = $11;
        Object obj = SchemeConfiguration;
        int i4 = (((i3 | 49) << 1) - (i3 ^ 49)) % 128;
        $10 = i4;
        $11 = (i4 + 97) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Character.valueOf(c), Integer.valueOf(i2)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[139], (short) 640, bArr[31]), true, (ClassLoader) build);
            byte b = (byte) (-bArr[52]);
            String $$c = $$c(b, (short) ((b ^ 1220) | (b & 1220)), bArr[41]);
            Class cls2 = Integer.TYPE;
            return cls.getMethod($$c, cls2, Character.TYPE, cls2).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setShadowLayer;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
abstract class setHighlightColor implements setShadowLayer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static short[] ThreeDS2ServiceInitializationCallback;
    private static int createTransaction;
    private static int get;
    private static byte[] getSDKInfo;
    private static int getSDKVersion;
    private static int getWarnings;
    private final String ThreeDS2ServiceInstance;
    private final no initialize = (no) nu.initialize(new Object[]{setShadowLayer.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        createTransaction = 1;
        getWarnings = -222711945;
        get = -1686431689;
        ThreeDS2Service = -2098563177;
        getSDKInfo = new byte[]{-13, -12, 26, 21, -50, 38, 25, -32, 19, -9, -28, -43, 92, -32, -17, 23, -32, -29, -35, 44, 29, 28, 27, -24, 16, -21, 8, PnmConstants.PPM_RAW_CODE, -58, -54, 39, -58, Byte.MAX_VALUE, -122, 59, PnmConstants.PBM_TEXT_CODE, -52, -59, PnmConstants.PPM_TEXT_CODE, 56, -56, 117, -117, -57, 56, -63, 100, -118, -54, PnmConstants.PPM_RAW_CODE, -61, PnmConstants.PBM_RAW_CODE, -51, 60, PnmConstants.PNM_SEPARATOR, 1, -63, -13, -52, PnmConstants.PGM_RAW_CODE, -58, PnmConstants.PNM_SEPARATOR, -51, -55, -50, -49, PnmConstants.PPM_TEXT_CODE, 60, 114, -19, -64, PnmConstants.PPM_TEXT_CODE, 28, -117, PnmConstants.PPM_RAW_CODE, -58, -54, 39, -58, Byte.MAX_VALUE, -126, -56, 103, -113, -52, -54, 48, 59, 40, -28, -96, 71, -65, 90, 117, -123, -87, 122, 117, -24, 83, -81, 91, 21, -21, -95, 14, -31, -93, PnmConstants.PNM_PREFIX_BYTE, 91, 27, -26, -84, -93, 92, 83, 28, -24, -91, 92, -81, 73, -92, -96, -89, -90, 90, 85, 27, -21, 123};
    }

    public setHighlightColor(String str) {
        this.ThreeDS2ServiceInstance = str;
    }

    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4;
        int length;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        boolean z2;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(get)};
            byte b2 = 0;
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj == null) {
                Class cls2 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 61, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 653 - TextUtils.indexOf((CharSequence) "", '0', 0));
                Object[] objArr3 = new Object[1];
                b((byte) 0, -1, 2, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            boolean z3 = intValue == -1;
            if (z3) {
                $10 = ($11 + 81) % 128;
                byte[] bArr3 = getSDKInfo;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        Object[] objArr4 = {Integer.valueOf(bArr3[i6])};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1684720202);
                        if (obj2 != null) {
                            i5 = i6;
                            method = obj2;
                            bArr2 = bArr3;
                            z2 = z3;
                        } else {
                            byte b3 = b2;
                            i5 = i6;
                            bArr2 = bArr3;
                            Class cls3 = (Class) removeParam.initialize(59 - View.resolveSizeAndState(b2, b2, b2), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(b3) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(b3) == 0L ? 0 : -1)) + 3162);
                            Object[] objArr5 = new Object[1];
                            z2 = z3;
                            b(b3, -1, b3, objArr5);
                            method = cls3.getMethod((String) objArr5[b3], cls);
                            map2.put(-1684720202, method);
                        }
                        bArr4[i5] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i6 = i5 + 1;
                        z3 = z2;
                        bArr3 = bArr2;
                        b2 = 0;
                    }
                    bArr3 = bArr4;
                }
                z = z3;
                if (bArr3 != null) {
                    byte[] bArr5 = getSDKInfo;
                    Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(getWarnings)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(981393365);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(61 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 654);
                        Object[] objArr7 = new Object[1];
                        b((byte) 0, -1, 2, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(981393365, obj3);
                    }
                    intValue = (byte) (((byte) (bArr5[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] ^ 2786809877878216728L)) + ((int) (get ^ 2786809877878216728L)));
                } else {
                    intValue = (short) (((short) (ThreeDS2ServiceInitializationCallback[i2 + ((int) (getWarnings ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (get ^ 2786809877878216728L)));
                }
            } else {
                z = z3;
            }
            if (intValue > 0) {
                int i7 = ((i2 + intValue) - 2) + ((int) (getWarnings ^ 2786809877878216728L));
                if (z) {
                    $10 = ($11 + 99) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsdkversion.ThreeDS2ServiceInstance = i7 + i4;
                Object[] objArr8 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(ThreeDS2Service), sb};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1855485602);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(54 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (13764 - TextUtils.indexOf("", "", 0)), TextUtils.indexOf("", "") + 2802);
                    Object[] objArr9 = new Object[1];
                    b((byte) 0, -1, 1, objArr9);
                    obj4 = cls5.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map4.put(-1855485602, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, objArr8)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr6 = getSDKInfo;
                if (bArr6 != null) {
                    int i8 = $11 + 91;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        length = bArr6.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr6.length;
                        bArr = new byte[length];
                    }
                    for (int i9 = 0; i9 < length; i9++) {
                        bArr[i9] = (byte) (bArr6[i9] ^ 2786809877878216728L);
                    }
                    bArr6 = bArr;
                }
                boolean z4 = bArr6 != null;
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    int i10 = getsdkversion.ThreeDS2ServiceInstance;
                    if (z4) {
                        byte[] bArr7 = getSDKInfo;
                        getsdkversion.ThreeDS2ServiceInstance = i10 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr7[i10] ^ 2786809877878216728L)) + s)) ^ b));
                    } else {
                        short[] sArr = ThreeDS2ServiceInitializationCallback;
                        getsdkversion.ThreeDS2ServiceInstance = i10 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[i10] ^ 2786809877878216728L)) + s)) ^ b));
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    getsdkversion.initialize++;
                }
            }
            String sb2 = sb.toString();
            int i11 = $10 + 71;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                objArr[0] = sb2;
            } else {
                int i12 = 53 / 0;
                objArr[0] = sb2;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = b * 4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = i2 + 102;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i7;
            i6 = (-i6) + i9;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            byte b2 = bArr[i5];
            byte[] bArr4 = bArr;
            i9 = i6;
            i6 = b2;
            bArr3 = bArr4;
            i6 = (-i6) + i9;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{69, 111, 44, 110};
        $$b = 239;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setShadowLayer
    public final void getWarnings(Context context, setShadowLayer.initialize initializeVar) {
        Uri parse = Uri.parse(this.ThreeDS2ServiceInstance);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 428961583, (byte) ((-2) - (ViewConfiguration.getTapTimeout() >> 16)), (short) (Process.myTid() >> 22), (-1774368623) - KeyEvent.keyCodeFromString(""), (-47) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        Intent intent = new Intent(((String) objArr[0]).intern(), parse);
        try {
            Intent intent2 = new Intent(intent);
            t_(context, intent2);
            context.startActivity(intent2);
            createTransaction = (getSDKVersion + 25) % 128;
        } catch (ActivityNotFoundException unused) {
            no noVar = this.initialize;
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 428961609, (byte) (Color.red(0) + 43), (short) KeyEvent.normalizeMetaState(0), (-1774368597) - ExpandableListView.getPackedPositionGroup(0L), Color.red(0) - 48, objArr2);
            noVar.initialize(((String) objArr2[0]).intern());
            r_(context, new Intent(intent), initializeVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.netcetera.threeds.sdk.infrastructure.setHighlightColor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.netcetera.threeds.sdk.infrastructure.setHighlightColor] */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    public void r_(Context context, Intent intent, setShadowLayer.initialize initializeVar) {
        int i = getSDKVersion + 95;
        createTransaction = i % 128;
        try {
            if (i % 2 == 0) {
                intent.setFlags(268435456);
                context.startActivity(intent);
                int i2 = 79 / 0;
            } else {
                intent.setFlags(268435456);
                context.startActivity(intent);
            }
            this = (createTransaction + 99) % 128;
            getSDKVersion = this;
        } catch (ActivityNotFoundException e) {
            no noVar = this.initialize;
            Object[] objArr = new Object[1];
            a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 428961602, (byte) ((Process.myTid() >> 22) + 66), (short) View.resolveSizeAndState(0, 0, 0), Color.blue(0) - 1774368534, (-48) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e);
            initializeVar.ThreeDS2ServiceInstance();
        }
        int i3 = createTransaction + 45;
        getSDKVersion = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    public abstract void t_(Context context, Intent intent);
}

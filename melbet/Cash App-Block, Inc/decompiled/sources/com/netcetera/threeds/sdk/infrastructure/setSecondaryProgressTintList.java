package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class setSecondaryProgressTintList implements setProgressTintMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2ServiceInstance;
    private static int getSDKVersion;
    private static int initialize;
    private final setProgressTintMode ThreeDS2Service;
    private final Logger get = LoggerFactory.getLogger((Class<?>) setSecondaryProgressTintList.class);
    private final ExecutorService getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        getSDKVersion = 1;
        ThreeDS2ServiceInstance = -8213062441291581262L;
    }

    public setSecondaryProgressTintList(ExecutorService executorService, setProgressTintMode setprogresstintmode) {
        this.getWarnings = executorService;
        this.ThreeDS2Service = setprogresstintmode;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            int i3 = $10 + 39;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr = str.toCharArray();
                int i4 = 92 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(ThreeDS2ServiceInstance ^ (-2776494906517314268L), cArr, i);
        int i5 = 4;
        oncompleted.initialize = 4;
        $11 = ($10 + 85) % 128;
        while (true) {
            int i6 = oncompleted.initialize;
            if (i6 >= initialize2.length) {
                objArr[0] = new String(initialize2, i5, initialize2.length - 4);
                return;
            }
            int i7 = i6 - 4;
            oncompleted.ThreeDS2Service = i7;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i6] ^ initialize2[i6 % 4]), Long.valueOf(i7), Long.valueOf(ThreeDS2ServiceInstance)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i5;
                } else {
                    i2 = i5;
                    Class cls = (Class) removeParam.initialize(Process.getGidForName("") + 49, (char) (TextUtils.indexOf((CharSequence) "", '0') + 27781), 2440 - ExpandableListView.getPackedPositionChild(0L));
                    Object[] objArr3 = new Object[1];
                    b(0, (short) 0, 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i6] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(66 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.lastIndexOf("", '0') + 14236)).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 37) % 128;
                i5 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = 112 - (i * 2);
        int i6 = (s * 4) + 1;
        byte[] bArr = $$a;
        int i7 = 4 - (i2 * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i5 = i6;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i7;
            i5 += i7;
            i7 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i7];
            byte[] bArr4 = bArr;
            i9 = i7;
            i7 = b;
            i8 = i4;
            bArr3 = bArr4;
            i5 += i7;
            i7 = i9 + 1;
            bArr = bArr3;
            i3 = i8;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

    private /* synthetic */ Void get() {
        int i = getSDKVersion + 47;
        initialize = i % 128;
        int i2 = i % 2;
        setProgressTintMode setprogresstintmode = this.ThreeDS2Service;
        if (i2 != 0) {
            setprogresstintmode.ThreeDS2ServiceInstance();
            throw null;
        }
        setprogresstintmode.ThreeDS2ServiceInstance();
        getSDKVersion = (initialize + 93) % 128;
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{116, PnmConstants.PNM_SEPARATOR, -47, 79};
        $$b = 53;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setSecondaryProgressTintList setsecondaryprogresstintlist = (setSecondaryProgressTintList) objArr[0];
        setProgressBackgroundTintList setprogressbackgroundtintlist = (setProgressBackgroundTintList) objArr[1];
        int i = getSDKVersion + 119;
        initialize = i % 128;
        if (i % 2 != 0) {
            setsecondaryprogresstintlist.ThreeDS2Service.ThreeDS2Service(setprogressbackgroundtintlist);
            throw null;
        }
        setsecondaryprogresstintlist.ThreeDS2Service.ThreeDS2Service(setprogressbackgroundtintlist);
        initialize = (getSDKVersion + 59) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void ThreeDS2Service(setProgressBackgroundTintList setprogressbackgroundtintlist) {
        try {
            this.getWarnings.submit(new setSecondaryProgressTintBlendMode(this, setprogressbackgroundtintlist));
            getSDKVersion = (initialize + 101) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.get;
            Object[] objArr = new Object[1];
            a("ϔ\u0380#\udddd༩둷ᓿ豘痭蹗藓ᮀ\uef1c៸Ꮞ釽您鴪ꨬ\uef5b\uda94歄ₘ暾䰙\uf0e1뻡ﳠ얠繛㔯䩘㿎쑊䎍솲넴䷨\ud9f3弜⪠\udb1f偖핋鳃ꂾ\ueecbⲡᙳ⻤擤먜辚됌", 1 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void ThreeDS2ServiceInstance() {
        try {
            this.getWarnings.submit(new setProgressDrawableTiled(this));
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.get;
            Object[] objArr = new Object[1];
            a("ϔ\u0380#\udddd༩둷ᓿ豘痭蹗藓ᮀ\uef1c៸Ꮞ釽您鴪ꨬ\uef5b\uda94歄ₘ暾䰙\uf0e1뻡ﳠ얠繛㔯䩘㿎쑊䎍솲넴䷨\ud9f3弜⪠\udb1f偖핋鳃ꂾ\ueecbⲡᙳ⻤擤먜辚됌", TextUtils.getCapsMode("", 0, 0), objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        int i = initialize + 11;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void getWarnings() {
        try {
            this.getWarnings.submit(new setSecondaryProgressTintMode(this));
            getSDKVersion = (initialize + 121) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.get;
            Object[] objArr = new Object[1];
            a("ϔ\u0380#\udddd༩둷ᓿ豘痭蹗藓ᮀ\uef1c៸Ꮞ釽您鴪ꨬ\uef5b\uda94歄ₘ暾䰙\uf0e1뻡ﳠ얠繛㔯䩘㿎쑊䎍솲넴䷨\ud9f3弜⪠\udb1f偖핋鳃ꂾ\ueecbⲡᙳ⻤擤먜辚됌", View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        this.getWarnings.shutdown();
        int i = initialize + 27;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Void get(setSecondaryProgressTintList setsecondaryprogresstintlist) {
        int i = getSDKVersion + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        initialize = i % 128;
        if (i % 2 == 0) {
            return setsecondaryprogresstintlist.initialize();
        }
        setsecondaryprogresstintlist.initialize();
        throw null;
    }

    private /* synthetic */ Void initialize() {
        int i = getSDKVersion + 85;
        initialize = i % 128;
        int i2 = i % 2;
        setProgressTintMode setprogresstintmode = this.ThreeDS2Service;
        if (i2 != 0) {
            setprogresstintmode.getWarnings();
            int i3 = 98 / 0;
            return null;
        }
        setprogresstintmode.getWarnings();
        return null;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }

    public static setProgressTintMode ThreeDS2ServiceInstance(setProgressTintMode setprogresstintmode) {
        setSecondaryProgressTintList setsecondaryprogresstintlist = new setSecondaryProgressTintList(Executors.newSingleThreadExecutor(), setprogresstintmode);
        int i = getSDKVersion + 43;
        initialize = i % 128;
        if (i % 2 == 0) {
            return setsecondaryprogresstintlist;
        }
        throw null;
    }

    public static /* synthetic */ Void ThreeDS2ServiceInstance(setSecondaryProgressTintList setsecondaryprogresstintlist) {
        initialize = (getSDKVersion + 99) % 128;
        Void r2 = setsecondaryprogresstintlist.get();
        int i = initialize + 13;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
        return r2;
    }

    public static /* synthetic */ Void getWarnings(setSecondaryProgressTintList setsecondaryprogresstintlist, setProgressBackgroundTintList setprogressbackgroundtintlist) {
        getSDKVersion = (initialize + 37) % 128;
        Void r2 = (Void) ThreeDS2Service(new Object[]{setsecondaryprogresstintlist, setprogressbackgroundtintlist}, -69185716, 69185716, System.identityHashCode(setsecondaryprogresstintlist));
        int i = initialize + 57;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return r2;
        }
        throw null;
    }
}

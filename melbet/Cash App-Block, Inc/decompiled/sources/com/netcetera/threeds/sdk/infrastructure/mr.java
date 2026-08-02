package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class mr extends DialogFragment implements js {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2ServiceInitializationCallback;
    private static long cleanup;
    private static int getSDKVersion;
    private static int onCompleted;
    private boolean ThreeDS2Service;
    private boolean ThreeDS2ServiceInstance;
    private mk createTransaction;
    private boolean get;
    private mu getSDKInfo;
    private final no getWarnings = (no) nu.initialize(new Object[]{mr.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private boolean initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        onCompleted = 1;
        ThreeDS2ServiceInitializationCallback = new char[]{23061, 47040, 33226, 37863, 60883, 65521, 51694, 56310, 13791, 1936, 4536, 25495, 32144, 20359, 22946, 43954, 34231, 38732, 57676, 62311, 52563, 57190, 10598, 15222, 35147, 25780, 21169, 16572, 16061, 35195, 25761, 21158, 16574, 16055, 11412, 6856, 2195, 59031, 54510, 49902, 45305, 44799, 40149, 35546, 30933, 22168, 17460, 12832, 8245, 7800, 3155, 64044, 59427, 50776, 46163, 41548, 36955, 36408, 31831, 27201, 22622, 13916, 9647, 5055};
        cleanup = -5519327490242091840L;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ((i | i3) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i4 | i2)) | i) * (-328)) + (i2 * (-163)) + (i * 165);
        int i6 = ~i;
        int i7 = ~i2;
        if ((((~(i | i4 | i2)) | (~(i3 | i7)) | (~(i6 | i7))) * EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + i5 != 1) {
            mr mrVar = (mr) objArr[0];
            Bundle bundle = (Bundle) objArr[1];
            getSDKVersion = (onCompleted + 51) % 128;
            super.onCreate(bundle);
            mrVar.setRetainInstance(true);
            mrVar.setCancelable(false);
            onCompleted = (getSDKVersion + 55) % 128;
            return null;
        }
        mr mrVar2 = (mr) objArr[0];
        Bundle bundle2 = (Bundle) objArr[1];
        onCompleted = (getSDKVersion + 67) % 128;
        super.onActivityCreated(bundle2);
        if (mrVar2.getSDKVersion()) {
            mrVar2.getSDKInfo.bR_(bundle2, mrVar2.get);
            getSDKVersion = (onCompleted + 33) % 128;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        Object method;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        int i4 = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        $10 = ($11 + 119) % 128;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i) {
                break;
            }
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i7 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(ThreeDS2ServiceInitializationCallback[i2 * i5])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        i3 = i5;
                        method = obj;
                    } else {
                        jArr = jArr2;
                        Class cls3 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(i4, i4), (Process.myTid() >> 22) + 3221);
                        Object[] objArr3 = new Object[1];
                        i3 = i5;
                        b((byte) 0, (short) 0, 1, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(cleanup), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 70, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 50703), TextUtils.indexOf("", "") + 7789)).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (27780 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 2442 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr6 = new Object[1];
                        b((byte) 0, (short) 0, 0, objArr6);
                        obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1724349229, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr7 = {Integer.valueOf(ThreeDS2ServiceInitializationCallback[i2 + i5])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 3220 - MotionEvent.axisFromString(""));
                    Object[] objArr8 = new Object[1];
                    b((byte) 0, (short) 0, 1, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(cleanup), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 69, (char) (50704 - View.getDefaultSize(0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7789)).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i5] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 48, (char) (Color.rgb(0, 0, 0) + 16804996), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2440);
                    Object[] objArr11 = new Object[1];
                    b((byte) 0, (short) 0, 0, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
            jArr2 = jArr;
            i4 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i8 = threeDS2ServiceInitializationCallback.initialize;
            if (i8 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 113) % 128;
            cArr[i8] = (char) jArr3[i8];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls7 = (Class) removeParam.initialize(48 - View.resolveSize(0, 0), (char) (27779 - Process.getGidForName("")), 2441 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr13 = new Object[1];
                b((byte) 0, (short) 0, 0, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (s * 4);
        int i5 = (b * 2) + 1;
        byte[] bArr = $$a;
        int i6 = (i * 3) + 97;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i2 = i4;
            i3 = 0;
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i2];
            i4 += -i7;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i2 = i4;
            i4 = i6;
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{15, -74, 11, 22};
        $$b = 29;
    }

    private void onError() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            getSDKVersion = (onCompleted + 13) % 128;
            if (this.ThreeDS2ServiceInstance) {
                dialog.show();
            } else {
                dialog.hide();
                onCompleted = (getSDKVersion + 19) % 128;
            }
        }
    }

    public void ThreeDS2ServiceInitializationCallback() {
        int i = (getSDKVersion + 67) % 128;
        onCompleted = i;
        this.initialize = true;
        getSDKVersion = (i + 117) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public void ThreeDS2ServiceInstance() {
        if (this.ThreeDS2ServiceInstance) {
            this.ThreeDS2ServiceInstance = false;
            onError();
            getSDKVersion = (onCompleted + 41) % 128;
        }
        int i = getSDKVersion + 111;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public Dialog bO_() {
        int i = getSDKVersion + 91;
        onCompleted = i % 128;
        int i2 = i % 2;
        Dialog dialog = getDialog();
        if (i2 == 0) {
            int i3 = 51 / 0;
        }
        onCompleted = (getSDKVersion + 81) % 128;
        return dialog;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public Intent bP_() {
        onCompleted = (getSDKVersion + 71) % 128;
        if (getActivity() == null) {
            return null;
        }
        onCompleted = (getSDKVersion + 89) % 128;
        return getActivity().getIntent();
    }

    public void cleanup() {
        onCompleted = (getSDKVersion + 73) % 128;
        dismiss();
        setShowsDialog(false);
        getSDKVersion = (onCompleted + 61) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2.ThreeDS2Service != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r2.ThreeDS2Service != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        cleanup();
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.js
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get() {
        int i = onCompleted + 17;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            this.get = false;
        } else {
            this.get = true;
        }
        getSDKVersion = (onCompleted + 91) % 128;
    }

    public void getSDKInfo() {
        int i = getSDKVersion + 31;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            getDialog();
            throw null;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            getSDKVersion = (onCompleted + 81) % 128;
            if (getRetainInstance()) {
                dialog.setDismissMessage(null);
                getSDKVersion = (onCompleted + 81) % 128;
            }
        }
    }

    public boolean getSDKVersion() {
        int i = (onCompleted + 23) % 128;
        getSDKVersion = i;
        boolean z = this.initialize;
        onCompleted = (i + 11) % 128;
        return z;
    }

    public void getWarnings(mu muVar) {
        int i = (getSDKVersion + 113) % 128;
        onCompleted = i;
        this.getSDKInfo = muVar;
        getSDKVersion = (i + 89) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public boolean initialize() {
        int i = (getSDKVersion + 23) % 128;
        onCompleted = i;
        boolean z = this.ThreeDS2ServiceInstance;
        getSDKVersion = (i + 37) % 128;
        return z;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ThreeDS2Service(new Object[]{this, bundle}, 551085685, -551085684, System.identityHashCode(this));
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        ThreeDS2Service(new Object[]{this, bundle}, -680844409, 680844409, System.identityHashCode(this));
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Object obj;
        Activity activity = getActivity();
        Resources resources = getActivity().getResources();
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25, (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (54115 - KeyEvent.normalizeMetaState(0)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(5 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 24 - Color.green(0), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr2);
        Dialog dialog = new Dialog(activity, resources.getIdentifier(intern, ((String) objArr2[0]).intern(), getActivity().getPackageName()));
        Window window = dialog.getWindow();
        if (window != null) {
            if (getSDKVersion()) {
                this.createTransaction.bG_(window);
                getSDKVersion = (onCompleted + 75) % 128;
            }
            return dialog;
        }
        int i = getSDKVersion + 1;
        onCompleted = i % 128;
        int i2 = i % 2;
        no noVar = this.getWarnings;
        if (i2 == 0) {
            Object[] objArr3 = new Object[1];
            a(TextUtils.lastIndexOf("", '[', 0) * 67, 118 / ((byte) KeyEvent.getModifierMetaStateMask()), (char) Drawable.resolveOpacity(1, 1), objArr3);
            obj = objArr3[0];
        } else {
            Object[] objArr4 = new Object[1];
            a(34 - TextUtils.lastIndexOf("", '0', 0), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Drawable.resolveOpacity(0, 0), objArr4);
            obj = objArr4[0];
        }
        noVar.initialize(((String) obj).intern());
        return dialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!getSDKVersion()) {
            return null;
        }
        onCompleted = (getSDKVersion + 11) % 128;
        View bQ_ = this.getSDKInfo.bQ_(layoutInflater, viewGroup, bundle, this.get);
        getSDKVersion = (onCompleted + 115) % 128;
        return bQ_;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        int i = getSDKVersion + 21;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            super.onDestroy();
            throw null;
        }
        super.onDestroy();
        getSDKVersion = (onCompleted + 97) % 128;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDestroyView() {
        getSDKVersion = (onCompleted + 23) % 128;
        getSDKInfo();
        if (getSDKVersion()) {
            this.getSDKInfo.get(this.get);
        }
        super.onDestroyView();
        int i = onCompleted + 109;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        int i = onCompleted + 63;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            getSDKVersion();
            throw null;
        }
        if (getSDKVersion()) {
            int i2 = onCompleted + 55;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (getSDKVersion() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (getSDKVersion() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r2.getSDKInfo.ThreeDS2Service(r2.get);
        com.netcetera.threeds.sdk.infrastructure.mr.onCompleted = (com.netcetera.threeds.sdk.infrastructure.mr.getSDKVersion + 65) % 128;
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPause() {
        int i = getSDKVersion + 23;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            this.ThreeDS2Service = true;
        } else {
            this.ThreeDS2Service = false;
        }
        super.onPause();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.mr.onCompleted = (com.netcetera.threeds.sdk.infrastructure.mr.getSDKVersion + 45) % 128;
        cleanup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (getSDKVersion() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (getSDKVersion() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        cleanup();
        com.netcetera.threeds.sdk.infrastructure.mr.onCompleted = (com.netcetera.threeds.sdk.infrastructure.mr.getSDKVersion + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r2.getSDKInfo.getWarnings(r2.get);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r2.get == false) goto L15;
     */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        int i = onCompleted + 23;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            super.onResume();
            this.ThreeDS2Service = false;
        } else {
            super.onResume();
            this.ThreeDS2Service = true;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = getSDKVersion + 55;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            getSDKVersion();
            throw null;
        }
        if (getSDKVersion()) {
            this.getSDKInfo.bS_(bundle, this.get);
        }
        super.onSaveInstanceState(bundle);
        getSDKVersion = (onCompleted + 19) % 128;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        int i = getSDKVersion + 69;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            super.onStart();
            getSDKVersion();
            throw null;
        }
        super.onStart();
        if (getSDKVersion()) {
            onCompleted = (getSDKVersion + 29) % 128;
            onError();
            this.getSDKInfo.initialize(this.get);
        }
        int i2 = getSDKVersion + 31;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStop() {
        int i = onCompleted + 67;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            getSDKVersion();
            throw null;
        }
        if (getSDKVersion()) {
            getSDKVersion = (onCompleted + 95) % 128;
        }
        super.onStop();
    }

    public void ThreeDS2Service(mk mkVar) {
        int i = onCompleted + 65;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            this.createTransaction = mkVar;
        } else {
            this.createTransaction = mkVar;
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public void ThreeDS2Service() {
        int i = onCompleted;
        getSDKVersion = (i + 107) % 128;
        if (this.ThreeDS2ServiceInstance) {
            return;
        }
        int i2 = i + 53;
        getSDKVersion = i2 % 128;
        int i3 = i2 % 2;
        this.ThreeDS2ServiceInstance = true;
        onError();
        getSDKVersion = (onCompleted + 79) % 128;
    }
}

package com.netcetera.threeds.sdk.infrastructure;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class mp extends DialogFragment implements js {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean addParam;
    private static boolean cleanup;
    private static int createTransaction;
    private static char[] getSDKInfo;
    private static int onCompleted;
    private static int onError;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{mr.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private mk ThreeDS2ServiceInitializationCallback;
    private boolean ThreeDS2ServiceInstance;
    private boolean get;
    private mu getSDKVersion;
    private boolean getWarnings;
    private boolean initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        onCompleted = 0;
        onError = 1;
        getSDKInfo = new char[]{15212, 15223, 15217, 15206, 15178, 15168, 15221, 15254, 15175, 15207, 15222, 15183, 15177, 15182, 15171, 15179, 15181, 15174, 15193, 15255, 15180, 15282, 15220, 15173, 15239, 15215, 15195};
        createTransaction = 993475538;
        cleanup = true;
        addParam = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r3.getSDKVersion.getWarnings(r3.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r3.initialize == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r3.getSDKInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r3.getSDKVersion.getWarnings(r3.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r3.cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r3.cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
    
        r3.getSDKInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.mp.onCompleted + 35;
        com.netcetera.threeds.sdk.infrastructure.mp.onError = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        mp mpVar = (mp) objArr[0];
        int i = onCompleted + 79;
        onError = i % 128;
        if (i % 2 == 0) {
            super.onResume();
            mpVar.ThreeDS2ServiceInstance = false;
        } else {
            super.onResume();
            mpVar.ThreeDS2ServiceInstance = true;
        }
        return null;
    }

    private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
        int i2;
        char[] cArr;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr2 = getSDKInfo;
        Class cls = Integer.TYPE;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        i2 = i5;
                        method = obj;
                        cArr = cArr2;
                    } else {
                        i2 = i5;
                        Class cls2 = (Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 72, (char) View.resolveSizeAndState(i4, i4, i4), 1406 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr3 = new Object[1];
                        cArr = cArr2;
                        b(0, 0, (short) 1, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-939298638, method);
                    }
                    cArr3[i2] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i5 = i2 + 1;
                    $11 = ($10 + 75) % 128;
                    cArr2 = cArr;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(createTransaction)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 73, (char) (TextUtils.indexOf("", "", 0) + 7530), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2489);
            Object[] objArr5 = new Object[1];
            b(0, 0, (short) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (addParam) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr4 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i6 = onerror.getWarnings;
                int i7 = onerror.ThreeDS2ServiceInstance;
                if (i6 >= i7) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i6] = (char) (cArr2[bArr2[(i7 - 1) - i6] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 48, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 11441 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
                $10 = ($11 + 85) % 128;
            }
        } else if (cleanup) {
            int length3 = charArray.length;
            onerror.ThreeDS2ServiceInstance = length3;
            char[] cArr5 = new char[length3];
            onerror.getWarnings = 0;
            while (true) {
                int i8 = onerror.getWarnings;
                int i9 = onerror.ThreeDS2ServiceInstance;
                if (i8 >= i9) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i8] = (char) (cArr2[charArray[(i9 - 1) - i8] - i] - intValue);
                Object[] objArr7 = {onerror, onerror};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(73542081);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 11441)).getMethod("k", Object.class, Object.class);
                    map4.put(73542081, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length4;
            char[] cArr6 = new char[length4];
            onerror.getWarnings = 0;
            while (true) {
                int i10 = onerror.getWarnings;
                int i11 = onerror.ThreeDS2ServiceInstance;
                if (i10 >= i11) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i10] = (char) (cArr2[iArr[(i11 - 1) - i10] - i] - intValue);
                    onerror.getWarnings = i10 + 1;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 2) + 1;
        int i6 = (i * 4) + 4;
        byte[] bArr = $$a;
        int i7 = 109 - s;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i3 = i6;
            int i8 = i5;
            i4 = 0;
            i6 += -i8;
            i3++;
            bArr2[i4] = (byte) i6;
            i4++;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i6 += -i8;
            i3++;
            bArr2[i4] = (byte) i6;
            i4++;
            if (i4 == i5) {
            }
        } else {
            i3 = i6;
            i6 = i7;
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i4++;
            if (i4 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PPM_RAW_CODE, 9, 122, 120};
        $$b = 51;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r3.getSDKVersion.ThreeDS2Service(r3.initialize);
        com.netcetera.threeds.sdk.infrastructure.mp.onCompleted = (com.netcetera.threeds.sdk.infrastructure.mp.onError + 99) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r3.getSDKVersion.ThreeDS2Service(r3.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (r3.cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r3.cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.mp.onCompleted + 39;
        com.netcetera.threeds.sdk.infrastructure.mp.onError = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object initialize(Object[] objArr) {
        mp mpVar = (mp) objArr[0];
        int i = onError + 87;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            mpVar.ThreeDS2ServiceInstance = true;
        } else {
            mpVar.ThreeDS2ServiceInstance = false;
        }
        super.onPause();
        return null;
    }

    private void onError() {
        int i = onError + 89;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            getDialog();
            throw null;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            if (this.get) {
                dialog.show();
            } else {
                dialog.hide();
            }
        }
        int i2 = onCompleted + 109;
        onError = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void ThreeDS2ServiceInitializationCallback() {
        int i = onError;
        int i2 = i + 105;
        onCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            this.getWarnings = false;
        } else {
            this.getWarnings = true;
        }
        int i3 = i + 117;
        onCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public void ThreeDS2ServiceInstance() {
        int i = onCompleted + 17;
        onError = i % 128;
        int i2 = i % 2;
        boolean z = this.get;
        if (i2 == 0) {
            int i3 = 12 / 0;
            if (!z) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.get = false;
        onError();
        onError = (onCompleted + 9) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public Dialog bO_() {
        int i = onCompleted + 33;
        onError = i % 128;
        if (i % 2 != 0) {
            return getDialog();
        }
        getDialog();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public Intent bP_() {
        int i = onCompleted + 55;
        onError = i % 128;
        int i2 = i % 2;
        FragmentActivity requireActivity = requireActivity();
        if (i2 != 0) {
            return requireActivity.getIntent();
        }
        requireActivity.getIntent();
        throw null;
    }

    public boolean cleanup() {
        int i = (onError + 125) % 128;
        onCompleted = i;
        boolean z = this.getWarnings;
        onError = (i + 3) % 128;
        return z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public void get() {
        onCompleted = (onError + 103) % 128;
        this.initialize = true;
        if (this.ThreeDS2ServiceInstance) {
            getSDKInfo();
        }
        onCompleted = (onError + 115) % 128;
    }

    public void getSDKInfo() {
        onError = (onCompleted + 59) % 128;
        dismiss();
        setShowsDialog(false);
        int i = onCompleted + 79;
        onError = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void getSDKVersion() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            onError = (onCompleted + 39) % 128;
            if (getRetainInstance()) {
                onCompleted = (onError + 109) % 128;
                dialog.setDismissMessage(null);
                onCompleted = (onError + 23) % 128;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        onCompleted = (onError + 79) % 128;
        super.onActivityCreated(bundle);
        if (cleanup()) {
            int i = onError + 125;
            onCompleted = i % 128;
            int i2 = i % 2;
            mu muVar = this.getSDKVersion;
            if (i2 == 0) {
                muVar.bR_(bundle, this.initialize);
            } else {
                muVar.bR_(bundle, this.initialize);
                int i3 = 8 / 0;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCompleted = (onError + 65) % 128;
        super.onCreate(bundle);
        setRetainInstance(true);
        setCancelable(false);
        onCompleted = (onError + 9) % 128;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        Resources resources = requireActivity().getResources();
        Object[] objArr = new Object[1];
        a(null, null, 127 - Color.argb(0, 0, 0, 0), "\u0087\u0091\u0087\u0085\u0084\u0090\u008f\u008e\u0083\u008d\u0088\u008c\u008b\u008a\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0087\u008e\u0093\u0092\u0089", objArr2);
        Dialog dialog = new Dialog(requireActivity, resources.getIdentifier(intern, ((String) objArr2[0]).intern(), requireActivity().getPackageName()));
        Window window = dialog.getWindow();
        if (window == null) {
            no noVar = this.ThreeDS2Service;
            Object[] objArr3 = new Object[1];
            a(null, null, View.resolveSize(0, 0) + 127, "\u009b\u008f\u008b\u0095\u008d\u009b\u0096\u009a\u0088\u008a\u0096\u008a\u0088\u0099\u0096\u0087\u0085\u0092\u0096\u0087\u0086\u0098\u0090\u008d\u0097\u0095\u008f\u0082\u0096\u0092\u008f\u0095\u0095\u0083\u0094", objArr3);
            noVar.initialize(((String) objArr3[0]).intern());
        } else if (cleanup()) {
            this.ThreeDS2ServiceInitializationCallback.bG_(window);
            onError = (onCompleted + 45) % 128;
        }
        onCompleted = (onError + 49) % 128;
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        onError = (onCompleted + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if (cleanup()) {
            onError = (onCompleted + 41) % 128;
            view = this.getSDKVersion.bQ_(layoutInflater, viewGroup, bundle, this.initialize);
        } else {
            view = null;
        }
        int i = onError + 51;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            return view;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i = onError + 21;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            super.onDestroy();
            int i2 = 58 / 0;
        } else {
            super.onDestroy();
        }
        int i3 = onError + 73;
        onCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        getSDKVersion();
        if (cleanup()) {
            onCompleted = (onError + 103) % 128;
            this.getSDKVersion.get(this.initialize);
            onCompleted = (onError + 23) % 128;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (cleanup()) {
            int i = onCompleted + 37;
            int i2 = i % 128;
            onError = i2;
            if (i % 2 == 0) {
                throw null;
            }
            onCompleted = (i2 + 71) % 128;
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ThreeDS2Service(new Object[]{this}, -349321488, 349321488, System.identityHashCode(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        ThreeDS2Service(new Object[]{this}, -1287009451, 1287009452, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r1.bS_(r3, r2.initialize);
        r0 = 44 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1.bS_(r3, r2.initialize);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (cleanup() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.mp.onError + 73;
        com.netcetera.threeds.sdk.infrastructure.mp.onCompleted = r0 % 128;
        r0 = r0 % 2;
        r1 = r2.getSDKVersion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r0 == 0) goto L12;
     */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSaveInstanceState(Bundle bundle) {
        int i = onError + 109;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = onCompleted + 33;
        onError = i % 128;
        if (i % 2 == 0) {
            super.onStart();
            cleanup();
            throw null;
        }
        super.onStart();
        if (cleanup()) {
            onError();
            this.getSDKVersion.initialize(this.initialize);
        }
        onCompleted = (onError + 39) % 128;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (cleanup()) {
            int i = onError + 85;
            onCompleted = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        super.onStop();
        onCompleted = (onError + 69) % 128;
    }

    public void initialize(mu muVar) {
        int i = (onCompleted + 71) % 128;
        onError = i;
        this.getSDKVersion = muVar;
        onCompleted = (i + 53) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public boolean initialize() {
        int i = onCompleted;
        boolean z = this.get;
        int i2 = i + 117;
        onError = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void ThreeDS2Service(mk mkVar) {
        int i = onCompleted;
        this.ThreeDS2ServiceInitializationCallback = mkVar;
        onError = (i + 25) % 128;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~((~i3) | i4);
        return (((~((i | i2) | i3)) | i5) * 338) + (((~(i4 | i2)) * 338) + (((((~((~i2) | i)) | i5) | (~(i | i3))) * (-338)) + ((i2 * 339) + (i * (-337))))) != 1 ? initialize(objArr) : ThreeDS2Service(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.js
    public void ThreeDS2Service() {
        int i = onCompleted + 65;
        onError = i % 128;
        int i2 = i % 2;
        boolean z = this.get;
        if (i2 != 0) {
            if (!z) {
                this.get = true;
                onError();
            }
            onCompleted = (onError + 117) % 128;
            return;
        }
        throw null;
    }
}

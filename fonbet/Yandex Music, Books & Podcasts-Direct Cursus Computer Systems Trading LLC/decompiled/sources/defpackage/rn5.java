package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson;
import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.b;
import com.yandex.media.ynison.service.c;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.m0;
import com.yandex.music.shared.media.session.common.state.source_info.Media3RatingScopedCache$Media3RatingCancellationException;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.payment.sdk.ui.view.payment.PaymentButtonView;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class rn5 implements kn5, upr, u1o, adu, jcp, dt1 {
    public static final pn5 i = new pn5(0);
    public static final byte[] j = {0, 7, 8, 15};
    public static final byte[] k = {0, 119, -120, -1};
    public static final byte[] l = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public rn5(ArrayList arrayList, ArrayList arrayList2, rwd rwdVar) {
        int i2 = 0;
        this.a = 0;
        sft sftVar = sft.a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        rhb rhbVar = new rhb();
        this.f = rhbVar;
        this.h = rwdVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(vm5.c(rhbVar, rhb.class, nnr.class, t0n.class));
        arrayList3.add(vm5.c(this, rn5.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            vm5 vm5Var = (vm5) it.next();
            if (vm5Var != null) {
                arrayList3.add(vm5Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((uzm) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((rwd) this.h).e(componentRegistrar));
                        it3.remove();
                    }
                } catch (dye e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((vm5) it4.next()).b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.e).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.e).add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (((HashMap) this.b).isEmpty()) {
                j66.P(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.b).keySet());
                arrayList6.addAll(arrayList3);
                j66.P(arrayList6);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                vm5 vm5Var2 = (vm5) it5.next();
                ((HashMap) this.b).put(vm5Var2, new brf(new qn5(i2, this, vm5Var2)));
            }
            arrayList5.addAll(O(arrayList3));
            arrayList5.addAll(P());
            N();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.g).get();
        if (bool != null) {
            z((HashMap) this.b, bool.booleanValue());
        }
    }

    public static int[] A() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = D(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = D(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] C() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = D(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                if (i6 == 0) {
                    iArr[i2] = D(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = D(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = D(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = D(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int D(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    public static yfk H(rfk rfkVar) {
        return rfkVar instanceof ffk ? yfk.EXISTING_CARD : rfkVar instanceof mfk ? yfk.SBP_TOKEN : rfkVar instanceof pfk ? yfk.YANDEX_BANK : Intrinsics.d(rfkVar, gfk.a) ? yfk.CASH : Intrinsics.d(rfkVar, ifk.a) ? yfk.GOOGLE_PAY : Intrinsics.d(rfkVar, jfk.a) ? yfk.NEW_CARD : Intrinsics.d(rfkVar, lfk.a) ? yfk.SBP : Intrinsics.d(rfkVar, kfk.a) ? yfk.NEW_SBP_TOKEN : yfk.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203 A[LOOP:3: B:86:0x0156->B:98:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void J(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        char c;
        char c2;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int i15;
        Paint paint2 = paint;
        v94 v94Var = new v94(bArr, bArr.length);
        int i16 = i3;
        int i17 = i4;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (v94Var.b() != 0) {
            int i18 = 8;
            int i19 = v94Var.i(8);
            if (i19 != 240) {
                int i20 = 3;
                int i21 = 2;
                int i22 = 4;
                switch (i19) {
                    case 16:
                        byte[] bArr6 = i2 == 3 ? bArr3 == null ? k : bArr3 : i2 == 2 ? bArr5 == null ? j : bArr5 : null;
                        boolean z4 = false;
                        while (true) {
                            int i23 = v94Var.i(2);
                            if (i23 != 0) {
                                z = z4;
                                i5 = i23;
                                i6 = 1;
                            } else if (v94Var.h()) {
                                int i24 = v94Var.i(3) + 3;
                                z = z4;
                                i5 = v94Var.i(2);
                                i6 = i24;
                            } else {
                                if (v94Var.h()) {
                                    z = z4;
                                    i6 = 1;
                                    c = '\b';
                                    c2 = 4;
                                } else {
                                    int i25 = v94Var.i(2);
                                    if (i25 == 0) {
                                        c = '\b';
                                        c2 = 4;
                                        z = true;
                                    } else if (i25 == 1) {
                                        c = '\b';
                                        c2 = 4;
                                        z = z4;
                                        i6 = 2;
                                    } else if (i25 == 2) {
                                        c = '\b';
                                        c2 = 4;
                                        i6 = v94Var.i(4) + 12;
                                        i5 = v94Var.i(2);
                                        z = z4;
                                        if (i6 != 0) {
                                        }
                                        i7 = i16;
                                        i16 = i7 + i6;
                                        if (z) {
                                        }
                                    } else if (i25 != 3) {
                                        z = z4;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        c = '\b';
                                        int i26 = v94Var.i(8) + 29;
                                        i5 = v94Var.i(2);
                                        z = z4;
                                        i6 = i26;
                                        c2 = 4;
                                        if (i6 != 0 || paint2 == null) {
                                            i7 = i16;
                                        } else {
                                            if (bArr6 != 0) {
                                                i5 = bArr6[i5];
                                            }
                                            paint2.setColor(iArr[i5]);
                                            i7 = i16;
                                            canvas.drawRect(i16, i17, i16 + i6, i17 + 1, paint2);
                                        }
                                        i16 = i7 + i6;
                                        if (z) {
                                            v94Var.c();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z4 = z;
                                        }
                                    }
                                    i5 = 0;
                                    i6 = 0;
                                    if (i6 != 0) {
                                    }
                                    i7 = i16;
                                    i16 = i7 + i6;
                                    if (z) {
                                    }
                                }
                                i5 = 0;
                                if (i6 != 0) {
                                }
                                i7 = i16;
                                i16 = i7 + i6;
                                if (z) {
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (i6 != 0) {
                            }
                            i7 = i16;
                            i16 = i7 + i6;
                            if (z) {
                            }
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr2 = bArr4 == null ? l : bArr4;
                        } else {
                            bArr2 = null;
                        }
                        boolean z5 = false;
                        while (true) {
                            int i27 = v94Var.i(i22);
                            if (i27 != 0) {
                                z2 = z5;
                                i10 = i27;
                                i8 = 1;
                            } else if (v94Var.h()) {
                                if (v94Var.h()) {
                                    int i28 = v94Var.i(i21);
                                    if (i28 == 0) {
                                        z2 = z5;
                                        i8 = 1;
                                    } else if (i28 != 1) {
                                        if (i28 == i21) {
                                            i8 = v94Var.i(i22) + 9;
                                            i9 = v94Var.i(i22);
                                        } else if (i28 != i20) {
                                            z2 = z5;
                                            i8 = 0;
                                        } else {
                                            i8 = v94Var.i(i18) + 25;
                                            i9 = v94Var.i(i22);
                                        }
                                        i10 = i9;
                                    } else {
                                        z2 = z5;
                                        i8 = i21;
                                    }
                                    i10 = 0;
                                } else {
                                    i8 = v94Var.i(i21) + 4;
                                    i10 = v94Var.i(i22);
                                }
                                z2 = z5;
                            } else {
                                int i29 = v94Var.i(i20);
                                if (i29 != 0) {
                                    i8 = i29 + 2;
                                    z2 = z5;
                                    i10 = 0;
                                } else {
                                    z2 = true;
                                    i8 = 0;
                                    i10 = 0;
                                }
                            }
                            if (i8 == 0 || paint2 == null) {
                                i11 = i16;
                                i12 = i20;
                                i13 = i21;
                            } else {
                                if (bArr2 != 0) {
                                    i10 = bArr2[i10];
                                }
                                paint2.setColor(iArr[i10]);
                                i12 = i20;
                                i13 = 2;
                                i11 = i16;
                                canvas.drawRect(i16, i17, i16 + i8, i17 + 1, paint2);
                            }
                            i16 = i11 + i8;
                            if (z2) {
                                v94Var.c();
                                break;
                            } else {
                                z5 = z2;
                                i20 = i12;
                                i21 = i13;
                                i22 = 4;
                                i18 = 8;
                            }
                        }
                    case 18:
                        boolean z6 = false;
                        while (true) {
                            int i30 = v94Var.i(8);
                            if (i30 != 0) {
                                z3 = z6;
                                i14 = 1;
                            } else if (v94Var.h()) {
                                z3 = z6;
                                i14 = v94Var.i(7);
                                i30 = v94Var.i(8);
                            } else {
                                int i31 = v94Var.i(7);
                                if (i31 != 0) {
                                    z3 = z6;
                                    i14 = i31;
                                    i30 = 0;
                                } else {
                                    z3 = true;
                                    i30 = 0;
                                    i14 = 0;
                                }
                            }
                            if (i14 == 0 || paint2 == null) {
                                i15 = i16;
                            } else {
                                paint2.setColor(iArr[i30]);
                                i15 = i16;
                                canvas.drawRect(i16, i17, i16 + i14, i17 + 1, paint2);
                            }
                            i16 = i15 + i14;
                            if (z3) {
                                break;
                            } else {
                                z6 = z3;
                            }
                        }
                        break;
                    default:
                        switch (i19) {
                            case 32:
                                bArr5 = v(4, 4, v94Var);
                                break;
                            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                                bArr3 = v(4, 8, v94Var);
                                break;
                            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                                bArr4 = v(16, 8, v94Var);
                                break;
                        }
                }
            } else {
                i17 += 2;
                i16 = i3;
            }
            paint2 = paint;
        }
    }

    public static usa K(v94 v94Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = v94Var.i(8);
        v94Var.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] A = A();
        int[] C = C();
        while (i11 > 0) {
            int i13 = v94Var.i(i8);
            int i14 = v94Var.i(i8);
            int[] iArr2 = (i14 & 128) != 0 ? iArr : (i14 & 64) != 0 ? A : C;
            if ((i14 & 1) != 0) {
                i6 = v94Var.i(i8);
                i7 = v94Var.i(i8);
                i3 = v94Var.i(i8);
                i5 = v94Var.i(i8);
                i4 = i11 - 6;
            } else {
                int i15 = v94Var.i(6) << i10;
                int i16 = v94Var.i(4) << 4;
                i3 = v94Var.i(4) << 4;
                i4 = i11 - 4;
                i5 = v94Var.i(i10) << 6;
                i6 = i15;
                i7 = i16;
            }
            if (i6 == 0) {
                i7 = i12;
                i3 = i7;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr2[i13] = D((byte) (255 - (i5 & KotlinVersion.MAX_COMPONENT_VALUE)), dvt.i((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), dvt.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), dvt.i((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            C = C;
            i8 = 8;
            i10 = 2;
        }
        return new usa(i9, iArr, A, C);
    }

    public static wsa M(v94 v94Var) {
        byte[] bArr;
        int i2 = v94Var.i(16);
        v94Var.t(4);
        int i3 = v94Var.i(2);
        boolean h = v94Var.h();
        v94Var.t(1);
        byte[] bArr2 = dvt.c;
        if (i3 == 1) {
            v94Var.t(v94Var.i(8) * 16);
        } else if (i3 == 0) {
            int i4 = v94Var.i(16);
            int i5 = v94Var.i(16);
            if (i4 > 0) {
                bArr2 = new byte[i4];
                v94Var.l(i4, bArr2);
            }
            if (i5 > 0) {
                bArr = new byte[i5];
                v94Var.l(i5, bArr);
                return new wsa(i2, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new wsa(i2, h, bArr2, bArr);
    }

    public static byte[] v(int i2, int i3, v94 v94Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) v94Var.i(i3);
        }
        return bArr;
    }

    public ArrayList E() {
        boolean z;
        List<rfk> list = (List) this.f;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (rfk rfkVar : list) {
            if (rfkVar instanceof ffk) {
                zv3 zv3Var = (zv3) this.b;
                if (qdq.B(zv3Var != null ? Boolean.valueOf(zv3Var.h((ffk) rfkVar)) : null)) {
                    z = true;
                    boolean z2 = z;
                    rfkVar.getClass();
                    arrayList.add(new kcp(rfkVar, z2, false, null, null));
                }
            }
            z = false;
            boolean z22 = z;
            rfkVar.getClass();
            arrayList.add(new kcp(rfkVar, z22, false, null, null));
        }
        return arrayList;
    }

    public Integer I() {
        Integer valueOf = Integer.valueOf(CollectionsKt.T((List) this.f, (rfk) this.h));
        if (valueOf.intValue() != -1) {
            return valueOf;
        }
        return null;
    }

    public void N() {
        HashMap hashMap = (HashMap) this.c;
        HashMap hashMap2 = (HashMap) this.d;
        for (vm5 vm5Var : ((HashMap) this.b).keySet()) {
            for (ox7 ox7Var : vm5Var.c) {
                boolean z = ox7Var.b == 2;
                m5n m5nVar = ox7Var.a;
                if (z && !hashMap2.containsKey(m5nVar)) {
                    Set set = Collections.EMPTY_SET;
                    tvf tvfVar = new tvf();
                    tvfVar.b = null;
                    tvfVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    tvfVar.a.addAll(set);
                    hashMap2.put(m5nVar, tvfVar);
                } else if (hashMap.containsKey(m5nVar)) {
                    continue;
                } else {
                    int i2 = ox7Var.b;
                    if (i2 == 1) {
                        throw new qx7("Unsatisfied dependency for component " + vm5Var + ": " + m5nVar);
                    }
                    if (i2 != 2) {
                        hashMap.put(m5nVar, new owj(owj.c, owj.d));
                    }
                }
            }
        }
    }

    public ArrayList O(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vm5 vm5Var = (vm5) it.next();
            if (vm5Var.e == 0) {
                uzm uzmVar = (uzm) ((HashMap) this.b).get(vm5Var);
                for (m5n m5nVar : vm5Var.b) {
                    if (hashMap.containsKey(m5nVar)) {
                        arrayList2.add(new qf0(13, (owj) ((uzm) hashMap.get(m5nVar)), uzmVar));
                    } else {
                        hashMap.put(m5nVar, uzmVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList P() {
        HashMap hashMap = (HashMap) this.d;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            vm5 vm5Var = (vm5) entry.getKey();
            if (vm5Var.e != 0) {
                uzm uzmVar = (uzm) entry.getValue();
                for (m5n m5nVar : vm5Var.b) {
                    if (!hashMap2.containsKey(m5nVar)) {
                        hashMap2.put(m5nVar, new HashSet());
                    }
                    ((Set) hashMap2.get(m5nVar)).add(uzmVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                tvf tvfVar = (tvf) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new qf0(14, tvfVar, (uzm) it.next()));
                }
            } else {
                m5n m5nVar2 = (m5n) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                tvf tvfVar2 = new tvf();
                tvfVar2.b = null;
                tvfVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                tvfVar2.a.addAll(set);
                hashMap.put(m5nVar2, tvfVar2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r12 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Q(cg6 cg6Var) {
        mhw mhwVar;
        nm6 nm6Var;
        int i2;
        hgp hgpVar;
        a0 w;
        Object V;
        a0 a0Var;
        m0 m0Var;
        boolean z;
        dgw dgwVar = (dgw) this.e;
        if (cg6Var instanceof mhw) {
            mhwVar = (mhw) cg6Var;
            int i3 = mhwVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mhwVar.n = i3 - Integer.MIN_VALUE;
                Object obj = mhwVar.l;
                nm6Var = nm6.a;
                i2 = mhwVar.n;
                Continuation continuation = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    anw anwVar = (anw) this.f;
                    mhwVar.n = 1;
                    obj = anwVar.b.a(mhwVar);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m0Var = mhwVar.k;
                        a0Var = mhwVar.j;
                        qgg.h0(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        z = (dgwVar.h.getAndSet(false) || dgwVar.c.a(cyk.c, cyk.d)) ? false : true;
                        if (z) {
                            ssg.a(3, dgw.j, "Try to capture activity if there are no other devices online", null);
                        }
                        return new rbw(a0Var, m0Var, booleanValue, z);
                    }
                    qgg.h0(obj);
                }
                a0 a0Var2 = (a0) obj;
                hgpVar = (hgp) this.b;
                a0Var2.getClass();
                w = hag.w(a0Var2, 200);
                if (((Boolean) ((dfw) hgpVar.g).invoke()).booleanValue() && !u7g.Q(w, lil.a)) {
                    w = u7g.G(u7g.H(u7g.L(u7g.J(w))));
                }
                a a = dgwVar.a();
                ent j2 = m0.j();
                c k2 = a.k();
                j2.d();
                m0.g((m0) j2.b, k2);
                d m = a.m();
                double j3 = m == null ? m.j() : 0.0d;
                j2.d();
                m0.h((m0) j2.b, j3);
                d m2 = a.m();
                j2.d();
                m0.i((m0) j2.b, m2);
                b j4 = a.j();
                j2.d();
                m0.f((m0) j2.b, j4);
                m0 m0Var2 = (m0) j2.b();
                mhwVar.j = w;
                mhwVar.k = m0Var2;
                mhwVar.n = 2;
                V = x97.V(dm6.b(), new pjt(dgwVar, continuation, 11), mhwVar);
                if (V != nm6Var) {
                    a0Var = w;
                    obj = V;
                    m0Var = m0Var2;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    if (dgwVar.h.getAndSet(false)) {
                    }
                    if (z) {
                    }
                    return new rbw(a0Var, m0Var, booleanValue2, z);
                }
                return nm6Var;
            }
        }
        mhwVar = new mhw(this, cg6Var);
        Object obj2 = mhwVar.l;
        nm6Var = nm6.a;
        i2 = mhwVar.n;
        Continuation continuation2 = null;
        if (i2 != 0) {
        }
        a0 a0Var22 = (a0) obj2;
        hgpVar = (hgp) this.b;
        a0Var22.getClass();
        w = hag.w(a0Var22, 200);
        if (((Boolean) ((dfw) hgpVar.g).invoke()).booleanValue()) {
            w = u7g.G(u7g.H(u7g.L(u7g.J(w))));
        }
        a a2 = dgwVar.a();
        ent j22 = m0.j();
        c k22 = a2.k();
        j22.d();
        m0.g((m0) j22.b, k22);
        d m3 = a2.m();
        if (m3 == null) {
        }
        j22.d();
        m0.h((m0) j22.b, j3);
        d m22 = a2.m();
        j22.d();
        m0.i((m0) j22.b, m22);
        b j42 = a2.j();
        j22.d();
        m0.f((m0) j22.b, j42);
        m0 m0Var22 = (m0) j22.b();
        mhwVar.j = w;
        mhwVar.k = m0Var22;
        mhwVar.n = 2;
        V = x97.V(dm6.b(), new pjt(dgwVar, continuation2, 11), mhwVar);
        if (V != nm6Var) {
        }
        return nm6Var;
    }

    public void S(String str) {
        dj3 dj3Var = (dj3) this.d;
        scv scvVar = (scv) this.e;
        scvVar.getClass();
        try {
            dj3Var.b(new om3(scvVar.d(1, str.getBytes("UTF-8"))), false);
        } catch (UnsupportedEncodingException e) {
            b6e.q(e);
        }
    }

    public void T(rfk rfkVar) {
        if (rfkVar == null || ((List) this.f).contains(rfkVar)) {
            if (rfkVar == null) {
                cib cibVar = (cib) this.c;
                if (cibVar != null) {
                    wdk wdkVar = new wdk(vdk.a);
                    gdp gdpVar = (gdp) cibVar.b;
                    gdpVar.z = wdkVar;
                    gdp.L(gdpVar);
                }
            } else {
                W(rfkVar);
            }
            this.h = rfkVar;
            return;
        }
        List list = (List) this.f;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(H((rfk) it.next()));
        }
        g0c g0cVar = (g0c) this.g;
        if (g0cVar != null) {
            ((x60) g0cVar).a(gut.i1("Method list does not contain provided method", H(rfkVar), null, null, new ArrayList(arrayList)));
        }
        xq0.q(k5r.i(((List) this.f).size(), "Method list does not contain provided method, methods.size = "));
    }

    public void U(List list) {
        List list2;
        list.getClass();
        Object obj = null;
        if (list.isEmpty()) {
            g0c g0cVar = (g0c) this.g;
            if (g0cVar != null) {
                ((x60) g0cVar).a(gut.i1("Method list should not be empty", null, null, null, null));
            }
            xq0.q("Method list should not be empty");
            return;
        }
        this.f = list;
        for (Object obj2 : list) {
            rfk rfkVar = (rfk) obj2;
            if (!(rfkVar instanceof ffk) || (list2 = ((ffk) rfkVar).f) == null || list2.isEmpty()) {
                obj = obj2;
                break;
            }
        }
        T((rfk) obj);
    }

    public void V(yr6 yr6Var) {
        p30 p30Var = (p30) this.e;
        if (p30Var != null) {
            p30Var.dismiss();
            this.e = null;
        }
        Context context = (Context) this.c;
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, R.style.ControlsYellow)).inflate(R.layout.playlist_name_view, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.playlist_name);
        this.d = editText;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(1000)});
        ((EditText) this.d).setHint(context.getString(R.string.new_playlist_edit_hint));
        ((EditText) this.d).setText("");
        EditText editText2 = (EditText) this.d;
        jyr jyrVar = sht.a;
        editText2.getClass();
        editText2.setSelection(editText2.length());
        ((EditText) this.d).setOnFocusChangeListener(new cx3(2, this));
        o30 o30Var = new o30(context);
        o30Var.b(R.string.new_playlist_text);
        o30 negativeButton = o30Var.setView(inflate).setPositiveButton(R.string.button_accept, new xr6(0, this, yr6Var)).setNegativeButton(R.string.cancel_text, null);
        negativeButton.a.m = true;
        p30 create = negativeButton.create();
        create.show();
        this.e = create;
    }

    public void W(rfk rfkVar) {
        s7g s7gVar;
        cib cibVar = (cib) this.c;
        if (cibVar != null) {
            if (rfkVar instanceof ffk) {
                zv3 zv3Var = (zv3) this.b;
                if (qdq.B(zv3Var != null ? Boolean.valueOf(zv3Var.h((ffk) rfkVar)) : null)) {
                    s7gVar = new wdk(vdk.b);
                    gdp gdpVar = (gdp) cibVar.b;
                    gdpVar.z = s7gVar;
                    gdp.L(gdpVar);
                }
            }
            s7gVar = xdk.a;
            gdp gdpVar2 = (gdp) cibVar.b;
            gdpVar2.z = s7gVar;
            gdp.L(gdpVar2);
        }
    }

    @Override // defpackage.aa7
    public ys1 a() {
        return ((dt1) this.c).a();
    }

    @Override // defpackage.aa7
    public void c(u97 u97Var) {
        this.h = u97Var;
    }

    @Override // defpackage.aa7
    public void close() {
        ((dt1) this.c).close();
    }

    @Override // defpackage.sa7
    public void d(pm5 pm5Var) {
        ((dt1) this.c).d(pm5Var);
    }

    @Override // defpackage.sa7
    public void e(om3 om3Var) {
        byte[] bArr;
        ay0 ay0Var = om3Var.a;
        if (ay0Var.size() == 1) {
            ByteBuffer byteBuffer = (ByteBuffer) ay0Var.peek();
            if (byteBuffer.capacity() == om3Var.c && byteBuffer.isDirect()) {
                om3Var.c = 0;
                bArr = ((ByteBuffer) ay0Var.removeFirst()).array();
                ((dj3) this.d).b(new om3(((scv) this.e).d(2, bArr)), false);
            }
        }
        int i2 = om3Var.c;
        byte[] bArr2 = new byte[i2];
        om3Var.e(i2, bArr2);
        bArr = bArr2;
        ((dj3) this.d).b(new om3(((scv) this.e).d(2, bArr)), false);
    }

    @Override // defpackage.sa7
    public void end() {
        ((dt1) this.c).end();
    }

    @Override // defpackage.kn5
    public synchronized uzm f(m5n m5nVar) {
        tvf tvfVar = (tvf) ((HashMap) this.d).get(m5nVar);
        if (tvfVar != null) {
            return tvfVar;
        }
        return i;
    }

    @Override // defpackage.aa7
    public boolean g() {
        return ((dt1) this.c).g();
    }

    @Override // defpackage.sa7
    public void h(d6w d6wVar) {
        ((dj3) this.d).d = d6wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        if ((r3.b + 1) == ((android.graphics.Bitmap) r42.h).getHeight()) goto L83;
     */
    @Override // defpackage.upr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(byte[] bArr, int i2, int i3, tpr tprVar, ua6 ua6Var) {
        int i4;
        uv6 uv6Var;
        int i5;
        int i6;
        vsa vsaVar;
        ArrayList arrayList;
        char c;
        char c2;
        int i7;
        char c3;
        int i8;
        ata ataVar;
        ysa ysaVar;
        int i9;
        int i10;
        int i11;
        int i12;
        ysa ysaVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        v94 v94Var = new v94(bArr, i2 + i3);
        v94Var.q(i2);
        Paint paint = (Paint) this.c;
        Canvas canvas = (Canvas) this.d;
        ata ataVar2 = (ata) this.g;
        while (v94Var.b() >= 48 && v94Var.i(8) == 15) {
            int i17 = v94Var.i(8);
            int i18 = 16;
            int i19 = v94Var.i(16);
            int i20 = v94Var.i(16);
            int f = v94Var.f() + i20;
            if (i20 * 8 > v94Var.b()) {
                vq1.n0("DvbParser", "Data field length exceeds limit");
                v94Var.t(v94Var.b());
            } else {
                int i21 = 4;
                switch (i17) {
                    case 16:
                        if (i19 == ataVar2.a) {
                            rnj rnjVar = ataVar2.i;
                            int i22 = 8;
                            v94Var.i(8);
                            int i23 = v94Var.i(4);
                            int i24 = v94Var.i(2);
                            v94Var.t(2);
                            int i25 = i20 - 2;
                            SparseArray sparseArray = new SparseArray();
                            while (i25 > 0) {
                                int i26 = v94Var.i(i22);
                                v94Var.t(i22);
                                i25 -= 6;
                                sparseArray.put(i26, new xsa(v94Var.i(16), v94Var.i(16)));
                                i22 = 8;
                            }
                            rnj rnjVar2 = new rnj(i23, i24, sparseArray);
                            if (i24 != 0) {
                                ataVar2.i = rnjVar2;
                                ataVar2.c.clear();
                                ataVar2.d.clear();
                                ataVar2.e.clear();
                                break;
                            } else if (rnjVar != null && rnjVar.b != i23) {
                                ataVar2.i = rnjVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        rnj rnjVar3 = ataVar2.i;
                        SparseArray sparseArray2 = ataVar2.c;
                        if (i19 == ataVar2.a && rnjVar3 != null) {
                            int i27 = v94Var.i(8);
                            v94Var.t(4);
                            boolean h = v94Var.h();
                            v94Var.t(3);
                            int i28 = v94Var.i(16);
                            int i29 = v94Var.i(16);
                            v94Var.i(3);
                            int i30 = v94Var.i(3);
                            v94Var.t(2);
                            int i31 = v94Var.i(8);
                            int i32 = v94Var.i(8);
                            int i33 = v94Var.i(4);
                            int i34 = v94Var.i(2);
                            v94Var.t(2);
                            int i35 = i20 - 10;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i35 > 0) {
                                int i36 = v94Var.i(i18);
                                int i37 = v94Var.i(2);
                                v94Var.i(2);
                                int i38 = v94Var.i(12);
                                v94Var.t(i21);
                                int i39 = v94Var.i(12);
                                int i40 = i35 - 6;
                                if (i37 == 1 || i37 == 2) {
                                    v94Var.i(8);
                                    v94Var.i(8);
                                    i35 -= 8;
                                } else {
                                    i35 = i40;
                                }
                                sparseArray3.put(i36, new zsa(i38, i39));
                                i21 = 4;
                                i18 = 16;
                            }
                            ysa ysaVar3 = new ysa(i27, h, i28, i29, i30, i31, i32, i33, i34, sparseArray3);
                            if (rnjVar3.c == 0 && (ysaVar2 = (ysa) sparseArray2.get(i27)) != null) {
                                SparseArray sparseArray4 = ysaVar2.j;
                                for (int i41 = 0; i41 < sparseArray4.size(); i41++) {
                                    ysaVar3.j.put(sparseArray4.keyAt(i41), (zsa) sparseArray4.valueAt(i41));
                                }
                            }
                            sparseArray2.put(ysaVar3.a, ysaVar3);
                            break;
                        }
                        break;
                    case 18:
                        if (i19 == ataVar2.a) {
                            usa K = K(v94Var, i20);
                            ataVar2.d.put(K.a, K);
                            break;
                        } else if (i19 == ataVar2.b) {
                            usa K2 = K(v94Var, i20);
                            ataVar2.f.put(K2.a, K2);
                            break;
                        }
                        break;
                    case 19:
                        if (i19 == ataVar2.a) {
                            wsa M = M(v94Var);
                            ataVar2.e.put(M.a, M);
                            break;
                        } else if (i19 == ataVar2.b) {
                            wsa M2 = M(v94Var);
                            ataVar2.g.put(M2.a, M2);
                            break;
                        }
                        break;
                    case 20:
                        if (i19 == ataVar2.a) {
                            v94Var.t(4);
                            boolean h2 = v94Var.h();
                            v94Var.t(3);
                            int i42 = v94Var.i(16);
                            int i43 = v94Var.i(16);
                            if (h2) {
                                int i44 = v94Var.i(16);
                                i13 = v94Var.i(16);
                                i16 = v94Var.i(16);
                                i14 = v94Var.i(16);
                                i15 = i44;
                            } else {
                                i13 = i42;
                                i14 = i43;
                                i15 = 0;
                                i16 = 0;
                            }
                            ataVar2.h = new vsa(i42, i43, i15, i13, i16, i14);
                            break;
                        }
                        break;
                }
                v94Var.u(f - v94Var.f());
            }
        }
        rnj rnjVar4 = ataVar2.i;
        if (rnjVar4 == null) {
            ude udeVar = yde.b;
            uv6Var = new uv6(-9223372036854775807L, -9223372036854775807L, qsn.e);
        } else {
            vsa vsaVar2 = ataVar2.h;
            if (vsaVar2 == null) {
                vsaVar2 = (vsa) this.e;
            }
            Bitmap bitmap = (Bitmap) this.h;
            if (bitmap != null) {
                i4 = 1;
                if (vsaVar2.a + 1 == bitmap.getWidth()) {
                }
            } else {
                i4 = 1;
            }
            Bitmap createBitmap = Bitmap.createBitmap(vsaVar2.a + i4, vsaVar2.b + i4, Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            canvas.setBitmap(createBitmap);
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) rnjVar4.d;
            int i45 = 0;
            while (i45 < sparseArray5.size()) {
                canvas.save();
                xsa xsaVar = (xsa) sparseArray5.valueAt(i45);
                ysa ysaVar4 = (ysa) ataVar2.c.get(sparseArray5.keyAt(i45));
                int i46 = xsaVar.a + vsaVar2.c;
                int i47 = xsaVar.b + vsaVar2.e;
                int i48 = ysaVar4.c;
                int i49 = ysaVar4.f;
                int i50 = ysaVar4.d;
                int i51 = i46 + i48;
                int i52 = i47 + i50;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i46, i47, Math.min(i51, vsaVar2.d), Math.min(i52, vsaVar2.f));
                usa usaVar = (usa) ataVar2.d.get(i49);
                if (usaVar == null && (usaVar = (usa) ataVar2.f.get(i49)) == null) {
                    usaVar = (usa) this.f;
                }
                SparseArray sparseArray7 = ysaVar4.j;
                vsa vsaVar3 = vsaVar2;
                int i53 = 0;
                while (i53 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i53);
                    int i54 = i45;
                    zsa zsaVar = (zsa) sparseArray7.valueAt(i53);
                    SparseArray sparseArray8 = sparseArray7;
                    wsa wsaVar = (wsa) ataVar2.e.get(keyAt);
                    if (wsaVar == null) {
                        wsaVar = (wsa) ataVar2.g.get(keyAt);
                    }
                    wsa wsaVar2 = wsaVar;
                    if (wsaVar2 != null) {
                        Paint paint2 = wsaVar2.b ? null : (Paint) this.b;
                        int i55 = i46;
                        int i56 = ysaVar4.e;
                        ataVar = ataVar2;
                        int i57 = i55 + zsaVar.a;
                        int i58 = zsaVar.b + i47;
                        int i59 = i50;
                        Paint paint3 = paint2;
                        ysa ysaVar5 = ysaVar4;
                        int[] iArr = i56 == 3 ? usaVar.d : i56 == 2 ? usaVar.c : usaVar.b;
                        ysaVar = ysaVar5;
                        i9 = i55;
                        i11 = i53;
                        i10 = i48;
                        i12 = i59;
                        J(wsaVar2.c, iArr, i56, i57, i58, paint3, canvas);
                        J(wsaVar2.d, iArr, i56, i57, i58 + 1, paint3, canvas);
                    } else {
                        ataVar = ataVar2;
                        ysaVar = ysaVar4;
                        i9 = i46;
                        i10 = i48;
                        i11 = i53;
                        i12 = i50;
                    }
                    i53 = i11 + 1;
                    ysaVar4 = ysaVar;
                    i46 = i9;
                    sparseArray7 = sparseArray8;
                    i45 = i54;
                    ataVar2 = ataVar;
                    i48 = i10;
                    i50 = i12;
                }
                ata ataVar3 = ataVar2;
                int i60 = i45;
                ysa ysaVar6 = ysaVar4;
                int i61 = i46;
                int i62 = i48;
                int i63 = i50;
                if (ysaVar6.b) {
                    int i64 = ysaVar6.e;
                    if (i64 == 3) {
                        i8 = usaVar.d[ysaVar6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i8 = i64 == 2 ? usaVar.c[ysaVar6.h] : usaVar.b[ysaVar6.i];
                    }
                    paint.setColor(i8);
                    i5 = i61;
                    c2 = c3;
                    vsaVar = vsaVar3;
                    i7 = 0;
                    c = 3;
                    i6 = i47;
                    arrayList = arrayList2;
                    canvas.drawRect(i5, i47, i51, i52, paint);
                } else {
                    i5 = i61;
                    i6 = i47;
                    vsaVar = vsaVar3;
                    arrayList = arrayList2;
                    c = 3;
                    c2 = 2;
                    i7 = 0;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i5, i6, i62, i63);
                float f2 = vsaVar.a;
                float f3 = vsaVar.b;
                arrayList.add(new rv6(null, null, null, createBitmap2, i6 / f3, 0, 0, i5 / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i62 / f2, i63 / f3, false, -16777216, Integer.MIN_VALUE, 0.0f));
                canvas.drawColor(i7, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i45 = i60 + 1;
                vsaVar2 = vsaVar;
                arrayList2 = arrayList;
                sparseArray5 = sparseArray6;
                ataVar2 = ataVar3;
            }
            uv6Var = new uv6(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        ua6Var.accept(uv6Var);
    }

    @Override // defpackage.sa7
    public boolean isOpen() {
        return ((dt1) this.c).isOpen();
    }

    @Override // defpackage.kn5
    public synchronized uzm j(m5n m5nVar) {
        v3g.w(m5nVar, "Null interface requested.");
        return (uzm) ((HashMap) this.c).get(m5nVar);
    }

    @Override // defpackage.aa7
    public void m() {
        ((dt1) this.c).m();
    }

    @Override // defpackage.jcp
    public void q(int i2, boolean z, ly6 ly6Var) {
        ly6Var.getClass();
        if (i2 < 0 || i2 >= ((List) this.f).size()) {
            List list = (List) this.f;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H((rfk) it.next()));
            }
            g0c g0cVar = (g0c) this.g;
            if (g0cVar != null) {
                ((x60) g0cVar).a(gut.i1("Selected position index is out of methods array", null, Integer.valueOf(i2), Integer.valueOf(((List) this.f).size()), new ArrayList(arrayList)));
            }
            e7o.o(f1d.e(i2, ((List) this.f).size(), "Selected position index is out of methods array, position = ", ", methods.size = "));
            return;
        }
        cib cibVar = (cib) this.c;
        if (z) {
            if (cibVar != null) {
                gdp gdpVar = (gdp) cibVar.b;
                gdpVar.z = xdk.a;
                gdp.L(gdpVar);
            }
        } else if (cibVar != null) {
            wdk wdkVar = new wdk(vdk.b);
            gdp gdpVar2 = (gdp) cibVar.b;
            gdpVar2.z = wdkVar;
            gdp.L(gdpVar2);
        }
        this.e = ly6Var;
    }

    @Override // defpackage.kn5
    public owj r(m5n m5nVar) {
        uzm j2 = j(m5nVar);
        return j2 == null ? new owj(owj.c, owj.d) : j2 instanceof owj ? (owj) j2 : new owj(null, j2);
    }

    @Override // defpackage.upr, defpackage.u1o
    public void reset() {
        switch (this.a) {
            case 1:
                ata ataVar = (ata) this.g;
                ataVar.c.clear();
                ataVar.d.clear();
                ataVar.e.clear();
                ataVar.f.clear();
                ataVar.g.clear();
                ataVar.h = null;
                ataVar.i = null;
                break;
            default:
                this.f = null;
                wqr wqrVar = (wqr) this.g;
                if (wqrVar != null) {
                    wqrVar.g(null);
                }
                this.g = null;
                this.h = null;
                break;
        }
    }

    @Override // defpackage.aa7
    public void s(pm5 pm5Var) {
        this.f = pm5Var;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.jcp
    public void t(int i2) {
        if (i2 >= 0 && i2 < ((List) this.f).size()) {
            rfk rfkVar = (rfk) ((List) this.f).get(i2);
            T(rfkVar);
            W(rfkVar);
            ?? r0 = (uif) this.d;
            if (r0 != 0) {
                r0.invoke(rfkVar);
                return;
            }
            return;
        }
        List list = (List) this.f;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(H((rfk) it.next()));
        }
        g0c g0cVar = (g0c) this.g;
        if (g0cVar != null) {
            ((x60) g0cVar).a(gut.i1("Selected position index is out of methods array", null, Integer.valueOf(i2), Integer.valueOf(((List) this.f).size()), new ArrayList(arrayList)));
        }
        e7o.o(f1d.e(i2, ((List) this.f).size(), "Selected position index is out of methods array, position = ", ", methods.size = "));
    }

    @Override // defpackage.aa7
    public u97 u() {
        return (u97) this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x041b, code lost:
    
        if (r0.put("text", java.text.NumberFormat.getNumberInstance().format(new java.math.BigDecimal(r10)) + com.connectsdk.service.webos.lgcast.common.utils.StringUtil.SPACE + (r9 != null ? defpackage.irf.K(r9, r30) : "")) == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02fd, code lost:
    
        if (r7.compareTo(java.math.BigDecimal.ZERO) > 0) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x035c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0340  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject x(q27 q27Var) {
        BigDecimal bigDecimal;
        String format;
        Iterator it;
        Object obj;
        BigDecimal bigDecimal2;
        sqr sqrVar;
        g0c g0cVar;
        Object obj2;
        sqr sqrVar2;
        Iterator it2;
        int i2;
        Iterator it3;
        bm2 bm2Var;
        Iterator it4;
        String str;
        String str2;
        String str3;
        String j2;
        rn5 rn5Var = this;
        g0c g0cVar2 = (g0c) rn5Var.f;
        tc1 tc1Var = (tc1) rn5Var.e;
        JSONObject a = ((br1) rn5Var.c).a("main_feed.json");
        JSONObject jSONObject = a.getJSONObject("card");
        JSONArray jSONArray = jSONObject.getJSONArray("variables");
        JSONObject put = new JSONObject().put("type", PListParser.TAG_STRING).put("name", "select_method_screen_selected_method");
        int i3 = q27Var.b;
        String str4 = q27Var.e;
        String str5 = q27Var.d;
        jSONArray.put(put.put(Constants.KEY_VALUE, String.valueOf(i3)));
        int i4 = 0;
        int i5 = 1;
        JSONArray jSONArray2 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(1).getJSONArray("items");
        List list = q27Var.a;
        List list2 = list;
        Iterator it5 = list2.iterator();
        while (true) {
            int i6 = i5;
            if (!it5.hasNext()) {
                List list3 = list;
                g0c g0cVar3 = g0cVar2;
                JSONObject jSONObject2 = a;
                List list4 = list2;
                JSONObject jSONObject3 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(2).getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(0);
                if (str5 != null) {
                    if (kotlin.text.b.f(str5)) {
                        bigDecimal = new BigDecimal(str5);
                        if (bigDecimal != null) {
                            format = NumberFormat.getNumberInstance().format(bigDecimal);
                            String K = str4 == null ? irf.K(str4, g0cVar3) : null;
                            it = list4.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                String str6 = ((p27) obj).b;
                                okr[] okrVarArr = okr.a;
                                if (Intrinsics.d(str6, "plus_card")) {
                                    break;
                                }
                            }
                            p27 p27Var = (p27) obj;
                            bigDecimal2 = (p27Var != null || (bm2Var = p27Var.f) == null) ? null : bm2Var.a;
                            if (bigDecimal2 != null) {
                                g0cVar = g0cVar3;
                            } else {
                                BigDecimal bigDecimal3 = str5 != null ? new BigDecimal(str5) : BigDecimal.ZERO;
                                bigDecimal3.getClass();
                                BigDecimal subtract = bigDecimal3.subtract(bigDecimal2);
                                subtract.getClass();
                                g0cVar = g0cVar3;
                                sqrVar = new sqr(subtract, ouj.o(NumberFormat.getNumberInstance().format(subtract), StringUtil.SPACE, K == null ? "" : K));
                            }
                            sqrVar = null;
                            String c = tc1Var.c(R.string.paymentsdk_pay_button_title_fomatted, new Object[]{K != null ? "" : K, format != null ? "" : format});
                            String b = tc1Var.b(R.string.paymentsdk_select_button_title);
                            obj2 = sqrVar != null ? sqrVar.b : null;
                            if (obj2 == null) {
                                obj2 = "";
                            }
                            sqrVar2 = sqrVar;
                            String c2 = tc1Var.c(R.string.paymentsdk_topup_card, new Object[]{obj2});
                            it2 = list3.iterator();
                            i2 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    i2 = -1;
                                    break;
                                }
                                it3 = it2;
                                String str7 = ((p27) it2.next()).b;
                                okr[] okrVarArr2 = okr.a;
                                if (Intrinsics.d(str7, "plus_card")) {
                                    break;
                                }
                                i2++;
                                it2 = it3;
                            }
                            int i7 = i2;
                            String str8 = "@{select_method_screen_selected_method == '" + i7 + "' ? '" + (sqrVar2 == null ? "visible" : "gone") + "' : 'gone'}";
                            jSONObject3.put("subtitleText", tc1Var.c(R.string.paymentsdk_pay_after_topup_button_subtitle, new Object[]{ouj.o(format, StringUtil.SPACE, K)}));
                            if (sqrVar2 != null) {
                                c = su4.o(k5r.r(i7, "@{'", "' == select_method_screen_selected_method ? '", c2, "' : '"), c, "'}");
                            }
                            jSONObject3.put("buttonText", hrg.s("@{select_method_screen_show_select_button_text ? '", b, "' : '", c, "'}"));
                            jSONObject3.put("subtitleTextVisibility", str8).getClass();
                            JSONObject jSONObject4 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(1);
                            if (str5 != null) {
                            }
                            jSONObject4.remove("text");
                            jSONObject4.getClass();
                            return jSONObject2;
                        }
                    }
                    bigDecimal = null;
                    if (bigDecimal != null) {
                    }
                }
                format = null;
                if (str4 == null) {
                }
                it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                p27 p27Var2 = (p27) obj;
                if (p27Var2 != null) {
                }
                if (bigDecimal2 != null) {
                }
                sqrVar = null;
                String c3 = tc1Var.c(R.string.paymentsdk_pay_button_title_fomatted, new Object[]{K != null ? "" : K, format != null ? "" : format});
                String b2 = tc1Var.b(R.string.paymentsdk_select_button_title);
                if (sqrVar != null) {
                }
                if (obj2 == null) {
                }
                sqrVar2 = sqrVar;
                String c22 = tc1Var.c(R.string.paymentsdk_topup_card, new Object[]{obj2});
                it2 = list3.iterator();
                i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                    }
                    i2++;
                    it2 = it3;
                }
                int i72 = i2;
                if (sqrVar2 == null) {
                }
                String str82 = "@{select_method_screen_selected_method == '" + i72 + "' ? '" + (sqrVar2 == null ? "visible" : "gone") + "' : 'gone'}";
                jSONObject3.put("subtitleText", tc1Var.c(R.string.paymentsdk_pay_after_topup_button_subtitle, new Object[]{ouj.o(format, StringUtil.SPACE, K)}));
                if (sqrVar2 != null) {
                }
                jSONObject3.put("buttonText", hrg.s("@{select_method_screen_show_select_button_text ? '", b2, "' : '", c3, "'}"));
                jSONObject3.put("subtitleTextVisibility", str82).getClass();
                JSONObject jSONObject42 = jSONObject.getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(0).getJSONArray("items").getJSONObject(1);
                if (str5 != null) {
                }
                jSONObject42.remove("text");
                jSONObject42.getClass();
                return jSONObject2;
            }
            Object next = it5.next();
            int i8 = i4 + 1;
            if (i4 < 0) {
                u75.n();
                throw null;
            }
            p27 p27Var3 = (p27) next;
            List list5 = list;
            int i9 = i4 == list.size() + (-1) ? i6 : 0;
            Gson gson = (Gson) rn5Var.d;
            JSONObject jSONObject5 = a;
            List list6 = p27Var3.j;
            String str9 = p27Var3.e;
            List list7 = list2;
            String str10 = p27Var3.b;
            List list8 = list6;
            if (list8 == null || list8.isEmpty()) {
                it4 = it5;
                if (p27Var3.f != null) {
                    str2 = "";
                    str3 = p27Var3.a;
                    okr[] okrVarArr3 = okr.a;
                    g0c g0cVar4 = g0cVar2;
                    if (str3.equals("add_new_card")) {
                        if (!Intrinsics.d(str10, "sbp")) {
                            Intrinsics.d(str10, "new_sbp_token");
                        }
                        if (list8 != null) {
                            list8.isEmpty();
                        }
                        Pair pair = (list8 == null || list8.isEmpty()) ? new Pair(Float.valueOf(1.0f), k5r.i(i4, "div-action://set_variable?name=select_method_screen_selected_method&value=")) : new Pair(Float.valueOf(0.5f), "payment-sdk://show_toast?message=".concat(tc1Var.b(R.string.paymentsdk_divkit_restriction_message_default)));
                        float floatValue = ((Number) pair.a).floatValue();
                        ld ldVar = new ld((String) pair.b);
                        ((wul) rn5Var.h).getClass();
                        String str11 = str2 != null ? "visible" : "gone";
                        String str12 = p27Var3.c;
                        List c4 = t75.c(new qee(15));
                        List c5 = t75.c(ldVar);
                        List c6 = t75.c(new q0c(new p6k()));
                        chu chuVar = new chu(23);
                        obj2 = str3.equals("sbp_token") ? null : new it8();
                        if (obj2 == null) {
                            obj2 = new uqo(str9);
                        }
                        String str13 = str2 == null ? "" : str2;
                        t0k t0kVar = new t0k(8, 8);
                        String str14 = p27Var3.i;
                        sc6 sc6Var = new sc6(str13, str11, str12, str14, str14 != null ? i6 : 0, t0kVar, floatValue);
                        it8 it8Var = new it8();
                        ksw[] kswVarArr = new ksw[3];
                        kswVarArr[0] = obj2;
                        kswVarArr[i6] = sc6Var;
                        kswVarArr[2] = it8Var;
                        t75.c(new f99(c5, c6, chuVar, u75.h(kswVarArr), new t0k(16, 16), c4)).getClass();
                        ksw[] kswVarArr2 = new ksw[i6];
                        kswVarArr2[0] = new it8();
                        ArrayList j3 = u75.j(kswVarArr2);
                        if (i9 == 0) {
                            j3.add(new it8());
                        }
                        j2 = gson.j(new it8());
                    } else {
                        j2 = gson.j(new nm8(t75.c(new ld("div-action://bind_card_click")), p27Var3.c));
                    }
                    jSONArray2.put(new JSONObject(j2));
                    rn5Var = this;
                    i4 = i8;
                    list = list5;
                    a = jSONObject5;
                    list2 = list7;
                    it5 = it4;
                    g0cVar2 = g0cVar4;
                    i5 = 1;
                } else {
                    str = p27Var3.d;
                }
            } else {
                it4 = it5;
                str = tc1Var.b(R.string.paymentsdk_divkit_restriction_subtitle);
            }
            str2 = str;
            str3 = p27Var3.a;
            okr[] okrVarArr32 = okr.a;
            g0c g0cVar42 = g0cVar2;
            if (str3.equals("add_new_card")) {
            }
            jSONArray2.put(new JSONObject(j2));
            rn5Var = this;
            i4 = i8;
            list = list5;
            a = jSONObject5;
            list2 = list7;
            it5 = it4;
            g0cVar2 = g0cVar42;
            i5 = 1;
        }
    }

    @Override // defpackage.upr
    public int y() {
        return 2;
    }

    public void z(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            vm5 vm5Var = (vm5) entry.getKey();
            uzm uzmVar = (uzm) entry.getValue();
            int i2 = vm5Var.d;
            if (i2 == 1 || (i2 == 2 && z)) {
                uzmVar.get();
            }
        }
        rhb rhbVar = (rhb) this.f;
        synchronized (rhbVar) {
            try {
                arrayDeque = rhbVar.b;
                if (arrayDeque != null) {
                    rhbVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
        }
    }

    public rn5(hgp hgpVar, nfw nfwVar, ydw ydwVar, dgw dgwVar, anw anwVar, hnw hnwVar, ifw ifwVar) {
        this.a = 12;
        this.b = hgpVar;
        this.c = nfwVar;
        this.d = ydwVar;
        this.e = dgwVar;
        this.f = anwVar;
        this.g = hnwVar;
        this.h = ifwVar;
    }

    public rn5(kv6 kv6Var, oco ocoVar, nbo nboVar, hv0 hv0Var) {
        this.a = 7;
        ocoVar.getClass();
        nboVar.getClass();
        this.b = kv6Var;
        this.c = ocoVar;
        this.d = nboVar;
        this.e = hv0Var;
        this.g = new ReentrantLock();
        this.h = new ArrayList();
    }

    public rn5(int i2) {
        this.a = i2;
        switch (i2) {
            case 10:
                break;
            default:
                this.f = c5b.a;
                break;
        }
    }

    public rn5(tf6 tf6Var, wsh wshVar) {
        this.a = 5;
        tf6Var.getClass();
        this.b = tf6Var;
        this.c = wshVar;
        this.d = new dgh(0, this);
        this.e = new Media3RatingScopedCache$Media3RatingCancellationException("cancelled due to immediate switch to another playable");
    }

    public rn5(ProgressResultView progressResultView, ImageView imageView, PaymentButtonView paymentButtonView, ImageView imageView2, ProgressBar progressBar, ImageView imageView3, TextView textView, TextView textView2) {
        this.a = 6;
        this.b = imageView;
        this.c = paymentButtonView;
        this.d = imageView2;
        this.e = progressBar;
        this.f = imageView3;
        this.g = textView;
        this.h = textView2;
    }

    public rn5(xiu xiuVar, br1 br1Var, Gson gson, tc1 tc1Var, g0c g0cVar) {
        this.a = 4;
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.b = xiuVar;
        this.c = br1Var;
        this.d = gson;
        this.e = tc1Var;
        this.f = g0cVar;
        this.g = mn7Var;
        this.h = new wul();
    }

    public rn5(Context context) {
        this.a = 3;
        this.g = (frt) sk3.I(frt.class);
        this.h = (oul) sk3.I(oul.class);
        this.c = context;
        this.b = new btl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map] */
    public rn5(Set set, xy0 xy0Var, String str, String str2, tfq tfqVar) {
        this.a = 2;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = unmodifiableSet;
        xy0 xy0Var2 = xy0Var == null ? Collections.EMPTY_MAP : xy0Var;
        this.d = xy0Var2;
        this.e = str;
        this.f = str2;
        this.g = tfqVar == null ? tfq.a : tfqVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = xy0Var2.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw hrg.j(it);
    }

    public rn5(String str, jac jacVar, osh oshVar) {
        this.a = 9;
        this.e = new z0j(this, false);
        this.f = new z0j(this, true);
        this.g = new c11(4);
        this.h = new AtomicMarkableReference(null, false);
        this.d = str;
        this.b = new m0i(jacVar);
        this.c = oshVar;
    }

    public rn5(List list) {
        this.a = 1;
        d7k d7kVar = new d7k((byte[]) list.get(0));
        int B = d7kVar.B();
        int B2 = d7kVar.B();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.d = new Canvas();
        this.e = new vsa(719, 575, 0, 719, 0, 575);
        this.f = new usa(0, new int[]{0, -1, -16777216, -8421505}, A(), C());
        this.g = new ata(B, B2);
    }

    public rn5(Context context, r46 r46Var, j4w j4wVar, htm htmVar, WorkDatabase workDatabase, t4w t4wVar, ArrayList arrayList) {
        this.a = 11;
        context.getClass();
        htmVar.getClass();
        this.b = r46Var;
        this.c = j4wVar;
        this.d = htmVar;
        this.e = workDatabase;
        this.f = t4wVar;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.h = applicationContext;
    }
}

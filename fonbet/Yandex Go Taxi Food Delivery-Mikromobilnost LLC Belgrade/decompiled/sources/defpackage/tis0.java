package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.video.VideoOutput$SourceState;
import androidx.camera.video.i;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.f;
import com.bumptech.glide.manager.c;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.xplat.common.PollingStep;
import com.yandex.xplat.payment.sdk.BillingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ChangePinCheckPinTokenFromOldCodeResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$EnableBiometryCheckPinTokenResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$EnterPinCheckPinTokenResult;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.taxi.am.AuthStateRepository;
import ru.yandex.taxi.am.l;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes10.dex */
public class tis0 implements pdv, mb10, rr3, iqs, eo3, kab, pb10, qgb {
    public static volatile tis0 x;
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object w;

    public tis0(ep7 ep7Var) {
        this.a = 11;
        this.c = ep7Var;
        this.w = gym.l(ep7Var);
        int[] iArr = (int[]) ep7Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 18) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.b = z;
    }

    public static boolean D(q8n q8nVar, q8n q8nVar2) {
        boolean b = q8nVar2.b();
        int i = q8nVar2.a;
        d6z.y("Fully specified range is not actually fully specified.", b);
        int i2 = q8nVar.a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = q8nVar.b;
        return i3 == 0 || i3 == q8nVar2.b;
    }

    public static boolean E(q8n q8nVar, q8n q8nVar2, HashSet hashSet) {
        if (hashSet.contains(q8nVar2)) {
            return D(q8nVar, q8nVar2);
        }
        q8nVar.toString();
        q8nVar2.toString();
        sgb1.g(3, "DynamicRangeResolver");
        return false;
    }

    public static String F(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static q8n I(q8n q8nVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (q8nVar.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            q8n q8nVar2 = (q8n) it.next();
            d6z.v(q8nVar2, "Fully specified DynamicRange cannot be null.");
            int i = q8nVar2.a;
            d6z.y("Fully specified DynamicRange must have fully defined encoding.", q8nVar2.b());
            if (i != 1 && E(q8nVar, q8nVar2, hashSet)) {
                return q8nVar2;
            }
        }
        return null;
    }

    public static tis0 K(Context context) {
        if (x == null) {
            synchronized (tis0.class) {
                try {
                    if (x == null) {
                        x = new tis0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return x;
    }

    public static String U(v8r0 v8r0Var) {
        if (v8r0Var instanceof u8r0) {
            return "toggle";
        }
        if ((v8r0Var instanceof t8r0) || (v8r0Var instanceof s8r0)) {
            return "subscreen";
        }
        w511.b();
        return null;
    }

    public static void a0(HashSet hashSet, q8n q8nVar, gym gymVar) {
        d6z.y("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set a = ((u8n) gymVar.a).a(q8nVar);
        if (a.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(a);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + q8nVar + "\nConstraints:\n  " + TextUtils.join("\n  ", a) + "\nExisting constraints:\n  " + TextUtils.join("\n  ", hashSet2));
        }
    }

    @Override // defpackage.pb10
    public void A(ob10 ob10Var, Handler handler) {
        ((hd10) this.c).m(new jb3(this, ob10Var, 2), handler);
    }

    @Override // defpackage.rr3
    public void B() {
        um3 um3Var = (um3) this.c;
        l lVar = (l) this.w;
        if (!this.b || !lVar.c.g()) {
            lVar.a(um3Var);
        } else {
            um3Var.b.onSuccess();
            lVar.h.a.l(AuthStateRepository.AuthState.DONE);
        }
    }

    public boolean C(long j) {
        Object obj;
        List list = (List) ((y4a0) this.w).b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (ey91.e(((cwd0) obj).a, j)) {
                break;
            }
            i++;
        }
        cwd0 cwd0Var = (cwd0) obj;
        if (cwd0Var != null) {
            return cwd0Var.h;
        }
        return false;
    }

    @Override // defpackage.mb10
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public a o(lb10 lb10Var) {
        MediaCodec mediaCodec;
        rb10 bVar;
        int i;
        a aVar;
        Surface surface;
        String str = lb10Var.a.a;
        a aVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            if (this.b) {
                androidx.media3.common.a aVar3 = lb10Var.c;
                int i2 = tw21.a;
                if (i2 >= 34 && (i2 >= 35 || eh20.p(aVar3.n))) {
                    bVar = new cd60(mediaCodec, 1);
                    i = 4;
                    aVar = new a(mediaCodec, (HandlerThread) ((rhw0) this.c).get(), bVar, lb10Var.f);
                    Trace.endSection();
                    surface = lb10Var.d;
                    if (surface == null && lb10Var.a.k && tw21.a >= 35) {
                        i |= 8;
                    }
                    a.d(aVar, lb10Var.b, surface, lb10Var.e, i);
                    return aVar;
                }
            }
            Trace.endSection();
            surface = lb10Var.d;
            if (surface == null) {
                i |= 8;
            }
            a.d(aVar, lb10Var.b, surface, lb10Var.e, i);
            return aVar;
        } catch (Exception e3) {
            e = e3;
            aVar2 = aVar;
            if (aVar2 != null) {
                aVar2.release();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
        bVar = new b(mediaCodec, (HandlerThread) ((rhw0) this.w).get());
        i = 0;
        aVar = new a(mediaCodec, (HandlerThread) ((rhw0) this.c).get(), bVar, lb10Var.f);
    }

    public boolean H(MotionEvent motionEvent) {
        int[] iArr = (int[]) this.w;
        View b = nrb1.b((View) this.c);
        if (b == null) {
            return false;
        }
        b.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        float rawX = (motionEvent.getRawX() - motionEvent.getX()) - f;
        float rawY = (motionEvent.getRawY() - motionEvent.getY()) - f2;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        try {
            obtain.offsetLocation(rawX, rawY);
            return b.dispatchTouchEvent(obtain);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        if (defpackage.si91.m(r0[0]) != java.lang.String.class) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fp60 J(TypeToken typeToken, boolean z) {
        fp60 v8eVar;
        String str;
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = (Map) this.c;
        fp60 fp60Var = null;
        if (map.get(type) != null) {
            ny61.u();
            return null;
        }
        if (map.get(rawType) != null) {
            ny61.u();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        fp60 fp60Var2 = EnumSet.class.isAssignableFrom(rawType) ? new fp60() { // from class: w8e
            @Override // defpackage.fp60
            public final Object i() {
                int i3 = i2;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new JsonIOException("Invalid EnumSet type: " + type2);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type2);
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new JsonIOException("Invalid EnumMap type: " + type2);
                        }
                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type4 instanceof Class) {
                            return new EnumMap((Class) type4);
                        }
                        throw new JsonIOException("Invalid EnumMap type: " + type2);
                }
            }
        } : rawType == EnumMap.class ? new fp60() { // from class: w8e
            @Override // defpackage.fp60
            public final Object i() {
                int i3 = i;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new JsonIOException("Invalid EnumSet type: " + type2);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new JsonIOException("Invalid EnumSet type: " + type2);
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new JsonIOException("Invalid EnumMap type: " + type2);
                        }
                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type4 instanceof Class) {
                            return new EnumMap((Class) type4);
                        }
                        throw new JsonIOException("Invalid EnumMap type: " + type2);
                }
            }
        } : null;
        if (fp60Var2 != null) {
            return fp60Var2;
        }
        ReflectionAccessFilter$FilterResult a = hia1.a((List) this.w);
        int i3 = 7;
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult = ReflectionAccessFilter$FilterResult.ALLOW;
                if (a == reflectionAccessFilter$FilterResult || (toi0.a.a(null, declaredConstructor) && (a != ReflectionAccessFilter$FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    if (a == reflectionAccessFilter$FilterResult) {
                        lia1 lia1Var = xoi0.a;
                        try {
                            declaredConstructor.setAccessible(true);
                            str = null;
                        } catch (Exception e) {
                            str = "Failed making constructor '" + xoi0.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + xoi0.e(e);
                        }
                        if (str != null) {
                            v8eVar = new bg1(str, i3);
                        }
                    }
                    v8eVar = new v8e(i2, declaredConstructor);
                } else {
                    v8eVar = new bg1(qv10.m(rawType, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."), i3);
                }
            } catch (NoSuchMethodException unused) {
            }
            if (v8eVar == null) {
                return v8eVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(ArrayList.class)) {
                    fp60Var = new vm7(24);
                } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                    fp60Var = new vm7(27);
                } else if (rawType.isAssignableFrom(TreeSet.class)) {
                    fp60Var = new vm7(28);
                } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                    fp60Var = new vm7(29);
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(LinkedTreeMap.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    fp60Var = new x8e(i2);
                }
                if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                    fp60Var = new x8e(i);
                } else if (rawType.isAssignableFrom(TreeMap.class)) {
                    fp60Var = new x8e(2);
                } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                    fp60Var = new vm7(25);
                } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    fp60Var = new vm7(26);
                }
            }
            if (fp60Var != null) {
                return fp60Var;
            }
            String F = F(rawType);
            if (F != null) {
                return new bg1(F, i3);
            }
            if (!z) {
                return new bg1(qv10.m(rawType, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."), i3);
            }
            if (a != ReflectionAccessFilter$FilterResult.ALLOW) {
                return new bg1(qv10.m(rawType, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."), i3);
            }
            if (this.b) {
                return new v8e(i, rawType);
            }
            String m = qv10.m(rawType, "Unable to create instance of ", "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
            if (rawType.getDeclaredConstructors().length == 0) {
                m = m.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
            }
            return new bg1(m, i3);
        }
        v8eVar = null;
        if (v8eVar == null) {
        }
    }

    public rnz L() {
        return (rnz) this.c;
    }

    public MainMenuProcessor$MenuEntry M() {
        return (MainMenuProcessor$MenuEntry) this.c;
    }

    public fmr N() {
        return (fmr) this.w;
    }

    public void O() {
        this.b = true;
        if (((a2) this.w) == null) {
            this.w = ((j3) this.c).readObject();
        }
        a2 a2Var = (a2) this.w;
        if (a2Var instanceof t3) {
            t3 t3Var = (t3) a2Var;
            if (t3Var.l(0)) {
                j3 j3Var = (j3) t3Var.j(16);
                this.w = null;
                zq80.m(j3Var.a());
            }
        }
    }

    public String P() {
        return (String) this.c;
    }

    public boolean Q() {
        return this.b;
    }

    public boolean R() {
        return this.b;
    }

    public boolean S() {
        return this.b;
    }

    public void T(double d, double d2) {
        double[] dArr = (double[]) this.c;
        double d3 = 1.0d;
        if (!this.b) {
            d3 = 1.0d / (((dArr[7] * d2) + (dArr[3] * d)) + dArr[15]);
        }
        double d4 = ((dArr[4] * d2) + (dArr[0] * d) + dArr[12]) * d3;
        double d5 = ((dArr[5] * d2) + (dArr[1] * d) + dArr[13]) * d3;
        double[] dArr2 = (double[]) this.w;
        if (d4 < dArr2[0]) {
            dArr2[0] = d4;
        } else if (d4 > dArr2[1]) {
            dArr2[1] = d4;
        }
        if (d5 < dArr2[2]) {
            dArr2[2] = d5;
        } else if (d5 > dArr2[3]) {
            dArr2[3] = d5;
        }
    }

    public void V() {
        if (this.b || ((HashSet) this.w).isEmpty()) {
            return;
        }
        c cVar = (c) this.c;
        g1o g1oVar = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) g1oVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) g1oVar.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
        }
        this.b = z;
    }

    public void W(boolean z) {
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) this.w;
        int i = dhb.a[((CheckType) this.c).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            em3 em3Var = appAnalyticsReporter.S;
            PinEvents$EnterPinCheckPinTokenResult pinEvents$EnterPinCheckPinTokenResult = z ? PinEvents$EnterPinCheckPinTokenResult.OK : PinEvents$EnterPinCheckPinTokenResult.ERROR;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$EnterPinCheckPinTokenResult.getOriginalValue());
            em3Var.a.a("enter_pin.check_pin_token", linkedHashMap);
            return;
        }
        if (i == 4) {
            em3 em3Var2 = appAnalyticsReporter.S;
            PinEvents$EnableBiometryCheckPinTokenResult pinEvents$EnableBiometryCheckPinTokenResult = z ? PinEvents$EnableBiometryCheckPinTokenResult.OK : PinEvents$EnableBiometryCheckPinTokenResult.ERROR;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$EnableBiometryCheckPinTokenResult.getOriginalValue());
            em3Var2.a.a("enable_biometry.check_pin_token", linkedHashMap2);
            return;
        }
        if (i != 5) {
            w511.b();
            return;
        }
        em3 em3Var3 = appAnalyticsReporter.S;
        PinEvents$ChangePinCheckPinTokenFromOldCodeResult pinEvents$ChangePinCheckPinTokenFromOldCodeResult = z ? PinEvents$ChangePinCheckPinTokenFromOldCodeResult.OK : PinEvents$ChangePinCheckPinTokenFromOldCodeResult.ERROR;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
        linkedHashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ChangePinCheckPinTokenFromOldCodeResult.getOriginalValue());
        em3Var3.a.a("change_pin.check_pin_token_from_old_code", linkedHashMap3);
    }

    public void X(u8r0 u8r0Var, boolean z, boolean z2) {
        if (z == z2) {
            return;
        }
        q6r0 q6r0Var = (q6r0) this.c;
        String U = U(u8r0Var);
        String analyticsId = u8r0Var.a.getAnalyticsId();
        String str = z ? "on" : "off";
        String str2 = z2 ? "on" : "off";
        q6r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", U);
        hashMap.put("item_id", analyticsId);
        q6r0Var.a.a("Settings.MenuItem.Status.Changed", hashMap, 1, x4e.q(hashMap, "status_old", str, "status_new", str2));
    }

    public void Y(jx2 jx2Var) {
        String str;
        v8r0 item = jx2Var.getItem();
        if (jx2Var instanceof ix2) {
            str = ((ix2) jx2Var).b ? "on" : "off";
        } else {
            if (!(jx2Var instanceof fx2)) {
                w511.b();
                return;
            }
            str = "subscreen";
        }
        q6r0 q6r0Var = (q6r0) this.c;
        String U = U(item);
        String analyticsId = item.getId().getAnalyticsId();
        String title = item.getTitle();
        String subtitle = item.getSubtitle();
        if (subtitle.length() <= 0) {
            subtitle = null;
        }
        q6r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", U);
        hashMap.put("item_id", analyticsId);
        hashMap.put("title", title);
        if (subtitle != null) {
            hashMap.put("subtitle", subtitle);
        }
        q6r0Var.a.a("Settings.MenuItem.Tapped", hashMap, 1, tse0.r("current_status", hashMap, str));
    }

    public void Z(boolean z) {
        this.b = z;
    }

    @Override // defpackage.pb10
    public void a(int i, int i2, long j, int i3) {
        ((hd10) this.c).a(i, i2, j, i3);
    }

    @Override // defpackage.pdv
    public jdv acquireLatestImage() {
        Image image;
        synchronized (this.w) {
            try {
                image = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new w92(image);
        }
    }

    @Override // defpackage.pb10
    public void b(int i) {
        ((hd10) this.c).b(i);
    }

    @Override // defpackage.pb10
    public void c(int i, long j) {
        ((hd10) this.c).c(i, j);
    }

    @Override // defpackage.pdv
    public void close() {
        synchronized (this.w) {
            ((ImageReader) this.c).close();
        }
    }

    @Override // defpackage.pb10
    public void e() {
        ((hd10) this.c).e();
    }

    @Override // defpackage.pb10
    public void f(int i, ucf ucfVar, long j, int i2) {
        ((hd10) this.c).h(i, ucfVar.i, j, i2);
    }

    @Override // defpackage.pb10
    public void flush() {
        ((hd10) this.c).flush();
    }

    @Override // defpackage.pb10
    public void g(Surface surface) {
        ((hd10) this.c).g(surface);
    }

    @Override // defpackage.pdv
    public int getHeight() {
        int height;
        synchronized (this.w) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    @Override // defpackage.pb10
    public ByteBuffer getInputBuffer(int i) {
        return ((hd10) this.c).getInputBuffer(i);
    }

    @Override // defpackage.pb10
    public PersistableBundle getMetrics() {
        return ((hd10) this.c).getMetrics();
    }

    @Override // defpackage.pb10
    public ByteBuffer getOutputBuffer(int i) {
        return ((hd10) this.c).getOutputBuffer(i);
    }

    @Override // defpackage.pb10
    public MediaFormat getOutputFormat() {
        return ((hd10) this.c).getOutputFormat();
    }

    @Override // defpackage.pdv
    public Surface getSurface() {
        Surface surface;
        synchronized (this.w) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    @Override // defpackage.pdv
    public int getWidth() {
        int width;
        synchronized (this.w) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    @Override // defpackage.pdv
    public int h() {
        int imageFormat;
        synchronized (this.w) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.eo3
    public void j(Bucket bucket) {
        u5b u5bVar = (u5b) this.w;
        u5bVar.b((ChatMutingsBucket) bucket);
        u5bVar.d.f("chat muted", "muted", Boolean.valueOf(this.b), "chat id", (String) this.c);
    }

    @Override // defpackage.eo3
    public void k() {
        u5b u5bVar = (u5b) this.w;
        String str = (String) this.c;
        z83.g(null, u5bVar.c, Looper.myLooper());
        to3 to3Var = u5bVar.a;
        e48 e48Var = new e48(21, u5bVar);
        Bucket.GetParams getParams = new Bucket.GetParams(new ChatMutingsBucket(), str);
        to3Var.getClass();
        to3Var.a(ChatMutingsBucket.class, new eo1(15, e48Var), getParams);
    }

    @Override // defpackage.pdv
    public int l() {
        int maxImages;
        synchronized (this.w) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 4:
                synchronized (this.w) {
                    try {
                        if (this.b) {
                            return;
                        }
                        if (!(th instanceof CameraControl$OperationCanceledException)) {
                            sgb1.g(3, "CameraController");
                            ((dy40) this.c).m(new w9x0(4));
                            return;
                        }
                        sgb1.g(3, "CameraController");
                        ((dy40) this.c).m(new w9x0(0));
                        synchronized (this.w) {
                            this.b = true;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                if (th instanceof CancellationException) {
                    return;
                }
                sgb1.e("VideoCapture", "Surface update completed with unexpected exception", th);
                return;
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        VideoOutput$SourceState videoOutput$SourceState;
        switch (this.a) {
            case 4:
                nur nurVar = (nur) obj;
                synchronized (this.w) {
                    try {
                        if (this.b) {
                            return;
                        }
                        if (nurVar == null) {
                            return;
                        }
                        sgb1.g(3, "CameraController");
                        ((dy40) this.c).m(new w9x0(nurVar.a ? 2 : 3));
                        return;
                    } finally {
                    }
                }
            default:
                gl7 gl7Var = (gl7) this.c;
                i iVar = (i) this.w;
                if (gl7Var != iVar.u || (videoOutput$SourceState = iVar.w) == VideoOutput$SourceState.INACTIVE) {
                    return;
                }
                VideoOutput$SourceState videoOutput$SourceState2 = this.b ? VideoOutput$SourceState.ACTIVE_STREAMING : VideoOutput$SourceState.ACTIVE_NON_STREAMING;
                if (videoOutput$SourceState2 != videoOutput$SourceState) {
                    iVar.w = videoOutput$SourceState2;
                    iVar.N().e(videoOutput$SourceState2);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.qgb
    public lfr0 q(chb chbVar) {
        String str = chbVar.a;
        return (str.equals("success") || (str.equals("wait_for_notification") && ((SbpPollingStrategy) this.c) == SbpPollingStrategy.resolveOnSbpUrl)) ? zmx.d(PaymentPollingResult.SUCCESS) : zmx.c(new BillingServiceError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, str, oyr.p("Unable to convert status ", str, " to PollingResult")));
    }

    @Override // defpackage.rr3
    public void r() {
        ((um3) this.c).b.onSuccess();
        ((l) this.w).h.a.l(AuthStateRepository.AuthState.DONE);
    }

    @Override // defpackage.pb10
    public void release() {
        f fVar = (f) this.w;
        hd10 hd10Var = (hd10) this.c;
        if (!this.b) {
            hd10Var.release();
            return;
        }
        try {
            int i = tw21.a;
            if (i >= 30 && i < 33) {
                hd10Var.stop();
            }
            if (i >= 35 && fVar != null) {
                fVar.b(hd10Var.i());
            }
            hd10Var.release();
        } catch (Throwable th) {
            if (tw21.a >= 35 && fVar != null) {
                fVar.b(hd10Var.i());
            }
            hd10Var.release();
            throw th;
        }
    }

    @Override // defpackage.pb10
    public int s(MediaCodec.BufferInfo bufferInfo) {
        int l;
        do {
            l = ((hd10) this.c).l(bufferInfo);
        } while (l == -3);
        return l;
    }

    @Override // defpackage.pb10
    public void setParameters(Bundle bundle) {
        ((hd10) this.c).setParameters(bundle);
    }

    @Override // defpackage.pb10
    public void setVideoScalingMode(int i) {
        ((hd10) this.c).setVideoScalingMode(i);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return ((Map) this.c).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pdv
    public void u(final odv odvVar, final Executor executor) {
        synchronized (this.w) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: x92
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    tis0 tis0Var = tis0.this;
                    Executor executor2 = executor;
                    odv odvVar2 = odvVar;
                    synchronized (tis0Var.w) {
                        try {
                            if (!tis0Var.b) {
                                executor2.execute(new hc(17, tis0Var, odvVar2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, id00.f());
        }
    }

    @Override // defpackage.kab
    public void v(r3z r3zVar) {
        if (!this.b) {
            ((p1b) this.w).v(r3zVar);
            this.b = true;
        } else {
            e1k e1kVar = (e1k) ((Ref$ObjectRef) this.c).element;
            if (e1kVar != null) {
                e1kVar.close();
            }
        }
    }

    @Override // defpackage.pdv
    public jdv w() {
        Image image;
        synchronized (this.w) {
            try {
                image = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new w92(image);
        }
    }

    @Override // defpackage.pdv
    public void x() {
        synchronized (this.w) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.pb10
    public int y() {
        return ((hd10) this.c).d();
    }

    @Override // defpackage.qgb
    public tyj0 z(chb chbVar) {
        anh anhVar;
        String str = chbVar.h;
        String str2 = chbVar.f;
        String str3 = chbVar.a;
        if (str3.equals("success")) {
            return coa1.i(PollingStep.done);
        }
        if (!str3.equals("wait_for_notification")) {
            return coa1.h(c7b1.f(chbVar));
        }
        if (str2 != null && str != null) {
            try {
                if (!this.b) {
                    this.b = true;
                    try {
                        anhVar = new anh(Uri.parse(new URI(str2).toString()));
                    } catch (Throwable unused) {
                        anhVar = null;
                    }
                    if (anhVar == null) {
                        return coa1.h(c7b1.d(str2, "paymentFormUrl", chbVar));
                    }
                    ((q0v) this.w).invoke(anhVar, str);
                    if (((SbpPollingStrategy) this.c) == SbpPollingStrategy.resolveOnSbpUrl) {
                        return coa1.i(PollingStep.done);
                    }
                }
            } catch (RuntimeException e) {
                return coa1.h(c7b1.b(chbVar, e));
            }
        }
        return coa1.i(PollingStep.retry);
    }

    public /* synthetic */ tis0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
    }

    public /* synthetic */ tis0(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = z;
    }

    public /* synthetic */ tis0(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.w = obj2;
    }

    public /* synthetic */ tis0(boolean z, Serializable serializable, Serializable serializable2, int i) {
        this.a = i;
        this.b = z;
        this.c = serializable;
        this.w = serializable2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tis0(ModalViewType modalViewType) {
        this((Object) modalViewType, (Object) null, false, 16);
        this.a = 16;
    }

    public tis0(q6r0 q6r0Var) {
        this.a = 19;
        this.c = q6r0Var;
        this.w = new LinkedHashSet();
    }

    public tis0(View view) {
        this.a = 23;
        this.c = view;
        this.w = new int[2];
    }

    public tis0(String str, a9f a9fVar, boolean z) {
        this.a = 13;
        this.w = a9fVar;
        this.c = str == null ? a9fVar.getClass().getName() : str;
        this.b = z;
    }

    public tis0(hd10 hd10Var, f fVar, boolean z) {
        this.a = 10;
        this.c = hd10Var;
        this.w = fVar;
        if (tw21.a >= 35 && fVar != null) {
            fVar.a(hd10Var.i());
        }
        this.b = z;
    }

    public tis0(ImageReader imageReader) {
        this.a = 1;
        this.w = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public tis0(Context context) {
        this.a = 0;
        this.w = new HashSet();
        boolean z = false;
        this.c = new c(new g1o(new abe(context, z, z)), new ris0(this));
    }

    public /* synthetic */ tis0() {
        this.a = 12;
    }

    public tis0(ipg ipgVar) {
        this.a = 9;
        this.c = ipgVar;
        this.w = new dlh();
    }

    public tis0(kb3 kb3Var, kb3 kb3Var2) {
        this.a = 2;
        this.c = kb3Var;
        this.w = kb3Var2;
        this.b = false;
    }

    public tis0(u5b u5bVar, boolean z, String str) {
        this.a = 5;
        this.w = u5bVar;
        this.b = z;
        this.c = str;
    }

    public tis0(i iVar, gl7 gl7Var, boolean z) {
        this.a = 24;
        this.w = iVar;
        this.c = gl7Var;
        this.b = z;
    }

    public tis0(PointF pointF, dy40 dy40Var) {
        this.a = 4;
        this.b = false;
        this.w = new Object();
        this.c = dy40Var;
    }
}

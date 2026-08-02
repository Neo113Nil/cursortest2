package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.room.util.a;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.components.DependencyCycleException;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.persuggest.api.LocationProvider;

/* loaded from: classes9.dex */
public abstract class udq0 {
    public static final dac a = new dac(18);
    public static final wms b = new wms(4);
    public static final Type[] c = new Type[0];
    public static boolean d = true;
    public static long e = -1;

    public static boolean A(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return A(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            w511.l("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (A(type2)) {
                return true;
            }
        }
        return false;
    }

    public static final int B(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean C(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(LayoutNode layoutNode) {
        if (layoutNode.A == null) {
            return false;
        }
        LayoutNode s = layoutNode.s();
        return (s != null ? s.A : null) == null || layoutNode.b0.b;
    }

    public static final void E(Object obj, x8o x8oVar, Object obj2) {
        x8oVar.c("Setup", b64.l("Dependency provided: ", obj2.getClass().getName(), " -> ", obj.getClass().getName()));
    }

    public static final String F() {
        return UUID.randomUUID().toString();
    }

    public static final LocationProvider G(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -2083200972:
                if (!lowerCase.equals("fusedProvider")) {
                    return null;
                }
                return LocationProvider.FUSED;
            case -1081365510:
                if (lowerCase.equals("mapkit")) {
                    return LocationProvider.MAPKIT;
                }
                return null;
            case -393473447:
                if (lowerCase.equals("zero_km")) {
                    return LocationProvider.ZERO_KM;
                }
                return null;
            case 101482:
                if (!lowerCase.equals("flp")) {
                    return null;
                }
                return LocationProvider.PLATFORM_LBS;
            case 102570:
                if (lowerCase.equals("gps")) {
                    return LocationProvider.GPS;
                }
                return null;
            case 106941:
                if (lowerCase.equals("lbs")) {
                    return LocationProvider.LBS;
                }
                return null;
            case 3387192:
                if (lowerCase.equals("none")) {
                    return LocationProvider.NONE;
                }
                return null;
            case 97798435:
                if (!lowerCase.equals(GplLibraryWrapper.FUSED_PROVIDER)) {
                    return null;
                }
                return LocationProvider.FUSED;
            case 155895793:
                if (!lowerCase.equals("platform_lbs")) {
                    return null;
                }
                return LocationProvider.PLATFORM_LBS;
            case 239000001:
                if (lowerCase.equals("ridetech_location_sdk")) {
                    return LocationProvider.RIDETECH_LOCATION_SDK;
                }
                return null;
            default:
                return null;
        }
    }

    public static IllegalArgumentException H(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder v = oyr.v(String.format(str, objArr), "\n    for method ");
        v.append(method.getDeclaringClass().getSimpleName());
        v.append(Extension.DOT_CHAR);
        v.append(method.getName());
        return new IllegalArgumentException(v.toString(), exc);
    }

    public static final void I(View view, String str, String str2, boolean z) {
        f32 f32Var;
        e32 analyticsContext;
        if (cvu0.p(str, str2) || (f32Var = (f32) xw31.f(view)) == null || (analyticsContext = f32Var.getAnalyticsContext()) == null) {
            return;
        }
        if (str != null && !evu0.J(str)) {
            analyticsContext.e(str);
        }
        if (!z || str2 == null || evu0.J(str2)) {
            return;
        }
        analyticsContext.d(str2);
    }

    public static IllegalArgumentException J(Method method, int i, String str, Object... objArr) {
        return H(method, null, unr0.o(str, Extension.O_BRAKE_SPACE, cvc0.b.f(i, method), Extension.C_BRAKE), objArr);
    }

    public static IllegalArgumentException K(Method method, Exception exc, int i, String str, Object... objArr) {
        return H(method, exc, unr0.o(str, Extension.O_BRAKE_SPACE, cvc0.b.f(i, method), Extension.C_BRAKE), objArr);
    }

    public static final Pair L(String str) {
        if (str.length() == 73 && str.charAt(36) == '_') {
            String substring = str.substring(0, 36);
            try {
                UUID.fromString(substring);
                String substring2 = str.substring(37);
                UUID.fromString(substring2);
                return new Pair(substring, substring2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final Object M(Object obj) {
        return obj instanceof tzc ? new Result.Failure(((tzc) obj).a) : obj;
    }

    public static final void N(View view, String str) {
        f32 f32Var = (f32) xw31.f(view);
        if (f32Var == null) {
            return;
        }
        f32Var.getButtonTapsListener().c(f32Var.getAnalyticsContext(), str, f32Var.getEventAnalyticsParams(new wbz0()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[LOOP:0: B:1:0x0000->B:18:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type O(Type type, Class cls, Type type2) {
        Type type3;
        Type type4 = type2;
        while (true) {
            int i = 0;
            if (!(type4 instanceof TypeVariable)) {
                if (type4 instanceof Class) {
                    Class cls2 = (Class) type4;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type O = O(type, cls, componentType);
                        return componentType == O ? cls2 : new x3u(1, O);
                    }
                }
                if (type4 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type4;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type O2 = O(type, cls, genericComponentType);
                    return genericComponentType == O2 ? genericArrayType : new x3u(1, O2);
                }
                if (type4 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type4;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type O3 = O(type, cls, ownerType);
                    boolean z = O3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type O4 = O(type, cls, actualTypeArguments[i]);
                        if (O4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = O4;
                        }
                        i++;
                    }
                    return z ? new yw21(O3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type4 instanceof WildcardType;
                Type type5 = type4;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type4;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type O5 = O(type, cls, lowerBounds[0]);
                        type5 = wildcardType;
                        if (O5 != lowerBounds[0]) {
                            return new z3u(new Type[]{Object.class}, new Type[]{O5}, 1);
                        }
                    } else {
                        type5 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type O6 = O(type, cls, upperBounds[0]);
                            type5 = wildcardType;
                            if (O6 != upperBounds[0]) {
                                return new z3u(new Type[]{O6}, c, 1);
                            }
                        }
                    }
                }
                return type5;
            }
            TypeVariable typeVariable = (TypeVariable) type4;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type u = u(type, cls, cls3);
                if (u instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) u).getActualTypeArguments()[i];
                            if (type3 != typeVariable) {
                                return type3;
                            }
                            type4 = type3;
                        } else {
                            i++;
                        }
                    }
                    ny61.p();
                    return null;
                }
            }
            type3 = typeVariable;
            if (type3 != typeVariable) {
            }
        }
    }

    public static final void P(xa7 xa7Var, blh blhVar, hd7 hd7Var) {
        tig0 tig0Var;
        Object obj = null;
        if (xa7Var == null) {
            if (hd7Var.b.isEmpty()) {
                return;
            }
            xby.t(jst.e, "CachedExperimentsContract", null, "Cached experiments requested, but response has no valid typed_experiments object", 6);
            return;
        }
        List list = xa7Var.a;
        if (!xa7Var.b) {
            if (hd7Var.b.isEmpty()) {
                return;
            }
            xby.t(jst.e, "CachedExperimentsContract", null, "Cached experiments requested, but response has no valid typed_experiments object", 6);
            return;
        }
        try {
            tig0Var = blhVar.c(hd7Var.a, list, hd7Var.b);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            xby.t(jst.e, "CachedExperimentsContract", e3, null, 10);
            zn11.Companion.getClass();
            tig0Var = new tig0(tn11.a(list), obj);
        }
        Throwable th = (Throwable) tig0Var.b;
        if (th != null) {
            xby.t(jst.e, "CachedExperimentsContract", th, null, 10);
        }
        xa7Var.c = (zn11) tig0Var.a;
    }

    public static final d290 Q(yf90 yf90Var) {
        return yf90Var instanceof d290 ? (d290) yf90Var : new d290(yf90Var);
    }

    public static void R(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final k7z S(Location location, c7z c7zVar, String str) {
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos() / 1000000;
        c7zVar.getClass();
        ajc ajcVar = new ajc(elapsedRealtimeNanos, (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + elapsedRealtimeNanos);
        yzs yzsVar = new yzs(location.getLatitude(), location.getLongitude());
        Float valueOf = Float.valueOf(location.getAccuracy());
        if (!location.hasAccuracy()) {
            valueOf = null;
        }
        p6z p6zVar = new p6z(yzsVar, valueOf != null ? new u1k(valueOf.doubleValue()) : null);
        Double valueOf2 = Double.valueOf(location.getAltitude());
        if (!location.hasAltitude()) {
            valueOf2 = null;
        }
        r6z r6zVar = new r6z(valueOf2 != null ? new u1k(valueOf2.doubleValue()) : null, null, 6);
        Float valueOf3 = Float.valueOf(location.getSpeed());
        if (!location.hasSpeed()) {
            valueOf3 = null;
        }
        return new k7z(ajcVar, p6zVar, r6zVar, new o6z(valueOf3 != null ? new jpt0(valueOf3.doubleValue()) : null, null, null, null), new k820(str));
    }

    public static String T(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static zzw U(List list) {
        if (list == null || list.isEmpty()) {
            return p(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                ny61.t("null tasks are not accepted");
                return null;
            }
        }
        zzw zzwVar = new zzw();
        d591 d591Var = new d591(list.size(), zzwVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            ykj ykjVar = dtx0.b;
            task.g(ykjVar, d591Var);
            task.e(ykjVar, d591Var);
            task.a(ykjVar, d591Var);
        }
        return zzwVar;
    }

    public static final r94 V(View view, Runnable runnable, sls slsVar) {
        if (runnable == null) {
            return null;
        }
        return new r94(0, runnable, slsVar, view);
    }

    public static final fa51 W(fa51 fa51Var) {
        boolean b2 = fa51Var.e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean b3 = fa51Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean b4 = fa51Var.e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (b2 || !b3 || !b4) {
            return fa51Var;
        }
        String str = fa51Var.c;
        mng mngVar = new mng();
        mngVar.c(fa51Var.e.a);
        mngVar.a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return fa51.b(fa51Var, null, null, mngVar.a(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    public static Object X(Task task) {
        if (task.o()) {
            return task.k();
        }
        if (task.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.j());
    }

    public static String Y(Context context, String str) {
        cvw.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = kp50.X(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String Z(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static final iyr a(yxr... yxrVarArr) {
        return new iyr(Arrays.asList(yxrVarArr));
    }

    public static final Object[] b(int i, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        f73.l(objArr, 0, objArr2, i, 6);
        f73.g(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        f73.l(objArr, 0, objArr2, i, 6);
        f73.g(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] d(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        f73.l(objArr, 0, objArr2, i, 6);
        f73.g(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static iwk0 e(int i, String str) {
        TreeMap treeMap = iwk0.B;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                iwk0 iwk0Var = new iwk0(i);
                iwk0Var.b = str;
                iwk0Var.A = i;
                return iwk0Var;
            }
            treeMap.remove(ceilingEntry.getKey());
            iwk0 iwk0Var2 = (iwk0) ceilingEntry.getValue();
            iwk0Var2.b = str;
            iwk0Var2.A = i;
            return iwk0Var2;
        }
    }

    public static Object f(Task task) {
        cvw.k("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            ny61.r("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        cvw.m(task, "Task must not be null");
        if (task.n()) {
            return X(task);
        }
        dxf0 dxf0Var = new dxf0(15);
        Executor executor = dtx0.b;
        task.g(executor, dxf0Var);
        task.e(executor, dxf0Var);
        task.a(executor, dxf0Var);
        ((CountDownLatch) dxf0Var.a).await();
        return X(task);
    }

    public static Object g(Task task, long j, TimeUnit timeUnit) {
        cvw.k("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            ny61.r("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        cvw.m(task, "Task must not be null");
        cvw.m(timeUnit, "TimeUnit must not be null");
        if (task.n()) {
            return X(task);
        }
        dxf0 dxf0Var = new dxf0(15);
        Executor executor = dtx0.b;
        task.g(executor, dxf0Var);
        task.e(executor, dxf0Var);
        task.a(executor, dxf0Var);
        if (((CountDownLatch) dxf0Var.a).await(j, timeUnit)) {
            return X(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static zzw h(Executor executor, Callable callable) {
        cvw.m(executor, "Executor must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new na3(zzwVar, callable, false, 17));
        return zzwVar;
    }

    public static final void i(WorkDatabase workDatabase, u0e u0eVar, a951 a951Var) {
        int i;
        ArrayList i2 = scc.i(a951Var);
        int i3 = 0;
        while (!i2.isEmpty()) {
            List list = ((a951) ycc.z(i2)).d;
            if ((list instanceof Collection) && list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((ba51) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
            }
            i3 += i;
        }
        if (i3 == 0) {
            return;
        }
        int intValue = ((Number) a.b(workDatabase.X0().a, true, false, new js41(16))).intValue();
        int i4 = u0eVar.l;
        if (intValue + i3 <= i4) {
            return;
        }
        ny61.g(oyr.m(i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", b64.s(i4, intValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
    }

    public static void j(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            w511.q();
        }
    }

    public static final Location k(k7z k7zVar) {
        Location location = new Location("ridetech_location_sdk");
        location.setTime(k7zVar.a.b);
        p6z p6zVar = k7zVar.b;
        r6z r6zVar = k7zVar.c;
        o6z o6zVar = k7zVar.d;
        long j = k7zVar.a.a;
        location.setElapsedRealtimeNanos(j > 9223372036854L ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : j < -9223372036854L ? Long.MIN_VALUE : j * 1000000);
        location.setLatitude(p6zVar.a.a);
        location.setLongitude(p6zVar.a.b);
        u1k u1kVar = p6zVar.b;
        if (u1kVar != null) {
            location.setAccuracy((float) u1kVar.a);
        }
        u1k u1kVar2 = r6zVar.a;
        if (u1kVar2 != null) {
            location.setAltitude(u1kVar2.a);
        }
        u1k u1kVar3 = r6zVar.b;
        if (u1kVar3 != null) {
            location.setVerticalAccuracyMeters((float) u1kVar3.a);
        }
        jpt0 jpt0Var = o6zVar.a;
        if (jpt0Var != null) {
            location.setSpeed((float) jpt0Var.a);
        }
        jpt0 jpt0Var2 = o6zVar.b;
        if (jpt0Var2 != null) {
            location.setSpeedAccuracyMetersPerSecond((float) jpt0Var2.a);
        }
        td2 td2Var = o6zVar.c;
        if (td2Var != null) {
            location.setBearing((float) td2Var.a);
        }
        td2 td2Var2 = o6zVar.d;
        if (td2Var2 != null) {
            location.setBearingAccuracyDegrees((float) td2Var2.a);
        }
        return location;
    }

    public static void l(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (tof tofVar : (Set) it2.next()) {
                        for (vwi vwiVar : tofVar.a.c) {
                            if (vwiVar.c == 0) {
                                Set<tof> set = (Set) hashMap.get(new uof(vwiVar.a, vwiVar.b == 2));
                                if (set != null) {
                                    for (tof tofVar2 : set) {
                                        tofVar.b.add(tofVar2);
                                        tofVar2.c.add(tofVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    tof tofVar3 = (tof) it4.next();
                    if (tofVar3.c.isEmpty()) {
                        hashSet2.add(tofVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    tof tofVar4 = (tof) hashSet2.iterator().next();
                    hashSet2.remove(tofVar4);
                    i++;
                    Iterator it5 = tofVar4.b.iterator();
                    while (it5.hasNext()) {
                        tof tofVar5 = (tof) it5.next();
                        tofVar5.c.remove(tofVar4);
                        if (tofVar5.c.isEmpty()) {
                            hashSet2.add(tofVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    tof tofVar6 = (tof) it6.next();
                    if (!tofVar6.c.isEmpty() && !tofVar6.b.isEmpty()) {
                        arrayList2.add(tofVar6.a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            j0d j0dVar = (j0d) it.next();
            tof tofVar7 = new tof(j0dVar);
            for (jgg0 jgg0Var : j0dVar.b) {
                boolean z = j0dVar.e == 0;
                uof uofVar = new uof(jgg0Var, !z);
                if (!hashMap.containsKey(uofVar)) {
                    hashMap.put(uofVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(uofVar);
                if (!set2.isEmpty() && z) {
                    w511.t("Multiple components provide ", jgg0Var, Extension.DOT_CHAR);
                    return;
                }
                set2.add(tofVar7);
            }
        }
    }

    public static boolean m(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static zzw o(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.r(exc);
        return zzwVar;
    }

    public static zzw p(Object obj) {
        zzw zzwVar = new zzw();
        zzwVar.s(obj);
        return zzwVar;
    }

    public static final n951 q(fa51 fa51Var) {
        return new n951(fa51Var.a, fa51Var.t);
    }

    public static ArrayList r(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = EmptyList.a;
        }
        List M = kotlin.collections.a.M(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : M) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new s5f0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2.equals(str)));
        }
        return arrayList2;
    }

    public static final List s(yf90 yf90Var) {
        return yf90Var instanceof k6o ? ((k6o) yf90Var).b : yf90Var instanceof zf90 ? s(((zf90) yf90Var).c()) : EmptyList.a;
    }

    public static long t() {
        v3c.a.getClass();
        return (Build.VERSION.SDK_INT < 35 ? System.nanoTime() : SystemClock.uptimeNanos()) / 1000;
    }

    public static Type u(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return u(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return u(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static void v(jb7 jb7Var) {
        cjx cjxVar;
        e630 a2 = g630.a();
        a2.c((d630) jb7Var.w);
        Iterator it = ((ConcurrentMap) jb7Var.b).values().iterator();
        while (it.hasNext()) {
            for (p2f0 p2f0Var : (List) it.next()) {
                int i = j630.a[p2f0Var.d.ordinal()];
                if (i == 1) {
                    cjxVar = cjx.c;
                } else if (i == 2) {
                    cjxVar = cjx.w;
                } else {
                    if (i != 3) {
                        ny61.r("Unknown key status");
                        return;
                    }
                    cjxVar = cjx.x;
                }
                int i2 = p2f0Var.f;
                String str = p2f0Var.g;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                a2.a(cjxVar, i2, str, p2f0Var.e.name());
            }
        }
        p2f0 p2f0Var2 = (p2f0) jb7Var.c;
        if (p2f0Var2 != null) {
            a2.d(p2f0Var2.f);
        }
        try {
            a2.b();
        } catch (GeneralSecurityException e2) {
            ny61.o(e2);
        }
    }

    public static s5f0 w(Context context) {
        Object obj;
        String processName;
        int myPid = Process.myPid();
        Iterator it = r(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((s5f0) obj).b == myPid) {
                break;
            }
        }
        s5f0 s5f0Var = (s5f0) obj;
        if (s5f0Var != null) {
            return s5f0Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                if (gtq0.o == null) {
                    gtq0.o = Application.getProcessName();
                }
                processName = gtq0.o;
                if (processName == null) {
                    processName = "";
                }
            }
        }
        return new s5f0(processName, myPid, 0, false);
    }

    public static Type x(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder t = b64.t(i, "Index ", " not in range [0,");
        t.append(actualTypeArguments.length);
        t.append(") for ");
        t.append(parameterizedType);
        throw new IllegalArgumentException(t.toString());
    }

    public static Class y(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            w511.q();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) y(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return y(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        w511.p(sb, "> is of type ", type.getClass().getName());
        return null;
    }

    public static Type z(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return O(type, cls, u(type, cls, Map.class));
        }
        w511.q();
        return null;
    }
}

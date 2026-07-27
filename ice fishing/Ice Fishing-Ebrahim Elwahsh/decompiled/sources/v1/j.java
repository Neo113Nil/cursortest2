package v1;

import N1.p;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f41353d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f41354e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f41355f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f41356g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f41357h;

    /* renamed from: a, reason: collision with root package name */
    public final C5121e f41358a = new C5121e(1);

    /* renamed from: b, reason: collision with root package name */
    public final S0.c f41359b = new S0.c(19);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41360c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f41353d = configArr;
        f41354e = configArr;
        f41355f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f41356g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f41357h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(p.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(int i, int i4, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        int i9;
        Bitmap bitmap;
        Bitmap.Config config2;
        int d2 = p.d(config) * i * i4;
        C5121e c5121e = this.f41358a;
        g gVar = (g) ((ArrayDeque) c5121e.f37200u).poll();
        if (gVar == null) {
            gVar = c5121e.m();
        }
        i iVar = (i) gVar;
        iVar.f41351b = d2;
        iVar.f41352c = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = f41354e;
                length = configArr.length;
                i9 = 0;
                while (true) {
                    if (i9 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i9];
                    Integer num = (Integer) d(config3).ceilingKey(Integer.valueOf(d2));
                    if (num == null || num.intValue() > d2 * 8) {
                        i9++;
                    } else if (num.intValue() != d2 || (config3 != null ? !config3.equals(config) : config != null)) {
                        c5121e.f(iVar);
                        int intValue = num.intValue();
                        g gVar2 = (g) ((ArrayDeque) c5121e.f37200u).poll();
                        if (gVar2 == null) {
                            gVar2 = c5121e.m();
                        }
                        iVar = (i) gVar2;
                        iVar.f41351b = intValue;
                        iVar.f41352c = config3;
                    }
                }
                bitmap = (Bitmap) this.f41359b.u(iVar);
                if (bitmap != null) {
                    a(Integer.valueOf(iVar.f41351b), bitmap);
                    bitmap.reconfigure(i, i4, config);
                }
                return bitmap;
            }
        }
        int i10 = h.f41349a[config.ordinal()];
        configArr = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f41357h : f41356g : f41355f : f41353d;
        length = configArr.length;
        i9 = 0;
        while (true) {
            if (i9 < length) {
            }
            i9++;
        }
        bitmap = (Bitmap) this.f41359b.u(iVar);
        if (bitmap != null) {
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f41360c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c4 = p.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C5121e c5121e = this.f41358a;
        g gVar = (g) ((ArrayDeque) c5121e.f37200u).poll();
        if (gVar == null) {
            gVar = c5121e.m();
        }
        i iVar = (i) gVar;
        iVar.f41351b = c4;
        iVar.f41352c = config;
        this.f41359b.A(iVar, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(iVar.f41351b));
        d2.put(Integer.valueOf(iVar.f41351b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder b9 = AbstractC5088e.b("SizeConfigStrategy{groupedMap=");
        b9.append(this.f41359b);
        b9.append(", sortedSizes=(");
        HashMap hashMap = this.f41360c;
        for (Map.Entry entry : hashMap.entrySet()) {
            b9.append(entry.getKey());
            b9.append('[');
            b9.append(entry.getValue());
            b9.append("], ");
        }
        if (!hashMap.isEmpty()) {
            b9.replace(b9.length() - 2, b9.length(), "");
        }
        b9.append(")}");
        return b9.toString();
    }
}

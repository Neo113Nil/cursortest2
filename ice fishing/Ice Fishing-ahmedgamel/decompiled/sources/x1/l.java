package x1;

import P1.p;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import k1.C4639a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f41837d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f41838e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f41839f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f41840g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f41841h;

    /* renamed from: a, reason: collision with root package name */
    public final C5188f f41842a = new C5188f(1);

    /* renamed from: b, reason: collision with root package name */
    public final C4639a f41843b = new C4639a(4);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41844c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f41837d = configArr;
        f41838e = configArr;
        f41839f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f41840g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f41841h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap d9 = d(bitmap.getConfig());
        Integer num2 = (Integer) d9.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d9.remove(num);
                return;
            } else {
                d9.put(num, Integer.valueOf(num2.intValue() - 1));
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
        int i6;
        Bitmap bitmap;
        Bitmap.Config config2;
        int d9 = p.d(config) * i * i4;
        C5188f c5188f = this.f41842a;
        i iVar = (i) ((ArrayDeque) c5188f.f67u).poll();
        if (iVar == null) {
            iVar = c5188f.m();
        }
        k kVar = (k) iVar;
        kVar.f41835b = d9;
        kVar.f41836c = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = f41838e;
                length = configArr.length;
                i6 = 0;
                while (true) {
                    if (i6 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i6];
                    Integer num = (Integer) d(config3).ceilingKey(Integer.valueOf(d9));
                    if (num == null || num.intValue() > d9 * 8) {
                        i6++;
                    } else if (num.intValue() != d9 || (config3 != null ? !config3.equals(config) : config != null)) {
                        c5188f.f(kVar);
                        int intValue = num.intValue();
                        i iVar2 = (i) ((ArrayDeque) c5188f.f67u).poll();
                        if (iVar2 == null) {
                            iVar2 = c5188f.m();
                        }
                        kVar = (k) iVar2;
                        kVar.f41835b = intValue;
                        kVar.f41836c = config3;
                    }
                }
                bitmap = (Bitmap) this.f41843b.a(kVar);
                if (bitmap != null) {
                    a(Integer.valueOf(kVar.f41835b), bitmap);
                    bitmap.reconfigure(i, i4, config);
                }
                return bitmap;
            }
        }
        int i9 = j.f41833a[config.ordinal()];
        configArr = i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new Bitmap.Config[]{config} : f41841h : f41840g : f41839f : f41837d;
        length = configArr.length;
        i6 = 0;
        while (true) {
            if (i6 < length) {
            }
            i6++;
        }
        bitmap = (Bitmap) this.f41843b.a(kVar);
        if (bitmap != null) {
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.f41844c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c9 = p.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C5188f c5188f = this.f41842a;
        i iVar = (i) ((ArrayDeque) c5188f.f67u).poll();
        if (iVar == null) {
            iVar = c5188f.m();
        }
        k kVar = (k) iVar;
        kVar.f41835b = c9;
        kVar.f41836c = config;
        this.f41843b.e(kVar, bitmap);
        NavigableMap d9 = d(bitmap.getConfig());
        Integer num = (Integer) d9.get(Integer.valueOf(kVar.f41835b));
        d9.put(Integer.valueOf(kVar.f41835b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder b9 = AbstractC5050e.b("SizeConfigStrategy{groupedMap=");
        b9.append(this.f41843b);
        b9.append(", sortedSizes=(");
        HashMap hashMap = this.f41844c;
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

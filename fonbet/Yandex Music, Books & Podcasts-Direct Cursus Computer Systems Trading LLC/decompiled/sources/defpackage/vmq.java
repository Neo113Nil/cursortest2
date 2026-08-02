package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class vmq {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final b0h a = new b0h(1);
    public final xiu b = new xiu(29);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
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
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String c = c(xut.c(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(c);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[EDGE_INSN: B:34:0x00a6->B:20:0x00a6 BREAK  A[LOOP:0: B:10:0x0058->B:32:0x00a3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int length;
        int i3;
        Bitmap bitmap;
        Bitmap.Config config2;
        int d2 = xut.d(config) * i * i2;
        b0h b0hVar = this.a;
        sgm sgmVar = (sgm) ((ArrayDeque) b0hVar.a).poll();
        if (sgmVar == null) {
            sgmVar = b0hVar.G();
        }
        umq umqVar = (umq) sgmVar;
        umqVar.b = d2;
        umqVar.c = config;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            if (config2.equals(config)) {
                configArr = e;
                length = configArr.length;
                i3 = 0;
                while (true) {
                    if (i3 < length) {
                        break;
                    }
                    Bitmap.Config config3 = configArr[i3];
                    Integer num = (Integer) d(config3).ceilingKey(Integer.valueOf(d2));
                    if (num == null || num.intValue() > d2 * 8) {
                        i3++;
                    } else if (num.intValue() != d2 || (config3 != null ? !config3.equals(config) : config != null)) {
                        b0hVar.x(umqVar);
                        int intValue = num.intValue();
                        sgm sgmVar2 = (sgm) ((ArrayDeque) b0hVar.a).poll();
                        if (sgmVar2 == null) {
                            sgmVar2 = b0hVar.G();
                        }
                        umqVar = (umq) sgmVar2;
                        umqVar.b = intValue;
                        umqVar.c = config3;
                    }
                }
                bitmap = (Bitmap) this.b.m(umqVar);
                if (bitmap != null) {
                    a(Integer.valueOf(umqVar.b), bitmap);
                    bitmap.reconfigure(i, i2, config);
                }
                return bitmap;
            }
        }
        int i4 = tmq.a[config.ordinal()];
        configArr = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        length = configArr.length;
        i3 = 0;
        while (true) {
            if (i3 < length) {
            }
            i3++;
        }
        bitmap = (Bitmap) this.b.m(umqVar);
        if (bitmap != null) {
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int c = xut.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b0h b0hVar = this.a;
        sgm sgmVar = (sgm) ((ArrayDeque) b0hVar.a).poll();
        if (sgmVar == null) {
            sgmVar = b0hVar.G();
        }
        umq umqVar = (umq) sgmVar;
        umqVar.b = c;
        umqVar.c = config;
        this.b.B(umqVar, bitmap);
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num = (Integer) d2.get(Integer.valueOf(umqVar.b));
        d2.put(Integer.valueOf(umqVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder k = dfi.k("SizeConfigStrategy{groupedMap=");
        k.append(this.b);
        k.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            k.append(entry.getKey());
            k.append('[');
            k.append(entry.getValue());
            k.append("], ");
        }
        if (!hashMap.isEmpty()) {
            k.replace(k.length() - 2, k.length(), "");
        }
        k.append(")}");
        return k.toString();
    }
}

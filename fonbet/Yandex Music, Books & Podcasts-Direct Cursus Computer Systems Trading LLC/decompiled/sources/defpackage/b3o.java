package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import net.danlew.android.joda.R$raw;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.a;

/* loaded from: classes5.dex */
public final class b3o implements tzm {
    public final Context a;
    public final ConcurrentHashMap b;

    public b3o(Context context) {
        if (context == null) {
            xq0.x("Context must not be null");
            throw null;
        }
        this.a = context.getApplicationContext();
        InputStream d = d("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(d);
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInputStream.readUTF().intern();
            }
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
                try {
                    concurrentHashMap.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    kac.f("Corrupt zone info map");
                }
            }
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.a));
            this.b = concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // defpackage.tzm
    public final DateTimeZone a(String str) {
        Object obj;
        if (str == null || (obj = this.b.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return c(str);
        }
        if (!(obj instanceof SoftReference)) {
            return a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : c(str);
    }

    @Override // defpackage.tzm
    public final Set b() {
        return new TreeSet(this.b.keySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x002b: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:44), block:B:28:0x002b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DateTimeZone c(String str) {
        InputStream inputStream;
        InputStream inputStream2;
        ConcurrentHashMap concurrentHashMap = this.b;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = d(str);
                try {
                    DateTimeZone a = inputStream instanceof DataInput ? a.a((DataInput) inputStream, str) : a.a(new DataInputStream(inputStream), str);
                    concurrentHashMap.put(str, new SoftReference(a));
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    return a;
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    concurrentHashMap.remove(str);
                    if (inputStream != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream3 = inputStream2;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = 0;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream3 != null) {
            }
            throw th;
        }
    }

    public final InputStream d(String str) {
        Map map;
        int i;
        Context context = this.a;
        if (context == null) {
            wvs.p("Need to call JodaTimeAndroid.init() before using joda-time-android");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = l1o.a;
        StringBuilder sb = new StringBuilder("joda_");
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(file.getName());
            file = file.getParentFile();
        } while (file != null);
        StringBuffer stringBuffer = new StringBuffer();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("_");
            }
            stringBuffer.append((String) arrayList.get(size));
        }
        sb.append(stringBuffer.toString().replace('-', '_').replace("+", "plus").toLowerCase(Locale.US));
        String sb2 = sb.toString();
        ConcurrentHashMap concurrentHashMap2 = l1o.a;
        if (concurrentHashMap2.containsKey(R$raw.class)) {
            map = (Map) concurrentHashMap2.get(R$raw.class);
        } else {
            map = new ConcurrentHashMap();
            concurrentHashMap2.put(R$raw.class, map);
        }
        if (map.containsKey(sb2)) {
            i = ((Integer) map.get(sb2)).intValue();
        } else {
            try {
                i = R$raw.class.getField(sb2).getInt(null);
                if (i != 0) {
                    map.put(sb2, Integer.valueOf(i));
                }
            } catch (Exception e) {
                Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + sb2, e);
                i = 0;
            }
        }
        if (i != 0) {
            return context.getResources().openRawResource(i);
        }
        kac.f(hrg.s("Resource not found: \"", str, "\" (resName: \"", sb2, "\")"));
        return null;
    }
}

package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class fsm extends h3o {
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;
    public TypedValue g;
    public final Object h;

    public fsm(Resources resources) {
        super(resources);
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new TypedValue();
        this.h = new Object();
    }

    public final TypedValue a() {
        TypedValue typedValue;
        synchronized (this.h) {
            typedValue = this.g;
            if (typedValue != null) {
                this.g = null;
            } else {
                typedValue = null;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    public final void b(TypedValue typedValue) {
        synchronized (this.h) {
            if (this.g == null) {
                this.g = typedValue;
            }
        }
    }

    @Override // android.content.res.Resources
    public final boolean getBoolean(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            TypedValue a = a();
            boolean z = true;
            try {
                getValue(i, a, true);
                int i2 = a.type;
                if (i2 < 16 || i2 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(a.type) + " is not valid");
                }
                if (a.data == 0) {
                    z = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z);
                if (a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf2);
                }
                b(a);
                obj = valueOf2;
            } catch (Throwable th) {
                b(a);
                throw th;
            }
        }
        return ((Boolean) obj).booleanValue();
    }

    @Override // android.content.res.Resources
    public final float getDimension(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            TypedValue a = a();
            try {
                getValue(i, a, true);
                if (a.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(a.type) + " is not valid");
                }
                Float valueOf2 = Float.valueOf(TypedValue.complexToDimension(a.data, this.a.getDisplayMetrics()));
                if (a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf2);
                }
                b(a);
                obj = valueOf2;
            } catch (Throwable th) {
                b(a);
                throw th;
            }
        }
        return ((Number) obj).floatValue();
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelOffset(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.d;
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            TypedValue a = a();
            try {
                getValue(i, a, true);
                if (a.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(a.type) + " is not valid");
                }
                Integer valueOf2 = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(a.data, this.a.getDisplayMetrics()));
                if (a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf2);
                }
                b(a);
                obj = valueOf2;
            } catch (Throwable th) {
                b(a);
                throw th;
            }
        }
        return ((Number) obj).intValue();
    }

    @Override // android.content.res.Resources
    public final int getDimensionPixelSize(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.e;
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            TypedValue a = a();
            try {
                getValue(i, a, true);
                if (a.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(a.type) + " is not valid");
                }
                Integer valueOf2 = Integer.valueOf(TypedValue.complexToDimensionPixelSize(a.data, this.a.getDisplayMetrics()));
                if (a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf2);
                }
                b(a);
                obj = valueOf2;
            } catch (Throwable th) {
                b(a);
                throw th;
            }
        }
        return ((Number) obj).intValue();
    }

    @Override // android.content.res.Resources
    public final int getInteger(int i) {
        Integer valueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.f;
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            TypedValue a = a();
            try {
                getValue(i, a, true);
                int i2 = a.type;
                if (i2 < 16 || i2 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i) + " type #0x" + Integer.toHexString(a.type) + " is not valid");
                }
                Integer valueOf2 = Integer.valueOf(a.data);
                if (a.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i), valueOf2);
                }
                b(a);
                obj = valueOf2;
            } catch (Throwable th) {
                b(a);
                throw th;
            }
        }
        return ((Number) obj).intValue();
    }
}

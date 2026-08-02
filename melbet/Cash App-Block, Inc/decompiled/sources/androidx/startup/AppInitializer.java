package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.squareup.cash.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AppInitializer {
    public static volatile AppInitializer sInstance;
    public static final Object sLock = new Object();
    public final Context mContext;
    public final HashSet mDiscovered = new HashSet();
    public final HashMap mInitialized = new HashMap();

    public AppInitializer(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static AppInitializer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new AppInitializer(context);
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    public final void discoverAndInitialize(Bundle bundle) {
        HashSet hashSet;
        String string2 = this.mContext.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.mDiscovered;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string2.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    doInitialize((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public final Object doInitialize(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.mInitialized;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> dependencies = initializer.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            doInitialize(cls2, hashSet);
                        }
                    }
                }
                obj = initializer.create(this.mContext);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return obj;
    }
}

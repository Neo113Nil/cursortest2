package B1;

import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {
    public static /* synthetic */ DelegateLastClassLoader b(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    public static /* synthetic */ InMemoryDexClassLoader c(ByteBuffer[] byteBufferArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBufferArr, classLoader);
    }

    public static /* synthetic */ void d() {
    }
}

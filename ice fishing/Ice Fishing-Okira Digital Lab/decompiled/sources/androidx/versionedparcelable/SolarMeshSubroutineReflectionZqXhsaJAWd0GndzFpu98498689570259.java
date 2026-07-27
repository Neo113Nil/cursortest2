package androidx.versionedparcelable;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class SolarMeshSubroutineReflectionZqXhsaJAWd0GndzFpu98498689570259 extends MysticCacheBuilderClosureL5lOBEkjAmypOcospr98710980521998 implements ZenithPathObjectGatewayXduJfihU3wtHzG5quE25382798333858 {
    private volatile Object _preHandler;

    public SolarMeshSubroutineReflectionZqXhsaJAWd0GndzFpu98498689570259() {
        super(VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // androidx.versionedparcelable.ZenithPathObjectGatewayXduJfihU3wtHzG5quE25382798333858
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(ZenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893 zenithPathPrefixBinaryTreeWiopqXIKz9omZoY5vl97749504905893, Throwable th) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            method = (Method) obj;
        } else {
            try {
                method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (Modifier.isPublic(method.getModifiers())) {
                }
            } catch (Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        Object invoke = method != null ? method.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}

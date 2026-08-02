package ru.CryptoPro.JCSP.Key;

import defpackage.ny61;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class PublicKeySpecWrapperPoolContext extends PublicKeySpecWrapper {
    public static final int PUBLIC_CONTEXT_POOL_SIZE;
    public static final int PUBLIC_CONTEXT_POOL_SIZE_DEFAULT = 8;
    public static final boolean USE_PUBLIC_CONTEXT_POOL = GetProperty.getBooleanProperty("use_public_context_pool", false);
    static final /* synthetic */ boolean d = true;
    private static final int e;
    private static ru.CryptoPro.JCSP.tools.cl_0 f;

    public static class LazyContextInitializer {
        private LazyContextInitializer() {
            ru.CryptoPro.JCSP.tools.cl_0 unused = PublicKeySpecWrapperPoolContext.f = new ru.CryptoPro.JCSP.tools.cl_0(PublicKeySpecWrapperPoolContext.e);
        }
    }

    public static class LazyContextInitializerHolder {
        private static final LazyContextInitializer a = new LazyContextInitializer();

        private LazyContextInitializerHolder() {
        }
    }

    static {
        int integerProperty = GetProperty.getIntegerProperty("public_context_pool_size", 8);
        PUBLIC_CONTEXT_POOL_SIZE = integerProperty;
        e = integerProperty > 0 ? integerProperty : 8;
    }

    public PublicKeySpecWrapperPoolContext(PublicKeyBlob publicKeyBlob, boolean z, boolean z2) {
        super(publicKeyBlob, z, z2);
    }

    private static void n() {
        LazyContextInitializer lazyContextInitializer = LazyContextInitializerHolder.a;
        if (d || lazyContextInitializer != null) {
            return;
        }
        ny61.w();
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapper, ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    /* renamed from: c */
    public PublicKeySpecWrapper d() throws CloneNotSupportedException {
        return new PublicKeySpecWrapperPoolContext(this);
    }

    @Override // ru.CryptoPro.JCSP.Key.PublicKeySpecWrapperBase
    public PublicKeySpecWrapperBase.ProviderContext l() {
        if (!USE_PUBLIC_CONTEXT_POOL || this.c) {
            return super.l();
        }
        n();
        return new PublicKeySpecWrapperBase.ProviderContext(f.a(HProv.getInstanceByParamSet(this.b.getParams()).getProvType()), true);
    }

    public PublicKeySpecWrapperPoolContext(PublicKeySpecWrapper publicKeySpecWrapper) throws CloneNotSupportedException {
        super(publicKeySpecWrapper);
    }
}

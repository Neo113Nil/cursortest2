package flex.network.cache.impl;

import defpackage.byg;
import defpackage.cyg;
import defpackage.ffx;
import defpackage.g0c;
import defpackage.kf5;
import defpackage.kq90;
import defpackage.qoi0;
import defpackage.tls;
import defpackage.v5e0;
import defpackage.zcx;
import defpackage.zoe;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.KSerializer;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class DefaultCachingImpl$savePartRequest$1 extends FunctionReferenceImpl implements tls {
    public DefaultCachingImpl$savePartRequest$1(b bVar) {
        super(1, bVar, b.class, "patchParamsDecoder", "patchParamsDecoder(Ljava/io/InputStream;)Lflex/network/cache/Decoded;", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        InputStream inputStream = (InputStream) obj;
        b bVar = (b) this.receiver;
        bVar.getClass();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zcx zcxVar = bVar.i;
            zoe zoeVar = new zoe(inputStream, byteArrayOutputStream);
            kf5 kf5Var = zcxVar.b;
            g0c a = qoi0.a(kq90.class);
            KSerializer b = kf5Var.b(a, EmptyList.a);
            if (b == null) {
                b = new v5e0(a);
            }
            return new cyg(ffx.A(zcxVar, b, zoeVar));
        } catch (Throwable th) {
            return new byg(th);
        }
    }
}

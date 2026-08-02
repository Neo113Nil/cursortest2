package kotlinx.serialization.json.internal;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        int intValue = ((Number) obj2).intValue();
        a aVar = (a) this.receiver;
        aVar.getClass();
        boolean z = !serialDescriptor.i(intValue) && serialDescriptor.d(intValue).b();
        aVar.b = z;
        return Boolean.valueOf(z);
    }
}

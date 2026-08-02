package ru.yandex.taxi.address.clarification;

import com.yandex.go.address.models.Address;
import defpackage.tls;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AddressMapPickerClarificationPayloadCompat$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((Consumer) this.receiver).accept((Address) obj);
        return zy11.a;
    }
}

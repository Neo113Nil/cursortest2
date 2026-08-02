package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.fho;
import defpackage.ken;
import defpackage.p32;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.eatskit.a;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class EatsNativeApi$sendAnalyticsEvent$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        p32 p32Var = (p32) obj;
        fho m = ((a) ((ken) this.receiver)).c.o.m();
        if (m != null) {
            m.a(p32Var);
        }
        return zy11.a;
    }
}

package ru.yandex.taxi.layers.presentation;

import defpackage.qn00;
import defpackage.rn00;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MapObjectsOverlay$prepareMapObjectsViewState$5 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        qn00 qn00Var = (qn00) ((rn00) this.receiver).a.get((MapObjectType) obj);
        if (qn00Var != null) {
            return qn00Var.b();
        }
        return null;
    }
}

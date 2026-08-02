package ru.yandex.taxi.logistics.photocomment;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ej1;
import defpackage.hkb0;
import defpackage.hxx;
import defpackage.m8o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.wii;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zii;
import defpackage.zsa;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nowUploading", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.photocomment.DeliveryPhotocommentRouter$observeUploadErrors$1", f = "DeliveryPhotocommentRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPhotocommentRouter$observeUploadErrors$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPhotocommentRouter$observeUploadErrors$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryPhotocommentRouter$observeUploadErrors$1 deliveryPhotocommentRouter$observeUploadErrors$1 = new DeliveryPhotocommentRouter$observeUploadErrors$1(this.this$0, continuation);
        deliveryPhotocommentRouter$observeUploadErrors$1.Z$0 = ((Boolean) obj).booleanValue();
        return deliveryPhotocommentRouter$observeUploadErrors$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        DeliveryPhotocommentRouter$observeUploadErrors$1 deliveryPhotocommentRouter$observeUploadErrors$1 = (DeliveryPhotocommentRouter$observeUploadErrors$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryPhotocommentRouter$observeUploadErrors$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            Set entrySet = ((Map) this.this$0.k.a().a.getValue()).entrySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                ycc.r((Iterable) ((Map.Entry) it.next()).getValue(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof hkb0) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                zii ziiVar = this.this$0.b;
                int size = arrayList2.size();
                i d = ((j) ziiVar.b).d("DeliveryDetailsCard.PhotoComment.UploadError.Shown");
                d.b(size, "num_pictures");
                pex0 m = ((k) ziiVar.a).m();
                d.a.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m != null ? m.b : null);
                d.m();
                b bVar = this.this$0;
                ((pep0) bVar.l).f(new zsa(12, (ej1) bVar.d.get(), new wii(bVar, arrayList2, 0), new wii(bVar, arrayList2, 1)), new m8o(arrayList2), hxx.a);
            }
        }
        return zy11.a;
    }
}

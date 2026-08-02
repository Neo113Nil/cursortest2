package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import defpackage.czh;
import defpackage.ekb0;
import defpackage.gzh;
import defpackage.hkb0;
import defpackage.ikb0;
import defpackage.izh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okb0;
import defpackage.wls;
import defpackage.ycc;
import defpackage.z6o;
import defpackage.zni;
import defpackage.zrm;
import defpackage.zy11;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nowUploading", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsUploadInteractor$observeUploadErrors$1", f = "PhotocommentsUploadInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsUploadInteractor$observeUploadErrors$1 extends SuspendLambda implements wls {
    final /* synthetic */ gzh $childRouterFactory;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsUploadInteractor$observeUploadErrors$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            okb0 okb0Var = (okb0) obj2;
            b bVar = (b) this.receiver;
            File a = bVar.d.a(str);
            FileInputStream fileInputStream = !a.exists() ? null : new FileInputStream(a);
            if (fileInputStream != null) {
                bVar.a.b(new ikb0(str, bVar.d.b(str), 0, 0), okb0Var);
                bVar.b(str, fileInputStream, okb0Var);
            }
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsUploadInteractor$observeUploadErrors$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((b) this.receiver).c((String) obj, (okb0) obj2);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsUploadInteractor$observeUploadErrors$1(b bVar, gzh gzhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$childRouterFactory = gzhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PhotocommentsUploadInteractor$observeUploadErrors$1 photocommentsUploadInteractor$observeUploadErrors$1 = new PhotocommentsUploadInteractor$observeUploadErrors$1(this.this$0, this.$childRouterFactory, continuation);
        photocommentsUploadInteractor$observeUploadErrors$1.Z$0 = ((Boolean) obj).booleanValue();
        return photocommentsUploadInteractor$observeUploadErrors$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        PhotocommentsUploadInteractor$observeUploadErrors$1 photocommentsUploadInteractor$observeUploadErrors$1 = (PhotocommentsUploadInteractor$observeUploadErrors$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        photocommentsUploadInteractor$observeUploadErrors$1.invokeSuspend(zy11Var);
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
            Set entrySet = ((Map) this.this$0.a.a().a.getValue()).entrySet();
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
                final zrm zrmVar = this.this$0.f;
                final z6o z6oVar = new z6o(arrayList2);
                gzh gzhVar = this.$childRouterFactory;
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this.this$0, b.class, "retryImageUpload", "retryImageUpload(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/photocomments/api/PhotocommentPosition;)V", 0);
                final AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, this.this$0, b.class, "removeImageForPosition", "removeImageForPosition(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/photocomments/api/PhotocommentPosition;)V", 0);
                final int size = arrayList2.size();
                ((ekb0) zrmVar.c).h(size);
                final czh create = gzhVar.create();
                czh.a(create, new izh(new zni() { // from class: b7o
                    @Override // defpackage.zni
                    public final xni create() {
                        zrm zrmVar2 = zrmVar;
                        jln jlnVar = (jln) zrmVar2.b;
                        int i = size;
                        czh czhVar = create;
                        z6o z6oVar2 = z6oVar;
                        u1n u1nVar = new u1n(10, z6oVar2, new c7o(i, czhVar, zrmVar2, z6oVar2, anonymousClass1, anonymousClass2));
                        q4g q4gVar = (q4g) jlnVar.b;
                        ozf ozfVar = new ozf(q4gVar, 3);
                        ozf ozfVar2 = new ozf(q4gVar, 0);
                        ozf ozfVar3 = new ozf(q4gVar, 4);
                        ozf ozfVar4 = new ozf(q4gVar, 2);
                        nzf nzfVar = new nzf(u1nVar, 1);
                        ozf ozfVar5 = new ozf(q4gVar, 1);
                        nzf nzfVar2 = new nzf(u1nVar, 0);
                        a7o a7oVar = (a7o) i5m.b(new z9n((xvf0) ozfVar, i5m.b(new z9n((xvf0) ozfVar2, (xvf0) ozfVar3, (xvf0) ozfVar4, i5m.b(new pgi(nzfVar, ozfVar5, nzfVar2, 28)), 6, false)), (xvf0) nzfVar2, (xvf0) nzfVar, 5, (byte) 0)).get();
                        qcp0 qcp0Var = a7oVar.a;
                        e7o e7oVar = a7oVar.b;
                        z6o z6oVar3 = a7oVar.c;
                        c7o c7oVar = a7oVar.d;
                        qcp0Var.getClass();
                        return new aoi(e7oVar, z6oVar3, c7oVar);
                    }
                }, null, ScreenMode.FIXED, null, null, "photocomments_error_dialog", 7158));
            }
        }
        return zy11.a;
    }
}
